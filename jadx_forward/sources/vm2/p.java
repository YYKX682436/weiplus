package vm2;

/* loaded from: classes3.dex */
public final class p extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm2.v f519639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f519640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vm2.o f519641c;

    public p(vm2.v vVar, r45.f62 f62Var, vm2.o oVar) {
        this.f519639a = vVar;
        this.f519640b = f62Var;
        this.f519641c = oVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            vm2.v vVar = this.f519639a;
            if (vVar.f519655f) {
                return;
            }
            df2.dd ddVar = df2.od.f312485w;
            gk2.e liveRoomData = vVar.f519653d.getLiveRoomData();
            r45.f62 f62Var = this.f519640b;
            ddVar.a(liveRoomData, 1, 3, (r13 & 8) != 0 ? null : f62Var.m75945x2fec8307(0), (r13 & 16) != 0 ? null : null);
            if (this.f519641c.f519634d.isShown()) {
                return;
            }
            ddVar.d(vVar.f519653d.getLiveRoomData(), ml2.u1.M2, f62Var.m75945x2fec8307(0));
        }
    }
}
