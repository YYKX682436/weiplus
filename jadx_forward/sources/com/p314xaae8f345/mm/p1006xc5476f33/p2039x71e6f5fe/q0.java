package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

@j95.b
/* loaded from: classes12.dex */
public class q0 extends jm0.o implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z {

    /* renamed from: m, reason: collision with root package name */
    public volatile e04.w2 f240656m;

    /* renamed from: n, reason: collision with root package name */
    public zz3.b f240657n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f240658o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f240659p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f240660q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final e04.v2 f240661r = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.r0(this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f240662s = false;

    static {
        new java.util.HashMap();
    }

    public java.lang.String Zi(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ri();
        sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().wi());
        sb7.append("scan_result/");
        java.lang.String sb8 = sb7.toString();
        if (!this.f240662s) {
            com.p314xaae8f345.mm.vfs.w6.t(sb8);
            this.f240662s = true;
        }
        sb6.append(sb8);
        sb6.append(java.lang.String.format("%s_%d.%s", "translation", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str));
        return sb6.toString();
    }

    public e04.w2 aj() {
        if (this.f240656m == null) {
            synchronized (this) {
                if (this.f240656m == null) {
                    this.f240656m = new e04.w2();
                }
            }
        }
        return this.f240656m;
    }

    public dm.aa bj(java.lang.String str) {
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + com.p314xaae8f345.mm.vfs.w6.l(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "getTranslationResult %s, md5 %s", str, a17);
        return cj().y0(a17);
    }

    public zz3.b cj() {
        gm0.j1.b().c();
        if (this.f240657n == null) {
            this.f240657n = new zz3.b(gm0.j1.u().f354686f);
        }
        return this.f240657n;
    }

    public void fj(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409();
        am.ct ctVar = c5974x1d8a7409.f136272g;
        ctVar.f87933a = i17;
        ctVar.f87935c = false;
        java.util.HashMap hashMap = this.f240658o;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17)) && (c6797x4bb2039 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) this.f240659p.get(java.lang.Integer.valueOf(i17))) != null) {
            ctVar.f87934b = (int) c6797x4bb2039.f141278d;
        }
        c5974x1d8a7409.e();
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public com.p314xaae8f345.mm.p947xba6de98f.q0 hj(final int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0 e0Var, final e04.v2 v2Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - e0Var.f240413i;
        java.util.HashMap hashMap = this.f240659p;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) hashMap.get(java.lang.Integer.valueOf(i17))).f141282h = currentTimeMillis;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: sessionId:%s  scene cost:%s", java.lang.Integer.valueOf(i17), java.lang.String.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2) this.f240658o.get(java.lang.Integer.valueOf(i17));
        if (p2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginScanTranslation", "startTranslationSpr, record is null, sessionId: " + i17);
        } else {
            boolean z17 = e0Var.f240417p;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = e0Var.f240409e;
            p2Var.f240510c = z17 ? e0Var.f240422u : ((r45.xv4) oVar.f152244b.f152233a).f472034h;
            p2Var.f240511d = e0Var.I();
            boolean z18 = e0Var.f240417p;
            p2Var.f240512e = z18 ? e0Var.f240424w : ((r45.xv4) oVar.f152244b.f152233a).f472036m;
            p2Var.f240514g = e0Var.f240415n;
            p2Var.f240515h = e0Var.f240416o;
            p2Var.f240516i = z18 ? e0Var.f240418q : "";
            p2Var.f240517j = z18 ? e0Var.f240419r : "";
        }
        final java.lang.String Zi = Zi("jpg");
        com.p314xaae8f345.mm.vfs.w6.u(Zi);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_TranslateImageResultDownload";
        mVar.f69595x6d25b0d9 = Zi;
        mVar.f69592xf1ebe47b = 2;
        mVar.f69620xeb1a61d6 = e0Var.f240420s;
        mVar.f69575xf11df5f5 = e0Var.f240419r;
        mVar.f69591xf9dbbe9c = e0Var.f240418q;
        mVar.f69601xaca5bdda = e0Var.f240418q + i17;
        mVar.f69609xd84b8349 = 2;
        final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p947xba6de98f.q0 q0Var = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: com.tencent.mm.plugin.scanner.q0$$a
            @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
            public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                int ordinal = n1Var.f152636a.ordinal();
                e04.v2 v2Var2 = v2Var;
                int i18 = i17;
                com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = n1Var.f152636a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s  download cost: %s", m1Var.name(), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                        v2Var2.v5(i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(Zi));
                        return;
                    } else if (ordinal != 10) {
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s", m1Var.name());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr post to ui: event:%s", m1Var.name());
                v2Var2.v5(i18, null);
            }
        };
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(q0Var));
        return q0Var;
    }
}
