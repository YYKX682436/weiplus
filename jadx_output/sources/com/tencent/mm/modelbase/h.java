package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.g f70641d;

    public h(com.tencent.mm.modelbase.g gVar) {
        this.f70641d = gVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.modelbase.g gVar = this.f70641d;
        if (gVar.f70628i.f70647g.get()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.modelbase.g gVar2 = gVar.f70628i.f70644d;
            objArr[0] = (gVar2 == null || (oVar = gVar2.f70626g) == null) ? "" : java.lang.Integer.valueOf(oVar.f70713d);
            com.tencent.mars.xlog.Log.w("MicroMsg.Cgi", "[onGYNetEnd] has cancel. cgi=%s", objArr);
            gVar.f70623d.onSceneEnd(i18, i19, str, gVar.f70624e);
            return;
        }
        gVar.H(i18, i19, str);
        gVar.f70623d.onSceneEnd(i18, i19, str, gVar.f70624e);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gVar.f70624e.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(gVar.f70626g.f70713d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - gVar.f70625f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
