package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 f260888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260889b;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, java.lang.String str) {
        this.f260888a = activityC19073xb523d43;
        this.f260889b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.rj5 rj5Var = (r45.rj5) fVar.f152151d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43 = this.f260888a;
        if (i17 == 0 && i18 == 0 && rj5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "VerifyGuardianResponse resp retcode: " + rj5Var.f466480d);
            if (rj5Var.f466480d != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.z7(activityC19073xb523d43, rj5Var.f466481e);
            } else {
                r45.f7 f7Var = rj5Var.f466483g;
                if (f7Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.y7(activityC19073xb523d43, f7Var);
                } else {
                    r45.fo foVar = rj5Var.f466482f;
                    if (foVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send bubble msg: " + foVar.f456006d + ", " + foVar.f456011i);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.E;
                        activityC19073xb523d43.getClass();
                        java.lang.String weapp_username = foVar.f456011i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(weapp_username, "weapp_username");
                        boolean z17 = false;
                        if (!r26.i0.n(weapp_username, "@app", false)) {
                            foVar.f456011i += "@app";
                        }
                        ot0.q qVar = new ot0.q();
                        qVar.f430187f = foVar.f456006d;
                        qVar.f430191g = foVar.f456007e;
                        qVar.f430199i = 44;
                        qVar.f430230p2 = 1;
                        qVar.f430206j2 = foVar.f456011i;
                        qVar.f430202i2 = foVar.f456012m;
                        qVar.f430214l2 = 2;
                        java.lang.String str = foVar.f456010h;
                        if (str != null) {
                            if (!(str.length() > 0)) {
                                str = null;
                            }
                            if (str != null) {
                                qVar.f430267z = str;
                            }
                        }
                        java.lang.String str2 = foVar.f456008f;
                        if (str2 != null) {
                            if (!(str2.length() > 0)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                qVar.f430246t2 = str2;
                            }
                        }
                        java.lang.String str3 = foVar.f456009g;
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
                        qVar.f430238r2 = 1;
                        java.lang.String str4 = this.f260889b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.j0(qVar, str4, activityC19073xb523d43, foVar);
                        java.lang.String str5 = foVar.f456010h;
                        if (str5 != null) {
                            if (str5.length() > 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            java.lang.String icon_url = foVar.f456010h;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icon_url, "icon_url");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.g0(j0Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c0 c0Var = activityC19073xb523d43.D;
                            c0Var.getClass();
                            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.b0(c0Var, icon_url, g0Var));
                        } else {
                            j0Var.mo146xb9724478(null);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.x7(activityC19073xb523d43, rj5Var.f466484h, str4);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "VerifyGuardianResponse error: " + i17 + ", " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.z7(activityC19073xb523d43, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
