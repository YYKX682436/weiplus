package v31;

/* loaded from: classes7.dex */
public final class h implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f514623d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f514623d = lVar;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "onRunningStateChanged appId:" + str + " state:" + bVar);
        int i17 = bVar == null ? -1 : v31.g.f514622a[bVar.ordinal()];
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) this.f514623d).mo32091x9a3f0ba2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo32091x9a3f0ba2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2).a2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "onRunningStateChanged background but in preRender Mode");
                return;
            } else {
                ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).wi();
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Ni();
            return;
        }
        a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicNewPlayableFeatureService", "resumeBiz");
        y31.f fVar = kVar.f82722d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "resume");
            jc3.j0 j0Var = fVar.f540696d;
            if (j0Var != null) {
                ((rc3.w0) j0Var).A();
            }
        }
    }
}
