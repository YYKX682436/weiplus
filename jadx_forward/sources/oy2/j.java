package oy2;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.l f431503d;

    public j(oy2.l lVar) {
        this.f431503d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f431503d.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
