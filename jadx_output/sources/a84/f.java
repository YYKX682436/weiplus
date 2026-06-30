package a84;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f2278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f2281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ca4.s0 f2282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2283i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2284m;

    public f(r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, za4.e0 e0Var, ca4.s0 s0Var, java.lang.String str3, java.lang.String str4) {
        this.f2278d = jj4Var;
        this.f2279e = str;
        this.f2280f = str2;
        this.f2281g = e0Var;
        this.f2282h = s0Var;
        this.f2283i = str3;
        this.f2284m = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$4");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(new a84.k(this.f2278d.f377855d, this.f2279e, this.f2280f, this.f2281g));
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        r45.jj4 jj4Var = this.f2278d;
        ca4.s0 s0Var = this.f2282h;
        com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
        d17.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
        Cj.g(jj4Var, 8, s0Var, d17, this.f2283i, this.f2284m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$4");
    }
}
