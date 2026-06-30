package pr4;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.g f439528a;

    /* renamed from: b, reason: collision with root package name */
    public final pr4.o f439529b;

    public f(pr4.g status, pr4.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f439528a = status;
        this.f439529b = oVar;
    }

    /* renamed from: equals */
    public boolean m158899xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr4.f)) {
            return false;
        }
        pr4.f fVar = (pr4.f) obj;
        return this.f439528a == fVar.f439528a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439529b, fVar.f439529b);
    }

    /* renamed from: hashCode */
    public int m158900x8cdac1b() {
        int hashCode = this.f439528a.hashCode() * 31;
        pr4.o oVar = this.f439529b;
        return hashCode + (oVar == null ? 0 : oVar.m158921x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m158901x9616526c() {
        return "WCCoinSubscribeMemberResult(status=" + this.f439528a + ", data=" + this.f439529b + ')';
    }
}
