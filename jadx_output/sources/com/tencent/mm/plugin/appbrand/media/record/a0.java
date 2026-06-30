package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class a0 {

    /* renamed from: u, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.media.record.a0 f85777u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.Object f85778v;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f85782d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f85785g;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f85793o;

    /* renamed from: a, reason: collision with root package name */
    public lh1.c f85779a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85780b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f85781c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.z f85783e = com.tencent.mm.plugin.appbrand.media.record.z.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public kh1.e f85784f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f85786h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f85787i = 0;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f85788j = null;

    /* renamed from: k, reason: collision with root package name */
    public long f85789k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f85790l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f85791m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f85792n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f85794p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f85795q = false;

    /* renamed from: r, reason: collision with root package name */
    public final lh1.b f85796r = new com.tencent.mm.plugin.appbrand.media.record.r(this);

    /* renamed from: s, reason: collision with root package name */
    public final kh1.d f85797s = new com.tencent.mm.plugin.appbrand.media.record.s(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.record.k f85798t = new com.tencent.mm.plugin.appbrand.media.record.p(this);

    static {
        com.tencent.mm.plugin.appbrand.media.record.o0.f85832a = new com.tencent.mm.plugin.appbrand.media.record.q();
        f85778v = new java.lang.Object();
    }

    public static void c(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        com.tencent.mm.plugin.appbrand.media.record.l lVar;
        a0Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "_start in runnable");
            if (!a0Var.f()) {
                a0Var.h(2);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "init encoder fail");
                return;
            }
            a0Var.f85786h = false;
            a0Var.f85787i = 0;
            if (!a0Var.f85794p) {
                a0Var.f85794p = true;
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = a0Var.f85782d;
                if (recordParam != null && (lVar = recordParam.f85846r) != null) {
                    ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).f85812a = a0Var.f85798t;
                    ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).b();
                }
            }
            if (!a0Var.l()) {
                a0Var.h(6);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "start record fail");
                return;
            }
            kh1.e eVar = a0Var.f85784f;
            tl.w wVar = a0Var.f85779a.f318651a;
            eVar.c(wVar != null ? wVar.c() : 0);
            a0Var.f85784f.b(a0Var.f85782d.f85842n);
            a0Var.f85791m = 0;
            a0Var.f85789k = a0Var.f85782d.f85835d;
            a0Var.f85792n = java.lang.System.currentTimeMillis();
            long j17 = a0Var.f85789k;
            a0Var.f85790l = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a0Var.f85792n));
            a0Var.e().post(new com.tencent.mm.plugin.appbrand.media.record.y(a0Var));
            a0Var.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "_start", new java.lang.Object[0]);
            a0Var.h(4);
        }
    }

    public static void d(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        a0Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "_resume in runnable");
            if (a0Var.f85784f == null) {
                a0Var.h(3);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            } else if (a0Var.f85790l <= 0) {
                a0Var.b();
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail, record time reach max time, to stop record");
            } else if (a0Var.l()) {
                a0Var.f85792n = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, currentTime:%d", java.lang.Long.valueOf(a0Var.f85790l), java.lang.Long.valueOf(a0Var.f85792n));
                a0Var.e().post(new com.tencent.mm.plugin.appbrand.media.record.m(a0Var));
                a0Var.j();
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "resume record success");
            } else {
                a0Var.h(7);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "_resume", new java.lang.Object[0]);
            a0Var.h(5);
        }
    }

    public static com.tencent.mm.plugin.appbrand.media.record.a0 g() {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var;
        synchronized (f85778v) {
            if (f85777u == null) {
                f85777u = new com.tencent.mm.plugin.appbrand.media.record.a0();
            }
            a0Var = f85777u;
        }
        return a0Var;
    }

    public void a() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.media.record.l lVar;
        com.tencent.mm.plugin.appbrand.media.record.z zVar = com.tencent.mm.plugin.appbrand.media.record.z.PAUSE;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "pause record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "_pause", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f85783e == zVar) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "is paused, don't pause again");
            return;
        }
        lh1.c cVar = this.f85779a;
        if (cVar != null) {
            z17 = cVar.a();
            this.f85779a = null;
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        if (recordParam != null && (lVar = recordParam.f85846r) != null) {
            boolean a17 = ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).a();
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "isInterrupted:%b, interrupted:%b", java.lang.Boolean.valueOf(this.f85795q), java.lang.Boolean.valueOf(a17));
            if (a17 && !this.f85795q) {
                i();
            }
        }
        e().post(new com.tencent.mm.plugin.appbrand.media.record.n(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f85792n;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f85791m));
        int i17 = (int) (this.f85791m + j17);
        this.f85791m = i17;
        long j18 = this.f85789k - i17;
        this.f85790l = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f85791m));
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            h(8);
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "pause record fail");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onPause");
        this.f85783e = zVar;
        this.f85780b = false;
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 3;
        unVar.f8110c = "pause";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam2 = this.f85782d;
        if (recordParam2 != null) {
            unVar.f8117j = recordParam2.f85844p;
        }
        operateRecordEvent.b(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "pause record success");
    }

    public final void b() {
        boolean z17;
        long j17;
        com.tencent.mm.plugin.appbrand.media.record.z zVar = com.tencent.mm.plugin.appbrand.media.record.z.STOP;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "stop record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f85783e == zVar) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "is stopped, don't stop again");
            return;
        }
        lh1.c cVar = this.f85779a;
        if (cVar != null) {
            z17 = cVar.a();
            this.f85779a = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        this.f85786h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(this.f85787i));
        kh1.e eVar = this.f85784f;
        if (eVar != null) {
            eVar.flush();
            this.f85784f.close();
            this.f85784f = null;
        }
        e().post(new com.tencent.mm.plugin.appbrand.media.record.o(this));
        if (this.f85783e == com.tencent.mm.plugin.appbrand.media.record.z.PAUSE) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f85792n;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f85791m));
            int i17 = (int) (this.f85791m + currentTimeMillis2);
            this.f85791m = i17;
            long j18 = this.f85789k - i17;
            this.f85790l = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f85791m));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onStop");
            this.f85783e = zVar;
            this.f85780b = false;
            com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
            am.un unVar = operateRecordEvent.f54601g;
            unVar.f8108a = 2;
            unVar.f8110c = "stop";
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
            if (recordParam != null) {
                unVar.f8117j = recordParam.f85844p;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d, mRealRecordedTime%d", java.lang.Integer.valueOf(this.f85787i), java.lang.Integer.valueOf(this.f85791m));
            unVar.f8109b = java.lang.Math.min(this.f85787i, this.f85791m);
            java.lang.String str = this.f85785g;
            unVar.f8111d = str;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordUtil", "exist audio file");
                j17 = r6Var.C();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordUtil", "audio file not exit, path:%s", str);
                j17 = -1;
            }
            unVar.f8112e = (int) j17;
            operateRecordEvent.b(android.os.Looper.getMainLooper());
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "stop record success");
        } else {
            h(9);
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "stop record fail");
        }
        this.f85782d = null;
        java.lang.Long l17 = com.tencent.mm.plugin.appbrand.media.record.j.f85817a;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis3 - com.tencent.mm.plugin.appbrand.media.record.j.f85819c <= com.tencent.mm.plugin.appbrand.media.record.j.f85818b.longValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "start clean audio record file");
        com.tencent.mm.plugin.appbrand.media.record.j.f85819c = currentTimeMillis3;
        s75.d.b(new com.tencent.mm.plugin.appbrand.media.record.i(), "AudioRecordCacheClean");
    }

    public final com.tencent.mm.sdk.platformtools.n3 e() {
        if (this.f85793o == null) {
            this.f85793o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        return this.f85793o;
    }

    public final boolean f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "initEncode");
        kh1.e eVar = this.f85784f;
        if (eVar != null) {
            eVar.close();
            this.f85784f = null;
        }
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        java.lang.String str = recordParam.f85839h;
        java.lang.String str2 = recordParam.f85840i;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D(), "AudioRecord");
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audio");
        java.lang.String str3 = "";
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a("" + str2));
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
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.n();
        java.lang.String o17 = r6Var2.o();
        this.f85785g = o17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mFilePath:%s", o17);
        if ("opus".equalsIgnoreCase(this.f85782d.f85839h)) {
            this.f85784f = new com.tencent.mm.plugin.appbrand.media.record.j0();
        } else {
            this.f85784f = kh1.b.a(this.f85782d.f85839h);
        }
        boolean z17 = false;
        if (this.f85784f != null) {
            boolean b17 = com.tencent.mm.plugin.appbrand.media.record.d0.b(this.f85785g);
            if (!b17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "prepare cache file fail");
                return b17;
            }
            try {
                kh1.e eVar2 = this.f85784f;
                java.lang.String str4 = this.f85785g;
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam2 = this.f85782d;
                z17 = eVar2.init(str4, recordParam2.f85836e, recordParam2.f85837f, recordParam2.f85838g);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "init encoder fail", new java.lang.Object[0]);
            }
            this.f85784f.a(this.f85797s);
        }
        return z17;
    }

    public void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.media.record.z zVar = this.f85783e;
        com.tencent.mm.plugin.appbrand.media.record.z zVar2 = com.tencent.mm.plugin.appbrand.media.record.z.ERROR;
        if (zVar != zVar2) {
            com.tencent.mm.plugin.appbrand.media.record.o0.b(i17);
        }
        this.f85783e = zVar2;
        this.f85780b = false;
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 4;
        unVar.f8110c = "error";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        unVar.f8115h = i17;
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
        unVar.f8116i = sb6.toString();
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }

    public void i() {
        this.f85795q = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionBegin");
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 6;
        unVar.f8110c = "interruptionBegin";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onResume");
        this.f85783e = com.tencent.mm.plugin.appbrand.media.record.z.RESUME;
        this.f85780b = true;
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 1;
        unVar.f8110c = "resume";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }

    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onStart");
        this.f85783e = com.tencent.mm.plugin.appbrand.media.record.z.START;
        this.f85780b = true;
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 0;
        unVar.f8110c = "start";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }

    public final boolean l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "startRecordInternal");
        lh1.c cVar = this.f85779a;
        if (cVar != null) {
            cVar.a();
            this.f85779a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
        }
        if (this.f85779a == null) {
            lh1.c cVar2 = new lh1.c(this.f85782d);
            this.f85779a = cVar2;
            cVar2.f318656f = this.f85796r;
        }
        lh1.c cVar3 = this.f85779a;
        cVar3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        tl.w wVar = cVar3.f318651a;
        if (wVar != null) {
            wVar.l();
            cVar3.f318651a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        cVar3.f318655e = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecorder", "start time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        cVar3.f318651a = new tl.w(cVar3.f318653c, cVar3.f318654d, cVar3.f318657g);
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = cVar3.f318652b;
        if ("mp3".equalsIgnoreCase(recordParam.f85839h)) {
            cVar3.f318651a.g(40);
        } else {
            cVar3.f318651a.g(20);
        }
        cVar3.f318651a.i(false);
        tl.w wVar2 = cVar3.f318651a;
        wVar2.f420172y = cVar3.f318658h;
        wVar2.e(recordParam.f85845q.f85806d);
        boolean k17 = cVar3.f318651a.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public boolean m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        if (this.f85779a == null && this.f85784f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
            return false;
        }
        s75.d.b(new com.tencent.mm.plugin.appbrand.media.record.x(this), "app_brand_stop_record");
        return true;
    }

    public final void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "stopTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f85788j;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f85788j = null;
    }
}
