package k90;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k90.b f387036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f387037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi3.g f387038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm5.y f387039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387040i;

    public a(java.lang.String str, k90.b bVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, oi3.g gVar, bm5.y yVar, java.lang.String str2) {
        this.f387035d = str;
        this.f387036e = bVar;
        this.f387037f = f9Var;
        this.f387038g = gVar;
        this.f387039h = yVar;
        this.f387040i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        bm5.v vVar;
        java.lang.String str3 = this.f387035d;
        if (this.f387036e.f387041d.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str3))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("c2c_write_old_path");
            c6754x4f2fd58c.u(str3);
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f387037f;
            oi3.g gVar = this.f387038g;
            bm5.y yVar = this.f387039h;
            if ((f9Var == null || (str = f9Var.Q0()) == null) && (gVar == null || (str = gVar.m75945x2fec8307(gVar.f427150d + 3)) == null)) {
                str = yVar != null ? yVar.f104291a : null;
            }
            c6754x4f2fd58c.f140812h = c6754x4f2fd58c.b("msgTalker", str, true);
            c6754x4f2fd58c.f140811g = f9Var != null ? f9Var.mo78013xfb85f7b0() : gVar != null ? gVar.m75939xb282bd08(gVar.f427150d + 4) : 0;
            long j17 = 0;
            c6754x4f2fd58c.f140813i = f9Var != null ? f9Var.m124847x74d37ac6() : gVar != null ? gVar.m75942xfb822ef2(gVar.f427150d + 0) : yVar != null ? yVar.f104292b : 0L;
            if (f9Var != null) {
                j17 = f9Var.I0();
            } else if (gVar != null) {
                j17 = gVar.m75942xfb822ef2(gVar.f427150d + 1);
            } else if (yVar != null) {
                j17 = yVar.f104293c;
            }
            c6754x4f2fd58c.f140814j = j17;
            c6754x4f2fd58c.r(this.f387040i);
            if ((f9Var == null || (str2 = bm5.w.a(f9Var).f104286d) == null) && ((gVar == null || (str2 = bm5.w.b(gVar).f104286d) == null) && (yVar == null || (vVar = yVar.f104296f) == null || (str2 = vVar.f104286d) == null))) {
                str2 = "";
            }
            c6754x4f2fd58c.s(str2);
            c6754x4f2fd58c.k();
        }
    }
}
