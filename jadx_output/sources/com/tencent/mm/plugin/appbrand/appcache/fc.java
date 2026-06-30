package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class fc extends m81.b {

    /* renamed from: q, reason: collision with root package name */
    public final int f75538q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f75539r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f75540s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f75541t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f75542u;

    public fc(java.lang.String str, java.lang.String str2, int i17, int i18, com.tencent.mm.plugin.appbrand.appcache.va vaVar) {
        super(java.lang.String.format(java.util.Locale.ENGLISH, "WxaPkgZstd_%s_%d", str2, java.lang.Integer.valueOf(i17)), com.tencent.mm.plugin.appbrand.appcache.d9.e(str2) + java.lang.String.format("_%d_%d.wxapkg.zstd", java.lang.Integer.valueOf(str2.hashCode()), java.lang.Integer.valueOf(i17)), str, str2, i17, i18);
        this.f75542u = false;
        this.f75538q = i17;
    }

    @Override // m81.b
    public java.util.List d() {
        return java.util.Arrays.asList(this.f189714c, f());
    }

    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.appcache.e9.f(this.f324688l, this.f75538q);
    }
}
