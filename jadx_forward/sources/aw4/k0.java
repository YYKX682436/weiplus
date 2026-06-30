package aw4;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f96426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96427f;

    public k0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, db5.g3 g3Var, tg0.h1 h1Var) {
        this.f96425d = c0Var;
        this.f96426e = g3Var;
        this.f96427f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f96425d.f391645d = true;
        db5.g3 g3Var = this.f96426e;
        g3Var.B();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("tophitory_show_init_dialog", false);
        tg0.h1 h1Var = this.f96427f;
        if (h1Var != null) {
            h1Var.a(g3Var.T);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
