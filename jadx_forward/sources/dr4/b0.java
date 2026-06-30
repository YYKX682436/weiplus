package dr4;

/* loaded from: classes14.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f324126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dr4.c0 c0Var, yz5.l lVar) {
        super(0);
        this.f324126d = c0Var;
        this.f324127e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f324127e;
        dr4.c0 c0Var = this.f324126d;
        try {
            c0Var.f324138h = false;
            is0.c cVar = c0Var.f324139i;
            if (cVar != null) {
                cVar.close();
            }
            android.graphics.SurfaceTexture surfaceTexture = c0Var.f324136f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            is0.c cVar2 = new is0.c(false, 14L);
            c0Var.f324139i = cVar2;
            dr4.q1 q1Var = c0Var.f324135e;
            if (q1Var != null) {
                q1Var.x(cVar2);
            }
            android.graphics.SurfaceTexture surfaceTexture2 = new android.graphics.SurfaceTexture(cVar2.f375928e);
            c0Var.f324136f = surfaceTexture2;
            surfaceTexture2.setOnFrameAvailableListener(new dr4.a0(c0Var));
            if (lVar != null) {
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PboSurfaceRender", "switch camera failed");
            c0Var.f324138h = true;
            if (lVar != null) {
            }
        }
        return jz5.f0.f384359a;
    }
}
