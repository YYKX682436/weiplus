package y45;

/* loaded from: classes11.dex */
public final class p implements y45.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f540916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f540917b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.a f540918c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f540919d;

    public p(android.content.Context context, int i17, m3.a aVar, boolean z17) {
        this.f540916a = context;
        this.f540917b = i17;
        this.f540918c = aVar == null ? new y45.C30753x337571() : aVar;
        this.f540919d = z17;
    }

    public void a(r45.f35 f35Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, java.lang.Throwable th6) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCheckEnd, channel = ");
        int i18 = this.f540917b;
        sb6.append(i18);
        sb6.append(", error = ");
        sb6.append(i17);
        sb6.append(", response = ");
        sb6.append(c16114x800e8cdb);
        d55.u.b("MicroMsg.recovery.operator", sb6.toString(), new java.lang.Object[0]);
        m3.a aVar = this.f540918c;
        if (i17 != 0 && i17 != -5) {
            if (i18 == 1) {
                d55.u.d("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp error, try HTTPS channel.", new java.lang.Object[0]);
                z45.a.b(f35Var, new y45.p(this.f540916a, 2, aVar, this.f540919d));
                return;
            } else {
                if (i18 != 2) {
                    d55.u.d("MicroMsg.recovery.operator", "Unknown channel: %s", java.lang.Integer.valueOf(i18));
                    return;
                }
                d55.u.d("MicroMsg.recovery.operator", "fetchTinkerPatch https rsp error.", new java.lang.Object[0]);
                atomicInteger.set(java.lang.Math.abs(i17) + 60);
                aVar.mo3938xab27b508(java.lang.Integer.valueOf(atomicInteger.get()));
                return;
            }
        }
        if (i18 == 1) {
            d55.u.b("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp successful", new java.lang.Object[0]);
        } else if (i18 == 2) {
            d55.u.b("MicroMsg.recovery.operator", "fetchTinkerPatch https rsp successful", new java.lang.Object[0]);
        }
        if (i17 == -5 || c16114x800e8cdb == null || android.text.TextUtils.isEmpty(c16114x800e8cdb.f223945h)) {
            atomicInteger.set(1);
            aVar.mo3938xab27b508(java.lang.Integer.valueOf(atomicInteger.get()));
        } else if (c16114x800e8cdb.f223943f.intValue() != 2) {
            d55.u.d("MicroMsg.recovery.operator", "[!] Unsupported patch type: %s", c16114x800e8cdb.f223943f);
            atomicInteger.set(32);
            aVar.mo3938xab27b508(java.lang.Integer.valueOf(atomicInteger.get()));
        } else {
            y45.m.b(this.f540916a, c16114x800e8cdb.f223945h, java.lang.Math.max(c16114x800e8cdb.f223948n, 0), c16114x800e8cdb.f223946i, this.f540918c, this.f540919d);
        }
    }
}
