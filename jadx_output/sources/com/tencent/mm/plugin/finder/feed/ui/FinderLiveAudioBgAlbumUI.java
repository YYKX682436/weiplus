package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAudioBgAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveAudioBgAlbumUI extends com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI {

    /* renamed from: u2, reason: collision with root package name */
    public final int f109339u2 = 10;

    /* renamed from: v2, reason: collision with root package name */
    public final int f109340v2 = 1;

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void M7(int i17, android.view.View itemView, int i18) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t23.p0.p(this.f138528m.f247130f);
        int z17 = i17 - this.f138528m.z();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
        intent.putStringArrayListExtra("preview_image_list", this.f138528m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", z17);
        H7(z17, true);
        intent.putExtra("send_raw_img", this.D);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("GalleryUI_FromUser", this.U);
        intent.putExtra("GalleryUI_ToUser", this.V);
        intent.putExtra("album_business_tag", this.f138548x0);
        intent.putExtra("album_video_max_duration", this.f109339u2 * 1000);
        intent.putExtra("album_video_min_duration", this.f138526l1);
        intent.putExtra("media_type", 2);
        intent.putExtra("key_support_max_ratio", 3.0f);
        startActivityForResult(intent, 0);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public boolean N7() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c17;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.X(new java.util.ArrayList(this.f138528m.f247131g));
        if (galleryItem$MediaItem.getType() == 1) {
            c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(galleryItem$MediaItem.f138430e, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("crop_fix_ratio", 0.75f);
            c17.M = bundle;
        } else {
            c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(galleryItem$MediaItem.f138430e, "", "");
            c17.f155685w = this.f109339u2 * 1000;
            c17.f155686x = this.f109340v2 * 1000;
            c17.F = 17;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 17);
            bundle2.putBoolean("key_mute_video", true);
            c17.M = bundle2;
            c17.a(2, "com.tencent.mm.plugin.vlog.ui.video.FinderLiveVideoCompositionPluginLayout");
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            c17.f155676n = d11.s.fj().hj();
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = c17;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        videoCaptureReportInfo.f155690d = 17;
        recordConfigProvider.I = videoCaptureReportInfo;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        hashMap.put("plugin_music", bool);
        recordConfigProvider.f155677o = uICustomParam;
        ut3.m.f431182a.f(getContext(), 4385, -1, -1, recordConfigProvider, galleryItem$MediaItem.getType() == 1 ? 1 : 2, 0);
        return true;
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
            if (stringArrayListExtra != null && (b0Var = this.f138528m) != null) {
                java.util.ArrayList l17 = t23.p0.l();
                if (l17 == null) {
                    l17 = this.f138528m.f247130f;
                }
                b0Var.O(stringArrayListExtra, l17);
                this.f138528m.notifyDataSetChanged();
                c8(stringArrayListExtra.size());
            }
            N7();
        }
    }
}
