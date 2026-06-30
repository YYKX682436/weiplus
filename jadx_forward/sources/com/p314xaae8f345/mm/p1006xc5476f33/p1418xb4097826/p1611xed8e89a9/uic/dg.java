package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class dg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.i f205163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(zx2.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        super(0);
        this.f205163d = iVar;
        this.f205164e = c14900x9bf524dd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabSelected, tab: ");
        zx2.i iVar = this.f205163d;
        sb6.append(iVar);
        sb6.append(", tabType: ");
        boolean z17 = iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re reVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) iVar : null;
        sb6.append(reVar != null ? java.lang.Integer.valueOf(reVar.f205719k) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re reVar2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) iVar : null;
        if (reVar2 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onTabSelected, tabType: ");
            int i17 = reVar2.f205719k;
            sb7.append(i17);
            sb7.append(", tabName: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205164e;
            sb7.append(c14900x9bf524dd.E7(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", sb7.toString());
            android.app.Activity context = c14900x9bf524dd.m80379x76847179();
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) iVar).f205719k;
            int i19 = i18 != 1 ? i18 != 2 ? 0 : 11 : 10;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae) context.findViewById(com.p314xaae8f345.mm.R.id.fz8);
            if (c15304x8ca13bae != null) {
                c15304x8ca13bae.setTag(com.p314xaae8f345.mm.R.id.rld, java.lang.Integer.valueOf(i19));
                if (i19 != 10 && i19 != 11) {
                    c15304x8ca13bae.setVisibility(4);
                }
            }
            java.util.Iterator it = c14900x9bf524dd.Y6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC15124x7bae6180 = null;
                    break;
                }
                abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) it.next();
                if (abstractC15124x7bae6180.f210798p == i17) {
                    break;
                }
            }
            if (!(!(abstractC15124x7bae6180 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14888x2544d1c2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkTabFragment, tabType: " + i17);
                switch (i17) {
                    case 1:
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ef(c14900x9bf524dd));
                        break;
                    case 2:
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ag(c14900x9bf524dd));
                        break;
                    case 4:
                        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                            c14900x9bf524dd.I7(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14894x707e4ba());
                            break;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkLiveTab return for teenMode!");
                            break;
                        }
                    case 5:
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xf(c14900x9bf524dd));
                        break;
                    case 6:
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.zf(c14900x9bf524dd));
                        break;
                    case 7:
                        android.app.Activity context2 = c14900x9bf524dd.m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        pf5.z zVar = pf5.z.f435481a;
                        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
                        if (p2Var != null) {
                            p2Var.O6(8460, 3, 7);
                        }
                        gm0.j1.d().a(8460, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.vf(c14900x9bf524dd));
                        c14900x9bf524dd.B7();
                        break;
                    case 9:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkEmojiFragment start");
                        if (c14900x9bf524dd.G7()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkEmojiFragment enable");
                            pf5.e.m158343xd39de650(c14900x9bf524dd, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.kf(c14900x9bf524dd, null), 3, null);
                            break;
                        }
                        break;
                    case 10:
                        android.app.Activity context3 = c14900x9bf524dd.m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                        pf5.z zVar2 = pf5.z.f435481a;
                        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
                        if (p2Var2 != null) {
                            p2Var2.O6(10923, 8, 10);
                        }
                        pf5.e.m158343xd39de650(c14900x9bf524dd, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.uf(c14900x9bf524dd, null), 3, null);
                        break;
                    case 12:
                        c14900x9bf524dd.z7();
                        break;
                    case 14:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ac).mo141623x754a37bb()).r()).intValue() == 1) {
                            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                                i95.m c17 = i95.n0.c(cq.k.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                java.lang.String finderUsername = c14900x9bf524dd.F7();
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14900x9bf524dd.m158354x19263085();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.gf gfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.gf(c14900x9bf524dd);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.hf hfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.hf.f205302d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
                                new bq.n(finderUsername, null, V6, 0).l().q(new cq.x(gfVar, finderUsername, hfVar));
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab isTeenMode!");
                                break;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab unSupport course tab!");
                            break;
                        }
                    case 15:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ac).mo141623x754a37bb()).r()).intValue() == 1) {
                            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                                i95.m c18 = i95.n0.c(cq.k.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                                java.lang.String finderUsername2 = c14900x9bf524dd.F7();
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c14900x9bf524dd.m158354x19263085();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                                r45.qt2 V62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pf pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pf(c14900x9bf524dd);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.qf qfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.qf.f205692d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername2, "finderUsername");
                                new bq.f1(finderUsername2, null, V62, 0).l().q(new cq.j0(pfVar, finderUsername2, qfVar));
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab isTeenMode!");
                                break;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab unSupport paidCollection tab!");
                            break;
                        }
                    case 16:
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = c14900x9bf524dd.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                        r45.qt2 V63 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                        i95.m c19 = i95.n0.c(cq.k.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        java.lang.String finderUsername3 = c14900x9bf524dd.F7();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.lf lfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.lf(c14900x9bf524dd);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.mf mfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.mf(c14900x9bf524dd);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername3, "finderUsername");
                        pm0.v.T(new bq.d1(V63, finderUsername3, 0, null).l(), new cq.c1(lfVar, mfVar));
                        break;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
