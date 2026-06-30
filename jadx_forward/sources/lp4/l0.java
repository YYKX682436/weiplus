package lp4;

/* loaded from: classes10.dex */
public final class l0 extends yt3.a implements vm5.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f401906f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f401907g;

    /* renamed from: h, reason: collision with root package name */
    public final lp4.k0 f401908h;

    /* renamed from: i, reason: collision with root package name */
    public bp4.c0 f401909i;

    /* renamed from: m, reason: collision with root package name */
    public rm5.v f401910m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 playView, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playView, "playView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f401906f = playView;
        this.f401907g = new java.util.LinkedList();
        this.f401908h = new lp4.k0(this, status);
        playView.m82516xd24ee348(this);
    }

    public static void C(lp4.l0 l0Var, rm5.v vVar, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? true : z18;
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        long j18 = j17;
        if (vVar == null) {
            l0Var.getClass();
        } else {
            l0Var.f401910m = vVar;
            l0Var.f401906f.q(vVar, z19, z27, j18);
        }
    }

    public final void A(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorPreviewPlugin", "seek to " + j17);
        this.f401906f.j(j17);
    }

    public final void B(long j17, long j18) {
        this.f401906f.k(j17, j18);
    }

    @Override // vm5.a
    public void a(long j17) {
        for (bp4.z zVar : this.f401907g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).c(j17);
            }
        }
    }

    @Override // vm5.a
    public void e() {
    }

    @Override // vm5.a
    public void g() {
        for (bp4.z zVar : this.f401907g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).mo10982x42fe6352();
            }
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        this.f401907g.clear();
    }

    @Override // vm5.a
    public void s() {
        for (bp4.z zVar : this.f401907g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).n(this.f401908h);
            }
        }
        long m82509xa86cd69f = this.f401906f.m82509xa86cd69f();
        rm5.v vVar = this.f401910m;
        long i17 = m82509xa86cd69f - ((vVar != null ? vVar.i() : 0L) / 1000);
        bp4.c0 c0Var = this.f401909i;
        if (c0Var != null) {
            bp4.c0.m(c0Var, i17, null, 2, null);
        }
    }

    @Override // vm5.a
    public void x() {
        ju3.d0.k(this.f546865d, ju3.c0.R2, null, 2, null);
    }

    public final void z(bp4.z callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList linkedList = this.f401907g;
        if (linkedList.contains(callback)) {
            return;
        }
        linkedList.add(callback);
    }
}
