package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
public final class Exif {
    public static final long INVALID_TIMESTAMP = -1;
    private static final java.lang.String KILOMETERS_PER_HOUR = "K";
    private static final java.lang.String KNOTS = "N";
    private static final java.lang.String MILES_PER_HOUR = "M";
    private static final java.lang.String TAG = "Exif";
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    private final androidx.exifinterface.media.ExifInterface mExifInterface;
    private boolean mRemoveTimestamp = false;
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATE_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> TIME_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATETIME_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
        }
    };
    private static final java.util.List<java.lang.String> ALL_EXIF_TAGS = getAllExifTags();
    private static final java.util.List<java.lang.String> DO_NOT_COPY_EXIF_TAGS = java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, "ThumbnailOrientation");

    /* loaded from: classes13.dex */
    public static final class Speed {

        /* loaded from: classes13.dex */
        public static final class Converter {
            final double mMph;

            public Converter(double d17) {
                this.mMph = d17;
            }

            public double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }
        }

        private Speed() {
        }

        public static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKilometersPerHour(double d17) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d17 * 0.621371d);
        }

        public static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKnots(double d17) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d17 * 1.15078d);
        }

        public static androidx.camera.core.impl.utils.Exif.Speed.Converter fromMilesPerHour(double d17) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d17);
        }
    }

    private Exif(androidx.exifinterface.media.ExifInterface exifInterface) {
        this.mExifInterface = exifInterface;
    }

    private void attachLastModifiedTimestamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, convertToExifDateTime);
        try {
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, java.lang.Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime()));
        } catch (java.text.ParseException unused) {
        }
    }

    private static java.util.Date convertFromExifDate(java.lang.String str) {
        return DATE_FORMAT.get().parse(str);
    }

    private static java.util.Date convertFromExifDateTime(java.lang.String str) {
        return DATETIME_FORMAT.get().parse(str);
    }

    private static java.util.Date convertFromExifTime(java.lang.String str) {
        return TIME_FORMAT.get().parse(str);
    }

    private static java.lang.String convertToExifDateTime(long j17) {
        return DATETIME_FORMAT.get().format(new java.util.Date(j17));
    }

    public static androidx.camera.core.impl.utils.Exif createFromFile(java.io.File file) {
        return createFromFileString(file.toString());
    }

    public static androidx.camera.core.impl.utils.Exif createFromFileString(java.lang.String str) {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(str));
    }

    public static androidx.camera.core.impl.utils.Exif createFromImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return createFromInputStream(new java.io.ByteArrayInputStream(bArr));
    }

    public static androidx.camera.core.impl.utils.Exif createFromInputStream(java.io.InputStream inputStream) {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(inputStream));
    }

    public static java.util.List<java.lang.String> getAllExifTags() {
        return java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_BITS_PER_SAMPLE, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, androidx.exifinterface.media.ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.TAG_SAMPLES_PER_PIXEL, androidx.exifinterface.media.ExifInterface.TAG_PLANAR_CONFIGURATION, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.TAG_ROWS_PER_STRIP, androidx.exifinterface.media.ExifInterface.TAG_STRIP_BYTE_COUNTS, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_TRANSFER_FUNCTION, androidx.exifinterface.media.ExifInterface.TAG_WHITE_POINT, androidx.exifinterface.media.ExifInterface.TAG_PRIMARY_CHROMATICITIES, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_COEFFICIENTS, androidx.exifinterface.media.ExifInterface.TAG_REFERENCE_BLACK_WHITE, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, androidx.exifinterface.media.ExifInterface.TAG_ARTIST, androidx.exifinterface.media.ExifInterface.TAG_COPYRIGHT, androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, androidx.exifinterface.media.ExifInterface.TAG_GAMMA, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL, androidx.exifinterface.media.ExifInterface.TAG_MAKER_NOTE, androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, androidx.exifinterface.media.ExifInterface.TAG_RELATED_SOUND_FILE, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, androidx.exifinterface.media.ExifInterface.TAG_SPECTRAL_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_OECF, androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, androidx.exifinterface.media.ExifInterface.TAG_STANDARD_OUTPUT_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_RECOMMENDED_EXPOSURE_INDEX, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_LATITUDE_YYY, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_LATITUDE_ZZZ, androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_AREA, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_FLASH_ENERGY, androidx.exifinterface.media.ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_LOCATION, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_INDEX, androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_CFA_PATTERN, androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, androidx.exifinterface.media.ExifInterface.TAG_DIGITAL_ZOOM_RATIO, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_GAIN_CONTROL, androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, androidx.exifinterface.media.ExifInterface.TAG_SATURATION, androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, androidx.exifinterface.media.ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_UNIQUE_ID, "CameraOwnerName", androidx.exifinterface.media.ExifInterface.TAG_BODY_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_LENS_SPECIFICATION, androidx.exifinterface.media.ExifInterface.TAG_LENS_MAKE, androidx.exifinterface.media.ExifInterface.TAG_LENS_MODEL, androidx.exifinterface.media.ExifInterface.TAG_LENS_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_SATELLITES, androidx.exifinterface.media.ExifInterface.TAG_GPS_STATUS, androidx.exifinterface.media.ExifInterface.TAG_GPS_MEASURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DOP, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION, androidx.exifinterface.media.ExifInterface.TAG_GPS_MAP_DATUM, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_AREA_INFORMATION, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_DIFFERENTIAL, androidx.exifinterface.media.ExifInterface.TAG_GPS_H_POSITIONING_ERROR, androidx.exifinterface.media.ExifInterface.TAG_INTEROPERABILITY_INDEX, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, "ThumbnailOrientation", androidx.exifinterface.media.ExifInterface.TAG_DNG_VERSION, androidx.exifinterface.media.ExifInterface.TAG_DEFAULT_CROP_SIZE, androidx.exifinterface.media.ExifInterface.TAG_ORF_THUMBNAIL_IMAGE, androidx.exifinterface.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_START, androidx.exifinterface.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_ORF_ASPECT_FRAME, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_TOP_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, androidx.exifinterface.media.ExifInterface.TAG_RW2_JPG_FROM_RAW, androidx.exifinterface.media.ExifInterface.TAG_XMP, androidx.exifinterface.media.ExifInterface.TAG_NEW_SUBFILE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_SUBFILE_TYPE);
    }

    private long parseTimestamp(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return convertFromExifDate(str).getTime();
            } catch (java.text.ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return convertFromExifTime(str2).getTime();
            } catch (java.text.ParseException unused2) {
                return -1L;
            }
        }
        return parseTimestamp(str + " " + str2);
    }

    public void attachLocation(android.location.Location location) {
        this.mExifInterface.setGpsInfo(location);
    }

    public void attachTimestamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, convertToExifDateTime);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, convertToExifDateTime);
        try {
            java.lang.String l17 = java.lang.Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime());
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, l17);
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, l17);
        } catch (java.text.ParseException unused) {
        }
        this.mRemoveTimestamp = false;
    }

    public void copyToCroppedImage(androidx.camera.core.impl.utils.Exif exif) {
        java.util.ArrayList arrayList = new java.util.ArrayList(ALL_EXIF_TAGS);
        arrayList.removeAll(DO_NOT_COPY_EXIF_TAGS);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String attribute = this.mExifInterface.getAttribute(str);
            java.lang.String attribute2 = exif.mExifInterface.getAttribute(str);
            if (attribute != null && !attribute.equals(attribute2)) {
                exif.mExifInterface.setAttribute(str, attribute);
            }
        }
    }

    public void flipHorizontally() {
        int i17;
        switch (getOrientation()) {
            case 2:
                i17 = 1;
                break;
            case 3:
                i17 = 4;
                break;
            case 4:
                i17 = 3;
                break;
            case 5:
                i17 = 6;
                break;
            case 6:
                i17 = 5;
                break;
            case 7:
                i17 = 8;
                break;
            case 8:
                i17 = 7;
                break;
            default:
                i17 = 2;
                break;
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i17));
    }

    public void flipVertically() {
        int i17;
        switch (getOrientation()) {
            case 2:
                i17 = 3;
                break;
            case 3:
                i17 = 2;
                break;
            case 4:
                i17 = 1;
                break;
            case 5:
                i17 = 8;
                break;
            case 6:
                i17 = 7;
                break;
            case 7:
                i17 = 6;
                break;
            case 8:
                i17 = 5;
                break;
            default:
                i17 = 4;
                break;
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i17));
    }

    public java.lang.String getDescription() {
        return this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION);
    }

    public androidx.exifinterface.media.ExifInterface getExifInterface() {
        return this.mExifInterface;
    }

    public int getHeight() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 0);
    }

    public long getLastModifiedTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME));
        if (parseTimestamp == -1) {
            return -1L;
        }
        java.lang.String attribute = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location getLocation() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.ExifInterface r1 = r0.mExifInterface
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.getAttribute(r2)
            androidx.exifinterface.media.ExifInterface r2 = r0.mExifInterface
            double[] r2 = r2.getLatLong()
            androidx.exifinterface.media.ExifInterface r3 = r0.mExifInterface
            r4 = 0
            double r6 = r3.getAltitude(r4)
            androidx.exifinterface.media.ExifInterface r3 = r0.mExifInterface
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.getAttributeDouble(r8, r4)
            androidx.exifinterface.media.ExifInterface r3 = r0.mExifInterface
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.getAttribute(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            androidx.exifinterface.media.ExifInterface r11 = r0.mExifInterface
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.getAttribute(r12)
            androidx.exifinterface.media.ExifInterface r12 = r0.mExifInterface
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.getAttribute(r13)
            long r11 = r0.parseTimestamp(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = androidx.camera.core.impl.utils.Exif.TAG
        L49:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            r13.setAltitude(r6)
        L61:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L8a
            r2 = 77
            if (r1 == r2) goto L80
            r2 = 78
            if (r1 == r2) goto L76
            goto L92
        L76:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = r14
            goto L93
        L80:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L93
        L8a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L92
            r1 = 2
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La9
            if (r1 == r14) goto La0
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = androidx.camera.core.impl.utils.Exif.Speed.fromKilometersPerHour(r8)
            double r1 = r1.toMetersPerSecond()
            goto Lb1
        La0:
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = androidx.camera.core.impl.utils.Exif.Speed.fromKnots(r8)
            double r1 = r1.toMetersPerSecond()
            goto Lb1
        La9:
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = androidx.camera.core.impl.utils.Exif.Speed.fromMilesPerHour(r8)
            double r1 = r1.toMetersPerSecond()
        Lb1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        Lb5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            r13.setTime(r11)
        Lbe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.Exif.getLocation():android.location.Location");
    }

    public java.lang.String getMetadata() {
        return this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_XMP);
    }

    public int getOrientation() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long getTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL));
        if (parseTimestamp == -1) {
            return -1L;
        }
        java.lang.String attribute = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public int getWidth() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 0);
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public void removeLocation() {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, null);
    }

    public void removeTimestamp() {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, null);
        this.mRemoveTimestamp = true;
    }

    public void rotate(int i17) {
        if (i17 % 90 != 0) {
            androidx.camera.core.Logger.w(TAG, java.lang.String.format(java.util.Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", java.lang.Integer.valueOf(i17)));
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(0));
            return;
        }
        int i18 = i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        int orientation = getOrientation();
        while (i18 < 0) {
            i18 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i18 > 0) {
            i18 -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(orientation));
    }

    public void save() {
        if (!this.mRemoveTimestamp) {
            attachLastModifiedTimestamp();
        }
        this.mExifInterface.saveAttributes();
    }

    public void setDescription(java.lang.String str) {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, str);
    }

    public void setOrientation(int i17) {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i17));
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()), java.lang.Integer.valueOf(getRotation()), java.lang.Boolean.valueOf(isFlippedVertically()), java.lang.Boolean.valueOf(isFlippedHorizontally()), getLocation(), java.lang.Long.valueOf(getTimestamp()), getDescription());
    }

    private long parseTimestamp(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return convertFromExifDateTime(str).getTime();
        } catch (java.text.ParseException unused) {
            return -1L;
        }
    }
}
