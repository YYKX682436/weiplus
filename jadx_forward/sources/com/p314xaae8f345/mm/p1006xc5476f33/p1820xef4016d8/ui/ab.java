package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ab implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228238d;

    public ab(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228238d = activityC16373x8a110f13;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 menu) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        gb3.p.f351575a.a(11);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228238d;
        menu.f(1, activityC16373x8a110f13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.glr));
        menu.f(2, activityC16373x8a110f13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gls));
        boolean z17 = false;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_exclusive_lucky_money, 0);
        int intExtra = activityC16373x8a110f13.getIntent().getIntExtra("key_chatroom_num", 0);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "%s: isOpenImIncludeAssociateRoom:%s", activityC16373x8a110f13.getIntent().getStringExtra("key_username"), java.lang.Boolean.valueOf(c01.e2.R(activityC16373x8a110f13.getIntent().getStringExtra("key_username"))));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = activityC16373x8a110f13.Z;
        if (c1Var != null && c1Var.f226730v) {
            z17 = true;
        }
        if (!z17 || activityC16373x8a110f13.f227802p1 != 1 || c01.e2.R(activityC16373x8a110f13.getIntent().getStringExtra("key_username")) || (i17 = activityC16373x8a110f13.Y) == 2 || i17 == 3 || intExtra <= 1) {
            return;
        }
        menu.f(3, activityC16373x8a110f13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.glp));
    }
}
