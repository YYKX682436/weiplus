package am2;

/* loaded from: classes3.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f90285d;

    public u(am2.v vVar) {
        this.f90285d = vVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "首次成为最大助力半屏");
            am2.v vVar = this.f90285d;
            ((db5.h4) f17).f309915z = new am2.q(vVar);
            ((db5.h4) g4Var.f(2, "最强助力")).f309915z = new am2.r(vVar);
            ((db5.h4) g4Var.f(3, "点亮礼物")).f309915z = new am2.s(vVar);
            ((db5.h4) g4Var.f(4, "点亮整个礼物墙")).f309915z = new am2.t(vVar);
        }
    }
}
