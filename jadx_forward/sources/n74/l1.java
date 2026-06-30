package n74;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f416922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n74.m1 f416923e;

    public l1(n74.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f416923e = m1Var;
        this.f416922d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
        try {
            this.f416923e.f416929e.m69671x7a79220(new android.graphics.drawable.BitmapDrawable(this.f416922d));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setImageBitmapAsync set bitmap drawable, exp = " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
    }
}
