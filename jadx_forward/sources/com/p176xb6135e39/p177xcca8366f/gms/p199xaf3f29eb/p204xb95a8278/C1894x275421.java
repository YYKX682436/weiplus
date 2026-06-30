package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* renamed from: com.google.android.gms.common.images.Size */
/* loaded from: classes.dex */
public final class C1894x275421 {
    private final int zaa;
    private final int zab;

    public C1894x275421(int i17, int i18) {
        this.zaa = i17;
        this.zab = i18;
    }

    /* renamed from: parseSize */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1894x275421 m18055x92bcdd54(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string must not be null");
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw zaa(str);
        }
        try {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1894x275421(java.lang.Integer.parseInt(str.substring(0, indexOf)), java.lang.Integer.parseInt(str.substring(indexOf + 1)));
        } catch (java.lang.NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static java.lang.NumberFormatException zaa(java.lang.String str) {
        throw new java.lang.NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    /* renamed from: equals */
    public boolean m18056xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1894x275421) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1894x275421 c1894x275421 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1894x275421) obj;
            if (this.zaa == c1894x275421.zaa && this.zab == c1894x275421.zab) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getHeight */
    public int m18057x1c4fb41d() {
        return this.zab;
    }

    /* renamed from: getWidth */
    public int m18058x755bd410() {
        return this.zaa;
    }

    /* renamed from: hashCode */
    public int m18059x8cdac1b() {
        int i17 = this.zaa;
        return ((i17 >>> 16) | (i17 << 16)) ^ this.zab;
    }

    /* renamed from: toString */
    public java.lang.String m18060x9616526c() {
        return this.zaa + "x" + this.zab;
    }
}
