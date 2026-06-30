package v54;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v54.b f514897e;

    public a(v54.b bVar, java.lang.String str) {
        this.f514897e = bVar;
        this.f514896d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
        v54.b bVar = this.f514897e;
        android.widget.TextView textView = (android.widget.TextView) bVar.f514898a.get();
        if (textView != null) {
            java.lang.String str = this.f514896d;
            if (!android.text.TextUtils.isEmpty(str)) {
                textView.setText(bVar.f514899b + str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, backTxtViewRef get null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
    }
}
