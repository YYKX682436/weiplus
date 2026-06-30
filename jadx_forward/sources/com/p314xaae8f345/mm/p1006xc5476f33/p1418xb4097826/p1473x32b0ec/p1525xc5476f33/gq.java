package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gq {
    public gq(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "bannerJumpImpl business_type:%d", java.lang.Integer.valueOf(jumpInfo.m76480xe2ee1ca3()));
        int m76503x92bc3c07 = jumpInfo.m76503x92bc3c07();
        if (m76503x92bc3c07 != 1) {
            java.lang.Object obj = "";
            if (m76503x92bc3c07 == 2) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9 = jumpInfo.m76494x46f709d9();
                if (m76494x46f709d9 == null || (str = m76494x46f709d9.m77166xb5887639()) == null) {
                    str = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "jump half h5 url:%s", str);
                if (jumpInfo.m76494x46f709d9() == null || android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveH5HalfBubble", "jumpToHalfScreenH5 html5_info is null or url is empty");
                    return;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d92 = jumpInfo.m76494x46f709d9();
                if (m76494x46f709d92 != null && m76494x46f709d92.m77164x7528c3fb() == 1) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d93 = jumpInfo.m76494x46f709d9();
                    int m77163xab345223 = m76494x46f709d93 != null ? m76494x46f709d93.m77163xab345223() : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "show HalfScreenWebView heightPercent:" + m77163xab345223);
                    if (m77163xab345223 < df2.lt.Y || m77163xab345223 > df2.lt.Z) {
                        m77163xab345223 = 75;
                    }
                    float f17 = m77163xab345223 / 100;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "realScreenHeightPercent:" + f17);
                    boolean z17 = jumpInfo.m76522x978297b9() != 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "canShowMenu:" + z17);
                    i95.m c17 = i95.n0.c(zg0.u2.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zg0.u2 u2Var = (zg0.u2) c17;
                    gk2.e eVar = dk2.ef.I;
                    java.lang.String str3 = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null;
                    if (zl2.r4.f555483a.w1()) {
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        str3 = xy2.c.e(context2);
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject2.putOpt("finderId", str3);
                    gk2.e eVar2 = dk2.ef.I;
                    if (eVar2 != null && (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f410521r) != null) {
                        obj = java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
                    }
                    jSONObject2.putOpt("liveId", obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "getBannerHalfParam:%s", jSONObject2.toString());
                    java.lang.String jSONObject3 = jSONObject2.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                    java.lang.Object K2 = zg0.u2.K2(u2Var, context, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(f17, 0.0f, jSONObject3, false, z17, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388586, null), 4, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) K2;
                    m1Var.show();
                    m1Var.R(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eq());
                    ((hg5.d) K2).f362939o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fq.f194121d;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "show FullScreenWebView");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("convertActivityFromTranslucent", true);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            } else if (m76503x92bc3c07 == 3) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = jumpInfo.m76506x42318aa0();
                java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = jumpInfo.m76506x42318aa0();
                if (m76506x42318aa02 == null || (str2 = m76506x42318aa02.m77225xe7ed3fec()) == null) {
                    str2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveH5HalfBubble", "jump native necessary_params:%s", str2);
                try {
                    jSONObject = new org.json.JSONObject(str2);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveH5HalfBubble", e17, "", new java.lang.Object[0]);
                    jSONObject = null;
                }
                org.json.JSONObject jSONObject4 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v.f197252a;
                if (valueOf != null && valueOf.intValue() == 1) {
                    vVar.a(context, jSONObject4);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    vVar.b(context, jSONObject4);
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
                    xc2.y2.f534876a.U(context, 0L, jSONObject4, 0);
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    vVar.c(context, jSONObject4);
                } else {
                    if (valueOf != null && valueOf.intValue() == 5) {
                        try {
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            jSONObject4.put("action", "openFinderMultiMoreLive");
                            jSONObject5.put("extInfo", jSONObject4);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            zy2.ta.d(ya2.e1.f542005a, context, jSONObject5.toString(), null, null, 12, null);
                            return;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveH5HalfBubble", e18, "openFinderView", new java.lang.Object[0]);
                            return;
                        }
                    }
                    if (valueOf != null && valueOf.intValue() == 9) {
                        pf5.z zVar = pf5.z.f435481a;
                        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                        pl2.x xVar = (pl2.x) a17;
                        pl2.s sVar = xVar.f438217g;
                        if (sVar != null) {
                            sVar.i(false, null);
                        }
                        xVar.f438220m.c();
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveH5HalfBubble", "jump mini app not implement");
        }
        nk2.l.f419554a.b(nk2.a.f419490m);
    }
}
