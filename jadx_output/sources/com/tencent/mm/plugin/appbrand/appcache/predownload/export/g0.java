package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class g0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l6 f75791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f75792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75794g;

    public g0(com.tencent.mm.plugin.appbrand.service.l6 l6Var, km5.b bVar, java.lang.String str, int i17) {
        this.f75791d = l6Var;
        this.f75792e = bVar;
        this.f75793f = str;
        this.f75794g = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bc7 bc7Var;
        r45.bc7 bc7Var2;
        r45.bc7 bc7Var3;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        java.lang.String str2 = null;
        r45.i00 i00Var = fVar instanceof r45.i00 ? (r45.i00) fVar : null;
        km5.b bVar = this.f75792e;
        if (i17 == 0 && i18 == 0) {
            if ((i00Var == null || (bc7Var3 = i00Var.f376603d) == null || bc7Var3.f370669d != 0) ? false : true) {
                if (i00Var.f376604e) {
                    java.lang.String str3 = i00Var.f376606g;
                    if (!(str3 == null || str3.length() == 0)) {
                        com.tencent.mm.plugin.appbrand.appcache.o oVar2 = (com.tencent.mm.plugin.appbrand.appcache.o) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.o.class);
                        java.lang.String str4 = this.f75793f;
                        int i19 = this.f75794g;
                        if (!kotlin.jvm.internal.o.b(i00Var.f376606g, oVar2.z0(str4, i19))) {
                            java.lang.String str5 = i00Var.f376605f;
                            if (!(str5 == null || str5.length() == 0)) {
                                com.tencent.mm.plugin.appbrand.app.r9.Di().k(this.f75793f, this.f75794g, i00Var.f376605f, i00Var.f376606g, 0L, 0L);
                            }
                            ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).D0(str4, i19, i00Var.f376610n, true);
                            com.tencent.mm.plugin.appbrand.appcache.o oVar3 = (com.tencent.mm.plugin.appbrand.appcache.o) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.o.class);
                            java.lang.String new_demo_md5 = i00Var.f376606g;
                            kotlin.jvm.internal.o.f(new_demo_md5, "new_demo_md5");
                            oVar3.D0(str4, i19, new_demo_md5);
                        }
                    }
                }
                bVar.c(java.lang.Boolean.TRUE);
                return 0;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloadPkg, waitFor demo info failed, errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", wxaapp_baseresponse:{ErrCode:");
        sb6.append((i00Var == null || (bc7Var2 = i00Var.f376603d) == null) ? null : java.lang.Integer.valueOf(bc7Var2.f370669d));
        sb6.append(", ErrMsg:");
        if (i00Var != null && (bc7Var = i00Var.f376603d) != null) {
            str2 = bc7Var.f370670e;
        }
        sb6.append(str2);
        sb6.append('}');
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgDownloaderExportServiceImpl", sb6.toString());
        com.tencent.mm.plugin.appbrand.service.l6 l6Var = this.f75791d;
        if (l6Var != null) {
            l6Var.a(i18, str);
        }
        bVar.a(new java.lang.Exception());
        return 0;
    }
}
