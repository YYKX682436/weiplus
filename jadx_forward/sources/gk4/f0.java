package gk4;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gk4.h0 h0Var) {
        super(0);
        this.f354084d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354084d.f354089a, "release");
        gk4.h0 h0Var = this.f354084d;
        h0Var.f354106r = false;
        is0.c cVar = h0Var.f354102n;
        if (cVar != null) {
            cVar.close();
        }
        gk4.h0 h0Var2 = this.f354084d;
        h0Var2.f354102n = null;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = h0Var2.f354101m;
        if (c22979xbb268bc != null) {
            c22979xbb268bc.f();
        }
        this.f354084d.f354100l.b();
        is0.c cVar2 = this.f354084d.f354105q;
        if (cVar2 != null) {
            cVar2.close();
        }
        os0.e eVar = this.f354084d.f354104p;
        if (eVar != null) {
            eVar.n();
        }
        rs0.h hVar = this.f354084d.f354095g;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        gk4.h0 h0Var3 = this.f354084d;
        h0Var3.f354095g = null;
        android.os.HandlerThread handlerThread = h0Var3.f354094f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        gk4.h0 h0Var4 = this.f354084d;
        h0Var4.f354094f = null;
        h0Var4.f354093e = null;
        android.graphics.SurfaceTexture surfaceTexture = h0Var4.f354092d;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f354084d.E = false;
        this.f354084d.getClass();
        this.f354084d.getClass();
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = this.f354084d.f354101m;
        if (c22979xbb268bc2 != null) {
            c22979xbb268bc2.k();
        }
        this.f354084d.f354101m = null;
        return jz5.f0.f384359a;
    }
}
