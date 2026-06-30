package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f100891d;

    public a0(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f100891d = favMediaGalleryUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100891d;
        com.tencent.mm.plugin.fav.ui.gallery.r item = favMediaGalleryUI.f100873g.getItem(favMediaGalleryUI.f100870d);
        if (item == null) {
            return;
        }
        java.lang.String j17 = item.j();
        if (!com.tencent.mm.vfs.w6.j(j17) && menuItem.getItemId() != 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavMediaGalleryUI", "file not exists");
            return;
        }
        switch (menuItem.getItemId()) {
            case 0:
                o72.v2.d(favMediaGalleryUI.A, 1, 0);
                if (item.k() == 2) {
                    if (!com.tencent.mm.sdk.platformtools.y1.c(j17)) {
                        o72.x1.J0(j17, favMediaGalleryUI, item.t());
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    j45.l.v(favMediaGalleryUI, ".ui.transmit.SelectConversationUI", intent, 1);
                    return;
                }
                java.lang.String w17 = item.w();
                java.lang.String j18 = item.j();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("select_is_ret", true);
                intent2.putExtra("mutil_select_is_ret", true);
                if (com.tencent.mm.vfs.w6.j(w17)) {
                    intent2.putExtra("image_path", w17);
                } else {
                    intent2.putExtra("image_path", j18);
                }
                intent2.putExtra("Retr_Msg_Type", 1);
                j45.l.v(favMediaGalleryUI.getContext(), ".ui.transmit.SelectConversationUI", intent2, 1);
                return;
            case 1:
                o72.x1.K0(j17, favMediaGalleryUI);
                o72.v2.d(favMediaGalleryUI.A, 0, 0);
                return;
            case 2:
                if (item.k() != 2) {
                    favMediaGalleryUI.getClass();
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(favMediaGalleryUI.getContext(), j17, new com.tencent.mm.plugin.fav.ui.gallery.b0(favMediaGalleryUI, j17));
                    return;
                }
                favMediaGalleryUI.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavMediaGalleryUI", "save image fail, path is null");
                    return;
                } else {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(favMediaGalleryUI, j17, new com.tencent.mm.plugin.fav.ui.gallery.c0(favMediaGalleryUI));
                    return;
                }
            case 3:
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent) ((java.util.HashMap) favMediaGalleryUI.f100885v).get(j17);
                if (recogQBarOfImageFileResultEvent != null) {
                    com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
                    com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                    java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent);
                    int c17 = s6Var.c(recogQBarOfImageFileResultEvent);
                    int d17 = s6Var.d(recogQBarOfImageFileResultEvent);
                    am.r3 r3Var = dealQBarStrEvent.f54079g;
                    r3Var.f7781b = favMediaGalleryUI;
                    r3Var.f7780a = e17;
                    r3Var.f7782c = c17;
                    r3Var.f7784e = 7;
                    r3Var.f7788i = 39;
                    r3Var.f7789j = item.f();
                    r3Var.f7790k = item.e();
                    r3Var.f7792m = j17;
                    r3Var.f7794o = true;
                    r3Var.f7796q = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent);
                    r3Var.f7783d = d17;
                    android.os.Bundle bundle = new android.os.Bundle(1);
                    bundle.putInt("stat_scene", 5);
                    o72.r2 p17 = item.p();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "addStatInfo4AppBrand, from fav");
                    bundle.putInt("LaunchCodeScene_ScanScene", 4);
                    if (p17 != null && (bq0Var = p17.field_favProto) != null && (jq0Var = bq0Var.f370962d) != null) {
                        bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
                        bundle.putString("stat_send_msg_user", jq0Var.f378036f);
                        bundle.putString("stat_msg_id", jq0Var.f378046s);
                    }
                    bundle.putInt("KMsgType", 49);
                    bundle.putInt("KAppMsgType", 24);
                    r3Var.f7791l = bundle;
                    dealQBarStrEvent.e();
                    return;
                }
                return;
            case 4:
                favMediaGalleryUI.f100881r.f372655f = favMediaGalleryUI.f100873g.getCount() - favMediaGalleryUI.f100870d;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(favMediaGalleryUI.getContext(), item.p(), favMediaGalleryUI.f100881r);
                favMediaGalleryUI.finish();
                return;
            case 5:
                if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(favMediaGalleryUI.getContext(), null)) {
                    favMediaGalleryUI.f100884u.a();
                    return;
                }
                return;
            case 6:
                java.lang.String x27 = favMediaGalleryUI.x2();
                com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "edit image path:%s msgId:%s", x27, 0L);
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
                ut3.m.f431182a.f(favMediaGalleryUI.getContext(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
                return;
            default:
                return;
        }
    }
}
