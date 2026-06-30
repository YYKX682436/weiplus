package r06;

/* loaded from: classes16.dex */
public class b0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.d0 f449905d;

    public b0(r06.d0 d0Var, r06.e0 e0Var) {
        this.f449905d = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r06.d0 d0Var = this.f449905d;
        d0Var.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (n16.g gVar : (java.util.Set) d0Var.f449914e.f449929p.mo152xb9724478()) {
            w06.d dVar = w06.d.f523484i;
            hashSet.addAll(d0Var.b(gVar, dVar));
            hashSet.addAll(d0Var.c(gVar, dVar));
        }
        return hashSet;
    }
}
