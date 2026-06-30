package aw4;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f14857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14859g;

    public d0(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.String str, tg0.h1 h1Var) {
        this.f14856d = c0Var;
        this.f14857e = z2Var;
        this.f14858f = str;
        this.f14859g = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f14856d.f310112d = true;
        this.f14857e.B();
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean(this.f14858f, true);
        tg0.h1 h1Var = this.f14859g;
        if (h1Var != null) {
            h1Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
