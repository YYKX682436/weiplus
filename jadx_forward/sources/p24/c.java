package p24;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 f432964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f432965e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 c17653x564a00f1, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f432964d = c17653x564a00f1;
        this.f432965e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f432965e;
        java.lang.String str = (java.lang.String) h0Var.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 c17653x564a00f1 = this.f432964d;
        c17653x564a00f1.getClass();
        if (r26.i0.p(str, "cn", true)) {
            java.lang.String string = c17653x564a00f1.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gba, "infopage", h0Var.f391656d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1.y7(c17653x564a00f1, string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
