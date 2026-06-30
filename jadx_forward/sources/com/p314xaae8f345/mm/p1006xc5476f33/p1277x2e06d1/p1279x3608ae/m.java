package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes9.dex */
public class m implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c f175305a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c activityC12934x73bfb80c) {
        this.f175305a = activityC12934x73bfb80c;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9;
        m33.b1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c activityC12934x73bfb80c = this.f175305a;
        if (sVar == null) {
            activityC12934x73bfb80c.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onResume mHasHandled: %b", java.lang.Boolean.valueOf(activityC12934x73bfb80c.f175134g));
        if (activityC12934x73bfb80c.f175134g) {
            return;
        }
        activityC12934x73bfb80c.f175134g = true;
        android.os.Bundle extras = activityC12934x73bfb80c.f175133f.getExtras();
        if (activityC12934x73bfb80c.isFinishing() || extras == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(extras == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "handleWXAppMessage fail data null:%b", objArr);
            activityC12934x73bfb80c.finish();
            return;
        }
        activityC12934x73bfb80c.f175131d = extras.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        activityC12934x73bfb80c.f175132e = extras.getInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593);
        java.lang.String string = extras.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "content is null");
            activityC12934x73bfb80c.finish();
            return;
        }
        java.lang.String queryParameter = android.net.Uri.parse(string).getQueryParameter("appid");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.t(queryParameter) && (a17 = m33.a1.a()) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Ri(activityC12934x73bfb80c, queryParameter, activityC12934x73bfb80c.f175131d);
        }
        int i17 = extras.getInt("_wxapi_command_type");
        try {
            extras.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", false);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "handle wxapp message: " + activityC12934x73bfb80c.f175131d + ", sdkver=" + activityC12934x73bfb80c.f175132e + ", cmd=" + i17);
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req(extras);
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = req.f33049x38eb0007;
                if (c11286x34a5504 != null && c11286x34a5504.m48467xfb85f7b0() == 2 && (c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) req.f33049x38eb0007.f33122xe4128443) != null && !c11283x90d63ed9.mo48449x17b96605()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, WXImageObject checkArgs fail, maybe use deprecated field imageUrl");
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC12934x73bfb80c, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC12934x73bfb80c.getIntent().getExtras(), -5), true, false);
                    activityC12934x73bfb80c.finish();
                    return;
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = req.f33049x38eb0007;
                if (c11286x34a55042 != null && c11286x34a55042.m48467xfb85f7b0() == 38) {
                    int i18 = req.f33050x683188c;
                    if (!(i18 == 1 || i18 == 3 || i18 == 4 || i18 == 0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, video file object only supported share to timeline/chat");
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC12934x73bfb80c, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC12934x73bfb80c.getIntent().getExtras(), -5), true, false);
                        activityC12934x73bfb80c.finish();
                        return;
                    }
                }
                int i19 = req.f33050x683188c;
                if (i19 == 1 || i19 == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "sendMessageToWx, req.scene = %s", java.lang.Integer.valueOf(i19));
                    if (req.f33049x38eb0007.m48467xfb85f7b0() != 8) {
                        new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.k(activityC12934x73bfb80c, queryParameter, req.f32865xc3c3c505, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.o(activityC12934x73bfb80c, extras, req)).a();
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "sendMessageToWx fail, emoji does not support WXSceneTimeline");
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC12934x73bfb80c, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC12934x73bfb80c.getIntent().getExtras(), -5), true, false);
                    activityC12934x73bfb80c.finish();
                    return;
                }
                if (i19 == 3) {
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.k(activityC12934x73bfb80c, queryParameter, req.f32865xc3c3c505, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.q(activityC12934x73bfb80c, extras, req)).a();
                    return;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f a18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(extras, -2);
                android.content.Intent intent = new android.content.Intent(activityC12934x73bfb80c, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
                int i27 = extras.getInt("SELECT_CONVERSATION_TYPE_FROM_TRANS_LINK", 0);
                if (i27 == 4) {
                    intent.putExtra("search_range", new int[]{131072});
                } else if (i27 == 16) {
                    intent.putExtra("search_range", new int[]{131075});
                }
                intent.putExtra("scene_from", 24);
                intent.putExtra("Select_Conv_Type", 3 | i27);
                intent.putExtra("Select_Report_Args", a18);
                intent.putExtra("Select_Conv_NextStep", new android.content.Intent(activityC12934x73bfb80c, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class).putExtras(extras).putExtra("SendAppMessageWrapper_Scene", req.f33050x683188c).putExtra("animation_pop_in", true));
                intent.putExtra("Select_App_Id", queryParameter);
                intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
                intent.putExtra("Select_Open_Id", req.f32865xc3c3c505);
                if (req.f33049x38eb0007.m48467xfb85f7b0() == 36 || req.f33049x38eb0007.m48467xfb85f7b0() == 46) {
                    intent.putExtra("mutil_select_is_ret", !((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) req.f33049x38eb0007.f33122xe4128443).f33179x4d2e325);
                } else {
                    intent.putExtra("mutil_select_is_ret", true);
                }
                if (req.f33049x38eb0007.m48467xfb85f7b0() == 45) {
                    intent.putExtra("Select_Send_Card", true);
                }
                if (!gm0.j1.a() || gm0.m.r()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC12934x73bfb80c, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC12934x73bfb80c.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC12934x73bfb80c, "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                activityC12934x73bfb80c.finish();
                return;
            }
            if (i17 != 3) {
                if (i17 == 4) {
                    if (!gm0.j1.a() || gm0.m.r()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
                    } else {
                        l75.v0 v0Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ue.f284277c;
                        v0Var.d(extras);
                        v0Var.c();
                    }
                }
            } else if (!gm0.j1.a() || gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
            } else {
                l75.v0 v0Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe.f284161d;
                v0Var2.d(extras);
                v0Var2.c();
            }
        } else if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "handleWXAppMessage  COMMAND_SENDAUTH start SDKOAuthUI");
            android.content.Intent putExtras = new android.content.Intent().putExtras(extras);
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2513x5e818e54.C19948x91ca03ab()) == 1;
            if (!(true ^ ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).n()) || z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "do auth directly!");
                j45.l.j(activityC12934x73bfb80c, "webview", ".ui.tools.SDKOAuthUI", putExtras, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "overseas user, need to do extra auth!");
                j45.l.j(activityC12934x73bfb80c, "webview", ".ui.tools.SDKOAuthWechatUI", putExtras, null);
            }
        }
        activityC12934x73bfb80c.finish();
    }
}
