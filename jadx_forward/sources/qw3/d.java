package qw3;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.a f448680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448681b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.a aVar) {
        this.f448681b = activityC17101x8420a569;
        this.f448680a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ow3.a aVar = this.f448680a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitBankcardInputUI", "appoint reponse error: %s, msg: %s", java.lang.Integer.valueOf(aVar.f430923s.f467124d), aVar.f430923s.f467125e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f430923s.f467125e)) {
            return;
        }
        db5.e1.G(this.f448681b.mo55332x76847179(), aVar.f430923s.f467125e, null, false, new qw3.c(this));
    }
}
