package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.m6 f75814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l6 f75815d;

    public k0(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.service.m6 m6Var, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        this.f75812a = str;
        this.f75813b = i17;
        this.f75814c = m6Var;
        this.f75815d = l6Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = new com.tencent.mm.plugin.appbrand.launching.o6(this.f75812a, "", 0, this.f75813b, new com.tencent.mm.plugin.appbrand.launching.u6(0, true, null, 5, null), false);
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.i0 i0Var = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.i0(this.f75812a, this.f75813b, o6Var, this.f75814c);
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.j0 j0Var = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.j0(o6Var, this.f75815d);
        r45.y50 y50Var = new r45.y50();
        y50Var.f390799f = 1;
        return com.tencent.mm.plugin.appbrand.launching.j6.a(j6Var, o6Var, i0Var, j0Var, null, null, y50Var, null, null, null, null, 984, null);
    }
}
