package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 f260904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260905b;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, java.lang.String str) {
        this.f260904a = activityC19073xb523d43;
        this.f260905b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.qx6 qx6Var = (r45.qx6) fVar.f152151d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43 = this.f260904a;
        if (i17 == 0 && i18 == 0 && qx6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "verifyParent resp retcode: " + qx6Var.f465879d);
            if (qx6Var.f465879d != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.z7(activityC19073xb523d43, qx6Var.f465880e);
            } else {
                r45.f7 f7Var = qx6Var.f465882g;
                if (f7Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.y7(activityC19073xb523d43, f7Var);
                } else {
                    r45.m74 m74Var = qx6Var.f465881f;
                    if (m74Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send liteapp bubble msg: " + m74Var.f461714d + ", " + m74Var.f461719i);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.E;
                        activityC19073xb523d43.getClass();
                        ot0.q qVar = new ot0.q();
                        qVar.f430187f = m74Var.f461714d;
                        qVar.f430191g = m74Var.f461715e;
                        qVar.f430199i = 68;
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
                        h0Var.f273198b = m74Var.f461719i;
                        h0Var.f273199c = m74Var.f461720m;
                        h0Var.f273200d = m74Var.f461721n;
                        qVar.f(h0Var);
                        java.lang.String str = m74Var.f461718h;
                        boolean z17 = false;
                        if (str != null) {
                            if (!(str.length() > 0)) {
                                str = null;
                            }
                            if (str != null) {
                                qVar.f430267z = str;
                            }
                        }
                        java.lang.String str2 = m74Var.f461716f;
                        if (str2 != null) {
                            if (!(str2.length() > 0)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                qVar.f430246t2 = str2;
                            }
                        }
                        java.lang.String str3 = m74Var.f461717g;
                        if (str3 != null) {
                            if (!(str3.length() > 0)) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                qVar.f430242s2 = str3;
                                qVar.f430259x = str3;
                                qVar.f430255w = "gh_3dfda90e39d6";
                            }
                        }
                        qVar.E2 = 1;
                        java.lang.String str4 = this.f260905b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.l0(qVar, str4, activityC19073xb523d43, m74Var);
                        java.lang.String str5 = m74Var.f461718h;
                        if (str5 != null) {
                            if (str5.length() > 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            java.lang.String icon_url = m74Var.f461718h;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icon_url, "icon_url");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.k0(l0Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c0 c0Var = activityC19073xb523d43.D;
                            c0Var.getClass();
                            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.b0(c0Var, icon_url, k0Var));
                        } else {
                            l0Var.mo146xb9724478(null);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.x7(activityC19073xb523d43, qx6Var.f465883h, str4);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "verifyParent error: " + i17 + ", " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.z7(activityC19073xb523d43, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
