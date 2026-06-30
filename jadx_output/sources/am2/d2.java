package am2;

/* loaded from: classes3.dex */
public final class d2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.e2 f8652d;

    public d2(am2.e2 e2Var) {
        this.f8652d = e2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "太好听了*1");
            am2.e2 e2Var = this.f8652d;
            ((db5.h4) f17).f228382z = new am2.t1(e2Var);
            ((db5.h4) g4Var.f(2, "太好听了太好听了太好听了*1")).f228382z = new am2.u1(e2Var);
            ((db5.h4) g4Var.f(3, "太好听了*3")).f228382z = new am2.v1(e2Var);
            ((db5.h4) g4Var.f(4, "太好听了(5->8)")).f228382z = new am2.w1(e2Var);
            ((db5.h4) g4Var.f(5, "太好听了(85->94)")).f228382z = new am2.x1(e2Var);
            ((db5.h4) g4Var.f(6, "太好听了(60->69)")).f228382z = new am2.y1(e2Var);
            ((db5.h4) g4Var.f(7, "太好听了(100->130)")).f228382z = new am2.z1(e2Var);
            ((db5.h4) g4Var.f(8, "太好听了(0->100)")).f228382z = new am2.a2(e2Var);
            ((db5.h4) g4Var.f(9, "太好听了(0->100->130)")).f228382z = new am2.c2(e2Var);
        }
    }
}
