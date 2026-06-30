package e1;

/* loaded from: classes14.dex */
public abstract class c0 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final e1.b0 f327763d = new e1.b0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final float f327764e;

    static {
        a(1.0f);
        a(-1.0f);
        f327764e = java.lang.Float.intBitsToFloat(1056964608);
    }

    public static short a(float f17) {
        int i17;
        int i18;
        f327763d.getClass();
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(f17);
        int i19 = floatToRawIntBits >>> 31;
        int i27 = (floatToRawIntBits >>> 23) & 255;
        int i28 = floatToRawIntBits & 8388607;
        int i29 = 31;
        int i37 = 0;
        if (i27 == 255) {
            if (i28 != 0) {
                i18 = 512;
                i37 = i18;
            }
            i17 = (i19 << 15) | (i29 << 10) | i37;
        } else {
            int i38 = i27 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74043x46bcf642 + 15;
            if (i38 >= 31) {
                i29 = 49;
            } else if (i38 > 0) {
                i37 = i28 >> 13;
                if ((i28 & 4096) != 0) {
                    i17 = (((i38 << 10) | i37) + 1) | (i19 << 15);
                } else {
                    i29 = i38;
                }
            } else if (i38 >= -10) {
                int i39 = (i28 | 8388608) >> (1 - i38);
                if ((i39 & 4096) != 0) {
                    i39 += 8192;
                }
                i18 = i39 >> 13;
                i29 = 0;
                i37 = i18;
            } else {
                i29 = 0;
            }
            i17 = (i19 << 15) | (i29 << 10) | i37;
        }
        return (short) i17;
    }

    public static final float b(short s17) {
        int i17;
        int i18;
        int i19;
        int i27 = s17 & 65535;
        int i28 = 32768 & i27;
        int i29 = (i27 >>> 10) & 31;
        int i37 = i27 & 1023;
        if (i29 != 0) {
            int i38 = i37 << 13;
            if (i29 == 31) {
                i17 = 255;
                if (i38 != 0) {
                    i38 |= 4194304;
                }
            } else {
                i17 = (i29 - 15) + 127;
            }
            int i39 = i17;
            i18 = i38;
            i19 = i39;
        } else {
            if (i37 != 0) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i37 + 1056964608) - f327764e;
                return i28 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i19 = 0;
            i18 = 0;
        }
        return java.lang.Float.intBitsToFloat((i19 << 23) | (i28 << 16) | i18);
    }
}
