package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class h implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.g f152174d;

    public h(com.p314xaae8f345.mm.p944x882e457a.g gVar) {
        this.f152174d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p944x882e457a.g gVar = this.f152174d;
        if (gVar.f152161i.f152180g.get()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p944x882e457a.g gVar2 = gVar.f152161i.f152177d;
            objArr[0] = (gVar2 == null || (oVar = gVar2.f152159g) == null) ? "" : java.lang.Integer.valueOf(oVar.f152246d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Cgi", "[onGYNetEnd] has cancel. cgi=%s", objArr);
            gVar.f152156d.mo815x76e0bfae(i18, i19, str, gVar.f152157e);
            return;
        }
        gVar.H(i18, i19, str);
        gVar.f152156d.mo815x76e0bfae(i18, i19, str, gVar.f152157e);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gVar.f152157e.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(gVar.f152159g.f152246d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - gVar.f152158f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
