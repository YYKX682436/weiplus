package i33;

/* loaded from: classes10.dex */
public final class b1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public boolean f369694f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6630xab45bdc9 f369695g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f369696h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f369697i;

    /* renamed from: m, reason: collision with root package name */
    public long f369698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369695g = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6630xab45bdc9();
        this.f369696h = new java.util.ArrayList();
        this.f369697i = new java.util.LinkedHashMap();
    }

    public final void W6(java.lang.String ticket, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        this.f369697i.put(ticket, new i33.v(ticket, java.lang.System.currentTimeMillis(), str, 0L, 0, 24, null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6630xab45bdc9 c6630xab45bdc9 = this.f369695g;
        c6630xab45bdc9.f139831i = currentTimeMillis;
        ((java.util.ArrayList) this.f369696h).clear();
        c6630xab45bdc9.f139837o = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19930x82696e7f());
        c6630xab45bdc9.f139836n = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19922x436d1252());
        c6630xab45bdc9.f139843u = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo451xac79a11b() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.b1.mo451xac79a11b():void");
    }
}
