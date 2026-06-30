package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes2.dex */
public final class i implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t f211198d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar) {
        this.f211198d = tVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.Object obj2;
        r45.bi2 req = (r45.bi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar = this.f211198d;
        tVar.f211224n.b();
        if (ret.m75939xb282bd08(1) != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = tVar.f211223m;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, false));
            android.app.Activity m80379x76847179 = tVar.m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.f293309c = tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eo9);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var.c();
            return;
        }
        boolean z17 = req.m75939xb282bd08(0) == 2;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        if (tVar.f211234x) {
            tVar.S6();
            tVar.f211234x = false;
        } else {
            java.util.ArrayList arrayList = tVar.f211226p;
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e) it.next()).f211191d.m75933x41a8a7f2(3)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 != -1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e) arrayList.get(i18)).f211191d.set(2, java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tVar.f211225o;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                c22848x6ddd90cf.m8147xed6e4d18(i18);
            }
        }
        if (req.m75939xb282bd08(0) == 1) {
            android.app.Activity m80379x768471792 = tVar.m80379x76847179();
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x768471792);
            e4Var2.f293309c = tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.njw);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var2.c();
        } else {
            android.app.Activity m80379x768471793 = tVar.m80379x76847179();
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x768471793);
            e4Var3.f293309c = tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.njx);
            e4Var3.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var3.c();
        }
        java.util.Iterator it6 = ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).f534717q.entrySet().iterator();
        while (it6.hasNext()) {
            p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) ((java.util.Map.Entry) it6.next()).getValue();
            r45.fm2 fm2Var = (r45.fm2) j0Var.mo3195x754a37bb();
            if (fm2Var != null) {
                java.util.LinkedList m75941xfb821914 = fm2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getHelp_promotion_infos(...)");
                java.util.Iterator it7 = m75941xfb821914.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it7.next();
                        if (((r45.eb1) obj2).m75933x41a8a7f2(3)) {
                            break;
                        }
                    }
                }
                r45.eb1 eb1Var = (r45.eb1) obj2;
                if (eb1Var != null) {
                    eb1Var.set(2, java.lang.Boolean.valueOf(z17));
                    j0Var.mo7808x76db6cb1(fm2Var);
                }
            }
        }
    }
}
