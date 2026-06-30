package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class c2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285055s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.g6 f285056t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.j6 f285057u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.h6 f285058v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.k6 f285059w;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0285 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0287 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d0(ot0.q r16, yb5.d r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq r19) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.d0(ot0.q, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):boolean");
    }

    public static boolean e0(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.G) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.I)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgFrom", "hy: no remote url provided. treat as default");
            return false;
        }
        java.lang.String str = aVar.G;
        java.lang.String str2 = aVar.E;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429878J) ? qVar.f430191g : aVar.f429878J;
        java.lang.String str4 = aVar.H;
        java.lang.String str5 = qVar.f430210k2;
        java.lang.String str6 = aVar.I;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFrom", "hy: request start videoUrl: %s, localPath: %s, videoDesc: %s, videoButtonText: %s, appid: %s, videoThumbUrl: %s", str, str2, str3, str4, str5, str6);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.x()) ? 2 : 1);
        objArr[1] = str5;
        objArr[2] = 1;
        objArr[3] = 1;
        g0Var.d(17608, objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgFrom", "hy: video msg invalid!!");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_chatting_wording", str3);
            bundle.putString("key_chatting_text", str4);
            bundle.putString("key_chatting_appid", str5);
            bundle.putLong("key_msg_id", f9Var.m124847x74d37ac6());
            bundle.putString("key_talker_username", dVar.x());
            bundle.putString("key_sender_username", qqVar.a(dVar, f9Var));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.g(dVar, str, str2, str6, true, bundle);
        }
        return true;
    }

    public static boolean f0(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        if (i17 != 19) {
            return false;
        }
        if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).oj(f9Var.Q0())) {
            te5.t.f(dVar, f9Var);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", f9Var.m124847x74d37ac6());
        intent.putExtra("message_talker", f9Var.Q0());
        intent.putExtra("Retr_Security_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_Security_Msg_Talker", f9Var.Q0());
        intent.putExtra("big_appmsg", z17);
        intent.putExtra("blacklist_file_md5", te5.p1.a(f9Var));
        int a17 = c01.h2.a(str2, dVar.x());
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent.putExtra("preUsername", str2);
        intent.putExtra("preChatName", dVar.x());
        intent.putExtra("preChatTYPE", a17);
        intent.putExtra("msgUsername", str);
        intent.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent.putExtra("chatTypeForAppbrand", k01.d.a(dVar.x()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.c(intent, dVar, f9Var);
        com.p314xaae8f345.mm.p959x883644fd.b.a(f9Var);
        j45.l.j(dVar.g(), "record", ".ui.RecordMsgDetailUI", intent, null);
        return true;
    }

    public static boolean g0(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (iq.b.C(dVar.g()) || iq.b.v(dVar.g()) || iq.b.e(dVar.g())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFrom", "Voip is running, can't do this");
            return true;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.l(dVar, qVar, f9Var, str)) {
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        java.lang.String wi7 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430211l, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        android.content.pm.PackageInfo j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), qVar.f430179d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.n(dVar, wi6, wi7, j17 == null ? null : j17.versionName, j17 == null ? 0 : j17.versionCode, qVar.f430179d, true, f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var, qVar, str);
        return true;
    }

    public static boolean h0(ot0.q qVar, android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String str2 = qVar.f430207k;
        if (str2 == null || str2.equals("")) {
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0())) {
            el0.i.b(true, f9Var.I0(), f9Var.Q0());
        }
        if (ca4.n0.d(qVar.C2)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("sns_landig_pages_from_source", 5);
            intent2.putExtra("msg_id", f9Var.m124847x74d37ac6());
            intent2.putExtra("msg_talker", f9Var.Q0());
            intent2.putExtra("sns_landing_pages_xml", qVar.C2);
            intent2.putExtra("sns_landing_pages_share_thumb_url", f9Var.z0());
            java.lang.String A = ca4.m0.A(qVar.I, f9Var.Q0());
            if (!android.text.TextUtils.isEmpty(A)) {
                intent2.putExtra("sns_landing_pages_extra", A);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleUrlClickFrom, selfUserName is " + c01.z1.r() + ", extraData is " + A);
            intent2.addFlags(268435456);
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent2, null);
            com.p314xaae8f345.mm.p959x883644fd.k0.j(f9Var);
            return true;
        }
        su4.l2 l2Var = (su4.l2) qVar.y(su4.l2.class);
        if (l2Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l2Var.f494516b)) {
            r45.y97 y97Var = new r45.y97();
            y97Var.f472431d = l2Var.f494516b;
            y97Var.f472432e = l2Var.f494517c;
            y97Var.f472433f = l2Var.f494518d;
            y97Var.f472434g = l2Var.f494519e;
            y97Var.f472435h = l2Var.f494520f;
            y97Var.f472436i = l2Var.f494529o;
            y97Var.f472437m = l2Var.f494521g;
            y97Var.f472438n = l2Var.f494522h;
            y97Var.f472439o = l2Var.f494523i;
            y97Var.f472440p = l2Var.f494524j;
            y97Var.f472441q = l2Var.f494525k;
            y97Var.f472442r = l2Var.f494526l;
            y97Var.f472443s = l2Var.f494527m;
            y97Var.f472444t = l2Var.f494528n;
            y97Var.f472445u = l2Var.f494530p;
            y97Var.f472447w = l2Var.f494532r;
            y97Var.f472448x = l2Var.f494533s;
            y97Var.f472450z = l2Var.f494535u;
            y97Var.f472446v = l2Var.f494531q;
            r45.un6 q17 = pm4.w.q(y97Var, 32, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573706fh3));
            pm4.y.e(y97Var, f9Var);
            su4.r2.r(dVar.g(), q17);
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, dVar.D() ? "groupmessage" : "singlemessage");
        java.lang.String str3 = qVar.f430207k;
        android.content.pm.PackageInfo j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), qVar.f430179d);
        android.content.Intent intent3 = new android.content.Intent();
        int intExtra = dVar.g().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(wi6)) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            wi6 = ot0.g0.a(wi6, 1, intExtra, currentTimeMillis);
            str = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(f9Var);
        } else {
            str = null;
        }
        intent3.putExtra("rawUrl", wi6);
        intent3.putExtra("webpageTitle", qVar.f430187f);
        intent3.putExtra("KShareTraceLastGMsgId", str);
        java.lang.String str4 = qVar.f430179d;
        if (str4 != null && ("wx751a1acca5688ba3".equals(str4) || "wxfbc915ff7c30e335".equals(qVar.f430179d) || "wx482a4001c37e2b74".equals(qVar.f430179d))) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("jsapi_args_appid", qVar.f430179d);
            intent3.putExtra("jsapiargs", bundle);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            intent3.putExtra("shortUrl", qVar.f430207k);
        } else {
            intent3.putExtra("shortUrl", str3);
        }
        intent3.putExtra("version_name", j17 == null ? null : j17.versionName);
        intent3.putExtra("version_code", j17 == null ? 0 : j17.versionCode);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430255w)) {
            intent3.putExtra("srcUsername", qVar.f430255w);
            intent3.putExtra("srcDisplayname", qVar.f430259x);
        }
        intent3.putExtra("msg_id", f9Var.m124847x74d37ac6());
        intent3.putExtra("msg_talker", f9Var.Q0());
        intent3.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent3.putExtra("KAppId", qVar.f430179d);
        intent3.putExtra("geta8key_username", dVar.x());
        intent3.putExtra("pre_username", qqVar.a(dVar, f9Var));
        int i17 = 2;
        intent3.putExtra("from_scence", 2);
        intent3.putExtra("expid_str", com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.l(f9Var));
        intent3.putExtra("msgUsername", qVar.I);
        intent3.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent3.putExtra("KMsgType", f9Var.mo78013xfb85f7b0());
        intent3.putExtra("KAppMsgType", qVar.f430199i);
        int a17 = c01.h2.a(qqVar.a(dVar, f9Var), dVar.x());
        intent3.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent3.putExtra("preUsername", qqVar.a(dVar, f9Var));
        intent3.putExtra("preChatName", dVar.x());
        intent3.putExtra("preChatTYPE", a17);
        intent3.putExtra("preMsgIndex", 0);
        if (a17 == 1) {
            i17 = 3;
        } else if (a17 != 2) {
            i17 = (a17 == 6 || a17 == 7) ? 5 : 0;
        }
        intent3.putExtra("share_report_pre_msg_url", qVar.f430207k);
        intent3.putExtra("share_report_pre_msg_title", qVar.f430187f);
        intent3.putExtra("share_report_pre_msg_desc", qVar.f430191g);
        intent3.putExtra("share_report_pre_msg_icon_url", qVar.f430267z);
        intent3.putExtra("share_report_pre_msg_appid", qVar.f430179d);
        intent3.putExtra("share_report_from_scene", i17);
        intent3.putExtra("geta8key_scene", 1);
        if (i17 == 5) {
            intent3.putExtra("share_report_biz_username", dVar.x());
        }
        ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
        int i18 = fVar != null ? fVar.f429988b : -1;
        intent3.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, i18);
        intent3.putExtra("key_enable_teen_mode_check", true);
        intent3.putExtra("key_enable_fts_quick", true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.j(qVar, dVar, intent3);
        intent3.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.q(intent3, f9Var, qVar);
        if (fVar == null || i18 != 16) {
            te5.t.i(dVar, f9Var, 0);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(3)) {
                intent = intent3;
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(dVar.g(), wi6, i18, false, 1, intExtra, intent)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFrom", "jump to TmplWebview");
                    return true;
                }
            } else {
                intent = intent3;
            }
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("biz_video_scene", 1);
        bundle2.putInt(com.p314xaae8f345.mm.ui.j2.f290523a, intExtra);
        bundle2.putInt("geta8key_scene", 1);
        bundle2.putString("geta8key_username", dVar.x());
        if (l2Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l2Var.f494516b)) {
            cy4.b.f306392a.d(l2Var.f494516b);
        }
        os1.a.a(dVar.g(), f9Var.m124847x74d37ac6(), f9Var.Q0(), f9Var.I0(), 0, bundle2);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1h);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1();
        v1Var.b(xgVar, true);
        xgVar.setTag(v1Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId == 111) {
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a(f9Var)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.c2$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2 c2Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.this;
                        yb5.d dVar3 = dVar;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(dVar3, f9Var2, c2Var.A(dVar3, f9Var2), -1, null);
                    }
                });
                return false;
            }
            db5.e1.y(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            return false;
        }
        if (itemId != 114) {
            if (itemId == 173) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFrom", "[onYuanBaoSummaryArticleClick] AppMsgUrl, msgId: ${msg.msgId}");
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
                ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).ij(dVar.g(), f9Var, dVar.u());
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).wj(f9Var, dVar.x());
                return false;
            }
            if (itemId != 174) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFrom", "[onYuanBaoSummaryFileClick] AppMsgUrl, msgId: ${msg.msgId}");
            ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).hj(dVar.g(), f9Var, dVar.u());
            ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).vj(f9Var, dVar.x());
            return false;
        }
        java.lang.String j17 = f9Var.j();
        if (j17 != null && (v17 = ot0.q.v(j17)) != null) {
            int i17 = v17.f430199i;
            if (i17 == 1) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.e(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()), dVar.g());
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.d(f9Var, dVar.g(), A(dVar, f9Var), dVar.D());
            } else if (i17 == 4) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.f(f9Var, dVar.g());
            } else if (i17 == 5) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.b(f9Var, c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()), dVar.g(), 128);
            } else if (i17 == 8) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.c(f9Var, dVar.g());
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x011d, code lost:
    
        if (r01.q3.cj().u1(64) > 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0138, code lost:
    
        if (r01.q3.cj().u1(1) > 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r17, android.view.View r18, rd5.d r19) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (e0(r5, r28, r29, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(r26)) == false) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02fa  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(android.view.View r27, yb5.d r28, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r29) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.R(android.view.View, yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u1(aVar);
    }

    @Override // we5.b
    public boolean c() {
        boolean z17 = od5.b.f426188a;
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2519x9a3d88b9.C20079xd1591538()) == 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x0348. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02eb  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // we5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(final yb5.d r34, final rd5.d r35, final java.lang.String r36, we5.y0 r37) {
        /*
            Method dump skipped, instructions count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.e(yb5.d, rd5.d, java.lang.String, we5.y0):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t1(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1) g0Var));
    }
}
