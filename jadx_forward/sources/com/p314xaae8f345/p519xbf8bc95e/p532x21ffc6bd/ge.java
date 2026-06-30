package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ge {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge f131105a = a(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f131106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131107c;

    private ge(int i17, int i18) {
        this.f131106b = i17;
        this.f131107c = i18;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge a(int i17, int i18) {
        if (i17 <= i18) {
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge(i17, i18);
        }
        throw new java.lang.IllegalStateException("Range的范围最小值不能大于最大值");
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge geVar) {
        return a(java.lang.Math.min(this.f131106b, geVar.f131106b), java.lang.Math.max(this.f131107c, geVar.f131107c));
    }

    private int b() {
        return this.f131107c;
    }

    public final boolean a(int i17) {
        return this.f131106b <= i17 && i17 <= this.f131107c;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge geVar) {
        int i17;
        int i18 = this.f131107c;
        int i19 = geVar.f131106b;
        if (i18 >= i19 && (i17 = this.f131106b) <= geVar.f131107c) {
            return a(java.lang.Math.max(i17, i19), java.lang.Math.min(this.f131107c, geVar.f131107c));
        }
        return f131105a;
    }

    private int a() {
        return this.f131106b;
    }
}
