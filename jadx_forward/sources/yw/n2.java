package yw;

/* loaded from: classes9.dex */
public final class n2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547942f;

    public n2(yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f547940d = lVar;
        this.f547941e = c23232x91bb1d7a;
        this.f547942f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f547942f;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a = this.f547941e;
        if (itemId == 1) {
            yz5.l lVar = this.f547940d;
            if (lVar != null) {
                lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23227xa6365ebf(1L, java.lang.Boolean.TRUE));
            }
            java.lang.Long m85533xa121bd03 = c23232x91bb1d7a.m85533xa121bd03();
            if (m85533xa121bd03 != null && ((int) m85533xa121bd03.longValue()) == com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.f40855x1294c7f6.ordinal()) {
                yw.q2 q2Var = yw.q2.f547967a;
                if (c23232x91bb1d7a.m85529x1e741da2() != null) {
                    q2Var.c(c23232x91bb1d7a.m85529x1e741da2(), new yw.b2(new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf)));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImgMsgToFriend img url is null");
                    return;
                }
            }
            yw.q2 q2Var2 = yw.q2.f547967a;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", c23232x91bb1d7a.m85536xb5887639());
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c23232x91bb1d7a.m85535x7531c8a2());
            hashMap.put("img_url", c23232x91bb1d7a.m85529x1e741da2());
            hashMap.put("desc", c23232x91bb1d7a.m85527xfb7e6707());
            hashMap.put("item_show_type", c23232x91bb1d7a.m85530x7235c680());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 35);
            intent.putExtra("scene_from", 20);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("webview_params", hashMap);
            j45.l.w(abstractActivityC21394xb3d2c0cf, ".ui.transmit.SelectConversationUI", intent, yw.q2.f547968b, new yw.d2(c23232x91bb1d7a, abstractActivityC21394xb3d2c0cf));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(c23232x91bb1d7a.m85529x1e741da2());
            return;
        }
        if (menuItem.getItemId() == 2) {
            java.lang.Long m85533xa121bd032 = c23232x91bb1d7a.m85533xa121bd03();
            if (m85533xa121bd032 != null && ((int) m85533xa121bd032.longValue()) == com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.f40855x1294c7f6.ordinal()) {
                yw.q2 q2Var3 = yw.q2.f547967a;
                if (c23232x91bb1d7a.m85529x1e741da2() != null) {
                    q2Var3.c(c23232x91bb1d7a.m85529x1e741da2(), new yw.c2(new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf), c23232x91bb1d7a));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImgMsgToTimeline img url is null");
                    return;
                }
            }
            yw.q2 q2Var4 = yw.q2.f547967a;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_width", 640);
            intent2.putExtra("Ksnsupload_height", 640);
            intent2.putExtra("Ksnsupload_link", c23232x91bb1d7a.m85536xb5887639());
            intent2.putExtra("Ksnsupload_title", c23232x91bb1d7a.m85535x7531c8a2());
            intent2.putExtra("Ksnsupload_imgurl", c23232x91bb1d7a.m85529x1e741da2());
            intent2.putExtra("ksnsupload_link_desc", c23232x91bb1d7a.m85527xfb7e6707());
            intent2.putExtra("Ksnsupload_source", 4);
            intent2.putExtra("Ksnsupload_type", 1);
            intent2.putExtra("sns_upload_is_show_dialog", true);
            intent2.putExtra("ShareUrlOpen", c23232x91bb1d7a.m85536xb5887639());
            intent2.putExtra("ShareUrlOriginal", c23232x91bb1d7a.m85536xb5887639());
            if (c01.e2.G(c23232x91bb1d7a.m85534xcfc1cda4())) {
                intent2.putExtra("src_username", c23232x91bb1d7a.m85534xcfc1cda4());
                intent2.putExtra("src_displayname", c23232x91bb1d7a.m85528x8d4ef582());
            }
            c01.l2 c17 = c01.n2.d().c(c01.n2.a(c23232x91bb1d7a.m85531x74d37ac6()), true);
            java.lang.Long m85530x7235c680 = c23232x91bb1d7a.m85530x7235c680();
            c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", m85530x7235c680 != null ? java.lang.Integer.valueOf((int) m85530x7235c680.longValue()) : null);
            c17.i("_tmpl_webview_transfer_scene", 10);
            j45.l.v(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.sns.ui.SnsUploadUI", intent2, yw.q2.f547968b);
        }
    }
}
