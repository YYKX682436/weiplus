package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ExifAttribute */
/* loaded from: classes13.dex */
final class C0786xc3e0734c {

    /* renamed from: BYTES_OFFSET_UNKNOWN */
    public static final long f1884x60f29af2 = -1;

    /* renamed from: IFD_FORMAT_BYTE */
    static final int f1886x70ef8ed8 = 1;

    /* renamed from: IFD_FORMAT_DOUBLE */
    static final int f1888xf62471a1 = 12;

    /* renamed from: IFD_FORMAT_SBYTE */
    static final int f1890xade77c0b = 6;

    /* renamed from: IFD_FORMAT_SINGLE */
    static final int f1891xf657a18 = 11;

    /* renamed from: IFD_FORMAT_SLONG */
    static final int f1892xadebe17f = 9;

    /* renamed from: IFD_FORMAT_SRATIONAL */
    static final int f1893xbf3f32b1 = 10;

    /* renamed from: IFD_FORMAT_SSHORT */
    static final int f1894xfefc9b9 = 8;

    /* renamed from: IFD_FORMAT_STRING */
    static final int f1895x100255e1 = 2;

    /* renamed from: IFD_FORMAT_ULONG */
    static final int f1896xae081081 = 4;

    /* renamed from: IFD_FORMAT_UNDEFINED */
    static final int f1897xcd305d60 = 7;

    /* renamed from: IFD_FORMAT_URATIONAL */
    static final int f1898xe7c810b3 = 5;

    /* renamed from: IFD_FORMAT_USHORT */
    static final int f1899x13597af7 = 3;
    private static final java.lang.String TAG = "ExifAttribute";

    /* renamed from: bytes */
    public final byte[] f1900x59dc06b;

    /* renamed from: bytesOffset */
    public final long f1901xf124d4de;

    /* renamed from: format */
    public final int f1902xb45ff7f7;

    /* renamed from: numberOfComponents */
    public final int f1903x275cd636;

    /* renamed from: ASCII */
    static final java.nio.charset.Charset f1883x3bab731 = java.nio.charset.StandardCharsets.US_ASCII;

    /* renamed from: IFD_FORMAT_NAMES */
    static final java.lang.String[] f1889xada06358 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: IFD_FORMAT_BYTES_PER_FORMAT */
    static final int[] f1887xdef78bbd = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: EXIF_ASCII_PREFIX */
    static final byte[] f1885x6b8d962f = {65, 83, 67, 73, 73, 0, 0, 0};

    public C0786xc3e0734c(int i17, int i18, byte[] bArr) {
        this(i17, i18, -1L, bArr);
    }

