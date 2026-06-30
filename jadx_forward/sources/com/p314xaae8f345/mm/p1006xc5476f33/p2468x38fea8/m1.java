package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

@j95.b
/* loaded from: classes12.dex */
public class m1 extends i95.w implements a25.v {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f270192g = {6, 6, 0, 1, 2, 3, 4, 5};

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a f270193d = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.k1 f270194e = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.k1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.j1 f270195f = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.j1();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4().e();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        boolean z17;
        im0.a.a("configure [%s], setup broken library handler...", this);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.m96101x16e44c92(new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.f1(this));
        jm5.b.f381989a = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.g1(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            im0.a.a("configure [%s], for process[%s]...", this, bm5.f1.a());
            lm0.f fVar = new lm0.f(this.f270193d);
            gm0.j1.i();
            gm0.j1.o().f354827a.a(c25.e.class, fVar);
            im0.a.a("configure [%s], make worker core...", this);
            gm0.j1 i17 = gm0.j1.i();
            if (!i17.f354751k) {
                i17.f354744d = new gm0.b0();
                i17.f354745e = new gm0.m(im0.g.f373700g);
                i17.f354746f = new gm0.y(i17.f354748h, i17.f354749i);
                i17.f354751k = true;
            }
            synchronized (wo.w0.f529393v) {
                z17 = wo.w0.f529395x;
            }
            if (z17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreAccount", "[!] makeLastLoginInvalid called since %s, stack: %s", "migrated to a new device", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                gm0.l.b(gm0.m.f354766v, 0);
            }
            com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.c();
            gm0.j1 i18 = gm0.j1.i();
            com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.d1(this);
            gm0.z1 z1Var = i18.f354741a;
            z1Var.a(z1Var.f354835g, d1Var);
            gm0.j1.i();
            lm5.j jVar = new lm5.j(new pq5.e(gm0.j1.e().d()), "WeChat.WORKER");
            pq5.j.f439221a = jVar;
            lm5.i.c("WeChat.WORKER", jVar);
        }
        if (bm5.f1.a().endsWith(":push")) {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37514xb66baf25();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureZeroService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
            com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c c4440xec1b926c = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
            com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.class, c4440xec1b926c);
            c4440xec1b926c.m37605x6c4ebec7(new com.p314xaae8f345.p542x3306d5.mm.C4562x2edeead1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureZeroService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
            com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a c4579xc595060a = new com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
            com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a.class, c4579xc595060a);
            c4579xc595060a.m40320x6c4ebec7(new com.p314xaae8f345.p542x3306d5.sdt.C4580xbf71e06f());
            com.p314xaae8f345.p542x3306d5.sdt.C4577xdecd87aa c4577xdecd87aa = new com.p314xaae8f345.p542x3306d5.sdt.C4577xdecd87aa(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
            com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.sdt.C4577xdecd87aa.class, c4577xdecd87aa);
            c4577xdecd87aa.m40311x6c4ebec7(new com.p314xaae8f345.p542x3306d5.sdt.C4578x475ec20f());
            ((com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a.class)).m40321xb311a8b0("/mmnetcheck");
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84216xda9a11d()) {
                com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84227xb66baf25();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureZeroService", "paymars start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
                com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c c23008xec1b926c = new com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179());
                com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84274xa38667cc(com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.class, c23008xec1b926c);
                c23008xec1b926c.m84257x6c4ebec7(new com.p314xaae8f345.p2841xd11c237d.mm.C23012x2edeead1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a c23028xc595060a = new com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179());
                com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84274xa38667cc(com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a.class, c23028xc595060a);
                c23028xc595060a.m84461x6c4ebec7(new com.p314xaae8f345.p2841xd11c237d.sdt.C23029xbf71e06f());
                com.p314xaae8f345.p2841xd11c237d.sdt.C23026xdecd87aa c23026xdecd87aa = new com.p314xaae8f345.p2841xd11c237d.sdt.C23026xdecd87aa(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179());
                com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84274xa38667cc(com.p314xaae8f345.p2841xd11c237d.sdt.C23026xdecd87aa.class, c23026xdecd87aa);
                c23026xdecd87aa.m84451x6c4ebec7(new com.p314xaae8f345.p2841xd11c237d.sdt.C23027x475ec20f());
                ((com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a.class)).m84462xb311a8b0("/mmnetcheck");
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.d();
        }
        com.p314xaae8f345.mm.p786x600aa8b.e.k(new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.e1(this));
    }
}
