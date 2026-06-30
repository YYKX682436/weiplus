package com.tencent.mm.feature.performance;

@j95.b
/* loaded from: classes12.dex */
public final class r4 extends i95.w implements uq3.h {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.l3 f67658h = new com.tencent.mm.feature.performance.l3(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f67659i = jz5.h.b(com.tencent.mm.feature.performance.i3.f67588d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f67660m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f67661n;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67662d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f67663e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f67664f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f67665g;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f67660m = jz5.h.a(iVar, com.tencent.mm.feature.performance.k3.f67596d);
        f67661n = jz5.h.a(iVar, com.tencent.mm.feature.performance.j3.f67594d);
    }

    public r4() {
        jz5.i iVar = jz5.i.f302829d;
        this.f67662d = jz5.h.a(iVar, com.tencent.mm.feature.performance.e4.f67562d);
        this.f67663e = jz5.h.a(iVar, com.tencent.mm.feature.performance.f4.f67574d);
        this.f67664f = jz5.h.a(iVar, com.tencent.mm.feature.performance.g4.f67577d);
        this.f67665g = jz5.h.a(iVar, com.tencent.mm.feature.performance.h4.f67586d);
    }

    public long Ai() {
        dr0.t tVar = dr0.t0.f242539j;
        java.util.List<java.lang.Long> accKernelStartUpCostList = dr0.t0.f242540k.i().getAccKernelStartUpCostList();
        if (accKernelStartUpCostList.isEmpty()) {
            return 0L;
        }
        return a06.d.c(kz5.n0.M(accKernelStartUpCostList));
    }

    public java.lang.String Bi() {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192975c) {
            return "[args] " + Di() + '\n';
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.feature.performance.c4 c4Var = com.tencent.mm.feature.performance.c4.f67542a;
        com.tencent.mm.feature.performance.d4 d4Var = com.tencent.mm.feature.performance.d4.f67555a;
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni = Ni(PROCESS_MAIN);
        long accFgMs = Ni != null ? Ni.getAccFgMs() : 0L;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni2 = Ni(PROCESS_MAIN);
        long accBgMs = Ni2 != null ? Ni2.getAccBgMs() : 0L;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni3 = Ni(PROCESS_MAIN);
        long accExitDuringMs = Ni3 != null ? Ni3.getAccExitDuringMs() : 0L;
        java.lang.String PROCESS_PUSH = com.tencent.mm.sdk.platformtools.w9.f193054b;
        kotlin.jvm.internal.o.f(PROCESS_PUSH, "PROCESS_PUSH");
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni4 = Ni(PROCESS_PUSH);
        long accFgMs2 = Ni4 != null ? Ni4.getAccFgMs() : 0L;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni5 = Ni(PROCESS_PUSH);
        long accBgMs2 = Ni5 != null ? Ni5.getAccBgMs() : 0L;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni6 = Ni(PROCESS_PUSH);
        long accExitDuringMs2 = Ni6 != null ? Ni6.getAccExitDuringMs() : 0L;
        ((dr0.m) ((lh.k) i95.n0.c(lh.k.class))).getClass();
        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("battery-accstats-lastreportms", 0L);
        if (j17 > 0) {
            sb6.append("\n[reportLast] ");
            sb6.append((java.lang.String) d4Var.apply(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17)));
            sb6.append(" ago\n");
        }
        java.lang.String format = java.lang.String.format("[args] %s\n", java.util.Arrays.copyOf(new java.lang.Object[]{Di()}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        java.lang.String format2 = java.lang.String.format("[main] %s, %s, %s\n", java.util.Arrays.copyOf(new java.lang.Object[]{d4Var.apply(java.lang.Long.valueOf(accFgMs)), d4Var.apply(java.lang.Long.valueOf(accBgMs)), d4Var.apply(java.lang.Long.valueOf(accExitDuringMs))}, 3));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb6.append(format2);
        java.lang.String format3 = java.lang.String.format("[push] %s, %s, %s\n", java.util.Arrays.copyOf(new java.lang.Object[]{d4Var.apply(java.lang.Long.valueOf(accFgMs2)), d4Var.apply(java.lang.Long.valueOf(accBgMs2)), d4Var.apply(java.lang.Long.valueOf(accExitDuringMs2))}, 3));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        sb6.append(format3);
        java.lang.Object[] objArr = new java.lang.Object[3];
        dr0.t0 t0Var = dr0.t0.f242540k;
        objArr[0] = d4Var.apply(java.lang.Long.valueOf(t0Var.i().getAccDeadDuringMs()));
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats i17 = t0Var.i();
        objArr[1] = i17 != null ? java.lang.Long.valueOf(i17.getAccDeadCount()) : null;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats i18 = t0Var.i();
        objArr[2] = i18 != null ? java.lang.Long.valueOf(i18.getAccContinuousRecycleCount()) : null;
        java.lang.String format4 = java.lang.String.format("[dead] %s, %s-%s\n", java.util.Arrays.copyOf(objArr, 3));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        sb6.append(format4);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", "mainFgMs=" + accFgMs + ", mainBgMs=" + accBgMs + ", mainExitDuringMs=" + accExitDuringMs);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", "pushFgMs=" + accFgMs2 + ", pushBgMs=" + accBgMs2 + ", pushExitDuringMs=" + accExitDuringMs2);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("deadMs=");
        sb7.append(t0Var.i().getAccDeadDuringMs());
        sb7.append(", deadCount=");
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats i19 = t0Var.i();
        sb7.append(i19 != null ? java.lang.Long.valueOf(i19.getAccDeadCount()) : null);
        sb7.append(", continuousCount=");
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats i27 = t0Var.i();
        sb7.append(i27 != null ? java.lang.Long.valueOf(i27.getAccContinuousRecycleCount()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", sb7.toString());
        ph.a.b(uh.h.class, new com.tencent.mm.feature.performance.b4(sb6, c4Var, d4Var));
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Di() {
        /*
            r23 = this;
            dr0.w1 r0 = dr0.a3.f242403d
            dr0.a3 r1 = r0.a()
            boolean r1 = r1.k()
            dr0.a3 r2 = r0.a()
            boolean r2 = r2.m()
            boolean r3 = com.tencent.mm.booter.u2.a()
            dr0.a3 r4 = r0.a()
            r4.getClass()
            mm.k r4 = mm.k.I
            r5 = 0
            r6 = 1
            long r7 = mm.k.l(r4, r5, r6, r5)
            dr0.a3 r4 = r0.a()
            r4.getClass()
            mm.k r4 = mm.k.f328496J
            long r9 = mm.k.l(r4, r5, r6, r5)
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.w9.f193053a
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats r4 = er0.f0.b(r4)
            java.lang.String r11 = com.tencent.mm.sdk.platformtools.w9.f193054b
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats r11 = er0.f0.b(r11)
            if (r4 == 0) goto L45
            long r14 = r4.getAccStartsCount()
            goto L47
        L45:
            r14 = 0
        L47:
            if (r11 == 0) goto L50
            long r16 = r11.getAccStartsCount()
            r12 = r16
            goto L52
        L50:
            r12 = 0
        L52:
            dr0.a3 r11 = r0.a()
            int r11 = r11.e()
            dr0.a3 r18 = r0.a()
            boolean r19 = r18.k()
            if (r19 == 0) goto L76
            r19 = r11
            mm.k r11 = mm.k.E
            boolean r11 = mm.k.j(r11, r5, r6, r5)
            if (r11 == 0) goto L78
            int r11 = r18.i()
            if (r11 <= 0) goto L78
            r11 = r6
            goto L79
        L76:
            r19 = r11
        L78:
            r11 = -1
        L79:
            dr0.a3 r18 = r0.a()
            int r5 = r18.f()
            dr0.a3 r18 = r0.a()
            r18.getClass()
            r18 = r5
            mm.k r5 = mm.k.H
            r20 = r11
            r11 = 0
            long r5 = mm.k.l(r5, r11, r6, r11)
            dr0.a3 r11 = r0.a()
            int r11 = r11.n()
            dr0.a3 r0 = r0.a()
            r0.getClass()
            if (r4 == 0) goto Lab
            long r16 = r4.getAccDeadCount()
            r21 = r16
            goto Lad
        Lab:
            r21 = 0
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            r2 = 32
            r0.append(r2)
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r14)
            r0.append(r1)
            r0.append(r12)
            r0.append(r2)
            r2 = r19
            r0.append(r2)
            r0.append(r1)
            r2 = r20
            r0.append(r2)
            r0.append(r1)
            r2 = r18
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            r1 = 64
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = "@0@"
            r0.append(r1)
            r1 = r21
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.r4.Di():java.lang.String");
    }

    public final com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats Ni(java.lang.String procName) {
        kotlin.jvm.internal.o.g(procName, "procName");
        dr0.t tVar = dr0.t0.f242539j;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats l17 = dr0.t0.f242540k.l(procName);
        if (l17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accStats not found: ");
            sb6.append(procName);
            sb6.append(", keys=");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("acc-proc-life-stats.bin");
            sb6.append(java.util.Arrays.toString(M != null ? M.b() : null));
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", sb6.toString());
        }
        return l17;
    }

    public boolean Ri() {
        return dr0.a3.f242403d.a().o();
    }

    public boolean Ui() {
        long j17;
        if (!dr0.a3.f242403d.a().o()) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            dr0.p1 a17 = dr0.p1.f242489d.a();
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            if (a17.j(PROCESS_MAIN)) {
                com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.d0.f(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCVoid(), dr0.z0.class);
                if (iPCLong != null) {
                    j17 = iPCLong.f68405d;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "ipc GetLastMainPidInitMillisTask failed");
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "main proc not exist");
            }
            return true;
        }
        j17 = dr0.t0.f242540k.f242544d;
        if (java.lang.System.currentTimeMillis() - j17 >= 60000) {
            return false;
        }
        return true;
    }

    public android.graphics.Bitmap Vi(java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
            sb6.append("wcf://avatar/");
            com.tencent.mm.modelavatar.z.g(sb6, username, false);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(a17.toString(), 156, 156);
                return i17 > 0 ? com.tencent.mm.sdk.platformtools.x.s0(L, false, i17) : L;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.proc.FeatureService", "loadAvatar err: " + th6);
        }
        return null;
    }

    public void Zi(java.lang.String action) {
        kotlin.jvm.internal.o.g(action, "action");
        dr0.p1 a17 = dr0.p1.f242489d.a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "#pullUpProc: ".concat(action));
        synchronized (((java.util.List) a17.f242492b.getValue())) {
            ((java.util.List) a17.f242492b.getValue()).add(action);
        }
        dr0.a3.f242403d.a().d("pull-".concat(action));
        ((ku5.t0) ku5.t0.f312615d).g(new dr0.k1(action));
    }

    public uq3.g aj(java.lang.String name, uq3.f fVar) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.feature.performance.p4 p4Var = new com.tencent.mm.feature.performance.p4(name);
        if (fVar != null) {
            jz5.g gVar = f67661n;
            synchronized (((java.util.Map) gVar.getValue())) {
                ((java.util.Map) gVar.getValue()).put(name, fVar);
            }
        }
        return p4Var;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.i().c(new com.tencent.mm.feature.performance.j4(context));
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.thumbplayer.config.TPPlayerConfig.enableStackTrace = true;
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.feature.performance.k4(this));
        com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.feature.performance.l4(this));
        gi.w0.f272203z = new com.tencent.mm.feature.performance.n4(this);
    }

    public void wi() {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> trackingMap = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.getTrackingMap();
        kotlin.jvm.internal.o.f(trackingMap, "getTrackingMap(...)");
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(kz5.c1.s(trackingMap).entrySet(), new com.tencent.mm.feature.performance.v3());
        int d17 = kz5.b1.d(kz5.d0.q(F0, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : F0) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "leakInspect dumpThumbPlayers: " + linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Integer num = (java.lang.Integer) entry2.getKey();
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker tPThumbPlayerTracker = (com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker) entry2.getValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" - leakInspect tp@");
            sb6.append(num);
            sb6.append(": from=");
            long longValue = java.lang.Long.valueOf(tPThumbPlayerTracker.trackMs).longValue();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
            sb6.append(new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.getDefault()).format(new java.util.Date(longValue)));
            sb6.append(", scene=");
            sb6.append(tPThumbPlayerTracker.scene);
            sb6.append(", stack=\n");
            sb6.append(tPThumbPlayerTracker.stack);
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
        }
    }
}
