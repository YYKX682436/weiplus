package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l6 f75800c;

    public h0(int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        this.f75798a = i17;
        this.f75799b = str;
        this.f75800c = l6Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17 = true;
        int i17 = this.f75798a;
        if (i17 == 2) {
            km5.b c17 = km5.u.c();
            java.lang.String str = this.f75799b;
            com.tencent.mm.modelbase.z2.d(com.tencent.mm.plugin.appbrand.launching.ec.a(str, null, null), new com.tencent.mm.plugin.appbrand.appcache.predownload.export.g0(this.f75800c, c17, str, i17), true);
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
