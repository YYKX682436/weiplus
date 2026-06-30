package tl5;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f501866d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f501867e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f501868f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f501869g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Scroller f501870h;

    /* renamed from: i, reason: collision with root package name */
    public float f501871i;

    public c(android.view.View driveView, int i17, yz5.l onUpdate, yz5.a onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(driveView, "driveView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUpdate, "onUpdate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        this.f501866d = i17;
        this.f501867e = onUpdate;
        this.f501868f = onComplete;
        this.f501869g = new java.lang.ref.WeakReference(driveView);
        this.f501870h = new android.widget.Scroller(driveView.getContext(), new tl5.b());
    }

    public final void a() {
        this.f501870h.forceFinished(true);
        android.view.View view = (android.view.View) this.f501869g.get();
        if (view != null) {
            view.removeCallbacks(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean computeScrollOffset = this.f501870h.computeScrollOffset();
        yz5.a aVar = this.f501868f;
        yz5.l lVar = this.f501867e;
        if (!computeScrollOffset) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(this.f501871i));
            aVar.mo152xb9724478();
            return;
        }
        float a17 = h3.a.a(r0.getCurrX() / 1.0E8f, 0.0f, 1.0f);
        lVar.mo146xb9724478(java.lang.Float.valueOf(a17));
        if (java.lang.Math.abs(a17 - this.f501871i) < 1.0E-4f) {
            aVar.mo152xb9724478();
            return;
        }
        android.view.View view = (android.view.View) this.f501869g.get();
        if (view != null) {
            view.postOnAnimation(this);
        }
    }
}
