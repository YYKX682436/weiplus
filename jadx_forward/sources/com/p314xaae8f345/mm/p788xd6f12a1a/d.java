package com.p314xaae8f345.mm.p788xd6f12a1a;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f149782n;

    /* renamed from: a, reason: collision with root package name */
    public long f149769a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f149770b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f149771c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f149772d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f149773e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f149774f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int[] f149775g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f149776h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f149777i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f149778j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f149779k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f149780l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f149781m = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f149783o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f149784p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f149785q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f149786r = new int[4];

    /* renamed from: s, reason: collision with root package name */
    public final int[] f149787s = new int[4];

    /* renamed from: t, reason: collision with root package name */
    public int[] f149788t = null;

    /* renamed from: u, reason: collision with root package name */
    public long f149789u = 0;

    public java.lang.String a() {
        if (!b()) {
            return "[ ]";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (int i17 : this.f149775g) {
            sb6.append("" + i17 + " ");
        }
        sb6.append("]");
        return sb6.toString();
    }

    public boolean b() {
        int[] iArr = this.f149775g;
        return iArr != null && iArr.length > 0 && (iArr.length != 1 || iArr[0] > 0);
    }

    public java.lang.String c(long j17) {
        return java.lang.String.format("hashCode:%x time:[init:%d, start:%d, stop:%d][delay:%d, timeout:%d][scene:%d, action:%d, callerTid:%d][cpu:%d, io:%d, gpu:%d] bindTids:%s [TAG:%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(this.f149779k - j17), java.lang.Long.valueOf(this.f149778j - j17), java.lang.Long.valueOf(this.f149780l - j17), java.lang.Integer.valueOf(this.f149770b), java.lang.Integer.valueOf(this.f149771c), java.lang.Integer.valueOf(this.f149776h), java.lang.Long.valueOf(this.f149777i), java.lang.Integer.valueOf(this.f149781m), java.lang.Integer.valueOf(this.f149772d), java.lang.Integer.valueOf(this.f149774f), java.lang.Integer.valueOf(this.f149773e), a(), this.f149782n);
    }
}
