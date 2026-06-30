package uy3;

/* loaded from: classes8.dex */
public final class u0 extends uy3.o {

    /* renamed from: b, reason: collision with root package name */
    public final wq1.d f513530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(wq1.d uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f513530b = uiComponent;
    }

    public final boolean b(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        wq1.d dVar = this.f513530b;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage fail, username is null");
            dp.a.m125854x26a183b(dVar.H(), dVar.H().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, 3, -1), 0).show();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage success, username is " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 300);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        j45.l.j(dVar.H(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        return true;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: closePage */
    public final void m170716xe33bf8a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi closePage: %s", str);
        ((ku5.t0) ku5.t0.f394148d).B(new uy3.t0(this));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openAdPage */
    public final void m170717xf51ecc3c(java.lang.String params) {
        wq1.d dVar = this.f513530b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(params);
            java.lang.String optString = jSONObject.optString("adXml", "");
            java.lang.String optString2 = jSONObject.optString("uxinfo", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openAdPage, adXml=" + optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landing_pages_xml", optString);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_ux_info", optString2);
            if (dVar.H() != null) {
                j45.l.j(dVar.H(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxWebViewJSApi", e17, "openAdPage exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openProfilePage */
    public final void m170718x9d30f32e(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openProfilePage result: %b", java.lang.Boolean.valueOf(b(new org.json.JSONObject(params).optString(dm.i4.f66875xa013b0d5, ""))));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxWebViewJSApi", e17, "openProfilePage exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openVideoPage */
    public final void m170719x4534a280(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage param = ".concat(params));
        try {
            java.lang.String optString = new org.json.JSONObject(params).optString("videoUrl", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage videoUrl null");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            android.content.Context H = this.f513530b.H();
            if (H != null) {
                j45.l.j(H, "brandservice", ".ui.timeline.video.lite.VideoLiteUI", intent, null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openWebView */
    public final void m170720x3d315a6f(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openWebView %s", params);
        try {
            java.lang.String optString = new org.json.JSONObject(params).optString("url", "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            intent.putExtra("geta8key_scene", 67);
            android.content.Context H = this.f513530b.H();
            if (H != null) {
                j45.l.j(H, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxWebViewJSApi", e17, "openWebView exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: showShareMenu */
    public final void m170721x7b772361(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55043;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55044;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi showShareMenu: %s", str);
        android.content.Context H = this.f513530b.H();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(H, "getActivityContext(...)");
        uy3.r0 r0Var = uy3.r0.f513523d;
        uy3.r0 r0Var2 = uy3.r0.f513523d;
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("url");
            uy3.p0 p0Var = uy3.r0.f513526g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p0Var.getClass();
            uy3.r0.f513525f = (uy3.o0) p0Var.f513521a.get(optString);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToFriend, imageUrl: ");
            uy3.o0 o0Var = uy3.r0.f513525f;
            sb6.append(o0Var != null ? o0Var.f513520b : null);
            sb6.append(", desc: ");
            uy3.o0 o0Var2 = uy3.r0.f513525f;
            sb6.append((o0Var2 == null || (c11286x34a55044 = o0Var2.f513519a) == null) ? null : c11286x34a55044.f33121x993583fc);
            sb6.append(", title: ");
            uy3.o0 o0Var3 = uy3.r0.f513525f;
            sb6.append((o0Var3 == null || (c11286x34a55043 = o0Var3.f513519a) == null) ? null : c11286x34a55043.f33130x6942258);
            sb6.append(", url: ");
            sb6.append(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxShareHelper", sb6.toString());
            java.util.HashMap hashMap = new java.util.HashMap();
            uy3.o0 o0Var4 = uy3.r0.f513525f;
            java.lang.String str4 = "";
            if (o0Var4 == null || (str2 = o0Var4.f513520b) == null) {
                str2 = "";
            }
            hashMap.put("img_url", str2);
            uy3.o0 o0Var5 = uy3.r0.f513525f;
            java.lang.String str5 = (o0Var5 == null || (c11286x34a55042 = o0Var5.f513519a) == null) ? null : c11286x34a55042.f33121x993583fc;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("desc", str5);
            uy3.o0 o0Var6 = uy3.r0.f513525f;
            java.lang.String str6 = (o0Var6 == null || (c11286x34a5504 = o0Var6.f513519a) == null) ? null : c11286x34a5504.f33130x6942258;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str6);
            hashMap.put("url", optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("webview_params", hashMap);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 2);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 2);
            if (H instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                uy3.o0 o0Var7 = uy3.r0.f513525f;
                if (o0Var7 != null && (str3 = o0Var7.f513520b) != null) {
                    str4 = str3;
                }
                if (!(str4.length() == 0) && r26.i0.y(str4, "http", false)) {
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str4, null);
                }
                j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) H, ".ui.transmit.SelectConversationUI", intent, 1, r0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxShareHelper", e17, "shareToFriend exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: updateShareData */
    public final void m170722xe9876560(java.lang.String str) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi updateShareData: %s", str);
        uy3.r0 r0Var = uy3.r0.f513523d;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanBoxShareHelper", "updateShareData params is invalid");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        int optInt = jSONObject.optInt("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxShareHelper", "updateShareData action: %d", java.lang.Integer.valueOf(optInt));
        if (optInt == 1) {
            java.lang.String optString = jSONObject.optString("url");
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String optString3 = jSONObject.optString("desc");
            java.lang.String optString4 = jSONObject.optString("image_url");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxShareHelper", "shareToFriend, imageUrl: " + optString4 + ", desc: " + optString3 + ", title: " + optString2 + ", url: " + optString);
            java.lang.String optString5 = jSONObject.optString("url");
            java.lang.String str2 = optString5 != null ? optString5 : "";
            if (str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg fail, url is null");
                c11286x34a5504 = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg url: %s", str2);
                c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
                c11300x89dbd7a1.f33249xa1713a8c = str2;
                c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
                c11286x34a5504.f33130x6942258 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                c11286x34a5504.f33121x993583fc = jSONObject.optString("desc");
            }
            uy3.o0 o0Var = new uy3.o0(c11286x34a5504, optString4);
            uy3.p0 p0Var = uy3.r0.f513526g;
            p0Var.getClass();
            p0Var.f513521a.put(optString, o0Var);
        }
    }
}
