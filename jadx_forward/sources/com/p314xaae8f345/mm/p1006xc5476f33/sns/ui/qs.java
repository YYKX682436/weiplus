package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class qs implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be f251889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f251890b;

    public qs(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be c18124x7a5575be, r45.jj4 jj4Var) {
        this.f251889a = c18124x7a5575be;
        this.f251890b = jj4Var;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            java.lang.String YuanBaoTemplateId = this.f251890b.I1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(YuanBaoTemplateId, "YuanBaoTemplateId");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be.f248998h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be c18124x7a5575be = this.f251889a;
            c18124x7a5575be.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_template_host, "https://yuanbao.tencent.com/aigi/templates", true);
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(pc4.e.f434959a.a() ? 1 : 0);
                sb6.append("");
                str = java.net.URLEncoder.encode(sb6.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoFlip", e17, "URLEncoder error", new java.lang.Object[0]);
                str = "0";
            }
            java.lang.String format = java.lang.String.format("%s?yb_template_id=%s&yb_support_live_photo=%s", java.util.Arrays.copyOf(new java.lang.Object[]{Zi, YuanBaoTemplateId, str}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            intent.putExtra("key_select_pic_from_mm_gallery_without_clear_top", true);
            j45.l.j(c18124x7a5575be.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineImgBottomBar", "no permission");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
    }
}
