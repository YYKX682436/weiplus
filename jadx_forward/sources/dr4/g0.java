package dr4;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f324166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(dr4.n0 n0Var) {
        super(0);
        this.f324166d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.h n17 = rs0.g.n(rs0.i.f480829a, null, null, 1, 1, null, 16, null);
        dr4.n0 n0Var = this.f324166d;
        n0Var.f324218k = n17;
        pq4.c l17 = gq4.v.Bi().l("DECODE");
        if (l17 != null) {
            l17.f439216d = n17;
        }
        n0Var.f324219l = new dr4.s0(0, 0, 0, 0, 1, 2, 8, null);
        is0.c b17 = is0.b.b(false, 14L);
        n0Var.f324220m = b17;
        n0Var.d(new dr4.m(n0Var, b17));
        n0Var.f324223p = new android.graphics.SurfaceTexture(b17.f375928e);
        n0Var.f324224q = new android.view.Surface(n0Var.f324223p);
        android.graphics.SurfaceTexture surfaceTexture = n0Var.f324223p;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new dr4.f0(n0Var, b17));
        }
        yz5.l lVar = n0Var.f324205u;
        if (lVar != null) {
            lVar.mo146xb9724478(n0Var);
        }
        return jz5.f0.f384359a;
    }
}
