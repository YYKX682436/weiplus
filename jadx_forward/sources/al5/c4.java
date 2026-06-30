package al5;

/* loaded from: classes10.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f87407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f87408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(float f17, float f18, com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d) {
        super(1);
        this.f87407d = f17;
        this.f87408e = f18;
        this.f87409f = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.postTranslate(this.f87407d, this.f87408e);
        this.f87409f.G = true;
        return java.lang.Boolean.TRUE;
    }
}
