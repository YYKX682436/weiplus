package am2;

/* loaded from: classes3.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.h f90203d;

    public g(am2.h hVar) {
        this.f90203d = hVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "礼物条通知");
            am2.h hVar = this.f90203d;
            ((db5.h4) f17).f309915z = new am2.e(hVar);
            ((db5.h4) g4Var.f(2, "banner通知")).f309915z = new am2.f(hVar);
        }
    }
}
