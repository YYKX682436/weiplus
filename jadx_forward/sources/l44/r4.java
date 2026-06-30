package l44;

/* loaded from: classes4.dex */
public abstract class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f397859a;

    /* renamed from: b, reason: collision with root package name */
    public final long f397860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397861c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public l44.q4 f397862d;

    /* renamed from: e, reason: collision with root package name */
    public l44.p4 f397863e;

    public r4(long j17, long j18) {
        this.f397859a = j17;
        this.f397860b = j18;
    }

    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
        l44.p4 p4Var = this.f397863e;
        if (p4Var != null) {
            q84.c cVar = (q84.c) p4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            a84.e0 d17 = a84.f0.d(j17, cVar.f442318b);
            java.lang.ref.WeakReference weakReference = cVar.f442319c;
            q84.d dVar = weakReference != null ? (q84.d) weakReference.get() : null;
            if (dVar != null) {
                dVar.a(j17, d17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
    }
}
