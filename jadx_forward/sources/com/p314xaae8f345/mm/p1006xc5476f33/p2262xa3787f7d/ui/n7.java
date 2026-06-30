package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b f254617d;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b) {
        this.f254617d = activityC18591xe20dd59b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b = this.f254617d;
        activityC18591xe20dd59b.mo48674x36654fab();
        xh4.x.f536176a.b(activityC18591xe20dd59b.mo55332x76847179(), new yz5.a() { // from class: com.tencent.mm.plugin.teenmode.ui.n7$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b2 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n7.this.f254617d;
                activityC18591xe20dd59b2.setResult(-1);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.f254444p;
                activityC18591xe20dd59b2.W6(1);
                if (activityC18591xe20dd59b2.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
                    uh4.g0 g0Var = new uh4.g0();
                    g0Var.f77356xe412923f = activityC18591xe20dd59b2.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
                    g0Var.f77355xb4c6a6ba = activityC18591xe20dd59b2.getIntent().getStringExtra("intent_extra_biz_key");
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
                    if (df6 != null) {
                        g0Var.f77357x8d828e4c = df6.d1();
                    }
                    g0Var.f77360xb1cc66b7 = c01.z1.r();
                    g0Var.f77359x2261f6f2 = c01.id.c();
                    wh4.j.f527545a.a().mo11260x413cb2b4(g0Var);
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
                }
                return jz5.f0.f384359a;
            }
        }, null);
    }
}
