package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public abstract class nv extends sb4.v {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 f251591j;

    public nv(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17) {
        this.f251591j = activityC18141xfedff17;
    }

    @Override // sb4.v
    public void a(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserUI", "click desc_count, localId = %d, position = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251591j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).F(i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Y6(activityC18141xfedff17) && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserUI", "click desc_count, position = -1");
        } else {
            android.content.Intent intent = new android.content.Intent(activityC18141xfedff17, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
            intent.putExtra("INTENT_TALKER", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.U6(activityC18141xfedff17));
            intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i17));
            intent.putExtra("INTENT_FROMGALLERY", false);
            intent.putExtra("INTENT_NEED_RPT_FEED", true);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Z6(activityC18141xfedff17));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.a7(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17));
            activityC18141xfedff17.startActivityForResult(intent, 12);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void b(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i19 != null && i19.m70398x507e494d() && i19.m70387x403f7b29()) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.V;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251591j;
            activityC18141xfedff17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            db5.e1.j(activityC18141xfedff17, com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zu(activityC18141xfedff17, i17), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.av(activityC18141xfedff17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void c(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i19 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251591j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).F(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", i19.m70374x6bf53a6c());
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Z6(activityC18141xfedff17));
        activityC18141xfedff17.startActivityForResult(intent, 12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.a7(activityC18141xfedff17, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void e(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i19 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251591j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).F(i17);
        if (i19.f68895x2262335f == 15) {
            android.content.Intent intent = new android.content.Intent(activityC18141xfedff17, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
            intent.putExtra("sns_gallery_userName", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.U6(activityC18141xfedff17));
            intent.putExtra("sns_gallery_is_self", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Y6(activityC18141xfedff17));
            intent.putExtra("sns_gallery_localId", i17);
            intent.putExtra("sns_source", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.b7(activityC18141xfedff17));
            intent.putExtra("sns_gallery_st_time", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).w());
            intent.putExtra("sns_gallery_ed_time", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).s());
            intent.putExtra("sns_video_scene", 4);
            intent.putExtra("key_from_scene", 4);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Z6(activityC18141xfedff17));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17) != null) {
                intent.putExtra("sns_gallery_limit_seq", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).L());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.c7(activityC18141xfedff17).s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.U6(activityC18141xfedff17), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17).N(i17, i18));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so T6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.T6(activityC18141xfedff17);
                T6.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i27 = T6.M;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_position", i27);
            }
            activityC18141xfedff17.startActivityForResult(intent, 8);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(activityC18141xfedff17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
            intent2.putExtra("INTENT_TALKER", i19.m70374x6bf53a6c());
            intent2.putExtra("INTENT_NEED_RPT_FEED", true);
            intent2.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i17));
            intent2.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.Z6(activityC18141xfedff17));
            activityC18141xfedff17.startActivityForResult(intent2, 12);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.a7(activityC18141xfedff17, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }
}
