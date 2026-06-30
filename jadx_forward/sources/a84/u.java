package a84;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f83895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f83896i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f83897m;

    public u(int i17, int i18, java.lang.String str, java.lang.String str2, float f17, boolean z17, android.widget.ImageView imageView) {
        this.f83891d = i17;
        this.f83892e = i18;
        this.f83893f = str;
        this.f83894g = str2;
        this.f83895h = f17;
        this.f83896i = z17;
        this.f83897m = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap J2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int i18 = this.f83891d;
            if (i18 <= 0 || (i17 = this.f83892e) <= 0) {
                J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f83893f, options);
                m44.a.c(this.f83894g, J2, options);
            } else {
                J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(this.f83893f, i18, i17, false, options);
                m44.a.c(this.f83894g, J2, options);
            }
            float f17 = this.f83895h;
            if (f17 > 0.0f && J2 != null) {
                J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(J2, false, f17 * J2.getWidth());
            }
            if (J2 != null) {
                if (this.f83896i) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    a84.y yVar = a84.z.f83912a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    if (yVar != null && !android.text.TextUtils.isEmpty(this.f83894g) && !J2.isRecycled()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.v) yVar).a(this.f83894g, J2);
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).B(new a84.t(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3");
    }
}
