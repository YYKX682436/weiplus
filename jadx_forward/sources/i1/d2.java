package i1;

/* loaded from: classes14.dex */
public final class d2 extends i1.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f368399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368400f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.r f368401g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368402h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.r f368403i;

    /* renamed from: m, reason: collision with root package name */
    public final float f368404m;

    /* renamed from: n, reason: collision with root package name */
    public final float f368405n;

    /* renamed from: o, reason: collision with root package name */
    public final int f368406o;

    /* renamed from: p, reason: collision with root package name */
    public final int f368407p;

    /* renamed from: q, reason: collision with root package name */
    public final float f368408q;

    /* renamed from: r, reason: collision with root package name */
    public final float f368409r;

    /* renamed from: s, reason: collision with root package name */
    public final float f368410s;

    /* renamed from: t, reason: collision with root package name */
    public final float f368411t;

    public d2(java.lang.String str, java.util.List list, int i17, e1.r rVar, float f17, e1.r rVar2, float f18, float f19, int i18, int i19, float f27, float f28, float f29, float f37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        this.f368398d = str;
        this.f368399e = list;
        this.f368400f = i17;
        this.f368401g = rVar;
        this.f368402h = f17;
        this.f368403i = rVar2;
        this.f368404m = f18;
        this.f368405n = f19;
        this.f368406o = i18;
        this.f368407p = i19;
        this.f368408q = f27;
        this.f368409r = f28;
        this.f368410s = f29;
        this.f368411t = f37;
    }

    /* renamed from: equals */
    public boolean m134432xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i1.d2.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()))) {
            return false;
        }
        i1.d2 d2Var = (i1.d2) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368398d, d2Var.f368398d) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368401g, d2Var.f368401g)) {
            return false;
        }
        if (!(this.f368402h == d2Var.f368402h) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368403i, d2Var.f368403i)) {
            return false;
        }
        if (!(this.f368404m == d2Var.f368404m)) {
            return false;
        }
        if (!(this.f368405n == d2Var.f368405n)) {
            return false;
        }
        if (!(this.f368406o == d2Var.f368406o)) {
            return false;
        }
        if (!(this.f368407p == d2Var.f368407p)) {
            return false;
        }
        if (!(this.f368408q == d2Var.f368408q)) {
            return false;
        }
        if (!(this.f368409r == d2Var.f368409r)) {
            return false;
        }
        if (!(this.f368410s == d2Var.f368410s)) {
            return false;
        }
        if (this.f368411t == d2Var.f368411t) {
            return (this.f368400f == d2Var.f368400f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368399e, d2Var.f368399e);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m134433x8cdac1b() {
        int hashCode = ((this.f368398d.hashCode() * 31) + this.f368399e.hashCode()) * 31;
        e1.r rVar = this.f368401g;
        int hashCode2 = (((hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f368402h)) * 31;
        e1.r rVar2 = this.f368403i;
        return ((((((((((((((((((hashCode2 + (rVar2 != null ? rVar2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f368404m)) * 31) + java.lang.Float.hashCode(this.f368405n)) * 31) + java.lang.Integer.hashCode(this.f368406o)) * 31) + java.lang.Integer.hashCode(this.f368407p)) * 31) + java.lang.Float.hashCode(this.f368408q)) * 31) + java.lang.Float.hashCode(this.f368409r)) * 31) + java.lang.Float.hashCode(this.f368410s)) * 31) + java.lang.Float.hashCode(this.f368411t)) * 31) + java.lang.Integer.hashCode(this.f368400f);
    }
}
