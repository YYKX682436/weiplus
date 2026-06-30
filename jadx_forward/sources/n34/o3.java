package n34;

/* loaded from: classes4.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f416227d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f416228e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f416229f;

    public o3(n34.v3 v3Var) {
        this.f416229f = v3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        this.f416228e = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getOnlineView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f416229f.f416287f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getOnlineView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (c17983xb14a9c8d != null) {
            c17983xb14a9c8d.M(this.f416227d, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
    }
}
