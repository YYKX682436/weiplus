package r06;

/* loaded from: classes16.dex */
public class g0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.v2 f449954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r06.j0 f449955e;

    public g0(r06.j0 j0Var, f26.v2 v2Var) {
        this.f449955e = j0Var;
        this.f449954d = v2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o26.q qVar = new o26.q();
        java.util.Iterator it = this.f449955e.i().iterator();
        while (it.hasNext()) {
            qVar.add(((o06.n0) it.next()).d(this.f449954d));
        }
        return qVar;
    }
}
