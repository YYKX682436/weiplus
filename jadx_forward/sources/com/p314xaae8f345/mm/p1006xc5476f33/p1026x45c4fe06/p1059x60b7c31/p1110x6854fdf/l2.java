package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/l2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class l2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12238x6c12178c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, request is not ShareGifToConversationRequest");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12238x6c12178c c12238x6c12178c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12238x6c12178c) abstractC11887x3610e10c;
        if (c12238x6c12178c.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, fail since path is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164781e;
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12240x358662ba(2));
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.i2.f164695a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        java.lang.String gifPath = c12238x6c12178c.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String();
        java.lang.String username = c12238x6c12178c.getDm.i4.COL_USERNAME java.lang.String();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k2(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gifPath, "gifPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ri()) {
            interfaceC4987x84e327cb = null;
        } else {
            interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(com.p314xaae8f345.mm.vfs.w6.p(gifPath));
            if (interfaceC4987x84e327cb == null) {
                interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, gifPath));
            }
        }
        boolean z17 = (interfaceC4987x84e327cb == null ? 0L : com.p314xaae8f345.mm.vfs.w6.k(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).N0())) > ((long) ip.c.a());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (interfaceC4987x84e327cb != null) {
            gifPath = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).N0();
        }
        boolean z18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(gifPath, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (z17 || z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, fail since gif illegal");
            db5.e1.y(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f2(k2Var));
            return;
        }
        nf.g.a(m50421x3c6fed6a).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g2(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h2(k2Var)));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", interfaceC4987x84e327cb != null ? ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).mo42933xb5885648() : "");
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_MsgImgScene", 1);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 14);
        if (username.length() > 0) {
            intent.putExtra("scene_from", 19);
            intent.putExtra("Select_Conv_User", username);
        }
        j45.l.v(m50421x3c6fed6a, ".ui.transmit.MsgRetransmitUI", intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.i2.f164695a);
    }
}
