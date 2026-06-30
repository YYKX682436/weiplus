package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class ja implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 f242723d;

    public ja(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 activityC17419x2156b524) {
        this.f242723d = activityC17419x2156b524;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 activityC17419x2156b524 = this.f242723d;
        r45.ov6 ov6Var = activityC17419x2156b524.f241915e;
        if (ov6Var != null) {
            l14.f.f396543a.a(205, ov6Var);
        }
        activityC17419x2156b524.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17419x2156b524.mo55332x76847179(), 1, true);
        java.lang.String string = activityC17419x2156b524.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.ov6 ov6Var2 = activityC17419x2156b524.f241915e;
        java.lang.String str = ov6Var2 != null ? ov6Var2.f464094e : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        k0Var.r(format, 17, i65.a.b(activityC17419x2156b524, 14), null);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.la(activityC17419x2156b524);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ma(activityC17419x2156b524);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
