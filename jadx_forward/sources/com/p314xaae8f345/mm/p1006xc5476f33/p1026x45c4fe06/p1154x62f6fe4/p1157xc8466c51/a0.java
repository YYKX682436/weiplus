package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes15.dex */
public class a0 {

    /* renamed from: u, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 f167310u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.Object f167311v;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c f167315d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167318g;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f167326o;

    /* renamed from: a, reason: collision with root package name */
    public lh1.c f167312a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f167313b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f167314c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z f167316e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public kh1.e f167317f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167319h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f167320i = 0;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f167321j = null;

    /* renamed from: k, reason: collision with root package name */
    public long f167322k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f167323l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f167324m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f167325n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167327p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167328q = false;

    /* renamed from: r, reason: collision with root package name */
    public final lh1.b f167329r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.r(this);

    /* renamed from: s, reason: collision with root package name */
    public final kh1.d f167330s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.s(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k f167331t = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p(this);

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.f167365a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.q();
        f167311v = new java.lang.Object();
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l lVar;
        a0Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "_start in runnable");
            if (!a0Var.f()) {
                a0Var.h(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "init encoder fail");
                return;
            }
            a0Var.f167319h = false;
            a0Var.f167320i = 0;
            if (!a0Var.f167327p) {
                a0Var.f167327p = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = a0Var.f167315d;
                if (c12420xb1146e9c != null && (lVar = c12420xb1146e9c.f167379r) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).f167345a = a0Var.f167331t;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).b();
                }
            }
            if (!a0Var.l()) {
                a0Var.h(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "start record fail");
                return;
            }
            kh1.e eVar = a0Var.f167317f;
            tl.w wVar = a0Var.f167312a.f400184a;
            eVar.c(wVar != null ? wVar.c() : 0);
            a0Var.f167317f.b(a0Var.f167315d.f167375n);
            a0Var.f167324m = 0;
            a0Var.f167322k = a0Var.f167315d.f167368d;
            a0Var.f167325n = java.lang.System.currentTimeMillis();
            long j17 = a0Var.f167322k;
            a0Var.f167323l = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a0Var.f167325n));
            a0Var.e().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.y(a0Var));
            a0Var.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "_start", new java.lang.Object[0]);
            a0Var.h(4);
        }
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var) {
        a0Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "_resume in runnable");
            if (a0Var.f167317f == null) {
                a0Var.h(3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            } else if (a0Var.f167323l <= 0) {
                a0Var.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail, record time reach max time, to stop record");
            } else if (a0Var.l()) {
                a0Var.f167325n = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, currentTime:%d", java.lang.Long.valueOf(a0Var.f167323l), java.lang.Long.valueOf(a0Var.f167325n));
                a0Var.e().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.m(a0Var));
                a0Var.j();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "resume record success");
            } else {
                a0Var.h(7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "_resume", new java.lang.Object[0]);
            a0Var.h(5);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var;
        synchronized (f167311v) {
            if (f167310u == null) {
                f167310u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0();
            }
            a0Var = f167310u;
        }
        return a0Var;
    }

    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.PAUSE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "pause record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "_pause", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f167316e == zVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "is paused, don't pause again");
            return;
        }
        lh1.c cVar = this.f167312a;
        if (cVar != null) {
            z17 = cVar.a();
            this.f167312a = null;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        if (c12420xb1146e9c != null && (lVar = c12420xb1146e9c.f167379r) != null) {
            boolean a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "isInterrupted:%b, interrupted:%b", java.lang.Boolean.valueOf(this.f167328q), java.lang.Boolean.valueOf(a17));
            if (a17 && !this.f167328q) {
                i();
            }
        }
        e().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.n(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f167325n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f167324m));
        int i17 = (int) (this.f167324m + j17);
        this.f167324m = i17;
        long j18 = this.f167322k - i17;
        this.f167323l = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f167324m));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            h(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "pause record fail");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onPause");
        this.f167316e = zVar;
        this.f167313b = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 3;
        unVar.f89643c = "pause";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c2 = this.f167315d;
        if (c12420xb1146e9c2 != null) {
            unVar.f89650j = c12420xb1146e9c2.f167377p;
        }
        c5826x579920c5.b(android.os.Looper.getMainLooper());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "pause record success");
    }

    public final void b() {
        boolean z17;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.STOP;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "stop record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f167316e == zVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "is stopped, don't stop again");
            return;
        }
        lh1.c cVar = this.f167312a;
        if (cVar != null) {
            z17 = cVar.a();
            this.f167312a = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        this.f167319h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(this.f167320i));
        kh1.e eVar = this.f167317f;
        if (eVar != null) {
            eVar.mo51971x5d03b04();
            this.f167317f.mo51970x5a5ddf8();
            this.f167317f = null;
        }
        e().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o(this));
        if (this.f167316e == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.PAUSE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f167325n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f167324m));
            int i17 = (int) (this.f167324m + currentTimeMillis2);
            this.f167324m = i17;
            long j18 = this.f167322k - i17;
            this.f167323l = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f167324m));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onStop");
            this.f167316e = zVar;
            this.f167313b = false;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
            am.un unVar = c5826x579920c5.f136134g;
            unVar.f89641a = 2;
            unVar.f89643c = "stop";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
            if (c12420xb1146e9c != null) {
                unVar.f89650j = c12420xb1146e9c.f167377p;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d, mRealRecordedTime%d", java.lang.Integer.valueOf(this.f167320i), java.lang.Integer.valueOf(this.f167324m));
            unVar.f89642b = java.lang.Math.min(this.f167320i, this.f167324m);
            java.lang.String str = this.f167318g;
            unVar.f89644d = str;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordUtil", "exist audio file");
                j17 = r6Var.C();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordUtil", "audio file not exit, path:%s", str);
                j17 = -1;
            }
            unVar.f89645e = (int) j17;
            c5826x579920c5.b(android.os.Looper.getMainLooper());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "stop record success");
        } else {
            h(9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "stop record fail");
        }
        this.f167315d = null;
        java.lang.Long l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167350a;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis3 - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167352c <= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167351b.longValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "start clean audio record file");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167352c = currentTimeMillis3;
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i(), "AudioRecordCacheClean");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e() {
        if (this.f167326o == null) {
            this.f167326o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        return this.f167326o;
    }

    public final boolean f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "initEncode");
        kh1.e eVar = this.f167317f;
        if (eVar != null) {
            eVar.mo51970x5a5ddf8();
            this.f167317f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        java.lang.String str = c12420xb1146e9c.f167372h;
        java.lang.String str2 = c12420xb1146e9c.f167373i;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), "AudioRecord");
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audio");
        java.lang.String str3 = "";
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("" + str2));
        if (!android.text.TextUtils.isEmpty(str)) {
            if ("aac".equalsIgnoreCase(str)) {
                str3 = ".m4a";
            } else if ("mp3".equalsIgnoreCase(str)) {
                str3 = ".mp3";
            } else if ("wav".equalsIgnoreCase(str)) {
                str3 = ".wav";
            } else if ("opus".equalsIgnoreCase(str)) {
                str3 = ".opus";
            }
        }
        sb6.append(str3);
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.n();
        java.lang.String o17 = r6Var2.o();
        this.f167318g = o17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mFilePath:%s", o17);
        if ("opus".equalsIgnoreCase(this.f167315d.f167372h)) {
            this.f167317f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j0();
        } else {
            this.f167317f = kh1.b.a(this.f167315d.f167372h);
        }
        boolean z17 = false;
        if (this.f167317f != null) {
            boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.d0.b(this.f167318g);
            if (!b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "prepare cache file fail");
                return b17;
            }
            try {
                kh1.e eVar2 = this.f167317f;
                java.lang.String str4 = this.f167318g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c2 = this.f167315d;
                z17 = eVar2.mo51972x316510(str4, c12420xb1146e9c2.f167369e, c12420xb1146e9c2.f167370f, c12420xb1146e9c2.f167371g);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "init encoder fail", new java.lang.Object[0]);
            }
            this.f167317f.a(this.f167330s);
        }
        return z17;
    }

    public void h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z zVar = this.f167316e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z zVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.ERROR;
        if (zVar != zVar2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.b(i17);
        }
        this.f167316e = zVar2;
        this.f167313b = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 4;
        unVar.f89643c = "error";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        unVar.f89648h = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("errType:" + i17 + ", err:");
        switch (i17) {
            case 1:
                sb6.append("error PCM record callback");
                break;
            case 2:
                sb6.append("init encoder fail, occur exception");
                break;
            case 3:
                sb6.append("encoder un initial occur exception");
                break;
            case 4:
                sb6.append("start record occur exception");
                break;
            case 5:
                sb6.append("resume record occur exception");
                break;
            case 6:
                sb6.append("fail to start record");
                break;
            case 7:
                sb6.append("fail to resume record");
                break;
            case 8:
                sb6.append("fail to pause record");
                break;
            case 9:
                sb6.append("fail to stop record");
                break;
            default:
                switch (i17) {
                    case 15:
                        sb6.append("check param invalid");
                        break;
                    case 16:
                        sb6.append("not support format type");
                        break;
                    case 17:
                        sb6.append("fail to init mp3 encoder");
                        break;
                    case 18:
                        sb6.append("mp3 file not found exception");
                        break;
                    case 19:
                        sb6.append("mp3 encode exception");
                        break;
                    case 20:
                        sb6.append("mp3 write buffer exception");
                        break;
                    case 21:
                        sb6.append("fail to init aac encoder");
                        break;
                    case 22:
                        sb6.append("fail to create mp4 file");
                        break;
                    case 23:
                        sb6.append("aac encode exception");
                        break;
                    case 24:
                        sb6.append("create cache file fail");
                        break;
                    case 25:
                        sb6.append("init encoder fail");
                        break;
                    case 26:
                        sb6.append("not support sample rate");
                        break;
                    default:
                        sb6.append("unknow error");
                        break;
                }
        }
        unVar.f89649i = sb6.toString();
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }

    public void i() {
        this.f167328q = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionBegin");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 6;
        unVar.f89643c = "interruptionBegin";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }

    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onResume");
        this.f167316e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.RESUME;
        this.f167313b = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 1;
        unVar.f89643c = "resume";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onStart");
        this.f167316e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.START;
        this.f167313b = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 0;
        unVar.f89643c = "start";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }

    public final boolean l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "startRecordInternal");
        lh1.c cVar = this.f167312a;
        if (cVar != null) {
            cVar.a();
            this.f167312a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
        }
        if (this.f167312a == null) {
            lh1.c cVar2 = new lh1.c(this.f167315d);
            this.f167312a = cVar2;
            cVar2.f400189f = this.f167329r;
        }
        lh1.c cVar3 = this.f167312a;
        cVar3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
        tl.w wVar = cVar3.f400184a;
        if (wVar != null) {
            wVar.l();
            cVar3.f400184a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        cVar3.f400188e = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecorder", "start time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        cVar3.f400184a = new tl.w(cVar3.f400186c, cVar3.f400187d, cVar3.f400190g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = cVar3.f400185b;
        if ("mp3".equalsIgnoreCase(c12420xb1146e9c.f167372h)) {
            cVar3.f400184a.g(40);
        } else {
            cVar3.f400184a.g(20);
        }
        cVar3.f400184a.i(false);
        tl.w wVar2 = cVar3.f400184a;
        wVar2.f501705y = cVar3.f400191h;
        wVar2.e(c12420xb1146e9c.f167378q.f167339d);
        boolean k17 = cVar3.f400184a.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public boolean m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        if (this.f167312a == null && this.f167317f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
            return false;
        }
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.x(this), "app_brand_stop_record");
        return true;
    }

    public final void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "stopTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f167321j;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f167321j = null;
    }
}
