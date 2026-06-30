package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class b5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08 f191229d;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08 activityC13967x88de0e08) {
        this.f191229d = activityC13967x88de0e08;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.n73 n73Var;
        java.lang.String m75945x2fec8307;
        r45.n73 n73Var2;
        r45.n73 n73Var3;
        r45.z53 z53Var;
        java.lang.String str;
        r45.n73 n73Var4;
        r45.z53 z53Var2;
        r45.n73 n73Var5;
        r45.z53 z53Var3;
        r45.n73 n73Var6;
        r45.z53 z53Var4;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08.F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08 activityC13967x88de0e08 = this.f191229d;
        activityC13967x88de0e08.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectPosition ");
        sb6.append(i17);
        sb6.append(", game:");
        java.util.ArrayList arrayList = activityC13967x88de0e08.f190822x;
        cm2.m mVar = (cm2.m) kz5.n0.a0(arrayList, i17);
        sb6.append((mVar == null || (n73Var6 = mVar.f124898d) == null || (z53Var4 = (r45.z53) n73Var6.m75936x14adae67(1)) == null) ? null : z53Var4.m75945x2fec8307(1));
        sb6.append(", ");
        cm2.m mVar2 = (cm2.m) kz5.n0.a0(arrayList, i17);
        sb6.append((mVar2 == null || (n73Var5 = mVar2.f124898d) == null || (z53Var3 = (r45.z53) n73Var5.m75936x14adae67(1)) == null) ? null : z53Var3.m75945x2fec8307(0));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = activityC13967x88de0e08.f190821w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (i17 >= 0 && i17 < arrayList.size()) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (((cm2.m) it.next()).f124899e) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 != i17) {
                cm2.m mVar3 = activityC13967x88de0e08.f190823y;
                if (mVar3 != null) {
                    mVar3.f124899e = false;
                }
                cm2.m mVar4 = (cm2.m) arrayList.get(i17);
                activityC13967x88de0e08.f190823y = mVar4;
                if (mVar4 != null) {
                    mVar4.f124899e = true;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = activityC13967x88de0e08.f7().mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8148xed6e4d18(i17, 1);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = activityC13967x88de0e08.f7().mo7946xf939df19();
                if (mo7946xf939df192 != null) {
                    mo7946xf939df192.m8148xed6e4d18(i19, 1);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_GAME_SELECT_APPID_STRING_SYNC;
                cm2.m mVar5 = activityC13967x88de0e08.f190823y;
                if (mVar5 == null || (n73Var4 = mVar5.f124898d) == null || (z53Var2 = (r45.z53) n73Var4.m75936x14adae67(1)) == null || (str = z53Var2.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                c17.x(u3Var, str);
            }
        }
        cm2.m mVar6 = activityC13967x88de0e08.f190823y;
        boolean z17 = (mVar6 == null || (n73Var3 = mVar6.f124898d) == null || (z53Var = (r45.z53) n73Var3.m75936x14adae67(1)) == null || z53Var.m75939xb282bd08(13) != 1) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
        if (z17) {
            r45.z53 z53Var5 = (r45.z53) mVar6.f124898d.m75936x14adae67(1);
            x2Var.f(2, z53Var5 != null ? z53Var5.m75945x2fec8307(0) : null);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 18) {
            x2Var.b(3);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Finder_Game_Select_Hardcode :");
        ae2.b2 b2Var = ae2.b2.f84994a;
        jz5.g gVar = ae2.b2.f85012m;
        sb8.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
        if (intValue == 1) {
            r45.sw6 sw6Var = (mVar6 == null || (n73Var = mVar6.f124898d) == null) ? null : (r45.sw6) n73Var.m75936x14adae67(0);
            if (sw6Var != null) {
                sw6Var.set(1, 1);
            }
        } else if (intValue == 2) {
            r45.sw6 sw6Var2 = (mVar6 == null || (n73Var2 = mVar6.f124898d) == null) ? null : (r45.sw6) n73Var2.m75936x14adae67(0);
            if (sw6Var2 != null) {
                sw6Var2.set(2, 1);
            }
        }
        if (mVar6 != null) {
            r45.n73 n73Var7 = mVar6.f124898d;
            r45.z53 z53Var6 = (r45.z53) n73Var7.m75936x14adae67(1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z53Var6 != null ? z53Var6.m75945x2fec8307(0) : null) && ((r45.z53) n73Var7.m75936x14adae67(1)) != null) {
                r45.sw6 sw6Var3 = (r45.sw6) n73Var7.m75936x14adae67(0);
                if (!(sw6Var3 != null && sw6Var3.m75939xb282bd08(1) == 1)) {
                    r45.sw6 sw6Var4 = (r45.sw6) n73Var7.m75936x14adae67(0);
                    if (!(sw6Var4 != null && sw6Var4.m75939xb282bd08(2) == 1)) {
                        r45.z53 z53Var7 = (r45.z53) n73Var7.m75936x14adae67(1);
                        ke2.y yVar = new ke2.y((z53Var7 == null || (m75945x2fec8307 = z53Var7.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307, 0, false, null, false, null, 60, null);
                        yVar.t(activityC13967x88de0e08, activityC13967x88de0e08.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
                        pq5.g l17 = yVar.l();
                        l17.f(activityC13967x88de0e08);
                        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h5(activityC13967x88de0e08, mVar6));
                        return;
                    }
                }
                r45.sw6 sw6Var5 = (r45.sw6) n73Var7.m75936x14adae67(0);
                java.lang.String string = sw6Var5 != null && sw6Var5.m75939xb282bd08(1) == 1 ? activityC13967x88de0e08.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4z) : activityC13967x88de0e08.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575186l50);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                db5.e1.A(activityC13967x88de0e08.mo55332x76847179(), string, "", activityC13967x88de0e08.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f5.f191538d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g5.f191608d);
                return;
            }
        }
        db5.t7.m123882x26a183b(activityC13967x88de0e08.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573075dh1, 0).show();
    }
}
