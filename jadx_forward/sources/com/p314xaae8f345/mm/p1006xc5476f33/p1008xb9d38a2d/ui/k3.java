package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public final class k3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3 f155506f = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3(null);

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f155507g = "";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f155508d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f155509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f155508d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h3(this));
        this.f155509e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i3(this));
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "disableAgreeSyncMsgLL");
        R6().setClickable(false);
        Q6().setClickable(false);
    }

    public final void P6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "enableAgreeSyncMsgLL");
        R6().setClickable(true);
        Q6().setClickable(true);
    }

    public final android.widget.CheckBox Q6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f155508d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.CheckBox) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22599xd48522da R6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f155509e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22599xd48522da) mo141623x754a37bb;
    }

    public final int S6() {
        try {
            return ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di() ? 1 : 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginAgreeSyncMsgUIC", e17, "getHasSyncChatSelect failed: " + e17.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    public final void T6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22599xd48522da R6 = R6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "hideAgreeSyncMsgLLAndDisableSync", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "hideAgreeSyncMsgLLAndDisableSync", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(R6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di() ? 2 : 0);
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "onNext [" + m158354x19263085().getClass().getSimpleName() + "] checked: " + Q6().isChecked() + ", isAgreeSyncEnabled: " + ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di());
        try {
            jz5.l[] lVarArr = new jz5.l[4];
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3 g3Var = f155506f;
            lVarArr[0] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, g3Var.b());
            lVarArr[1] = new jz5.l("has_sync_chat_select", java.lang.Integer.valueOf(S6()));
            lVarArr[2] = new jz5.l("has_sync_chat_login", java.lang.Integer.valueOf(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1 ? 1 : 0));
            lVarArr[3] = new jz5.l("login_page_sessionid", com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3.a(g3Var));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_account_sync_msg", "view_clk", k17, 34575);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "reportLoginButtonClick success, params: " + k17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginAgreeSyncMsgUIC", e17, "reportLoginButtonClick failed", new java.lang.Object[0]);
        }
        if (((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di()) {
            ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(Q6().isChecked() ? 1 : 2);
        } else {
            ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(0);
        }
        O6();
    }

    public final void V6() {
        if (!((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22599xd48522da R6 = R6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(R6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "showAgreeSyncMsgDialog[" + m158354x19263085().getClass().getSimpleName() + ']');
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22599xd48522da R62 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R62, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(R62, arrayList4.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R62.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(R62, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(R62, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        try {
            ((cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158354x19263085(), iy1.c.AccountLoginPage)).ik(m158354x19263085(), 4, 34575)).fk(m158354x19263085(), "has_sync_chat_select", java.lang.Integer.valueOf(S6()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "setupPageReport success, has_sync_chat_select: " + S6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginAgreeSyncMsgUIC", e17, "setupPageReport failed", new java.lang.Object[0]);
        }
        Q6().setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        Q6().setChecked(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1);
    }
}
