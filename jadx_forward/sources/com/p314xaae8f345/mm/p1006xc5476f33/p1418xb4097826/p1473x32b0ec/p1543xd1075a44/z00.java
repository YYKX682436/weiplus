package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f202023d;

    public z00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f202023d = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        android.view.ViewGroup viewGroup;
        android.view.View view2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f202023d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
        r45.fr1 fr1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
        if (fr1Var != null) {
            if (fr1Var.m75939xb282bd08(10) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "teamup_gift_reddot is 0");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "gameTeamInfo?.reddot_id is %s", fr1Var.m75945x2fec8307(12));
                if (!android.text.TextUtils.isEmpty(fr1Var.m75945x2fec8307(12)) && (str3 = m10Var.M) != null && r26.i0.q(str3, fr1Var.m75945x2fec8307(12), false, 2, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is removed");
                } else if (android.text.TextUtils.isEmpty(fr1Var.m75945x2fec8307(12))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is empty");
                } else {
                    m10Var.M = fr1Var.m75945x2fec8307(12);
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GAME_TEAM_GIFT_REDDOT_ID_STRING_SYNC, fr1Var.m75945x2fec8307(12));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "doFinderLiveGetTeamupGiftPrepare");
                    new db2.d4(((mm2.e1) lVar.P0(mm2.e1.class)).f410516m, ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f410518o), ((mm2.e1) lVar.P0(mm2.e1.class)).f410525v, fr1Var.m75945x2fec8307(12)).l().K(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e00.f199735a);
                }
            }
        }
        android.widget.FrameLayout frameLayout = m10Var.f200550s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        r45.fr1 fr1Var2 = ((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).M2;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Tj(m10Var.i(fr1Var2 != null ? fr1Var2.m75939xb282bd08(10) : 0, 20));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = m10Var.f200534c;
        r45.fr1 fr1Var3 = ((mm2.c1) lVar2.P0(mm2.c1.class)).M2;
        if (fr1Var3 != null) {
            if (fr1Var3.m75939xb282bd08(8) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_status is 0");
            } else if (((r45.z87) fr1Var3.m75936x14adae67(11)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_jump_info is null");
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - m10Var.Q < 200) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "don't click again in 200ms");
                } else {
                    m10Var.Q = currentTimeMillis;
                    java.lang.String obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
                    l81.b1 b1Var = new l81.b1();
                    r45.z87 z87Var = (r45.z87) fr1Var3.m75936x14adae67(11);
                    java.lang.String str4 = "";
                    if (z87Var == null || (str = z87Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    b1Var.f398547b = str;
                    r45.z87 z87Var2 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    if (z87Var2 == null || (str2 = z87Var2.m75945x2fec8307(1)) == null) {
                        str2 = "";
                    }
                    b1Var.f398555f = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qz qzVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qz();
                    r45.z87 z87Var3 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    if (z87Var3 != null && (m75934xbce7f2f2 = z87Var3.m75934xbce7f2f(3)) != null) {
                        str4 = m75934xbce7f2f2.i();
                    }
                    qzVar.f201095d = str4;
                    b1Var.f398561i = qzVar;
                    b1Var.f398565k = 1177;
                    r45.z87 z87Var4 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    b1Var.f398549c = z87Var4 != null ? z87Var4.m75939xb282bd08(2) : 0;
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    if (r4Var.t0() != 0) {
                        b1Var.f398549c = r4Var.t0();
                    }
                    b1Var.f398567l = ":" + ((mm2.e1) lVar2.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).f410385o + "::" + ((mm2.c1) lVar2.P0(mm2.c1.class)).f410394p2 + ':' + obj + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).P3 + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).f410324d3;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
                    int i17 = -1;
                    int height = (y1Var == null || (view2 = y1Var.f293560f) == null) ? -1 : view2.getHeight();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = m10Var.f200546o;
                    if (y1Var2 != null && (viewGroup = y1Var2.B) != null) {
                        i17 = viewGroup.getWidth();
                    }
                    int i18 = i17;
                    k91.s2 s2Var = k91.s2.f387294e;
                    android.view.ViewGroup viewGroup2 = m10Var.f200532a;
                    b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, height, s2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(i65.a.f(viewGroup2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false, 24, null), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(viewGroup2.getContext().getClass().getName(), lVar2.x0() ? s2Var : k91.s2.f387293d), k91.t2.f387301f, false, false, null, k91.y2.f387361e, false, true, null, false, 0, null, 0, height, i18, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -9976800, 2047, null);
                    b1Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h00(m10Var);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId:");
                    r45.z87 z87Var5 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    sb6.append(z87Var5 != null ? z87Var5.m75945x2fec8307(0) : null);
                    sb6.append(", path:");
                    r45.z87 z87Var6 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    sb6.append(z87Var6 != null ? z87Var6.m75945x2fec8307(1) : null);
                    sb6.append(", extraData:");
                    r45.z87 z87Var7 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    sb6.append((z87Var7 == null || (m75934xbce7f2f = z87Var7.m75934xbce7f2f(3)) == null) ? null : m75934xbce7f2f.i());
                    sb6.append(", version:");
                    r45.z87 z87Var8 = (r45.z87) fr1Var3.m75936x14adae67(11);
                    sb6.append(z87Var8 != null ? java.lang.Integer.valueOf(z87Var8.m75939xb282bd08(2)) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    l81.p0 p0Var = b1Var.f398561i;
                    objArr[0] = p0Var != null ? p0Var.toString() : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram nativeExtraData:%s", objArr);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(viewGroup2.getContext(), b1Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram by launchCommon2");
                    m10Var.N = b1Var;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
