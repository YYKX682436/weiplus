package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f206047b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f206048c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f206049d;

    public d2(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206046a = activity;
        this.f206047b = z17;
        this.f206048c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.c2(header));
        this.f206049d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.b2(this);
    }

    public final vb2.f0 a() {
        return (vb2.f0) ((jz5.n) this.f206048c).mo141623x754a37bb();
    }

    public final void b(java.lang.String authorFinderUsername) {
        android.widget.FrameLayout finderProfileMemberBtn;
        android.widget.TextView finderProfileMemberBtnTv;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(authorFinderUsername);
        r45.vr0 vr0Var = l2Var != null ? l2Var.f205465u : null;
        if (a().f516093d0.getVisibility() != 0) {
            a().O.f516144b.setVisibility(8);
            finderProfileMemberBtn = a().P.f516144b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileMemberBtn, "finderProfileMemberBtn");
            finderProfileMemberBtnTv = a().P.f516146d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileMemberBtnTv, "finderProfileMemberBtnTv");
        } else {
            a().P.f516144b.setVisibility(8);
            finderProfileMemberBtn = a().O.f516144b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileMemberBtn, "finderProfileMemberBtn");
            finderProfileMemberBtnTv = a().O.f516146d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileMemberBtnTv, "finderProfileMemberBtnTv");
            a().O.f516145c.setVisibility(8);
        }
        if (vr0Var == null) {
            finderProfileMemberBtn.setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeaderMemberWidget", "memberStatus %d visitorStatus %d", java.lang.Integer.valueOf(vr0Var.f469987d), java.lang.Integer.valueOf(vr0Var.f469988e));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(finderProfileMemberBtn, "member_zone");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(finderProfileMemberBtn, 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("finder_username", authorFinderUsername);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f206046a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(activityC0065xcd7aa112);
        lVarArr[1] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(activityC0065xcd7aa112);
        lVarArr[2] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(activityC0065xcd7aa112);
        lVarArr[3] = new jz5.l("behaviour_session_id", e19 != null ? e19.f216918q : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(activityC0065xcd7aa112);
        lVarArr[4] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f216913n) : null);
        ((cy1.a) rVar).gk(finderProfileMemberBtn, kz5.c1.k(lVarArr));
        int i17 = vr0Var.f469987d;
        if (i17 != 1 && i17 != 2) {
            finderProfileMemberBtn.setVisibility(8);
            return;
        }
        finderProfileMemberBtn.setVisibility(0);
        if (vr0Var.f469988e == 2 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(authorFinderUsername, xy2.c.e(activityC0065xcd7aa112))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
            pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186906k, activityC0065xcd7aa112, this.f206049d);
        }
        com.p314xaae8f345.mm.ui.bk.r0(finderProfileMemberBtnTv.getPaint(), 0.8f);
        finderProfileMemberBtn.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.a2(this, vr0Var, authorFinderUsername));
    }
}
