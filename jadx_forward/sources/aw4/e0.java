package aw4;

/* loaded from: classes.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f96396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96399h;

    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.String str, tg0.h1 h1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        this.f96395d = c0Var;
        this.f96396e = z2Var;
        this.f96397f = str;
        this.f96398g = h1Var;
        this.f96399h = c0Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f96395d.f391645d = true;
        this.f96396e.B();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean(this.f96397f, false);
        tg0.h1 h1Var = this.f96398g;
        if (h1Var != null) {
            h1Var.a(this.f96399h.f391645d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$showEducationPopUpWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
