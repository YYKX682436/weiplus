package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f290583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.m0 f290584e;

    public l0(com.p314xaae8f345.mm.ui.m0 m0Var, android.view.View view) {
        this.f290584e = m0Var;
        this.f290583d = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        final com.p314xaae8f345.mm.ui.o0 o0Var = (com.p314xaae8f345.mm.ui.o0) this.f290583d.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onMMMenuItemSelected] delete item:%s", o0Var);
        com.p314xaae8f345.mm.p957x53236a1b.t1.a(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("AllRemindMsgUI", this.f290584e.f290618d.f290928i, 1), 2, o0Var.f290975i, new yz5.r() { // from class: com.tencent.mm.ui.l0$$a
            @Override // yz5.r
            public final java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                final com.p314xaae8f345.mm.ui.l0 l0Var = com.p314xaae8f345.mm.ui.l0.this;
                final com.p314xaae8f345.mm.ui.o0 o0Var2 = o0Var;
                final java.lang.Integer num = (java.lang.Integer) obj;
                final java.lang.Integer num2 = (java.lang.Integer) obj2;
                final java.lang.String str = (java.lang.String) obj3;
                l0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "SetMsgRemindCgi callback, errType: %s, errCode: %s, errMsg: %s", num, num2, str);
                ((ku5.t0) ku5.t0.f394148d).D(new java.lang.Runnable() { // from class: com.tencent.mm.ui.l0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.l0 l0Var2 = com.p314xaae8f345.mm.ui.l0.this;
                        l0Var2.getClass();
                        int intValue = num.intValue();
                        com.p314xaae8f345.mm.ui.m0 m0Var = l0Var2.f290584e;
                        if (intValue == 0 && num2.intValue() == 0) {
                            java.util.LinkedList linkedList = m0Var.f290618d.f290928i.f278106h;
                            if (linkedList != null) {
                                final com.p314xaae8f345.mm.ui.o0 o0Var3 = o0Var2;
                                linkedList.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.l0$$c
                                    @Override // java.util.function.Predicate
                                    public final boolean test(java.lang.Object obj5) {
                                        return java.util.Objects.equals(((com.p314xaae8f345.mm.ui.o0) obj5).f290976j, com.p314xaae8f345.mm.ui.o0.this.f290975i.f461208d);
                                    }
                                });
                            }
                            m0Var.f290618d.f290928i.f278105g.m8146xced61ae5();
                            return;
                        }
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = m0Var.f290618d.f290928i.mo55332x76847179();
                        java.lang.String string = m0Var.f290618d.f290928i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcq);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        java.lang.String str2 = str;
                        if (str2 != null) {
                            string = str2;
                        }
                        dp.a.m125854x26a183b(mo55332x76847179, string, 0).show();
                    }
                });
                return jz5.f0.f384359a;
            }
        });
    }
}
