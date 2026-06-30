package lx;

/* loaded from: classes11.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 f403457e;

    public q3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 c5500xcde1614) {
        this.f403456d = c10491x8102098a;
        this.f403457e = c5500xcde1614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f403456d.f146787e;
        if (c23413x332f291 != null) {
            java.lang.String liveId = this.f403457e.f135832g.f87975b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveId, "liveId");
            c23413x332f291.m86244xe370be53(liveId, lx.p3.f403437d);
        }
    }
}
