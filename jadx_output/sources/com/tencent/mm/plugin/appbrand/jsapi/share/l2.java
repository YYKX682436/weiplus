package com.tencent.mm.plugin.appbrand.jsapi.share;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/l2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class l2 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, request is not ShareGifToConversationRequest");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest shareGifToConversationRequest = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest) appBrandProxyUIProcessTask$ProcessRequest;
        if (shareGifToConversationRequest.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String().length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, fail since path is empty");
            com.tencent.mm.plugin.appbrand.jsapi.share.s2 s2Var = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e;
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult(2));
            return;
        }
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.share.i2.f83162a;
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        java.lang.String gifPath = shareGifToConversationRequest.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String();
        java.lang.String username = shareGifToConversationRequest.getDm.i4.COL_USERNAME java.lang.String();
        com.tencent.mm.plugin.appbrand.jsapi.share.k2 k2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.k2(this);
        kotlin.jvm.internal.o.g(gifPath, "gifPath");
        kotlin.jvm.internal.o.g(username, "username");
        if (((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ri()) {
            iEmojiInfo = null;
        } else {
            iEmojiInfo = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(com.tencent.mm.vfs.w6.p(gifPath));
            if (iEmojiInfo == null) {
                iEmojiInfo = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, gifPath));
            }
        }
        boolean z17 = (iEmojiInfo == null ? 0L : com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).N0())) > ((long) ip.c.a());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (iEmojiInfo != null) {
            gifPath = ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).N0();
        }
        boolean z18 = (com.tencent.mm.sdk.platformtools.x.J(gifPath, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (z17 || z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, fail since gif illegal");
            db5.e1.y(activityContext, activityContext.getString(com.tencent.mm.R.string.bvm), "", activityContext.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.appbrand.jsapi.share.f2(k2Var));
            return;
        }
        nf.g.a(activityContext).f(new com.tencent.mm.plugin.appbrand.jsapi.share.g2(new com.tencent.mm.plugin.appbrand.jsapi.share.h2(k2Var)));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", iEmojiInfo != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).getMd5() : "");
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_MsgImgScene", 1);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 14);
        if (username.length() > 0) {
            intent.putExtra("scene_from", 19);
            intent.putExtra("Select_Conv_User", username);
        }
        j45.l.v(activityContext, ".ui.transmit.MsgRetransmitUI", intent, com.tencent.mm.plugin.appbrand.jsapi.share.i2.f83162a);
    }
}
