package qw3;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.k f448694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448695b;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.k kVar) {
        this.f448695b = activityC17101x8420a569;
        this.f448694a = kVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448695b;
        activityC17101x8420a569.L = false;
        ow3.k kVar = this.f448694a;
        r45.qh5 qh5Var = kVar.f430955s;
        activityC17101x8420a569.f238028y = qh5Var.f465538h;
        activityC17101x8420a569.f238022s = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65.a(qh5Var.f465537g);
        activityC17101x8420a569.f238023t = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65.a(kVar.f430955s.f465536f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "selfList: %d, freqList: %d", java.lang.Integer.valueOf(activityC17101x8420a569.f238022s.size()), java.lang.Integer.valueOf(activityC17101x8420a569.f238023t.size()));
        activityC17101x8420a569.f238019p = (android.widget.ListView) activityC17101x8420a569.findViewById(com.p314xaae8f345.mm.R.id.k3p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = activityC17101x8420a569.f238022s;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        java.util.ArrayList arrayList3 = activityC17101x8420a569.f238023t;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        activityC17101x8420a569.f238019p.setOnItemClickListener(new qw3.s(activityC17101x8420a569));
        activityC17101x8420a569.f238021r = new qw3.t(activityC17101x8420a569);
        pw3.h hVar = new pw3.h(activityC17101x8420a569, arrayList);
        activityC17101x8420a569.f238020q = hVar;
        activityC17101x8420a569.f238019p.setAdapter((android.widget.ListAdapter) hVar);
    }
}
