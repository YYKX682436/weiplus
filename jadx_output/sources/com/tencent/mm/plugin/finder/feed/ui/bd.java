package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class bd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f109704d;

    public bd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f109704d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f109704d;
        kdVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", "goto select group");
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = kdVar.f118183e;
        intent.setClassName(context, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        intent.putStringArrayListExtra("label_id", new java.util.ArrayList<>(kdVar.L1.getList(4)));
        intent.putExtra("key_select_label_click_more_to_contact_list", true);
        intent.putExtra("option_button_wording_res_id_zero", com.tencent.mm.R.string.nwk);
        intent.putExtra("option_button_wording_res_id_more_format", com.tencent.mm.R.string.nwj);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.feed.ui.ad(kdVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
