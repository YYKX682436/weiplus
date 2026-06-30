package al5;

/* loaded from: classes10.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f87441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, yz5.l lVar) {
        super(0);
        this.f87440d = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
        this.f87441e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View m81461x43ae89e9;
        android.view.ViewParent parent;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = this.f87440d;
        android.view.View touchView = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getTouchView();
        if (touchView != null && (parent = touchView.getParent()) != null) {
            ((android.view.ViewGroup) parent).removeView(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getTouchView());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22679xbbf0480c c22679xbbf0480c = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.B;
        c22679xbbf0480c.E(true);
        c22679xbbf0480c.removeView(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getTouchView());
        android.view.ViewGroup viewGroup = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.C;
        if (viewGroup != null) {
            viewGroup.removeView(c22679xbbf0480c);
            viewGroup.addView(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getTouchView(), scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.E, scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.D);
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.E = 0;
        }
        android.view.View touchView2 = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getTouchView();
        if (touchView2 != null) {
            touchView2.setScaleX(1.0f);
            touchView2.setScaleY(1.0f);
            touchView2.setTranslationX(0.0f);
            touchView2.setTranslationY(0.0f);
            this.f87441e.mo146xb9724478(touchView2);
        }
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.I = false;
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f292994h = false;
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.G = false;
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81474xa4b33065(false);
        m81461x43ae89e9 = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81461x43ae89e9();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m81461x43ae89e9, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m81461x43ae89e9.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m81461x43ae89e9, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return jz5.f0.f384359a;
    }
}
