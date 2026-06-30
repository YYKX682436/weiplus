package aq1;

@j95.b
/* loaded from: classes12.dex */
public final class q0 extends i95.w implements a25.q {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f13079d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f13080e;

    public q0() {
        jz5.i iVar = jz5.i.f302829d;
        this.f13079d = jz5.h.a(iVar, aq1.i0.f13051d);
        this.f13080e = jz5.h.a(iVar, aq1.p0.f13077d);
    }

    public void Ai(android.content.Intent intent, java.lang.String from) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(from, "from");
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        long longExtra = intent.getLongExtra("notfiy_recv_time", 0L);
        if (longExtra > 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.feature.performance.r3(currentTimeMillis - longExtra, currentTimeMillis, longExtra, intent, from));
        }
    }

    public com.tencent.mm.sdk.platformtools.o4 Bi() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("acc-proc-life-stats.bin");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.util.List Di() {
        return (java.util.List) this.f13079d.getValue();
    }

    public boolean Ni(int i17) {
        return i17 == 322 || i17 == 326 || i17 == 327 || i17 == 323 || i17 == 328 || i17 == 138 || i17 == 268369921 || i17 == 1000000205 || i17 == 1000000800 || i17 == 39 || i17 == 6238;
    }

    public boolean Ri(java.lang.String procName) {
        kotlin.jvm.internal.o.g(procName, "procName");
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        return dr0.p1.f242489d.a().j(procName);
    }

    public boolean Ui() {
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        return dr0.a3.f242403d.a().m();
    }

    public void Vi(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect onHandleVoip: " + j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect storeLastVoipHandled: " + j17);
        com.tencent.mm.sdk.platformtools.o4 Bi = Bi();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        Bi.putLong("voip-handle-" + j17, java.lang.System.currentTimeMillis());
        ((ku5.t0) ku5.t0.f312615d).g(new aq1.k0(this, j17, java.lang.System.currentTimeMillis()));
    }

    public void Zi() {
        boolean z17;
        com.tencent.mm.booter.notification.v vVar = com.tencent.mm.booter.notification.v.f63513a;
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
            bn0.g gVar = bn0.g.f22779a;
            com.tencent.mm.sdk.platformtools.o4 a17 = gVar.d().a();
            int o17 = a17 != null ? a17.o("___LightPush_Lash_Refreshed_Version___", -1) : -1;
            if (o17 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "isLightPushKVRefreshed = false, last = " + o17 + ", current = 0");
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "isLightPushKVRefreshed = true, last = " + o17 + ", current = 0");
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LightPushNotificationSync", "isLightPushKVRefreshed");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LightPushNotificationSync", "refreshNotificationCriticalData");
                com.tencent.mm.sdk.platformtools.o4 a18 = gVar.d().a();
                if (a18 != null) {
                    a18.d();
                }
                com.tencent.mm.sdk.platformtools.o4 a19 = ((bn0.c) ((jz5.n) bn0.g.f22780b).getValue()).a();
                if (a19 != null) {
                    a19.d();
                }
                com.tencent.mm.sdk.platformtools.o4 a27 = gVar.e().a();
                if (a27 != null) {
                    a27.d();
                }
                try {
                    vVar.a();
                    vVar.b();
                    vVar.c();
                    com.tencent.mm.sdk.platformtools.o4 a28 = gVar.d().a();
                    if (a28 != null) {
                        a28.A("___LightPush_Lash_Refreshed_Version___", 0);
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LightPushNotificationSync", th6, "", new java.lang.Object[0]);
                }
            }
        }
        pm.b bVar = pm.f.f356752a.f356755f;
        synchronized (bVar) {
            bVar.f356750d = null;
        }
    }

    public void aj(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect onShowVoip: " + j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((ku5.t0) ku5.t0.f312615d).g(new aq1.l0(this, j17, java.lang.System.currentTimeMillis()));
    }

    public void bj(java.lang.String action) {
        int intValue;
        kotlin.jvm.internal.o.g(action, "action");
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        i95.m c17 = i95.n0.c(ob0.i3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ob0.i3 i3Var = (ob0.i3) c17;
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        ob0.i3.rf(i3Var, "type_pull_up", 0L, null, PROCESS_MAIN, action, 6, null);
        if (mm.k.j(mm.k.L, null, 1, null) && !kz5.c0.i("push_init", "notify_voip_req", "check_alive").contains(action)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "pullUpMainProc skip, emergent actions only within rule-recycle-heavy: ".concat(action));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.s9.f192975c && !dr0.p1.f242489d.a().j(PROCESS_MAIN)) {
            dr0.w1 w1Var = dr0.a3.f242403d;
            w1Var.a().getClass();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-lastpid-recycle-test", -1));
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null && (intValue = num.intValue()) == w1Var.a().h()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "pullUpMainProc skip, emergent actions only within rule-recycle-test: " + action + ", lastMainProcPid=" + intValue);
                return;
            }
        }
        com.tencent.mm.booter.CoreService.f(4, action);
        dr0.p1.f242489d.a().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "#pullUpProc: ".concat(action));
        com.tencent.mm.ipcinvoker.d0.d(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(action), dr0.e1.class, new dr0.m1(java.lang.System.currentTimeMillis()));
        dr0.x0.f242571a.a("pullUp", new com.tencent.mm.feature.performance.o4(action));
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.comm.MMWakerLock.setReentrantGuard(mm.k.j(mm.k.U, null, 1, null));
    }

    public boolean wi(r45.j4 j4Var, java.util.Map map, com.tencent.mm.pointers.PString pString) {
        r45.du5 du5Var;
        if (map != null && j4Var != null && j4Var.f377558e != null) {
            if ((map.get(".msgsource.enterprise_info.bizchat_id") != null) && j4Var.f377567q != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received biz chat msg, pull up main process to deal with it.");
                if (pString != null) {
                    pString.value = "abort-by-bizchat";
                }
                return true;
            }
            java.lang.String str = j4Var.f377558e.f372756d;
            kotlin.jvm.internal.o.f(str, "toString(...)");
            java.lang.String forcePushId = str.concat("@wxcontact");
            bn0.g gVar = bn0.g.f22779a;
            kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = forcePushId;
            com.tencent.mm.sdk.platformtools.o4 a17 = gVar.e().a();
            bn0.b bVar = null;
            objArr[1] = a17 != null ? a17.u(forcePushId, "") : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "getLightPushForceNotifyData name = %s, value = %s", objArr);
            com.tencent.mm.sdk.platformtools.o4 a18 = gVar.e().a();
            java.lang.String u17 = a18 != null ? a18.u(forcePushId, "") : null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                bVar = new bn0.b("", 0L, 0L, 0, 0);
                kotlin.jvm.internal.o.d(u17);
                bVar.b(u17);
            }
            if ((bVar == null || bVar.d() || !bVar.c()) ? false : true) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received force notify message, pull up main process to deal with it.");
                if (pString != null) {
                    pString.value = "abort-by-force-notify";
                }
                return true;
            }
            if (j4Var.f377560g == 318767153 && (du5Var = j4Var.f377561h) != null) {
                java.lang.String str2 = du5Var.f372756d;
                kotlin.jvm.internal.o.f(str2, "toString(...)");
                if (r26.n0.B(str2, "forcePushId", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received force notify message with type MM_DATA_APPMSG_DYEING_TEMPLATE, pull up main process to deal with it.");
                    if (pString != null) {
                        pString.value = "abort-by-force-push-appmsg";
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
