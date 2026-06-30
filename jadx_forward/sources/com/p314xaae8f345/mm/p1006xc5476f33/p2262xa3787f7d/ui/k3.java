package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18579x5b99114c f254583d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18579x5b99114c activityC18579x5b99114c) {
        this.f254583d = activityC18579x5b99114c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.teenmode.ui.k3$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k3 k3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k3.this;
                k3Var.getClass();
                if (((java.lang.Boolean) obj).booleanValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20917, 5, 1, 1, "", "", "", "");
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l3(k3Var);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.t(l3Var, 200L, null);
                }
                return jz5.f0.f384359a;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18579x5b99114c context = this.f254583d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(context), null, null, new xh4.u(context, lVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
