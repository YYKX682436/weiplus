package rv0;

/* loaded from: classes5.dex */
public final class b0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.j f481462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481463f;

    public b0(rv0.n1 n1Var, rv0.j jVar, ex0.a0 a0Var) {
        this.f481461d = n1Var;
        this.f481462e = jVar;
        this.f481463f = a0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.RandomAccess randomAccess;
        ex0.r rVar = (ex0.r) obj;
        rv0.n1 n1Var = this.f481461d;
        ((java.util.ArrayList) n1Var.A).clear();
        if (rVar != null) {
            java.util.List list = n1Var.A;
            ex0.a0 a0Var = this.f481463f;
            a0Var.getClass();
            if (rVar.o()) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 l17 = rVar.l();
                java.util.List list2 = a0Var.f338630g.f338714i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    ex0.j0 j0Var = (ex0.j0) next;
                    if (j0Var.l().m34007xde00a612().m33975x22a7969a(l17.m34009x8082fb99()) || j0Var.k().m33975x22a7969a(l17.m34007xde00a612())) {
                        arrayList.add(next);
                    }
                }
                randomAccess = arrayList;
            } else {
                randomAccess = kz5.p0.f395529d;
            }
            ((java.util.ArrayList) list).addAll(randomAccess);
        }
        this.f481462e.G();
    }
}
