package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public class g implements km5.f {
    public g(com.tencent.mm.plugin.appbrand.appcache.predownload.h hVar) {
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        r45.xg xgVar = (r45.xg) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "onCgiBack, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0 || xgVar == null || (linkedList = xgVar.f390058d) == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1422, 2);
            r81.f.INSTANCE.b(0, 2);
        } else {
            com.tencent.mm.plugin.appbrand.appcache.predownload.o.f75870y.a(linkedList, false);
            com.tencent.mm.plugin.appbrand.appcache.predownload.z0.a(linkedList, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1422, 1);
            r81.f.INSTANCE.b(0, 1);
        }
    }
}
