package com.p314xaae8f345.mm.p642xad8b531f;

/* renamed from: com.tencent.mm.booter.CoreService */
/* loaded from: classes12.dex */
public class ServiceC10285xbf7f55f6 extends android.app.Service implements com.p314xaae8f345.mm.p971x6de15a2e.p0, com.p314xaae8f345.mm.p971x6de15a2e.w2, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IResetProcess, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IReportCrash {

    /* renamed from: v, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p642xad8b531f.l f144767v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9[] f144768w = {null};

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.g1 f144769d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p642xad8b531f.p0 f144770e = new com.p314xaae8f345.mm.p642xad8b531f.p0();

    /* renamed from: f, reason: collision with root package name */
    public boolean f144771f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144772g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144773h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p642xad8b531f.k f144774i = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.t2 f144775m = new com.p314xaae8f345.mm.p642xad8b531f.c(this);

    /* renamed from: n, reason: collision with root package name */
    public int f144776n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f144777o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f144778p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f144779q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f144780r = 0;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f144781s = null;

    /* renamed from: t, reason: collision with root package name */
    public final x51.j0 f144782t = new x51.j0(180000, 3);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f144783u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p642xad8b531f.i(this), false);

    /* renamed from: com.tencent.mm.booter.CoreService$InnerService */
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreService", "set service for push exception:%s.", e17);
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
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("msg_receive_number");
        long j17 = M.getLong("send_num", 0L) + 1;
        M.putLong("send_num", j17);
        return j17;
    }

    public static com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "idkeyPushSetupTimeReport %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(1391);
        c4582x424c344.m40331x936762bd(i17);
        c4582x424c344.m40332x57b2b64f(i18);
        return c4582x424c344;
    }

    public static void f(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.p642xad8b531f.u2.a()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.class);
            intent.putExtra("notify_option_type", i17);
            intent.putExtra("notify_uin", com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o);
            if (!android.text.TextUtils.isEmpty(str)) {
                intent.putExtra("notify_action", str);
            }
            com.p314xaae8f345.mm.p642xad8b531f.u2.f145111a.b(context, intent, "act");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.class);
        intent2.putExtra("notify_option_type", i17);
        intent2.putExtra("notify_uin", com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent2.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        if (!android.text.TextUtils.isEmpty(str)) {
            intent2.putExtra("notify_action", str);
        }
        try {
            long c17 = c();
            intent2.putExtra("notfiy_sync_num", c17);
            intent2.putExtra("notify_from", "broadcast");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "sendToNotifyReceiverWithAction: syncNum=" + c17 + ", action=" + str);
            com.p314xaae8f345.mm.p971x6de15a2e.x2.d().sendBroadcast(intent2);
            intent2.setClass(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyReceiverService.class);
            intent2.putExtra("notify_from", "service");
            android.content.Intent intent3 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.class);
            l85.j1.b("MicroMsg.CoreService", intent3);
            l85.h1.e(intent2, "mm", true, intent3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.CoreService", "checker frequency limited hasDestroyed %s", e17.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[Catch: Exception -> 0x0107, TryCatch #1 {Exception -> 0x0107, blocks: (B:11:0x003d, B:13:0x004b, B:35:0x0061, B:36:0x006a, B:38:0x0070, B:40:0x0086, B:42:0x008c, B:43:0x0093, B:45:0x0102, B:46:0x0104, B:48:0x0096, B:51:0x009c, B:53:0x00a2, B:55:0x00a8, B:57:0x00b8, B:59:0x00c4, B:61:0x00d0, B:62:0x00d4, B:64:0x00d8, B:66:0x00de, B:68:0x00e4, B:70:0x00f0, B:72:0x00fc, B:74:0x0059, B:33:0x0054), top: B:10:0x003d, inners: #0 }] */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r9, boolean r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.a(android.content.Context, boolean, java.lang.String, java.lang.String):void");
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreService", "[COMPLETE EXIT]");
        com.p314xaae8f345.mm.p971x6de15a2e.x2.h().e(3, 10000, "");
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37517xac79a11b();
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84230xac79a11b();
        }
        try {
            com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.c(getApplicationContext());
            com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.d(getApplicationContext());
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.m39966x9a696642(getApplicationContext());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CoreService", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public boolean e(int i17, int i18, java.lang.String str, int i19, byte[] bArr) {
        if (gm0.k2.c(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "fully exited, no need to notify worker");
            return false;
        }
        if (i19 == 268369921 || i19 != 138) {
        }
        if (i19 == -255) {
            i19 = 138;
        }
        boolean z17 = mm.w.f410075a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "pushNotify: func=" + i19);
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            mm.w.f410092r.mo3938xab27b508(java.lang.Integer.valueOf(i19));
        }
        if (new com.p314xaae8f345.mm.p642xad8b531f.m(this, 2, i19, bArr, null).b()) {
            return true;
        }
        g(i19, bArr);
        return true;
    }

    public final void g(int i17, byte[] bArr) {
        byte[] bArr2 = bArr;
        if (com.p314xaae8f345.mm.p642xad8b531f.u2.a()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.class);
            intent.putExtra("notify_option_type", 2);
            intent.putExtra("notify_uin", com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o);
            intent.putExtra("notify_respType", i17);
            intent.putExtra("notify_respBuf", bArr2);
            intent.putExtra("notify_skey", com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.r(1));
            com.p314xaae8f345.mm.p642xad8b531f.u2.f145111a.b(this, intent, "msg");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.class);
        intent2.putExtra("notify_option_type", 2);
        intent2.putExtra("notify_uin", this.f144769d.f153526n.f153435o);
        intent2.putExtra("notify_respType", i17);
        intent2.putExtra("notify_respBuf", bArr2);
        intent2.putExtra("notify_skey", this.f144769d.f153526n.r(1));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent2.putExtra("notfiy_recv_time", java.lang.System.currentTimeMillis());
        try {
            long c17 = c();
            intent2.putExtra("notfiy_sync_num", c17);
            intent2.putExtra("notify_from", "broadcast");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g = false;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", sb6.toString());
            sendBroadcast(intent2);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(1042L, 60L, 1L, false);
            e11.b.b(i17, c17);
            intent2.setClass(this, com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyReceiverService.class);
            intent2.putExtra("notify_from", "service");
            android.content.Intent intent3 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.class);
            l85.j1.b("MicroMsg.CoreService", intent3);
            l85.h1.e(intent2, "mm", true, intent3);
            fVar.mo68477x336bdfd8(1042L, 62L, 1L, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreService", "dknot sendBroadcast  failed:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        int myPid = android.os.Process.myPid();
        java.util.Objects.toString(java.lang.Thread.currentThread());
        if (myPid != this.f144777o) {
            this.f144777o = myPid;
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(99L, 147L, 1L, false);
            if (intent != null && "auto".equals(intent.getStringExtra("START_TYPE"))) {
                fVar.mo68477x336bdfd8(99L, 146L, 1L, false);
            }
            int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - gm0.c2.f354704a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(d(5, elapsedRealtime));
            long j17 = elapsedRealtime;
            arrayList.add(d(j17 <= 1000 ? 10 : j17 <= 2000 ? 11 : j17 <= 3000 ? 12 : j17 <= 4000 ? 13 : j17 <= 5000 ? 14 : j17 <= 7000 ? 15 : j17 <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? 16 : j17 <= 15000 ? 17 : j17 <= 20000 ? 18 : j17 <= 30000 ? 19 : j17 <= 40000 ? 20 : j17 <= 50000 ? 21 : j17 <= 60000 ? 22 : j17 <= u04.d.f505010c ? 23 : j17 <= 180000 ? 24 : j17 <= 300000 ? 25 : j17 <= 420000 ? 26 : j17 <= 600000 ? 27 : 28, 1));
            arrayList.add(d(0, 1));
            fVar.b(arrayList, false);
            ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p642xad8b531f.g(this), 3000L);
        }
        return this.f144769d;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.onCreate():void");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "onDestroy~~~ threadID:" + java.lang.Thread.currentThread());
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1) ((a25.v) i95.n0.c(a25.v.class))).f270195f.c(this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreService", "onDestroy onDestroy() mCoreServiceLifecycleCallbacks Exception: %s", e17.getMessage());
        }
        android.util.SparseArray sparseArray = al0.h.f87260a;
        if (al0.g.f87254a > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(al0.g.f87259f);
            al0.g.d();
            al0.g.f87254a = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WakeLockStatsManager", "WakeLockStatsManager is detached from process [%s]", bm5.f1.a());
        }
        super.onDestroy();
        b();
        com.p314xaae8f345.mm.p642xad8b531f.k kVar = this.f144774i;
        if (kVar != null) {
            try {
                kVar.mo43388x4b16414e();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreService", "onDestroy unRegisterBroadcasts() Exception = %s ", e18.getMessage());
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "onStartCommand lastpid:%d  pid:%d flags:%d startId:%d", java.lang.Integer.valueOf(this.f144776n), java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (myPid == this.f144776n) {
            return 1;
        }
        this.f144776n = myPid;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(99L, 141L, 1L, false);
        if (intent == null || !"auto".equals(intent.getStringExtra("START_TYPE"))) {
            return 1;
        }
        fVar.mo68477x336bdfd8(99L, 140L, 1L, false);
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        com.p314xaae8f345.mm.p971x6de15a2e.x2.g().f153717a = null;
        com.p314xaae8f345.mm.p971x6de15a2e.x2.k().f153713i.getClass();
        return super.onUnbind(intent);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IReportCrash
    /* renamed from: reportIdkey */
    public void mo40126xf0109290() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("alarm_crash");
        if (c01.id.a() - M.getLong("report_time", 0L) > 86400000) {
            M.putLong("report_time", c01.id.a());
            jx3.f.INSTANCE.mo68477x336bdfd8(1204L, 0L, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IResetProcess
    /* renamed from: restartProcess */
    public void mo40127x93fef960() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreService", "restartProcess");
        b();
    }
}
