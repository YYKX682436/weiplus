package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class d2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 f154133d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 activityC11346x37ff56a6) {
        this.f154133d = activityC11346x37ff56a6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAABeforeUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof i61.p) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 activityC11346x37ff56a6 = this.f154133d;
            android.app.Dialog dialog = activityC11346x37ff56a6.f154008d;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6.O6(activityC11346x37ff56a6, false);
                db5.e1.T(activityC11346x37ff56a6, str);
                activityC11346x37ff56a6.finish();
                return;
            }
            r45.lh5 lh5Var = ((i61.p) m1Var).f370466s;
            if (lh5Var == null) {
                lh5Var = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAABeforeUI", "NetSceneNewAAQueryPFInfo retcode:%s retmsg:%s", java.lang.Integer.valueOf(lh5Var.f461017d), lh5Var.f461018e);
            if (lh5Var.f461017d != 0) {
                db5.e1.y(activityC11346x37ff56a6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lh5Var.f461018e) ? activityC11346x37ff56a6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573914ga1) : lh5Var.f461018e, "", activityC11346x37ff56a6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ga_), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c2(this));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enter_scene", 6);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11336x34865b36 c11336x34865b36 = new com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11336x34865b36();
            c11336x34865b36.f153948d = lh5Var.f461019f;
            c11336x34865b36.f153949e = lh5Var.f461020g;
            java.util.Iterator it = lh5Var.f461021h.iterator();
            while (it.hasNext()) {
                r45.o oVar = (r45.o) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8 c11334x8cc8d4b8 = new com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8();
                c11334x8cc8d4b8.f153939d = oVar.f463317d;
                c11334x8cc8d4b8.f153940e = oVar.f463318e;
                c11336x34865b36.f153950f.add(c11334x8cc8d4b8);
            }
            c11336x34865b36.f153951g = lh5Var.f461022i;
            c11336x34865b36.f153952h = lh5Var.f461023m;
            if (lh5Var.f461024n != null) {
                c11336x34865b36.f153953i = new com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11337xe5190d0f();
                java.util.Iterator it6 = lh5Var.f461024n.f451963d.iterator();
                while (it6.hasNext()) {
                    c11336x34865b36.f153953i.f153957d.add((java.lang.String) it6.next());
                }
                java.util.Iterator it7 = lh5Var.f461024n.f451964e.iterator();
                while (it7.hasNext()) {
                    c11336x34865b36.f153953i.f153958e.add((java.lang.String) it7.next());
                }
            }
            c11336x34865b36.f153954m = lh5Var.f461025o;
            com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5 c11335xbe84dad5 = new com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5();
            c11336x34865b36.f153955n = c11335xbe84dad5;
            r45.q qVar = lh5Var.f461026p;
            c11335xbe84dad5.f153941d = qVar.f465052d;
            c11335xbe84dad5.f153942e = qVar.f465053e;
            c11335xbe84dad5.f153943f = qVar.f465054f;
            c11335xbe84dad5.f153944g = qVar.f465055g;
            c11335xbe84dad5.f153945h = qVar.f465056h;
            c11335xbe84dad5.f153946i = qVar.f465057i;
            c11335xbe84dad5.f153947m = qVar.f465058m;
            c11336x34865b36.f153956o = lh5Var.f461027q;
            intent.putExtra("pfInfo", c11336x34865b36);
            intent.putExtra("pfOrderNo", activityC11346x37ff56a6.f154009e);
            r45.q qVar2 = lh5Var.f461026p;
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PAYER_NUM_INT, java.lang.Integer.valueOf(qVar2.f465052d));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_RECEIVER_NUM_INT, java.lang.Integer.valueOf(qVar2.f465053e));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, java.lang.Integer.valueOf(qVar2.f465054f));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, java.lang.Long.valueOf(qVar2.f465055g));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, java.lang.Long.valueOf(qVar2.f465056h));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            j45.l.j(activityC11346x37ff56a6, "aa", ".ui.LaunchAAUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6.O6(activityC11346x37ff56a6, false);
            activityC11346x37ff56a6.finish();
        }
    }
}
