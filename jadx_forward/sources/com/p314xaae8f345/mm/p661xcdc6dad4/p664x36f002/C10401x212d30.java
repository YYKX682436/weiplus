package com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002;

/* renamed from: com.tencent.mm.compatible.util.Exif */
/* loaded from: classes4.dex */
public class C10401x212d30 {

    /* renamed from: PARSE_EXIF_ERROR_CORRUPT */
    public static final int f27791x324eeed3 = 1985;

    /* renamed from: PARSE_EXIF_ERROR_NO_EXIF */
    public static final int f27792x78e4cdb4 = 1983;

    /* renamed from: PARSE_EXIF_ERROR_NO_JPEG */
    public static final int f27793x78e6f50c = 1982;

    /* renamed from: PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN */
    public static final int f27794x4202466e = 1984;

    /* renamed from: PARSE_EXIF_SUCCESS */
    public static final int f27795x6c3261e0 = 0;
    private static final java.lang.String TAG = "MicroMsg.Exif";

    /* renamed from: apertureValue */
    public double f27797x2d01ffc1;

    /* renamed from: bitsPerSample */
    public short f27798x1d904ac1;

    /* renamed from: brightnessValue */
    public double f27799x52fb7fa0;

    /* renamed from: copyright */
    public java.lang.String f27800x5ac573c7;

    /* renamed from: dateTime */
    public java.lang.String f27801x6adb2f9b;

    /* renamed from: dateTimeDigitized */
    public java.lang.String f27802xffacfae2;

    /* renamed from: dateTimeOriginal */
    public java.lang.String f27803xbb8528c;

    /* renamed from: exposureBiasValue */
    public double f27804xcfcea4f1;

    /* renamed from: exposureTime */
    public double f27805x9db76874;

    /* renamed from: fNumber */
    public double f27806x9f79634f;

    /* renamed from: fileSource */
    public int f27807x6b1e3cb7;

    /* renamed from: flash */
    public byte f27808x5cfeff0;

    /* renamed from: focalLength */
    public double f27809xca5459ab;

    /* renamed from: focalLengthIn35mm */
    public short f27810x9e6f0fb2;

    /* renamed from: imageDescription */
    public java.lang.String f27811x58b6aba1;

    /* renamed from: imageHeight */
    public int f27812x6e0c7662;

    /* renamed from: imageWidth */
    public int f27813xa98b352b;

    /* renamed from: isoSpeedRatings */
    public short f27814x70ded954;

    /* renamed from: lensModel */
    public java.lang.String f27816xc5158cb;

    /* renamed from: mExif */
    private p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 f27818x6212f1d;

    /* renamed from: make */
    public java.lang.String f27819x3305ee;

    /* renamed from: maxApertureValue */
    public double f27820x53d66cbd;

    /* renamed from: meteringMode */
    public short f27821xeb5e7cfc;

    /* renamed from: model */
    public java.lang.String f27822x633fb29;

    /* renamed from: orientation */
    public short f27823xaa32f5d0;

    /* renamed from: resolutionX */
    public int f27824x738d9d2c;

    /* renamed from: resolutionY */
    public int f27825x738d9d2d;

    /* renamed from: sceneType */
    public int f27826x6713f5e6;

    /* renamed from: shutterSpeedValue */
    public double f27827x4f9f2537;

    /* renamed from: software */
    public java.lang.String f27828x4ea361a7;

    /* renamed from: subSecTimeOriginal */
    public java.lang.String f27829x70baf44f;

    /* renamed from: subjectDistance */
    public double f27830x90545941;

    /* renamed from: whiteBalance */
    public int f27831xbc75ea73;

    /* renamed from: yCbCrSubSampling */
    public java.lang.String f27832x9a308e80;

    /* renamed from: latitude */
    public double f27815xaa2bac6c = -1.0d;

    /* renamed from: longitude */
    public double f27817x83009af = -1.0d;

    /* renamed from: altitude */
    public double f27796x79634aa2 = 0.0d;

    /* renamed from: fromFile */
    public static com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46(java.lang.String str) {
        com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 c10401x212d30 = new com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30();
        c10401x212d30.m43597x871bb819(str);
        return c10401x212d30;
    }

    /* renamed from: fromStream */
    public static com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43588x80a06bca(java.io.InputStream inputStream) {
        com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 c10401x212d30 = new com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30();
        c10401x212d30.m43598x45dadedd(inputStream);
        return c10401x212d30;
    }

