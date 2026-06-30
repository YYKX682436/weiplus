package c1;

/* loaded from: classes14.dex */
public final class p extends androidx.compose.ui.platform.i3 implements t1.b, t1.d, u1.s1, s1.i1 {

    /* renamed from: q1, reason: collision with root package name */
    public static final /* synthetic */ int f37764q1 = 0;

    /* renamed from: d, reason: collision with root package name */
    public c1.p f37765d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.i f37766e;

    /* renamed from: f, reason: collision with root package name */
    public c1.j0 f37767f;

    /* renamed from: g, reason: collision with root package name */
    public c1.p f37768g;

    /* renamed from: h, reason: collision with root package name */
    public c1.i f37769h;

    /* renamed from: i, reason: collision with root package name */
    public m1.b f37770i;

    /* renamed from: m, reason: collision with root package name */
    public s1.f f37771m;

    /* renamed from: n, reason: collision with root package name */
    public c1.c0 f37772n;

    /* renamed from: o, reason: collision with root package name */
    public final c1.x f37773o;

    /* renamed from: p, reason: collision with root package name */
    public c1.h0 f37774p;

    /* renamed from: q, reason: collision with root package name */
    public u1.c1 f37775q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37776r;

    /* renamed from: s, reason: collision with root package name */
    public n1.d f37777s;

    /* renamed from: t, reason: collision with root package name */
    public final o0.i f37778t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(c1.j0 r2, yz5.l r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L8
            boolean r3 = androidx.compose.ui.platform.f3.f10562a
            androidx.compose.ui.platform.e3 r3 = androidx.compose.ui.platform.e3.f10553d
        L8:
            java.lang.String r4 = "initialFocus"
            kotlin.jvm.internal.o.g(r2, r4)
            java.lang.String r4 = "inspectorInfo"
            kotlin.jvm.internal.o.g(r3, r4)
            r1.<init>(r3)
            o0.i r3 = new o0.i
            r4 = 16
            c1.p[] r5 = new c1.p[r4]
            r0 = 0
            r3.<init>(r5, r0)
            r1.f37766e = r3
            r1.f37767f = r2
            c1.y r2 = new c1.y
            r2.<init>()
            r1.f37773o = r2
            o0.i r2 = new o0.i
            n1.d[] r3 = new n1.d[r4]
            r2.<init>(r3, r0)
            r1.f37778t = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.p.<init>(c1.j0, yz5.l, int, kotlin.jvm.internal.i):void");
    }

    @Override // t1.b
    public void B(t1.e scope) {
        o0.i iVar;
        o0.i iVar2;
        int ordinal;
        u1.c1 c1Var;
        u1.w wVar;
        u1.r1 r1Var;
        c1.k focusManager;
        kotlin.jvm.internal.o.g(scope, "scope");
        c1.p pVar = (c1.p) scope.a(c1.w.f37782a);
        if (!kotlin.jvm.internal.o.b(pVar, this.f37765d)) {
            if (pVar == null && (((ordinal = this.f37767f.ordinal()) == 0 || ordinal == 2) && (c1Var = this.f37775q) != null && (wVar = c1Var.f423554h) != null && (r1Var = wVar.f423689m) != null && (focusManager = r1Var.getFocusManager()) != null)) {
                ((c1.m) focusManager).a(true);
            }
            c1.p pVar2 = this.f37765d;
            if (pVar2 != null && (iVar2 = pVar2.f37766e) != null) {
                iVar2.k(this);
            }
            if (pVar != null && (iVar = pVar.f37766e) != null) {
                iVar.b(this);
            }
        }
        this.f37765d = pVar;
        c1.i iVar3 = (c1.i) scope.a(c1.h.f37741a);
        if (!kotlin.jvm.internal.o.b(iVar3, this.f37769h)) {
            c1.i iVar4 = this.f37769h;
            if (iVar4 != null) {
                iVar4.d(this);
            }
            if (iVar3 != null) {
                iVar3.a(this);
            }
        }
        this.f37769h = iVar3;
        c1.h0 h0Var = (c1.h0) scope.a(c1.g0.f37740a);
        if (!kotlin.jvm.internal.o.b(h0Var, this.f37774p)) {
            c1.h0 h0Var2 = this.f37774p;
            if (h0Var2 != null) {
                h0Var2.c(this);
            }
            if (h0Var != null) {
                h0Var.a(this);
            }
        }
        this.f37774p = h0Var;
        this.f37770i = (m1.b) scope.a(r1.c.f368570a);
        this.f37771m = (s1.f) scope.a(s1.h.f402012a);
        this.f37777s = (n1.d) scope.a(n1.f.f334036a);
        this.f37772n = (c1.c0) scope.a(c1.b0.f37728a);
        c1.b0.a(this);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.j0 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f37767f = value;
        c1.i iVar = this.f37769h;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // t1.d
    public t1.f getKey() {
        return c1.w.f37782a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        boolean z17 = this.f37775q == null;
        this.f37775q = (u1.c1) coordinates;
        if (z17) {
            c1.b0.a(this);
        }
        if (this.f37776r) {
            this.f37776r = false;
            c1.k0.f(this);
        }
    }

    @Override // u1.s1
    public boolean isValid() {
        return this.f37765d != null;
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
}
