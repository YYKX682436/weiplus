package a0;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public e1.g0 f83a;

    /* renamed from: b, reason: collision with root package name */
    public e1.u f84b;

    /* renamed from: c, reason: collision with root package name */
    public g1.c f85c;

    /* renamed from: d, reason: collision with root package name */
    public e1.p0 f86d;

    public c(e1.g0 g0Var, e1.u uVar, g1.c cVar, e1.p0 p0Var, int i17, kotlin.jvm.internal.i iVar) {
        g0Var = (i17 & 1) != 0 ? null : g0Var;
        uVar = (i17 & 2) != 0 ? null : uVar;
        cVar = (i17 & 4) != 0 ? null : cVar;
        p0Var = (i17 & 8) != 0 ? null : p0Var;
        this.f83a = g0Var;
        this.f84b = uVar;
        this.f85c = cVar;
        this.f86d = p0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return kotlin.jvm.internal.o.b(this.f83a, cVar.f83a) && kotlin.jvm.internal.o.b(this.f84b, cVar.f84b) && kotlin.jvm.internal.o.b(this.f85c, cVar.f85c) && kotlin.jvm.internal.o.b(this.f86d, cVar.f86d);
    }

    public int hashCode() {
        e1.g0 g0Var = this.f83a;
        int hashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        e1.u uVar = this.f84b;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        g1.c cVar = this.f85c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e1.p0 p0Var = this.f86d;
        return hashCode3 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.f83a + ", canvas=" + this.f84b + ", canvasDrawScope=" + this.f85c + ", borderPath=" + this.f86d + ')';
    }
}
