package a0;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public e1.g0 f81616a;

    /* renamed from: b, reason: collision with root package name */
    public e1.u f81617b;

    /* renamed from: c, reason: collision with root package name */
    public g1.c f81618c;

    /* renamed from: d, reason: collision with root package name */
    public e1.p0 f81619d;

    public c(e1.g0 g0Var, e1.u uVar, g1.c cVar, e1.p0 p0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        g0Var = (i17 & 1) != 0 ? null : g0Var;
        uVar = (i17 & 2) != 0 ? null : uVar;
        cVar = (i17 & 4) != 0 ? null : cVar;
        p0Var = (i17 & 8) != 0 ? null : p0Var;
        this.f81616a = g0Var;
        this.f81617b = uVar;
        this.f81618c = cVar;
        this.f81619d = p0Var;
    }

    /* renamed from: equals */
    public boolean m153xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81616a, cVar.f81616a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81617b, cVar.f81617b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81618c, cVar.f81618c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81619d, cVar.f81619d);
    }

    /* renamed from: hashCode */
    public int m154x8cdac1b() {
        e1.g0 g0Var = this.f81616a;
        int hashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        e1.u uVar = this.f81617b;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        g1.c cVar = this.f81618c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e1.p0 p0Var = this.f81619d;
        return hashCode3 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m155x9616526c() {
        return "BorderCache(imageBitmap=" + this.f81616a + ", canvas=" + this.f81617b + ", canvasDrawScope=" + this.f81618c + ", borderPath=" + this.f81619d + ')';
    }
}
