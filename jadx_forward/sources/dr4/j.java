package dr4;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.o f324183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dr4.o oVar) {
        super(0);
        this.f324183d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dr4.o oVar = this.f324183d;
        oVar.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f324211d, "do WindowSurfaceRenderer release");
        oVar.g(oVar.f324214g, 0);
        oVar.g(oVar.f324215h, 1);
        oVar.g(oVar.f324216i, 0);
        oVar.g(oVar.f324217j, 0);
        android.view.Surface surface = oVar.f324224q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = oVar.f324223p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        is0.c cVar = oVar.f324220m;
        if (cVar != null) {
            cVar.close();
        }
        dr4.r1 r1Var = oVar.f324219l;
        if (r1Var != null) {
            r1Var.n();
        }
        if (oVar.f324218k != null) {
            oVar.f324215h = null;
            oVar.f324214g = null;
        }
        return jz5.f0.f384359a;
    }
}
