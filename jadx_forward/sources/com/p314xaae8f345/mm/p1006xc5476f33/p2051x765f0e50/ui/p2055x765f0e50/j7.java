package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 f242717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f242719f;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var, int i17, r45.ov6 ov6Var) {
        this.f242717d = l7Var;
        this.f242718e = i17;
        this.f242719f = ov6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g7 g7Var = this.f242717d.f242813m;
        if (g7Var != null) {
            int i17 = this.f242718e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p7) g7Var).f242959a;
            r45.ov6 userAuthApp = this.f242719f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userAuthApp, "userAuthApp");
            try {
                activityC17414x34d8ac5f.f241873s = i17;
                android.content.Intent intent = new android.content.Intent(activityC17414x34d8ac5f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524.class);
                intent.putExtra("key_user_auth_app", userAuthApp.mo14344x5f01b1f6());
                activityC17414x34d8ac5f.startActivityForResult(intent, 1000);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsAuthUI", e17, "jump to SettingsDelAuthUI exception", new java.lang.Object[0]);
            }
            l14.f.f396543a.a(204, userAuthApp);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
