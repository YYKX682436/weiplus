package dr0;

/* loaded from: classes12.dex */
public final class t0 extends lh.i {

    /* renamed from: j, reason: collision with root package name */
    public static final dr0.t f324072j = new dr0.t(null);

    /* renamed from: k, reason: collision with root package name */
    public static final dr0.t0 f324073k = new dr0.t0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f324074a;

    /* renamed from: b, reason: collision with root package name */
    public int f324075b;

    /* renamed from: c, reason: collision with root package name */
    public int f324076c;

    /* renamed from: d, reason: collision with root package name */
    public long f324077d;

    /* renamed from: e, reason: collision with root package name */
    public long f324078e;

    /* renamed from: g, reason: collision with root package name */
    public long f324080g;

    /* renamed from: h, reason: collision with root package name */
    public long f324081h;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f324079f = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f324082i = jz5.h.a(jz5.i.f384362d, dr0.u.f324090d);

    public static final java.lang.String g(dr0.t0 t0Var, long j17) {
        t0Var.getClass();
        java.lang.String format = new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.ENGLISH).format(new java.util.Date(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    @Override // lh.i, lh.j
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#onClear");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#clear");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            i().m46665x4e67d78b();
        }
        i().m40828x5a5b64d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("battery-accproclife-clear-last-ms", java.lang.System.currentTimeMillis());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#deleteSaved");
            er0.f0.a().d();
            aq1.q0 q0Var = (aq1.q0) ((a25.q) i95.n0.c(a25.q.class));
            q0Var.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new aq1.h0(q0Var));
        }
    }

    @Override // lh.i, lh.j
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#onFlushing: " + z17);
        if (z17) {
            h();
            return;
        }
        dr0.q3 q3Var = dr0.q3.f324036g;
        q3Var.h();
        dr0.q3.j(q3Var, 600000L, null, 2, null);
        ((ku5.t0) ku5.t0.f394148d).g(dr0.v.f324096d);
    }

    @Override // lh.i, lh.j
    public void c(long j17) {
        java.lang.String[] strArr;
        int i17;
        long j18;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "reportAccProcLife at main proc only");
            return;
        }
        dr0.a3.f323936d.a().getClass();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
            dr0.p1 a17 = dr0.p1.f324022d.a();
            java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            for (android.app.ApplicationExitInfo applicationExitInfo : a17.d(PROCESS_MAIN)) {
                if (applicationExitInfo.getTimestamp() >= currentTimeMillis) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "today main exit info: " + applicationExitInfo);
                }
            }
            dr0.p1 a18 = dr0.p1.f324022d.a();
            java.lang.String PROCESS_PUSH = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_PUSH, "PROCESS_PUSH");
            for (android.app.ApplicationExitInfo applicationExitInfo2 : a18.d(PROCESS_PUSH)) {
                if (applicationExitInfo2.getTimestamp() >= currentTimeMillis) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "today push exit info: " + applicationExitInfo2);
                }
            }
        }
        if (!mm.o.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "report abort: report=" + mm.o.g());
            return;
        }
        dr0.p1 a19 = dr0.p1.f324022d.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        a19.getClass();
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(context)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "ipc flushing stats: " + ((java.lang.String) dVar.f404626b));
            java.lang.Object second = dVar.f404626b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            java.lang.String str = (java.lang.String) second;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, bm5.f1.a())) {
                h();
            } else {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), dr0.y0.class);
            }
        }
        long j19 = j17 / 3600000;
        long j27 = 1 < j19 ? j19 : 1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#report, periodHr=" + j27);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.util.HashMap hashMap5 = new java.util.HashMap();
        java.util.HashMap hashMap6 = new java.util.HashMap();
        java.lang.String[] b17 = er0.f0.a().b();
        if (b17 != null) {
            int length = b17.length;
            boolean z17 = false;
            int i18 = 0;
            while (i18 < length) {
                java.lang.String str2 = b17[i18];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                if (r26.i0.y(str2, "acc-proc-life-stats-", z17)) {
                    java.lang.String substring = str2.substring(r26.n0.L(str2, "acc-proc-life-stats-", 0, false, 6, null) + 20);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    if (!android.text.TextUtils.isEmpty(substring)) {
                        strArr = b17;
                        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e a27 = mh.k.f407804a.a(str2, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c.class, "acc-proc-life-stats.bin");
                        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = a27 instanceof com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c ? (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c) a27 : null;
                        if (c10875xc0cf956c != null) {
                            long accBgMs = c10875xc0cf956c.getAccBgMs();
                            i17 = length;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportBgMs: proc=" + substring + ", ms=" + accBgMs);
                            long accFgMs = c10875xc0cf956c.getAccFgMs();
                            j18 = j27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportFgMs: proc=" + substring + ", ms=" + accFgMs);
                            long accStartsCount = c10875xc0cf956c.getAccStartsCount();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportStartsCount: proc=" + substring + ", count=" + accStartsCount);
                            long accExitCount = c10875xc0cf956c.getAccExitCount();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportExitCount: proc=" + substring + ", count=" + accExitCount);
                            long accExitDuringMs = c10875xc0cf956c.getAccExitDuringMs();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportExitDuringMs: proc=" + substring + ", ms=" + accExitDuringMs);
                            if (!c10875xc0cf956c.m46703x7c978af6().isEmpty()) {
                                java.util.Iterator it6 = ((java.util.LinkedHashMap) wh.m.B(c10875xc0cf956c.m46703x7c978af6(), dr0.k0.f323986d)).entrySet().iterator();
                                if (it6.hasNext()) {
                                    java.lang.String str3 = (java.lang.String) ((java.util.Map.Entry) it6.next()).getKey();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#reportExitType: proc=" + substring + ", type=" + str3);
                                    hashMap6.put(substring, str3);
                                }
                            }
                            i18++;
                            b17 = strArr;
                            length = i17;
                            j27 = j18;
                            z17 = false;
                        }
                        i17 = length;
                        j18 = j27;
                        i18++;
                        b17 = strArr;
                        length = i17;
                        j27 = j18;
                        z17 = false;
                    }
                }
                strArr = b17;
                i17 = length;
                j18 = j27;
                i18++;
                b17 = strArr;
                length = i17;
                j27 = j18;
                z17 = false;
            }
        }
        long j28 = j27;
        if (!((!hashMap.isEmpty()) && (!hashMap2.isEmpty())) && j28 <= 1) {
            return;
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c i19 = i();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("ver", 1);
        dr0.s0 s0Var = new dr0.s0(currentTimeMillis2 - j17, linkedHashMap, j28, i19, this, j17, currentTimeMillis2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i19, "<this>");
        i19.m40834x32c52b(new mh.a(s0Var, i19));
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getKey();
            linkedHashMap.put("bg-" + str4, java.lang.Long.valueOf(((java.lang.Number) entry.getValue()).longValue()));
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            linkedHashMap.put("fg-" + str5, java.lang.Long.valueOf(((java.lang.Number) entry2.getValue()).longValue()));
        }
        for (java.util.Map.Entry entry3 : hashMap3.entrySet()) {
            java.lang.String str6 = (java.lang.String) entry3.getKey();
            linkedHashMap.put("start-" + str6 + "-count", java.lang.Long.valueOf(((java.lang.Number) entry3.getValue()).longValue()));
        }
        for (java.util.Map.Entry entry4 : hashMap4.entrySet()) {
            java.lang.String str7 = (java.lang.String) entry4.getKey();
            linkedHashMap.put("exit-" + str7 + "-count", java.lang.Long.valueOf(((java.lang.Number) entry4.getValue()).longValue()));
        }
        for (java.util.Map.Entry entry5 : hashMap5.entrySet()) {
            java.lang.String str8 = (java.lang.String) entry5.getKey();
            linkedHashMap.put("exit-" + str8 + "-during", java.lang.Long.valueOf(((java.lang.Number) entry5.getValue()).longValue()));
        }
        for (java.util.Map.Entry entry6 : hashMap6.entrySet()) {
            java.lang.String str9 = (java.lang.String) entry6.getKey();
            linkedHashMap.put("exit-" + str9 + "-type", (java.lang.String) entry6.getValue());
        }
        ((dr0.m) ((lh.k) i95.n0.c(lh.k.class))).getClass();
        ap.a.a(1, "accProcLife", null, linkedHashMap, java.lang.String.valueOf(dr0.m.f323998f), java.lang.String.valueOf(hashMap.size()), java.lang.String.valueOf(hashMap2.size()));
    }

    @Override // lh.i, lh.j
    public void e() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).x1();
        }
    }

    @Override // lh.i, lh.j
    public void f(android.content.Context context) {
        int j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean a17 = f324072j.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "support " + bm5.f1.a() + ": " + a17);
        if (a17) {
            i().m46735x316510();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "load bgMs: " + i().getAccBgMs());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "load bgMs: " + i().getAccFgMs());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
                dr0.p1.f324022d.a().k(false);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("battery-accproclife-suicide-last-ms", 0L);
                if (j18 != 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("battery-accproclife-suicide-last-ms", 0L);
                    i().m46744x8e527eaa(i().getAccDeadDuringMs() + (currentTimeMillis - j18));
                    cr0.k4 k4Var = cr0.k4.f303202a;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("key_process_track_starting", false)) {
                        k4Var.a();
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new cr0.j4(currentTimeMillis, j18));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "load recycle: deadMs=" + i().getAccDeadDuringMs() + ", deadCount=" + i().getAccDeadCount() + ", continuousCount=" + i().getAccContinuousRecycleCount());
                if (gm0.j1.h()) {
                    gm0.j1.i().c(new dr0.w(this));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.proc.AccMonitor", "MMKernel was not initialized, startup cost will not be record.");
                }
                ((ku5.t0) ku5.t0.f394148d).k(dr0.x.f324103d, 60000L);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((ku5.t0) ku5.t0.f394148d).g(dr0.z.f324111d);
                dr0.p1 a18 = dr0.p1.f324022d.a();
                dr0.a0 a0Var = new dr0.a0();
                a18.getClass();
                synchronized (a18.f()) {
                    a18.f().add(a0Var);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                dr0.p1 a19 = dr0.p1.f324022d.a();
                dr0.b0 b0Var = new dr0.b0(this);
                a19.getClass();
                synchronized (a19.f()) {
                    a19.f().add(b0Var);
                }
                a25.q qVar = (a25.q) i95.n0.c(a25.q.class);
                dr0.c0 c0Var = new dr0.c0(this);
                aq1.q0 q0Var = (aq1.q0) qVar;
                q0Var.getClass();
                synchronized (q0Var.Di()) {
                    q0Var.Di().add(c0Var);
                }
            }
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) && (j17 = j()) > 0) {
                ((ku5.t0) ku5.t0.f394148d).g(new dr0.d0(j17, this));
            }
            dr0.w1 w1Var = dr0.a3.f323936d;
            dr0.a3 a27 = w1Var.a();
            a27.getClass();
            if (dr0.j2.f323973b.a()) {
                ((ku5.t0) ku5.t0.f394148d).g(new dr0.v2(a27));
            }
            if (w1Var.a().f() >= 0) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40963x40b15f2e(new dr0.e0(this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.AccMonitor", "deepBg mode is disabled: getDeepBgSuicideMin=" + w1Var.a().f());
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new dr0.f0(this));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                if (ph.t.f435816k == null) {
                    synchronized ("Matrix.battery.LifeCycle") {
                        if (ph.t.f435816k == null) {
                            throw new java.lang.IllegalStateException("Call #init() first!".toString());
                        }
                    }
                }
                ph.t tVar = ph.t.f435816k;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
                tVar.b(new dr0.j0(context));
            }
            h();
        }
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#flushing");
        dr0.q3 q3Var = dr0.q3.f324036g;
        q3Var.h();
        dr0.q3.i(q3Var, null, 1, null);
    }

    public final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c i() {
        return (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c) this.f324082i.mo141623x754a37bb();
    }

    public final int j() {
        if (this.f324077d <= 0) {
            java.lang.String str = "battery-accproclife-lastpid-" + ri.i.f();
            this.f324076c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt(str, 0);
            this.f324077d = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt(str, android.os.Process.myPid());
        }
        return this.f324076c;
    }

    public final void k() {
        long l17 = mm.k.l(mm.k.f410039p0, null, 1, null);
        if (l17 > 0) {
            long j17 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            long j18 = l17 * j17;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j19 = this.f324078e;
            if ((1 <= j19 && j19 < currentTimeMillis) && currentTimeMillis - (j19 + j18) >= 600000) {
                long j27 = currentTimeMillis - j19;
                long j28 = j27 - j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.AccMonitor", "maybe HIBERNATE: gap expected=" + (j18 / j17) + "min, actual=" + (j27 / j17) + "min, hibernate=" + (j28 / j17) + "min");
                i().m46672xe9ee6935(j28);
            }
            this.f324078e = currentTimeMillis;
            er0.f0.a().putLong("battery-accproclife-lastpid-alivets-" + android.os.Process.myPid(), currentTimeMillis);
            dr0.q3.j(dr0.q3.f324045s, j18, null, 2, null);
        }
    }

    public final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c l(java.lang.String procName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), procName)) {
            return i();
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(procName, bm5.f1.a())) {
            h();
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(procName, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), dr0.y0.class);
        }
        return er0.f0.b(procName);
    }
}
