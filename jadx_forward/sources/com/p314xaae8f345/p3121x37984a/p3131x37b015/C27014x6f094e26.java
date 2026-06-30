package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.MultiTypeArray */
/* loaded from: classes12.dex */
class C27014x6f094e26 {

    /* renamed from: doubleValues */
    double[] f58550x42702453;

    /* renamed from: longValues */
    long[] f58551xdc5582be;

    /* renamed from: stringValues */
    java.lang.String[] f58552x8e1d893;

    /* renamed from: types */
    int[] f58553x69b5879;

    /* renamed from: com.tencent.wcdb.winq.MultiTypeArray$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$winq$ColumnType */
        static final /* synthetic */ int[] f58554x1da28687;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.m108124xcee59d22().length];
            f58554x1da28687 = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f58554x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f58554x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Float.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f58554x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    public C27014x6f094e26(java.lang.Object[] objArr) {
        int length = objArr.length;
        this.f58553x69b5879 = new int[length];
        this.f58551xdc5582be = new long[length];
        this.f58550x42702453 = new double[length];
        this.f58552x8e1d893 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < length; i27++) {
            java.lang.Object obj = objArr[i27];
            switch (m108489x2dd7a70f(obj)) {
                case 0:
                    this.f58553x69b5879[i27] = 1;
                    i18++;
                    break;
                case 1:
                    this.f58553x69b5879[i27] = 2;
                    this.f58551xdc5582be[i18] = ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L;
                    i18++;
                    break;
                case 2:
                    this.f58553x69b5879[i27] = 3;
                    this.f58551xdc5582be[i18] = ((java.lang.Character) obj).charValue();
                    i18++;
                    break;
                case 3:
                    this.f58553x69b5879[i27] = 3;
                    this.f58551xdc5582be[i18] = ((java.lang.Byte) obj).byteValue();
                    i18++;
                    break;
                case 4:
                    this.f58553x69b5879[i27] = 3;
                    this.f58551xdc5582be[i18] = ((java.lang.Short) obj).shortValue();
                    i18++;
                    break;
                case 5:
                    this.f58553x69b5879[i27] = 3;
                    this.f58551xdc5582be[i18] = ((java.lang.Integer) obj).intValue();
                    i18++;
                    break;
                case 6:
                    this.f58553x69b5879[i27] = 3;
                    this.f58551xdc5582be[i18] = ((java.lang.Long) obj).longValue();
                    i18++;
                    break;
                case 7:
                    this.f58553x69b5879[i27] = 5;
                    this.f58550x42702453[i19] = ((java.lang.Float) obj).floatValue();
                    i19++;
                    break;
                case 8:
                    this.f58553x69b5879[i27] = 5;
                    this.f58550x42702453[i19] = ((java.lang.Double) obj).doubleValue();
                    i19++;
                    break;
                case 9:
                    this.f58553x69b5879[i27] = 6;
                    this.f58552x8e1d893[i17] = (java.lang.String) obj;
                    i17++;
                    break;
                case 10:
                    com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 c27008x165a88c9 = (com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) obj;
                    this.f58553x69b5879[i27] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747(c27008x165a88c9);
                    this.f58551xdc5582be[i18] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27008x165a88c9);
                    i18++;
                    break;
                case 11:
                    com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151) obj;
                    int i28 = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26.AnonymousClass1.f58554x1da28687[c26901x4e9a151.m106364xfb85f7b0().ordinal()];
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                if (i28 != 4) {
                                    break;
                                } else {
                                    this.f58553x69b5879[i27] = 6;
                                    this.f58552x8e1d893[i17] = c26901x4e9a151.m106363xfb85ada3();
                                    i17++;
                                    break;
                                }
                            } else {
                                this.f58553x69b5879[i27] = 5;
                                this.f58550x42702453[i19] = c26901x4e9a151.m106358x160e9ec7();
                                i19++;
                                break;
                            }
                        } else {
                            this.f58553x69b5879[i27] = 3;
                            this.f58551xdc5582be[i18] = c26901x4e9a151.m106361xfb822ef2();
                        }
                    } else {
                        this.f58553x69b5879[i27] = 1;
                    }
                    i18++;
                    break;
            }
        }
        java.lang.String[] strArr = this.f58552x8e1d893;
        if (strArr.length * 0.75d > i17) {
            if (i17 == 0) {
                this.f58552x8e1d893 = null;
            } else {
                this.f58552x8e1d893 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i17);
            }
        }
    }

    /* renamed from: getObjectType */
    public static int m108489x2dd7a70f(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) {
            return 10;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.String.class) {
            return 9;
        }
        if (cls == java.lang.Integer.class) {
            return 5;
        }
        if (cls == java.lang.Float.class) {
            return 7;
        }
        if (cls == java.lang.Double.class) {
            return 8;
        }
        if (cls == java.lang.Boolean.class) {
            return 1;
        }
        if (cls == java.lang.Short.class) {
            return 4;
        }
        if (cls == java.lang.Long.class) {
            return 6;
        }
        if (cls == java.lang.Character.class) {
            return 2;
        }
        if (cls == java.lang.Byte.class) {
            return 3;
        }
        return cls == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151.class ? 11 : 12;
    }
}
