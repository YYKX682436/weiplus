package jb4;

/* loaded from: classes4.dex */
public class t extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f380381a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f380382b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f380383c;

    /* renamed from: d, reason: collision with root package name */
    public final jb4.u f380384d;

    public t(java.lang.String str, java.lang.String str2, java.lang.String str3, jb4.u uVar) {
        this.f380382b = str;
        this.f380383c = str2;
        this.f380381a = str3;
        this.f380384d = uVar;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        java.lang.String str = this.f380383c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        android.graphics.Bitmap b17 = jb4.v.b(this.f380382b, this.f380381a);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "has shot");
        } else {
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "thumbUrl is empty");
                } else {
                    b17 = za4.t0.h(str);
                    if (b17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "has cache thumb");
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getCachedImg exp:" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        return b17;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        jb4.u uVar = this.f380384d;
        if (uVar != null) {
            uVar.a(true, "", bitmap, this.f380382b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
    }
}
