package uf5;

/* loaded from: classes10.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e f508863d;

    public z(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e activityC22345x3d5f486e) {
        this.f508863d = activityC22345x3d5f486e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e.E;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e activityC22345x3d5f486e = this.f508863d;
        java.util.ArrayList x76 = activityC22345x3d5f486e.x7(false);
        activityC22345x3d5f486e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "sns post who can see scene,users=%s", x76.toString());
        java.util.ArrayList x77 = activityC22345x3d5f486e.x7(false);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(x77)) {
            for (int i18 = 0; i18 < x77.size(); i18++) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) x77.get(i18))) {
                    qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                    java.lang.String str = (java.lang.String) x77.get(i18);
                    ((py.a) iVar).getClass();
                    java.util.List m17 = c01.v1.m(str);
                    if (m17 != null) {
                        hashSet.addAll(m17);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "handleSelect, tagList=%s.", hashSet.toString());
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Intent intent = new android.content.Intent(activityC22345x3d5f486e, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("list_type", 1);
        intent.putExtra("privacy_source_type", activityC22345x3d5f486e.D);
        intent.putExtra("privacy_menu_enter_type", 2);
        intent.putExtra("privacy_select_chatroom_or_lebal_count", x77.size());
        intent.putExtra("without_openim", true);
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("titile", activityC22345x3d5f486e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        activityC22345x3d5f486e.startActivityForResult(intent, 0);
        return true;
    }
}
