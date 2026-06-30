package com.qq.taf.jce.p308x7ea5603f;

/* renamed from: com.qq.taf.jce.dynamic.JceField */
/* loaded from: classes13.dex */
public class C2871x2c850a2e {

    /* renamed from: zs, reason: collision with root package name */
    private static com.qq.taf.jce.p308x7ea5603f.C2879x6be1bb12[] f127354zs = new com.qq.taf.jce.p308x7ea5603f.C2879x6be1bb12[256];
    private int tag;

    static {
        int i17 = 0;
        while (true) {
            com.qq.taf.jce.p308x7ea5603f.C2879x6be1bb12[] c2879x6be1bb12Arr = f127354zs;
            if (i17 >= c2879x6be1bb12Arr.length) {
                return;
            }
            c2879x6be1bb12Arr[i17] = new com.qq.taf.jce.p308x7ea5603f.C2879x6be1bb12(i17);
            i17++;
        }
    }

    public C2871x2c850a2e(int i17) {
        this.tag = i17;
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21430xaf65a0fc(byte b17, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2865xfbcad4b2(b17, i17);
    }

    /* renamed from: createList */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21438x5198e7ba(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2872x2d16d2dc(c2871x2c850a2eArr, i17);
    }

    /* renamed from: createMap */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21439x23aa1ac0(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr, com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr2, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2874xd21691e(c2871x2c850a2eArr, c2871x2c850a2eArr2, i17);
    }

    /* renamed from: createStruct */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21440x5b8a6bf1(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2878xb6d6ea05(c2871x2c850a2eArr, i17);
    }

    /* renamed from: createZero */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21441x519f35c4(int i17) {
        if (i17 >= 0 && i17 < 255) {
            return f127354zs[i17];
        }
        throw new com.qq.taf.jce.C2856xe9f52235("invalid tag: " + i17);
    }

    /* renamed from: getTag */
    public int m21442xb5887064() {
        return this.tag;
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21436xaf65a0fc(short s17, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2876xd2c375fe(s17, i17);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21433xaf65a0fc(int i17, int i18) {
        return new com.qq.taf.jce.p308x7ea5603f.C2870x24211a6b(i17, i18);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21434xaf65a0fc(long j17, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2873x7dafb7be(j17, i17);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21432xaf65a0fc(float f17, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2869x38d0841e(f17, i17);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21431xaf65a0fc(double d17, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2866x1979789(d17, i17);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21435xaf65a0fc(java.lang.String str, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2877x7fe5b49(str, i17);
    }

    /* renamed from: create */
    public static com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21437xaf65a0fc(byte[] bArr, int i17) {
        return new com.qq.taf.jce.p308x7ea5603f.C2864x5efd2d69(bArr, i17);
    }
}
