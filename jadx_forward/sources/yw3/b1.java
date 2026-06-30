package yw3;

/* loaded from: classes.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b f548230d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b) {
        this.f548230d = activityC17160xbdca513b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b = this.f548230d;
        intent.setClassName(activityC17160xbdca513b.mo55332x76847179(), "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        intent.putExtra("titile", "选择群聊");
        intent.putExtra("key_confirm_menu_name", activityC17160xbdca513b.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 82);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("key_filter_associate_chat_room", true);
        intent.putExtra("min_limit_num", 1);
        intent.putExtra("max_limit_num", 3);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = activityC17160xbdca513b.mo55332x76847179();
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22425xfe2690a6.class);
        cVar.i(yw3.a1.f548217a);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
