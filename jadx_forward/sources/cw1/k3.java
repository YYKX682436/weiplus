package cw1;

/* loaded from: classes12.dex */
public class k3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f304617d;

    public k3(cw1.j3 j3Var) {
        this.f304617d = j3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        cw1.j3 j3Var = this.f304617d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d, count=%d", valueOf, java.lang.Integer.valueOf(j3Var.getCount()));
        if (i17 < 0 || i17 >= j3Var.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        bw1.l item = j3Var.getItem(i17);
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), pt0.f0.Li(item.f106346e, item.f106347f).G, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        int i18 = item.f106343b;
        if (i18 == 1) {
            intent.putExtra("key_title", j3Var.f304558e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_4));
            intent.putExtra("show_menu", false);
            intent.putExtra("key_image_path", com.p314xaae8f345.mm.vfs.w6.j(item.f106345d) ? item.f106345d : item.f106344c);
            j45.l.u(j3Var.f304558e, ".ui.tools.ShowImageUI", intent, null);
        } else if (i18 == 3) {
            intent.putExtra("img_gallery_msg_id", item.f106347f).putExtra("img_gallery_talker", item.f106346e).putExtra("img_gallery_enter_from_chatting_ui", false).putExtra("msg_type", 0).putExtra("show_enter_grid", false);
            j45.l.u(j3Var.f304558e, ".ui.chatting.gallery.ImageGalleryUI", intent, null);
        } else if (i18 == 4) {
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 18);
            intent.putExtra("app_msg_id", item.f106347f);
            intent.putExtra("msg_talker", item.f106346e);
            j45.l.u(j3Var.f304558e, ".ui.chatting.AppAttachNewDownloadUI", intent, null);
        } else if (i18 == 5) {
            intent.putExtra("message_id", item.f106347f);
            intent.putExtra("message_talker", item.f106346e);
            intent.putExtra("record_xml", item.f106351j);
            intent.putExtra("record_show_share", false);
            intent.putExtra("from_scene", 2);
            j45.l.j(j3Var.f304558e, "record", ".ui.RecordMsgDetailUI", intent, null);
        } else if (i18 == 6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
            am.sn snVar = c5824x69fbb00a.f136132g;
            snVar.f89439c = j3Var.f304558e;
            snVar.f89437a = item.f106347f;
            snVar.f89442f = item.f106346e;
            snVar.f89440d = false;
            snVar.f89443g = 6;
            snVar.f89438b = item.f106351j;
            c5824x69fbb00a.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
