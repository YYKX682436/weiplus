package ph2;

/* loaded from: classes10.dex */
public final class c implements android.view.Choreographer.FrameCallback, ph2.e {

    /* renamed from: d, reason: collision with root package name */
    public ph2.d f435912d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435913e;

    @Override // ph2.e
    public void a() {
        this.f435913e = false;
        android.view.Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // ph2.e
    public void b(ph2.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f435912d = callback;
    }

    @Override // ph2.e
    public void c() {
        this.f435913e = true;
        android.view.Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // ph2.e
    public void d(ah2.f fVar) {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        ph2.d dVar = this.f435912d;
        if (dVar != null) {
            dVar.b();
        }
        if (this.f435913e) {
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
