package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class ob {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.kb f126904a;

    static {
        f126904a = (!(com.p176xb6135e39.p283xc50a8b8b.ib.f126740f && com.p176xb6135e39.p283xc50a8b8b.ib.f126739e) || com.p176xb6135e39.p283xc50a8b8b.i.a()) ? new com.p176xb6135e39.p283xc50a8b8b.lb() : new com.p176xb6135e39.p283xc50a8b8b.nb();
    }

    public static int a(byte[] bArr, int i17, int i18) {
        byte b17 = bArr[i17 - 1];
        int i19 = i18 - i17;
        if (i19 == 0) {
            if (b17 > -12) {
                b17 = -1;
            }
            return b17;
        }
        if (i19 == 1) {
            return c(b17, bArr[i17]);
        }
        if (i19 == 2) {
            return d(b17, bArr[i17], bArr[i17 + 1]);
        }
        throw new java.lang.AssertionError();
    }

    public static int b(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length && charSequence.charAt(i18) < 128) {
            i18++;
        }
        int i19 = length;
        while (true) {
            if (i18 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i18);
            if (charAt < 2048) {
                i19 += (127 - charAt) >>> 31;
                i18++;
            } else {
                int length2 = charSequence.length();
                while (i18 < length2) {
                    char charAt2 = charSequence.charAt(i18);
                    if (charAt2 < 2048) {
                        i17 += (127 - charAt2) >>> 31;
                    } else {
                        i17 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i18) < 65536) {
                                throw new com.p176xb6135e39.p283xc50a8b8b.mb(i18, length2);
                            }
                            i18++;
                        }
                    }
                    i18++;
                }
                i19 += i17;
            }
        }
        if (i19 >= length) {
            return i19;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(54);
        sb6.append("UTF-8 length does not fit in int: ");
        sb6.append(i19 + 4294967296L);
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    public static int c(int i17, int i18) {
        if (i17 > -12 || i18 > -65) {
            return -1;
        }
        return i17 ^ (i18 << 8);
    }

    public static int d(int i17, int i18, int i19) {
        if (i17 > -12 || i18 > -65 || i19 > -65) {
            return -1;
        }
        return (i17 ^ (i18 << 8)) ^ (i19 << 16);
    }
}
