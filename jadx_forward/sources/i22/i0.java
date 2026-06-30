package i22;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f369515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i22.n0 f369516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i22.j0 f369517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, i22.n0 n0Var, i22.j0 j0Var) {
        super(1);
        this.f369515d = h0Var;
        this.f369516e = n0Var;
        this.f369517f = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Object obj2 = this.f369515d.f391656d;
        i22.j0 j0Var = this.f369517f;
        i22.n0 n0Var = this.f369516e;
        java.util.List list = (java.util.List) obj2;
        if ((!list.isEmpty()) && j0Var.f369525o.f369500e.size() > intValue) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list.subList(0, intValue));
            java.lang.String str = j0Var.f369521h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setId:");
            r45.kj0 kj0Var = ((i22.a1) n0Var).f369459b;
            sb6.append(kj0Var != null ? java.lang.Integer.valueOf(kj0Var.f460262g) : null);
            sb6.append(", spanCount changed, new spanCount:");
            sb6.append(intValue);
            sb6.append(", adapter try change data");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            ((ku5.t0) ku5.t0.f394148d).B(new i22.h0(j0Var, arrayList));
        }
        ((i22.a1) this.f369516e).f369460c = intValue;
        return jz5.f0.f384359a;
    }
}
