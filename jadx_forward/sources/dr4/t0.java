package dr4;

/* loaded from: classes14.dex */
public final class t0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f324275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f324276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f324278g;

    public t0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, dr4.p1 p1Var, int i17) {
        this.f324275d = h0Var;
        this.f324276e = h0Var2;
        this.f324277f = p1Var;
        this.f324278g = i17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        dr4.x1 x1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        java.lang.Object obj = this.f324275d.f391656d;
        int i19 = this.f324278g;
        dr4.p1 p1Var = this.f324277f;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f324276e;
        if (obj != null) {
            dr4.x1 x1Var2 = p1Var.f324241g;
            if (x1Var2 != null) {
                x1Var2.a((dr4.q) h0Var.f391656d, i19);
                return;
            }
            return;
        }
        h0Var.f391656d = new dr4.q(surface, i17, i18);
        dr4.x1 x1Var3 = p1Var.f324241g;
        boolean z17 = false;
        if (x1Var3 != null) {
            java.lang.Object obj2 = h0Var.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            if (x1Var3.b((dr4.q) obj2)) {
                z17 = true;
            }
        }
        if (!z17 || (x1Var = p1Var.f324241g) == null) {
            return;
        }
        x1Var.a((dr4.q) h0Var.f391656d, i19);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        dr4.x1 x1Var = this.f324277f.f324241g;
        if (x1Var == null) {
            return true;
        }
        x1Var.c((dr4.q) this.f324276e.f391656d, this.f324278g);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        dr4.q qVar = (dr4.q) this.f324276e.f391656d;
        if (qVar != null) {
            qVar.d(0, 0, i17, i18);
        }
        dr4.x1 x1Var = this.f324277f.f324241g;
        if (x1Var != null) {
            x1Var.d();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
