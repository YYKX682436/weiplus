package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class k7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 f242759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f242761f;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var, int i17, r45.ov6 ov6Var) {
        this.f242759d = l7Var;
        this.f242760e = i17;
        this.f242761f = ov6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var = this.f242759d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g7 g7Var = l7Var.f242813m;
        if (g7Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            int i17 = l7Var.f242814n;
            int i18 = l7Var.f242815o;
            r45.ov6 userAuthApp = this.f242761f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userAuthApp, "userAuthApp");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick position: ");
            int i19 = this.f242760e;
            sb6.append(i19);
            sb6.append(", appId: ");
            sb6.append(userAuthApp.f464093d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p7) g7Var).f242959a;
            rl5.r rVar = activityC17414x34d8ac5f.f241875u;
            if (rVar != null) {
                rVar.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n7(activityC17414x34d8ac5f), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o7(activityC17414x34d8ac5f, i19, userAuthApp), i17, i18);
            }
            l14.f.f396543a.a(201, userAuthApp);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
