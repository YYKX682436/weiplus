package com.tencent.mm.feature.performance;

@j95.b
/* loaded from: classes12.dex */
public class w1 extends i95.w implements ob0.a3 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f67752f;

    /* renamed from: g, reason: collision with root package name */
    public static cr0.o4 f67753g;

    /* renamed from: d, reason: collision with root package name */
    public int f67754d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f67755e = 0;

    public static void Ni() {
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (lr0.b.f320626d.a(true, 0, new yz5.l() { // from class: com.tencent.mm.feature.performance.w1$$b
            @Override // yz5.l
            public final java.lang.Object invoke(final java.lang.Object obj) {
                final long j17 = currentTimeMillis;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.w1$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done. cost " + (java.lang.System.currentTimeMillis() - j17) + "ms, file:\n" + obj, 1).show();
                    }
                });
                return null;
            }
        })) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.performance.w1$$c());
    }

    public void Ai(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixShellService", "not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                return;
            }
        } else if (!stringExtra.startsWith(":")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() && ":push".equals(stringExtra)) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, com.tencent.mm.feature.performance.z1.class, null);
            return;
        }
        if ((com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) || bm5.f1.a().endsWith(stringExtra)) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.feature.performance.w1$$j());
        }
    }

    public void Bi(android.content.Intent intent) {
        com.tencent.matrix.resource.x xVar;
        com.tencent.matrix.resource.watcher.f fVar;
        if (!ih.d.c() || (xVar = (com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)) == null || (fVar = xVar.f53001i) == null) {
            return;
        }
        cj.c cVar = fVar.f52987l;
        if (cVar instanceof cj.f) {
            ((cj.f) cVar).f41830g = true;
        }
    }

    public void Di(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "test flutter engine biz: %s", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "test liteapp engine biz: %s", ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
        com.tencent.mm.matrix.monitor.e1 e1Var = com.tencent.mm.matrix.monitor.e1.f68748a;
        ((ku5.t0) ku5.t0.f312615d).q(com.tencent.mm.matrix.monitor.d1.f68745d);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, com.tencent.mm.feature.performance.a2.class, null);
    }

    public void Ri(final android.content.Context context, final int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.w1$$a
            /* JADX WARN: Removed duplicated region for block: B:37:0x03c0  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1070
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.w1$$a.run():void");
            }
        });
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        boolean z17;
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "MatrixShellService onCreate");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a() || com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            z17 = f67752f;
        } else {
            com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.feature.performance.x1.class);
            z17 = iPCBoolean != null && iPCBoolean.f68400d;
        }
        if (z17) {
            Bi(null);
            oh5.o.f345511d.f345490a = true;
            oh5.l.f345506h = true;
            oh5.i.f345498d.f345490a = true;
            f67752f = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "set mute");
            com.tencent.mm.plugin.performance.watchdogs.w.f153145b = true;
            f67752f = true;
        }
    }

    public void wi(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixShellService", "not coolassist or monkey env, disable hprof dump cmd.");
            return;
        }
        java.lang.Runtime.getRuntime().gc();
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                return;
            }
        } else if (!stringExtra.startsWith(":")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() && ":push".equals(stringExtra)) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, com.tencent.mm.feature.performance.y1.class, null);
            return;
        }
        if ((com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) || bm5.f1.a().endsWith(stringExtra)) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.feature.performance.w1$$i());
        }
    }
}
