package am2;

/* loaded from: classes3.dex */
public final class f3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f90202d;

    public f3(am2.g3 g3Var) {
        this.f90202d = g3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "新背包礼物");
            am2.g3 g3Var = this.f90202d;
            ((db5.h4) f17).f309915z = new am2.y2(g3Var);
            ((db5.h4) g4Var.f(2, "背包礼物快失效")).f309915z = new am2.z2(g3Var);
            ((db5.h4) g4Var.f(3, "一键送礼气泡")).f309915z = new am2.a3(g3Var);
            r45.xn1 xn1Var = new r45.xn1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76227x7ac946f0("测试");
            xn1Var.set(0, c19782x23db1cfa);
            ((db5.h4) g4Var.f(4, "赞直播消息")).f309915z = new am2.b3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(5, "关注直播消息")).f309915z = new am2.c3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(6, "分享直播消息")).f309915z = new am2.d3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(7, "预约直播消息")).f309915z = new am2.e3(g3Var, xn1Var);
        }
    }
}
