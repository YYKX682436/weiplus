package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.Exif */
/* loaded from: classes13.dex */
public final class C0785x212d30 {

    /* renamed from: INVALID_TIMESTAMP */
    public static final long f1874x21d7908e = -1;

    /* renamed from: KILOMETERS_PER_HOUR */
    private static final java.lang.String f1875x4ec7a8fa = "K";

    /* renamed from: KNOTS */
    private static final java.lang.String f1876x4458acb = "N";

    /* renamed from: MILES_PER_HOUR */
    private static final java.lang.String f1877xe05eac27 = "M";
    private static final java.lang.String TAG = "Exif";

    /* renamed from: TAG_THUMBNAIL_ORIENTATION */
    public static final java.lang.String f1878x2052c3b8 = "ThumbnailOrientation";

    /* renamed from: mExifInterface */
    private final p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 f1880xc7d0e9c;

    /* renamed from: mRemoveTimestamp */
    private boolean f1881x50d3d4c5 = false;

    /* renamed from: DATE_FORMAT */
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> f1872x56eda1a8 = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd", java.util.Locale.US);
        }
    };

    /* renamed from: TIME_FORMAT */
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> f1879x39a54da9 = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
        }
    };

    /* renamed from: DATETIME_FORMAT */
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> f1871xc71d6d3b = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
        }
    };

    /* renamed from: ALL_EXIF_TAGS */
    private static final java.util.List<java.lang.String> f1870xf17d28aa = m5832x64e74cd4();

    /* renamed from: DO_NOT_COPY_EXIF_TAGS */
    private static final java.util.List<java.lang.String> f1873x130b38de = java.util.Arrays.asList(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3267x1f11bc41, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3268xb3f66f02, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3168xac402801, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3241x2b607f9c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3242x722b24e9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3306xa8fb962, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3307x43046baa, "ThumbnailOrientation");

    /* renamed from: androidx.camera.core.impl.utils.Exif$Speed */
    /* loaded from: classes13.dex */
    public static final class Speed {

        /* renamed from: androidx.camera.core.impl.utils.Exif$Speed$Converter */
        /* loaded from: classes13.dex */
        public static final class Converter {

            /* renamed from: mMph */
            final double f1882x32bb78;

            public Converter(double d17) {
                this.f1882x32bb78 = d17;
            }

            /* renamed from: toMetersPerSecond */
            public double m5862x1921e10c() {
                return this.f1882x32bb78 / 2.23694d;
            }
        }

        private Speed() {
        }

        /* renamed from: fromKilometersPerHour */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter m5859x632452ec(double d17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter(d17 * 0.621371d);
        }

        /* renamed from: fromKnots */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter m5860x3b2b561(double d17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter(d17 * 1.15078d);
        }

        /* renamed from: fromMilesPerHour */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter m5861x35db808d(double d17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.Converter(d17);
        }
    }

    private C0785x212d30(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9) {
        this.f1880xc7d0e9c = c1098xe10e35e9;
    }

    /* renamed from: attachLastModifiedTimestamp */
    private void m5823xe4483312() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String m5827x5ff13379 = m5827x5ff13379(currentTimeMillis);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, m5827x5ff13379);
        try {
            this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3302xda8596f6, java.lang.Long.toString(currentTimeMillis - m5825x2e5f1568(m5827x5ff13379).getTime()));
        } catch (java.text.ParseException unused) {
        }
    }

    /* renamed from: convertFromExifDate */
    private static java.util.Date m5824x7bffc3fb(java.lang.String str) {
        return f1872x56eda1a8.get().parse(str);
    }

    /* renamed from: convertFromExifDateTime */
    private static java.util.Date m5825x2e5f1568(java.lang.String str) {
        return f1871xc71d6d3b.get().parse(str);
    }

    /* renamed from: convertFromExifTime */
    private static java.util.Date m5826x7c07271a(java.lang.String str) {
        return f1879x39a54da9.get().parse(str);
    }

    /* renamed from: convertToExifDateTime */
    private static java.lang.String m5827x5ff13379(long j17) {
        return f1871xc71d6d3b.get().format(new java.util.Date(j17));
    }

    /* renamed from: createFromFile */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5828xecc6e562(java.io.File file) {
        return m5829x87a42013(file.toString());
    }

    /* renamed from: createFromFileString */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5829x87a42013(java.lang.String str) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(str));
    }

    /* renamed from: createFromImageProxy */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5830xc56dbd39(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        java.nio.ByteBuffer mo4177x12f2b736 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736();
        mo4177x12f2b736.rewind();
        byte[] bArr = new byte[mo4177x12f2b736.capacity()];
        mo4177x12f2b736.get(bArr);
        return m5831x599f9544(new java.io.ByteArrayInputStream(bArr));
    }

    /* renamed from: createFromInputStream */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5831x599f9544(java.io.InputStream inputStream) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(inputStream));
    }

    /* renamed from: getAllExifTags */
    public static java.util.List<java.lang.String> m5832x64e74cd4() {
        return java.util.Arrays.asList(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3159xd4c56940, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3168xac402801, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3266xa014a58a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3283xb4bdba49, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3269x7d797616, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3317x42e71661, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3316xd8a3bf5e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3314x9f2faf98, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3318xa6e154f7, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3275x4a079672, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3296x60596bd4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3276x4ec871b5, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3295xbcea680f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3241x2b607f9c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3242x722b24e9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3309x9ffea827, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3312x6b0fe475, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3270x750f24d6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3315xfbea6919, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3273xb491bd90, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3231x7afb2953, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3291x976888cc, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3158xb1f28fac, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3170x2aa53122, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3180x3d2c0d2e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3188xd3e3de4d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3165xdc770fa5, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3197x589ede82, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3267x1f11bc41, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3268xb3f66f02, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3166x3b48fc92, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3167x8210a8a4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3249x70f81912, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3310x158f2670, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3274x1fbda865, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3255xa4b949b4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3257xd68a0bfc, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3256x8f126f52, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3302xda8596f6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3303x22989214, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3184x55c20951, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3293x6ab1c7c9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3265x7309bd5b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3254x2df865e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3288x49fd871f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3294x6bfec5be, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3272x3cb455e3, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3237x192c9548, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3238xf26fb87d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3239xf26fbc5e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3290x9c43d182, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3157x1b3ce347, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3161x10c61608, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3181x109b063e, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3250x9cc3bd22, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3299x4a217bed, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3251xb7dd8a64, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3247x76bcd829, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3187x58959acb, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3298x2d978485, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3190x9b5ec6c5, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3189xb5f1de7c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3292x1dbc6704, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3193x7cff5d75, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3194x84b102d4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3192xb4e13f75, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3301xaa3f8fad, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3182xb7c566df, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3287xd367463a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3186x6da1c2f9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3286xa9de8512, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3164xc8163f2a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3171x5a3d16fe, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3183x504201d6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3311xea51d481, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3177xc41c2a0b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3191xdd772cc1, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3285x8c29a8b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3196xb1e90922, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3169x26fa3a27, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3284x1e5ae9b7, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3289x723a929c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3176xf4cbf8c9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3300xabbcba4b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3233x8e89380, "CameraOwnerName", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3160xdb554cfc, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3246xb5777c47, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3243xdef0ba0a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3244xff2cca6d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3245x16f3a358, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3230xc4bfd83c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3199xc45d4d10, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3198x86afef5c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3227x9f911b7c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3223x86eeb8d2, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3226x6c15f2c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3221x83f297be, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3211xc656c82b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3225x3a74eae1, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3224x8c991dad, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3229xc7dbb9e5, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3228x8ca80eb1, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3214x8db40c7d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3213x72016d49, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3220x1cdda212, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3207xfcbab923, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3206x78f45cef, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3209x59bf3f20, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3208x127d696c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3203xf138c4df, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3202xbee5a6ab, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3205xa743ac2c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3204xdffa3c78, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3222x86a69813, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3200xff5f1f14, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3201x8e8c633b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3210x513cdf35, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3212x581f0ef1, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3236x12e2ead8, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3306xa8fb962, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3307x43046baa, "ThumbnailOrientation", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3178xbcfd4631, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3175x4efe22d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3263x1a729e47, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3262x4f5a14e6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3261x8f28fac2, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3258xfa9c8c7, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3279xc6446092, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3280x93e993b6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3281xdd2ea5bd, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3282x11886be4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3277x165c4bee, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3278x82360b48, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3313xce8b79b6, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3253x274df081, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3297x3e929ea2);
    }

    /* renamed from: parseTimestamp */
    private long m5834x5c3a87a3(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m5824x7bffc3fb(str).getTime();
            } catch (java.text.ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return m5826x7c07271a(str2).getTime();
            } catch (java.text.ParseException unused2) {
                return -1L;
            }
        }
        return m5833x5c3a87a3(str + " " + str2);
    }

    /* renamed from: attachLocation */
    public void m5835xb8ecdd1a(android.location.Location location) {
        this.f1880xc7d0e9c.m7366xbf768db6(location);
    }

    /* renamed from: attachTimestamp */
    public void m5836xaf539851() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String m5827x5ff13379 = m5827x5ff13379(currentTimeMillis);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, m5827x5ff13379);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e, m5827x5ff13379);
        try {
            java.lang.String l17 = java.lang.Long.toString(currentTimeMillis - m5825x2e5f1568(m5827x5ff13379).getTime());
            this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa, l17);
            this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3303x22989214, l17);
        } catch (java.text.ParseException unused) {
        }
        this.f1881x50d3d4c5 = false;
    }

    /* renamed from: copyToCroppedImage */
    public void m5837xc981d10c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30) {
        java.util.ArrayList arrayList = new java.util.ArrayList(f1870xf17d28aa);
        arrayList.removeAll(f1873x130b38de);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String m7340x351be6 = this.f1880xc7d0e9c.m7340x351be6(str);
            java.lang.String m7340x351be62 = c0785x212d30.f1880xc7d0e9c.m7340x351be6(str);
            if (m7340x351be6 != null && !m7340x351be6.equals(m7340x351be62)) {
                c0785x212d30.f1880xc7d0e9c.m7364x5c88dc5a(str, m7340x351be6);
            }
        }
    }

    /* renamed from: flipHorizontally */
    public void m5838x4b4839be() {
        int i17;
        switch (m5846x84093c9a()) {
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
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(i17));
    }

    /* renamed from: flipVertically */
    public void m5839x6ca267d0() {
        int i17;
        switch (m5846x84093c9a()) {
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
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(i17));
    }

    /* renamed from: getDescription */
    public java.lang.String m5840x730bcac6() {
        return this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3231x7afb2953);
    }

    /* renamed from: getExifInterface */
    public p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 m5841x6ecec253() {
        return this.f1880xc7d0e9c;
    }

    /* renamed from: getHeight */
    public int m5842x1c4fb41d() {
        return this.f1880xc7d0e9c.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, 0);
    }

    /* renamed from: getLastModifiedTimestamp */
    public long m5843x3ae596a1() {
        long m5833x5c3a87a3 = m5833x5c3a87a3(this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0));
        if (m5833x5c3a87a3 == -1) {
            return -1L;
        }
        java.lang.String m7340x351be6 = this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3302xda8596f6);
        if (m7340x351be6 == null) {
            return m5833x5c3a87a3;
        }
        try {
            long parseLong = java.lang.Long.parseLong(m7340x351be6);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return m5833x5c3a87a3 + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return m5833x5c3a87a3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* renamed from: getLocation */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location m5844xed29dd2b() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.ExifInterface r1 = r0.f1880xc7d0e9c
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.m7340x351be6(r2)
            androidx.exifinterface.media.ExifInterface r2 = r0.f1880xc7d0e9c
            double[] r2 = r2.m7350x3afb3085()
            androidx.exifinterface.media.ExifInterface r3 = r0.f1880xc7d0e9c
            r4 = 0
            double r6 = r3.m7339xf53d8818(r4)
            androidx.exifinterface.media.ExifInterface r3 = r0.f1880xc7d0e9c
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.m7342x8dea7f57(r8, r4)
            androidx.exifinterface.media.ExifInterface r3 = r0.f1880xc7d0e9c
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.m7340x351be6(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            androidx.exifinterface.media.ExifInterface r11 = r0.f1880xc7d0e9c
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.m7340x351be6(r12)
            androidx.exifinterface.media.ExifInterface r12 = r0.f1880xc7d0e9c
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.m7340x351be6(r13)
            long r11 = r0.m5834x5c3a87a3(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.TAG
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
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.m5859x632452ec(r8)
            double r1 = r1.m5862x1921e10c()
            goto Lb1
        La0:
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.m5860x3b2b561(r8)
            double r1 = r1.m5862x1921e10c()
            goto Lb1
        La9:
            androidx.camera.core.impl.utils.Exif$Speed$Converter r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.Speed.m5861x35db808d(r8)
            double r1 = r1.m5862x1921e10c()
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.m5844xed29dd2b():android.location.Location");
    }

    /* renamed from: getMetadata */
    public java.lang.String m5845x6107b8a5() {
        return this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3313xce8b79b6);
    }

    /* renamed from: getOrientation */
    public int m5846x84093c9a() {
        return this.f1880xc7d0e9c.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 0);
    }

    /* renamed from: getRotation */
    public int m5847x79734cf4() {
        switch (m5846x84093c9a()) {
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

    /* renamed from: getTimestamp */
    public long m5848x2b69a60() {
        long m5833x5c3a87a3 = m5833x5c3a87a3(this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90));
        if (m5833x5c3a87a3 == -1) {
            return -1L;
        }
        java.lang.String m7340x351be6 = this.f1880xc7d0e9c.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa);
        if (m7340x351be6 == null) {
            return m5833x5c3a87a3;
        }
        try {
            long parseLong = java.lang.Long.parseLong(m7340x351be6);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return m5833x5c3a87a3 + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return m5833x5c3a87a3;
        }
    }

    /* renamed from: getWidth */
    public int m5849x755bd410() {
        return this.f1880xc7d0e9c.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, 0);
    }

    /* renamed from: isFlippedHorizontally */
    public boolean m5850x450b45c9() {
        return m5846x84093c9a() == 2;
    }

    /* renamed from: isFlippedVertically */
    public boolean m5851x9b3efa9b() {
        int m5846x84093c9a = m5846x84093c9a();
        return m5846x84093c9a == 4 || m5846x84093c9a == 5 || m5846x84093c9a == 7;
    }

    /* renamed from: removeLocation */
    public void m5852x12463859() {
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3222x86a69813, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3198x86afef5c, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3199xc45d4d10, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3224x8c991dad, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3225x3a74eae1, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3201x8e8c633b, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3227x9f911b7c, null);
    }

    /* renamed from: removeTimestamp */
    public void m5853x8125a4f2() {
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3302xda8596f6, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa, null);
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3303x22989214, null);
        this.f1881x50d3d4c5 = true;
    }

    /* renamed from: rotate */
    public void m5854xc8dadd5b(int i17) {
        if (i17 % 90 != 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, java.lang.String.format(java.util.Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", java.lang.Integer.valueOf(i17)));
            this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(0));
            return;
        }
        int i18 = i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        int m5846x84093c9a = m5846x84093c9a();
        while (i18 < 0) {
            i18 += 90;
            switch (m5846x84093c9a) {
                case 2:
                    m5846x84093c9a = 5;
                    break;
                case 3:
                case 8:
                    m5846x84093c9a = 6;
                    break;
                case 4:
                    m5846x84093c9a = 7;
                    break;
                case 5:
                    m5846x84093c9a = 4;
                    break;
                case 6:
                    m5846x84093c9a = 1;
                    break;
                case 7:
                    m5846x84093c9a = 2;
                    break;
                default:
                    m5846x84093c9a = 8;
                    break;
            }
        }
        while (i18 > 0) {
            i18 -= 90;
            switch (m5846x84093c9a) {
                case 2:
                    m5846x84093c9a = 7;
                    break;
                case 3:
                    m5846x84093c9a = 8;
                    break;
                case 4:
                    m5846x84093c9a = 5;
                    break;
                case 5:
                    m5846x84093c9a = 2;
                    break;
                case 6:
                    m5846x84093c9a = 3;
                    break;
                case 7:
                    m5846x84093c9a = 4;
                    break;
                case 8:
                    m5846x84093c9a = 1;
                    break;
                default:
                    m5846x84093c9a = 6;
                    break;
            }
        }
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(m5846x84093c9a));
    }

    /* renamed from: save */
    public void m5855x35c17d() {
        if (!this.f1881x50d3d4c5) {
            m5823xe4483312();
        }
        this.f1880xc7d0e9c.m7362xaf634eb4();
    }

    /* renamed from: setDescription */
    public void m5856x9713e3a(java.lang.String str) {
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3231x7afb2953, str);
    }

    /* renamed from: setOrientation */
    public void m5857x1a6eb00e(int i17) {
        this.f1880xc7d0e9c.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, java.lang.String.valueOf(i17));
    }

    /* renamed from: toString */
    public java.lang.String m5858x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", java.lang.Integer.valueOf(m5849x755bd410()), java.lang.Integer.valueOf(m5842x1c4fb41d()), java.lang.Integer.valueOf(m5847x79734cf4()), java.lang.Boolean.valueOf(m5851x9b3efa9b()), java.lang.Boolean.valueOf(m5850x450b45c9()), m5844xed29dd2b(), java.lang.Long.valueOf(m5848x2b69a60()), m5840x730bcac6());
    }

    /* renamed from: parseTimestamp */
    private long m5833x5c3a87a3(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m5825x2e5f1568(str).getTime();
        } catch (java.text.ParseException unused) {
            return -1L;
        }
    }
}
