package xd4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f535175d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f535176e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xd4.z f535177f;

    public h(xd4.z zVar) {
        this.f535177f = zVar;
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("schedule", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        this.f535175d = i17;
        if (android.os.SystemClock.uptimeMillis() - this.f535176e > 100) {
            run();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            xd4.z zVar = this.f535177f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = zVar.f535262j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            n3Var.mo50300x3fa464aa(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = zVar.f535262j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            n3Var2.mo50297x7c4d7ca2(this, 100L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("schedule", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        this.f535176e = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f17 = xd4.z.f(this.f535177f);
        if (f17 != null) {
            f17.M(this.f535175d, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
    }
}
