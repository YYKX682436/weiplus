package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class t3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101447d;

    public t3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI) {
        this.f101447d = favImgGalleryUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101447d;
        com.tencent.mm.plugin.fav.ui.gallery.r item = favImgGalleryUI.f100359f.getItem(favImgGalleryUI.f100357d);
        if (item == null) {
            return;
        }
        java.lang.String j17 = item.j();
        if (!com.tencent.mm.vfs.w6.j(j17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavImgGalleryUI", "file not exists");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            o72.v2.d(favImgGalleryUI.f100370t, 1, 0);
            if (!com.tencent.mm.sdk.platformtools.y1.c(j17)) {
                o72.x1.J0(j17, favImgGalleryUI, item.t());
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            j45.l.v(favImgGalleryUI, ".ui.transmit.SelectConversationUI", intent, 1);
            return;
        }
        if (itemId == 1) {
            o72.x1.K0(j17, favImgGalleryUI);
            o72.v2.d(favImgGalleryUI.f100370t, 0, 0);
            return;
        }
        if (itemId == 2) {
            java.lang.String string = favImgGalleryUI.getString(com.tencent.mm.R.string.ccq);
            java.lang.String t17 = item.t();
            if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavImgGalleryUI", "save image fail, path is null");
                return;
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(favImgGalleryUI, j17, new com.tencent.mm.plugin.fav.ui.w3(favImgGalleryUI, t17, string));
            return;
        }
        if (itemId == 4) {
            if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(favImgGalleryUI.getContext(), null)) {
                favImgGalleryUI.f100367q.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        java.lang.String x27 = favImgGalleryUI.x2();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "edit image path:%s msgId:%s", x27, 0L);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(x27, "");
        b17.F = 0;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        b17.f155677o = uICustomParam;
        ut3.m.f431182a.f(favImgGalleryUI.getContext(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
    }
}
