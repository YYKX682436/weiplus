package go0;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f355346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(go0.v0 v0Var) {
        super(0);
        this.f355346d = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.g gVar = rs0.i.f480829a;
        go0.v0 v0Var = this.f355346d;
        v0Var.f355418l = gVar.l(v0Var.f355408b, v0Var.f355409c, v0Var.f355407a);
        int i17 = v0Var.f355408b;
        int i18 = v0Var.f355409c;
        v0Var.f355413g = new go0.b1(i17, i18, i17, i18, 2, 0, 32, null);
        is0.c cVar = new is0.c(false, 18L);
        go0.b1 b1Var = v0Var.f355413g;
        if (b1Var != null) {
            b1Var.Q = cVar.f375928e;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
        v0Var.f355414h = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(v0Var.f355408b, v0Var.f355409c);
        android.graphics.SurfaceTexture surfaceTexture2 = v0Var.f355414h;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new go0.u0(v0Var));
        }
        v0Var.f355417k = new android.view.Surface(v0Var.f355414h);
        v0Var.f355410d.mo146xb9724478(v0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Renderer info:");
        go0.b1 b1Var2 = v0Var.f355413g;
        sb6.append(b1Var2 != null ? b1Var2.C() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveScreenShareRender", sb6.toString());
        go0.b1 b1Var3 = v0Var.f355413g;
        if (b1Var3 != null) {
            b1Var3.P++;
        }
        return jz5.f0.f384359a;
    }
}
