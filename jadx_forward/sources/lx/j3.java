package lx;

/* loaded from: classes11.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f403350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f403351f;

    public j3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, long j17, int i17) {
        this.f403349d = c10491x8102098a;
        this.f403350e = j17;
        this.f403351f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23472xcb4f1049 c23472xcb4f1049 = this.f403349d.f146790h;
        if (c23472xcb4f1049 != null) {
            long j17 = this.f403350e;
            int i17 = this.f403351f;
            c23472xcb4f1049.m86608x44e9ad4b(j17, i17 == 0, i17, lx.i3.f403338d);
        }
    }
}
