package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f202173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f202174c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f202172a = xVar;
        this.f202173b = sVar;
        this.f202174c = c19786x6a1e2862;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        int i18;
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftWallViewHelper", "[audience_board] actionName = " + str);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftWallViewHelper", "[audience_board] actionName = " + str + ", data = " + obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202172a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f202173b;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f202174c;
            if (str != null && obj != null) {
                int hashCode = str.hashCode();
                if (hashCode != -934521548) {
                    if (hashCode != -476586329) {
                        if (hashCode == 152756384 && str.equals("openProfileSheet")) {
                            if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                                java.lang.String optString = ((org.json.JSONObject) obj).optString("userName");
                                java.lang.String optString2 = ((org.json.JSONObject) obj).optString("nickName");
                                java.lang.String optString3 = ((org.json.JSONObject) obj).optString("headUrl");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                                if (optString.length() > 0) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x.b(xVar, optString, optString2, optString3)) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.o oVar = xVar.f202211o;
                                        if (oVar != null) {
                                            oVar.b();
                                        }
                                        i19 = 0;
                                        cl0.g gVar = new cl0.g();
                                        gVar.o("errCode", i19);
                                        gVar.r("exit", true);
                                        java.lang.String gVar2 = gVar.toString();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                                        sVar.c(j17, i17, gVar2);
                                    }
                                }
                                i19 = -1;
                                cl0.g gVar3 = new cl0.g();
                                gVar3.o("errCode", i19);
                                gVar3.r("exit", true);
                                java.lang.String gVar22 = gVar3.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar22, "toString(...)");
                                sVar.c(j17, i17, gVar22);
                            }
                        }
                    } else if (str.equals("sendRewardGift")) {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                            java.lang.String optString4 = ((org.json.JSONObject) obj).optString("productId");
                            int optInt = ((org.json.JSONObject) obj).optInt("productCount");
                            int optInt2 = ((org.json.JSONObject) obj).optInt("actionType");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftWallViewHelper", "[sendRewardGift] actionType:" + optInt2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x.c(xVar, optString4, optInt, optInt2)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.o oVar2 = xVar.f202211o;
                                if (oVar2 != null) {
                                    oVar2.b();
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x.f202196r = c19786x6a1e2862;
                                i18 = 0;
                            } else {
                                i18 = -1;
                            }
                            cl0.g gVar4 = new cl0.g();
                            gVar4.o("errCode", i18);
                            java.lang.String gVar5 = gVar4.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
                            sVar.c(j17, i17, gVar5);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("type", optInt2);
                            java.lang.String jSONObject2 = jSONObject.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            xVar.l(jSONObject2);
                        }
                    }
                } else if (str.equals("report")) {
                    org.json.JSONObject jSONObject3 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                    if (jSONObject3 != null) {
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x.d(xVar, jSONObject4);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftWallViewHelper", "[audience_board] invalid action");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftWallViewHelper", "[audience_board] e = " + e17.getMessage());
        }
        return false;
    }
}
