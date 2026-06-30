package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class m implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.UIEntryStub f93772a;

    public m(com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub) {
        this.f93772a = uIEntryStub;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject;
        m33.b1 a17;
        com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub = this.f93772a;
        if (sVar == null) {
            uIEntryStub.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onResume mHasHandled: %b", java.lang.Boolean.valueOf(uIEntryStub.f93601g));
        if (uIEntryStub.f93601g) {
            return;
        }
        uIEntryStub.f93601g = true;
        android.os.Bundle extras = uIEntryStub.f93600f.getExtras();
        if (uIEntryStub.isFinishing() || extras == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(extras == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "handleWXAppMessage fail data null:%b", objArr);
            uIEntryStub.finish();
            return;
        }
        uIEntryStub.f93598d = extras.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        uIEntryStub.f93599e = extras.getInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION);
        java.lang.String string = extras.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "content is null");
            uIEntryStub.finish();
            return;
        }
        java.lang.String queryParameter = android.net.Uri.parse(string).getQueryParameter("appid");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.tencent.mm.pluginsdk.model.app.w.t(queryParameter) && (a17 = m33.a1.a()) != null) {
            ((com.tencent.mm.plugin.game.h0) a17).Ri(uIEntryStub, queryParameter, uIEntryStub.f93598d);
        }
        int i17 = extras.getInt("_wxapi_command_type");
        try {
            extras.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", false);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "handle wxapp message: " + uIEntryStub.f93598d + ", sdkver=" + uIEntryStub.f93599e + ", cmd=" + i17);
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(extras);
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = req.message;
                if (wXMediaMessage != null && wXMediaMessage.getType() == 2 && (wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) req.message.mediaObject) != null && !wXImageObject.checkArgs()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, WXImageObject checkArgs fail, maybe use deprecated field imageUrl");
                    com.tencent.mm.pluginsdk.model.app.m5.c(uIEntryStub, com.tencent.mm.pluginsdk.model.app.m5.a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                    uIEntryStub.finish();
                    return;
                }
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = req.message;
                if (wXMediaMessage2 != null && wXMediaMessage2.getType() == 38) {
                    int i18 = req.scene;
                    if (!(i18 == 1 || i18 == 3 || i18 == 4 || i18 == 0)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, video file object only supported share to timeline/chat");
                        com.tencent.mm.pluginsdk.model.app.m5.c(uIEntryStub, com.tencent.mm.pluginsdk.model.app.m5.a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                        uIEntryStub.finish();
                        return;
                    }
                }
                int i19 = req.scene;
                if (i19 == 1 || i19 == 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "sendMessageToWx, req.scene = %s", java.lang.Integer.valueOf(i19));
                    if (req.message.getType() != 8) {
                        new com.tencent.mm.plugin.base.stub.k(uIEntryStub, queryParameter, req.openId, new com.tencent.mm.plugin.base.stub.o(uIEntryStub, extras, req)).a();
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "sendMessageToWx fail, emoji does not support WXSceneTimeline");
                    com.tencent.mm.pluginsdk.model.app.m5.c(uIEntryStub, com.tencent.mm.pluginsdk.model.app.m5.a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                    uIEntryStub.finish();
                    return;
                }
                if (i19 == 3) {
                    new com.tencent.mm.plugin.base.stub.k(uIEntryStub, queryParameter, req.openId, new com.tencent.mm.plugin.base.stub.q(uIEntryStub, extras, req)).a();
                    return;
                }
                com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs a18 = com.tencent.mm.pluginsdk.model.app.m5.a(extras, -2);
                android.content.Intent intent = new android.content.Intent(uIEntryStub, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SelectConversationUI.class);
                int i27 = extras.getInt("SELECT_CONVERSATION_TYPE_FROM_TRANS_LINK", 0);
                if (i27 == 4) {
                    intent.putExtra("search_range", new int[]{131072});
                } else if (i27 == 16) {
                    intent.putExtra("search_range", new int[]{131075});
                }
                intent.putExtra("scene_from", 24);
                intent.putExtra("Select_Conv_Type", 3 | i27);
                intent.putExtra("Select_Report_Args", a18);
                intent.putExtra("Select_Conv_NextStep", new android.content.Intent(uIEntryStub, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class).putExtras(extras).putExtra("SendAppMessageWrapper_Scene", req.scene).putExtra("animation_pop_in", true));
                intent.putExtra("Select_App_Id", queryParameter);
                intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
                intent.putExtra("Select_Open_Id", req.openId);
                if (req.message.getType() == 36 || req.message.getType() == 46) {
                    intent.putExtra("mutil_select_is_ret", !((com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) req.message.mediaObject).withShareTicket);
                } else {
                    intent.putExtra("mutil_select_is_ret", true);
                }
                if (req.message.getType() == 45) {
                    intent.putExtra("Select_Send_Card", true);
                }
                if (!gm0.j1.a() || gm0.m.r()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(uIEntryStub, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    uIEntryStub.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(uIEntryStub, "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                uIEntryStub.finish();
                return;
            }
            if (i17 != 3) {
                if (i17 == 4) {
                    if (!gm0.j1.a() || gm0.m.r()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
                    } else {
                        l75.v0 v0Var = com.tencent.mm.ui.chatting.ue.f202744c;
                        v0Var.d(extras);
                        v0Var.c();
                    }
                }
            } else if (!gm0.j1.a() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
            } else {
                l75.v0 v0Var2 = com.tencent.mm.ui.chatting.qe.f202628d;
                v0Var2.d(extras);
                v0Var2.c();
            }
        } else if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UIEntryStub", "not logged in, ignore");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "handleWXAppMessage  COMMAND_SENDAUTH start SDKOAuthUI");
            android.content.Intent putExtras = new android.content.Intent().putExtras(extras);
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.biztimeline.RepairerConfigOpenSDKWechatAuthBlock()) == 1;
            if (!(true ^ ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).n()) || z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "do auth directly!");
                j45.l.j(uIEntryStub, "webview", ".ui.tools.SDKOAuthUI", putExtras, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "overseas user, need to do extra auth!");
                j45.l.j(uIEntryStub, "webview", ".ui.tools.SDKOAuthWechatUI", putExtras, null);
            }
        }
        uIEntryStub.finish();
    }
}
