package rx4;

/* loaded from: classes8.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f482856d;

    public x(rx4.e0 e0Var) {
        this.f482856d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0.X6(this.f482856d, vu4.a.f521785v, null, null, 6, null);
        rx4.e0 e0Var = this.f482856d;
        e0Var.getClass();
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:history14", "[]");
        rx4.h hVar = e0Var.f482674h;
        if (hVar != null && (list = hVar.f482694d) != null) {
            ((java.util.ArrayList) list).clear();
        }
        rx4.e0.Y6(e0Var, false, 1, null);
        e0Var.m174141x36654fab();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
