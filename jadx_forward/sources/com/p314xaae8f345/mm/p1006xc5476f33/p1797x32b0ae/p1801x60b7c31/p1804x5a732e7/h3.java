package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class h3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g3 f225125g = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g3();

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig A(org.json.JSONObject jSONObject) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig.f158922f;
    }

    public l81.e1 B(boolean z17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f3(this, z17);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        k91.s2 s2Var;
        org.json.JSONObject jSONObject2;
        java.lang.Object obj;
        org.json.JSONObject jSONObject3;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3 h3Var;
        java.lang.String optString = jSONObject.optString("targetAppId");
        java.lang.String optString2 = jSONObject.optString("weAppUserName");
        java.lang.String format = java.lang.String.format("liteapp://%s", str);
        java.lang.String optString3 = jSONObject.optString("referrerAppId");
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String optString5 = jSONObject.optString("privateExtraData");
        java.lang.String optString6 = jSONObject.optString("mode");
        boolean optBoolean = jSONObject.optBoolean("isRedirect", false);
        boolean optBoolean2 = jSONObject.optBoolean("isTransparent", false);
        k91.s2 s2Var2 = k91.s2.f387294e;
        java.lang.String optString7 = jSONObject.optString("enterType", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63);
        if (!optString7.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63) && optString7.equals("modal")) {
            s2Var2 = k91.s2.f387293d;
        }
        k91.b1 b1Var = k91.b1.f387073d;
        java.lang.String optString8 = jSONObject.optString("loadingDarkModeStyle");
        if (optString8 != null) {
            if (optString8.equals("dark")) {
                b1Var = k91.b1.f387075f;
            } else if (optString8.equals("light")) {
                b1Var = k91.b1.f387074e;
            }
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1317);
        java.lang.String optString9 = jSONObject.optString("sceneNote");
        java.lang.String optString10 = jSONObject.optString("liteGameInfo");
        k91.b1 b1Var2 = b1Var;
        if (jSONObject.has("halfPage")) {
            jSONObject2 = jSONObject.optJSONObject("halfPage");
            s2Var = s2Var2;
        } else {
            s2Var = s2Var2;
            jSONObject2 = null;
        }
        if (jSONObject.has("singlePage")) {
            jSONObject3 = jSONObject.optJSONObject("singlePage");
            obj = "singlePage";
        } else {
            obj = "singlePage";
            jSONObject3 = null;
        }
        org.json.JSONObject optJSONObject = jSONObject.has("uiParam") ? jSONObject.optJSONObject("uiParam") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            this.f224976f.a("invalid_targetAppId and weAppUserName");
            return;
        }
        l81.b1 b1Var3 = new l81.b1();
        java.lang.String optString11 = jSONObject.optString("envVersion");
        if (optString11 == null) {
            optString11 = "";
            str2 = optString11;
        } else {
            str2 = "";
        }
        int i17 = !optString11.equals("trial") ? !optString11.equals("develop") ? 0 : 1 : 2;
        if (!jSONObject.optBoolean("openDataChannel") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            str3 = "liteGameInfo";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g3 g3Var = f225125g;
            g3Var.f225118c.mo48814x2efc64();
            g3Var.f225118c.mo48813x58998cd();
            g3Var.f225116a = optString;
            g3Var.f225117b = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d3(this);
            str3 = "liteGameInfo";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchMiniProgram", "add app data callback. appId: %s", optString);
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(optString, g3Var.f225117b);
        }
        java.lang.String optString12 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            b1Var3.f398545a = optString2;
        } else {
            b1Var3.f398547b = optString;
        }
        b1Var3.f398549c = i17;
        b1Var3.f398555f = optString12;
        b1Var3.f398565k = optInt;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString9)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(fp.s0.a(format == null ? str2 : format));
            sb6.append(":");
            sb6.append(optString3);
            sb6.append(":0");
            optString9 = sb6.toString();
        }
        b1Var3.f398567l = optString9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var3.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158857f = optString4;
        c11812xa040dc98.f158858g = optString5;
        c11812xa040dc98.f158856e = optString3;
        c11812xa040dc98.f158860i = format;
        c11812xa040dc98.f158855d = 2;
        if (optBoolean2) {
            b1Var3.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var3.S = y3Var;
            b1Var3.T = y3Var;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString(str3))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11806x808013c7 c11806x808013c7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11806x808013c7();
            b1Var3.Y = c11806x808013c7;
            c11806x808013c7.f158737e = optString10;
        }
        if (!optString6.equals("halfPage")) {
            h3Var = this;
            k91.s2 s2Var3 = s2Var;
            if (optString6.equals(obj)) {
                org.json.JSONObject jSONObject4 = jSONObject3;
                if (jSONObject4 != null) {
                    boolean optBoolean3 = jSONObject4.optBoolean("needShowTemplateNav");
                    boolean optBoolean4 = jSONObject4.optBoolean("hideCapsuleMenu");
                    java.lang.String optString13 = jSONObject4.optString("capsuleMenuType");
                    boolean optBoolean5 = jSONObject4.optBoolean("showShareButton");
                    boolean optBoolean6 = jSONObject4.optBoolean("forceLightMode", false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig.f158922f;
                    if (optBoolean5) {
                        shareActionConfig = h3Var.A(jSONObject);
                    }
                    k91.t2 t2Var = k91.t2.f387299d;
                    if (optBoolean4) {
                        t2Var = k91.t2.f387301f;
                    } else if ("singleClose".equals(optString13)) {
                        t2Var = k91.t2.f387300e;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
                    lVar.f159054a = true;
                    lVar.f159064k = t2Var;
                    lVar.f159067n = optBoolean3;
                    lVar.f159059f = s2Var3;
                    lVar.f159063j = optBoolean6;
                    lVar.f159071r = b1Var2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareActionConfig, "shareActionConfig");
                    lVar.f159074u = shareActionConfig;
                    b1Var3.G = lVar.a();
                }
            } else if (optJSONObject != null) {
                boolean optBoolean7 = optJSONObject.optBoolean("needShowTemplateNav");
                boolean optBoolean8 = optJSONObject.optBoolean("hideCapsuleMenu");
                java.lang.String optString14 = optJSONObject.optString("capsuleMenuType");
                boolean optBoolean9 = optJSONObject.optBoolean("showShareButton");
                boolean optBoolean10 = optJSONObject.optBoolean("forceLightMode", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig.f158922f;
                if (optBoolean9) {
                    shareActionConfig2 = h3Var.A(jSONObject);
                }
                k91.t2 t2Var2 = k91.t2.f387299d;
                if (optBoolean8) {
                    t2Var2 = k91.t2.f387301f;
                } else if ("singleClose".equals(optString14)) {
                    t2Var2 = k91.t2.f387300e;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
                lVar2.f159054a = true;
                lVar2.f159064k = t2Var2;
                lVar2.f159067n = optBoolean7;
                lVar2.f159063j = optBoolean10;
                lVar2.f159059f = s2Var3;
                lVar2.f159071r = b1Var2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareActionConfig2, "shareActionConfig");
                lVar2.f159074u = shareActionConfig2;
                b1Var3.G = lVar2.a();
            }
        } else if (jSONObject2 != null) {
            b1Var3.f398581z = 2;
            org.json.JSONObject jSONObject5 = jSONObject2;
            int optInt2 = jSONObject5.optInt("height", -2);
            boolean optBoolean11 = jSONObject5.optBoolean("enableFullScreenGesture");
            boolean optBoolean12 = jSONObject5.optBoolean("needShowTemplateNav");
            boolean optBoolean13 = jSONObject5.optBoolean("hideCapsuleMenu");
            java.lang.String optString15 = jSONObject5.optString("capsuleMenuType");
            boolean optBoolean14 = jSONObject5.optBoolean("showShareButton");
            boolean optBoolean15 = jSONObject5.optBoolean("forbidFullScreenDragUpGesture", false);
            boolean optBoolean16 = jSONObject5.optBoolean("forceLightMode", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig.f158922f;
            h3Var = this;
            if (optBoolean14) {
                shareActionConfig3 = h3Var.A(jSONObject);
            }
            k91.t2 t2Var3 = k91.t2.f387299d;
            if (optBoolean13) {
                t2Var3 = k91.t2.f387301f;
            } else if ("singleClose".equals(optString15)) {
                t2Var3 = k91.t2.f387300e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig backgroundShapeConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
            lVar3.f159054a = true;
            lVar3.f159055b = optInt2;
            lVar3.f159056c = -2;
            lVar3.f159057d = -2;
            lVar3.f159058e = -2;
            lVar3.f159059f = s2Var;
            lVar3.f159064k = t2Var3;
            lVar3.f159060g = true;
            lVar3.f159062i = backgroundShapeConfig;
            lVar3.f159072s = true;
            lVar3.f159063j = optBoolean16;
            lVar3.f159066m = optBoolean15;
            lVar3.f159071r = b1Var2;
            lVar3.f159065l = optBoolean11;
            lVar3.f159067n = optBoolean12;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareActionConfig3, "shareActionConfig");
            lVar3.f159074u = shareActionConfig3;
            b1Var3.G = lVar3.a();
        } else {
            h3Var = this;
        }
        b1Var3.L = h3Var.B(optBoolean);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("shareProductItem");
        if (optJSONObject2 != null) {
            java.lang.String str4 = str2;
            java.lang.String finderUsername = optJSONObject2.optString("finderUsername", str4);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) ((s40.b1) i95.n0.c(s40.b1.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
            zl2.b0.f555196a.a(finderUsername, str4, b1Var3);
            long optLong = optJSONObject2.optLong("productId", 0L);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Dj(optJSONObject2.optString("entranceGMsgID", str4), b1Var3);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Vi(c(), b1Var3, finderUsername, optLong);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(c(), b1Var3);
        }
        h3Var.f224976f.d(false);
    }
}
