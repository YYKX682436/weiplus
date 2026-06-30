package i64;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f370755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f370756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f370760i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i64.m1 f370761m;

    public l1(i64.m1 m1Var, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, android.widget.ImageView imageView) {
        this.f370761m = m1Var;
        this.f370755d = i17;
        this.f370756e = i18;
        this.f370757f = i19;
        this.f370758g = str;
        this.f370759h = str2;
        this.f370760i = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap b17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int i18 = this.f370755d;
            if (i18 == 0) {
                int i19 = this.f370756e;
                b17 = (i19 <= 0 || (i17 = this.f370757f) <= 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f370758g, options) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(this.f370758g, i19, i17, false, options);
                m44.a.c(this.f370759h, b17, options);
            } else {
                b17 = i18 == 1 ? this.f370761m.b(this.f370758g) : null;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new i64.k1(this, b17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "setImageToImageView decode bitmap, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1");
    }
}
