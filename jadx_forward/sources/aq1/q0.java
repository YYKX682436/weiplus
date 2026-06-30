package aq1;

@j95.b
/* loaded from: classes12.dex */
public final class q0 extends i95.w implements a25.q {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f94612d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f94613e;

    public q0() {
        jz5.i iVar = jz5.i.f384362d;
        this.f94612d = jz5.h.a(iVar, aq1.i0.f94584d);
        this.f94613e = jz5.h.a(iVar, aq1.p0.f94610d);
    }

    public void Ai(android.content.Intent intent, java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        long longExtra = intent.getLongExtra("notfiy_recv_time", 0L);
        if (longExtra > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r3(currentTimeMillis - longExtra, currentTimeMillis, longExtra, intent, from));
        }
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("acc-proc-life-stats.bin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.util.List Di() {
        return (java.util.List) this.f94612d.mo141623x754a37bb();
    }

    public boolean Ni(int i17) {
        return i17 == 322 || i17 == 326 || i17 == 327 || i17 == 323 || i17 == 328 || i17 == 138 || i17 == 268369921 || i17 == 1000000205 || i17 == 1000000800 || i17 == 39 || i17 == 6238;
    }

    public boolean Ri(java.lang.String procName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        return dr0.p1.f324022d.a().j(procName);
    }

    public boolean Ui() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        return dr0.a3.f323936d.a().m();
    }

    public void Vi(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect onHandleVoip: " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect storeLastVoipHandled: " + j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        Bi.putLong("voip-handle-" + j17, java.lang.System.currentTimeMillis());
        ((ku5.t0) ku5.t0.f394148d).g(new aq1.k0(this, j17, java.lang.System.currentTimeMillis()));
    }

    public void Zi() {
        boolean z17;
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.v vVar = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.v.f145046a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            bn0.g gVar = bn0.g.f104312a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = gVar.d().a();
            int o17 = a17 != null ? a17.o("___LightPush_Lash_Refreshed_Version___", -1) : -1;
            if (o17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushKV", "isLightPushKVRefreshed = false, last = " + o17 + ", current = 0");
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushKV", "isLightPushKVRefreshed = true, last = " + o17 + ", current = 0");
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushNotificationSync", "isLightPushKVRefreshed");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushNotificationSync", "refreshNotificationCriticalData");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = gVar.d().a();
                if (a18 != null) {
                    a18.d();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = ((bn0.c) ((jz5.n) bn0.g.f104313b).mo141623x754a37bb()).a();
                if (a19 != null) {
                    a19.d();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = gVar.e().a();
                if (a27 != null) {
                    a27.d();
                }
                try {
                    vVar.a();
                    vVar.b();
                    vVar.c();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = gVar.d().a();
                    if (a28 != null) {
                        a28.A("___LightPush_Lash_Refreshed_Version___", 0);
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LightPushNotificationSync", th6, "", new java.lang.Object[0]);
                }
            }
        }
        pm.b bVar = pm.f.f438285a.f438288f;
        synchronized (bVar) {
            bVar.f438283d = null;
        }
    }

    public void aj(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect onShowVoip: " + j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((ku5.t0) ku5.t0.f394148d).g(new aq1.l0(this, j17, java.lang.System.currentTimeMillis()));
    }

    public void bj(java.lang.String action) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        i95.m c17 = i95.n0.c(ob0.i3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ob0.i3 i3Var = (ob0.i3) c17;
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        ob0.i3.rf(i3Var, "type_pull_up", 0L, null, PROCESS_MAIN, action, 6, null);
        if (mm.k.j(mm.k.L, null, 1, null) && !kz5.c0.i("push_init", "notify_voip_req", "check_alive").contains(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "pullUpMainProc skip, emergent actions only within rule-recycle-heavy: ".concat(action));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !dr0.p1.f324022d.a().j(PROCESS_MAIN)) {
            dr0.w1 w1Var = dr0.a3.f323936d;
            w1Var.a().getClass();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("battery-accproclife-lastpid-recycle-test", -1));
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null && (intValue = num.intValue()) == w1Var.a().h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "pullUpMainProc skip, emergent actions only within rule-recycle-test: " + action + ", lastMainProcPid=" + intValue);
                return;
            }
        }
        com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f(4, action);
        dr0.p1.f324022d.a().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "#pullUpProc: ".concat(action));
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(action), dr0.e1.class, new dr0.m1(java.lang.System.currentTimeMillis()));
        dr0.x0.f324104a.a("pullUp", new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.o4(action));
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.m40008x170199a(mm.k.j(mm.k.U, null, 1, null));
    }

    public boolean wi(r45.j4 j4Var, java.util.Map map, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        r45.du5 du5Var;
        if (map != null && j4Var != null && j4Var.f459091e != null) {
            if ((map.get(".msgsource.enterprise_info.bizchat_id") != null) && j4Var.f459100q != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received biz chat msg, pull up main process to deal with it.");
                if (c19772x1c2cd081 != null) {
                    c19772x1c2cd081.f38869x6ac9171 = "abort-by-bizchat";
                }
                return true;
            }
            java.lang.String str = j4Var.f459091e.f454289d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            java.lang.String forcePushId = str.concat("@wxcontact");
            bn0.g gVar = bn0.g.f104312a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = forcePushId;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = gVar.e().a();
            bn0.b bVar = null;
            objArr[1] = a17 != null ? a17.u(forcePushId, "") : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushKV", "getLightPushForceNotifyData name = %s, value = %s", objArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = gVar.e().a();
            java.lang.String u17 = a18 != null ? a18.u(forcePushId, "") : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                bVar = new bn0.b("", 0L, 0L, 0, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
                bVar.b(u17);
            }
            if ((bVar == null || bVar.d() || !bVar.c()) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received force notify message, pull up main process to deal with it.");
                if (c19772x1c2cd081 != null) {
                    c19772x1c2cd081.f38869x6ac9171 = "abort-by-force-notify";
                }
                return true;
            }
            if (j4Var.f459093g == 318767153 && (du5Var = j4Var.f459094h) != null) {
                java.lang.String str2 = du5Var.f454289d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
                if (r26.n0.B(str2, "forcePushId", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "Received force notify message with type MM_DATA_APPMSG_DYEING_TEMPLATE, pull up main process to deal with it.");
                    if (c19772x1c2cd081 != null) {
                        c19772x1c2cd081.f38869x6ac9171 = "abort-by-force-push-appmsg";
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
