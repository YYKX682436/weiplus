package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class l implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.o f75864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f75865b;

    public l(com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar, boolean z17) {
        this.f75864a = oVar;
        this.f75865b = z17;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.lj6 lj6Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.appbrand.service.r6 r6Var = com.tencent.mm.plugin.appbrand.service.r6.Fail_SvrConnectFail;
        com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar = this.f75864a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.i(oVar.f75876r, "onCgiBack NULL result");
            com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.a(oVar.f75882x, r6Var);
            return;
        }
        java.lang.String str = oVar.f75876r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiBack appId:");
        java.lang.String str2 = oVar.f75872n;
        sb6.append(str2);
        sb6.append(" moduleName:");
        sb6.append(oVar.f75875q);
        sb6.append(", errType[");
        sb6.append(fVar.f70615a);
        sb6.append("], errCode[");
        sb6.append(fVar.f70616b);
        sb6.append("], errMsg[");
        sb6.append(fVar.f70617c);
        sb6.append("], dealPluginOnly[");
        boolean z17 = this.f75865b;
        sb6.append(z17);
        sb6.append("], splitPluginCode:[true]");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        oVar.f75881w = java.lang.System.currentTimeMillis();
        if (th1.a.b(fVar)) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.jb5 jb5Var = (r45.jb5) fVar.f70618d;
            if (jb5Var != null && (lj6Var = jb5Var.f377688d) != null) {
                linkedList2.add(lj6Var);
            }
            r45.jb5 jb5Var2 = (r45.jb5) fVar.f70618d;
            if (jb5Var2 != null && (linkedList = jb5Var2.f377689e) != null) {
                linkedList2.addAll(linkedList);
            }
            com.tencent.mars.xlog.Log.i(oVar.f75876r, "cmdList size:[" + linkedList2.size() + ']');
            com.tencent.mm.plugin.appbrand.appcache.predownload.o.f75870y.a(linkedList2, z17);
            com.tencent.mm.plugin.appbrand.appcache.predownload.z0.a(linkedList2, oVar);
        } else {
            com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.a(oVar.f75882x, r6Var);
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySytemPreDownloadCodeCgiStruct weAppQualitySytemPreDownloadCodeCgiStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySytemPreDownloadCodeCgiStruct();
        weAppQualitySytemPreDownloadCodeCgiStruct.f62810d = weAppQualitySytemPreDownloadCodeCgiStruct.b("UserName", oVar.f75871m, true);
        weAppQualitySytemPreDownloadCodeCgiStruct.f62811e = weAppQualitySytemPreDownloadCodeCgiStruct.b("AppId", str2, true);
        weAppQualitySytemPreDownloadCodeCgiStruct.f62812f = oVar.f75879u;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62814h = oVar.f75874p;
        long j17 = oVar.f75881w;
        long j18 = oVar.f75880v;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62813g = j17 - j18;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62815i = j18;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62816j = j17;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62817k = fVar.f70615a;
        weAppQualitySytemPreDownloadCodeCgiStruct.f62818l = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        weAppQualitySytemPreDownloadCodeCgiStruct.k();
    }
}
