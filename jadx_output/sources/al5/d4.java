package al5;

/* loaded from: classes2.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout) {
        super(0);
        this.f5882d = touchMediaPreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f5882d;
        android.view.View view = new android.view.View(touchMediaPreviewLayout.getContext());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setBackgroundColor(0);
        touchMediaPreviewLayout.addView(view, 1, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return view;
    }
}
