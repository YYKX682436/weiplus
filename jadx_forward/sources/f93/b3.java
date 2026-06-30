package f93;

/* loaded from: classes10.dex */
public class b3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341830d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384) {
        this.f341830d = viewOnCreateContextMenuListenerC16171x51fc9384;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.f224804p1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341830d;
        viewOnCreateContextMenuListenerC16171x51fc9384.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i18 = 0; i18 < viewOnCreateContextMenuListenerC16171x51fc9384.E.f387427f.size(); i18++) {
            java.util.ArrayList P1 = b93.r.wi().P1((java.lang.String) viewOnCreateContextMenuListenerC16171x51fc9384.E.f387427f.get(i18));
            if (P1 != null && P1.size() > 0) {
                hashSet.addAll(P1);
            }
        }
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Intent intent = new android.content.Intent(viewOnCreateContextMenuListenerC16171x51fc9384, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("privacy_source_type", viewOnCreateContextMenuListenerC16171x51fc9384.C);
        intent.putExtra("privacy_menu_enter_type", 3);
        intent.putExtra("privacy_select_chatroom_or_lebal_count", viewOnCreateContextMenuListenerC16171x51fc9384.E.f387427f.size());
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("titile", viewOnCreateContextMenuListenerC16171x51fc9384.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        intent.putExtra("key_label_click_source", viewOnCreateContextMenuListenerC16171x51fc9384.getIntent().getIntExtra("key_label_click_source", 0));
        viewOnCreateContextMenuListenerC16171x51fc9384.startActivityForResult(intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658);
        return true;
    }
}