    /* renamed from: createByte */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5864x51949824(java.lang.String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f1883x3bab731);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(1, bytes.length, bytes);
    }

    /* renamed from: createDouble */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5866x41ac5bed(double[] dArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d17 : dArr) {
            wrap.putDouble(d17);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(12, dArr.length, wrap.array());
    }

    /* renamed from: createSLong */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5868xe1d975f3(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i17 : iArr) {
            wrap.putInt(i17);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(9, iArr.length, wrap.array());
    }

    /* renamed from: createSRational */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5870x60b47525(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[] c0791x94489beaArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[10] * c0791x94489beaArr.length]);
        wrap.order(byteOrder);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea c0791x94489bea : c0791x94489beaArr) {
            wrap.putInt((int) c0791x94489bea.m5918x6793a7d3());
            wrap.putInt((int) c0791x94489bea.m5917x639fe930());
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(10, c0791x94489beaArr.length, wrap.array());
    }

    /* renamed from: createString */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5871x5b8a402d(java.lang.String str) {
        byte[] bytes = (str + (char) 0).getBytes(f1883x3bab731);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(2, bytes.length, bytes);
    }

    /* renamed from: createULong */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5873xe1f5a4f5(long[] jArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j17 : jArr) {
            wrap.putInt((int) j17);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(4, jArr.length, wrap.array());
    }

    /* renamed from: createURational */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5875x893d5327(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[] c0791x94489beaArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[5] * c0791x94489beaArr.length]);
        wrap.order(byteOrder);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea c0791x94489bea : c0791x94489beaArr) {
            wrap.putInt((int) c0791x94489bea.m5918x6793a7d3());
            wrap.putInt((int) c0791x94489bea.m5917x639fe930());
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(5, c0791x94489beaArr.length, wrap.array());
    }

    /* renamed from: createUShort */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5877x5d1e7523(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[f1887xdef78bbd[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i17 : iArr) {
            wrap.putShort((short) i17);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c(3, iArr.length, wrap.array());
    }

    /* renamed from: getDoubleValue */
    public double m5878x78e226ea(java.nio.ByteOrder byteOrder) {
        java.lang.Object m5881x754a37bb = m5881x754a37bb(byteOrder);
        if (m5881x754a37bb == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (m5881x754a37bb instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) m5881x754a37bb);
        }
        if (m5881x754a37bb instanceof long[]) {
            if (((long[]) m5881x754a37bb).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (m5881x754a37bb instanceof int[]) {
            if (((int[]) m5881x754a37bb).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (m5881x754a37bb instanceof double[]) {
            double[] dArr = (double[]) m5881x754a37bb;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(m5881x754a37bb instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[])) {
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[] c0791x94489beaArr = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[]) m5881x754a37bb;
        if (c0791x94489beaArr.length == 1) {
            return c0791x94489beaArr[0].m5919x7c386e2c();
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    /* renamed from: getIntValue */
    public int m5879x9cfee438(java.nio.ByteOrder byteOrder) {
        java.lang.Object m5881x754a37bb = m5881x754a37bb(byteOrder);
        if (m5881x754a37bb == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (m5881x754a37bb instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) m5881x754a37bb);
        }
        if (m5881x754a37bb instanceof long[]) {
            long[] jArr = (long[]) m5881x754a37bb;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(m5881x754a37bb instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) m5881x754a37bb;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    /* renamed from: getStringValue */
    public java.lang.String m5880x7f48eaaa(java.nio.ByteOrder byteOrder) {
        java.lang.Object m5881x754a37bb = m5881x754a37bb(byteOrder);
        if (m5881x754a37bb == null) {
            return null;
        }
        if (m5881x754a37bb instanceof java.lang.String) {
            return (java.lang.String) m5881x754a37bb;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        if (m5881x754a37bb instanceof long[]) {
            long[] jArr = (long[]) m5881x754a37bb;
            while (i17 < jArr.length) {
                sb6.append(jArr[i17]);
                i17++;
                if (i17 != jArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (m5881x754a37bb instanceof int[]) {
            int[] iArr = (int[]) m5881x754a37bb;
            while (i17 < iArr.length) {
                sb6.append(iArr[i17]);
                i17++;
                if (i17 != iArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (m5881x754a37bb instanceof double[]) {
            double[] dArr = (double[]) m5881x754a37bb;
            while (i17 < dArr.length) {
                sb6.append(dArr[i17]);
                i17++;
                if (i17 != dArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (!(m5881x754a37bb instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[])) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[] c0791x94489beaArr = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[]) m5881x754a37bb;
        while (i17 < c0791x94489beaArr.length) {
            sb6.append(c0791x94489beaArr[i17].m5918x6793a7d3());
            sb6.append('/');
            sb6.append(c0791x94489beaArr[i17].m5917x639fe930());
            i17++;
            if (i17 != c0791x94489beaArr.length) {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:168:0x0198 */
    /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: getValue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5881x754a37bb(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5881x754a37bb(java.nio.ByteOrder):java.lang.Object");
    }

    /* renamed from: size */
    public int m5882x35e001() {
        return f1887xdef78bbd[this.f1902xb45ff7f7] * this.f1903x275cd636;
    }

    /* renamed from: toString */
    public java.lang.String m5883x9616526c() {
        return "(" + f1889xada06358[this.f1902xb45ff7f7] + ", data length:" + this.f1900x59dc06b.length + ")";
    }

    public C0786xc3e0734c(int i17, int i18, long j17, byte[] bArr) {
        this.f1902xb45ff7f7 = i17;
        this.f1903x275cd636 = i18;
        this.f1901xf124d4de = j17;
        this.f1900x59dc06b = bArr;
    }

    /* renamed from: createDouble */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5865x41ac5bed(double d17, java.nio.ByteOrder byteOrder) {
        return m5866x41ac5bed(new double[]{d17}, byteOrder);
    }

    /* renamed from: createSLong */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5867xe1d975f3(int i17, java.nio.ByteOrder byteOrder) {
        return m5868xe1d975f3(new int[]{i17}, byteOrder);
    }

    /* renamed from: createULong */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5872xe1f5a4f5(long j17, java.nio.ByteOrder byteOrder) {
        return m5873xe1f5a4f5(new long[]{j17}, byteOrder);
    }

    /* renamed from: createUShort */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5876x5d1e7523(int i17, java.nio.ByteOrder byteOrder) {
        return m5877x5d1e7523(new int[]{i17}, byteOrder);
    }

    /* renamed from: createSRational */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5869x60b47525(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea c0791x94489bea, java.nio.ByteOrder byteOrder) {
        return m5870x60b47525(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[]{c0791x94489bea}, byteOrder);
    }

    /* renamed from: createURational */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c m5874x893d5327(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea c0791x94489bea, java.nio.ByteOrder byteOrder) {
        return m5875x893d5327(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0791x94489bea[]{c0791x94489bea}, byteOrder);
    }
}
