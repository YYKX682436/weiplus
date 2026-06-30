package b50;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f99487g;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, int i17, java.util.List list, yz5.l lVar) {
        this.f99484d = c10601x91d05935;
        this.f99485e = i17;
        this.f99486f = list;
        this.f99487g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f99484d.f148595e;
        java.util.List<com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23430xf10635d3> list = this.f99486f;
        if (c23413x332f291 != null) {
            c23413x332f291.m86241x98f37bd(this.f99485e, list, b50.j.f99482d);
        }
        yz5.l lVar = this.f99487g;
        if (lVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.n0.V0(list))));
        }
    }
}
