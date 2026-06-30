package qw3;

/* loaded from: classes9.dex */
public class y0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.m f448759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448760b;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, ow3.m mVar) {
        this.f448760b = activityC17105xa1fb9be7;
        this.f448759a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        ow3.m mVar = this.f448759a;
        r45.or5 or5Var = mVar.f430960s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", or5Var.f463999f, or5Var.f464000g);
        r45.or5 or5Var2 = mVar.f430960s;
        java.lang.String str2 = or5Var2.f464002i;
        java.lang.String str3 = or5Var2.f464003m;
        java.lang.String str4 = or5Var2.f464000g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448760b;
        activityC17105xa1fb9be7.f238046J = str4;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7.a7(activityC17105xa1fb9be7, mVar)) {
            r45.or5 or5Var3 = mVar.f430960s;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7.V6(activityC17105xa1fb9be7, or5Var3.f463999f, or5Var3.f464002i, or5Var3.f464003m, or5Var3.f464001h);
        } else {
            z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17105xa1fb9be7).f39902xe856ec83;
            if (z17) {
                activityC17105xa1fb9be7.mo48627xce38d9a();
            }
        }
    }
}
