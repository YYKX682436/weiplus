package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes10.dex */
public class mo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb f251461d;

    public mo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb activityC18100xdd963dbb) {
        this.f251461d = activityC18100xdd963dbb;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb activityC18100xdd963dbb = this.f251461d;
        java.util.ArrayList x76 = activityC18100xdd963dbb.x7(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        activityC18100xdd963dbb.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectChatRoomUI", "sns post who can see scene,users=%s", x76.toString());
        java.util.ArrayList x77 = activityC18100xdd963dbb.x7(false);
        x77.remove(c01.z1.r());
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(x77, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_chatrooms", c17);
        activityC18100xdd963dbb.setResult(-1, intent);
        activityC18100xdd963dbb.finish();
        activityC18100xdd963dbb.b7().notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        return true;
    }
}
