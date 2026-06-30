package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

@j95.b
/* loaded from: classes12.dex */
public class w1 extends i95.w implements ob0.a3 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f149285f;

    /* renamed from: g, reason: collision with root package name */
    public static cr0.o4 f149286g;

    /* renamed from: d, reason: collision with root package name */
    public int f149287d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f149288e = 0;

    public static void Ni() {
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (lr0.b.f402159d.a(true, 0, new yz5.l() { // from class: com.tencent.mm.feature.performance.w1$$b
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(final java.lang.Object obj) {
                final long j17 = currentTimeMillis;
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.w1$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Done. cost " + (java.lang.System.currentTimeMillis() - j17) + "ms, file:\n" + obj, 1).show();
                    }
                });
                return null;
            }
        })) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.RunnableC10669x6a3bf09());
    }

    public void Ai(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixShellService", "not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                return;
            }
        } else if (!stringExtra.startsWith(":")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && ":push".equals(stringExtra)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, null, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.z1.class, null);
            return;
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) || bm5.f1.a().endsWith(stringExtra)) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.RunnableC10676x6a3bf10());
        }
    }

    public void Bi(android.content.Intent intent) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar;
        if (!ih.d.c() || (xVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class)) == null || (fVar = xVar.f134534i) == null) {
            return;
        }
        cj.c cVar = fVar.f134520l;
        if (cVar instanceof cj.f) {
            ((cj.f) cVar).f123363g = true;
        }
    }

    public void Di(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "test flutter engine biz: %s", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "test liteapp engine biz: %s", ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.e1 e1Var = com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.e1.f150281a;
        ((ku5.t0) ku5.t0.f394148d).q(com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.d1.f150278d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, null, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a2.class, null);
    }

    public void Ri(final android.content.Context context, final int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.w1$$a
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
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.RunnableC10667x6a3bf07.run():void");
            }
        });
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        boolean z17;
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "MatrixShellService onCreate");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            z17 = f149285f;
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.x1.class);
            z17 = c10750x9556b48c != null && c10750x9556b48c.f149933d;
        }
        if (z17) {
            Bi(null);
            oh5.o.f427044d.f427023a = true;
            oh5.l.f427039h = true;
            oh5.i.f427031d.f427023a = true;
            f149285f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "set mute");
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234678b = true;
            f149285f = true;
        }
    }

    public void wi(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixShellService", "not coolassist or monkey env, disable hprof dump cmd.");
            return;
        }
        java.lang.Runtime.getRuntime().gc();
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                return;
            }
        } else if (!stringExtra.startsWith(":")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && ":push".equals(stringExtra)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, null, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.y1.class, null);
            return;
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) || bm5.f1.a().endsWith(stringExtra)) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.RunnableC10675x6a3bf0f());
        }
    }
}
