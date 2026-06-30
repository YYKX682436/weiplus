package aw4;

/* loaded from: classes.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f14883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14884f;

    public h0(kotlin.jvm.internal.c0 c0Var, db5.g3 g3Var, tg0.h1 h1Var) {
        this.f14882d = c0Var;
        this.f14883e = g3Var;
        this.f14884f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f14882d.f310112d = true;
        db5.g3 g3Var = this.f14883e;
        g3Var.B();
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("tophitory_show_comment_dialog", false);
        tg0.h1 h1Var = this.f14884f;
        if (h1Var != null) {
            h1Var.a(g3Var.T);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
