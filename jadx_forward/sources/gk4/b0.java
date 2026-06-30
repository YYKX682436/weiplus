package gk4;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gk4.h0 h0Var, yz5.l lVar) {
        super(0);
        this.f354068d = h0Var;
        this.f354069e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354068d.f354089a, "createVideoTexture");
        is0.c cVar = this.f354068d.f354102n;
        if (cVar != null) {
            cVar.close();
        }
        this.f354068d.f354102n = new is0.c(false, 15L);
        gk4.h0 h0Var = this.f354068d;
        is0.c cVar2 = h0Var.f354102n;
        if (cVar2 != null) {
            yz5.l lVar = this.f354069e;
            if (cVar2.f375928e > 0) {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar2.f375928e);
                h0Var.f354103o = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new gk4.z(h0Var));
                ((ku5.t0) ku5.t0.f394148d).B(new gk4.a0(lVar, h0Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h0Var.f354089a, "create videoPlayTexture error texID:" + cVar2.f375928e);
            }
        }
        return jz5.f0.f384359a;
    }
}
