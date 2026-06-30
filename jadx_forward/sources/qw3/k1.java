package qw3;

/* loaded from: classes9.dex */
public class k1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.g f448705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17108xc009cad5 f448706b;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17108xc009cad5 activityC17108xc009cad5, ow3.g gVar) {
        this.f448706b = activityC17108xc009cad5;
        this.f448705a = gVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.pa3 pa3Var = this.f448705a.f430941s;
        java.util.LinkedList<r45.qd> linkedList = pa3Var.f464445g;
        java.util.LinkedList<r45.qd> linkedList2 = pa3Var.f464444f;
        pw3.b bVar = new pw3.b();
        if (linkedList != null && !linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectBankUI", "freq card count: %s", java.lang.Integer.valueOf(linkedList2.size()));
            for (r45.qd qdVar : linkedList) {
                fb5.n nVar = new fb5.n();
                nVar.f342430a = "☆";
                nVar.f342431b = qdVar;
                arrayList.add(nVar);
            }
        }
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectBankUI", "card count: %s", java.lang.Integer.valueOf(linkedList2.size()));
            java.util.Collections.sort(linkedList2, bVar);
            for (r45.qd qdVar2 : linkedList2) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qdVar2.f465372e)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qdVar2.f465380p)) {
                        str2 = "" + pw3.a.b(qdVar2.f465372e, '#', true);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectBankUI", "use sort pingyin: %s", qdVar2.f465380p);
                        str2 = "" + qdVar2.f465380p.toUpperCase().charAt(0);
                    }
                    fb5.n nVar2 = new fb5.n();
                    nVar2.f342430a = str2;
                    nVar2.f342431b = qdVar2;
                    arrayList.add(nVar2);
                }
            }
        }
        this.f448706b.f238070e.e(arrayList);
    }
}
