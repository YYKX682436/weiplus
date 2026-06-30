package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f192766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192767e;

    public z6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f192766d = activityC0065xcd7aa112;
        this.f192767e = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8 s8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8.f214560a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192767e;
        java.lang.String string = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) a7Var.f187740d).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8 i8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8.f213827e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8.f213414e;
        java.lang.String string2 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) a7Var.f187740d).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575329p40);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) a7Var.f187740d).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f192766d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y6 y6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y6(activityC0065xcd7aa112);
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
        if (c14994x9b99c079 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c14994x9b99c079.getFeedObject().m76760x76845fea();
        lVarArr[0] = new jz5.l("author_finder_username", m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
        lVarArr[1] = new jz5.l("action_type", 3);
        s8Var.e(activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8(string, i8Var, d8Var, string2, string3, y6Var, null, null, "profile_set_entrance_open", "profile_set_entrance_unopen", "profile_set_entrance_halfscreen", kz5.c1.k(lVarArr), 192, null));
    }
}
