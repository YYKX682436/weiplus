package vb4;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f516327a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.ValueAnimator f516328b;

    /* renamed from: c, reason: collision with root package name */
    public vb4.c f516329c;

    /* renamed from: d, reason: collision with root package name */
    public int f516330d;

    /* renamed from: e, reason: collision with root package name */
    public int f516331e;

    /* renamed from: f, reason: collision with root package name */
    public int f516332f;

    /* renamed from: g, reason: collision with root package name */
    public int f516333g;

    /* renamed from: h, reason: collision with root package name */
    public int f516334h;

    /* renamed from: i, reason: collision with root package name */
    public int f516335i;

    /* renamed from: j, reason: collision with root package name */
    public int f516336j;

    /* renamed from: k, reason: collision with root package name */
    public int f516337k;

    /* renamed from: l, reason: collision with root package name */
    public int f516338l;

    /* renamed from: m, reason: collision with root package name */
    public int f516339m;

    public b(android.app.Activity activity, android.view.View view, boolean z17) {
        this.f516327a = view;
    }

    public void a(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        this.f516330d = bundle.getInt("param_thumb_left");
        this.f516331e = bundle.getInt("param_thumb_top");
        this.f516332f = bundle.getInt("param_thumb_width");
        this.f516333g = bundle.getInt("param_thumb_height");
        this.f516337k = bundle.getInt("param_target_width");
        this.f516336j = bundle.getInt("param_target_height");
        this.f516338l = bundle.getInt("param_target_left");
        this.f516339m = bundle.getInt("param_target_top");
        this.f516334h = this.f516336j - this.f516333g;
        this.f516335i = this.f516337k - this.f516332f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdAnimation", "left=%s, top=%s, width=%s, height=%s, targetW=%s, targetH=%s, targetLeft=%s, targetTop=%s", java.lang.Integer.valueOf(this.f516330d), java.lang.Integer.valueOf(this.f516331e), java.lang.Integer.valueOf(this.f516332f), java.lang.Integer.valueOf(this.f516333g), java.lang.Integer.valueOf(this.f516337k), java.lang.Integer.valueOf(this.f516336j), java.lang.Integer.valueOf(this.f516338l), java.lang.Integer.valueOf(this.f516339m));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginAndTargetParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("param_thumb_left", i17);
        bundle.putInt("param_thumb_top", i18);
        bundle.putInt("param_thumb_width", i19);
        bundle.putInt("param_thumb_height", i27);
        bundle.putInt("param_target_left", i28);
        bundle.putInt("param_target_top", i29);
        bundle.putInt("param_target_width", i37);
        bundle.putInt("param_target_height", i38);
        a(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginAndTargetParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void c(vb4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        this.f516329c = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void d(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        android.animation.ValueAnimator valueAnimator = this.f516328b;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f516328b.setStartDelay(j17);
            this.f516328b.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }
}
