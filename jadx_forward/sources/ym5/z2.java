package ym5;

/* loaded from: classes10.dex */
public class z2 implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 f545122d;

    public z2(com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7) {
        this.f545122d = c22796x44e7a3d7;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (java.lang.Float.isNaN(scaleFactor) || java.lang.Float.isInfinite(scaleFactor)) {
            return false;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f545122d;
        c22796x44e7a3d7.E *= scaleFactor;
        c22796x44e7a3d7.f294920o.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        c22796x44e7a3d7.u();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }
}
