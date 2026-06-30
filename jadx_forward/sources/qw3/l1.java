package qw3;

/* loaded from: classes9.dex */
public class l1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.e f448709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 f448710b;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377, ow3.e eVar) {
        this.f448710b = activityC17109x265f5377;
        this.f448709a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f448709a.f430935u;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377.f238071q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448710b;
        activityC17109x265f5377.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do remove record");
        int size = ((java.util.ArrayList) activityC17109x265f5377.f238075h).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(size)).f238003d.equals(str2)) {
                ((java.util.ArrayList) activityC17109x265f5377.f238075h).remove(size);
                break;
            }
        }
        activityC17109x265f5377.f238074g.notifyDataSetChanged();
        if (activityC17109x265f5377.f238077m == null) {
            activityC17109x265f5377.f238077m = new java.util.ArrayList();
        }
        activityC17109x265f5377.f238077m.add(str2);
        activityC17109x265f5377.f238080p.putStringArrayListExtra("key_delete_seq_no_list", activityC17109x265f5377.f238077m);
        activityC17109x265f5377.setResult(0, activityC17109x265f5377.f238080p);
    }
}
