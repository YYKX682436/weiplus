package rx4;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f482812d;

    public u(rx4.e0 e0Var) {
        this.f482812d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0 e0Var = this.f482812d;
        rx4.e0.X6(e0Var, e0Var.f482671e ? vu4.a.f521784u : vu4.a.f521783t, null, null, 6, null);
        rx4.e0 e0Var2 = this.f482812d;
        e0Var2.f482671e = !e0Var2.f482671e;
        rx4.e0.Y6(e0Var2, false, 1, null);
        e0Var2.m174141x36654fab();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
