package b0;

/* loaded from: classes14.dex */
public final class h implements g0.m, s1.j1, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f16302d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.y1 f16303e;

    /* renamed from: f, reason: collision with root package name */
    public final b0.f3 f16304f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16305g;

    /* renamed from: h, reason: collision with root package name */
    public s1.z f16306h;

    /* renamed from: i, reason: collision with root package name */
    public s1.z f16307i;

    /* renamed from: m, reason: collision with root package name */
    public p2.q f16308m;

    /* renamed from: n, reason: collision with root package name */
    public final z0.t f16309n;

    public h(kotlinx.coroutines.y0 scope, b0.y1 orientation, b0.f3 scrollableState, boolean z17) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        kotlin.jvm.internal.o.g(scrollableState, "scrollableState");
        this.f16302d = scope;
        this.f16303e = orientation;
        this.f16304f = scrollableState;
        this.f16305g = z17;
        b0.f fVar = new b0.f(this);
        t1.f fVar2 = a0.b1.f80a;
        boolean z18 = androidx.compose.ui.platform.f3.f10562a;
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        z0.t a17 = z0.m.a(this, e3Var, new a0.a1(fVar));
        kotlin.jvm.internal.o.g(a17, "<this>");
        this.f16309n = z0.m.a(a17, e3Var, new g0.n(this));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final d1.g a(d1.g gVar, long j17) {
        long b17 = p2.r.b(j17);
        int ordinal = this.f16303e.ordinal();
        if (ordinal == 0) {
            return gVar.c(0.0f, c(gVar.f225630b, gVar.f225632d, d1.k.b(b17)));
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        return gVar.c(c(gVar.f225629a, gVar.f225631c, d1.k.d(b17)), 0.0f);
    }

    public final java.lang.Object b(d1.g gVar, d1.g gVar2, kotlin.coroutines.Continuation continuation) {
        float f17;
        float f18;
        int ordinal = this.f16303e.ordinal();
        if (ordinal == 0) {
            f17 = gVar.f225630b;
            f18 = gVar2.f225630b;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            f17 = gVar.f225629a;
            f18 = gVar2.f225629a;
        }
        float f19 = f17 - f18;
        if (this.f16305g) {
            f19 = -f19;
        }
        java.lang.Object b17 = b0.o2.b(this.f16304f, f19, null, continuation, 2, null);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }

    public final float c(float f17, float f18, float f19) {
        if ((f17 >= 0.0f && f18 <= f19) || (f17 < 0.0f && f18 > f19)) {
            return 0.0f;
        }
        float f27 = f18 - f19;
        return java.lang.Math.abs(f17) < java.lang.Math.abs(f27) ? f17 : f27;
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        this.f16307i = coordinates;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.j1
    public void y(long j17) {
        s1.z zVar;
        s1.z zVar2 = this.f16307i;
        p2.q qVar = this.f16308m;
        if (qVar != null) {
            long j18 = qVar.f351396a;
            if (!p2.q.a(j18, j17)) {
                if (zVar2 != null && ((u1.c1) zVar2).p0()) {
                    if ((this.f16303e != b0.y1.Horizontal ? p2.q.b(((u1.c1) zVar2).f402052f) < p2.q.b(j18) : ((int) (((u1.c1) zVar2).f402052f >> 32)) < ((int) (j18 >> 32))) && (zVar = this.f16306h) != null) {
                        u1.c1 c1Var = (u1.c1) zVar2;
                        d1.g r07 = c1Var.r0(zVar, false);
                        d1.g a17 = d1.h.a(d1.e.f225623b, p2.r.b(j18));
                        d1.g a18 = a(r07, c1Var.f402052f);
                        boolean b17 = a17.b(r07);
                        boolean z17 = !kotlin.jvm.internal.o.b(a18, r07);
                        if (b17 && z17) {
                            kotlinx.coroutines.l.d(this.f16302d, null, null, new b0.g(this, r07, a18, null), 3, null);
                        }
                    }
                }
            }
        }
        this.f16308m = new p2.q(j17);
    }
}
