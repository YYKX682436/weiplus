package x0;

/* loaded from: classes14.dex */
public class e extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f532408f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f532409g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f532410h;

    /* renamed from: i, reason: collision with root package name */
    public x0.s f532411i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f532412j;

    /* renamed from: k, reason: collision with root package name */
    public int f532413k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f532414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, x0.s invalid, yz5.l lVar, yz5.l lVar2) {
        super(i17, invalid, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalid, "invalid");
        this.f532408f = lVar;
        this.f532409g = lVar2;
        this.f532411i = x0.s.f532472h;
        this.f532412j = new int[0];
        this.f532413k = 1;
    }

    @Override // x0.m
    public void b() {
        x0.z.f532497c = x0.z.f532497c.e(d()).d(this.f532411i);
    }

    @Override // x0.m
    public void c() {
        if (this.f532443c) {
            return;
        }
        this.f532443c = true;
        synchronized (x0.z.f532496b) {
            int i17 = this.f532444d;
            if (i17 >= 0) {
                x0.z.s(i17);
                this.f532444d = -1;
            }
        }
        k(this);
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f532408f;
    }

    @Override // x0.m
    public boolean g() {
        return false;
    }

    @Override // x0.m
    public yz5.l h() {
        return this.f532409g;
    }

    @Override // x0.m
    public void j(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        this.f532413k++;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        int i17 = this.f532413k;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i18 = i17 - 1;
        this.f532413k = i18;
        if (i18 != 0 || this.f532414l) {
            return;
        }
        java.util.Set u17 = u();
        if (u17 != null) {
            if (!(true ^ this.f532414l)) {
                throw new java.lang.IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            x(null);
            int d17 = d();
            java.util.Iterator it = u17.iterator();
            while (it.hasNext()) {
                for (x0.a1 g17 = ((x0.z0) it.next()).g(); g17 != null; g17 = g17.f532395b) {
                    int i19 = g17.f532394a;
                    if (i19 == d17 || kz5.n0.O(this.f532411i, java.lang.Integer.valueOf(i19))) {
                        g17.f532394a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // x0.m
    public void l() {
        if (this.f532414l || this.f532443c) {
            return;
        }
        s();
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.Set u17 = u();
        if (u17 == null) {
            u17 = new java.util.HashSet();
            x(u17);
        }
        u17.add(state);
    }

    @Override // x0.m
    public void n() {
        int length = this.f532412j.length;
        for (int i17 = 0; i17 < length; i17++) {
            x0.z.s(this.f532412j[i17]);
        }
        int i18 = this.f532444d;
        if (i18 >= 0) {
            x0.z.s(i18);
            this.f532444d = -1;
        }
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        x0.h hVar;
        if (!(!this.f532443c)) {
            throw new java.lang.IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        int d17 = d();
        w(d());
        java.lang.Object obj = x0.z.f532496b;
        synchronized (obj) {
            int i17 = x0.z.f532498d;
            x0.z.f532498d = i17 + 1;
            x0.z.f532497c = x0.z.f532497c.j(i17);
            hVar = new x0.h(i17, x0.z.e(e(), d17 + 1, i17), lVar, this);
        }
        if (!this.f532414l && !this.f532443c) {
            int d18 = d();
            synchronized (obj) {
                int i18 = x0.z.f532498d;
                x0.z.f532498d = i18 + 1;
                p(i18);
                x0.z.f532497c = x0.z.f532497c.j(d());
            }
            q(x0.z.e(e(), d18 + 1, d()));
        }
        return hVar;
    }

    public final void s() {
        w(d());
        if (this.f532414l || this.f532443c) {
            return;
        }
        int d17 = d();
        synchronized (x0.z.f532496b) {
            int i17 = x0.z.f532498d;
            x0.z.f532498d = i17 + 1;
            p(i17);
            x0.z.f532497c = x0.z.f532497c.j(d());
        }
        q(x0.z.e(e(), d17 + 1, d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[LOOP:0: B:24:0x00c0->B:25:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[LOOP:1: B:31:0x00db->B:32:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0.p t() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.t():x0.p");
    }

    public java.util.Set u() {
        return this.f532410h;
    }

    public final x0.p v(int i17, java.util.Map map, x0.s invalidSnapshots) {
        x0.a1 p17;
        x0.a1 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidSnapshots, "invalidSnapshots");
        x0.s h17 = e().j(d()).h(this.f532411i);
        java.util.Set<x0.z0> u17 = u();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        for (x0.z0 z0Var : u17) {
            x0.a1 g17 = z0Var.g();
            x0.a1 p18 = x0.z.p(g17, i17, invalidSnapshots);
            if (p18 != null && (p17 = x0.z.p(g17, d(), h17)) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p18, p17)) {
                x0.a1 p19 = x0.z.p(g17, d(), e());
                if (p19 == null) {
                    x0.z.o();
                    throw null;
                }
                if (map == null || (d17 = (x0.a1) map.get(p18)) == null) {
                    d17 = z0Var.d(p17, p18, p19);
                }
                if (d17 == null) {
                    return new x0.n(this);
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, p19)) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, p18)) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(new jz5.l(z0Var, p18.b()));
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        arrayList2.add(z0Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, p17) ? new jz5.l(z0Var, d17) : new jz5.l(z0Var, p17.b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                jz5.l lVar = (jz5.l) arrayList.get(i18);
                x0.z0 z0Var2 = (x0.z0) lVar.f384366d;
                x0.a1 a1Var = (x0.a1) lVar.f384367e;
                a1Var.f532394a = d();
                synchronized (x0.z.f532496b) {
                    a1Var.f532395b = z0Var2.g();
                    z0Var2.e(a1Var);
                }
            }
        }
        if (arrayList2 != null) {
            u17.removeAll(arrayList2);
        }
        return x0.o.f532450a;
    }

    public final void w(int i17) {
        synchronized (x0.z.f532496b) {
            this.f532411i = this.f532411i.j(i17);
        }
    }

    public void x(java.util.Set set) {
        this.f532410h = set;
    }

    public x0.e y(yz5.l lVar, yz5.l lVar2) {
        x0.f fVar;
        if (!(!this.f532443c)) {
            throw new java.lang.IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        w(d());
        java.lang.Object obj = x0.z.f532496b;
        synchronized (obj) {
            int i17 = x0.z.f532498d;
            x0.z.f532498d = i17 + 1;
            x0.z.f532497c = x0.z.f532497c.j(i17);
            x0.s e17 = e();
            q(e17.j(i17));
            fVar = new x0.f(i17, x0.z.e(e17, d() + 1, i17), x0.z.j(lVar, this.f532408f, true), x0.z.b(lVar2, this.f532409g), this);
        }
        if (!this.f532414l && !this.f532443c) {
            int d17 = d();
            synchronized (obj) {
                int i18 = x0.z.f532498d;
                x0.z.f532498d = i18 + 1;
                p(i18);
                x0.z.f532497c = x0.z.f532497c.j(d());
            }
            q(x0.z.e(e(), d17 + 1, d()));
        }
        return fVar;
    }

    public final void z() {
        boolean z17 = true;
        if (this.f532414l) {
            if (!(this.f532444d >= 0)) {
                z17 = false;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}
