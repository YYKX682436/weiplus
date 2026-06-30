package a0;

/* loaded from: classes14.dex */
public final class a extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final e1.y f81584d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.r f81585e;

    /* renamed from: f, reason: collision with root package name */
    public final float f81586f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.a1 f81587g;

    /* renamed from: h, reason: collision with root package name */
    public d1.k f81588h;

    /* renamed from: i, reason: collision with root package name */
    public e1.m0 f81589i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e1.y yVar, e1.r rVar, float f17, e1.a1 a1Var, yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lVar);
        yVar = (i17 & 1) != 0 ? null : yVar;
        rVar = (i17 & 2) != 0 ? null : rVar;
        f17 = (i17 & 4) != 0 ? 1.0f : f17;
        this.f81584d = yVar;
        this.f81585e = rVar;
        this.f81586f = f17;
        this.f81587g = a1Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    @Override // b1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(g1.f r33) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.P(g1.f):void");
    }

    /* renamed from: equals */
    public boolean m143xb2c87fbf(java.lang.Object obj) {
        a0.a aVar = obj instanceof a0.a ? (a0.a) obj : null;
        if (aVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81584d, aVar.f81584d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81585e, aVar.f81585e)) {
            return ((this.f81586f > aVar.f81586f ? 1 : (this.f81586f == aVar.f81586f ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81587g, aVar.f81587g);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144x8cdac1b() {
        e1.y yVar = this.f81584d;
        int hashCode = (yVar != null ? java.lang.Long.hashCode(yVar.f327855a) : 0) * 31;
        e1.r rVar = this.f81585e;
        return ((((hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f81586f)) * 31) + this.f81587g.hashCode();
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
    public java.lang.String m145x9616526c() {
        return "Background(color=" + this.f81584d + ", brush=" + this.f81585e + ", alpha = " + this.f81586f + ", shape=" + this.f81587g + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
