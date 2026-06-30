package qw3;

/* loaded from: classes2.dex */
public class q0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.j f448725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e f448726b;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e activityC17104xbfbb140e, ow3.j jVar) {
        this.f448726b = activityC17104xbfbb140e;
        this.f448725a = jVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ow3.j jVar = this.f448725a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", java.lang.Integer.valueOf(jVar.f430952s.f457694d), jVar.f430952s.f457695e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f430952s.f457695e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e activityC17104xbfbb140e = this.f448726b;
        if (K0) {
            dp.a.m125853x26a183b(activityC17104xbfbb140e, com.p314xaae8f345.mm.R.C30867xcad56011.adu, 1).show();
        } else {
            dp.a.m125854x26a183b(activityC17104xbfbb140e, jVar.f430952s.f457695e, 1).show();
        }
    }
}
