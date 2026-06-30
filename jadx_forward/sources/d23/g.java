package d23;

/* loaded from: classes.dex */
public final class g extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f307428h;

    /* renamed from: i, reason: collision with root package name */
    public long f307429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, d23.h uiComponent) {
        super(uiComponent);
        j75.f m67437x4bd5310;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f307428h = activity;
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) || (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(activity, new d23.a(this, uiComponent));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getFTSHotData */
    public final void m123374x3ca76468(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "getFTSHotData params:" + str);
            r45.xa1 xa1Var = new r45.xa1();
            java.lang.String optString = jSONObject.optString("requestId", "");
            xa1Var.set(1, jSONObject.optString("json", ""));
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 6289;
            lVar.f152199c = "/cgi-bin/micromsg-bin/finderglobalsearchpage";
            lVar.f152197a = xa1Var;
            lVar.f152198b = new r45.ya1();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f307428h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) pf5.z.f435481a.a(activity).a(um3.b.class)).O6();
            v65.i.b(O6, null, new d23.d(a17, optString, O6, this, null), 1, null);
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getWebConfig */
    public final java.lang.String m123375x9fdadd00(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("key");
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d(optString);
            org.json.JSONObject g17 = g();
            g17.put("configStr", d17.toString());
            pm0.v.X(new d23.e(this));
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSHotSearchJSApi", e17, "getWebConfig", new java.lang.Object[0]);
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openBizProfile */
    public java.lang.String m123376xe8ef8700(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.f66875xa013b0d5);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", optString);
            intent.putExtra("finish_direct", true);
            intent.putExtra("specific_chat_from_scene", 3);
            intent.putExtra("preChatTYPE", 9);
            intent.putExtra("chat_from_scene", 5);
            av4.j jVar = this.f95859a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
            j45.l.u(((d23.h) jVar).f307430d, ".ui.chatting.ChattingUI", intent, null);
            java.lang.String jSONObject = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r7 == null) goto L17;
     */
    @android.webkit.JavascriptInterface
    /* renamed from: openSearchWebView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m123377xf159c727(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d23.g.m123377xf159c727(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: startWebSearch */
    public final java.lang.String m123378xa60977da(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        java.lang.String str2 = "";
        if (c01.id.c() - this.f307429i < 1500) {
            java.lang.String jSONObject = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        this.f307429i = c01.id.c();
        try {
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "startWebSearch %s", java.lang.String.valueOf(str));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            int optInt = jSONObject2.optInt("type", 0);
            java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            int optInt2 = jSONObject2.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            java.lang.String optString2 = jSONObject2.optString("query");
            java.lang.String optString3 = jSONObject2.optString("extParams", "");
            java.lang.String optString4 = jSONObject2.optString("extReqParams", "");
            java.lang.String optString5 = jSONObject2.optString("searchPlaceHolder", "");
            int optInt3 = jSONObject2.optInt("ftsNeedHideKeyBoard", 0);
            boolean optBoolean = jSONObject2.optBoolean("needPreGet", true);
            org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject("customNavBarParams");
            boolean optBoolean2 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideSearchBar", false) : false;
            java.lang.String optString6 = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("nativeConfig")) == null) ? null : optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (optString6 != null) {
                str2 = optString6;
            }
            su4.j2 j2Var = new su4.j2();
            j2Var.f494494x = java.net.URLDecoder.decode(optString3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            j2Var.f494495y = optString4;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            j2Var.f494471a = context;
            j2Var.f494472b = optInt2;
            j2Var.f494474d = optString2;
            j2Var.f494473c = optInt;
            j2Var.f494475e = optString;
            j2Var.f494476f = true;
            j2Var.f494478h = true;
            j2Var.f494479i = optBoolean2;
            j2Var.f494493w = optBoolean;
            j2Var.f494487q = str2;
            if (optInt3 == 1 || optInt3 == 2) {
                if (optInt3 != 1) {
                    z17 = false;
                }
                j2Var.A = z17;
            }
            j2Var.f494491u = false;
            j2Var.f494485o = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            j2Var.f494486p = false;
            j2Var.f494496z = optString5;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    public final void u(java.lang.String state, java.lang.String extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "onActivityStateChanged, state %s, extData %s", state, extData);
        av4.j jVar = this.f95859a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = ((d23.h) jVar).f307430d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) pf5.z.f435481a.a(context).a(um3.b.class)).O6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("state", state);
        jSONObject.put("extData", extData);
        if (O6 != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new d23.f(this, jSONObject, null), 2, null);
        }
    }
}
