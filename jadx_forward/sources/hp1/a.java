package hp1;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 f364448d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9) {
        this.f364448d = surfaceHolderCallbackC12878x44b43bc9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/appbrand/FloatBallVideoPanelView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f364448d.f174515h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/appbrand/FloatBallVideoPanelView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
