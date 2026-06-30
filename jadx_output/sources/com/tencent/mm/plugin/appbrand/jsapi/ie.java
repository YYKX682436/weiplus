package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class ie extends com.tencent.mm.plugin.appbrand.ipc.v {
    private ie() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        java.lang.String str;
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCSendToFriendEmojiRequest request instance not valid");
            return;
        }
        str = ((com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest) appBrandProxyUIProcessTask$ProcessRequest).f78649d;
        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(com.tencent.mm.vfs.w6.p(str));
        if (Ni == null) {
            Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, str));
        }
        long k17 = Ni == null ? 0L : com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0());
        if (Ni != null) {
            str = ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.tencent.mm.sdk.platformtools.x.J(str, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            db5.e1.y(getActivityContext(), getString(com.tencent.mm.R.string.bvm), "", getString(com.tencent.mm.R.string.f492294fz1), null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", Ni != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).getMd5() : "");
            intent.putExtra("Retr_Msg_Type", 5);
            intent.putExtra("Retr_MsgImgScene", 1);
            intent.putExtra("content_type_forward_to_wework", 14);
            j45.l.u(getActivityContext(), ".ui.transmit.MsgRetransmitUI", intent, null);
        }
        finishProcess(null);
    }
}
