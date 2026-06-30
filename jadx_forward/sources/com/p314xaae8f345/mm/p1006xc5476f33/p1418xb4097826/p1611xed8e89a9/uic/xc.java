package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class xc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f6 {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f205886e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f205887f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f205888g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f205889h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f205890i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f205891m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f205892n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f205893o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f205894p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f205895q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f205886e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.nc(this));
        this.f205887f = new java.util.HashMap();
        this.f205888g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.oc(this));
        ae2.in inVar = ae2.in.f85221a;
        this.f205889h = ((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.p314xaae8f345.mm.ui.bk.A();
        this.f205895q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pc(this);
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar, java.lang.String str, android.content.Context context) {
        xcVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[7];
        int i17 = 0;
        lVarArr[0] = new jz5.l("view_id", "profile_post_acionsheet_camera");
        lVarArr[1] = new jz5.l("behaviour_session_id", V6 != null ? V6.m75945x2fec8307(0) : null);
        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr[5] = new jz5.l("parententerscene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(8)) : null);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfileActionSheetPublish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfileActionSheetPublish");
        if (I0 != null && L0 != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
            i17 = 1;
        }
        lVarArr[6] = new jz5.l("is_red_dot", java.lang.Integer.valueOf(i17));
        ((cy1.a) rVar).Ej(str, kz5.c1.k(lVarArr), 25496);
    }

    public final void P6() {
        if (hz2.d.f367846a.a("post")) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        java.lang.String str = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        int R6 = R6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        boolean z17 = false;
        p2Var.W(p2Var.i(context, R6, false));
        p2Var.R(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(8) : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76422xc18e3d60(m75939xb282bd08);
        }
        p2Var.D(context, false, R6);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((sr2.l5) pf5.z.f435481a.a(activity).a(sr2.l5.class)).Q6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.jc(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.kc(this))) {
            p2Var.T(str, null);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
                bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                int R62 = R6();
                ((b92.u2) vVar).getClass();
                us2.u.n(R62, false);
                ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePagePostingButton", R6, 0, str, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_finder_post_router", 2);
                intent.putExtra("key_finder_post_from", 1);
                intent.putExtra("key_finder_post_id", str);
                intent.putExtra("KEY_FINDER_USERNAME_SELF", m58755x6c03c64c());
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(m80379x76847179(), intent, 132, 10);
                intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(m158354x19263085(), intent);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 fj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).fj(context, m58755x6c03c64c(), R6());
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
            if (I0 != null && L0 != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
                z17 = true;
            }
            if (z17) {
                r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
                if (I02 != null && L02 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("3", L02, I02, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            fj6.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.qc(this, context, z17);
            fj6.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.rc(this, context, str);
            fj6.f293387d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.sc.f205746d;
            fj6.v();
        }
    }

    public final void Q6() {
        boolean z17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        sr2.l5 l5Var = (sr2.l5) pf5.z.f435481a.a(activity).a(sr2.l5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.lc lcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.lc(this);
        l5Var.getClass();
        l5Var.f493161h = lcVar;
        if (l5Var.f493157d != null) {
            z17 = true;
        } else {
            l5Var.P6();
            z17 = false;
        }
        if (z17) {
            zy2.m8 m8Var = (zy2.m8) ((jz5.n) this.f205888g).mo141623x754a37bb();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 2);
            ((im2.p4) m8Var).R6(intent);
        }
    }

    public final int R6() {
        return s92.c.f486525a.a(null, 5) ? 9 : 2;
    }

    public final void S6(android.content.Context context, android.view.View view, java.lang.String str, boolean z17, ly1.a aVar) {
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(view, str);
        aVar2.ik(view, 40, 25496);
        aVar2.ok(view, 300L);
        if (z17) {
            aVar2.Tj(view, 40, 1, false);
        }
        long longExtra = m158359x1e885992().getLongExtra("key_ref_feed_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_ref_feed_dup_flag");
        int intExtra = m158359x1e885992().getIntExtra("key_ref_comment_scene", 0);
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, stringExtra, intExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        aVar2.Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.mc(nyVar != null ? nyVar.V6() : null, longExtra, intExtra, ek6));
        if (aVar != null) {
            aVar2.Ai(view, aVar);
        }
    }

    public final void T6(int i17) {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        jz5.g gVar = this.f205888g;
        zy2.zb.qd(zbVar, i17, ((im2.p4) ((zy2.m8) ((jz5.n) gVar).mo141623x754a37bb())).f374030q.f544542b, ((im2.p4) ((zy2.m8) ((jz5.n) gVar).mo141623x754a37bb())).f374030q.f544543c, null, 8, null);
    }

    /* renamed from: getUsername */
    public final java.lang.String m58755x6c03c64c() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58743x6c03c64c();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209438r0).mo141623x754a37bb()).r()).intValue() == 1;
        if ((!r26.n0.N(m58755x6c03c64c())) && g92.b.f351302e.G2(m58755x6c03c64c())) {
            z17 = true;
        }
        if (g92.b.f351302e.v(m58755x6c03c64c()) && z18 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfilePostUIC", "MaasCamTemplatePreload - preloadCameraTemplateListAndDownloadFirst");
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).cj(R6());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f205886e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.nc(this));
        this.f205887f = new java.util.HashMap();
        this.f205888g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.oc(this));
        ae2.in inVar = ae2.in.f85221a;
        this.f205889h = ((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.p314xaae8f345.mm.ui.bk.A();
        this.f205895q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pc(this);
    }
}
