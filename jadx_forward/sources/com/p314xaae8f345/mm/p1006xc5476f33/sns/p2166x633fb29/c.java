package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245642d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e) {
        this.f245642d = binderC17870x451d307e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, funcId=");
        sb6.append(m1Var == 0 ? 0 : m1Var.mo808xfb85f7b0());
        sb6.append(", errType=");
        sb6.append(i17);
        sb6.append(", errCode=");
        sb6.append(i18);
        sb6.append(", errMsg=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", sb6.toString());
        boolean z17 = m1Var instanceof ib4.l;
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e = this.f245642d;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                str2 = ((ib4.l) m1Var).H();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "the dynamic string is " + str2 + ", sceneType is " + m1Var.mo808xfb85f7b0());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "the netscene is error ,error type is " + i17 + " error msg is " + str + " sceneType is " + m1Var.mo808xfb85f7b0());
            }
            if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                binderC17870x451d307e.m142013x77b46a52("onDynamicUpdateEnd", java.lang.Long.valueOf(((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue()), str2);
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            }
        } else {
            byte[] bArr = null;
            if (m1Var instanceof ib4.b) {
                if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                    try {
                        long longValue = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneAdChannelPkgInfo onSceneEnd, id %d", java.lang.Long.valueOf(longValue));
                        r45.oy oyVar = (r45.oy) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && oyVar != null) {
                            bArr = oyVar.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onAdChannelEnd", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    } catch (java.lang.Exception e17) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
            } else if (m1Var instanceof ib4.k) {
                if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                    binderC17870x451d307e.m142013x77b46a52("onFavOfficialItemEnd", java.lang.Long.valueOf(((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue()), ((ib4.k) m1Var).H(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                }
            } else if (m1Var instanceof i64.n0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "real time report done.");
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            } else if (m1Var instanceof ib4.e) {
                if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                    try {
                        long longValue2 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd, id %d", java.lang.Long.valueOf(longValue2));
                        r45.nh3 nh3Var = (r45.nh3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && nh3Var != null) {
                            bArr = nh3Var.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onGetSmartPhoneScene", java.lang.Long.valueOf(longValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd exp=" + e18.toString());
                    }
                }
            } else if (m1Var instanceof ib4.n) {
                if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                    try {
                        long longValue3 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd, id %d", java.lang.Long.valueOf(longValue3));
                        r45.dt6 dt6Var = (r45.dt6) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && dt6Var != null) {
                            str2 = dt6Var.f454279d;
                        }
                        binderC17870x451d307e.m142013x77b46a52("onUpdateUxInfo", java.lang.Long.valueOf(longValue3), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
                        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd exp=" + e19.toString());
                    }
                }
            } else if (m1Var instanceof ib4.d) {
                if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                    long longValue4 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd, id %d", java.lang.Long.valueOf(longValue4));
                    try {
                        r45.nh5 nh5Var = (r45.nh5) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        binderC17870x451d307e.m142013x77b46a52("onGetHbCoverStateScene", java.lang.Long.valueOf(longValue4), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf((i17 == 0 && i18 == 0 && nh5Var != null) ? nh5Var.f462934d : -1));
                        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    } catch (java.lang.Exception e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd exp=" + e27.toString());
                    }
                }
            } else if (m1Var instanceof ib4.m) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue5 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd, id %d", java.lang.Long.valueOf(longValue5));
                        r45.fm3 fm3Var = (r45.fm3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && fm3Var != null) {
                            bArr = fm3Var.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onAdUpdateQrUrlEnd", java.lang.Long.valueOf(longValue5), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd exp=" + th6.toString());
                }
            } else if ((m1Var instanceof ab0.s) || (m1Var instanceof ns.l)) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue6 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        if (m1Var.mo808xfb85f7b0() != 30 && m1Var.mo808xfb85f7b0() != 667) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesProxy", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        }
                        if ((m1Var instanceof ns.l) && ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).f270913g != 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "not opcode addcontact!");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        }
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        if (i17 == 0 && i18 == 0) {
                            if (m1Var.mo808xfb85f7b0() == 30) {
                                str2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
                            } else if (m1Var.mo808xfb85f7b0() == 667) {
                                str2 = ((l41.o) ((ab0.s) m1Var)).f397417f;
                            }
                        }
                        jSONObject.put("errMsg", str);
                        jSONObject.put("respUsername", str2);
                        binderC17870x451d307e.m142013x77b46a52("onAddBrandSceneEnd", java.lang.Long.valueOf(longValue6), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), jSONObject.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneAddOpenIMContact or NetSceneVerifyUser onSceneEnd exp=" + th7.toString());
                }
            } else if (m1Var instanceof l90.l) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue7 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        r45.iw5 iw5Var = (r45.iw5) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && iw5Var != null) {
                            bArr = iw5Var.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onSearchContact", java.lang.Long.valueOf(longValue7), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneSearchContact, onSceneEnd exp=" + th8.toString());
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            } else if (m1Var instanceof ib4.a) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue8 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        r45.l2 l2Var = (r45.l2) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && l2Var != null) {
                            bArr = l2Var.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onAdNativeAntiAbuse", java.lang.Long.valueOf(longValue8), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneAdAntiAbuse, onSceneEnd exp = " + th9.toString());
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            } else if (m1Var instanceof k64.o) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue9 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        int i19 = ((r45.j0) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152243a.f152217a).f458967f;
                        java.lang.String str3 = "-1";
                        if (i17 == 0 && i18 == 0) {
                            str3 = java.lang.String.valueOf(((r45.k0) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a).f459780d);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneAdAppointment, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", opType=" + i19 + ", status=" + str3);
                        binderC17870x451d307e.m142013x77b46a52("onSendAppointmentReq", java.lang.Long.valueOf(longValue9), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str3);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "NetSceneAdAppointment, onSceneEnd exp = " + th10.toString());
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            } else if (m1Var != 0) {
                try {
                    if (((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).containsKey(m1Var)) {
                        long longValue10 = ((java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.e(binderC17870x451d307e)).remove(m1Var)).longValue();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                        if (i17 == 0 && i18 == 0 && fVar != null) {
                            bArr = fVar.mo14344x5f01b1f6();
                        }
                        binderC17870x451d307e.m142013x77b46a52("onRspCallbackCommon", java.lang.Long.valueOf(longValue10), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "default, onSceneEnd exp=" + th11.toString());
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.g(binderC17870x451d307e));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
    }
}
