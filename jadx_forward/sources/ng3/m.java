package ng3;

/* loaded from: classes10.dex */
public final class m implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng3.n f418549d;

    public m(ng3.n nVar) {
        this.f418549d = nVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        ng3.n nVar = this.f418549d;
        nVar.getClass();
        float f17 = 1;
        nVar.a(new ng3.o(ng3.t.f418570e, f17 + ((detector.getScaleFactor() - f17) * 3.0f), detector.getFocusX(), detector.getFocusY(), null, 16, null));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        this.f418549d.getClass();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        ng3.n nVar = this.f418549d;
        nVar.getClass();
        android.view.MotionEvent motionEvent = nVar.f418551d;
        if (motionEvent != null) {
            nVar.a(new ng3.o(ng3.t.f418571f, 0.0f, 0.0f, 0.0f, motionEvent, 14, null));
        }
    }
}
