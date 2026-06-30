package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ru extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nv {
    @Override // sb4.v
    public void d(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251591j;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b ", valueOf, valueOf2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Y6(activityC18141xfedff17)));
        dx1.g.f326022a.i("RecordMediaReporter", "moment_sessionid_", ca4.z0.l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).F(i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Y6(activityC18141xfedff17) && i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho hoVar = activityC18141xfedff17.L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            hoVar.d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        } else {
            android.content.Intent intent = new android.content.Intent(activityC18141xfedff17, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
            intent.putExtra("sns_gallery_userName", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.U6(activityC18141xfedff17));
            intent.putExtra("sns_gallery_is_self", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Y6(activityC18141xfedff17));
            intent.putExtra("sns_gallery_localId", i17);
            intent.putExtra("sns_source", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.b7(activityC18141xfedff17));
            intent.putExtra("sns_gallery_st_time", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).w());
            intent.putExtra("sns_gallery_ed_time", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).s());
            intent.putExtra("key_from_scene", 4);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Z6(activityC18141xfedff17));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17) != null) {
                intent.putExtra("sns_gallery_limit_seq", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).L());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.c7(activityC18141xfedff17).s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.U6(activityC18141xfedff17), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).N(i17, i18));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so T6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17);
                T6.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i19 = T6.M;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_position", i19);
            }
            activityC18141xfedff17.startActivityForResult(intent, 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.a7(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
    }
}
