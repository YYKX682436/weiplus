package e33;

/* loaded from: classes10.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328743d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328743d = activityC15653x403456cd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean F7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328743d;
        activityC15653x403456cd.f220053h = true;
        F7 = activityC15653x403456cd.F7();
        if (F7) {
            activityC15653x403456cd.L7(-1, false);
        } else {
            android.content.Intent intent = new android.content.Intent(activityC15653x403456cd, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.class);
            t23.p0.p(activityC15653x403456cd.f220061m.f328664g);
            intent.putExtra("key_send_as_media_group", activityC15653x403456cd.V1);
            intent.putExtra("query_source_type", activityC15653x403456cd.E1);
            intent.putStringArrayListExtra("preview_image_list", activityC15653x403456cd.f220061m.K());
            intent.putParcelableArrayListExtra("preview_media_item_list", activityC15653x403456cd.f220061m.f328664g);
            intent.putExtra("key_edit_video_max_time_length", activityC15653x403456cd.getIntent().getIntExtra("key_edit_video_max_time_length", 10));
            intent.putExtra("max_select_count", activityC15653x403456cd.Q);
            intent.putExtra("send_raw_img", activityC15653x403456cd.D);
            intent.putExtra("isSelectAlbum", activityC15653x403456cd.H1);
            intent.putExtra("key_force_hide_edit_image_button", activityC15653x403456cd.E);
            intent.putExtra("key_force_show_raw_image_button", activityC15653x403456cd.G);
            intent.putExtra("key_is_raw_image_button_disable", activityC15653x403456cd.I);
            intent.putExtra("GalleryUI_FromUser", activityC15653x403456cd.U);
            intent.putExtra("GalleryUI_ToUser", activityC15653x403456cd.V);
            intent.putExtra("key_filter_hdr_video", activityC15653x403456cd.getIntent().getBooleanExtra("key_filter_hdr_video", false));
            intent.putExtra("select_type_tag", activityC15653x403456cd.J1);
            intent.putExtra("album_business_tag", activityC15653x403456cd.f220081x0);
            intent.putExtra("album_video_max_duration", activityC15653x403456cd.f220084y0);
            intent.putExtra("album_video_min_duration", activityC15653x403456cd.f220059l1);
            activityC15653x403456cd.getClass();
            intent.putExtra("key_from_sns_post_album_multi_tab", activityC15653x403456cd instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2);
            r15.b bVar = activityC15653x403456cd.M;
            if (bVar != null) {
                ok5.d.b(intent, "key_quote_extcommon", bVar, new ok5.h());
            }
            activityC15653x403456cd.startActivityForResult(intent, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
