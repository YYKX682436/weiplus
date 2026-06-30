package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xu implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 f253118d;

    public xu(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17) {
        this.f253118d = activityC18141xfedff17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
        boolean booleanValue = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18077x78e7e20f.W6().booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f253118d;
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18079x5ef020de.class);
            intent.putExtra("sns_msg_force_show_all", true);
            intent.putExtra("sns_msg_comment_list_scene", 2);
            intent.putExtra("sns_msg_can_update_to_read", true);
            activityC18141xfedff17.startActivityForResult(intent, 8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
            return true;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.class);
        intent2.putExtra("sns_msg_force_show_all", false);
        intent2.putExtra("sns_msg_can_update_to_read", true);
        intent2.putExtra("sns_msg_comment_list_scene", 2);
        activityC18141xfedff17.startActivityForResult(intent2, 8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
        return true;
    }
}
