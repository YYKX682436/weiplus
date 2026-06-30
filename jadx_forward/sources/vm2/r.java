package vm2;

/* loaded from: classes3.dex */
public final class r extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm2.v f519644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f519645b;

    public r(vm2.v vVar, r45.f62 f62Var) {
        this.f519644a = vVar;
        this.f519645b = f62Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            vm2.v vVar = this.f519644a;
            if (vVar.f519655f) {
                return;
            }
            df2.dd ddVar = df2.od.f312485w;
            gk2.e liveRoomData = vVar.f519653d.getLiveRoomData();
            ml2.u1 u1Var = ml2.u1.N2;
            r45.f62 f62Var = this.f519645b;
            ddVar.d(liveRoomData, u1Var, f62Var.m75945x2fec8307(0));
            ddVar.a(vVar.f519653d.getLiveRoomData(), 1, 8, (r13 & 8) != 0 ? null : f62Var.m75945x2fec8307(0), (r13 & 16) != 0 ? null : null);
        }
    }
}
