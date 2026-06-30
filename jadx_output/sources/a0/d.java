package a0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.r f106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f17, e1.a1 a1Var, u1.y1 y1Var, e1.r rVar) {
        super(1);
        this.f103d = f17;
        this.f104e = a1Var;
        this.f105f = y1Var;
        this.f106g = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e1.i iVar;
        b1.c drawWithCache = (b1.c) obj;
        kotlin.jvm.internal.o.g(drawWithCache, "$this$drawWithCache");
        float density = drawWithCache.getDensity();
        float f17 = this.f103d;
        if (!(density * f17 >= 0.0f && d1.k.c(drawWithCache.a()) > 0.0f)) {
            return drawWithCache.b(a0.f.f121d);
        }
        float f18 = 2;
        float min = java.lang.Math.min(p2.h.a(f17, 0.0f) ? 1.0f : (float) java.lang.Math.ceil(f17 * drawWithCache.getDensity()), (float) java.lang.Math.ceil(d1.k.c(drawWithCache.a()) / f18));
        float f19 = min / f18;
        long a17 = d1.f.a(f19, f19);
        long a18 = d1.l.a(d1.k.d(drawWithCache.a()) - min, d1.k.b(drawWithCache.a()) - min);
        boolean z17 = f18 * min > d1.k.c(drawWithCache.a());
        e1.m0 a19 = this.f104e.a(drawWithCache.a(), drawWithCache.f16990d.getLayoutDirection(), drawWithCache);
        if (!(a19 instanceof e1.l0)) {
            if (!(a19 instanceof e1.k0)) {
                throw new jz5.j();
            }
            e1.r rVar = this.f106g;
            if (z17) {
                a17 = d1.e.f225623b;
            }
            if (z17) {
                a18 = drawWithCache.a();
            }
            return drawWithCache.b(new a0.g(rVar, a17, a18, z17 ? g1.m.f267512a : new g1.n(min, 0.0f, 0, 0, null, 30, null)));
        }
        e1.r rVar2 = this.f106g;
        e1.l0 l0Var = (e1.l0) a19;
        boolean b17 = d1.j.b(l0Var.f246278a);
        d1.i iVar2 = l0Var.f246278a;
        if (b17) {
            return drawWithCache.b(new a0.h(z17, rVar2, iVar2.f225637e, f19, min, a17, a18, new g1.n(min, 0.0f, 0, 0, null, 30, null)));
        }
        u1.y1 y1Var = this.f105f;
        a0.c cVar = (a0.c) y1Var.f423724a;
        if (cVar == null) {
            cVar = new a0.c(null, null, null, null, 15, null);
            y1Var.f423724a = cVar;
        }
        e1.p0 p0Var = cVar.f86d;
        if (p0Var == null) {
            p0Var = e1.k.a();
            cVar.f86d = p0Var;
        }
        e1.i iVar3 = (e1.i) p0Var;
        iVar3.c();
        iVar3.a(iVar2);
        if (z17) {
            iVar = iVar3;
        } else {
            e1.p0 a27 = e1.k.a();
            float f27 = (iVar2.f225635c - iVar2.f225633a) - min;
            float f28 = (iVar2.f225636d - iVar2.f225634b) - min;
            long c17 = a0.j.c(iVar2.f225637e, min);
            long c18 = a0.j.c(iVar2.f225638f, min);
            long c19 = a0.j.c(iVar2.f225640h, min);
            long c27 = a0.j.c(iVar2.f225639g, min);
            e1.i iVar4 = iVar3;
            ((e1.i) a27).a(new d1.i(min, min, f27, f28, c17, c18, c27, c19, null));
            iVar4.b(iVar4, a27, 0);
            iVar = iVar4;
        }
        return drawWithCache.b(new a0.i(iVar, rVar2));
    }
}
