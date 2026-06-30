package aw4;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f96390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96392g;

    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.String str, tg0.h1 h1Var) {
        this.f96389d = c0Var;
        this.f96390e = z2Var;
        this.f96391f = str;
        this.f96392g = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f96389d.f391645d = true;
        this.f96390e.B();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean(this.f96391f, true);
        tg0.h1 h1Var = this.f96392g;
        if (h1Var != null) {
            h1Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
