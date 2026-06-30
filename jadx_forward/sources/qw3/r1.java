package qw3;

/* loaded from: classes9.dex */
public class r1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.h f448731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 f448732b;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377, ow3.h hVar) {
        this.f448732b = activityC17109x265f5377;
        this.f448731a = hVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "modify success");
        ow3.h hVar = this.f448731a;
        java.lang.String str2 = hVar.f430946u;
        java.lang.String str3 = hVar.f430947v;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377.f238071q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448732b;
        activityC17109x265f5377.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do modify record");
        if (activityC17109x265f5377.f238076i == null) {
            activityC17109x265f5377.f238076i = new java.util.ArrayList();
        }
        int size = ((java.util.ArrayList) activityC17109x265f5377.f238075h).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(size);
            if (c17100xa183cf65.f238003d.equals(str2)) {
                c17100xa183cf65.f238009m = str3;
                activityC17109x265f5377.f238076i.add(c17100xa183cf65);
                break;
            }
        }
        activityC17109x265f5377.f238074g.notifyDataSetChanged();
        activityC17109x265f5377.f238080p.putParcelableArrayListExtra("key_modified_record_list", activityC17109x265f5377.f238076i);
        activityC17109x265f5377.setResult(0, activityC17109x265f5377.f238080p);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14673, 5);
    }
}
