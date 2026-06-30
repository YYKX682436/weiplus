package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f211063d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f211063d = activityC15007xc74afeba;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f211063d;
        if (itemId == activityC15007xc74afeba.D) {
            android.content.Intent intent = activityC15007xc74afeba.getIntent();
            activityC15007xc74afeba.getClass();
            intent.removeExtra("key_user_name");
            intent.removeExtra("key_nick_name");
            intent.removeExtra("key_cover_url");
            intent.removeExtra("key_avatar_url");
            intent.removeExtra("key_topic_id");
            intent.removeExtra("key_activity_name");
            intent.removeExtra("key_activity_desc");
            intent.removeExtra("key_activity_end_time");
            intent.putExtra("key_activity_type", 100);
            intent.putExtra("key_activity_already_participate", false);
            intent.putExtra("key_activity_jump_info_list", new java.util.ArrayList());
            intent.putExtra("key_activity_post_wording", "");
            activityC15007xc74afeba.setResult(-1, activityC15007xc74afeba.getIntent());
            activityC15007xc74afeba.finish();
        }
    }
}
