package lx;

/* loaded from: classes11.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f403318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403320g;

    public h3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, int i17, java.util.List list, yz5.l lVar) {
        this.f403317d = c10491x8102098a;
        this.f403318e = i17;
        this.f403319f = list;
        this.f403320g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f403317d.f146787e;
        java.util.List<com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23430xf10635d3> list = this.f403319f;
        if (c23413x332f291 != null) {
            c23413x332f291.m86241x98f37bd(this.f403318e, list, lx.g3.f403304d);
        }
        yz5.l lVar = this.f403320g;
        if (lVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.n0.V0(list))));
        }
    }
}
