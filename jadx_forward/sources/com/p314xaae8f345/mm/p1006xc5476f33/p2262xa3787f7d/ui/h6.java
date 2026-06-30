package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o01.a f254557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(o01.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b) {
        super(0);
        this.f254557d = aVar;
        this.f254558e = activityC18590xc3d8bf2b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
        r45.fy6 fy6Var = (r45.fy6) this.f254557d.f440822f;
        if (fy6Var == null || (str = fy6Var.f456272d) == null) {
            str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h;
        }
        t1Var.f518671h = str;
        ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254558e;
        activityC18590xc3d8bf2b.setResult(-1);
        activityC18590xc3d8bf2b.W6(-1);
        if (activityC18590xc3d8bf2b.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
            uh4.g0 g0Var = new uh4.g0();
            g0Var.f77356xe412923f = activityC18590xc3d8bf2b.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
            g0Var.f77355xb4c6a6ba = activityC18590xc3d8bf2b.getIntent().getStringExtra("intent_extra_biz_key");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
            g0Var.f77357x8d828e4c = df6 != null ? df6.d1() : null;
            g0Var.f77360xb1cc66b7 = c01.z1.r();
            g0Var.f77359x2261f6f2 = c01.id.c();
            wh4.j.f527545a.a().mo11260x413cb2b4(g0Var);
            ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        }
        return jz5.f0.f384359a;
    }
}
