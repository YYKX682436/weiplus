package lx;

/* loaded from: classes11.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5200x1ffc54fb f403339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403340e;

    public i4(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5200x1ffc54fb c5200x1ffc54fb, com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a) {
        this.f403339d = c5200x1ffc54fb;
        this.f403340e = c10491x8102098a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.z0 z0Var = this.f403339d.f135542g;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23526x5ce0d8a7 c23526x5ce0d8a7 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23526x5ce0d8a7(z0Var.f90031a, z0Var.f90032b);
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f403340e.f146787e;
        if (c23413x332f291 != null) {
            c23413x332f291.m86245x87d6202f(0L, c23526x5ce0d8a7, lx.h4.f403321d);
        }
    }
}
