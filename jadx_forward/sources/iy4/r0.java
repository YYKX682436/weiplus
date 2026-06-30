package iy4;

/* loaded from: classes11.dex */
public class r0 implements wf0.u1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.x9 f377522d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f377523e = new java.util.HashMap();

    public r0() {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: iy4.r0$$b
            @Override // java.lang.Runnable
            public final void run() {
                iy4.r0 r0Var = iy4.r0.this;
                r0Var.getClass();
                r0Var.f377522d = new com.p314xaae8f345.mm.p2621x8fb0427b.x9();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append(gm0.j1.u().h());
                sb6.append("syncmsgid.ini");
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb6.toString(), 0, -1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                    return;
                }
                try {
                    r0Var.f377522d.mo11468x92b714fd(N);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTerminalSyncMgr", "task parse Error");
                }
            }
        }, "MultiTerminalSyncMgr");
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
        gm0.j1.d().a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
    }

    public final boolean a(long j17) {
        return !(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20168x8f9cca64()) == 1) && j17 > 26214400;
    }

    public void b() {
        ((ku5.t0) ku5.t0.f394148d).l(new java.lang.Runnable() { // from class: iy4.r0$$d
            @Override // java.lang.Runnable
            public final void run() {
                char c17;
                iy4.r0 r0Var = iy4.r0.this;
                for (int i17 = 0; i17 < r0Var.f377522d.f277869d.size(); i17++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) r0Var.f377522d.f277869d.get(i17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(y9Var.f277919f) > 1209600) {
                        r0Var.f377522d.f277869d.remove(y9Var);
                        r0Var.d();
                        r0Var.b();
                        return;
                    }
                    long j17 = y9Var.f277918e;
                    if (j17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17) >= 900) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 wg6 = pt0.f0.wg(y9Var.f277920g, y9Var.f277917d, true);
                        if (wg6 == null || wg6.I0() == 0 || wg6.z2()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "msg not exit or cleaned, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(y9Var.f277917d), y9Var.f277920g);
                            r0Var.f377522d.f277869d.remove(y9Var);
                            r0Var.d();
                            r0Var.b();
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile user:%s, msgSvrId:%d, msgLocalId:%d, path:%s", wg6.Q0(), java.lang.Long.valueOf(wg6.I0()), java.lang.Long.valueOf(wg6.m124847x74d37ac6()), wg6.z0());
                        if (wg6.J2()) {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            m11.b0 b27 = m11.b1.Di().b2(wg6.Q0(), wg6.I0());
                            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(wg6.j(), "msg", null);
                            int P = d17 == null ? 0 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0);
                            if (b27.f404166a <= 0 || b27.k() || P == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile image not ready, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(wg6.m124847x74d37ac6()), wg6.Q0());
                            } else if (r0Var.a(P)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile image too big, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(wg6.m124847x74d37ac6()), wg6.Q0());
                            } else if (P <= (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20168x8f9cca64()) == 1 ? 26214400 : 1048576) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                ((ku5.t0) ku5.t0.f394148d).B(new iy4.t0(r0Var, wg6, P, b27));
                                c17 = 2;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload image too big, totalLen:%d", java.lang.Integer.valueOf(P));
                                c17 = 3;
                            }
                            c17 = 1;
                        } else if (wg6.mo78013xfb85f7b0() == 43 || wg6.mo78013xfb85f7b0() == 44 || wg6.mo78013xfb85f7b0() == 62) {
                            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z07 = wg6.z0();
                            ((vf0.y1) x1Var).getClass();
                            t21.v2 h17 = t21.d3.h(z07);
                            if (h17 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTerminalSyncMgr", "autoDownload failed cause video info not found! The path is " + wg6.z0());
                            } else {
                                int i18 = h17.f496541f;
                                if (h17.f496544i == 199 || i18 == 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTerminalSyncMgr", "autoDownload failed cause video info not finish proc! The path is " + wg6.z0());
                                } else if (r0Var.a(i18)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video too big, totalLen:%d", java.lang.Integer.valueOf(i18));
                                } else if (i18 <= (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20168x8f9cca64()) == 1 ? 26214400 : 1048576) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                    ((ku5.t0) ku5.t0.f394148d).B(new iy4.u0(r0Var, wg6, i18));
                                    c17 = 2;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video too big, totalLen:%d", java.lang.Integer.valueOf(i18));
                                    c17 = 3;
                                }
                            }
                            c17 = 1;
                        } else {
                            if (wg6.k2()) {
                                ot0.q v17 = ot0.q.v(wg6.j());
                                if (v17 != null) {
                                    ez.v0 v0Var = ez.v0.f339310a;
                                    if (v0Var.i(java.lang.Integer.valueOf(v17.f430199i))) {
                                        if (v0Var.k(java.lang.Integer.valueOf(v17.f430199i))) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "appMsg is uploading");
                                        } else {
                                            long j18 = v17.f430215m;
                                            if (r0Var.a(j18)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach too big, totalLen:%d", java.lang.Long.valueOf(j18));
                                            } else if (j18 <= (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20168x8f9cca64()) == 1 ? 26214400 : 1048576) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d j19 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.j(wg6);
                                                if (j19 == null) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "attachInfo is null");
                                                } else if (!j19.t0() && j18 != 0) {
                                                    te5.h hVar = te5.h.f500182a;
                                                    if (hVar.b(wg6)) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "msg is expired");
                                                    } else {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach, totalLen:%d", java.lang.Long.valueOf(j18));
                                                        if (!hVar.c()) {
                                                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.d(wg6, null);
                                                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wg6.Q0())) {
                                                            h40.f fVar = new h40.f(wg6.Q0(), wg6.I0());
                                                            fVar.f360279g = true;
                                                            fVar.f360275c = new iy4.v0(r0Var, wg6);
                                                            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
                                                        }
                                                        c17 = 2;
                                                    }
                                                }
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach too big, totalLen:%d", java.lang.Long.valueOf(j18));
                                            }
                                        }
                                        c17 = 3;
                                    }
                                }
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                objArr[0] = java.lang.Integer.valueOf(v17 == null ? 0 : v17.f430199i);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "appMsg not support, subType:%d", objArr);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "msgType not support:%d", java.lang.Integer.valueOf(wg6.mo78013xfb85f7b0()));
                            }
                            c17 = 1;
                        }
                        if (c17 == 1) {
                            r0Var.f377522d.f277869d.remove(y9Var);
                            r0Var.d();
                        } else {
                            y9Var.f277918e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                            r0Var.d();
                        }
                        r0Var.b();
                        return;
                    }
                }
            }
        }, 500L, "MultiTerminalSyncMgr");
    }

    public void c(final long j17) {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: iy4.r0$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = 0;
                while (true) {
                    iy4.r0 r0Var = iy4.r0.this;
                    if (i17 >= r0Var.f377522d.f277869d.size()) {
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) r0Var.f377522d.f277869d.get(i17);
                    if (y9Var.f277917d == j17) {
                        r0Var.f377522d.f277869d.remove(y9Var);
                        r0Var.d();
                        return;
                    }
                    i17++;
                }
            }
        }, "MultiTerminalSyncMgr");
    }

    public final void d() {
        try {
            byte[] mo14344x5f01b1f6 = this.f377522d.mo14344x5f01b1f6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("syncmsgid.ini");
            com.p314xaae8f345.mm.vfs.w6.S(sb6.toString(), mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTerminalSyncMgr", "task to file Error");
        }
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.HashMap hashMap = this.f377523e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) hashMap.get(r1Var.f527062a);
        if (f9Var == null) {
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            return;
        }
        if (f9Var.z2() || h17.f496544i == 199) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "download video end: %d, status:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(h17.f496544i));
            c(f9Var.m124847x74d37ac6());
            hashMap.remove(f9Var.z0());
        } else if (f9Var.P0() == 198) {
            hashMap.remove(f9Var.z0());
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof bt3.l0)) {
            long j17 = ((bt3.l0) m1Var).f105851m;
            c(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "download attach end: %d", java.lang.Long.valueOf(j17));
        }
    }
}
