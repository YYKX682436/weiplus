package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes11.dex */
public final class go extends zd4.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14115xff3e44d f191628b;

    public go(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14115xff3e44d activityC14115xff3e44d) {
        this.f191628b = activityC14115xff3e44d;
    }

    @Override // zd4.o
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zd4.q(2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jbz, com.p314xaae8f345.mm.R.C30867xcad56011.f574749jc1));
        arrayList.add(new zd4.q(2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.jbt, com.p314xaae8f345.mm.R.C30867xcad56011.jbk));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new zd4.q(3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jbz, com.p314xaae8f345.mm.R.C30867xcad56011.ltp));
        arrayList2.add(new zd4.q(3, 1, com.p314xaae8f345.mm.R.C30867xcad56011.jbt, com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj));
        arrayList2.add(new zd4.q(3, 2, com.p314xaae8f345.mm.R.C30867xcad56011.ltf, com.p314xaae8f345.mm.R.C30867xcad56011.ltg));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kz5.p0 p0Var = kz5.p0.f395529d;
        arrayList3.add(new zd4.r(0, com.p314xaae8f345.mm.R.C30867xcad56011.ltj, com.p314xaae8f345.mm.R.C30867xcad56011.ltm, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(2, com.p314xaae8f345.mm.R.C30867xcad56011.jbj, com.p314xaae8f345.mm.R.C30867xcad56011.jbk, arrayList, null, null, 48, null));
        arrayList3.add(new zd4.r(3, com.p314xaae8f345.mm.R.C30867xcad56011.lth, com.p314xaae8f345.mm.R.C30867xcad56011.lti, arrayList2, null, null, 48, null));
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209592zb).mo141623x754a37bb()).r()).intValue() == 1) {
            arrayList3.add(new zd4.r(6, com.p314xaae8f345.mm.R.C30867xcad56011.mhs, com.p314xaae8f345.mm.R.C30867xcad56011.mht, p0Var, null, null, 48, null));
        }
        arrayList3.add(new zd4.r(1, com.p314xaae8f345.mm.R.C30867xcad56011.ltk, com.p314xaae8f345.mm.R.C30867xcad56011.ltl, p0Var, null, null, 48, null));
        return arrayList3;
    }

    @Override // zd4.o
    public boolean p(int i17, int i18) {
        if (i18 == 3) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("view_id", "public_but_not_recommended");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14115xff3e44d activityC14115xff3e44d = this.f191628b;
            lVarArr[1] = new jz5.l("comment_scene", java.lang.Integer.valueOf(activityC14115xff3e44d.getIntent().getIntExtra("key_to_comment_scene", 0)));
            lVarArr[2] = new jz5.l("finder_tab_context_id", activityC14115xff3e44d.getIntent().getStringExtra("key_click_tab_context_id"));
            lVarArr[3] = new jz5.l("finder_context_id", activityC14115xff3e44d.getIntent().getStringExtra("key_context_id"));
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14115xff3e44d.E;
            lVarArr[4] = new jz5.l("click_expand_type", java.lang.Integer.valueOf(activityC14115xff3e44d.f252207e.isGroupExpanded(activityC14115xff3e44d.f252217r.i(3)) ? 2 : 1));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
        }
        super.p(i17, i18);
        return true;
    }
}
