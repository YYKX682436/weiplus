package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class m0 extends java.lang.Thread implements com.p314xaae8f345.mm.p1006xc5476f33.fts.c0 {

    /* renamed from: d, reason: collision with root package name */
    public int f219293d;

    /* renamed from: e, reason: collision with root package name */
    public int f219294e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.PriorityBlockingQueue f219295f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f219296g;

    /* renamed from: h, reason: collision with root package name */
    public p13.c f219297h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f219298i;

    public m0() {
        super("SearchDaemon");
        this.f219293d = 0;
        this.f219294e = Integer.MAX_VALUE;
        this.f219295f = new java.util.concurrent.PriorityBlockingQueue();
        this.f219296g = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void a(p13.c cVar) {
        cVar.n();
        this.f219295f.remove(cVar);
        if (this.f219297h == cVar) {
            interrupt();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public boolean b() {
        return isAlive();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "***** FTSTaskDaemon clear all task.");
        this.f219295f.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void d(p13.c cVar) {
        if (this.f219296g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.SearchTaskThread", "***** postTask was ignored since mQuitRequested flag was set.");
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("PostTaskWhenQuit");
            return;
        }
        int mo63528x3662b71a = cVar.mo63528x3662b71a();
        this.f219295f.put(cVar);
        java.lang.String mo9544xfb82e301 = cVar.mo9544xfb82e301();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo9544xfb82e301)) {
            mo9544xfb82e301 = cVar.toString();
        }
        java.lang.String str = "";
        if (mo9544xfb82e301 == null) {
            mo9544xfb82e301 = "";
        }
        p13.c cVar2 = this.f219297h;
        if (cVar2 != null) {
            java.lang.String mo9544xfb82e3012 = cVar2.mo9544xfb82e301();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo9544xfb82e3012)) {
                mo9544xfb82e3012 = cVar2.toString();
            }
            if (mo9544xfb82e3012 != null) {
                str = mo9544xfb82e3012;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "[PostTask] name=%s, priority=%d, queueSize=%d, currentRunning=%s(priority=%d)", mo9544xfb82e301, java.lang.Integer.valueOf(mo63528x3662b71a), java.lang.Integer.valueOf(this.f219295f.size()), str, java.lang.Integer.valueOf(this.f219294e));
        if (this.f219297h == null) {
            h(mo63528x3662b71a);
        } else if (mo63528x3662b71a < this.f219294e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.SearchTaskThread", "[PostTask] Preempting! new=%s(%d) interrupts current=%s(%d)", mo9544xfb82e301, java.lang.Integer.valueOf(mo63528x3662b71a), str, java.lang.Integer.valueOf(this.f219294e));
            interrupt();
            h(mo63528x3662b71a);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public synchronized void e(boolean z17) {
        int i17;
        if (this.f219298i == z17) {
            return;
        }
        this.f219298i = z17;
        if (this.f219294e >= 0 && isAlive() && (i17 = this.f219293d) != 0) {
            int i18 = this.f219298i ? 10 : 0;
            try {
                android.os.Process.setThreadPriority(i17, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "*** Switch priority: ".concat(this.f219298i ? "foreground" : "background"));
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e17, "setLowPriorityMode failed, tid=%d, p=%d", java.lang.Integer.valueOf(this.f219293d), java.lang.Integer.valueOf(i18));
            }
        }
    }

    public final void f() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "clearRunningTaskName");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M == null) {
                return;
            }
            M.putString("running_task_name", "");
            M.putLong("running_task_start_time", 0L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e17, "clearRunningTaskName failed", new java.lang.Object[0]);
        }
    }

    public final void g(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M == null) {
                return;
            }
            M.putString("running_task_name", str);
            M.putLong("running_task_start_time", c01.id.c());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e17, "persistRunningTaskName failed", new java.lang.Object[0]);
        }
    }

    public final synchronized void h(int i17) {
        if (this.f219294e != i17 && isAlive()) {
            if (i17 < 0 && this.f219294e >= 0) {
                android.os.Process.setThreadPriority(this.f219293d, -8);
            } else if (i17 >= 0 && this.f219294e < 0) {
                android.os.Process.setThreadPriority(this.f219293d, this.f219298i ? 10 : 0);
            }
            this.f219294e = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    /* renamed from: quit */
    public synchronized void mo63521x35224f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "***** FTSTaskDaemon thread was quitting.");
        this.f219295f.clear();
        this.f219297h = null;
        this.f219296g = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        p13.c cVar;
        java.lang.String str;
        char c17;
        int i17;
        java.lang.String format;
        int i18;
        this.f219293d = android.os.Process.myTid();
        int i19 = 4;
        char c18 = 1;
        int i27 = 2;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M != null) {
                java.lang.String string = M.getString("running_task_name", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    long j17 = M.getLong("running_task_start_time", 0L);
                    long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.SearchTaskThread", "[BlockDetect] Last process task stuck until killed: %s, duration=%dms", string, java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22021, 20260509, 0, string, java.lang.Long.valueOf(j17), "", "", "", java.lang.Long.valueOf(currentTimeMillis));
                    M.putString("running_task_name", "");
                    M.putLong("running_task_start_time", 0L);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e17, "checkLastTaskBlock failed", new java.lang.Object[0]);
        }
        while (true) {
            try {
                try {
                    java.lang.Thread.interrupted();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    cVar = null;
                    str = null;
                }
                if (this.f219296g) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                    f();
                    this.f219297h = null;
                    this.f219293d = 0;
                    return;
                }
                this.f219297h = null;
                cVar = (p13.c) this.f219295f.take();
                if (cVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                    f();
                    this.f219297h = null;
                } else {
                    try {
                        this.f219297h = cVar;
                        h(cVar.mo63528x3662b71a());
                        str = cVar.mo9544xfb82e301();
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        str = null;
                    }
                    try {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            str = cVar.toString();
                        }
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = str;
                        objArr[c18] = java.lang.Integer.valueOf(cVar.mo63528x3662b71a());
                        objArr[i27] = java.lang.Integer.valueOf(this.f219295f.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "[ExecTask] name=%s, priority=%d, pendingQueueSize=%d", objArr);
                        g(str);
                        cVar.h();
                        o13.p.f(cVar.k(), cVar.f432600g);
                        o13.p.g(cVar.k(), cVar.f432600g);
                        if (((cVar.f432601h & 1) > 0 ? c18 : (char) 0) != 0) {
                            long j18 = cVar.f432600g;
                            if (j18 > 1000 && j18 < 3600000) {
                                o13.p.f(27, j18);
                                o13.p.g(27, cVar.f432600g);
                            }
                        }
                        if (cVar instanceof p13.t) {
                            p13.t tVar = (p13.t) cVar;
                            java.util.Locale locale = java.util.Locale.CHINA;
                            java.lang.Object[] objArr2 = new java.lang.Object[i19];
                            objArr2[0] = str;
                            objArr2[c18] = tVar.f432668n.m157690x9616526c();
                            objArr2[i27] = tVar.f432669o.m157691x9616526c();
                            objArr2[3] = java.lang.Long.valueOf(cVar.f432600g);
                            format = java.lang.String.format(locale, "[%s][Request=%s][Result=%s] Done, %dms", objArr2);
                            i18 = tVar.f432669o.f432693e.size();
                        } else {
                            java.util.Locale locale2 = java.util.Locale.CHINA;
                            java.lang.Object[] objArr3 = new java.lang.Object[i27];
                            objArr3[0] = str;
                            objArr3[c18] = java.lang.Long.valueOf(cVar.f432600g);
                            format = java.lang.String.format(locale2, "[%s] Done, %dms", objArr3);
                            i18 = 0;
                        }
                        o13.p.h(cVar.k(), cVar.f432600g, i18);
                        java.lang.String l17 = cVar.l();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                            format = format + " " + l17;
                        }
                        java.lang.String j19 = cVar.j();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j19)) {
                            format = format + " " + j19;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", format);
                        com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                        f();
                        this.f219297h = null;
                        c17 = 1;
                        i17 = 2;
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        if (cVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "continue, baseSearchTask is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                            f();
                            this.f219297h = null;
                            i19 = 4;
                            c18 = 1;
                            i27 = 2;
                        } else {
                            if (e instanceof java.lang.InterruptedException) {
                                if (!cVar.m()) {
                                    this.f219295f.put(cVar);
                                }
                                c17 = 1;
                                i17 = 2;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "[%s][cancelled:%b] interruputed! %dms", str, java.lang.Boolean.valueOf(cVar.m()), java.lang.Long.valueOf(cVar.f432600g));
                            } else {
                                c17 = 1;
                                i17 = 2;
                                if (e instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.q) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SearchTaskThread", "stop task and do nothing");
                                } else if (e instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDatabaseCorruptException");
                                } else if (e instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26944x3f3ff326) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteConstraintException");
                                } else if (e instanceof p13.a0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchFeatureException");
                                } else if (e instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDiskIOException");
                                } else if (e instanceof java.lang.NullPointerException) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("NullPointerException");
                                } else if (e instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    if (e.getMessage() == null || !e.getMessage().contains("the connection is read-only")) {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteException");
                                    } else {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteExceptionReadOnly");
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("OtherException");
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                            f();
                            this.f219297h = null;
                            c18 = c17;
                            i27 = i17;
                            i19 = 4;
                        }
                    }
                    c18 = c17;
                    i27 = i17;
                    i19 = 4;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                f();
                this.f219297h = null;
                throw th6;
            }
        }
    }
}