    /* renamed from: readExifFromInterface */
    private void m43589xd5cdaa89() {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = this.f27818x6212f1d;
        if (c1098xe10e35e9 == null) {
            return;
        }
        this.f27811x58b6aba1 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3231x7afb2953);
        this.f27819x3305ee = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93);
        this.f27822x633fb29 = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604);
        this.f27823xaa32f5d0 = (short) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 0);
        this.f27798x1d904ac1 = (short) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3159xd4c56940, 0);
        this.f27828x4ea361a7 = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3291x976888cc);
        this.f27801x6adb2f9b = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0);
        this.f27803xbb8528c = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90);
        this.f27802xffacfae2 = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e);
        this.f27829x70baf44f = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3304x783388fa);
        this.f27800x5ac573c7 = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3170x2aa53122);
        this.f27805x9db76874 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00, 0.0d);
        this.f27806x9f79634f = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887, 0.0d);
        this.f27814x70ded954 = (short) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3240xa702825f, 0);
        this.f27799x52fb7fa0 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3161x10c61608, 0.0d);
        this.f27797x2d01ffc1 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3157x1b3ce347, 0.0d);
        this.f27820x53d66cbd = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3250x9cc3bd22, 0.0d);
        this.f27804xcfcea4f1 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3181x109b063e, 0.0d);
        this.f27830x90545941 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3299x4a217bed, 0.0d);
        this.f27827x4f9f2537 = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3290x9c43d182, 0.0d);
        this.f27809xca5459ab = this.f27818x6212f1d.m7342x8dea7f57(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3190x9b5ec6c5, 0.0d);
        this.f27821xeb5e7cfc = (short) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3251xb7dd8a64, 0);
        this.f27831xbc75ea73 = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3311xea51d481, 0);
        this.f27816xc5158cb = this.f27818x6212f1d.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3244xff2cca6d);
        this.f27814x70ded954 = (short) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3240xa702825f, 0);
        this.f27808x5cfeff0 = (byte) this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3187x58959acb, 0);
        this.f27813xa98b352b = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, 0);
        this.f27812x6e0c7662 = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3232x4289cf0f, 0);
        this.f27824x738d9d2c = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3314x9f2faf98, 72);
        this.f27825x738d9d2d = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3318xa6e154f7, 72);
        this.f27807x6b1e3cb7 = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3186x6da1c2f9, 0);
        this.f27826x6713f5e6 = this.f27818x6212f1d.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3286xa9de8512, 0);
        double[] m7350x3afb3085 = this.f27818x6212f1d.m7350x3afb3085();
        if (m7350x3afb3085 != null) {
            this.f27815xaa2bac6c = m7350x3afb3085[0];
            this.f27817x83009af = m7350x3afb3085[1];
        }
        this.f27796x79634aa2 = this.f27818x6212f1d.m7339xf53d8818(0.0d);
    }

    /* renamed from: getGlobalLocation */
    public fp.n m43590x558a816e() {
        double[] m7350x3afb3085;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = this.f27818x6212f1d;
        if (c1098xe10e35e9 == null || (m7350x3afb3085 = c1098xe10e35e9.m7350x3afb3085()) == null) {
            return null;
        }
        return new fp.n(m7350x3afb3085[0], m7350x3afb3085[1], this.f27796x79634aa2);
    }

    /* renamed from: getLocation */
    public fp.n m43591xed29dd2b() {
        double d17 = this.f27815xaa2bac6c;
        if (d17 < 0.0d) {
            return null;
        }
        double d18 = this.f27817x83009af;
        if (d18 < 0.0d) {
            return null;
        }
        return new fp.n(d17, d18, this.f27796x79634aa2);
    }

    /* renamed from: getOrientationInDegree */
    public int m43592x7a249f0b() {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = this.f27818x6212f1d;
        if (c1098xe10e35e9 != null) {
            return c1098xe10e35e9.m7351x2a7ffb93();
        }
        short s17 = this.f27823xaa32f5d0;
        if (s17 == 3) {
            return 180;
        }
        if (s17 != 6) {
            return s17 != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: getRawOrientation */
    public int m43593x8431897e() {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = this.f27818x6212f1d;
        if (c1098xe10e35e9 != null) {
            return c1098xe10e35e9.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 0);
        }
        return 0;
    }

    /* renamed from: getUxtimeDatatimeOriginal */
    public long m43594xb79e176e() {
        try {
            if (this.f27803xbb8528c == null) {
                return 0L;
            }
            return new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(this.f27803xbb8528c).getTime() / 1000;
        } catch (java.text.ParseException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    /* renamed from: parseFrom */
    public int m43595x92b714fd(byte[] bArr) {
        return m43598x45dadedd(new java.io.ByteArrayInputStream(bArr));
    }

    /* renamed from: parseFromFile */
    public int m43597x871bb819(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
                this.f27818x6212f1d = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(inputStream);
                m43589xd5cdaa89();
                return 0;
            } finally {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(null);
            }
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "parseFromFile", new java.lang.Object[0]);
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "Cannot read EXIF from file '%s': %s", str, th6.getMessage());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
            return -1;
        }
    }

    /* renamed from: parseFromStream */
    public int m43598x45dadedd(java.io.InputStream inputStream) {
        try {
            this.f27818x6212f1d = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(inputStream);
            m43589xd5cdaa89();
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "Cannot read EXIF from stream '%s': %s", inputStream, e17.getMessage());
            return -1;
        }
    }

    /* renamed from: parseFrom */
    public int m43596x92b714fd(byte[] bArr, int i17, int i18) {
        return m43598x45dadedd(new java.io.ByteArrayInputStream(bArr, i17, i18));
    }
}
