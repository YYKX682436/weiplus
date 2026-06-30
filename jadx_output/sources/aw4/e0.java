package aw4;

/* loaded from: classes.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f14863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14866h;

    public e0(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.String str, tg0.h1 h1Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f14862d = c0Var;
        this.f14863e = z2Var;
        this.f14864f = str;
        this.f14865g = h1Var;
        this.f14866h = c0Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f14862d.f310112d = true;
        this.f14863e.B();
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean(this.f14864f, false);
        tg0.h1 h1Var = this.f14865g;
        if (h1Var != null) {
            h1Var.a(this.f14866h.f310112d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
