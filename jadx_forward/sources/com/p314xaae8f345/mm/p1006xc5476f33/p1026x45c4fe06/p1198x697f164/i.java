package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f170779a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f170779a = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        boolean z17;
        boolean z18;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.j6)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AfterLaunchWxaAppResponse");
            r45.j6 j6Var = (r45.j6) fVar;
            java.lang.String str2 = j6Var.f459136g;
            if (!(!(str2 == null || str2.length() == 0))) {
                str2 = null;
            }
            if (str2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f170779a;
                o6Var.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.f(o6Var, str2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f170779a;
            if (j6Var.f459135f == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.j(runtime);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
                if (mi1.o0.f408186b) {
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3x);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    mi1.z0 z0Var = mi1.z0.f408272e;
                    mi1.r1 r1Var = new mi1.r1(string, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cl9), 128, true, 0, new mi1.n0(runtime), 70, null);
                    runtime.f156354z.f408239e.c(new mi1.j0(1, 0, 2, 1500L, r1Var.f408209e, 0L, r1Var, 0, 0L, jVar, 418, null));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.CapsuleAnimatorEventHelper", "showLowScoreTips: isEnable = false");
                }
                z17 = true;
            } else {
                mi1.m0 m0Var = runtime.f156354z.f408239e;
                mi1.z0 z0Var2 = mi1.z0.f408272e;
                java.util.LinkedList linkedList = m0Var.f408153f;
                mi1.j0 j0Var = (mi1.j0) linkedList.peekFirst();
                if ((j0Var != null ? j0Var.f408122e : Integer.MIN_VALUE) == 128) {
                    linkedList.clear();
                }
                z17 = false;
            }
            if (z17) {
                return;
            }
            r45.jd7 jd7Var = j6Var.f459134e;
            if (!(jd7Var != null) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jd7Var.f459264d)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.comment_dish:");
                sb6.append(j6Var.f459134e);
                sb6.append(" response.comment_dish.text:");
                r45.jd7 jd7Var2 = j6Var.f459134e;
                sb6.append(jd7Var2 != null ? jd7Var2.f459264d : null);
                sb6.append(" is null ");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTradeManager", sb6.toString());
                z18 = false;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f170779a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o6Var2, "<this>");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o oVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o) o6Var2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o.class);
                if (oVar2 == null) {
                    oVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o();
                    o6Var2.l(oVar2);
                }
                r45.jd7 jd7Var3 = j6Var.f459134e;
                oVar2.f168467d = jd7Var3;
                mi1.o0 o0Var = mi1.o0.f408185a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var3 = this.f170779a;
                java.lang.String text = jd7Var3.f459264d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "text");
                r45.jd7 jd7Var4 = j6Var.f459134e;
                java.lang.String str3 = jd7Var4.f459267g;
                java.lang.String str4 = str3 == null ? "" : str3;
                java.lang.String str5 = jd7Var4.f459268h;
                if (str5 == null) {
                    str5 = "";
                }
                mi1.z0 z0Var3 = mi1.z0.f408272e;
                o0Var.b(o6Var3, new mi1.r1(text, str4, str5, null, 64, true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.g(this.f170779a), 64, null), 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.h(this.f170779a));
                z18 = true;
            }
            r45.kd7 kd7Var = j6Var.f459133d;
            if (kd7Var != null) {
                java.lang.String str6 = kd7Var.f460143d;
                if ((str6 == null || str6.length() == 0) || z18) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTradeManager", "[cgiGetScoreAfterLaunch] content = " + j6Var.f459133d);
                jz5.l lVar = new jz5.l("key_type", mi1.a.TRADE);
                jz5.l lVar2 = new jz5.l("key_appid", this.f170779a.f156336n);
                r45.kd7 kd7Var2 = j6Var.f459133d;
                java.util.Map k17 = kz5.c1.k(lVar, lVar2, new jz5.l("key_img_url", kd7Var2.f460146g), new jz5.l("key_img_url_dark", kd7Var2.f460147h), new jz5.l("key_content", kd7Var2.f460143d), new jz5.l("key_show_duration", java.lang.Long.valueOf(kd7Var2.f460145f * 1000)), new jz5.l("key_allow_animation", java.lang.Boolean.FALSE), new jz5.l("key_show_duration_after_intercepted", 5000L));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var4 = this.f170779a;
                long j17 = j6Var.f459133d.f460144e * 1000;
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = o6Var4.Q;
                if (c20976x6ba6452a != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.k(j17, o6Var4, k17, null), 3, null);
                }
            }
        }
    }
}
