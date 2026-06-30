package qw3;

/* loaded from: classes4.dex */
public class k implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.d f448703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448704b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.d dVar) {
        this.f448704b = activityC17101x8420a569;
        this.f448703a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ow3.d dVar = this.f448703a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitBankcardInputUI", "check response error: %s, %s", java.lang.Integer.valueOf(dVar.f430930s.f467557d), dVar.f430930s.f467558e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f430930s.f467558e)) {
            return;
        }
        db5.e1.G(this.f448704b.mo55332x76847179(), dVar.f430930s.f467558e, null, false, new qw3.j(this));
    }
}
