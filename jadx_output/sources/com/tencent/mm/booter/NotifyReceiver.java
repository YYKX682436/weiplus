package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class NotifyReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mars.comm.MMWakerLock f63257a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mars.comm.MMWakerLock f63258b;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.booter.u0 f63263g;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f63259c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f63260d = new java.util.concurrent.locks.ReentrantLock(false);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f63261e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f63262f = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static boolean f63264h = true;

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f63265i = {0, 1, 2, 4, 6, 8, 10, 20, 50, 100, 200, 500, 1000, 2000, 3000, 4000, 5000, 7000, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, 20000, 30000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f63266j = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f63267k = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

    /* loaded from: classes11.dex */
    public static class NotifyReceiverService extends com.tencent.mm.service.MMService {
        @Override // com.tencent.mm.service.MMService
        public void d() {
            super.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverService", "onCreate()");
        }

        @Override // com.tencent.mm.service.MMService
        public void e() {
            super.e();
        }

        @Override // com.tencent.mm.service.MMService
        public int g(android.content.Intent intent, int i17, int i18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.booter.NotifyReceiver.a(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, false, arrayList);
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.booter.v0(this, arrayList), "MicroMsg.NotifyReceiverService");
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverService", "onStartCommand()");
            return 1;
        }
    }

    /* loaded from: classes12.dex */
    public static class NotifyService extends com.tencent.mm.service.MMService {

        /* renamed from: i, reason: collision with root package name */
        public java.lang.Boolean f63286i = null;

        /* renamed from: m, reason: collision with root package name */
        public final com.tencent.mm.booter.y0 f63287m = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$f();

        /* renamed from: n, reason: collision with root package name */
        public hm0.x f63288n;

        @Override // com.tencent.mm.service.MMService
        public java.lang.String b() {
            return "MicroMsg.NotifyReceiver";
        }

        @Override // com.tencent.mm.service.MMService
        public android.os.IBinder c(android.content.Intent intent) {
            return null;
        }

        @Override // com.tencent.mm.service.MMService
        public void f(android.content.Intent intent, int i17) {
            j(intent);
        }

        @Override // com.tencent.mm.service.MMService
        public int g(android.content.Intent intent, int i17, int i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "NotifyService onStartCommand flags :" + i17 + "startId :" + i18 + " intent " + intent);
            j(intent);
            return 2;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0142. Please report as an issue. */
        public final void i(android.content.Intent intent) {
            char c17;
            final int a17;
            int intExtra = intent.getIntExtra("notify_option_type", 0);
            if (intExtra == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "receiveImp invalid opcode.");
                return;
            }
            if (!gm0.j1.a() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), java.lang.Integer.valueOf(intExtra));
                return;
            }
            if (gm0.j1.d().f70764d == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NotifyReceiver", "receiveImp  opcode:%d  getDispatcher == null", java.lang.Integer.valueOf(intExtra));
                gm0.j1.d().v(true);
            }
            if (this.f63286i == null) {
                if (z65.c.a()) {
                    this.f63286i = java.lang.Boolean.FALSE;
                } else {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOldNotifyReceiver"), 0);
                    gm0.j1.i();
                    this.f63286i = java.lang.Boolean.valueOf(P > kk.m.b(gm0.j1.b().h(), 100));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "handleCommand useOld:%s operationCode:%d", this.f63286i, java.lang.Integer.valueOf(intExtra));
            if (intExtra == 1) {
                boolean z17 = false;
                if (this.f63286i.booleanValue()) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    synchronized (com.tencent.mm.booter.NotifyReceiver.f63261e) {
                        if (com.tencent.mm.booter.NotifyReceiver.f63257a == null) {
                            com.tencent.mm.booter.NotifyReceiver.f63257a = new com.tencent.mars.comm.MMWakerLock(context, "MicroMsg.NotifyReceiver");
                        }
                        com.tencent.mm.booter.NotifyReceiver.f63257a.lock(14000L, "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NETWORK_AVAILABLE");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dealWithLooper");
                if (!gm0.j1.a() || gm0.m.r()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:" + gm0.j1.a() + " isHold:" + gm0.m.r());
                    return;
                }
                if (!gm0.j1.d().f70771n) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (context2 != null && !com.tencent.mars.comm.NetStatusUtil.isWap(context2)) {
                        z17 = true;
                    }
                    if (z17) {
                        gm0.j1.d().g(new w11.u0(com.tencent.mm.booter.x1.b(intent)));
                        return;
                    }
                }
                ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(2);
                return;
            }
            if (intExtra != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "invald opCode:" + intExtra);
                return;
            }
            if (this.f63286i.booleanValue()) {
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                synchronized (com.tencent.mm.booter.NotifyReceiver.f63261e) {
                    if (com.tencent.mm.booter.NotifyReceiver.f63257a == null) {
                        com.tencent.mm.booter.NotifyReceiver.f63257a = new com.tencent.mars.comm.MMWakerLock(context3, "MicroMsg.NotifyReceiver");
                    }
                    com.tencent.mm.booter.NotifyReceiver.f63257a.lock(14000L, "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NOTIFY");
                }
                final int intExtra2 = intent.getIntExtra("notify_respType", 0);
                final byte[] byteArrayExtra = intent.getByteArrayExtra("notify_respBuf");
                final byte[] byteArrayExtra2 = intent.getByteArrayExtra("notify_skey");
                long longExtra = intent.getLongExtra("notfiy_recv_time", -1L);
                final r45.cx4 b17 = com.tencent.mm.booter.x1.b(intent);
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = java.lang.Integer.valueOf(intExtra2);
                objArr[1] = java.lang.Long.valueOf(longExtra);
                objArr[2] = java.lang.Integer.valueOf(byteArrayExtra != null ? byteArrayExtra.length : -1);
                objArr[3] = com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.l(byteArrayExtra2));
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s ", objArr);
                ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ai(intent, "dealWithNotify");
                mm.w.j(intExtra2);
                try {
                    switch (intExtra2) {
                        case 39:
                            gm0.j1.d().g(new w11.u0(b17));
                            break;
                        case 138:
                            int a18 = byteArrayExtra == null ? 7 : kk.u.a(byteArrayExtra, 0);
                            int i17 = byteArrayExtra == null ? 2 : 1;
                            try {
                                java.util.concurrent.locks.Lock lock = com.tencent.mm.booter.NotifyReceiver.f63260d;
                                ((java.util.concurrent.locks.ReentrantLock) lock).lock();
                                int c18 = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(a18, i17, "", b17);
                                if (c18 > 0) {
                                    ((java.util.HashSet) com.tencent.mm.booter.NotifyReceiver.f63259c).add(java.lang.Long.valueOf(c18));
                                    com.tencent.mm.booter.NotifyReceiver.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "NotifyReceiver.dealWithNotify:MMFunc_NewSync");
                                }
                                ((java.util.concurrent.locks.ReentrantLock) lock).unlock();
                                break;
                            } finally {
                                try {
                                    ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        case 268369921:
                            if (com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra2)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify session:" + byteArrayExtra2);
                                break;
                            } else if (com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra) || byteArrayExtra.length <= 8) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify respBuf error ");
                                break;
                            } else {
                                int a19 = kk.u.a(byteArrayExtra, 0);
                                int a27 = kk.u.a(byteArrayExtra, 4);
                                if (a27 != byteArrayExtra.length - 8) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush: respBuf length error len:" + byteArrayExtra.length);
                                    break;
                                } else {
                                    byte[] bArr = new byte[a27];
                                    java.lang.System.arraycopy(byteArrayExtra, 8, bArr, 0, a27);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d", java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(a27), java.lang.Integer.valueOf(byteArrayExtra.length), java.lang.Long.valueOf(longExtra));
                                    try {
                                        java.util.concurrent.locks.Lock lock2 = com.tencent.mm.booter.NotifyReceiver.f63260d;
                                        ((java.util.concurrent.locks.ReentrantLock) lock2).lock();
                                        w11.a1.a(a19, bArr, byteArrayExtra2, b17);
                                        ((java.util.HashSet) com.tencent.mm.booter.NotifyReceiver.f63259c).add(java.lang.Long.valueOf(longExtra));
                                        com.tencent.mm.booter.NotifyReceiver.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "NotifyReceiver.NotifyData");
                                        ((java.util.concurrent.locks.ReentrantLock) lock2).unlock();
                                        break;
                                    } finally {
                                        try {
                                            ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                        } catch (java.lang.Exception unused2) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 1000000205:
                            o45.ii iiVar = new o45.ii();
                            try {
                                try {
                                    iiVar.fromProtoBuf(byteArrayExtra);
                                    java.util.concurrent.locks.Lock lock3 = com.tencent.mm.booter.NotifyReceiver.f63260d;
                                    ((java.util.concurrent.locks.ReentrantLock) lock3).lock();
                                    int c19 = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(iiVar.f342961a, 1, iiVar.a(), b17);
                                    if (c19 > 0) {
                                        ((java.util.HashSet) com.tencent.mm.booter.NotifyReceiver.f63259c).add(java.lang.Long.valueOf(c19));
                                        com.tencent.mm.booter.NotifyReceiver.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "NotifyReceiver.dealWithNotify:MM_PKT_NEW_SYNC_CHECK2_RESP");
                                    }
                                    ((java.util.concurrent.locks.ReentrantLock) lock3).unlock();
                                    break;
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiver", e17, "", new java.lang.Object[0]);
                                    ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                    break;
                                }
                            } catch (java.lang.Throwable th6) {
                                try {
                                    ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                } catch (java.lang.Exception unused3) {
                                }
                                throw th6;
                            }
                        case 1000000800:
                            o45.hi hiVar = new o45.hi();
                            try {
                                try {
                                    hiVar.fromProtoBuf(byteArrayExtra);
                                    java.util.concurrent.locks.Lock lock4 = com.tencent.mm.booter.NotifyReceiver.f63260d;
                                    ((java.util.concurrent.locks.ReentrantLock) lock4).lock();
                                    int c27 = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(hiVar.f342947a, 1, hiVar.a(), b17);
                                    if (c27 > 0) {
                                        ((java.util.HashSet) com.tencent.mm.booter.NotifyReceiver.f63259c).add(java.lang.Long.valueOf(c27));
                                        com.tencent.mm.booter.NotifyReceiver.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "NotifyReceiver.dealWithNotify:MM_PKT_NEW_SYNC_CHECK3_RESP");
                                    }
                                    ((java.util.concurrent.locks.ReentrantLock) lock4).unlock();
                                    break;
                                } catch (java.lang.Exception e18) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiver", e18, "", new java.lang.Object[0]);
                                    break;
                                }
                            } catch (java.lang.Throwable th7) {
                                try {
                                    ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                } catch (java.lang.Exception unused4) {
                                }
                                throw th7;
                            }
                        case 2147480001:
                            int c28 = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(7L, 16, "", b17);
                            try {
                                java.util.concurrent.locks.Lock lock5 = com.tencent.mm.booter.NotifyReceiver.f63260d;
                                ((java.util.concurrent.locks.ReentrantLock) lock5).lock();
                                if (c28 <= 0) {
                                    ((java.util.concurrent.locks.ReentrantLock) lock5).unlock();
                                    break;
                                } else {
                                    ((java.util.HashSet) com.tencent.mm.booter.NotifyReceiver.f63259c).add(java.lang.Long.valueOf(c28));
                                    com.tencent.mm.booter.NotifyReceiver.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "NotifyReceiver.dealWithNotify:MM_PKT_FCM_NOTIFY");
                                    ((java.util.concurrent.locks.ReentrantLock) lock5).unlock();
                                    break;
                                }
                            } finally {
                                try {
                                    ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
                                } catch (java.lang.Exception unused5) {
                                }
                            }
                        default:
                            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i18 = intExtra2;
                                    byte[] bArr2 = byteArrayExtra;
                                    byte[] bArr3 = byteArrayExtra2;
                                    r45.cx4 cx4Var = b17;
                                    com.tencent.mm.booter.NotifyReceiver.NotifyService notifyService = com.tencent.mm.booter.NotifyReceiver.NotifyService.this;
                                    notifyService.getClass();
                                    ((com.tencent.mm.plugin.zero.m1) ((a25.v) i95.n0.c(a25.v.class))).f188661e.g(notifyService.f63287m, i18, bArr2, bArr3, cx4Var);
                                }
                            });
                            break;
                    }
                } catch (java.lang.Exception unused6) {
                }
            } else {
                final int intExtra3 = intent.getIntExtra("notify_respType", 0);
                final byte[] byteArrayExtra3 = intent.getByteArrayExtra("notify_respBuf");
                final byte[] byteArrayExtra4 = intent.getByteArrayExtra("notify_skey");
                long longExtra2 = intent.getLongExtra("notfiy_recv_time", -1L);
                final r45.cx4 b18 = com.tencent.mm.booter.x1.b(intent);
                java.lang.Object[] objArr2 = new java.lang.Object[4];
                objArr2[0] = java.lang.Integer.valueOf(intExtra3);
                objArr2[1] = java.lang.Long.valueOf(longExtra2);
                objArr2[2] = java.lang.Integer.valueOf(byteArrayExtra3 == null ? -1 : byteArrayExtra3.length);
                objArr2[3] = java.lang.Integer.valueOf(byteArrayExtra4 == null ? -1 : byteArrayExtra4.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s ", objArr2);
                if (!com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra4) || intExtra3 == 3941) {
                    ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ai(intent, "dealWithNotifyVer2");
                    mm.w.j(intExtra3);
                    switch (intExtra3) {
                        case 39:
                            gm0.j1.d().g(new w11.u0(b18));
                            break;
                        case 138:
                            if (byteArrayExtra3 == null) {
                                c17 = 0;
                                a17 = 7;
                            } else {
                                c17 = 0;
                                a17 = kk.u.a(byteArrayExtra3, 0);
                            }
                            final int i18 = byteArrayExtra3 == null ? 2 : 1;
                            java.lang.Object[] objArr3 = new java.lang.Object[3];
                            objArr3[c17] = java.lang.Integer.valueOf(a17);
                            objArr3[1] = java.lang.Integer.valueOf(i18);
                            objArr3[2] = java.lang.Integer.valueOf(byteArrayExtra3 != null ? byteArrayExtra3.length : -1);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d ", objArr3);
                            ((ku5.t0) ku5.t0.f312615d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$a
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    return java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(a17, i18, "", b18));
                                }
                            });
                            break;
                        case 268369921:
                            if (!com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra3) && byteArrayExtra3.length > 8) {
                                int a28 = kk.u.a(byteArrayExtra3, 0);
                                int a29 = kk.u.a(byteArrayExtra3, 4);
                                if (a29 == byteArrayExtra3.length - 8) {
                                    byte[] bArr2 = new byte[a29];
                                    java.lang.System.arraycopy(byteArrayExtra3, 8, bArr2, 0, a29);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d", java.lang.Integer.valueOf(a28), java.lang.Integer.valueOf(a29), java.lang.Integer.valueOf(byteArrayExtra3.length), java.lang.Long.valueOf(longExtra2));
                                    w11.a1.a(a28, bArr2, byteArrayExtra4, b18);
                                    break;
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush: respBuf length error len:" + byteArrayExtra3.length);
                                    break;
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify respBuf error ");
                                break;
                            }
                            break;
                        case 1000000205:
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("oreh on newsynccheck2 notify_, notify=");
                            sb6.append(byteArrayExtra3 != null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", sb6.toString());
                            final o45.ii iiVar2 = new o45.ii();
                            try {
                                iiVar2.fromProtoBuf(byteArrayExtra3);
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiver", e19, null, new java.lang.Object[0]);
                            }
                            ((ku5.t0) ku5.t0.f312615d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$c
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    r45.cx4 cx4Var = b18;
                                    w11.d2 Ai = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
                                    o45.ii iiVar3 = o45.ii.this;
                                    return java.lang.Integer.valueOf(Ai.c(iiVar3.f342961a, 1, iiVar3.a(), cx4Var));
                                }
                            });
                            break;
                        case 1000000800:
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("newsync3 oreh on newsynccheck3 notify_, notify=");
                            sb7.append(byteArrayExtra3 != null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", sb7.toString());
                            final o45.hi hiVar2 = new o45.hi();
                            try {
                                hiVar2.fromProtoBuf(byteArrayExtra3);
                            } catch (java.lang.Exception e27) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiver", e27, null, new java.lang.Object[0]);
                            }
                            ((ku5.t0) ku5.t0.f312615d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$d
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    r45.cx4 cx4Var = b18;
                                    w11.d2 Ai = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
                                    o45.hi hiVar3 = o45.hi.this;
                                    return java.lang.Integer.valueOf(Ai.c(hiVar3.f342947a, 1, hiVar3.a(), cx4Var));
                                }
                            });
                            break;
                        case 2147480001:
                            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "dkpush FCM Notify");
                            ((ku5.t0) ku5.t0.f312615d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$b
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    return java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(7L, 16, "", r45.cx4.this));
                                }
                            });
                            break;
                        default:
                            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.NotifyReceiver$NotifyService$$e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19 = intExtra3;
                                    byte[] bArr3 = byteArrayExtra3;
                                    byte[] bArr4 = byteArrayExtra4;
                                    r45.cx4 cx4Var = b18;
                                    com.tencent.mm.booter.NotifyReceiver.NotifyService notifyService = com.tencent.mm.booter.NotifyReceiver.NotifyService.this;
                                    notifyService.getClass();
                                    ((com.tencent.mm.plugin.zero.m1) ((a25.v) i95.n0.c(a25.v.class))).f188661e.g(notifyService.f63287m, i19, bArr3, bArr4, cx4Var);
                                }
                            });
                            break;
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify session null and ret sessionKey:" + byteArrayExtra4 + " respType:" + intExtra3);
                }
            }
        }

        public final void j(android.content.Intent intent) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "receiveImp receiveIntent == null");
                return;
            }
            if (!com.tencent.mm.booter.x1.f63599h) {
                int i17 = 0;
                if (!gm0.j1.i().f273208a.f273299d) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "summerboot WorkerProfile not has create, status %d", 0);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (this.f63288n != null) {
                        gm0.j1 i18 = gm0.j1.i();
                        hm0.x xVar = this.f63288n;
                        gm0.y1 y1Var = i18.f273208a.f273303h;
                        y1Var.getClass();
                        fm5.b bVar = new fm5.b(xVar, y1Var);
                        synchronized (y1Var) {
                            y1Var.f264181d.remove(bVar);
                        }
                    }
                    this.f63288n = new com.tencent.mm.booter.x0(this, currentTimeMillis, intent);
                    gm0.j1.i().m(this.f63288n);
                    jx3.f.INSTANCE.idkeyStat(99L, 213L, 1L, false);
                    i17 = -1;
                }
                if (i17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "summerboot status %s", java.lang.Integer.valueOf(i17));
                    return;
                } else {
                    i(intent);
                    return;
                }
            }
            com.tencent.mm.booter.x1 x1Var = com.tencent.mm.booter.x1.f63592a;
            ((java.lang.Boolean) ((jz5.n) com.tencent.mm.booter.x1.f63598g).getValue()).booleanValue();
            if (gm0.j1.i().f273208a.f273299d) {
                x1Var.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "exe directly withKernel: syncNum=" + intent.getLongExtra("notfiy_sync_num", 0L));
                x1Var.c(intent);
                return;
            }
            jz5.g gVar = com.tencent.mm.booter.x1.f63593b;
            synchronized (((java.util.List) gVar.getValue())) {
                intent.putExtra("notify_kernel_pending", true);
                com.tencent.mm.booter.b1 b1Var = new com.tencent.mm.booter.b1(intent);
                com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "add pending " + b1Var.f63308a + ": syncNum=" + b1Var.f63309b.getLongExtra("notfiy_sync_num", 0L));
                ((java.util.List) gVar.getValue()).add(b1Var);
            }
            gm0.j1.i().m(new com.tencent.mm.booter.w1(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "wait for kernel startup");
            jx3.f.INSTANCE.idkeyStat(99L, 213L, 1L, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r27, android.content.Intent r28, boolean r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.NotifyReceiver.a(android.content.Context, android.content.Intent, boolean, java.util.ArrayList):void");
    }

    public static void b(android.content.Context context, java.lang.String str) {
        synchronized (f63262f) {
            if (f63258b == null) {
                f63258b = new com.tencent.mars.comm.MMWakerLock(context, "MicroMsg.NotifyReceiver");
            }
            f63258b.lock(60000L, str);
        }
    }

    public static void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "quitLightPushMode");
        f63264h = false;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putBoolean("is_in_notify_mode", false).commit();
    }

    public static void d() {
        gm0.j1.d().q(138, f63263g);
        gm0.j1.d().q(39, f63263g);
        gm0.j1.d().q(268369922, f63263g);
        if (f63263g == null) {
            f63263g = new com.tencent.mm.booter.u0();
        }
        gm0.j1.d().a(138, f63263g);
        gm0.j1.d().a(39, f63263g);
        gm0.j1.d().a(268369922, f63263g);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "onReceive intent :%s", intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(context, intent, true, arrayList);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.booter.q0(this, arrayList), "MicroMsg.NotifyReceiver");
    }
}
