package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class CoreService extends android.app.Service implements com.tencent.mm.network.p0, com.tencent.mm.network.w2, com.tencent.mars.comm.PlatformComm.IResetProcess, com.tencent.mars.comm.PlatformComm.IReportCrash {

    /* renamed from: v, reason: collision with root package name */
    public static com.tencent.mm.booter.l f63234v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.mars.comm.MMWakerLock[] f63235w = {null};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.network.g1 f63236d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.booter.p0 f63237e = new com.tencent.mm.booter.p0();

    /* renamed from: f, reason: collision with root package name */
    public boolean f63238f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63239g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63240h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.booter.k f63241i = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.t2 f63242m = new com.tencent.mm.booter.c(this);

    /* renamed from: n, reason: collision with root package name */
    public int f63243n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f63244o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f63245p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f63246q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f63247r = 0;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mars.comm.MMWakerLock f63248s = null;

    /* renamed from: t, reason: collision with root package name */
    public final x51.j0 f63249t = new x51.j0(180000, 3);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f63250u = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.booter.i(this), false);

    /* loaded from: classes7.dex */
    public static class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                startForeground(-1213, new android.app.Notification());
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CoreService", "set service for push exception:%s.", e17);
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    public static long c() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("msg_receive_number");
        long j17 = M.getLong("send_num", 0L) + 1;
        M.putLong("send_num", j17);
        return j17;
    }

    public static com.tencent.mars.smc.IDKey d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "idkeyPushSetupTimeReport %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(1391);
        iDKey.SetKey(i17);
        iDKey.SetValue(i18);
        return iDKey;
    }

    public static void f(int i17, java.lang.String str) {
        if (com.tencent.mm.booter.u2.a()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.network.x2.d(), (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.class);
            intent.putExtra("notify_option_type", i17);
            intent.putExtra("notify_uin", com.tencent.mm.network.x2.c().f71993n.f71902o);
            if (!android.text.TextUtils.isEmpty(str)) {
                intent.putExtra("notify_action", str);
            }
            com.tencent.mm.booter.u2.f63578a.b(context, intent, "act");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.network.x2.d(), (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.class);
        intent2.putExtra("notify_option_type", i17);
        intent2.putExtra("notify_uin", com.tencent.mm.network.x2.c().f71993n.f71902o);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent2.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        if (!android.text.TextUtils.isEmpty(str)) {
            intent2.putExtra("notify_action", str);
        }
        try {
            long c17 = c();
            intent2.putExtra("notfiy_sync_num", c17);
            intent2.putExtra("notify_from", "broadcast");
            com.tencent.mm.sdk.platformtools.x2.f193077g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "sendToNotifyReceiverWithAction: syncNum=" + c17 + ", action=" + str);
            com.tencent.mm.network.x2.d().sendBroadcast(intent2);
            intent2.setClass(com.tencent.mm.network.x2.d(), com.tencent.mm.booter.NotifyReceiver.NotifyReceiverService.class);
            intent2.putExtra("notify_from", "service");
            android.content.Intent intent3 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.service.ProcessService$MMProcessService.class);
            l85.j1.b("MicroMsg.CoreService", intent3);
            l85.h1.e(intent2, "mm", true, intent3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.f("MicroMsg.CoreService", "checker frequency limited hasDestroyed %s", e17.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[Catch: Exception -> 0x0107, TryCatch #1 {Exception -> 0x0107, blocks: (B:11:0x003d, B:13:0x004b, B:35:0x0061, B:36:0x006a, B:38:0x0070, B:40:0x0086, B:42:0x008c, B:43:0x0093, B:45:0x0102, B:46:0x0104, B:48:0x0096, B:51:0x009c, B:53:0x00a2, B:55:0x00a8, B:57:0x00b8, B:59:0x00c4, B:61:0x00d0, B:62:0x00d4, B:64:0x00d8, B:66:0x00de, B:68:0x00e4, B:70:0x00f0, B:72:0x00fc, B:74:0x0059, B:33:0x0054), top: B:10:0x003d, inners: #0 }] */
    @Override // com.tencent.mm.network.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r9, boolean r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.CoreService.a(android.content.Context, boolean, java.lang.String, java.lang.String):void");
    }

    public void b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.CoreService", "[COMPLETE EXIT]");
        com.tencent.mm.network.x2.h().e(3, 10000, "");
        com.tencent.mars.WeChatMars.onDestroy();
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onDestroy();
        }
        try {
            com.tencent.mm.booter.MMReceivers$AlarmReceiver.c(getApplicationContext());
            com.tencent.mm.booter.MMReceivers$AlarmReceiver.d(getApplicationContext());
            com.tencent.mars.comm.Alarm.resetAlarm(getApplicationContext());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CoreService", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.appenderClose();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public boolean e(int i17, int i18, java.lang.String str, int i19, byte[] bArr) {
        if (gm0.k2.c(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "fully exited, no need to notify worker");
            return false;
        }
        if (i19 == 268369921 || i19 != 138) {
        }
        if (i19 == -255) {
            i19 = 138;
        }
        boolean z17 = mm.w.f328542a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "pushNotify: func=" + i19);
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            mm.w.f328559r.accept(java.lang.Integer.valueOf(i19));
        }
        if (new com.tencent.mm.booter.m(this, 2, i19, bArr, null).b()) {
            return true;
        }
        g(i19, bArr);
        return true;
    }

    public final void g(int i17, byte[] bArr) {
        byte[] bArr2 = bArr;
        if (com.tencent.mm.booter.u2.a()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.class);
            intent.putExtra("notify_option_type", 2);
            intent.putExtra("notify_uin", com.tencent.mm.network.x2.c().f71993n.f71902o);
            intent.putExtra("notify_respType", i17);
            intent.putExtra("notify_respBuf", bArr2);
            intent.putExtra("notify_skey", com.tencent.mm.network.x2.c().f71993n.r(1));
            com.tencent.mm.booter.u2.f63578a.b(this, intent, "msg");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.class);
        intent2.putExtra("notify_option_type", 2);
        intent2.putExtra("notify_uin", this.f63236d.f71993n.f71902o);
        intent2.putExtra("notify_respType", i17);
        intent2.putExtra("notify_respBuf", bArr2);
        intent2.putExtra("notify_skey", this.f63236d.f71993n.r(1));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent2.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        try {
            long c17 = c();
            intent2.putExtra("notfiy_sync_num", c17);
            intent2.putExtra("notify_from", "broadcast");
            com.tencent.mm.sdk.platformtools.x2.f193077g = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendToNotifyReceiverWithBuffer: syncNum=");
            sb6.append(c17);
            sb6.append(", action=");
            sb6.append(intent2.getAction());
            sb6.append(", type=");
            sb6.append(i17);
            sb6.append(", bufLen=");
            byte[] bArr3 = new byte[0];
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            sb6.append(bArr2.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", sb6.toString());
            sendBroadcast(intent2);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1042L, 60L, 1L, false);
            e11.b.b(i17, c17);
            intent2.setClass(this, com.tencent.mm.booter.NotifyReceiver.NotifyReceiverService.class);
            intent2.putExtra("notify_from", "service");
            android.content.Intent intent3 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.service.ProcessService$MMProcessService.class);
            l85.j1.b("MicroMsg.CoreService", intent3);
            l85.h1.e(intent2, "mm", true, intent3);
            fVar.idkeyStat(1042L, 62L, 1L, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CoreService", "dknot sendBroadcast  failed:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        int myPid = android.os.Process.myPid();
        java.util.Objects.toString(java.lang.Thread.currentThread());
        if (myPid != this.f63244o) {
            this.f63244o = myPid;
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(99L, 147L, 1L, false);
            if (intent != null && "auto".equals(intent.getStringExtra("START_TYPE"))) {
                fVar.idkeyStat(99L, 146L, 1L, false);
            }
            int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - gm0.c2.f273171a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(d(5, elapsedRealtime));
            long j17 = elapsedRealtime;
            arrayList.add(d(j17 <= 1000 ? 10 : j17 <= 2000 ? 11 : j17 <= 3000 ? 12 : j17 <= 4000 ? 13 : j17 <= 5000 ? 14 : j17 <= 7000 ? 15 : j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? 16 : j17 <= 15000 ? 17 : j17 <= 20000 ? 18 : j17 <= 30000 ? 19 : j17 <= 40000 ? 20 : j17 <= 50000 ? 21 : j17 <= 60000 ? 22 : j17 <= u04.d.f423477c ? 23 : j17 <= 180000 ? 24 : j17 <= 300000 ? 25 : j17 <= 420000 ? 26 : j17 <= 600000 ? 27 : 28, 1));
            arrayList.add(d(0, 1));
            fVar.b(arrayList, false);
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.booter.g(this), 3000L);
        }
        return this.f63236d;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.CoreService.onCreate():void");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "onDestroy~~~ threadID:" + java.lang.Thread.currentThread());
        try {
            ((com.tencent.mm.plugin.zero.m1) ((a25.v) i95.n0.c(a25.v.class))).f188662f.c(this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CoreService", "onDestroy onDestroy() mCoreServiceLifecycleCallbacks Exception: %s", e17.getMessage());
        }
        android.util.SparseArray sparseArray = al0.h.f5727a;
        if (al0.g.f5721a > 0) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(al0.g.f5726f);
            al0.g.d();
            al0.g.f5721a = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WakeLockStatsManager", "WakeLockStatsManager is detached from process [%s]", bm5.f1.a());
        }
        super.onDestroy();
        b();
        com.tencent.mm.booter.k kVar = this.f63241i;
        if (kVar != null) {
            try {
                kVar.unRegisterBroadcasts();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CoreService", "onDestroy unRegisterBroadcasts() Exception = %s ", e18.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        int myPid = android.os.Process.myPid();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "onStartCommand lastpid:%d  pid:%d flags:%d startId:%d", java.lang.Integer.valueOf(this.f63243n), java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (myPid == this.f63243n) {
            return 1;
        }
        this.f63243n = myPid;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(99L, 141L, 1L, false);
        if (intent == null || !"auto".equals(intent.getStringExtra("START_TYPE"))) {
            return 1;
        }
        fVar.idkeyStat(99L, 140L, 1L, false);
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        com.tencent.mm.network.x2.g().f72184a = null;
        com.tencent.mm.network.x2.k().f72180i.getClass();
        return super.onUnbind(intent);
    }

    @Override // com.tencent.mars.comm.PlatformComm.IReportCrash
    public void reportIdkey() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("alarm_crash");
        if (c01.id.a() - M.getLong("report_time", 0L) > 86400000) {
            M.putLong("report_time", c01.id.a());
            jx3.f.INSTANCE.idkeyStat(1204L, 0L, 1L, false);
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.IResetProcess
    public void restartProcess() {
        com.tencent.mars.xlog.Log.w("MicroMsg.CoreService", "restartProcess");
        b();
    }
}
