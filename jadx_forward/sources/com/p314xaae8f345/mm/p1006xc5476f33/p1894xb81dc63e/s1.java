package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class s1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.r1 f232035d = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.r1(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s1 f232036e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0
    public void a() {
        tk3.t a17 = tk3.t.f501480o.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "initMultiTaskFloatBall: " + ((km0.c) gm0.j1.p().a()).f390520a);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di()) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multi_task_ui_storage").q("multi_task_float_ball_create_time", 0L);
                if (currentTimeMillis < a17.o()) {
                    d75.b.g(new tk3.s(a17, a17.o() - currentTimeMillis));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0
    public float c() {
        java.lang.Float f17;
        tk3.t a17 = tk3.t.f501480o.a();
        if (!a17.p() || (f17 = (java.lang.Float) a17.f501489n.get(a17.f501488m)) == null) {
            return 0.0f;
        }
        return f17.floatValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0
    public void e(int i17) {
        tk3.t.f501480o.a().f501487i = i17;
    }

    @Override // kk3.c
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        tk3.t.f501480o.a().f(c16601x7ed0e40c, aVar);
    }

    @Override // jk3.f
    public void g(boolean z17, boolean z18) {
        tk3.t.f501480o.a().g(z17, z18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0
    public void i(java.lang.Boolean bool, java.lang.Boolean bool2) {
        tk3.t.f501480o.a().g(bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0
    public void j(java.lang.Boolean bool, java.lang.Boolean bool2) {
        tk3.t a17 = tk3.t.f501480o.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "hideFloatBall isFloatBallContainerExisted: %s", java.lang.Boolean.valueOf(a17.p()));
        d75.b.g(new tk3.n(a17, valueOf, valueOf2));
    }
}
