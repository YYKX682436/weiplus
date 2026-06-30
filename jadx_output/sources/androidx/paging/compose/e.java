package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f11716a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f11717b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.paging.compose.d f11718c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f11719d;

    public e(kotlinx.coroutines.flow.j flow) {
        kotlin.jvm.internal.o.g(flow, "flow");
        this.f11716a = flow;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        this.f11717b = n0.s4.c(new g4.u0(0, 0, kz5.p0.f313996d), null, 2, null);
        this.f11718c = new androidx.paging.compose.d(this, new androidx.paging.compose.c(this), g3Var);
        g4.z0 z0Var = androidx.paging.compose.j.f11728a;
        this.f11719d = n0.s4.c(new g4.a0(z0Var.f268645a, z0Var.f268646b, z0Var.f268647c, z0Var, null, 16, null), null, 2, null);
    }

    public static final void a(androidx.paging.compose.e eVar) {
        g4.f3 f3Var = eVar.f11718c.f268511a;
        int i17 = f3Var.f268294c;
        int i18 = f3Var.f268295d;
        java.util.List list = f3Var.f268292a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((g4.x4) it.next()).f268620b);
        }
        ((n0.q4) eVar.f11717b).setValue(new g4.u0(i17, i18, arrayList));
    }

    public final java.lang.Object b(int i17) {
        androidx.paging.compose.d dVar = this.f11718c;
        dVar.f268516f = true;
        dVar.f268517g = i17;
        g4.y4 y4Var = dVar.f268512b;
        if (y4Var != null) {
            y4Var.b(dVar.f268511a.a(i17));
        }
        g4.f3 f3Var = dVar.f268511a;
        if (i17 < 0) {
            f3Var.getClass();
        } else if (i17 < f3Var.d()) {
            int i18 = i17 - f3Var.f268294c;
            if (i18 >= 0 && i18 < f3Var.f268293b) {
                f3Var.c(i18);
            }
            return ((g4.u0) ((n0.q4) this.f11717b).getValue()).get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + f3Var.d());
    }

    public final int c() {
        return ((g4.u0) ((n0.q4) this.f11717b).getValue()).d();
    }

    public final g4.a0 d() {
        return (g4.a0) this.f11719d.getValue();
    }
}
