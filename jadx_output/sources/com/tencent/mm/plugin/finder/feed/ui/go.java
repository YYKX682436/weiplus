package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class go extends zd4.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26 f110095b;

    public go(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26 occupyFinderUI26) {
        this.f110095b = occupyFinderUI26;
    }

    @Override // zd4.o
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zd4.q(2, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.f493216jc1));
        arrayList.add(new zd4.q(2, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.jbk));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new zd4.q(3, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.ltp));
        arrayList2.add(new zd4.q(3, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.f490386tj));
        arrayList2.add(new zd4.q(3, 2, com.tencent.mm.R.string.ltf, com.tencent.mm.R.string.ltg));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kz5.p0 p0Var = kz5.p0.f313996d;
        arrayList3.add(new zd4.r(0, com.tencent.mm.R.string.ltj, com.tencent.mm.R.string.ltm, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(2, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jbk, arrayList, null, null, 48, null));
        arrayList3.add(new zd4.r(3, com.tencent.mm.R.string.lth, com.tencent.mm.R.string.lti, arrayList2, null, null, 48, null));
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128059zb).getValue()).r()).intValue() == 1) {
            arrayList3.add(new zd4.r(6, com.tencent.mm.R.string.mhs, com.tencent.mm.R.string.mht, p0Var, null, null, 48, null));
        }
        arrayList3.add(new zd4.r(1, com.tencent.mm.R.string.ltk, com.tencent.mm.R.string.ltl, p0Var, null, null, 48, null));
        return arrayList3;
    }

    @Override // zd4.o
    public boolean p(int i17, int i18) {
        if (i18 == 3) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("view_id", "public_but_not_recommended");
            com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26 occupyFinderUI26 = this.f110095b;
            lVarArr[1] = new jz5.l("comment_scene", java.lang.Integer.valueOf(occupyFinderUI26.getIntent().getIntExtra("key_to_comment_scene", 0)));
            lVarArr[2] = new jz5.l("finder_tab_context_id", occupyFinderUI26.getIntent().getStringExtra("key_click_tab_context_id"));
            lVarArr[3] = new jz5.l("finder_context_id", occupyFinderUI26.getIntent().getStringExtra("key_context_id"));
            int i19 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26.E;
            lVarArr[4] = new jz5.l("click_expand_type", java.lang.Integer.valueOf(occupyFinderUI26.f170674e.isGroupExpanded(occupyFinderUI26.f170684r.i(3)) ? 2 : 1));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
        }
        super.p(i17, i18);
        return true;
    }
}
