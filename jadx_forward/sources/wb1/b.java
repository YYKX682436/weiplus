package wb1;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb1.h f525890d;

    public b(wb1.h hVar) {
        this.f525890d = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        wb1.h hVar = this.f525890d;
        android.view.Surface surface = hVar.f525913o;
        if (surface != null) {
            try {
                gh.t tVar = hVar.f525912n;
                if (tVar != null) {
                    tVar.a(surface, false);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", e17, "handle page.onDestroy", new java.lang.Object[0]);
            }
            hVar.f525913o = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = hVar.f525909h;
        if (v5Var != null) {
            v5Var.K(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("componentView");
            throw null;
        }
    }
}
