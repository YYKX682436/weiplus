package n74;

/* loaded from: classes4.dex */
public class y1 extends n74.z1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f416982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.widget.ImageView imageView, int i17, java.lang.String str) {
        super(imageView);
        this.f416982b = i17;
        this.f416983c = str;
    }

    @Override // n74.z1, za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download has something error");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
    }

    @Override // n74.z1, za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        super.c(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download is success, it is going to set image view");
        java.lang.ref.WeakReference weakReference = this.f416989a;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                i64.m1.f370771c.c(imageView, str, this.f416982b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn, imageViewRef released, url=" + this.f416983c);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
    }
}
