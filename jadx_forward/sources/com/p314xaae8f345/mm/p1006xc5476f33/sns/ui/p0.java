package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b f251669a;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b) {
        this.f251669a = activityC17940xbaa2983b;
    }

    public void a(r45.za zaVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b = this.f251669a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b).setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b).m70546x66ad9b78(zaVar);
            java.lang.String str = zaVar.f473374d;
            if (str != null && !str.equals("")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                android.content.SharedPreferences sharedPreferences = activityC17940xbaa2983b.f247740i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                sharedPreferences.edit().putString("artist_name", str).commit();
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.T6(activityC17940xbaa2983b) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.T6(activityC17940xbaa2983b).notifyDataSetChanged();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17940xbaa2983b.f247739h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        u3Var.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
    }
}
