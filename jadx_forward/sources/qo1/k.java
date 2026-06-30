package qo1;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qo1.f0 f0Var) {
        super(1);
        this.f447059d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qo1.i0 a17;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] Do task complete, ret=" + intValue + ", packageId=" + this.f447059d.f447016i + ", isResume=" + this.f447059d.f447023p);
        if (intValue != 0) {
            qo1.h0 h0Var = qo1.i0.f447034e;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z a18 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z.a(intValue);
            if (a18 == null) {
                h0Var.getClass();
                a17 = qo1.i0.f447045s;
            } else {
                a17 = h0Var.a(a18);
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            qo1.f0 f0Var = this.f447059d;
            ((ku5.t0) u0Var).h(new qo1.j(f0Var, a17), f0Var.n());
        }
        return jz5.f0.f384359a;
    }
}
