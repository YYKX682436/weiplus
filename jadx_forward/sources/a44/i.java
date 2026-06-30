package a44;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f82810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a44.k f82812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82814h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82815i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82816m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f82817n;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.content.Context context, a44.k kVar, java.lang.String str, android.view.View view, int i17, android.view.View view2, int i18) {
        this.f82810d = c17933xe8d1b226;
        this.f82811e = context;
        this.f82812f = kVar;
        this.f82813g = str;
        this.f82814h = view;
        this.f82815i = i17;
        this.f82816m = view2;
        this.f82817n = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1");
        if (a44.k.f82818g.a(this.f82810d, this.f82811e)) {
            ((ku5.t0) ku5.t0.f394148d).B(new a44.g(this.f82812f, this.f82813g, this.f82814h));
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new a44.h(this.f82812f, this.f82811e, this.f82813g, this.f82815i, this.f82814h, this.f82816m, this.f82817n, this.f82810d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1");
    }
}
