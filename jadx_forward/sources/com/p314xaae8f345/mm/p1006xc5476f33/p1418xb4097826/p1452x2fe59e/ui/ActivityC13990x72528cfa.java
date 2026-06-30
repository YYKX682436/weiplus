package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAudioBgAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAudioBgAlbumUI */
/* loaded from: classes10.dex */
public final class ActivityC13990x72528cfa extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd {

    /* renamed from: u2, reason: collision with root package name */
    public final int f190872u2 = 10;

    /* renamed from: v2, reason: collision with root package name */
    public final int f190873v2 = 1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void M7(int i17, android.view.View itemView, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t23.p0.p(this.f220061m.f328663f);
        int z17 = i17 - this.f220061m.z();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.class);
        intent.putStringArrayListExtra("preview_image_list", this.f220061m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f220061m.f328664g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", z17);
        H7(z17, true);
        intent.putExtra("send_raw_img", this.D);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("GalleryUI_FromUser", this.U);
        intent.putExtra("GalleryUI_ToUser", this.V);
        intent.putExtra("album_business_tag", this.f220081x0);
        intent.putExtra("album_video_max_duration", this.f190872u2 * 1000);
        intent.putExtra("album_video_min_duration", this.f220059l1);
        intent.putExtra("media_type", 2);
        intent.putExtra("key_support_max_ratio", 3.0f);
        startActivityForResult(intent, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public boolean N7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.X(new java.util.ArrayList(this.f220061m.f328664g));
        if (abstractC15633xee433078.mo63659xfb85f7b0() == 1) {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(abstractC15633xee433078.f219963e, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("crop_fix_ratio", 0.75f);
            c17.M = bundle;
        } else {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.c(abstractC15633xee433078.f219963e, "", "");
            c17.f237218w = this.f190872u2 * 1000;
            c17.f237219x = this.f190873v2 * 1000;
            c17.F = 17;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 17);
            bundle2.putBoolean("key_mute_video", true);
            c17.M = bundle2;
            c17.a(2, "com.tencent.mm.plugin.vlog.ui.video.FinderLiveVideoCompositionPluginLayout");
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            c17.f237209n = d11.s.fj().hj();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
        c16995x8ab634cd.f237223d = 17;
        c16993xacc19624.I = c16995x8ab634cd;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        hashMap.put("plugin_music", bool);
        c16993xacc19624.f237210o = c10402x5bc41468;
        ut3.m.f512715a.f(mo55332x76847179(), 4385, -1, -1, c16993xacc19624, abstractC15633xee433078.mo63659xfb85f7b0() == 1 ? 1 : 2, 0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        e33.b0 b0Var;
        if (i17 == 4385) {
            if (i18 == -1) {
                setResult(i18, intent);
                finish();
                return;
            }
            return;
        }
        if (i18 == 34) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra != null && (b0Var = this.f220061m) != null) {
                java.util.ArrayList l17 = t23.p0.l();
                if (l17 == null) {
                    l17 = this.f220061m.f328663f;
                }
                b0Var.O(stringArrayListExtra, l17);
                this.f220061m.m8146xced61ae5();
                c8(stringArrayListExtra.size());
            }
            N7();
        }
    }
}
