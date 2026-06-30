package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class th0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f195935p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 f195936q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f195937r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj f195938s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f195939t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f195940u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195935p = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f195940u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sh0(root, this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var) {
        java.lang.String str;
        th0Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409153p, null, null, 6, null);
        android.content.Intent intent = new android.content.Intent();
        r45.eq1 eq1Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f410812g;
        if (eq1Var == null || (str = eq1Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(th0Var.f446856d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 fromScene) {
        dk2.xf W0;
        dm.o4 o4Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f410815m;
        jz5.f0 f0Var = null;
        ce2.i iVar = o4Var instanceof ce2.i ? (ce2.i) o4Var : null;
        android.view.ViewGroup viewGroup = th0Var.f446856d;
        if (iVar != null) {
            if (th0Var.f195937r == null) {
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg(context);
                ggVar.m58041xde046e2c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nh0(th0Var));
                ggVar.m58040x37029931(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oh0(th0Var));
                ggVar.a(th0Var);
                th0Var.f195937r = ggVar;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar2 = th0Var.f195937r;
            if (ggVar2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", "show fromScene:" + fromScene + ",payGift:" + iVar.f67809x225f1eb0);
                ggVar2.f199975w = iVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dh0 dh0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193948e;
                ggVar2.f199976x = fromScene;
                ggVar2.f199973u = false;
                if (fromScene != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193953m && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.T == 9) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.S = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.T = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.U = "";
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.V = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resetLastGameTeamClick, from:".concat("FansWidgetShow"));
                }
                ggVar2.f199969q.setText(java.lang.String.valueOf((int) iVar.P0()));
                ggVar2.f199970r.setText(ggVar2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddv, iVar.f67809x225f1eb0));
                wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(iVar.f67819x7194d06c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                android.widget.ImageView giftImage = ggVar2.f199971s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftImage, "giftImage");
                ((wo0.b) a17).c(giftImage);
                ggVar2.f199972t.setText(iVar.f67809x225f1eb0);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = ggVar2.m58104xb7f4f95a();
                if (m58104xb7f4f95a != null && (W0 = m58104xb7f4f95a.W0()) != null) {
                    ((dk2.r4) W0).T(currentTimeMillis, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fg(currentTimeMillis, ggVar2));
                }
                android.view.View view = ggVar2.f199966n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io(view.getContext());
                zl2.r4.f555483a.Q2(view);
                ioVar.k(view);
                ioVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8l);
                ioVar.s();
                ggVar2.f199965m = ioVar;
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409151n, null, fromScene, 2, null);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddu), 0).show();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            O0();
            return;
        }
        if (ordinal != 223) {
            return;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "青少年模式不展示粉丝");
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r4Var.f3(context, "青少年模式不展示粉丝");
            return;
        }
        if (!((mm2.n2) P0(mm2.n2.class)).f410811f) {
            v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193949f);
            return;
        }
        x1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj ajVar = this.f195938s;
        if (ajVar != null) {
            ajVar.c(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f195937r;
        if (ggVar != null) {
            ggVar.f200701f = null;
            ggVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj ajVar = this.f195938s;
        if (ajVar != null) {
            ajVar.f200701f = null;
            ajVar.b();
            ajVar.f199309r.m81307xf9cef5a7(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f195939t;
        if (bhVar != null) {
            bhVar.i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = this.f195936q;
        if (h1Var != null) {
            h1Var.f200701f = null;
            h1Var.d();
            h1Var.f200031r = null;
            h1Var.f200027n = null;
            h1Var.f200029p = null;
            h1Var.f200032s = false;
            h1Var.f200035v = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bw bwVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bw) ((jz5.n) this.f195940u).mo141623x754a37bb();
        if (bwVar != null) {
            bwVar.a();
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f195935p, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void h1(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var;
        r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f410812g;
        if (eq1Var != null && eq1Var.m75933x41a8a7f2(4)) {
            r45.eq1 eq1Var2 = ((mm2.n2) P0(mm2.n2.class)).f410812g;
            if (eq1Var2 != null && eq1Var2.m75933x41a8a7f2(1)) {
                w1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = this.f195936q;
                if (h1Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f200024h, "followSuccess tryFollowing:" + h1Var.f200036w + ",isFollow:" + z17);
                    if (z17 && h1Var.f200036w) {
                        h1Var.f200036w = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = h1Var.m58104xb7f4f95a();
                        if (m58104xb7f4f95a != null && (nd0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0) m58104xb7f4f95a.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.class)) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.B1(nd0Var, false, 1, null);
                        }
                        h1Var.c();
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 eh0Var;
        jz5.f0 f0Var = null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null, "PORTRAIT_ACTION_JOIN_FANS_CLUB") || a1()) {
            return;
        }
        android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
        if (bundle2 != null) {
            boolean z17 = bundle2.getBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dh0 dh0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193948e;
            int i17 = bundle2.getInt("JOIN_FANS_CLUB_FROM_SCENE", 0);
            dh0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0[] m56938xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.m56938xcee59d22();
            int length = m56938xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    eh0Var = null;
                    break;
                }
                eh0Var = m56938xcee59d22[i18];
                if (eh0Var.f193956d == i17) {
                    break;
                } else {
                    i18++;
                }
            }
            if (eh0Var == null) {
                eh0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193949f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction needPurcase:" + z17 + ",fromScene:" + eh0Var);
            w1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = this.f195936q;
            if (h1Var != null) {
                h1Var.e(S0(), z17, eh0Var);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction extraData:" + obj);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 fromScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "checkFansClubState fromScene:" + fromScene + ", isActivate:" + p3325xe03a0797.p3326xc267989b.z0.h(this.f195935p));
        p3325xe03a0797.p3326xc267989b.l.d(this.f195935p, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gh0(this, fromScene, null), 3, null);
    }

    public final void w1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 pfVar;
        if (this.f195936q == null) {
            r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f410812g;
            boolean z17 = false;
            if (eq1Var != null && eq1Var.m75933x41a8a7f2(10)) {
                z17 = true;
            }
            boolean z18 = ((mm2.n2) P0(mm2.n2.class)).f410814i;
            android.view.ViewGroup viewGroup = this.f446856d;
            if (!z17 || z18) {
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pf(context);
            } else {
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rf(context2);
            }
            pfVar.m58063xcdcd0110(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jh0(this));
            pfVar.m58058xdffb7a89(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh0(this));
            pfVar.m58062x2e146c59(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lh0(this));
            pfVar.m58065x39312118(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mh0(pfVar));
            pfVar.a(this);
            this.f195936q = pfVar;
        }
    }

    public final void x1() {
        if (this.f195938s == null) {
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj ajVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj(context);
            ajVar.m57962xe1dae5e0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ph0(this));
            ajVar.m57961x892f1cff(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh0(this, ajVar));
            ajVar.a(this);
            this.f195938s = ajVar;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f195937r;
        if (ggVar != null) {
            ggVar.a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj ajVar = this.f195938s;
        if (ajVar != null) {
            ajVar.a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f195939t;
        if (bhVar != null) {
            bhVar.a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = this.f195936q;
        if (h1Var != null) {
            h1Var.a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bw bwVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bw) ((jz5.n) this.f195940u).mo141623x754a37bb();
        bwVar.getClass();
        bwVar.f199458i = this;
        if (p3325xe03a0797.p3326xc267989b.z0.h(this.f195935p)) {
            return;
        }
        this.f195935p = p3325xe03a0797.p3326xc267989b.z0.b();
    }
}
