package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class l4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.m4 f75642d;

    public l4(com.tencent.mm.plugin.appbrand.appcache.m4 m4Var) {
        this.f75642d = m4Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.appcache.ua Bi;
        if (m1Var != null && (m1Var.getReqResp() instanceof com.tencent.mm.modelbase.o)) {
            r45.fc7 fc7Var = (r45.fc7) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
            int i19 = this.f75642d.f75672d.f75938g;
            int i27 = fc7Var.f374212f;
            com.tencent.mm.plugin.appbrand.appcache.k4 k4Var = new com.tencent.mm.plugin.appbrand.appcache.k4(this);
            java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.p8.f("@LibraryAppId", i19, i27);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17) && (Bi = com.tencent.mm.plugin.appbrand.appcache.ua.Bi()) != null) {
                Bi.f75998e.e(f17, k4Var);
            }
        }
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.file.e2.CTRL_INDEX, this);
    }
}
