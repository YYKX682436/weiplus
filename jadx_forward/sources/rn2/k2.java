package rn2;

/* loaded from: classes15.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(rn2.t2 t2Var, int i17) {
        super(1);
        this.f479318d = t2Var;
        this.f479319e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.qp1 innerErrPage = (r45.qp1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerErrPage, "innerErrPage");
        rn2.t2 t2Var = this.f479318d;
        if (t2Var.N == null) {
            android.view.View findViewById = t2Var.f479385d.findViewById(com.p314xaae8f345.mm.R.id.f8d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            t2Var.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se(findViewById, null, null, null, 14, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = t2Var.N;
        if (seVar != null) {
            seVar.c(7, innerErrPage, this.f479319e, new rn2.j2(t2Var));
        }
        return jz5.f0.f384359a;
    }
}
