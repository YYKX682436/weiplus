package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.fts.c0 {

    /* renamed from: d, reason: collision with root package name */
    public p13.c f218906d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f218907e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.fts.a0.f218904d);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f218908f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f218909g;

    public static final java.util.PriorityQueue f(com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var) {
        return (java.util.PriorityQueue) ((jz5.n) b0Var.f218907e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void a(p13.c baseSearchTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseSearchTask, "baseSearchTask");
        baseSearchTask.n();
        if (this.f218906d == baseSearchTask) {
            baseSearchTask.f432599f = true;
        }
        pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.u(this, baseSearchTask));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public boolean b() {
        return this.f218908f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "***** FTSTaskDaemon clear all task.");
        pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.v(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void d(p13.c baseSearchTask) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseSearchTask, "baseSearchTask");
        if (this.f218909g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSThreadPoolQueue", "***** postTask was ignored since mQuitRequested flag was set.");
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("PostTaskWhenQuit");
            return;
        }
        p13.c cVar = this.f218906d;
        if (cVar != null) {
            int mo63528x3662b71a = cVar.mo63528x3662b71a();
            int mo63528x3662b71a2 = baseSearchTask.mo63528x3662b71a();
            pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.w(baseSearchTask, mo63528x3662b71a2, cVar, mo63528x3662b71a, this));
            if (mo63528x3662b71a >= mo63528x3662b71a2) {
                cVar.f432599f = true;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.x(baseSearchTask, this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    public void e(boolean z17) {
    }

    public final java.lang.String g() {
        return "FTSThreadPoolQueue-" + hashCode();
    }

    public final void h() {
        if (this.f218908f) {
            pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.z(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "not start fts queue");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    /* renamed from: quit */
    public synchronized void mo63521x35224f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "***** FTSTaskDaemon thread was quitting.");
        pm0.v.O(g(), new com.p314xaae8f345.mm.p1006xc5476f33.fts.y(this));
        p13.c cVar = this.f218906d;
        if (cVar != null) {
            cVar.f432599f = true;
        }
        this.f218906d = null;
        this.f218909g = true;
        this.f218908f = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.c0
    /* renamed from: start */
    public void mo63522x68ac462() {
        this.f218908f = true;
        this.f218909g = false;
        h();
    }
}
