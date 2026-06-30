package a2;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final l2.f f793a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.h f794b;

    /* renamed from: c, reason: collision with root package name */
    public final long f795c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.n f796d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.s f797e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.d f798f;

    public p(l2.f fVar, l2.h hVar, long j17, l2.n nVar, a2.s sVar, l2.d dVar, kotlin.jvm.internal.i iVar) {
        this.f793a = fVar;
        this.f794b = hVar;
        this.f795c = j17;
        this.f796d = nVar;
        this.f797e = sVar;
        this.f798f = dVar;
        if (p2.t.a(j17, p2.t.f351401c)) {
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
        long j17 = pVar.f795c;
        if (p2.u.c(j17)) {
            j17 = this.f795c;
        }
        long j18 = j17;
        l2.n nVar = pVar.f796d;
        if (nVar == null) {
            nVar = this.f796d;
        }
        l2.n nVar2 = nVar;
        l2.f fVar = pVar.f793a;
        if (fVar == null) {
            fVar = this.f793a;
        }
        l2.f fVar2 = fVar;
        l2.h hVar = pVar.f794b;
        if (hVar == null) {
            hVar = this.f794b;
        }
        l2.h hVar2 = hVar;
        a2.s sVar = pVar.f797e;
        a2.s sVar2 = this.f797e;
        a2.s sVar3 = (sVar2 != null && sVar == null) ? sVar2 : sVar;
        l2.d dVar = pVar.f798f;
        if (dVar == null) {
            dVar = this.f798f;
        }
        return new a2.p(fVar2, hVar2, j18, nVar2, sVar3, dVar, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.p)) {
            return false;
        }
        a2.p pVar = (a2.p) obj;
        return kotlin.jvm.internal.o.b(this.f793a, pVar.f793a) && kotlin.jvm.internal.o.b(this.f794b, pVar.f794b) && p2.t.a(this.f795c, pVar.f795c) && kotlin.jvm.internal.o.b(this.f796d, pVar.f796d) && kotlin.jvm.internal.o.b(this.f797e, pVar.f797e) && kotlin.jvm.internal.o.b(this.f798f, pVar.f798f);
    }

    public int hashCode() {
        l2.f fVar = this.f793a;
        int hashCode = (fVar != null ? java.lang.Integer.hashCode(fVar.f315116a) : 0) * 31;
        l2.h hVar = this.f794b;
        int hashCode2 = (hashCode + (hVar != null ? java.lang.Integer.hashCode(hVar.f315121a) : 0)) * 31;
        p2.v[] vVarArr = p2.t.f351400b;
        int hashCode3 = (hashCode2 + java.lang.Long.hashCode(this.f795c)) * 31;
        l2.n nVar = this.f796d;
        int hashCode4 = (hashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        a2.s sVar = this.f797e;
        int hashCode5 = (hashCode4 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        l2.d dVar = this.f798f;
        return hashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + this.f793a + ", textDirection=" + this.f794b + ", lineHeight=" + ((java.lang.Object) p2.t.d(this.f795c)) + ", textIndent=" + this.f796d + ", platformStyle=" + this.f797e + ", lineHeightStyle=" + this.f798f + ')';
    }
}
