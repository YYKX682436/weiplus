package a84;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f83908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t84.c f83909h;

    public x(int i17, int i18, java.lang.String str, float f17, t84.c cVar) {
        this.f83905d = i17;
        this.f83906e = i18;
        this.f83907f = str;
        this.f83908g = f17;
        this.f83909h = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$6");
        int i17 = this.f83906e;
        java.lang.String str = this.f83907f;
        int i18 = this.f83905d;
        try {
            android.graphics.Bitmap J2 = (i18 <= 0 || i17 <= 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, i18, i17);
            float f17 = this.f83908g;
            if (f17 > 0.0f && J2 != null && !J2.isRecycled()) {
                J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(J2, i18, i17, true), true, f17);
            }
            if (J2 != null && !J2.isRecycled()) {
                this.f83909h.f(J2);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$6");
    }
}
