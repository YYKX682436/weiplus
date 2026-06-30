package al5;

/* loaded from: classes10.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout, yz5.l lVar) {
        super(0);
        this.f5907d = touchMediaPreviewLayout;
        this.f5908e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View backgroundView;
        android.view.ViewParent parent;
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f5907d;
        android.view.View touchView = touchMediaPreviewLayout.getTouchView();
        if (touchView != null && (parent = touchView.getParent()) != null) {
            ((android.view.ViewGroup) parent).removeView(touchMediaPreviewLayout.getTouchView());
        }
        com.tencent.mm.ui.widget.cropview.DragExitCropLayout dragExitCropLayout = touchMediaPreviewLayout.B;
        dragExitCropLayout.E(true);
        dragExitCropLayout.removeView(touchMediaPreviewLayout.getTouchView());
        android.view.ViewGroup viewGroup = touchMediaPreviewLayout.C;
        if (viewGroup != null) {
            viewGroup.removeView(dragExitCropLayout);
            viewGroup.addView(touchMediaPreviewLayout.getTouchView(), touchMediaPreviewLayout.E, touchMediaPreviewLayout.D);
            touchMediaPreviewLayout.E = 0;
        }
        android.view.View touchView2 = touchMediaPreviewLayout.getTouchView();
        if (touchView2 != null) {
            touchView2.setScaleX(1.0f);
            touchView2.setScaleY(1.0f);
            touchView2.setTranslationX(0.0f);
            touchView2.setTranslationY(0.0f);
            this.f5908e.invoke(touchView2);
        }
        touchMediaPreviewLayout.I = false;
        touchMediaPreviewLayout.f211461h = false;
        touchMediaPreviewLayout.G = false;
        touchMediaPreviewLayout.setAddTouchView(false);
        backgroundView = touchMediaPreviewLayout.getBackgroundView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(backgroundView, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        backgroundView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(backgroundView, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return jz5.f0.f302826a;
    }
}
