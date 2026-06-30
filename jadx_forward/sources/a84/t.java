package a84;

/* loaded from: classes.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f83889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.u f83890e;

    public t(a84.u uVar, android.graphics.Bitmap bitmap) {
        this.f83890e = uVar;
        this.f83889d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        a84.u uVar = this.f83890e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
        try {
            java.lang.String str = (java.lang.String) uVar.f83897m.getTag(com.p314xaae8f345.mm.R.id.n1z);
            if (uVar.f83893f.equals(android.text.TextUtils.isEmpty(str) ? "" : za4.t0.l("adId", str))) {
                uVar.f83897m.setImageBitmap(this.f83889d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdImageLoader", "url changed");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync set bitmap, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
    }
}
