package aw4;

/* loaded from: classes.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f14889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14890e;

    public j0(db5.g3 g3Var, tg0.h1 h1Var) {
        this.f14889d = g3Var;
        this.f14890e = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.g3 g3Var = this.f14889d;
        g3Var.T = true;
        g3Var.B();
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("tophitory_show_init_dialog", true);
        tg0.h1 h1Var = this.f14890e;
        if (h1Var != null) {
            h1Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
