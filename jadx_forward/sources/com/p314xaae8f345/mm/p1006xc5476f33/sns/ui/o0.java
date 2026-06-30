package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b f251595e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b) {
        this.f251595e = activityC17940xbaa2983b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w
    public void a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_gallery_is_artist", true);
        intent.putExtra("sns_gallery_position", i17);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.f247734r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b = this.f251595e;
        java.lang.String str2 = activityC17940xbaa2983b.f247738g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        intent.putExtra("sns_gallery_artist_lan", str2);
        intent.putExtra("sns_gallery_showtype", 2);
        intent.putExtra("key_from_scene", 6);
        intent.setClass(activityC17940xbaa2983b, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b2 = this.f251595e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17940xbaa2983b2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17940xbaa2983b2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17940xbaa2983b2, "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
    }
}
