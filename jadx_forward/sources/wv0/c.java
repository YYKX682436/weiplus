package wv0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f531432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f531433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f531432d = a0Var;
        this.f531433e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        java.util.Iterator it = ((java.util.ArrayList) this.f531432d.f338630g.f338710e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ex0.r) obj2).f338701b, segmentID)) {
                break;
            }
        }
        ex0.r rVar = (ex0.r) obj2;
        if (rVar != null) {
            rv0.n1 n1Var = this.f531433e;
            gx0.bf.q7(n1Var.p7(), rVar.k(), true, 0L, 4, null);
            n1Var.v7(rVar.k());
        }
        return jz5.f0.f384359a;
    }
}
