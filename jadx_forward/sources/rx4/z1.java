package rx4;

/* loaded from: classes8.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482882d;

    public z1(rx4.h2 h2Var) {
        this.f482882d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$updateTabUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.h2 h2Var = this.f482882d;
        h2Var.m174141x36654fab();
        h2Var.y7(0, true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$updateTabUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
