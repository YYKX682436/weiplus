package ga3;

/* loaded from: classes15.dex */
public class v {
    public static ga3.v A;
    public static final java.lang.Object B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c f351411d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351414g;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f351418k;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f351427t;

    /* renamed from: a, reason: collision with root package name */
    public ga3.e f351408a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351409b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f351410c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public ga3.u f351412e = ga3.u.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public kh1.e f351413f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f351415h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f351416i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f351417j = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f351419l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f351420m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f351421n = 1;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f351422o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f351423p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f351424q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f351425r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f351426s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f351428u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f351429v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f351430w = false;

    /* renamed from: x, reason: collision with root package name */
    public final ga3.d f351431x = new ga3.m(this);

    /* renamed from: y, reason: collision with root package name */
    public final kh1.d f351432y = new ga3.n(this);

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k f351433z = new ga3.k(this);

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.f167365a = new ga3.l();
        B = new java.lang.Object();
    }

    public static void c(ga3.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l lVar;
        vVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager _start in runnable");
            vVar.f351418k = "";
            if (!vVar.f()) {
                vVar.h(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "init encoder fail");
                vVar.f351418k = "init encoder fail";
                return;
            }
            vVar.f351415h = false;
            vVar.f351416i = 0;
            if (!vVar.f351428u) {
                vVar.f351428u = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = vVar.f351411d;
                if (c12420xb1146e9c != null && (lVar = c12420xb1146e9c.f167379r) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).f167345a = vVar.f351433z;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).b();
                }
            }
            if (!vVar.j()) {
                vVar.h(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "start record fail");
                return;
            }
            kh1.e eVar = vVar.f351413f;
            tl.w wVar = vVar.f351408a.f351377a;
            eVar.c(wVar != null ? wVar.c() : 0);
            vVar.f351413f.b(vVar.f351411d.f167375n);
            vVar.f351425r = 0;
            vVar.f351423p = vVar.f351411d.f167368d;
            vVar.f351426s = java.lang.System.currentTimeMillis();
            long j17 = vVar.f351423p;
            vVar.f351424q = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(vVar.f351426s));
            vVar.e().mo50293x3498a0(new ga3.g(vVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onStart");
            vVar.f351412e = ga3.u.START;
            vVar.f351409b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppRecordMgr", e17, "_start", new java.lang.Object[0]);
            vVar.h(4);
        }
    }

    public static void d(ga3.v vVar) {
        vVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "_resume in runnable");
            vVar.f351418k = "";
            if (vVar.f351413f == null) {
                vVar.h(3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail, mAudioEncoder is null");
                vVar.f351418k = "resume record fail, mAudioEncoder is null";
            } else if (vVar.f351424q <= 0) {
                vVar.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail, record time reach max time, to stop record");
                vVar.f351418k = "resume record fail, record time reach max time, to stop record";
            } else if (vVar.j()) {
                vVar.f351426s = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, currentTime:%d", java.lang.Long.valueOf(vVar.f351424q), java.lang.Long.valueOf(vVar.f351426s));
                vVar.e().mo50293x3498a0(new ga3.h(vVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onResume");
                vVar.f351412e = ga3.u.RESUME;
                vVar.f351409b = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "resume record success");
            } else {
                vVar.h(7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppRecordMgr", e17, "_resume", new java.lang.Object[0]);
            vVar.h(5);
        }
    }

    public static ga3.v g() {
        ga3.v vVar;
        synchronized (B) {
            if (A == null) {
                A = new ga3.v();
            }
            vVar = A;
        }
        return vVar;
    }

    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l lVar;
        ga3.u uVar = ga3.u.PAUSE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "pause record in runnable");
        this.f351418k = "";
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppRecordMgr", e17, "_pause", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f351412e == uVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "recorder is paused, don't pause again");
            this.f351418k = "recorder is paused, don't pause again";
            return;
        }
        ga3.e eVar = this.f351408a;
        if (eVar != null) {
            z17 = eVar.a();
            this.f351408a = null;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = this.f351411d;
        if (c12420xb1146e9c != null && (lVar = c12420xb1146e9c.f167379r) != null) {
            boolean a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar).a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "isInterrupted:%b, interrupted:%b", java.lang.Boolean.valueOf(this.f351429v), java.lang.Boolean.valueOf(a17));
            if (a17 && !this.f351429v) {
                this.f351429v = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionBegin");
            }
        }
        e().mo50293x3498a0(new ga3.i(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f351426s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f351425r));
        int i17 = (int) (this.f351425r + j17);
        this.f351425r = i17;
        long j18 = this.f351423p - i17;
        this.f351424q = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f351425r));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            h(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "pause record fail");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onPause");
            this.f351412e = uVar;
            this.f351409b = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "pause record success");
        }
    }

    public final void b() {
        boolean z17;
        ga3.u uVar = ga3.u.STOP;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "stop record in runnable");
        this.f351418k = "";
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f351412e == uVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "recorder is stopped, don't stop again");
            this.f351418k = "recorder is stopped, don't stop again";
            return;
        }
        ga3.e eVar = this.f351408a;
        if (eVar != null) {
            z17 = eVar.a();
            this.f351408a = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        this.f351415h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(this.f351416i));
        kh1.e eVar2 = this.f351413f;
        if (eVar2 != null) {
            eVar2.mo51971x5d03b04();
            this.f351413f.mo51970x5a5ddf8();
            this.f351413f = null;
        }
        e().mo50293x3498a0(new ga3.j(this));
        if (this.f351412e == ga3.u.PAUSE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f351426s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f351425r));
            int i17 = (int) (this.f351425r + currentTimeMillis2);
            this.f351425r = i17;
            long j17 = this.f351423p - i17;
            this.f351424q = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f351425r));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onStop");
            this.f351412e = uVar;
            this.f351409b = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "stop record success");
        } else {
            h(9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "stop record fail");
        }
        java.lang.String str = this.f351411d.f167377p;
        java.lang.Long l17 = ga3.b.f351372a;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis3 - ga3.b.f351374c <= ga3.b.f351373b.longValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "start clean audio record file");
            ga3.b.f351374c = currentTimeMillis3;
            ((ku5.t0) ku5.t0.f394148d).h(new ga3.a(str), "LiteAppRecorderCacheClean");
        }
        this.f351411d = null;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e() {
        if (this.f351427t == null) {
            this.f351427t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        return this.f351427t;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga3.v.f():boolean");
    }

    public void h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        ga3.u uVar = this.f351412e;
        ga3.u uVar2 = ga3.u.ERROR;
        if (uVar != uVar2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.b(i17);
        }
        this.f351412e = uVar2;
        this.f351409b = false;
    }

    public java.lang.String i(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
            jSONObject.put("error", str2);
            jSONObject.put("isNoisy", z17);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "startRecordInternal");
        ga3.e eVar = this.f351408a;
        if (eVar != null) {
            eVar.a();
            this.f351408a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "mRecorder is not null, stop it");
        }
        if (this.f351408a == null) {
            this.f351420m = 0;
            this.f351421n = 1;
            ga3.e eVar2 = new ga3.e(this.f351411d);
            this.f351408a = eVar2;
            eVar2.f351382f = this.f351431x;
        }
        ga3.e eVar3 = this.f351408a;
        eVar3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorder", "LiteApp startRecord");
        tl.w wVar = eVar3.f351377a;
        if (wVar != null) {
            wVar.l();
            eVar3.f351377a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        eVar3.f351381e = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorder", "LiteApp start record time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        eVar3.f351377a = new tl.w(eVar3.f351379c, eVar3.f351380d, eVar3.f351383g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = eVar3.f351378b;
        if ("mp3".equalsIgnoreCase(c12420xb1146e9c.f167372h)) {
            eVar3.f351377a.g(40);
        } else {
            eVar3.f351377a.g(20);
        }
        eVar3.f351377a.i(false);
        tl.w wVar2 = eVar3.f351377a;
        wVar2.f501705y = eVar3.f351384h;
        wVar2.e(c12420xb1146e9c.f167378q.f167339d);
        boolean k17 = eVar3.f351377a.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public java.lang.String k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        boolean z17 = false;
        if (this.f351408a == null && this.f351413f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
            return i("", "mRecord is null and mAudioEncoder is null, stop fail", false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ga3.t tVar = new ga3.t(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        try {
            t0Var.l(tVar, 0L, "lite_app_stop_record").get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
        int i17 = this.f351419l;
        if (i17 != 0 && this.f351420m >= i17) {
            this.f351420m = 0;
            z17 = true;
            this.f351421n = 1;
        }
        return i(this.f351414g, this.f351418k, z17);
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager stopTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f351422o;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f351422o = null;
    }
}
