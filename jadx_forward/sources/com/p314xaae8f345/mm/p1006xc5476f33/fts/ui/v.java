package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class v implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219731d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219731d = activityC15588x58c11aee;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.d().q(106, this);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f219402p1;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee = this.f219731d;
        activityC15588x58c11aee.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m(activityC15588x58c11aee));
        tg3.r1 r1Var = (tg3.r1) m1Var;
        activityC15588x58c11aee.V = r1Var.H();
        com.p314xaae8f345.mm.p944x882e457a.o oVar = r1Var.f500747e;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
            r45.hw5 hw5Var = (r45.hw5) fVar;
            r45.hw5 hw5Var2 = (r45.hw5) fVar;
            activityC15588x58c11aee.Y = hw5Var2 != null ? x51.j1.g(hw5Var2.f458049d) : "";
            r45.iw5 iw5Var = activityC15588x58c11aee.V;
            if (iw5Var.D > 0) {
                if (iw5Var.E.isEmpty()) {
                    db5.e1.o(activityC15588x58c11aee, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0, true, null);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("add_more_friend_search_scene", 3);
                if (activityC15588x58c11aee.V.E.size() > 1) {
                    try {
                        intent.putExtra("result", activityC15588x58c11aee.V.mo14344x5f01b1f6());
                        j45.l.j(activityC15588x58c11aee.mo55332x76847179(), "subapp", ".ui.pluginapp.ContactSearchResultUI", intent, null);
                        return;
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAddFriendUI", e17, "", new java.lang.Object[0]);
                        return;
                    }
                }
                ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, (r45.gw5) activityC15588x58c11aee.V.E.getFirst(), activityC15588x58c11aee.f219417y0);
            }
            activityC15588x58c11aee.W = 1;
            int i27 = hw5Var.f458054i;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302 c5197x39c61302 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302();
            am.v0 v0Var = c5197x39c61302.f135538g;
            v0Var.f89684a = activityC15588x58c11aee;
            v0Var.f89685b = 16;
            v0Var.f89686c = activityC15588x58c11aee.f219443n;
            v0Var.f89689f = activityC15588x58c11aee.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ics);
            v0Var.f89687d = 1L;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l(activityC15588x58c11aee, c5197x39c61302, i27);
            v0Var.f89690g = lVar;
            v0Var.f89688e = 1;
            if (!c5197x39c61302.e()) {
                c5197x39c61302.f135539h.f89777a = false;
                lVar.run();
            }
        } else {
            if (i18 == -24) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    activityC15588x58c11aee.C.setText(b17.f501932b);
                } else {
                    activityC15588x58c11aee.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
                }
            } else if (i18 != -4) {
                activityC15588x58c11aee.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
            } else if (i17 == 4) {
                activityC15588x58c11aee.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
            } else {
                activityC15588x58c11aee.C.setText(activityC15588x58c11aee.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icn));
            }
            activityC15588x58c11aee.W = -1;
            activityC15588x58c11aee.X = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f7(activityC15588x58c11aee, ((r45.hw5) oVar.f152243a.f152217a).f458054i);
    }
}
