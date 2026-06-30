package a2;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final l2.f f82326a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.h f82327b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82328c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.n f82329d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.s f82330e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.d f82331f;

    public p(l2.f fVar, l2.h hVar, long j17, l2.n nVar, a2.s sVar, l2.d dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f82326a = fVar;
        this.f82327b = hVar;
        this.f82328c = j17;
        this.f82329d = nVar;
        this.f82330e = sVar;
        this.f82331f = dVar;
        if (p2.t.a(j17, p2.t.f432934c)) {
            return;
        }
        if (p2.t.c(j17) >= 0.0f) {
            return;
        }
        throw new java.lang.IllegalStateException(("lineHeight can't be negative (" + p2.t.c(j17) + ')').toString());
    }

    public final a2.p a(a2.p pVar) {
        if (pVar == null) {
            return this;
        }
        long j17 = pVar.f82328c;
        if (p2.u.c(j17)) {
            j17 = this.f82328c;
        }
        long j18 = j17;
        l2.n nVar = pVar.f82329d;
        if (nVar == null) {
            nVar = this.f82329d;
        }
        l2.n nVar2 = nVar;
        l2.f fVar = pVar.f82326a;
        if (fVar == null) {
            fVar = this.f82326a;
        }
        l2.f fVar2 = fVar;
        l2.h hVar = pVar.f82327b;
        if (hVar == null) {
            hVar = this.f82327b;
        }
        l2.h hVar2 = hVar;
        a2.s sVar = pVar.f82330e;
        a2.s sVar2 = this.f82330e;
        a2.s sVar3 = (sVar2 != null && sVar == null) ? sVar2 : sVar;
        l2.d dVar = pVar.f82331f;
        if (dVar == null) {
            dVar = this.f82331f;
        }
        return new a2.p(fVar2, hVar2, j18, nVar2, sVar3, dVar, null);
    }

    /* renamed from: equals */
    public boolean m386xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.p)) {
            return false;
        }
        a2.p pVar = (a2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82326a, pVar.f82326a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82327b, pVar.f82327b) && p2.t.a(this.f82328c, pVar.f82328c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82329d, pVar.f82329d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82330e, pVar.f82330e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82331f, pVar.f82331f);
    }

    /* renamed from: hashCode */
    public int m387x8cdac1b() {
        l2.f fVar = this.f82326a;
        int hashCode = (fVar != null ? java.lang.Integer.hashCode(fVar.f396649a) : 0) * 31;
        l2.h hVar = this.f82327b;
        int hashCode2 = (hashCode + (hVar != null ? java.lang.Integer.hashCode(hVar.f396654a) : 0)) * 31;
        p2.v[] vVarArr = p2.t.f432933b;
        int hashCode3 = (hashCode2 + java.lang.Long.hashCode(this.f82328c)) * 31;
        l2.n nVar = this.f82329d;
        int m144921x8cdac1b = (hashCode3 + (nVar != null ? nVar.m144921x8cdac1b() : 0)) * 31;
        a2.s sVar = this.f82330e;
        int m401x8cdac1b = (m144921x8cdac1b + (sVar != null ? sVar.m401x8cdac1b() : 0)) * 31;
        l2.d dVar = this.f82331f;
        return m401x8cdac1b + (dVar != null ? dVar.m144899x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m388x9616526c() {
        return "ParagraphStyle(textAlign=" + this.f82326a + ", textDirection=" + this.f82327b + ", lineHeight=" + ((java.lang.Object) p2.t.d(this.f82328c)) + ", textIndent=" + this.f82329d + ", platformStyle=" + this.f82330e + ", lineHeightStyle=" + this.f82331f + ')';
    }
}
