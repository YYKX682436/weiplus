package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.u f85326a;

    public w5(com.tencent.mm.plugin.appbrand.appcache.u uVar) {
        this.f85326a = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (!th1.a.b(fVar)) {
            return com.tencent.mm.modelbase.f.a(fVar != null ? fVar.f70615a : -1, fVar != null ? fVar.f70616b : -1, fVar != null ? fVar.f70617c : null, null, null, fVar != null ? fVar.f70620f : null);
        }
        java.util.LinkedList resp_list = ((r45.kf) fVar.f70618d).f378644d;
        kotlin.jvm.internal.o.f(resp_list, "resp_list");
        r45.me3 me3Var = (r45.me3) kz5.n0.Z(resp_list);
        com.tencent.mm.plugin.appbrand.appcache.u uVar = this.f85326a;
        if (me3Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D = uVar.D();
            kotlin.jvm.internal.o.f(D, "getRequest(...)");
            sb6.append(com.tencent.mm.plugin.appbrand.launching.x5.f(D));
            sb6.append(" useNewCgi=TRUE, get NULL respItem");
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
            return com.tencent.mm.modelbase.f.a(-1, -1, null, null, null, this.f85326a);
        }
        r45.ps3 ps3Var = new r45.ps3();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
        r45.os3 D2 = uVar.D();
        kotlin.jvm.internal.o.f(D2, "getRequest(...)");
        sb7.append(com.tencent.mm.plugin.appbrand.launching.x5.f(D2));
        sb7.append(", get resp_list.size:");
        sb7.append(((r45.kf) fVar.f70618d).f378644d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb7.toString());
        java.util.LinkedList<r45.me3> resp_list2 = ((r45.kf) fVar.f70618d).f378644d;
        kotlin.jvm.internal.o.f(resp_list2, "resp_list");
        for (r45.me3 me3Var2 : resp_list2) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D3 = uVar.D();
            kotlin.jvm.internal.o.f(D3, "getRequest(...)");
            sb8.append(com.tencent.mm.plugin.appbrand.launching.x5.f(D3));
            sb8.append(", get item[ errcode:");
            sb8.append(me3Var2.f380398d);
            sb8.append(", md5:");
            sb8.append(me3Var2.f380400f);
            sb8.append(", is_patch:");
            sb8.append(me3Var2.f380403i);
            sb8.append(", is_zstd:");
            sb8.append(me3Var2.f380404m);
            sb8.append(", url:");
            sb8.append(me3Var2.f380399e);
            sb8.append(" ]");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb8.toString());
            ps3Var.f383376f = me3Var2.f380401g;
            if (me3Var2.f380404m) {
                ps3Var.f383380m = me3Var2.f380399e;
            } else if (me3Var2.f380403i) {
                ps3Var.f383377g = me3Var2.f380399e;
            } else {
                ps3Var.f383375e = me3Var2.f380399e;
            }
        }
        return com.tencent.mm.modelbase.f.a(fVar.f70615a, fVar.f70616b, fVar.f70617c, ps3Var, null, this.f85326a);
    }
}
