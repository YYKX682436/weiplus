package ee4;

/* loaded from: classes4.dex */
public final class m0 extends ee4.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        return "SnsPublish.PicGoAlbumPc";
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        int f17 = 9 - m().v().f();
        if (f17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PicWidget", "has select the max image count");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
            return;
        }
        java.lang.String string = c().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getString("gallery", "1");
        java.lang.String str = string != null ? string : "1";
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 2, 2, ca4.z0.l(), java.lang.Long.valueOf(c01.id.c()));
        if (r26.i0.p(str, "0", true)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(c(), 2, 1, 0, 1, false, null);
        } else if (f17 < 9) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_can_select_video_and_pic", true);
            intent.putExtra("Gallery_LivePhoto_Need_Query", pc4.e.f434959a.a());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(c(), 9, f17, 4, 1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a(), intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f152728h);
            intent2.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false)));
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            if (ez0.o.f339368a.h()) {
                intent2.putExtra("key_sns_publish_template", true);
                f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + f17);
            }
            intent2.putExtra("key_can_select_video_and_pic", false);
            intent2.putExtra("Gallery_LivePhoto_Need_Query", pc4.e.f434959a.a());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(c(), 9, f17, 4, 3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a(), intent2);
        }
        n().q(2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
    }
}
