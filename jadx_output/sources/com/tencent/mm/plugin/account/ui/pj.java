package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class pj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f74119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f74120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f74121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74122g;

    public pj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity, com.tencent.mm.ui.widget.dialog.k0 k0Var, java.util.List list, db5.h4 h4Var) {
        this.f74122g = welcomeActivity;
        this.f74119d = k0Var;
        this.f74120e = list;
        this.f74121f = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74122g;
        com.tencent.mm.plugin.account.ui.WelcomeActivity.S6(welcomeActivity);
        this.f74119d.v();
        if (this.f74120e.contains(this.f74121f)) {
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = welcomeActivity.f73694f;
            thirdAppRegisterStruct.f61234d = 1L;
            thirdAppRegisterStruct.f61235e = 1L;
            thirdAppRegisterStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
