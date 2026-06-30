package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
public class ExifData {
    private static final boolean DEBUG = false;
    static final androidx.camera.core.impl.utils.ExifTag[] EXIF_POINTER_TAGS;
    static final androidx.camera.core.impl.utils.ExifTag[][] EXIF_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_EXIF_TAGS;
    static final java.lang.String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_GPS_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final java.lang.String TAG = "ExifData";
    static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final java.util.HashSet<java.lang.String> sTagSetForCompatibility;
    private final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes;
    private final java.nio.ByteOrder mByteOrder;

    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState;

        static {
            int[] iArr = new int[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = iArr;
            try {
                iArr[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new java.util.HashMap();
            }
        });
        private final java.nio.ByteOrder mByteOrder;
        private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> sExifTagMapsForWriting = java.util.Collections.list(new java.util.Enumeration<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> nextElement() {
                java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> hashMap = new java.util.HashMap<>();
                for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    hashMap.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return hashMap;
            }
        });

        public Builder(java.nio.ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String str) {
            if (str.contains(",")) {
                java.lang.String[] split = str.split(",", -1);
                android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat = guessDataFormat(split[0]);
                if (((java.lang.Integer) guessDataFormat.first).intValue() == 2) {
                    return guessDataFormat;
                }
                for (int i17 = 1; i17 < split.length; i17++) {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat2 = guessDataFormat(split[i17]);
                    int intValue = (((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.first) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.first)) ? ((java.lang.Integer) guessDataFormat.first).intValue() : -1;
                    int intValue2 = (((java.lang.Integer) guessDataFormat.second).intValue() == -1 || !(((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.second) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.second))) ? -1 : ((java.lang.Integer) guessDataFormat.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new android.util.Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                    }
                }
                return guessDataFormat;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = java.lang.Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new android.util.Pair<>(9, -1) : new android.util.Pair<>(4, -1) : new android.util.Pair<>(3, 4);
                    } catch (java.lang.NumberFormatException unused) {
                        return new android.util.Pair<>(2, -1);
                    }
                } catch (java.lang.NumberFormatException unused2) {
                    java.lang.Double.parseDouble(str);
                    return new android.util.Pair<>(12, -1);
                }
            }
            java.lang.String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) java.lang.Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) java.lang.Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new android.util.Pair<>(10, 5);
                        }
                        return new android.util.Pair<>(5, -1);
                    }
                    return new android.util.Pair<>(10, -1);
                } catch (java.lang.NumberFormatException unused3) {
                }
            }
            return new android.util.Pair<>(2, -1);
        }

        private void setAttributeIfMissing(java.lang.String str, java.lang.String str2, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> list) {
            java.util.Iterator<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
        
            if (r7 != r0) goto L99;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0181. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void setAttributeInternal(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r20) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.Builder.setAttributeInternal(java.lang.String, java.lang.String, java.util.List):void");
        }

        public androidx.camera.core.impl.utils.ExifData build() {
            java.util.ArrayList list = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = java.util.Collections.enumeration(androidx.camera.core.impl.utils.ExifData.Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                    return new java.util.HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, java.lang.String.valueOf(2), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, java.lang.String.valueOf(3), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, java.lang.String.valueOf(1), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, java.lang.String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new androidx.camera.core.impl.utils.ExifData(this.mByteOrder, list);
        }

        public androidx.camera.core.impl.utils.ExifData.Builder removeAttribute(java.lang.String str) {
            setAttributeInternal(str, null, this.mAttributes);
            return this;
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setAttribute(java.lang.String str, java.lang.String str2) {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setExposureTimeNanos(long j17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, java.lang.String.valueOf(j17 / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setFlashState(androidx.camera.core.impl.CameraCaptureMetaData.FlashState flashState) {
            int i17;
            if (flashState == androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i18 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[flashState.ordinal()];
            if (i18 == 1) {
                i17 = 0;
            } else if (i18 == 2) {
                i17 = 32;
            } else {
                if (i18 != 3) {
                    androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Unknown flash state: " + flashState);
                    return this;
                }
                i17 = 1;
            }
            if ((i17 & 1) == 1) {
                setAttribute(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, java.lang.String.valueOf(4));
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FLASH, java.lang.String.valueOf(i17));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setFocalLength(float f17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, new androidx.camera.core.impl.utils.LongRational(f17 * 1000.0f, 1000L).toString());
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setImageHeight(int i17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, java.lang.String.valueOf(i17));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setImageWidth(int i17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, java.lang.String.valueOf(i17));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setIso(int i17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, java.lang.String.valueOf(3)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, java.lang.String.valueOf(java.lang.Math.min(65535, i17)));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setLensFNumber(float f17) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, java.lang.String.valueOf(f17));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setOrientationDegrees(int i17) {
            int i18;
            if (i17 == 0) {
                i18 = 1;
            } else if (i17 == 90) {
                i18 = 6;
            } else if (i17 == 180) {
                i18 = 3;
            } else if (i17 != 270) {
                androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Unexpected orientation value: " + i17 + ". Must be one of 0, 90, 180, 270.");
                i18 = 0;
            } else {
                i18 = 8;
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i18));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setWhiteBalanceMode(androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode) {
            int ordinal = whiteBalanceMode.ordinal();
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, ordinal != 0 ? ordinal != 1 ? null : java.lang.String.valueOf(1) : java.lang.String.valueOf(0));
        }
    }

    /* loaded from: classes6.dex */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAKE, zc1.b.CTRL_INDEX, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MODEL, 272, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 274, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, 282, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, 305, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.camera.core.impl.utils.ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr2 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, 33437, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, 36864, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, 37383, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASH, 37385, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, 40961, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, 41495, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, 41728, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, 41729, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, 41992, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, 41993, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, 41994, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr3 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new androidx.camera.core.impl.utils.ExifTag[]{new androidx.camera.core.impl.utils.ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr4 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new androidx.camera.core.impl.utils.ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new java.util.HashSet<>(java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP));
    }

    public ExifData(java.nio.ByteOrder byteOrder, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> list) {
        m3.h.e(list.size() == EXIF_TAGS.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public static androidx.camera.core.impl.utils.ExifData.Builder builderForDevice() {
        return new androidx.camera.core.impl.utils.ExifData.Builder(java.nio.ByteOrder.BIG_ENDIAN).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(1)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, java.lang.String.valueOf(2)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, java.lang.String.valueOf(1)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE, android.os.Build.MANUFACTURER).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL, android.os.Build.MODEL);
    }

    public static androidx.camera.core.impl.utils.ExifData create(androidx.camera.core.ImageProxy imageProxy, int i17) {
        androidx.camera.core.impl.utils.ExifData.Builder builderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderForDevice);
        }
        builderForDevice.setOrientationDegrees(i17);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    private androidx.camera.core.impl.utils.ExifAttribute getExifAttribute(java.lang.String str) {
        if (androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i17 = 0; i17 < EXIF_TAGS.length; i17++) {
            androidx.camera.core.impl.utils.ExifAttribute exifAttribute = this.mAttributes.get(i17).get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public java.lang.String getAttribute(java.lang.String str) {
        androidx.camera.core.impl.utils.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (str.equals(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP)) {
                int i17 = exifAttribute.format;
                if (i17 != 5 && i17 != 10) {
                    androidx.camera.core.Logger.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr != null && longRationalArr.length == 3) {
                    return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d", java.lang.Integer.valueOf((int) (((float) longRationalArr[0].getNumerator()) / ((float) longRationalArr[0].getDenominator()))), java.lang.Integer.valueOf((int) (((float) longRationalArr[1].getNumerator()) / ((float) longRationalArr[1].getDenominator()))), java.lang.Integer.valueOf((int) (((float) longRationalArr[2].getNumerator()) / ((float) longRationalArr[2].getDenominator()))));
                }
                androidx.camera.core.Logger.w(TAG, "Invalid GPS Timestamp array. array=" + java.util.Arrays.toString(longRationalArr));
                return null;
            }
            try {
                return java.lang.Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    public java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> getAttributes(int i17) {
        m3.h.c(i17, 0, EXIF_TAGS.length, "Invalid IFD index: " + i17 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(i17);
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.mByteOrder;
    }
}
