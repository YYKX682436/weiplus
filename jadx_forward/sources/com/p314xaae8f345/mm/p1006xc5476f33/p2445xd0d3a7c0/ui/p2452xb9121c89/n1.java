package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.m1 f269778d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.m1 m1Var) {
        this.f269778d = m1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        int i17;
        mz4.d dVar;
        mz4.d dVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.m1 m1Var = this.f269778d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = m1Var.f269777d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(activityC19519x7af4daf3.f269693x, activityC19519x7af4daf3.f269692w);
        if (c01.ia.e(Li)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Note.NoteEditorUI", "forbidden all menu");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = m1Var.f269777d;
        boolean booleanExtra = activityC19519x7af4daf32.getIntent().getBooleanExtra("show_jump_chat", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onCreateMMMenu: onlyShowJumpChat %b, mOpenNoteFromScene %d, mMsgSecurityPreviewType %d, mCanEditThisNote %b", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(activityC19519x7af4daf32.f269697y0), java.lang.Integer.valueOf(activityC19519x7af4daf32.f269696y), java.lang.Boolean.valueOf(activityC19519x7af4daf32.f269695x1));
        if (booleanExtra) {
            g4Var.a(21, com.p314xaae8f345.mm.R.C30867xcad56011.b2b);
        } else {
            int i18 = activityC19519x7af4daf32.f269697y0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.f232034a;
            if (i18 == 1) {
                int i19 = activityC19519x7af4daf32.f269696y;
                if (i19 < 2) {
                    if (i19 < 1) {
                        g4Var.f(4, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
                    }
                    cz4.f fVar = activityC19519x7af4daf32.F1;
                    if (fVar != null && fVar.w()) {
                        g4Var.f(15, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_e));
                    }
                    if (activityC19519x7af4daf32.G1 != null && !activityC19519x7af4daf32.E) {
                        g4Var.f(17, s0Var.f(activityC19519x7af4daf32.mo55332x76847179(), activityC19519x7af4daf32.G1.f381610a));
                    }
                    o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(activityC19519x7af4daf32.A);
                    if ((F != null && F.f67643xc8a07680 != -1) || ((dVar2 = activityC19519x7af4daf32.J1) != null && dVar2.f414762a.stream().allMatch(new mz4.C29169x2e00ff()))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.Z6(activityC19519x7af4daf32, g4Var);
                    }
                    g4Var.f(3, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                }
            } else if (i18 == 2) {
                if (!c01.ia.C(Li)) {
                    g4Var.f(0, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
                }
                if (qz4.a.a()) {
                    g4Var.f(7, activityC19519x7af4daf32.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
                }
                cz4.f fVar2 = activityC19519x7af4daf32.F1;
                if (fVar2 != null && fVar2.w()) {
                    g4Var.f(15, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_e));
                }
                if (activityC19519x7af4daf32.G1 != null && !activityC19519x7af4daf32.E) {
                    g4Var.f(17, s0Var.f(activityC19519x7af4daf32.mo55332x76847179(), activityC19519x7af4daf32.G1.f381610a));
                }
                if (!activityC19519x7af4daf32.f269695x1) {
                    g4Var.f(14, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccl));
                }
                java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100353").t0().get("Close");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    z17 = false;
                    i17 = 0;
                } else {
                    z17 = false;
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
                }
                if (i17 == 0) {
                    z17 = true;
                }
                if (z17) {
                    g4Var.f(8, activityC19519x7af4daf32.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574170ha1));
                }
                o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(activityC19519x7af4daf32.A);
                if ((F2 != null && F2.f67643xc8a07680 != -1) || ((dVar = activityC19519x7af4daf32.J1) != null && dVar.f414762a.stream().allMatch(new mz4.C29169x2e00ff()))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.Z6(activityC19519x7af4daf32, g4Var);
                }
                g4Var.f(1, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4));
                g4Var.f(2, activityC19519x7af4daf32.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
            } else if (i18 == 4) {
                if (!c01.ia.C(Li)) {
                    g4Var.f(9, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
                }
                cz4.f fVar3 = activityC19519x7af4daf32.F1;
                if (fVar3 != null && fVar3.w()) {
                    g4Var.f(15, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_e));
                }
                if (activityC19519x7af4daf32.G1 != null && !activityC19519x7af4daf32.E) {
                    g4Var.f(17, s0Var.f(activityC19519x7af4daf32.mo55332x76847179(), activityC19519x7af4daf32.G1.f381610a));
                }
                if (qz4.a.a()) {
                    g4Var.f(12, activityC19519x7af4daf32.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
                }
                g4Var.f(10, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            } else if (i18 == 5 && !c01.ia.C(Li)) {
                g4Var.f(20, activityC19519x7af4daf32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            g4Var.f(19, "test_auto_save");
        }
    }
}
