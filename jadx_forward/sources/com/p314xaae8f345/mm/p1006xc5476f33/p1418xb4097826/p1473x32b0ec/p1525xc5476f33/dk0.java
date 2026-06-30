package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class dk0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements io0.a {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f193832p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        root.getContext();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.icy);
        ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById).m46529x742f459a(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f193832p = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        int i17 = cVar != null ? cVar.f536066c : 0;
        if (i17 == 2 || i17 == 3 || i17 == 8) {
            this.f193832p.getRenderRatioLayout().setBackgroundColor(this.f446856d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560610pf));
        } else {
            this.f193832p.getRenderRatioLayout().setBackground(null);
        }
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) it.next()).f390703a, ((mm2.c1) P0(mm2.c1.class)).m8())) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
    }

    @Override // qo0.a
    public void J0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveVisitorPreviewPlugin", "setVisible " + i17, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
            o4Var.A.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bk0(this));
            return;
        }
        if (ordinal != 8) {
            if (ordinal == 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "switchCamera");
                co0.s u17 = u1();
                if (u17 != null) {
                    hn0.h.h(u17, 0, null, 3, null);
                    return;
                }
                return;
            }
            if (ordinal == 16) {
                if (bundle != null) {
                    bundle.getBoolean("PARAM_HANGUP_SELF", false);
                }
                co0.s u18 = u1();
                if (u18 != null) {
                    u18.j1();
                }
                dk2.ef.f314905a.W();
                return;
            }
            if (ordinal != 27 && ordinal != 28) {
                if (ordinal == 45) {
                    co0.s u19 = u1();
                    if (u19 != null) {
                        u19.j1();
                        return;
                    }
                    return;
                }
                if (ordinal != 46) {
                    return;
                }
                K0(0);
                v1();
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = this.f193832p.renderRatioLayout;
                c10844x4ce18327.getClass();
                c10844x4ce18327.f150109o.d(false);
                co0.s u110 = u1();
                if (u110 != null) {
                    kn0.p pVar = u110.D;
                    pVar.getClass();
                    pVar.f391116c = kn0.j.f391097f;
                    android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80602xaca7263b);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
                    hn0.h.i(u110, pm0.v.o(drawable, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280, android.graphics.Bitmap.Config.ARGB_8888), 0, 2, null);
                    vn0.e eVar = u110.f502297m;
                    if (eVar != null) {
                        eVar.i(false);
                    }
                    u110.d0(false);
                    u110.c0(false);
                    u110.n();
                    return;
                }
                return;
            }
        }
        t1();
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // io0.a
    /* renamed from: getSelfUserId */
    public java.lang.String mo56927xa888f8a8() {
        java.lang.String m86 = ((mm2.c1) P0(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        co0.s u17 = u1();
        if (u17 != null) {
            u17.F(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zj0());
        }
    }

    public final co0.s u1() {
        return co0.b.f125242e2.c(V0().f390662d.f150070e);
    }

    public final void v1() {
        hn0.f fVar;
        hn0.f fVar2;
        hn0.f fVar3;
        java.lang.Object obj;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "visitor startPreview");
        ko0.l0 l0Var = ko0.l0.f391411a;
        dk2.ug ugVar = dk2.ug.f315751a;
        l0Var.c(dk2.ug.f315752b);
        ugVar.c(l0Var.b());
        co0.s u17 = u1();
        if (u17 != null && (fVar3 = u17.f502306t) != null) {
            lo0.k0 k0Var = l0Var.b().f401596d;
            if (k0Var.f401569b) {
                java.util.List<lo0.h0> list = k0Var.f401573f;
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((lo0.h0) obj).f401535f) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                lo0.h0 h0Var = (lo0.h0) obj;
                if (h0Var == null || (str = h0Var.f401533d) == null) {
                    str = "";
                }
                hn0.p pVar = (hn0.p) fVar3;
                pVar.b();
                pVar.f363933b.l(new hn0.n(pVar, k0Var.f401572e, str));
                for (lo0.h0 h0Var2 : list) {
                    pVar.f(h0Var2.f401534e, h0Var2.f401539j);
                }
                if (h0Var != null) {
                    hn0.f.a(fVar3, h0Var.f401539j, false, false, 4, null);
                }
            }
        }
        co0.s u18 = u1();
        if (u18 != null && (fVar2 = u18.f502306t) != null) {
            ((hn0.p) fVar2).i(dk2.ef.f314905a.F());
        }
        co0.s u19 = u1();
        if (u19 != null && (fVar = u19.f502306t) != null) {
            ((hn0.p) fVar).j(dk2.ef.f314905a.G());
        }
        co0.s u110 = u1();
        if (u110 != null) {
            hn0.h.b(u110, this.f193832p, ko0.c0.f391358a.b().f401529e, 0, 4, null);
        }
    }

    public final void w1() {
        kn0.p pVar;
        co0.s u17 = u1();
        if (u17 != null) {
            u17.f502307u = this.f193832p;
        }
        co0.s u18 = u1();
        if (u18 != null) {
            co0.s u19 = u1();
            u18.P0((u19 == null || (pVar = u19.D) == null) ? null : pVar.f391119f);
        }
    }
}
