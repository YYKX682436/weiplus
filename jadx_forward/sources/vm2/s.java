package vm2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.v f519646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f519647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rk6 f519648f;

    public s(vm2.v vVar, r45.f62 f62Var, r45.rk6 rk6Var) {
        this.f519646d = vVar;
        this.f519647e = f62Var;
        this.f519648f = rk6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.dd ddVar = df2.od.f312485w;
        vm2.v vVar = this.f519646d;
        gk2.e liveRoomData = vVar.f519653d.getLiveRoomData();
        r45.f62 f62Var = this.f519647e;
        java.lang.String m75945x2fec8307 = f62Var.m75945x2fec8307(0);
        r45.rk6 rk6Var = this.f519648f;
        ddVar.a(liveRoomData, 2, 5, m75945x2fec8307, java.lang.Integer.valueOf(rk6Var.m75939xb282bd08(1)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44) ((jz5.n) vVar.f519654e).mo141623x754a37bb();
        if (c14227x4262fb44 != null) {
            java.lang.String m75945x2fec83072 = f62Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c14227x4262fb44.mo7808x76db6cb1(new jz5.l(rk6Var, m75945x2fec83072));
        }
        df2.od odVar = (df2.od) vVar.f519653d.m56798x25fe639c(df2.od.class);
        if (odVar != null && (rxVar = odVar.f312487n) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(rxVar, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
