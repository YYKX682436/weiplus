package sm3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f491432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f491433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f491434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f491435g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0, int i17, long j17, long j18) {
        this.f491432d = c16708x2eab1ea0;
        this.f491433e = i17;
        this.f491434f = j17;
        this.f491435g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f491432d.d(this.f491433e, this.f491434f, this.f491435g, true);
    }
}
