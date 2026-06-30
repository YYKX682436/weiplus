package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ExifData */
/* loaded from: classes13.dex */
public class C0787x848778fa {

    /* renamed from: DEBUG */
    private static final boolean f1904x3de9e33 = false;

    /* renamed from: EXIF_POINTER_TAGS */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] f1905x45e4d7ca;

    /* renamed from: EXIF_TAGS */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[][] f1906x3e555de8;

    /* renamed from: IFD_EXIF_TAGS */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] f1907x9045e670;

    /* renamed from: IFD_FORMAT_NAMES */
    static final java.lang.String[] f1908xada06358 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: IFD_GPS_TAGS */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] f1909xbb825d26;

    /* renamed from: IFD_INTEROPERABILITY_TAGS */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] f1910x473a44c0;

    /* renamed from: IFD_TIFF_TAGS */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] f1911x8b6414ab;

    /* renamed from: IFD_TYPE_EXIF */
    static final int f1912x18b9df7d = 1;

    /* renamed from: IFD_TYPE_GPS */
    static final int f1913xd781e47d = 2;

    /* renamed from: IFD_TYPE_INTEROPERABILITY */
    static final int f1914xdd487ad = 3;

    /* renamed from: IFD_TYPE_PRIMARY */
    static final int f1915xa1ea3855 = 0;

    /* renamed from: MM_IN_MICRONS */
    private static final int f1916x1ab8fa4e = 1000;
    private static final java.lang.String TAG = "ExifData";

    /* renamed from: TAG_EXIF_IFD_POINTER */
    static final java.lang.String f1917x1a8c0e1b = "ExifIFDPointer";

    /* renamed from: TAG_GPS_INFO_IFD_POINTER */
    static final java.lang.String f1918xded2554e = "GPSInfoIFDPointer";

    /* renamed from: TAG_INTEROPERABILITY_IFD_POINTER */
    static final java.lang.String f1919xc426da4b = "InteroperabilityIFDPointer";

    /* renamed from: TAG_SUB_IFD_POINTER */
    static final java.lang.String f1920x359faa41 = "SubIFDPointer";

    /* renamed from: sTagSetForCompatibility */
    static final java.util.HashSet<java.lang.String> f1921x19365602;

    /* renamed from: mAttributes */
    private final java.util.List<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> f1922xf45fa1a4;

    /* renamed from: mByteOrder */
    private final java.nio.ByteOrder f1923xff92e539;

    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState */
        static final /* synthetic */ int[] f1924x649fcb98;

        static {
            int[] iArr = new int[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.m5254xcee59d22().length];
            f1924x649fcb98 = iArr;
            try {
                iArr[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1924x649fcb98[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.NONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1924x649fcb98[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.FIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: DATETIME_VALUE_STRING_LENGTH */
        private static final int f1927xa48449a2 = 19;

        /* renamed from: mAttributes */
        final java.util.List<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> f1930xf45fa1a4 = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2

            /* renamed from: mIfdIndex */
            int f1933x82f181b8 = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1933x82f181b8 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length;
            }

            @Override // java.util.Enumeration
            public java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c> nextElement() {
                this.f1933x82f181b8++;
                return new java.util.HashMap();
            }
        });

        /* renamed from: mByteOrder */
        private final java.nio.ByteOrder f1931xff92e539;

        /* renamed from: GPS_TIMESTAMP_PATTERN */
        private static final java.util.regex.Pattern f1928x33ffb0b2 = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: DATETIME_PRIMARY_FORMAT_PATTERN */
        private static final java.util.regex.Pattern f1925xeff3069 = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: DATETIME_SECONDARY_FORMAT_PATTERN */
        private static final java.util.regex.Pattern f1926x677bf5b7 = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: sExifTagMapsForWriting */
        static final java.util.List<java.util.HashMap<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a>> f1929xd610b621 = java.util.Collections.list(new java.util.Enumeration<java.util.HashMap<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1

            /* renamed from: mIfdIndex */
            int f1932x82f181b8 = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1932x82f181b8 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length;
            }

            @Override // java.util.Enumeration
            public java.util.HashMap<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a> nextElement() {
                java.util.HashMap<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a> hashMap = new java.util.HashMap<>();
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a c0789x14cacc4a : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8[this.f1932x82f181b8]) {
                    hashMap.put(c0789x14cacc4a.f1959x337a8b, c0789x14cacc4a);
                }
                this.f1932x82f181b8++;
                return hashMap;
            }
        });

        public Builder(java.nio.ByteOrder byteOrder) {
            this.f1931xff92e539 = byteOrder;
        }

        /* renamed from: guessDataFormat */
        private static android.util.Pair<java.lang.Integer, java.lang.Integer> m5893x7f59d578(java.lang.String str) {
            if (str.contains(",")) {
                java.lang.String[] split = str.split(",", -1);
                android.util.Pair<java.lang.Integer, java.lang.Integer> m5893x7f59d578 = m5893x7f59d578(split[0]);
                if (((java.lang.Integer) m5893x7f59d578.first).intValue() == 2) {
                    return m5893x7f59d578;
                }
                for (int i17 = 1; i17 < split.length; i17++) {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> m5893x7f59d5782 = m5893x7f59d578(split[i17]);
                    int intValue = (((java.lang.Integer) m5893x7f59d5782.first).equals(m5893x7f59d578.first) || ((java.lang.Integer) m5893x7f59d5782.second).equals(m5893x7f59d578.first)) ? ((java.lang.Integer) m5893x7f59d578.first).intValue() : -1;
                    int intValue2 = (((java.lang.Integer) m5893x7f59d578.second).intValue() == -1 || !(((java.lang.Integer) m5893x7f59d5782.first).equals(m5893x7f59d578.second) || ((java.lang.Integer) m5893x7f59d5782.second).equals(m5893x7f59d578.second))) ? -1 : ((java.lang.Integer) m5893x7f59d578.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new android.util.Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        m5893x7f59d578 = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        m5893x7f59d578 = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                    }
                }
                return m5893x7f59d578;
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

        /* renamed from: setAttributeIfMissing */
        private void m5894x89b30a4f(java.lang.String str, java.lang.String str2, java.util.List<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> list) {
            java.util.Iterator<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            m5895x69d60d37(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
        
            if (r7 != r0) goto L99;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0181. Please report as an issue. */
        /* renamed from: setAttributeInternal */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m5895x69d60d37(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> r20) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder.m5895x69d60d37(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa m5896x59bc66e() {
            java.util.ArrayList list = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3

                /* renamed from: mMapEnumeration */
                final java.util.Enumeration<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> f1935xadc46518;

                {
                    this.f1935xadc46518 = java.util.Collections.enumeration(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder.this.f1930xf45fa1a4);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.f1935xadc46518.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c> nextElement() {
                    return new java.util.HashMap(this.f1935xadc46518.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3184x55c20951, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3180x3d2c0d2e, "0230", list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3166x3b48fc92, "1,2,3,0", list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3251xb7dd8a64, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3247x76bcd829, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3188xd3e3de4d, "0100", list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3192xb4e13f75, java.lang.String.valueOf(2), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3186x6da1c2f9, java.lang.String.valueOf(3), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3286xa9de8512, java.lang.String.valueOf(1), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3171x5a3d16fe, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3285x8c29a8b, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3169x26fa3a27, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3284x1e5ae9b7, java.lang.String.valueOf(0), list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3289x723a929c, java.lang.String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3230xc4bfd83c, "2300", list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3225x3a74eae1, "K", list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3229xc7dbb9e5, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3214x8db40c7d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3203xf138c4df, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, list);
                m5894x89b30a4f(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3205xa743ac2c, "K", list);
            }
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa(this.f1931xff92e539, list);
        }

        /* renamed from: removeAttribute */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5897x7ea42678(java.lang.String str) {
            m5895x69d60d37(str, null, this.f1930xf45fa1a4);
            return this;
        }

        /* renamed from: setAttribute */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5898x5c88dc5a(java.lang.String str, java.lang.String str2) {
            m5895x69d60d37(str, str2, this.f1930xf45fa1a4);
            return this;
        }

        /* renamed from: setExposureTimeNanos */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5899xcddf3fe9(long j17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00, java.lang.String.valueOf(j17 / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: setFlashState */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5900xd4856083(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState flashState) {
            int i17;
            if (flashState == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.UNKNOWN) {
                return this;
            }
            int i18 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.AnonymousClass1.f1924x649fcb98[flashState.ordinal()];
            if (i18 == 1) {
                i17 = 0;
            } else if (i18 == 2) {
                i17 = 32;
            } else {
                if (i18 != 3) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.TAG, "Unknown flash state: " + flashState);
                    return this;
                }
                i17 = 1;
            }
            if ((i17 & 1) == 1) {
                m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3247x76bcd829, java.lang.String.valueOf(4));
            }
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3187x58959acb, java.lang.String.valueOf(i17));
        }

        /* renamed from: setFocalLength */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5901x3a9013e9(float f17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3190x9b5ec6c5, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea(f17 * 1000.0f, 1000L).m5920x9616526c());
        }

        /* renamed from: setImageHeight */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5902xde4830a0(int i17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, java.lang.String.valueOf(i17));
        }

        /* renamed from: setImageWidth */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5903xc5f03b2d(int i17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, java.lang.String.valueOf(i17));
        }

        /* renamed from: setIso */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5904xca0270c3(int i17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3288x49fd871f, java.lang.String.valueOf(3)).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3265x7309bd5b, java.lang.String.valueOf(java.lang.Math.min(65535, i17)));
        }

        /* renamed from: setLensFNumber */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5905x3f19aaf(float f17) {
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887, java.lang.String.valueOf(f17));
        }

        /* renamed from: setOrientationDegrees */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5906x2a5dc739(int i17) {
            int i18;
            if (i17 == 0) {
                i18 = 1;
            } else if (i17 == 90) {
                i18 = 6;
            } else if (i17 == 180) {
                i18 = 3;
            } else if (i17 != 270) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.TAG, "Unexpected orientation value: " + i17 + ". Must be one of 0, 90, 180, 270.");
                i18 = 0;
            } else {
                i18 = 8;
            }
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(i18));
        }

        /* renamed from: setWhiteBalanceMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5907xadbf2338(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.WhiteBalanceMode whiteBalanceMode) {
            int ordinal = whiteBalanceMode.ordinal();
            return m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3311xea51d481, ordinal != 0 ? ordinal != 1 ? null : java.lang.String.valueOf(1) : java.lang.String.valueOf(0));
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode */
    /* loaded from: classes6.dex */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] c0789x14cacc4aArr = {new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, 256, 3, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, 257, 3, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93, zc1.b.f77555x366c91de, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, 272, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 274, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3314x9f2faf98, 282, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3318xa6e154f7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3275x4a079672, 296, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3291x976888cc, 305, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3316xd8a3bf5e, 531, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1920x359faa41, 330, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1917x1a8c0e1b, 34665, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1918xded2554e, 34853, 4)};
        f1911x8b6414ab = c0789x14cacc4aArr;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] c0789x14cacc4aArr2 = {new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00, 33434, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887, 33437, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3184x55c20951, 34850, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3265x7309bd5b, 34855, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3288x49fd871f, 34864, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3180x3d2c0d2e, 36864, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, 36867, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e, 36868, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3166x3b48fc92, 37121, 7), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3290x9c43d182, 37377, 10), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3157x1b3ce347, 37378, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3161x10c61608, 37379, 10), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3181x109b063e, 37380, 10), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3250x9cc3bd22, 37381, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3251xb7dd8a64, 37383, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3247x76bcd829, 37384, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3187x58959acb, 37385, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3190x9b5ec6c5, 37386, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3302xda8596f6, 37520, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa, 37521, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3303x22989214, 37522, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3188xd3e3de4d, 40960, 7), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3165xdc770fa5, 40961, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3267x1f11bc41, 40962, 3, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3268xb3f66f02, 40963, 3, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1919xc426da4b, 40965, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3192xb4e13f75, 41488, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3287xd367463a, 41495, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3186x6da1c2f9, 41728, 7), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3286xa9de8512, 41729, 7), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3171x5a3d16fe, 41985, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3183x504201d6, 41986, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3311xea51d481, 41987, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3285x8c29a8b, 41990, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3169x26fa3a27, 41992, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3284x1e5ae9b7, 41993, 3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3289x723a929c, 41994, 3)};
        f1907x9045e670 = c0789x14cacc4aArr2;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] c0789x14cacc4aArr3 = {new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3230xc4bfd83c, 0, 1), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, 1, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, 2, 5, 10), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, 3, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, 4, 5, 10), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3199xc45d4d10, 5, 1), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3198x86afef5c, 6, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3227x9f911b7c, 7, 5), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3225x3a74eae1, 12, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3229xc7dbb9e5, 14, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3214x8db40c7d, 16, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3203xf138c4df, 23, 2), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3205xa743ac2c, 25, 2)};
        f1909xbb825d26 = c0789x14cacc4aArr3;
        f1905x45e4d7ca = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[]{new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1920x359faa41, 330, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1917x1a8c0e1b, 34665, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1918xded2554e, 34853, 4), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(f1919xc426da4b, 40965, 4)};
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[] c0789x14cacc4aArr4 = {new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3236x12e2ead8, 1, 2)};
        f1910x473a44c0 = c0789x14cacc4aArr4;
        f1906x3e555de8 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[][]{c0789x14cacc4aArr, c0789x14cacc4aArr2, c0789x14cacc4aArr3, c0789x14cacc4aArr4};
        f1921x19365602 = new java.util.HashSet<>(java.util.Arrays.asList(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3227x9f911b7c));
    }

    public C0787x848778fa(java.nio.ByteOrder byteOrder, java.util.List<java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> list) {
        m3.h.e(list.size() == f1906x3e555de8.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1923xff92e539 = byteOrder;
        this.f1922xf45fa1a4 = list;
    }

    /* renamed from: builderForDevice */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5885xd45fab24() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder(java.nio.ByteOrder.BIG_ENDIAN).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(1)).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3314x9f2faf98, "72/1").m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3318xa6e154f7, "72/1").m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3275x4a079672, java.lang.String.valueOf(2)).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3316xd8a3bf5e, java.lang.String.valueOf(1)).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93, android.os.Build.MANUFACTURER).m5898x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, android.os.Build.MODEL);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa m5886xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder m5885xd45fab24 = m5885xd45fab24();
        if (interfaceC0536x1ffeadf3.mo4173xcb10cdf3() != null) {
            interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4612xd74657e4(m5885xd45fab24);
        }
        m5885xd45fab24.m5906x2a5dc739(i17);
        return m5885xd45fab24.m5903xc5f03b2d(interfaceC0536x1ffeadf3.mo4175x755bd410()).m5902xde4830a0(interfaceC0536x1ffeadf3.mo4171x1c4fb41d()).m5896x59bc66e();
    }

    /* renamed from: getExifAttribute */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5887x51a0ffb6(java.lang.String str) {
        if (p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3240xa702825f.equals(str)) {
            str = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3265x7309bd5b;
        }
        for (int i17 = 0; i17 < f1906x3e555de8.length; i17++) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c c0786xc3e0734c = this.f1922xf45fa1a4.get(i17).get(str);
            if (c0786xc3e0734c != null) {
                return c0786xc3e0734c;
            }
        }
        return null;
    }

    /* renamed from: getAttribute */
    public java.lang.String m5888x351be6(java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5887x51a0ffb6 = m5887x51a0ffb6(str);
        if (m5887x51a0ffb6 != null) {
            if (!f1921x19365602.contains(str)) {
                return m5887x51a0ffb6.m5880x7f48eaaa(this.f1923xff92e539);
            }
            if (str.equals(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3227x9f911b7c)) {
                int i17 = m5887x51a0ffb6.f1902xb45ff7f7;
                if (i17 != 5 && i17 != 10) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "GPS Timestamp format is not rational. format=" + m5887x51a0ffb6.f1902xb45ff7f7);
                    return null;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[] c0791x94489beaArr = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[]) m5887x51a0ffb6.m5881x754a37bb(this.f1923xff92e539);
                if (c0791x94489beaArr != null && c0791x94489beaArr.length == 3) {
                    return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d", java.lang.Integer.valueOf((int) (((float) c0791x94489beaArr[0].m5918x6793a7d3()) / ((float) c0791x94489beaArr[0].m5917x639fe930()))), java.lang.Integer.valueOf((int) (((float) c0791x94489beaArr[1].m5918x6793a7d3()) / ((float) c0791x94489beaArr[1].m5917x639fe930()))), java.lang.Integer.valueOf((int) (((float) c0791x94489beaArr[2].m5918x6793a7d3()) / ((float) c0791x94489beaArr[2].m5917x639fe930()))));
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Invalid GPS Timestamp array. array=" + java.util.Arrays.toString(c0791x94489beaArr));
                return null;
            }
            try {
                return java.lang.Double.toString(m5887x51a0ffb6.m5878x78e226ea(this.f1923xff92e539));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: getAttributes */
    public java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c> m5889x66e614d(int i17) {
        m3.h.c(i17, 0, f1906x3e555de8.length, "Invalid IFD index: " + i17 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f1922xf45fa1a4.get(i17);
    }

    /* renamed from: getByteOrder */
    public java.nio.ByteOrder m5890x84490c70() {
        return this.f1923xff92e539;
    }
}
