package a84;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2362h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2363i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f2364m;

    public u(int i17, int i18, java.lang.String str, java.lang.String str2, float f17, boolean z17, android.widget.ImageView imageView) {
        this.f2358d = i17;
        this.f2359e = i18;
        this.f2360f = str;
        this.f2361g = str2;
        this.f2362h = f17;
        this.f2363i = z17;
        this.f2364m = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap J2;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int i18 = this.f2358d;
            if (i18 <= 0 || (i17 = this.f2359e) <= 0) {
                J2 = com.tencent.mm.sdk.platformtools.x.J(this.f2360f, options);
                m44.a.c(this.f2361g, J2, options);
            } else {
                J2 = com.tencent.mm.sdk.platformtools.x.M(this.f2360f, i18, i17, false, options);
                m44.a.c(this.f2361g, J2, options);
            }
            float f17 = this.f2362h;
            if (f17 > 0.0f && J2 != null) {
                J2 = com.tencent.mm.sdk.platformtools.x.s0(J2, false, f17 * J2.getWidth());
            }
            if (J2 != null) {
                if (this.f2363i) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    a84.y yVar = a84.z.f2379a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    if (yVar != null && !android.text.TextUtils.isEmpty(this.f2361g) && !J2.isRecycled()) {
                        ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.v) yVar).a(this.f2361g, J2);
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new a84.t(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3");
    }
}
