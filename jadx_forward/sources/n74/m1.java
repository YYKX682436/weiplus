package n74;

/* loaded from: classes4.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 f416929e;

    public m1(n74.n1 n1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43) {
        this.f416928d = str;
        this.f416929e = c17806x48d2cd43;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
        try {
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f416928d, null);
            if (J2 != null && !J2.isRecycled()) {
                ((ku5.t0) ku5.t0.f394148d).B(new n74.l1(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setImageBitmapAsync decode bitmap drawable, exp = " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
    }
}
