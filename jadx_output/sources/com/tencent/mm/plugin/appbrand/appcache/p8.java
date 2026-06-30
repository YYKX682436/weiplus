package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class p8 extends m81.b {

    /* renamed from: q, reason: collision with root package name */
    public final int f75723q;

    /* renamed from: r, reason: collision with root package name */
    public final int f75724r;

    public p8(java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.mm.plugin.appbrand.appcache.va vaVar) {
        super(f(str, i17, i18), com.tencent.mm.plugin.appbrand.appcache.d9.e(str) + java.lang.String.format(java.util.Locale.US, "_%s_%d_%d.wxapkg.diff", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), str2, str, i18, 0);
        this.f75723q = i17;
        this.f75724r = i18;
        "@LibraryAppId".equals(str);
    }

    public static java.lang.String f(java.lang.String str, int i17, int i18) {
        return java.lang.String.format(java.util.Locale.US, "WxaPkgDiff_%s_%d_%d", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // m81.b
    public java.util.List d() {
        return java.util.Arrays.asList(this.f189714c, g());
    }

    public java.lang.String g() {
        return com.tencent.mm.plugin.appbrand.appcache.e9.f(this.f324688l, this.f75724r);
    }
}
