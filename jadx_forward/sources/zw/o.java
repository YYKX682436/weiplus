package zw;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.o f558069a = new zw.o();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f558070b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    public final void a(android.content.Context context, int i17, int i18, boolean z17, boolean z18, int i19, yz5.l asyncResult, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncResult, "asyncResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "jumpMediaTabPicker: " + i18 + ", " + context);
        if (context instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) {
            int i27 = i17 == 45 ? 5 : 1;
            ((p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) context).getIntent().putExtra("intent_bottom_navigationbar_height", com.p314xaae8f345.mm.ui.bl.c(context));
            boolean z27 = i18 <= 1;
            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
            boolean z28 = z17 && qp.b.f447211e;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", i18);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("query_source_type", i17);
            intent.putExtra("show_header_view", false);
            intent.putExtra("key_can_select_video_and_pic", false);
            intent.putExtra("key_force_hide_smart_gallery_entry", true);
            intent.putExtra("key_send_raw_image", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_publish_select_origin_image, 0) == 1);
            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
            boolean z29 = qp.b.f447211e;
            if (z28 && z29) {
                intent.putExtra("Gallery_LivePhoto_Need_Query", true);
            }
            intent.addFlags(67108864);
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new jz5.l(1, intent));
            if (!z27) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("album_select_count_limit", i18);
                arrayList.add(new jz5.l(3, intent2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.e();
            e17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
            e17.M.putBoolean("key_forbit_edit_inset_layout", true);
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("KEY_PARAMS_CONFIG", e17);
            intent3.putExtra("KEY_PARAMS_TO_WHERE", 0);
            intent3.putExtra("key_params_pageid", "MediaTabCaptureUI");
            arrayList.add(new jz5.l(2, intent3));
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            if (z19 && !z27) {
                java.util.Iterator it = arrayList.iterator();
                int i28 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i28 = -1;
                        break;
                    } else {
                        if (((java.lang.Number) ((jz5.l) it.next()).f384366d).intValue() == 3) {
                            break;
                        } else {
                            i28++;
                        }
                    }
                }
                if (i28 != -1) {
                    f0Var.f391649d = i28;
                }
            }
            p3325xe03a0797.p3326xc267989b.l.d(f558070b, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new zw.m(z18, context, i27, arrayList, f0Var, i19, z17, asyncResult, null), 2, null);
        }
    }
}
