package kz3;

/* loaded from: classes15.dex */
public final class z implements sy3.a {

    /* renamed from: a, reason: collision with root package name */
    public final db5.f0 f395478a;

    public z(db5.f0 currentImageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentImageView, "currentImageView");
        this.f395478a = currentImageView;
    }

    @Override // sy3.a
    public void a(float f17, float f18, float f19) {
        this.f395478a.p(f17, f18, f19);
    }

    @Override // sy3.a
    public float b(float f17, float f18) {
        return this.f395478a.b(f17, f18);
    }

    @Override // sy3.a
    public float c() {
        return this.f395478a.mo79188x8f7d8694();
    }

    @Override // sy3.a
    public float d() {
        return this.f395478a.mo45732x7520af94();
    }

    @Override // sy3.a
    /* renamed from: dispatchTouchEvent */
    public boolean mo144663xb864a2b5(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // sy3.a
    public void e(sy3.b bVar) {
    }

    @Override // sy3.a
    public void f() {
        this.f395478a.i();
    }

    @Override // sy3.a
    /* renamed from: reset */
    public void mo144664x6761d4f() {
    }
}
