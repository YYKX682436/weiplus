package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f68249n;

    /* renamed from: a, reason: collision with root package name */
    public long f68236a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f68237b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f68238c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f68239d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f68240e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f68241f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int[] f68242g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f68243h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f68244i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f68245j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f68246k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f68247l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f68248m = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f68250o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f68251p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f68252q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f68253r = new int[4];

    /* renamed from: s, reason: collision with root package name */
    public final int[] f68254s = new int[4];

    /* renamed from: t, reason: collision with root package name */
    public int[] f68255t = null;

    /* renamed from: u, reason: collision with root package name */
    public long f68256u = 0;

    public java.lang.String a() {
        if (!b()) {
            return "[ ]";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (int i17 : this.f68242g) {
            sb6.append("" + i17 + " ");
        }
        sb6.append("]");
        return sb6.toString();
    }

    public boolean b() {
        int[] iArr = this.f68242g;
        return iArr != null && iArr.length > 0 && (iArr.length != 1 || iArr[0] > 0);
    }

    public java.lang.String c(long j17) {
        return java.lang.String.format("hashCode:%x time:[init:%d, start:%d, stop:%d][delay:%d, timeout:%d][scene:%d, action:%d, callerTid:%d][cpu:%d, io:%d, gpu:%d] bindTids:%s [TAG:%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(this.f68246k - j17), java.lang.Long.valueOf(this.f68245j - j17), java.lang.Long.valueOf(this.f68247l - j17), java.lang.Integer.valueOf(this.f68237b), java.lang.Integer.valueOf(this.f68238c), java.lang.Integer.valueOf(this.f68243h), java.lang.Long.valueOf(this.f68244i), java.lang.Integer.valueOf(this.f68248m), java.lang.Integer.valueOf(this.f68239d), java.lang.Integer.valueOf(this.f68241f), java.lang.Integer.valueOf(this.f68240e), a(), this.f68249n);
    }
}
