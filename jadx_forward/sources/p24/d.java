package p24;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 f432966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f432967e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 c17653x564a00f1, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f432966d = c17653x564a00f1;
        this.f432967e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 c17653x564a00f1 = this.f432966d;
        java.lang.String string = c17653x564a00f1.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), this.f432967e.f391656d, "setting", 0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1.y7(c17653x564a00f1, string);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
