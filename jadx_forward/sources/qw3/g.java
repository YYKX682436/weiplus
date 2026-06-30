package qw3;

/* loaded from: classes9.dex */
public class g implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.k f448690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448691b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.k kVar) {
        this.f448691b = activityC17101x8420a569;
        this.f448690a = kVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ow3.k kVar = this.f448690a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", java.lang.Integer.valueOf(kVar.f430955s.f465534d), kVar.f430955s.f465535e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f430955s.f465535e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448691b;
        if (!K0) {
            db5.e1.G(activityC17101x8420a569.mo55332x76847179(), kVar.f430955s.f465535e, null, false, new qw3.f(this));
        }
        activityC17101x8420a569.L = true;
    }
}
