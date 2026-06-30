package e1;

/* loaded from: classes14.dex */
public final class d1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f327768d;

    /* renamed from: e, reason: collision with root package name */
    public final float f327769e;

    /* renamed from: f, reason: collision with root package name */
    public final float f327770f;

    /* renamed from: g, reason: collision with root package name */
    public final float f327771g;

    /* renamed from: h, reason: collision with root package name */
    public final float f327772h;

    /* renamed from: i, reason: collision with root package name */
    public final float f327773i;

    /* renamed from: m, reason: collision with root package name */
    public final float f327774m;

    /* renamed from: n, reason: collision with root package name */
    public final float f327775n;

    /* renamed from: o, reason: collision with root package name */
    public final float f327776o;

    /* renamed from: p, reason: collision with root package name */
    public final float f327777p;

    /* renamed from: q, reason: collision with root package name */
    public final long f327778q;

    /* renamed from: r, reason: collision with root package name */
    public final e1.a1 f327779r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f327780s;

    /* renamed from: t, reason: collision with root package name */
    public final long f327781t;

    /* renamed from: u, reason: collision with root package name */
    public final long f327782u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.l f327783v;

    public d1(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, long j17, e1.a1 a1Var, boolean z17, e1.w0 w0Var, long j18, long j19, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lVar);
        this.f327768d = f17;
        this.f327769e = f18;
        this.f327770f = f19;
        this.f327771g = f27;
        this.f327772h = f28;
        this.f327773i = f29;
        this.f327774m = f37;
        this.f327775n = f38;
        this.f327776o = f39;
        this.f327777p = f47;
        this.f327778q = j17;
        this.f327779r = a1Var;
        this.f327780s = z17;
        this.f327781t = j18;
        this.f327782u = j19;
        this.f327783v = new e1.b1(this);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    /* renamed from: equals */
    public boolean m126633xb2c87fbf(java.lang.Object obj) {
        e1.d1 d1Var = obj instanceof e1.d1 ? (e1.d1) obj : null;
        if (d1Var == null) {
            return false;
        }
        if (!(this.f327768d == d1Var.f327768d)) {
            return false;
        }
        if (!(this.f327769e == d1Var.f327769e)) {
            return false;
        }
        if (!(this.f327770f == d1Var.f327770f)) {
            return false;
        }
        if (!(this.f327771g == d1Var.f327771g)) {
            return false;
        }
        if (!(this.f327772h == d1Var.f327772h)) {
            return false;
        }
        if (!(this.f327773i == d1Var.f327773i)) {
            return false;
        }
        if (!(this.f327774m == d1Var.f327774m)) {
            return false;
        }
        if (!(this.f327775n == d1Var.f327775n)) {
            return false;
        }
        if (!(this.f327776o == d1Var.f327776o)) {
            return false;
        }
        if (!(this.f327777p == d1Var.f327777p)) {
            return false;
        }
        int i17 = e1.i1.f327806c;
        return ((this.f327778q > d1Var.f327778q ? 1 : (this.f327778q == d1Var.f327778q ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327779r, d1Var.f327779r) && this.f327780s == d1Var.f327780s && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null) && e1.y.c(this.f327781t, d1Var.f327781t) && e1.y.c(this.f327782u, d1Var.f327782u);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new e1.c1(m17, this), 4, null);
    }

    /* renamed from: hashCode */
    public int m126634x8cdac1b() {
        int hashCode = ((((((((((((((((((java.lang.Float.hashCode(this.f327768d) * 31) + java.lang.Float.hashCode(this.f327769e)) * 31) + java.lang.Float.hashCode(this.f327770f)) * 31) + java.lang.Float.hashCode(this.f327771g)) * 31) + java.lang.Float.hashCode(this.f327772h)) * 31) + java.lang.Float.hashCode(this.f327773i)) * 31) + java.lang.Float.hashCode(this.f327774m)) * 31) + java.lang.Float.hashCode(this.f327775n)) * 31) + java.lang.Float.hashCode(this.f327776o)) * 31) + java.lang.Float.hashCode(this.f327777p)) * 31;
        int i17 = e1.i1.f327806c;
        int hashCode2 = (((((((hashCode + java.lang.Long.hashCode(this.f327778q)) * 31) + this.f327779r.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327780s)) * 31) + 0) * 31;
        int i18 = e1.y.f327854l;
        return ((hashCode2 + java.lang.Long.hashCode(this.f327781t)) * 31) + java.lang.Long.hashCode(this.f327782u);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    /* renamed from: toString */
    public java.lang.String m126635x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb6.append(this.f327768d);
        sb6.append(", scaleY=");
        sb6.append(this.f327769e);
        sb6.append(", alpha = ");
        sb6.append(this.f327770f);
        sb6.append(", translationX=");
        sb6.append(this.f327771g);
        sb6.append(", translationY=");
        sb6.append(this.f327772h);
        sb6.append(", shadowElevation=");
        sb6.append(this.f327773i);
        sb6.append(", rotationX=");
        sb6.append(this.f327774m);
        sb6.append(", rotationY=");
        sb6.append(this.f327775n);
        sb6.append(", rotationZ=");
        sb6.append(this.f327776o);
        sb6.append(", cameraDistance=");
        sb6.append(this.f327777p);
        sb6.append(", transformOrigin=");
        int i17 = e1.i1.f327806c;
        sb6.append((java.lang.Object) ("TransformOrigin(packedValue=" + this.f327778q + ')'));
        sb6.append(", shape=");
        sb6.append(this.f327779r);
        sb6.append(", clip=");
        sb6.append(this.f327780s);
        sb6.append(", renderEffect=null, ambientShadowColor=");
        sb6.append((java.lang.Object) e1.y.i(this.f327781t));
        sb6.append(", spotShadowColor=");
        sb6.append((java.lang.Object) e1.y.i(this.f327782u));
        sb6.append(')');
        return sb6.toString();
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
