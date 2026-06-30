package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 f219938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var) {
        super(0);
        this.f219938d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Throwable th6;
        p13.c cVar;
        java.lang.String str;
        java.lang.String format;
        int i17;
        try {
        } catch (java.lang.Throwable th7) {
            th6 = th7;
            cVar = null;
            str = null;
        }
        if (!this.f219938d.f218909g) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var = this.f219938d;
            b0Var.f218906d = null;
            cVar = (p13.c) com.p314xaae8f345.mm.p1006xc5476f33.fts.b0.f(b0Var).poll();
            if (cVar != null) {
                try {
                    java.lang.Thread.interrupted();
                    cVar.f432599f = false;
                    this.f219938d.f218906d = cVar;
                    cVar.mo63528x3662b71a();
                    str = cVar.mo9544xfb82e301();
                    try {
                        cVar.h();
                        o13.p.f(cVar.k(), cVar.f432600g);
                        o13.p.g(cVar.k(), cVar.f432600g);
                        if ((cVar.f432601h & 1) > 0) {
                            long j17 = cVar.f432600g;
                            if (j17 > 1000 && j17 < 3600000) {
                                o13.p.f(27, j17);
                                o13.p.g(27, cVar.f432600g);
                            }
                        }
                        if (cVar instanceof p13.t) {
                            format = java.lang.String.format(java.util.Locale.CHINA, "[%s][Request=%s][Result=%s] Done, %dms", java.util.Arrays.copyOf(new java.lang.Object[]{str, ((p13.t) cVar).f432668n.m157690x9616526c(), ((p13.t) cVar).f432669o.m157691x9616526c(), java.lang.Long.valueOf(cVar.f432600g)}, 4));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                            i17 = ((p13.t) cVar).f432669o.f432693e.size();
                        } else {
                            format = java.lang.String.format(java.util.Locale.CHINA, "[%s] Done, %dms", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Long.valueOf(cVar.f432600g)}, 2));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                            i17 = 0;
                        }
                        o13.p.h(cVar.k(), cVar.f432600g, i17);
                        java.lang.String l17 = cVar.l();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                            format = format + ' ' + l17;
                        }
                        java.lang.String j18 = cVar.j();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
                            format = format + ' ' + j18;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", format);
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        if (cVar != null) {
                            try {
                                if (th6 instanceof java.lang.InterruptedException) {
                                    if (!cVar.m()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.fts.b0.f(this.f219938d).add(cVar);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "[%s][cancelled:%b] interruputed! %dms", str, java.lang.Boolean.valueOf(cVar.m()), java.lang.Long.valueOf(cVar.f432600g));
                                } else if (th6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.q) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "stop task and do nothing");
                                } else if (th6 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDatabaseCorruptException");
                                } else if (th6 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26944x3f3ff326) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteConstraintException");
                                } else if (th6 instanceof p13.a0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchFeatureException");
                                } else if (th6 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDiskIOException");
                                } else if (th6 instanceof java.lang.NullPointerException) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("NullPointerException");
                                    this.f219938d.getClass();
                                } else if (th6 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    if (th6.getMessage() != null) {
                                        java.lang.String message = th6.getMessage();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(message);
                                        if (r26.n0.B(message, "the connection is read-only", false)) {
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteExceptionReadOnly");
                                            this.f219938d.getClass();
                                        }
                                    }
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteException");
                                    this.f219938d.getClass();
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("OtherException");
                                    this.f219938d.getClass();
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                                com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var2 = this.f219938d;
                                b0Var2.f218906d = null;
                                b0Var2.h();
                                return jz5.f0.f384359a;
                            } finally {
                                com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                                this.f219938d.f218906d = null;
                            }
                        }
                        return jz5.f0.f384359a;
                    }
                } catch (java.lang.Throwable th9) {
                    th6 = th9;
                    str = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fts.e.a();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var22 = this.f219938d;
                b0Var22.f218906d = null;
                b0Var22.h();
                return jz5.f0.f384359a;
            }
        }
        return jz5.f0.f384359a;
    }
}
