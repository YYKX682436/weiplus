package n74;

/* loaded from: classes4.dex */
public abstract class a2 {
    public static void a(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            b(imageView, str, i17);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the avatar url is empty or image view is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return;
        }
        imageView.toString();
        if (str.equalsIgnoreCase((java.lang.String) a84.y0.d(imageView, com.p314xaae8f345.mm.R.id.nae))) {
            za4.t0.d("adId", str, new n74.y1(imageView, i17, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the input avatarUrl is not same as the tag url in the ImageView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        }
    }

    public static void c(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            i64.m1.f370771c.c(imageView, str, i17);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_use_cdn_download_user_avatar, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdUserAvatarHelper", "useCdnDownloadUserAvatar value is " + Ni);
            boolean z17 = Ni > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return false;
        }
    }
}
