package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes10.dex */
public final class ra extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra f268023d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f268024e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f268025f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("websearch", "9");
        hashMap.put("h5", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        hashMap.put("liteapp", "17");
        hashMap.put("weapp", "7");
        hashMap.put("finder", "16");
        f268025f = hashMap;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        bi4.d1 d1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean g17 = bi4.v1.g();
        nw4.g gVar = env.f422396d;
        if (!g17) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail_not_support", null);
            return false;
        }
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("liteAppId");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        str = "";
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "handleMsg: js");
            java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get("sourceId");
            java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Object obj3 = ((java.util.HashMap) msg.f422323a).get("sourceActivityId");
            java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("sourceVerifyInfo");
            java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            java.lang.Object obj5 = ((java.util.HashMap) msg.f422323a).get("sourceName");
            java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            java.lang.Object obj6 = ((java.util.HashMap) msg.f422323a).get("sourceIconURL");
            java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
            java.lang.Object obj7 = ((java.util.HashMap) msg.f422323a).get("iconId");
            java.lang.String str8 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
            java.lang.Object obj8 = ((java.util.HashMap) msg.f422323a).get("customIconDesc");
            java.lang.String str9 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
            java.lang.String str10 = str9 == null ? str : str9;
            java.lang.Object obj9 = ((java.util.HashMap) msg.f422323a).get("image");
            java.lang.String str11 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
            java.lang.Object obj10 = ((java.util.HashMap) msg.f422323a).get("desc");
            java.lang.String str12 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
            java.lang.Object obj11 = ((java.util.HashMap) msg.f422323a).get("jumpJSON");
            java.lang.String str13 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
            java.lang.Object obj12 = ((java.util.HashMap) msg.f422323a).get("hideToast");
            java.lang.String str14 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
            boolean z17 = str14 != null && java.lang.Integer.parseInt(str14) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "publishTextState params:" + msg.f422323a);
            java.util.List f17 = f(str13);
            if (g(str3, str6, str7, f17)) {
                bi4.c1 c1Var = new bi4.c1();
                c1Var.b(str8);
                bi4.d1 d1Var2 = c1Var.f102567a;
                d1Var2.f436470d.f436508g.f436751i = str10;
                c1Var.g(str6);
                c1Var.f(str3);
                c1Var.d(str4);
                c1Var.h(str5);
                c1Var.e(str7);
                d1Var2.f436471e = str11;
                c1Var.a(str12);
                c1Var.c(f17);
                d1Var2.f436485v = z17;
                d1Var = d1Var2;
            } else {
                d1Var = null;
                gVar.e(msg.f422546c, msg.f422552i + ":fail_invalid_arguments", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "fail_invalid_arguments");
            }
            if (d1Var == null) {
                return false;
            }
            e(env, msg, d1Var);
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail_run_subprocess", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "fail_run_subprocess");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "handleMsg: lite app id=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qa qaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qa(env, msg);
        java.lang.Object obj13 = ((java.util.HashMap) msg.f422323a).get("liteAppId");
        java.lang.String str15 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
        pj4.q0 q0Var = new pj4.q0();
        java.lang.Object obj14 = ((java.util.HashMap) msg.f422323a).get("sourceName");
        java.lang.String str16 = obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null;
        java.lang.Object obj15 = ((java.util.HashMap) msg.f422323a).get("sourceIconURL");
        java.lang.String str17 = obj15 instanceof java.lang.String ? (java.lang.String) obj15 : null;
        java.lang.Object obj16 = ((java.util.HashMap) msg.f422323a).get("sourceVerifyInfo");
        java.lang.String str18 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
        if (str18 == null) {
            str18 = str;
        }
        java.lang.Object obj17 = ((java.util.HashMap) msg.f422323a).get("iconId");
        java.lang.String str19 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
        java.lang.Object obj18 = ((java.util.HashMap) msg.f422323a).get("customIconDesc");
        java.lang.String str20 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
        str = str20 != null ? str20 : "";
        java.lang.Object obj19 = ((java.util.HashMap) msg.f422323a).get("image");
        java.lang.String str21 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
        java.lang.Object obj20 = ((java.util.HashMap) msg.f422323a).get("desc");
        java.lang.String str22 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
        java.lang.Object obj21 = ((java.util.HashMap) msg.f422323a).get("hideToast");
        java.lang.String str23 = obj21 instanceof java.lang.String ? (java.lang.String) obj21 : null;
        boolean z18 = str23 != null && java.lang.Integer.parseInt(str23) == 1;
        java.lang.Object obj22 = ((java.util.HashMap) msg.f422323a).get("jumpJSON");
        java.lang.String str24 = obj22 instanceof java.lang.String ? (java.lang.String) obj22 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "publishTextState params:" + msg.f422323a);
        java.util.List f18 = f(str24);
        q0Var.f436790d = str16;
        q0Var.f436791e = str17;
        q0Var.f436792f = str19;
        q0Var.f436793g = str21;
        q0Var.f436794h = str22;
        q0Var.f436795i = z18;
        q0Var.f436797n = str18;
        q0Var.f436796m.addAll(f18);
        pj4.c cVar = new pj4.c();
        cVar.f436534d = str15;
        cVar.f436535e = q0Var;
        android.content.Context context = env.f422393a;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        e4Var.f293313g = 2;
        e4Var.f293311e = false;
        f268024e = e4Var.c();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 29559;
        lVar.f152199c = " /cgi-bin/micromsg-bin/liteapp/liteapp_checktextstate";
        lVar.f152197a = cVar;
        lVar.f152198b = new pj4.d();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.na(env, msg, qaVar, str19, str, str21, str22, z18));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60886x8f27a73c;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "publishTextState";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_status_jsapi_subprocess, 1) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(nw4.k r4, nw4.y2 r5, bi4.d1 r6) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "KEY_REQUEST_DATA"
            byte[] r6 = r6.mo14344x5f01b1f6()
            r0.putByteArray(r1, r6)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.pa r6 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.pa
            r6.<init>(r4, r5)
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            if (r5 != 0) goto L2d
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)
            e42.e0 r5 = (e42.e0) r5
            e42.d0 r1 = e42.d0.clicfg_text_status_jsapi_subprocess
            h62.d r5 = (h62.d) r5
            r2 = 1
            int r5 = r5.Ni(r1, r2)
            if (r5 != r2) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L61
            android.content.Context r5 = r4.f422393a
            boolean r5 = r5 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
            if (r5 == 0) goto L61
            java.lang.String r5 = "MicroMsg.JsApiPublishTextState"
            java.lang.String r1 = "user LuggageActivityHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            android.content.Context r5 = r4.f422393a
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r5, r1)
            com.tencent.mm.ui.MMFragmentActivity r5 = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) r5
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtras(r0)
            android.content.Context r4 = r4.f422393a
            java.lang.Class<com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19299x4f9f7842.class
            r1.setClass(r4, r0)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.oa r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.oa
            r4.<init>(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.m78743x70d84175(r4, r1, r6)
            goto L68
        L61:
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.ma> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ma.class
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(r4, r0, r5, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra.e(nw4.k, nw4.y2, bi4.d1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02a9 A[Catch: all -> 0x02d9, TryCatch #1 {all -> 0x02d9, blocks: (B:13:0x001b, B:15:0x0028, B:18:0x002f, B:20:0x0035, B:27:0x02a9, B:33:0x02b7, B:38:0x02c3, B:75:0x029d), top: B:12:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c3 A[Catch: all -> 0x02d9, TRY_LEAVE, TryCatch #1 {all -> 0x02d9, blocks: (B:13:0x001b, B:15:0x0028, B:18:0x002f, B:20:0x0035, B:27:0x02a9, B:33:0x02b7, B:38:0x02c3, B:75:0x029d), top: B:12:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d2 A[LOOP:0: B:18:0x002f->B:42:0x02d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e2 A[EDGE_INSN: B:43:0x02e2->B:7:0x02e2 BREAK  A[LOOP:0: B:18:0x002f->B:42:0x02d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5 A[Catch: all -> 0x029c, TryCatch #3 {all -> 0x029c, blocks: (B:66:0x00e4, B:70:0x0101, B:71:0x0107, B:80:0x011f, B:83:0x012d, B:84:0x017b, B:87:0x0189, B:88:0x01af, B:91:0x01bd, B:92:0x01e5, B:95:0x01f3, B:97:0x0215, B:101:0x023e, B:102:0x0244, B:106:0x0256, B:107:0x025c, B:108:0x0292, B:113:0x028a), top: B:65:0x00e4, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra.f(java.lang.String):java.util.List");
    }

    public final boolean g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List jumpInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfos, "jumpInfos");
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceId");
            return false;
        }
        if (str2 == null || r26.n0.N(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceName");
            return false;
        }
        if (str3 == null || r26.n0.N(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceIconUrl");
            return false;
        }
        if (!jumpInfos.isEmpty()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "invalid jumpInfos");
        return false;
    }

    public final java.lang.String h(android.net.Uri uri, java.lang.String str) {
        java.lang.String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return "";
        }
        java.lang.String decode = java.net.URLDecoder.decode(queryParameter, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        return decode;
    }
}
