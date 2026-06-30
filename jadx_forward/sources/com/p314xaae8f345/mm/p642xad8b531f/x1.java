package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.x1 f145125a = new com.p314xaae8f345.mm.p642xad8b531f.x1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f145126b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f145127c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f145128d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f145129e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f145130f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f145131g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f145132h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f145133i;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f145126b = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.r1.f145092d);
        f145127c = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.u1.f145110d);
        f145128d = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.q1.f145087d);
        f145129e = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.p1.f145079d);
        f145130f = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.s1.f145101d);
        jz5.g b17 = jz5.h.b(com.p314xaae8f345.mm.p642xad8b531f.o1.f145069d);
        f145131g = b17;
        boolean z17 = false;
        boolean z18 = com.p314xaae8f345.mm.p642xad8b531f.u2.a() && !((java.lang.Boolean) ((jz5.n) b17).mo141623x754a37bb()).booleanValue();
        f145132h = z18;
        if (z18 && mm.k.j(mm.k.T, null, 1, null)) {
            z17 = true;
        }
        f145133i = z17;
    }

    public static final r45.cx4 b(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        r45.cx4 cx4Var = new r45.cx4();
        cx4Var.f453431d = com.p314xaae8f345.mm.p642xad8b531f.v2.c(intent);
        cx4Var.f453432e = intent.getLongExtra("notfiy_recv_time", -1L);
        return cx4Var;
    }

    public static final r45.cx4 e() {
        return (r45.cx4) f145130f.mo141623x754a37bb();
    }

    public final void a() {
        jz5.g gVar = f145126b;
        synchronized (((java.util.List) gVar.mo141623x754a37bb())) {
            if (!((java.util.List) gVar.mo141623x754a37bb()).isEmpty()) {
                kz5.h0.B((java.util.List) gVar.mo141623x754a37bb(), com.p314xaae8f345.mm.p642xad8b531f.i1.f144931d);
            }
        }
    }

    public final void c(android.content.Intent intent) {
        boolean z17 = false;
        int intExtra = intent.getIntExtra("notify_option_type", 0);
        if (intExtra == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", "receiveImp invalid opcode.");
            return;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), java.lang.Integer.valueOf(intExtra));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "doNotify: " + com.p314xaae8f345.mm.p642xad8b531f.v2.a(intent));
        if (gm0.j1.d().f152297d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", "doNotify getDispatcher == null");
            gm0.j1.d().v(true);
        }
        if (intExtra == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dealWithNetworkAvailable");
            if (!gm0.j1.a() || gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", "skip: accHasRead=" + gm0.j1.a() + ", isHeld=" + gm0.m.r());
                return;
            }
            if (!gm0.j1.d().f152304n) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (context != null && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40091x5fd3d5c(context)) {
                    z17 = true;
                }
                if (z17) {
                    gm0.j1.d().g(new w11.u0(b(intent)));
                    return;
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(2);
            return;
        }
        if (intExtra != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", "invalid opCode:" + intExtra);
            return;
        }
        long c17 = com.p314xaae8f345.mm.p642xad8b531f.v2.c(intent);
        int b17 = com.p314xaae8f345.mm.p642xad8b531f.v2.b(intent);
        r45.cx4 b18 = b(intent);
        byte[] byteArrayExtra = intent.getByteArrayExtra("notify_respBuf");
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("notify_skey");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchNotify: func=");
        sb6.append(b17);
        sb6.append(", rcvTime=");
        sb6.append(b18.f453432e);
        sb6.append(", respBuf=");
        sb6.append(byteArrayExtra != null ? byteArrayExtra.length : -1);
        sb6.append(", sessionKey=");
        sb6.append(byteArrayExtra2 != null ? byteArrayExtra2.length : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(byteArrayExtra2) && b17 != 3941) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", "illegal notify: sessionKey=" + byteArrayExtra2 + " func=" + b17);
            return;
        }
        if (!intent.getBooleanExtra("notify_kernel_pending", false) && !intent.getBooleanExtra("notify_service_pending", false) && intent.getIntExtra("notify_service_retry", 0) <= 0) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ai(intent, "dispatchNotify");
        }
        mm.w.j(b17);
        switch (b17) {
            case 39:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch rtNEWSYNCCHECK");
                gm0.j1.d().g(new w11.u0(b18));
                return;
            case 138:
                int a17 = byteArrayExtra == null ? 7 : kk.u.a(byteArrayExtra, 0);
                int i17 = byteArrayExtra == null ? 2 : 1;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(a17);
                objArr[1] = java.lang.Integer.valueOf(i17);
                objArr[2] = java.lang.Integer.valueOf(byteArrayExtra != null ? byteArrayExtra.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MMFunc_NewSync selector:%d scnen:%d  respBuf:%d ", objArr);
                ((ku5.t0) ku5.t0.f394148d).C(new com.p314xaae8f345.mm.p642xad8b531f.j1(a17, i17, b18));
                return;
            case 268369921:
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(byteArrayExtra)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteArrayExtra);
                    if (byteArrayExtra.length > 8) {
                        int a18 = kk.u.a(byteArrayExtra, 0);
                        int a19 = kk.u.a(byteArrayExtra, 4);
                        if (a19 != byteArrayExtra.length - 8) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", "respBuf length error len:" + byteArrayExtra.length);
                            return;
                        } else {
                            byte[] bArr = new byte[a19];
                            java.lang.System.arraycopy(byteArrayExtra, 8, bArr, 0, a19);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MMFunc_ClientdefDataPush flag:%d bufLen:%d respBuf:%d recvTime:%d", java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(byteArrayExtra.length), java.lang.Long.valueOf(b18.f453432e));
                            w11.a1.a(a18, bArr, byteArrayExtra2, b18);
                            return;
                        }
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("respBuf error: ");
                sb7.append(byteArrayExtra != null ? byteArrayExtra.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushToMain.NotifyReceiver", sb7.toString());
                return;
            case 1000000205:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("dispatch MM_PKT_NEW_SYNC_CHECK2_RESP, notify=");
                sb8.append(byteArrayExtra != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb8.toString());
                o45.ii iiVar = new o45.ii();
                try {
                    iiVar.mo13863x347f4535(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PushToMain.NotifyReceiver", e17, null, new java.lang.Object[0]);
                }
                ((ku5.t0) ku5.t0.f394148d).C(new com.p314xaae8f345.mm.p642xad8b531f.l1(iiVar, b18));
                return;
            case 1000000800:
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("synccheck3 dispatch MM_PKT_NEW_SYNC_CHECK3_RESP, notify=");
                sb9.append(byteArrayExtra != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", sb9.toString());
                o45.hi hiVar = new o45.hi();
                try {
                    hiVar.mo13863x347f4535(byteArrayExtra);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PushToMain.NotifyReceiver", e18, null, new java.lang.Object[0]);
                }
                ((ku5.t0) ku5.t0.f394148d).C(new com.p314xaae8f345.mm.p642xad8b531f.m1(hiVar, b18));
                return;
            case 2147480001:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch MM_PKT_FCM_NOTIFY");
                ((ku5.t0) ku5.t0.f394148d).C(new com.p314xaae8f345.mm.p642xad8b531f.k1(b18));
                return;
            default:
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p642xad8b531f.n1(c17, b17, byteArrayExtra, byteArrayExtra2, b18));
                return;
        }
    }

    public final java.util.LinkedList d() {
        return (java.util.LinkedList) f145129e.mo141623x754a37bb();
    }
}
