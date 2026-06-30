package qw3;

/* loaded from: classes9.dex */
public class n implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.i f448712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448713b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.i iVar) {
        this.f448713b = activityC17101x8420a569;
        this.f448712a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ow3.i iVar = this.f448712a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitBankcardInputUI", "operation response error: %s, %s", java.lang.Integer.valueOf(iVar.f430949s.f455476d), iVar.f430949s.f455477e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f430949s.f455477e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448713b;
        if (!K0) {
            db5.e1.G(activityC17101x8420a569.mo55332x76847179(), iVar.f430949s.f455477e, null, false, new qw3.m(this));
        }
        activityC17101x8420a569.finish();
    }
}
