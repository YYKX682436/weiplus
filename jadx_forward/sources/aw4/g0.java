package aw4;

/* loaded from: classes.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f96411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96412e;

    public g0(db5.g3 g3Var, tg0.h1 h1Var) {
        this.f96411d = g3Var;
        this.f96412e = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("tophitory_show_comment_dialog", true);
        db5.g3 g3Var = this.f96411d;
        g3Var.T = true;
        g3Var.B();
        tg0.h1 h1Var = this.f96412e;
        if (h1Var != null) {
            h1Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
