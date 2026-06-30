package kl2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.q f390335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kl2.q qVar) {
        super(1);
        this.f390335d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kl2.q qVar = this.f390335d;
        jl2.a aVar = qVar.f390337h;
        if (booleanValue) {
            il2.s.f373619a.b(zl2.e5.f555283t, qVar.f390340n);
            zl2.j5.f555383a.e(qVar.f390340n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeLicensePanel", "updateQuotaToastConfig reachAmountQuota: " + qVar.f390340n);
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.u5.f410997a);
        } else {
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.r5.f410913a);
        }
        if (booleanValue) {
            qVar.a();
        }
        return jz5.f0.f384359a;
    }
}
