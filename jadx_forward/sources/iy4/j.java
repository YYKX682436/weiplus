package iy4;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final iy4.j f377504a = new iy4.j();

    public static final void a(long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f377504a.b(j17, talker);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadIPCHelper", "forwarding addTask via IPC: msgId=" + j17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299(j17, talker), iy4.i.class, null);
    }

    public final void b(final long j17, final java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        pz.e eVar = (pz.e) i95.n0.c(pz.e.class);
        boolean z17 = false;
        if (eVar != null) {
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20160x9731847b()) == 1) {
                z17 = true;
            }
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            ((oz.s) eVar).bj(j17, talker, "auto_sync", true, false);
            return;
        }
        iy4.e1 e1Var = (iy4.e1) i95.n0.c(iy4.e1.class);
        if (e1Var != null) {
            gm0.j1.b().c();
            if (e1Var.f377491d == null) {
                e1Var.f377491d = new iy4.r0();
            }
            final iy4.r0 r0Var = e1Var.f377491d;
            if (r0Var != null) {
                if (((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
                    ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: iy4.r0$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            iy4.r0 r0Var2 = iy4.r0.this;
                            r0Var2.getClass();
                            com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y9();
                            y9Var.f277917d = j17;
                            y9Var.f277919f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                            y9Var.f277920g = talker;
                            r0Var2.f377522d.f277869d.add(y9Var);
                            r0Var2.d();
                            r0Var2.b();
                        }
                    }, "MultiTerminalSyncMgr");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoSyncState close");
                }
            }
        }
    }
}
