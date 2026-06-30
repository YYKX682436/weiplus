package vm2;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.v f519642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f519643e;

    public q(vm2.v vVar, r45.f62 f62Var) {
        this.f519642d = vVar;
        this.f519643e = f62Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.dd ddVar = df2.od.f312485w;
        vm2.v vVar = this.f519642d;
        gk2.e liveRoomData = vVar.f519653d.getLiveRoomData();
        r45.f62 f62Var = this.f519643e;
        ddVar.a(liveRoomData, 2, 8, (r13 & 8) != 0 ? null : f62Var.m75945x2fec8307(0), (r13 & 16) != 0 ? null : null);
        ddVar.c(vVar.f519653d.getLiveRoomData(), ml2.t1.Q2, f62Var.m75945x2fec8307(0));
        df2.od odVar = (df2.od) vVar.f519653d.m56798x25fe639c(df2.od.class);
        if (odVar != null) {
            df2.od.d7(odVar, null, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
