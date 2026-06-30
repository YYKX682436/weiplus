package al5;

/* loaded from: classes2.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d) {
        super(0);
        this.f87415d = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = this.f87415d;
        android.view.View view = new android.view.View(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getContext());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setBackgroundColor(0);
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.addView(view, 1, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return view;
    }
}
