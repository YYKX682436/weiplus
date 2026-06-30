package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.booter.x1 f63592a = new com.tencent.mm.booter.x1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f63593b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f63594c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f63595d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f63596e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f63597f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f63598g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f63599h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f63600i;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f63593b = jz5.h.a(iVar, com.tencent.mm.booter.r1.f63559d);
        f63594c = jz5.h.a(iVar, com.tencent.mm.booter.u1.f63577d);
        f63595d = jz5.h.a(iVar, com.tencent.mm.booter.q1.f63554d);
        f63596e = jz5.h.a(iVar, com.tencent.mm.booter.p1.f63546d);
        f63597f = jz5.h.a(iVar, com.tencent.mm.booter.s1.f63568d);
        jz5.g b17 = jz5.h.b(com.tencent.mm.booter.o1.f63536d);
        f63598g = b17;
        boolean z17 = false;
        boolean z18 = com.tencent.mm.booter.u2.a() && !((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue();
        f63599h = z18;
        if (z18 && mm.k.j(mm.k.T, null, 1, null)) {
            z17 = true;
        }
        f63600i = z17;
    }

    public static final r45.cx4 b(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        r45.cx4 cx4Var = new r45.cx4();
        cx4Var.f371898d = com.tencent.mm.booter.v2.c(intent);
        cx4Var.f371899e = intent.getLongExtra("notfiy_recv_time", -1L);
        return cx4Var;
    }

    public static final r45.cx4 e() {
        return (r45.cx4) f63597f.getValue();
    }

    public final void a() {
        jz5.g gVar = f63593b;
        synchronized (((java.util.List) gVar.getValue())) {
            if (!((java.util.List) gVar.getValue()).isEmpty()) {
                kz5.h0.B((java.util.List) gVar.getValue(), com.tencent.mm.booter.i1.f63398d);
            }
        }
    }

    public final void c(android.content.Intent intent) {
        boolean z17 = false;
        int intExtra = intent.getIntExtra("notify_option_type", 0);
        if (intExtra == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", "receiveImp invalid opcode.");
            return;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), java.lang.Integer.valueOf(intExtra));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "doNotify: " + com.tencent.mm.booter.v2.a(intent));
        if (gm0.j1.d().f70764d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "doNotify getDispatcher == null");
            gm0.j1.d().v(true);
        }
        if (intExtra == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dealWithNetworkAvailable");
            if (!gm0.j1.a() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "skip: accHasRead=" + gm0.j1.a() + ", isHeld=" + gm0.m.r());
                return;
            }
            if (!gm0.j1.d().f70771n) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (context != null && !com.tencent.mars.comm.NetStatusUtil.isWap(context)) {
                    z17 = true;
                }
                if (z17) {
                    gm0.j1.d().g(new w11.u0(b(intent)));
                    return;
                }
            }
            ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(2);
            return;
        }
        if (intExtra != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", "invalid opCode:" + intExtra);
            return;
        }
        long c17 = com.tencent.mm.booter.v2.c(intent);
        int b17 = com.tencent.mm.booter.v2.b(intent);
        r45.cx4 b18 = b(intent);
        byte[] byteArrayExtra = intent.getByteArrayExtra("notify_respBuf");
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("notify_skey");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchNotify: func=");
        sb6.append(b17);
        sb6.append(", rcvTime=");
        sb6.append(b18.f371899e);
        sb6.append(", respBuf=");
        sb6.append(byteArrayExtra != null ? byteArrayExtra.length : -1);
        sb6.append(", sessionKey=");
        sb6.append(byteArrayExtra2 != null ? byteArrayExtra2.length : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra2) && b17 != 3941) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", "illegal notify: sessionKey=" + byteArrayExtra2 + " func=" + b17);
            return;
        }
        if (!intent.getBooleanExtra("notify_kernel_pending", false) && !intent.getBooleanExtra("notify_service_pending", false) && intent.getIntExtra("notify_service_retry", 0) <= 0) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ai(intent, "dispatchNotify");
        }
        mm.w.j(b17);
        switch (b17) {
            case 39:
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch rtNEWSYNCCHECK");
                gm0.j1.d().g(new w11.u0(b18));
                return;
            case 138:
                int a17 = byteArrayExtra == null ? 7 : kk.u.a(byteArrayExtra, 0);
                int i17 = byteArrayExtra == null ? 2 : 1;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(a17);
                objArr[1] = java.lang.Integer.valueOf(i17);
                objArr[2] = java.lang.Integer.valueOf(byteArrayExtra != null ? byteArrayExtra.length : -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MMFunc_NewSync selector:%d scnen:%d  respBuf:%d ", objArr);
                ((ku5.t0) ku5.t0.f312615d).C(new com.tencent.mm.booter.j1(a17, i17, b18));
                return;
            case 268369921:
                if (!com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra)) {
                    kotlin.jvm.internal.o.d(byteArrayExtra);
                    if (byteArrayExtra.length > 8) {
                        int a18 = kk.u.a(byteArrayExtra, 0);
                        int a19 = kk.u.a(byteArrayExtra, 4);
                        if (a19 != byteArrayExtra.length - 8) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", "respBuf length error len:" + byteArrayExtra.length);
                            return;
                        } else {
                            byte[] bArr = new byte[a19];
                            java.lang.System.arraycopy(byteArrayExtra, 8, bArr, 0, a19);
                            com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MMFunc_ClientdefDataPush flag:%d bufLen:%d respBuf:%d recvTime:%d", java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(byteArrayExtra.length), java.lang.Long.valueOf(b18.f371899e));
                            w11.a1.a(a18, bArr, byteArrayExtra2, b18);
                            return;
                        }
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("respBuf error: ");
                sb7.append(byteArrayExtra != null ? byteArrayExtra.length : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.PushToMain.NotifyReceiver", sb7.toString());
                return;
            case 1000000205:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("dispatch MM_PKT_NEW_SYNC_CHECK2_RESP, notify=");
                sb8.append(byteArrayExtra != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb8.toString());
                o45.ii iiVar = new o45.ii();
                try {
                    iiVar.fromProtoBuf(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PushToMain.NotifyReceiver", e17, null, new java.lang.Object[0]);
                }
                ((ku5.t0) ku5.t0.f312615d).C(new com.tencent.mm.booter.l1(iiVar, b18));
                return;
            case 1000000800:
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("synccheck3 dispatch MM_PKT_NEW_SYNC_CHECK3_RESP, notify=");
                sb9.append(byteArrayExtra != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb9.toString());
                o45.hi hiVar = new o45.hi();
                try {
                    hiVar.fromProtoBuf(byteArrayExtra);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PushToMain.NotifyReceiver", e18, null, new java.lang.Object[0]);
                }
                ((ku5.t0) ku5.t0.f312615d).C(new com.tencent.mm.booter.m1(hiVar, b18));
                return;
            case 2147480001:
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MM_PKT_FCM_NOTIFY");
                ((ku5.t0) ku5.t0.f312615d).C(new com.tencent.mm.booter.k1(b18));
                return;
            default:
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.booter.n1(c17, b17, byteArrayExtra, byteArrayExtra2, b18));
                return;
        }
    }

    public final java.util.LinkedList d() {
        return (java.util.LinkedList) f63596e.getValue();
    }
}
