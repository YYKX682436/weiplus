package tz4;

/* loaded from: classes10.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f504907d;

    public o(tz4.l lVar) {
        this.f504907d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f504907d;
        if (lVar.f504893f.get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) ((tz4.k) lVar.f504893f.get());
            activityC19519x7af4daf3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onClickAlbumBtn");
            activityC19519x7af4daf3.J1.B(-1, false, true);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", 9);
            intent.putExtra("query_source_type", 13);
            intent.putExtra("query_media_type", 3);
            intent.putExtra("show_header_view", true);
            intent.putExtra("send_btn_string", activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
            if (c16528xd9aafd63 == null) {
                c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(4, 0);
            }
            java.lang.String str = "micromsg_" + java.lang.System.currentTimeMillis();
            java.lang.String str2 = lp0.b.m() + str + ".mp4";
            java.lang.String str3 = lp0.b.m() + str + ".jpeg";
            int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd632 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(4, 1);
            c16528xd9aafd632.f230351e = 2;
            c16528xd9aafd632.f230350d = 0;
            if (c16528xd9aafd632.f230352f == null) {
                c16528xd9aafd632.f230352f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
            }
            c16528xd9aafd632.f230352f.f152728h = intExtra;
            c16528xd9aafd632.a(str, str2, str3, q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
            intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
            intent.putExtra("record_video_force_sys_camera", false);
            intent.putExtra("record_video_is_sight_capture", true);
            intent.addFlags(67108864);
            intent.putExtra("key_can_select_video_and_pic", true);
            intent.putExtra("record_video_time_limit", 15000);
            j45.l.n(activityC19519x7af4daf3, "gallery", ".ui.GalleryEntryUI", intent, 4097);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
