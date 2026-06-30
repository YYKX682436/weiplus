package qx1;

/* loaded from: classes10.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448823e;

    public i(qx1.q qVar, mx1.a aVar) {
        this.f448823e = qVar;
        this.f448822d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorFooterPanel", "go to GalleryEntryUI");
        nx1.d.q().z(-1, false, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("max_select_count", 9);
        intent.putExtra("query_source_type", 13);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("show_header_view", false);
        intent.putExtra("record_video_force_sys_camera", false);
        intent.putExtra("record_video_is_sight_capture", true);
        intent.putExtra("show_header_view", true);
        intent.addFlags(67108864);
        intent.putExtra("key_can_select_video_and_pic", true);
        j45.l.n(this.f448823e.f448841b.getContext(), "gallery", ".ui.GalleryEntryUI", intent, 4096);
        this.f448822d.q0(16L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
