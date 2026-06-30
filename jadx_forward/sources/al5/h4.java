package al5;

/* loaded from: classes10.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d) {
        super(1);
        this.f87455d = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = this.f87455d;
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.A = false;
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81478xba667661(false);
        if (scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f292997n) {
            al5.z3 doubleTapListener = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getDoubleTapListener();
            if (doubleTapListener != null) {
                doubleTapListener.a();
            }
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f292997n = false;
        }
        return jz5.f0.f384359a;
    }
}
