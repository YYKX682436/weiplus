package a84;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t84.c f2376h;

    public x(int i17, int i18, java.lang.String str, float f17, t84.c cVar) {
        this.f2372d = i17;
        this.f2373e = i18;
        this.f2374f = str;
        this.f2375g = f17;
        this.f2376h = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$6");
        int i17 = this.f2373e;
        java.lang.String str = this.f2374f;
        int i18 = this.f2372d;
        try {
            android.graphics.Bitmap J2 = (i18 <= 0 || i17 <= 0) ? com.tencent.mm.sdk.platformtools.x.J(str, null) : com.tencent.mm.sdk.platformtools.x.L(str, i18, i17);
            float f17 = this.f2375g;
            if (f17 > 0.0f && J2 != null && !J2.isRecycled()) {
                J2 = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.x.k0(J2, i18, i17, true), true, f17);
            }
            if (J2 != null && !J2.isRecycled()) {
                this.f2376h.f(J2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$6");
    }
}
