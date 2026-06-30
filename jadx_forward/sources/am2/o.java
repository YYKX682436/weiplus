package am2;

/* loaded from: classes3.dex */
public final class o implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.p f90254d;

    public o(am2.p pVar) {
        this.f90254d = pVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            ((db5.h4) g4Var.f(1, "假众筹卡片（看ui用）")).f309915z = am2.j.f90231d;
            android.view.MenuItem f17 = g4Var.f(2, "假插众筹完成消息");
            am2.p pVar = this.f90254d;
            ((db5.h4) f17).f309915z = new am2.k(pVar);
            ((db5.h4) g4Var.f(3, "假插众筹开始评论区消息")).f309915z = new am2.l(pVar);
            ((db5.h4) g4Var.f(4, "假插众筹未送满评论区消息")).f309915z = new am2.m(pVar);
            ((db5.h4) g4Var.f(5, "假插众筹已送满评论区消息")).f309915z = new am2.n(pVar);
        }
    }
}
