package lx;

/* loaded from: classes11.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f403291e;

    public f3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, long j17) {
        this.f403290d = c10491x8102098a;
        this.f403291e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23472xcb4f1049 c23472xcb4f1049 = this.f403290d.f146790h;
        if (c23472xcb4f1049 != null) {
            c23472xcb4f1049.m86609xb1fb8cd2(this.f403291e, lx.e3.f403275d);
        }
    }
}
