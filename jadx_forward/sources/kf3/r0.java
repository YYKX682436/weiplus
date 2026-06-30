package kf3;

/* loaded from: classes12.dex */
public class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.s0 f388955d;

    public r0(kf3.s0 s0Var) {
        this.f388955d = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            kf3.s0 s0Var = this.f388955d;
            if3.y yVar = (if3.y) s0Var.f388961e.f230061f.getItem(s0Var.f388960d);
            if (yVar == null) {
                return;
            }
            java.lang.String c17 = yVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = s0Var.f388961e;
            if (c17.equals(activityC16486x3260b8cc.f230061f.f388911q)) {
                activityC16486x3260b8cc.U6();
            }
            if3.z Ai = if3.k0.Ai();
            java.lang.String c18 = yVar.c();
            l75.k0 k0Var = Ai.f372765d;
            android.database.Cursor B = k0Var.B("select * from massendinfo ORDER BY createtime DESC  limit 2", null);
            if (B != null) {
                if (B.getCount() == 0) {
                    B.close();
                } else if (B.getCount() == 1) {
                    B.moveToFirst();
                    if3.y yVar2 = new if3.y();
                    yVar2.b(B);
                    B.close();
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                    l4Var.b2("masssendapp");
                    l4Var.l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bex));
                    l4Var.n1(yVar2.f372746f);
                    l4Var.M1(0);
                    l4Var.Y1(0);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(l4Var, "masssendapp");
                } else {
                    B.moveToPosition(1);
                    if3.y yVar3 = new if3.y();
                    yVar3.b(B);
                    B.close();
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                    l4Var2.b2("masssendapp");
                    l4Var2.l1(Ai.y0(yVar3));
                    l4Var2.n1(yVar3.f372746f);
                    l4Var2.M1(0);
                    l4Var2.Y1(0);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(l4Var2, "masssendapp");
                }
            }
            if (k0Var.mo70514xb06685ab("massendinfo", "clientid= ?", new java.lang.String[]{"" + c18}) > 0) {
                Ai.m145262xf35bbb4();
            }
            activityC16486x3260b8cc.getClass();
            java.lang.String d17 = yVar.d();
            int i18 = yVar.f372752o;
            if (i18 == 3) {
                java.lang.String str = if3.f0.a() + d17;
                if (str.equals("") || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendHistoryUI", "deleteImg : imgPath is null");
                    return;
                } else {
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                    return;
                }
            }
            if (i18 == 34) {
                java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, d17, false);
                if (!com.p314xaae8f345.mm.vfs.w6.j(vj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", d17, vj6);
                }
                com.p314xaae8f345.mm.vfs.w6.h(vj6);
                return;
            }
            if (i18 != 43) {
                return;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, yVar.d(), false);
            if (!com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", yVar.d(), rj6);
            }
            com.p314xaae8f345.mm.vfs.w6.h(rj6);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, yVar.d(), false);
            if (!com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", yVar.d(), tj6);
            }
            com.p314xaae8f345.mm.vfs.w6.h(tj6);
        }
    }
}
