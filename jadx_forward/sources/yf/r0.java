package yf;

/* loaded from: classes7.dex */
public class r0 implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public float f542986d;

    /* renamed from: e, reason: collision with root package name */
    public float f542987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542988f;

    public r0(yf.i0 i0Var) {
        this.f542988f = i0Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        yf.i0 i0Var = this.f542988f;
        int mo176944x70202721 = i0Var.f542895i.mo176944x70202721();
        if (mo176944x70202721 <= 0) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.f542986d;
        this.f542986d = scaleGestureDetector.getScaleFactor();
        float a17 = h3.a.a(this.f542987e + scaleFactor, 0.0f, 1.0f);
        this.f542987e = a17;
        if (i0Var.f542895i != null) {
            int i17 = (int) (a17 * mo176944x70202721);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onScale, maxZoom: %d, scaleFactor: %f, scale: %d", java.lang.Integer.valueOf(mo176944x70202721), java.lang.Float.valueOf(this.f542987e), java.lang.Integer.valueOf(i17));
            i0Var.f542895i.mo176949x76535355(i17);
            i0Var.f542893g.e().a(i17);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        this.f542986d = scaleGestureDetector.getScaleFactor();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }
}
