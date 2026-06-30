package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes15.dex */
public class a extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f34924x366c91de = 6;

    /* renamed from: NAME */
    public static final java.lang.String f34925x24728b = "insertVideoPlayer";

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class) == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)).g4()) {
            B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertVideoPlayer", "wx assistant is enabled, return");
        java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("videoPlayerId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(tVar.mo50352x76847179());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70 c12274xd0769b70 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be c12263xadf304be = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be(a17, null);
        c12263xadf304be.mo51397xb9405cf9(c12274xd0769b70);
        java.lang.String optString = jSONObject.optString("playerHint");
        int i17 = 0;
        if (!android.text.TextUtils.isEmpty(optString)) {
            java.lang.String[] split = optString.split(",");
            int length = split.length;
            int i18 = 0;
            while (i17 < length) {
                java.lang.String str = split[i17];
                if ("supportSoftDecode".equals(str.trim())) {
                    i18 |= 1;
                } else if ("mp4Only".equals(str.trim())) {
                    i18 |= 2;
                }
                i17++;
            }
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertVideoPlayer", "convertPlayerHint, playerHintStr: %s, playerHint: %d", optString, java.lang.Integer.valueOf(i17));
        c12263xadf304be.m51394x994b9b0a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a(a17, c12263xadf304be);
        c12262x4a2a25a.k(c12274xd0769b70);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(a17, c12262x4a2a25a);
    }

    @Override // gb1.d
    public void N(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        int i18;
        oe1.s1 s1Var = new oe1.s1(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView, data: %s", s1Var, jSONObject);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.class);
        if (c12262x4a2a25a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView appBrandVideoView null", s1Var);
            return;
        }
        c12262x4a2a25a.m51371xc72d5636(s1Var);
        boolean optBoolean = jSONObject.optBoolean("independent", false);
        final oe1.s1 s1Var2 = new oe1.s1(i17);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.c(this);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
            public final void b() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.this.r();
            }
        };
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$b
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
            public final void c() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t.this.mo48798x74292566());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s VideoPlayer enter background, pause type:%s", s1Var2, d17.name());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a2 = c12262x4a2a25a;
                c12262x4a2a25a2.o("onUIPause, type:%s", d17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 U2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e.U2(c12262x4a2a25a2.f165071p0, c12262x4a2a25a2.f165081x0);
                c12262x4a2a25a2.o("onUIPause, autoPauseStrategy: %s", U2);
                if (U2.a(c12262x4a2a25a2.f165086z, d17)) {
                    c12262x4a2a25a2.f165062f.e();
                } else {
                    c12262x4a2a25a2.o("onUIPause, should skip ui pause", new java.lang.Object[0]);
                    c12262x4a2a25a2.f165084y0 = true;
                }
            }
        };
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$c
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
            /* renamed from: onDestroy */
            public final void mo32094xac79a11b() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.this;
                c12262x4a2a25a2.o("onUIDestroy", new java.lang.Object[0]);
                c12262x4a2a25a2.f();
                cVar.run();
            }
        };
        if (optBoolean) {
            final java.lang.String mo48798x74292566 = tVar.mo48798x74292566();
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.e(this, vVar, xVar, wVar);
            cVar.f165142d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(mo48798x74292566, eVar);
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(mo48798x74292566, eVar);
        } else {
            cVar.f165142d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t.this;
                    tVar2.I(xVar);
                    tVar2.O(vVar);
                    tVar2.K(wVar);
                }
            };
            tVar.U(xVar);
            tVar.R(vVar);
            tVar.w(wVar);
        }
        c12262x4a2a25a.m51347xda608282(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d(this, tVar, optBoolean, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.b(this, c12262x4a2a25a)));
        c12262x4a2a25a.setContentDescription(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571556ir));
        c12262x4a2a25a.m51356x764d819b(jSONObject.optBoolean("muted", false));
        boolean optBoolean2 = jSONObject.optBoolean("needEvent", false);
        boolean optBoolean3 = jSONObject.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView autoPlay=%b needEvent=%b", s1Var, java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean2));
        boolean optBoolean4 = jSONObject.optBoolean("showDanmuBtn", false);
        boolean optBoolean5 = jSONObject.optBoolean("enableDanmu", false);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("danmuList");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974);
        java.lang.String optString2 = jSONObject.optString("poster");
        boolean optBoolean6 = jSONObject.optBoolean("showBasicControls", true);
        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        int optInt = jSONObject.optInt(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, -1);
        boolean optBoolean7 = jSONObject.optBoolean("loop", false);
        boolean optBoolean8 = jSONObject.optBoolean("pageGesture", false);
        boolean optBoolean9 = jSONObject.optBoolean("pageGestureInFullscreen", true);
        double optDouble = jSONObject.optDouble("initialTime", 0.0d);
        boolean optBoolean10 = jSONObject.optBoolean("showProgress", true);
        boolean optBoolean11 = jSONObject.optBoolean("showProgressInControlMode", true);
        boolean optBoolean12 = jSONObject.optBoolean("showFullScreenBtn", true);
        boolean optBoolean13 = jSONObject.optBoolean("showPlayBtn", true);
        boolean optBoolean14 = jSONObject.optBoolean("showCenterPlayBtn", true);
        boolean optBoolean15 = jSONObject.optBoolean("showPoster", false);
        boolean optBoolean16 = jSONObject.optBoolean("enableProgressGesture", true);
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "default");
        boolean optBoolean17 = jSONObject.optBoolean("showMuteBtn", false);
        java.lang.String optString5 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        boolean optBoolean18 = jSONObject.optBoolean("showControlProgress", true);
        java.lang.String optString6 = jSONObject.optString("playBtnPosition", "bottom");
        boolean optBoolean19 = jSONObject.optBoolean("enablePlayGesture", false);
        boolean optBoolean20 = jSONObject.optBoolean("autoPauseIfNavigate", true);
        boolean optBoolean21 = jSONObject.optBoolean("autoPauseIfOpenNative", true);
        long optLong = jSONObject.optLong("bufferDuration", 10L) * 1000;
        if (optLong <= 0) {
            optLong = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        }
        java.lang.String optString7 = jSONObject.optString("backgroundColor");
        c12262x4a2a25a.m51340x8504ebb(tVar);
        c12262x4a2a25a.m51342xbe31a230(optString3);
        c12262x4a2a25a.m51353xc2e9d13b(optBoolean6);
        c12262x4a2a25a.v(optString2, optString);
        c12262x4a2a25a.m51348x4e6a0222(optInt);
        c12262x4a2a25a.m51357x2f76610(optString);
        c12262x4a2a25a.m51354x764cf626(optBoolean7);
        c12262x4a2a25a.m51358x263c1df8(optBoolean8);
        c12262x4a2a25a.m51359x3c3538d8(optBoolean9);
        try {
            c12262x4a2a25a.m51372xb0516035(jSONObject.getInt("videoPlayerId"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", e17);
        }
        c12262x4a2a25a.m51338xcc520c05(optBoolean3);
        c12262x4a2a25a.m51363x8498f2ac(optBoolean4);
        c12262x4a2a25a.m51343xa57d4630(optBoolean5);
        c12262x4a2a25a.m51344x1f8e87be(optJSONArray);
        c12262x4a2a25a.m51351xb9bf966f(optDouble);
        c12262x4a2a25a.m51362xb4d85e2b(optBoolean18);
        c12262x4a2a25a.m51368x28c841cc(optBoolean10);
        c12262x4a2a25a.m51369x18e116d4(optBoolean11);
        c12262x4a2a25a.m51364x1cf93842(optBoolean12);
        c12262x4a2a25a.m51366x69f2cf09(optBoolean13);
        c12262x4a2a25a.m51361x2a96dc34(optBoolean14);
        c12262x4a2a25a.m51367x45add8ac(optBoolean15);
        c12262x4a2a25a.g(optBoolean16);
        if (optString4.equalsIgnoreCase("default")) {
            c12262x4a2a25a.m51373xae209ab4(0);
        } else {
            c12262x4a2a25a.m51373xae209ab4(1);
        }
        c12262x4a2a25a.m51365xdb9e6204(optBoolean17);
        c12262x4a2a25a.m51370x53bfe316(optString5);
        c12262x4a2a25a.m51360xb1769f0f(optString6);
        c12262x4a2a25a.m51346x5672bdb0(optBoolean19);
        c12262x4a2a25a.m51336xe1cd92d3(optBoolean20);
        c12262x4a2a25a.m51337x40e23fe3(optBoolean21);
        c12262x4a2a25a.m51355x3dc294a4(optLong);
        if (!android.text.TextUtils.isEmpty(optString7)) {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63.equals(optString7)) {
                i18 = 0;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(optString7);
                } catch (java.lang.IllegalArgumentException unused) {
                    i18 = -16777216;
                }
            }
            c12262x4a2a25a.setBackgroundColor(i18);
        }
        if (optBoolean2) {
            c12262x4a2a25a.m51339x6c4ebec7(new xe1.p(c12262x4a2a25a, tVar));
        }
        int optInt2 = jSONObject.optInt("duration", -1);
        java.lang.String optString8 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        boolean optBoolean22 = jSONObject.optBoolean("live", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView filePath=%s live=%b", s1Var, optString8, java.lang.Boolean.valueOf(optBoolean22));
        c12262x4a2a25a.w(optString8, optBoolean22, optInt2);
    }
}
