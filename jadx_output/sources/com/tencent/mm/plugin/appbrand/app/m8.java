package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class m8 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f75186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.app.n8 f75187e;

    public m8(com.tencent.mm.plugin.appbrand.app.n8 n8Var, km5.b bVar) {
        this.f75187e = n8Var;
        this.f75186d = bVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ff4 ff4Var;
        km5.b bVar = this.f75186d;
        java.lang.String requestAppID = this.f75187e.f75196a;
        kotlin.jvm.internal.o.g(requestAppID, "requestAppID");
        com.tencent.mm.network.v0 reqResp = m1Var != null ? m1Var.getReqResp() : null;
        com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70710a.f70684a : null;
        r45.dr5 dr5Var = fVar instanceof r45.dr5 ? (r45.dr5) fVar : null;
        if (kotlin.jvm.internal.o.b((dr5Var == null || (ff4Var = dr5Var.f372704d) == null) ? null : ff4Var.f374271d, requestAppID)) {
            gm0.j1.n().f273288b.q(1345, this);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.tencent.mm.network.v0 reqResp2 = m1Var != null ? m1Var.getReqResp() : null;
                com.tencent.mm.modelbase.o oVar2 = reqResp2 instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp2 : null;
                java.lang.Object obj = oVar2 != null ? oVar2.f70711b.f70700a : null;
                r45.er5 er5Var = obj instanceof r45.er5 ? (r45.er5) obj : null;
                if (er5Var == null) {
                    throw new java.lang.IllegalArgumentException();
                }
                objArr[0] = java.lang.Integer.valueOf(er5Var.f373694d);
                bVar.c(objArr);
            } catch (java.lang.Exception e17) {
                bVar.a(e17);
            }
        }
    }
}
