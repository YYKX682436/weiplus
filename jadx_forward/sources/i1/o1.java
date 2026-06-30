package i1;

/* loaded from: classes14.dex */
public final class o1 extends i1.q1 implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368520d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368521e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368522f;

    /* renamed from: g, reason: collision with root package name */
    public final float f368523g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368524h;

    /* renamed from: i, reason: collision with root package name */
    public final float f368525i;

    /* renamed from: m, reason: collision with root package name */
    public final float f368526m;

    /* renamed from: n, reason: collision with root package name */
    public final float f368527n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f368528o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f368529p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData, java.util.List children) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipPathData, "clipPathData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(children, "children");
        this.f368520d = name;
        this.f368521e = f17;
        this.f368522f = f18;
        this.f368523g = f19;
        this.f368524h = f27;
        this.f368525i = f28;
        this.f368526m = f29;
        this.f368527n = f37;
        this.f368528o = clipPathData;
        this.f368529p = children;
    }

    /* renamed from: equals */
    public boolean m134483xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1.o1)) {
            return false;
        }
        i1.o1 o1Var = (i1.o1) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368520d, o1Var.f368520d)) {
            return false;
        }
        if (!(this.f368521e == o1Var.f368521e)) {
            return false;
        }
        if (!(this.f368522f == o1Var.f368522f)) {
            return false;
        }
        if (!(this.f368523g == o1Var.f368523g)) {
            return false;
        }
        if (!(this.f368524h == o1Var.f368524h)) {
            return false;
        }
        if (!(this.f368525i == o1Var.f368525i)) {
            return false;
        }
        if (this.f368526m == o1Var.f368526m) {
            return ((this.f368527n > o1Var.f368527n ? 1 : (this.f368527n == o1Var.f368527n ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368528o, o1Var.f368528o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368529p, o1Var.f368529p);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m134484x8cdac1b() {
        return (((((((((((((((((this.f368520d.hashCode() * 31) + java.lang.Float.hashCode(this.f368521e)) * 31) + java.lang.Float.hashCode(this.f368522f)) * 31) + java.lang.Float.hashCode(this.f368523g)) * 31) + java.lang.Float.hashCode(this.f368524h)) * 31) + java.lang.Float.hashCode(this.f368525i)) * 31) + java.lang.Float.hashCode(this.f368526m)) * 31) + java.lang.Float.hashCode(this.f368527n)) * 31) + this.f368528o.hashCode()) * 31) + this.f368529p.hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new i1.n1(this);
    }
}
