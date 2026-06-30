package w71;

/* loaded from: classes11.dex */
public final class w implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w71.x f524992d;

    public w(w71.x xVar) {
        this.f524992d = xVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public final void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        w71.x xVar = this.f524992d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xVar.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(xVar.mo808xfb85f7b0());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "scene doScene finish:%d, func:%d, netId:%d, time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - xVar.f524995f));
        if (str == null) {
            str = "";
        }
        w71.s sVar = xVar.f524993d;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = xVar.f524996g;
        sVar.a(i18, i19, str, oVar != null ? oVar.f152244b.f152233a : null);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = xVar.f524994e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, xVar);
        }
    }
}
