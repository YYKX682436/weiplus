package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81795a;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81795a = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81795a;
        int i17 = t0Var.f82063d;
        com.tencent.mm.plugin.appbrand.jsapi.media.m7[] m7VarArr = com.tencent.mm.plugin.appbrand.jsapi.media.m7.f81942e;
        int i18 = 2;
        if (i17 != 2) {
            i18 = 1;
            if (i17 != 1) {
                i18 = 3;
            }
        }
        boolean z17 = t0Var.f82064e;
        int i19 = z17 ? 8 : 7;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = t0Var.f82060a;
        intent.setClassName(lVar.getContext(), "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
        intent.putExtra("gallery_report_tag", 16);
        intent.putExtra("key_send_raw_image", z17);
        intent.putExtra("max_select_count", t0Var.f82066g);
        intent.putExtra("query_source_type", i19);
        intent.putExtra("query_media_type", i18);
        intent.putExtra("show_header_view", false);
        intent.putExtra("album_video_max_duration", 86400);
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_choosevideo");
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 != null) {
            nf.g.a(a17).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.media.e0(c17));
            return com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goAlbumUI context !is activity");
        com.tencent.mm.plugin.appbrand.jsapi.media.y yVar = new com.tencent.mm.plugin.appbrand.jsapi.media.y("fail:internal error invalid android context");
        c17.c(yVar);
        return yVar;
    }
}
