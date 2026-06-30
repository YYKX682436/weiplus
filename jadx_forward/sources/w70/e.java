package w70;

/* loaded from: classes12.dex */
public final class e implements r70.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w70.f f524910d;

    public e(w70.f fVar) {
        this.f524910d = fVar;
    }

    @Override // r70.b
    public void K3(r70.c event) {
        r70.e eVar;
        java.lang.String str;
        r70.h hVar;
        r15.i n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        r70.d dVar = r70.d.f474618f;
        r70.d dVar2 = event.f474608b;
        if (dVar2 == dVar) {
            this.f524910d.getClass();
            if (dVar2 != dVar || !event.f474612f || (eVar = event.f474613g) == null || (str = eVar.f474621b) == null || (hVar = event.f474615i) == null) {
                return;
            }
            k70.i0 i0Var = hVar.f474643b.f474636e;
            ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
            r15.b bVar = i0Var.f386194t;
            long j17 = event.f474609c;
            ((ti3.q) k0Var).getClass();
            if (str.length() == 0) {
                return;
            }
            java.lang.Long valueOf = (bVar == null || (n17 = bVar.n()) == null) ? null : java.lang.Long.valueOf(n17.l());
            if (valueOf != null) {
                valueOf.longValue();
                pt0.e0 e0Var = pt0.f0.f439742b1;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str, j17);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = e0Var.l(str, valueOf.longValue());
                if (l17 == null || k17 == null) {
                    return;
                }
                ty.k0 k0Var2 = (ty.k0) i95.n0.c(ty.k0.class);
                ty.p0 p0Var = ty.p0.f504270f;
                ty.r0 r0Var = ty.r0.f504287f;
                r15.i n18 = bVar.n();
                ((ti3.q) k0Var2).wi(p0Var, r0Var, l17, n18 != null ? n18.j() : null, g95.e0.e(k17), g95.e0.b(k17), k17.I0(), str);
            }
        }
    }
}
