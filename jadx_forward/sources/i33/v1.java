package i33;

/* loaded from: classes4.dex */
public final class v1 implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.x1 f369815d;

    public v1(i33.x1 x1Var) {
        this.f369815d = x1Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleGestureDetector, "scaleGestureDetector");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        java.lang.Object tag;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleGestureDetector, "scaleGestureDetector");
        i33.x1 x1Var = this.f369815d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
        e33.v2 v2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561) m158354x19263085).f220112e;
        android.view.View e17 = v2Var.e(v2Var.f329044v);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = x1Var.f369821d;
        if (e17 != null && (tag = e17.getTag(com.p314xaae8f345.mm.R.id.tzk)) != null) {
            if (((java.lang.Integer) tag).intValue() == 6) {
                db5.e7 a17 = al5.y3.f87635a.a(e17);
                if (a17 != null) {
                    a17.mo70831x49dc7633(true);
                    scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81477xae17c85(true);
                }
                i33.x1.T6(x1Var, e17);
                return true;
            }
        }
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81477xae17c85(false);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleGestureDetector, "scaleGestureDetector");
    }
}
