package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 f219661d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363) {
        this.f219661d = activityC15592x3f0b3363;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363 = this.f219661d;
        java.lang.String b76 = activityC15592x3f0b3363.b7();
        g23.k kVar = activityC15592x3f0b3363.L1.f219686r;
        kVar.L = z13.f.Y6(activityC15592x3f0b3363.mo55332x76847179()).b7();
        int count = activityC15592x3f0b3363.L1.getCount();
        int i18 = activityC15592x3f0b3363.F1;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f219908a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6985x41353810 c6985x41353810 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6985x41353810();
        c6985x41353810.f142955d = i18;
        if (o13.n.n(b76)) {
            c6985x41353810.f142957e = 8L;
        } else {
            c6985x41353810.f142957e = 9L;
        }
        c6985x41353810.f142959f = count + 1;
        long j17 = kVar.f349470b;
        if (j17 > 0 && j17 < java.lang.System.currentTimeMillis()) {
            c6985x41353810.f142979p = java.lang.System.currentTimeMillis() - kVar.f349471c;
        }
        if (!kVar.A.equals(b76)) {
            c6985x41353810.I = 1L;
        }
        c6985x41353810.f142965i = c6985x41353810.b("SearchId", "", true);
        c6985x41353810.q("");
        c6985x41353810.f142981q = kVar.f349473e;
        c6985x41353810.f142982r = kVar.f349474f;
        c6985x41353810.f142983s = kVar.f349476h;
        c6985x41353810.f142984t = kVar.f349481m;
        c6985x41353810.f142985u = kVar.f349483o;
        c6985x41353810.f142986v = kVar.f349484p;
        c6985x41353810.f142988x = kVar.f349485q;
        c6985x41353810.f142989y = kVar.f349486r;
        c6985x41353810.s(java.lang.String.valueOf(o13.p.f423783c));
        c6985x41353810.A = c6985x41353810.b("Query", b76, true);
        int i19 = kVar.f349494z;
        kVar.f349494z = 2;
        c6985x41353810.D = i19;
        c6985x41353810.E = c6985x41353810.b("HasSHowType", "", true);
        c6985x41353810.F = c6985x41353810.b("VoiceInfo", "", true);
        c6985x41353810.G = c6985x41353810.b("SessionId", "", true);
        c6985x41353810.H = 1L;
        c6985x41353810.Q = c6985x41353810.b("GroupId", "", true);
        c6985x41353810.r("");
        c6985x41353810.S = c6985x41353810.b("MyRecentMsgCount", "", true);
        c6985x41353810.T = c6985x41353810.b("MyRecentSearchCount", "", true);
        c6985x41353810.U = c6985x41353810.b("MyRecentSearchDays", "", true);
        c6985x41353810.W = c6985x41353810.b("TophitsCount", "", true);
        c6985x41353810.X = c6985x41353810.b("TrainScore", "", true);
        c6985x41353810.f142952a0 = c6985x41353810.b("strDocId", "", true);
        c6985x41353810.f142966i0 = c6985x41353810.b("FtsTimeToken", o13.p.b(), true);
        c6985x41353810.f142968j0 = c01.id.c();
        c6985x41353810.f142953b0 = c6985x41353810.b("ClickedAppId", "", true);
        c6985x41353810.p(kVar.L);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.d(c6985x41353810.f142957e)) {
            c6985x41353810.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSReportLogic", "%s", c6985x41353810.n().replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " "));
        }
        boolean n17 = o13.n.n(activityC15592x3f0b3363.b7());
        boolean o17 = o13.n.o(activityC15592x3f0b3363.b7());
        if (!n17) {
            i17 = o17 ? 9 : 8;
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        kVar.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = activityC15592x3f0b3363.L1;
        q2Var.f219684J = true;
        if (!q2Var.f219688t) {
            q2Var.f219688t = true;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.n(b76, true, q2Var.getCount(), 0, kVar);
        }
        if (b76 != null && b76.length() != 0 && b76.trim().length() != 0) {
            activityC15592x3f0b3363.T1 = java.lang.Character.isDigit(b76.charAt(0)) ? 15 : 3;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r0 r0Var = activityC15592x3f0b3363.U1;
            if (r0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p0(activityC15592x3f0b3363);
                activityC15592x3f0b3363.U1 = p0Var;
                p0Var.f219698d = b76;
                gm0.j1.d().o(106, activityC15592x3f0b3363, activityC15592x3f0b3363.U1);
            } else {
                r0Var.f219698d = b76;
            }
            tg3.r1 r1Var = new tg3.r1(b76, 3);
            gm0.j1.d().g(r1Var);
            activityC15592x3f0b3363.S1 = db5.e1.Q(activityC15592x3f0b3363, activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icm), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.g0(activityC15592x3f0b3363, r1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
