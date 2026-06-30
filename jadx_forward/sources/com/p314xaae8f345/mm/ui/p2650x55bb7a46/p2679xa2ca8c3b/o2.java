package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class o2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286497s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.g6 f286498t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.j6 f286499u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.h6 f286500v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.k6 f286501w;

    /* JADX WARN: Removed duplicated region for block: B:34:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d0(ot0.q r16, yb5.d r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq r19) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.d0(ot0.q, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r4.equals(r14) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e0(ot0.q r18, yb5.d r19, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r20, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.e0(ot0.q, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):boolean");
    }

    public static boolean f0(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        java.lang.String str = qVar.f430207k;
        int i17 = 0;
        if (str == null || str.equals("")) {
            return false;
        }
        if (ca4.n0.d(qVar.C2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landig_pages_from_source", 5);
            intent.putExtra("msg_id", f9Var.m124847x74d37ac6());
            intent.putExtra("msg_talker", f9Var.Q0());
            intent.putExtra("sns_landing_pages_xml", qVar.C2);
            intent.putExtra("sns_landing_pages_share_thumb_url", f9Var.z0());
            intent.addFlags(268435456);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleDefaultClickTo, selfUserName is " + c01.z1.r() + ", extraData is " + ca4.m0.A(dVar.f542249k, f9Var.Q0()));
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
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
            su4.r2.r(dVar.g(), pm4.w.q(y97Var, 32, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573706fh3)));
            pm4.y.e(y97Var, f9Var);
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, dVar.D() ? "groupmessage" : "singlemessage");
        java.lang.String str2 = qVar.f430207k;
        android.content.pm.PackageInfo j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), qVar.f430179d);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", wi6);
        intent2.putExtra("webpageTitle", qVar.f430187f);
        java.lang.String str3 = qVar.f430179d;
        if (str3 != null && ("wx751a1acca5688ba3".equals(str3) || "wxfbc915ff7c30e335".equals(qVar.f430179d) || "wx482a4001c37e2b74".equals(qVar.f430179d))) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("jsapi_args_appid", qVar.f430179d);
            intent2.putExtra("jsapiargs", bundle);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent2.putExtra("shortUrl", qVar.f430207k);
        } else {
            intent2.putExtra("shortUrl", str2);
        }
        intent2.putExtra("version_name", j17 == null ? null : j17.versionName);
        intent2.putExtra("version_code", j17 == null ? 0 : j17.versionCode);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430255w)) {
            intent2.putExtra("srcUsername", qVar.f430255w);
            intent2.putExtra("srcDisplayname", qVar.f430259x);
        }
        intent2.putExtra("msg_id", f9Var.m124847x74d37ac6());
        intent2.putExtra("msg_talker", f9Var.Q0());
        intent2.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("KAppId", qVar.f430179d);
        intent2.putExtra("geta8key_username", dVar.x());
        intent2.putExtra("pre_username", qqVar.a(dVar, f9Var));
        intent2.putExtra("from_scence", 2);
        intent2.putExtra("expid_str", com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.l(f9Var));
        intent2.putExtra("key_enable_teen_mode_check", true);
        intent2.putExtra("key_enable_fts_quick", true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.q(intent2, f9Var, qVar);
        int a17 = c01.h2.a(qqVar.a(dVar, f9Var), dVar.x());
        intent2.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("preUsername", qqVar.a(dVar, f9Var));
        intent2.putExtra("preChatName", dVar.x());
        intent2.putExtra("preChatTYPE", a17);
        intent2.putExtra("preMsgIndex", 0);
        if (a17 == 1) {
            i17 = 3;
        } else if (a17 == 2) {
            i17 = 2;
        } else if (a17 == 6 || a17 == 7) {
            i17 = 5;
        }
        intent2.putExtra("share_report_pre_msg_url", qVar.f430207k);
        intent2.putExtra("share_report_pre_msg_title", qVar.f430187f);
        intent2.putExtra("share_report_pre_msg_desc", qVar.f430191g);
        intent2.putExtra("share_report_pre_msg_icon_url", qVar.f430267z);
        intent2.putExtra("share_report_pre_msg_appid", qVar.f430179d);
        intent2.putExtra("share_report_from_scene", i17);
        if (i17 == 5) {
            intent2.putExtra("share_report_biz_username", dVar.x());
        }
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
        return true;
    }

    public static boolean g0(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
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
        intent.putExtra("blacklist_file_md5", te5.p1.a(f9Var));
        int a17 = c01.h2.a(str, dVar.x());
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", dVar.x());
        intent.putExtra("preChatTYPE", a17);
        intent.putExtra("msgUsername", dVar.f542249k);
        intent.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent.putExtra("chatTypeForAppbrand", k01.d.a(dVar.x()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.c(intent, dVar, f9Var);
        com.p314xaae8f345.mm.p959x883644fd.b.a(f9Var);
        j45.l.j(dVar.g(), "record", ".ui.RecordMsgDetailUI", intent, null);
        return true;
    }

    public static boolean h0(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.l(dVar, qVar, f9Var, str)) {
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        java.lang.String wi7 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430211l, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        android.content.pm.PackageInfo j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), qVar.f430179d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.n(dVar, wi6, wi7, j17 == null ? null : j17.versionName, j17 == null ? 0 : j17.versionCode, qVar.f430179d, true, f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var, qVar, str);
        return true;
    }

    public static boolean i0(ot0.q qVar, android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        java.lang.String str;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0())) {
            el0.i.b(false, f9Var.I0(), f9Var.Q0());
        }
        if (ca4.n0.d(qVar.C2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landig_pages_from_source", 5);
            intent.putExtra("msg_id", f9Var.m124847x74d37ac6());
            intent.putExtra("msg_talker", f9Var.Q0());
            intent.putExtra("sns_landing_pages_xml", qVar.C2);
            intent.putExtra("sns_landing_pages_share_thumb_url", f9Var.z0());
            java.lang.String A = ca4.m0.A(dVar.f542249k, f9Var.Q0());
            if (!android.text.TextUtils.isEmpty(A)) {
                intent.putExtra("sns_landing_pages_extra", A);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleUrlClickTo, selfUserName is " + c01.z1.r() + ", extraData is " + A);
            intent.addFlags(268435456);
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
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
            su4.r2.r(dVar.g(), pm4.w.q(y97Var, 32, dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573706fh3)));
            pm4.y.e(y97Var, f9Var);
            return true;
        }
        java.lang.String str2 = qVar.f430207k;
        if (str2 == null || str2.equals("")) {
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, dVar.D() ? "groupmessage" : "singlemessage");
        java.lang.String str3 = qVar.f430211l;
        int a17 = c01.h2.a(qqVar.a(dVar, f9Var), dVar.x());
        int intExtra = dVar.g().getIntent().getIntExtra("KOpenArticleSceneFromScene", a17 == 2 ? qf1.f.f76475x366c91de : qf1.j.f76479x366c91de);
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(wi6)) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            wi6 = ot0.g0.a(wi6, 1, intExtra, currentTimeMillis);
            str = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(f9Var);
        } else {
            str = null;
        }
        android.content.pm.PackageInfo j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), qVar.f430179d);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", wi6);
        java.lang.String str4 = wi6;
        intent2.putExtra("webpageTitle", qVar.f430187f);
        intent2.putExtra("msgUsername", dVar.f542249k);
        intent2.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent2.putExtra("KMsgType", f9Var.mo78013xfb85f7b0());
        intent2.putExtra("KAppMsgType", qVar.f430199i);
        intent2.putExtra("KShareTraceLastGMsgId", str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", qVar.Y1);
        java.lang.String str5 = qVar.f430179d;
        if (str5 != null && ("wx751a1acca5688ba3".equals(str5) || "wxfbc915ff7c30e335".equals(qVar.f430179d) || "wx482a4001c37e2b74".equals(qVar.f430179d))) {
            bundle.putString("jsapi_args_appid", qVar.f430179d);
        }
        intent2.putExtra("jsapiargs", bundle);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            intent2.putExtra("shortUrl", qVar.f430207k);
        } else {
            intent2.putExtra("shortUrl", str3);
        }
        intent2.putExtra("version_name", j17 == null ? null : j17.versionName);
        intent2.putExtra("version_code", j17 == null ? 0 : j17.versionCode);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430255w)) {
            intent2.putExtra("srcUsername", qVar.f430255w);
            intent2.putExtra("srcDisplayname", qVar.f430259x);
        }
        intent2.putExtra("msg_id", f9Var.m124847x74d37ac6());
        intent2.putExtra("msg_talker", f9Var.Q0());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.q(intent2, f9Var, qVar);
        intent2.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("KAppId", qVar.f430179d);
        intent2.putExtra("geta8key_username", dVar.x());
        intent2.putExtra("pre_username", qqVar.a(dVar, f9Var));
        intent2.putExtra("from_scence", 2);
        intent2.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("preUsername", qqVar.a(dVar, f9Var));
        intent2.putExtra("preChatName", dVar.x());
        intent2.putExtra("preChatTYPE", a17);
        int i17 = 0;
        intent2.putExtra("preMsgIndex", 0);
        if (a17 == 1) {
            i17 = 3;
        } else if (a17 == 2) {
            i17 = 2;
        } else if (a17 == 6 || a17 == 7) {
            i17 = 5;
        }
        intent2.putExtra("share_report_pre_msg_url", qVar.f430207k);
        intent2.putExtra("share_report_pre_msg_title", qVar.f430187f);
        intent2.putExtra("share_report_pre_msg_desc", qVar.f430191g);
        intent2.putExtra("share_report_pre_msg_icon_url", qVar.f430267z);
        intent2.putExtra("share_report_pre_msg_appid", qVar.f430179d);
        intent2.putExtra("geta8key_scene", 1);
        intent2.putExtra("share_report_from_scene", i17);
        if (i17 == 5) {
            intent2.putExtra("share_report_biz_username", dVar.x());
        }
        ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
        int i18 = fVar != null ? fVar.f429988b : -1;
        intent2.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, i18);
        intent2.putExtra("key_enable_teen_mode_check", true);
        intent2.putExtra("key_enable_fts_quick", true);
        intent2.putExtra("msgUsername", dVar.f542249k);
        intent2.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        if (fVar == null || i18 != 16) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.j(qVar, dVar, intent2);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(3)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(dVar.g(), str4, i18, false, 1, intExtra, intent2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgTo", "jump to TmplWebview");
                    return true;
                }
            }
            intent2.putExtra("pay_chat_type", k01.d.a(dVar.x()));
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
            return true;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("biz_video_scene", 1);
        bundle2.putInt(com.p314xaae8f345.mm.ui.j2.f290523a, intExtra);
        bundle2.putInt("geta8key_scene", 1);
        bundle2.putString("geta8key_username", dVar.x());
        bundle2.putString("webpageTitle", qVar.f430187f);
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
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1w);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1();
        v1Var.b(xgVar, false);
        xgVar.setTag(v1Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId == 103) {
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                return false;
            }
            ot0.q v18 = ot0.q.v(j17);
            if (v18 != null && v18.f430199i == 16) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa c5628xba03adfa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa();
                java.lang.String str = v18.T0;
                am.yg ygVar = c5628xba03adfa.f135956g;
                ygVar.f89991a = str;
                ygVar.f89992b = f9Var.m124847x74d37ac6();
                ygVar.f89993c = f9Var.Q0();
                c5628xba03adfa.e();
            }
        } else {
            if (itemId == 111) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.o2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ot0.q v19;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2 o2Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.this;
                        yb5.d dVar3 = dVar;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                        if (f9Var2 != null) {
                            o2Var.getClass();
                            if (f9Var2.k2() && (v19 = ot0.q.v(f9Var2.j())) != null) {
                                int i17 = v19.f430199i;
                                if (i17 == 40) {
                                    db5.e1.y(dVar3.g(), dVar3.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", dVar3.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                                    return;
                                } else if (i17 == 33 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionAppbrand.k(dVar3.g(), null)) {
                                    return;
                                }
                            }
                        }
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(dVar3, f9Var2, o2Var.A(dVar3, f9Var2), -1, null);
                    }
                });
                return false;
            }
            if (itemId == 114) {
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
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
            if (itemId != 173) {
                if (itemId != 174) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgTo", "[onYuanBaoSummaryFileClick] AppMsgUrl, msgId: ${msg.msgId}");
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
                ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).hj(dVar.g(), f9Var, dVar.u());
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).vj(f9Var, dVar.x());
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgTo", "[onYuanBaoSummaryArticleClick] AppMsgUrl, msgId: ${msg.msgId}");
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).ij(dVar.g(), f9Var, dVar.u());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).wj(f9Var, dVar.x());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x014d, code lost:
    
        if (r01.q3.cj().u1(64) > 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0168, code lost:
    
        if (r01.q3.cj().u1(1) > 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d4, code lost:
    
        if (r3 != 20) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bc  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r17, android.view.View r18, rd5.d r19) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        if (r7 != 103) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(android.view.View r28, yb5.d r29, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r30) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.R(android.view.View, yb5.d, com.tencent.mm.storage.f9):boolean");
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

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2(this, f9Var, dVar), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q2(this));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0288. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022f  */
    @Override // we5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(final yb5.d r30, rd5.d r31, final java.lang.String r32, we5.y0 r33) {
        /*
            Method dump skipped, instructions count: 2772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2.e(yb5.d, rd5.d, java.lang.String, we5.y0):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1) g0Var));
    }
}
