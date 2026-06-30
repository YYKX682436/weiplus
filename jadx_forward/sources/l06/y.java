package l06;

/* loaded from: classes16.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final r06.y0 f396495a;

    static {
        h26.m mVar = h26.m.f359907a;
        r06.y yVar = new r06.y(h26.m.f359908b, l06.x.f396484f);
        o06.h hVar = o06.h.f423494e;
        n16.g f17 = l06.x.f396485g.f();
        o06.x1 x1Var = o06.x1.f423537a;
        e26.c0 c0Var = e26.u.f328570e;
        r06.y0 y0Var = new r06.y0(yVar, hVar, false, false, f17, x1Var, c0Var);
        y0Var.f450092p = o06.t0.f423521h;
        o06.g0 g0Var = o06.f0.f423478e;
        if (g0Var == null) {
            r06.y0.j0(9);
            throw null;
        }
        y0Var.f450093q = g0Var;
        java.util.List c17 = kz5.b0.c(r06.p1.x0(y0Var, p06.i.f432298a, false, f26.d3.f340677g, n16.g.k(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3), 0, c0Var));
        if (y0Var.f450095s != null) {
            throw new java.lang.IllegalStateException("Type parameters are already set for " + y0Var.mo132800xfb82e301());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c17);
        y0Var.f450095s = arrayList;
        y0Var.f450094r = new f26.q(y0Var, arrayList, y0Var.f450096t, y0Var.f450097u);
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            r06.y0.j0(13);
            throw null;
        }
        java.util.Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            ((r06.r) ((o06.n0) it.next())).C0(y0Var.k());
        }
        f396495a = y0Var;
    }
}
