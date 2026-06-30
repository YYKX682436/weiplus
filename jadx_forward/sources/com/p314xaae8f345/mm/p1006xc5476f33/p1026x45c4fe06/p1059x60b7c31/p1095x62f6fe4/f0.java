package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 f163328a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var) {
        this.f163328a = t0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var = this.f163328a;
        int i17 = t0Var.f163596d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m7[] m7VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m7.f163475e;
        int i18 = 2;
        if (i17 != 2) {
            i18 = 1;
            if (i17 != 1) {
                i18 = 3;
            }
        }
        boolean z17 = t0Var.f163597e;
        int i19 = z17 ? 8 : 7;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = t0Var.f163593a;
        intent.setClassName(lVar.mo50352x76847179(), "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
        intent.putExtra("gallery_report_tag", 16);
        intent.putExtra("key_send_raw_image", z17);
        intent.putExtra("max_select_count", t0Var.f163599g);
        intent.putExtra("query_source_type", i19);
        intent.putExtra("query_media_type", i18);
        intent.putExtra("show_header_view", false);
        intent.putExtra("album_video_max_duration", 86400);
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_choosevideo");
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 != null) {
            nf.g.a(a17).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e0(c17));
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x.f163657a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goAlbumUI context !is activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y("fail:internal error invalid android context");
        c17.c(yVar);
        return yVar;
    }
}
