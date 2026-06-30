package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzKE */
/* loaded from: classes5.dex */
public class C27133x167b76d6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297281a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297282b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297283c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297284d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297285e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297286f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297287g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297288h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297289i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297290j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_JI */
    private void m110892x1964d287(float f17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onProgressEvent size: " + this.f297281a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297281a.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            qo1.m mVar = (qo1.m) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u1) entry.getValue());
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] Received a progress event(" + (100 * f17) + "/100)");
            ku5.u0 u0Var = ku5.t0.f394148d;
            qo1.f0 f0Var = mVar.f447062a;
            ((ku5.t0) u0Var).h(new qo1.l(f17, f0Var), f0Var.n());
        }
    }

    /* renamed from: ZIDL_KI */
    private void m110893x1964d2a6(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onStateChangedEvent size: " + this.f297282b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297282b.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onStateChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x1 x1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x1) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.a(i17);
            qo1.p pVar = (qo1.p) x1Var;
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] Received a state changed event. state=" + a17 + ", pkgId=" + pVar.f447072a.f447016i);
            qo1.f0 f0Var = pVar.f447072a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            if (f0Var.f447012e != null) {
                ((ku5.t0) ku5.t0.f394148d).h(new qo1.w(f0Var, a17), "ROAM_TASK_REPORT_THREAD");
            }
            qo1.f0 f0Var2 = pVar.f447072a;
            if (f0Var2.f447009b != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_RESTORE && a17 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED) {
                ((ku5.t0) ku5.t0.f394148d).r(new fo1.j(f0Var2.f447016i), "RoamBackup.MediaPullObserver");
            }
            if (a17 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED || a17 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED) {
                pVar.f447072a.f447011d = -1L;
            }
            if (a17 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING) {
                qo1.f0 f0Var3 = pVar.f447072a;
                f0Var3.f447014g = -1L;
                f0Var3.f447015h = false;
                if (!f0Var3.f447027t) {
                    f0Var3.q(0);
                }
            }
            po1.g a18 = po1.g.f438839d.a(pVar.f447072a.f447008a.f297365g.f297521d);
            if (a17 != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED || a18 == po1.g.f438843h) {
                if (a17 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING) {
                    qo1.f0 f0Var4 = pVar.f447072a;
                    synchronized (f0Var4.f447017j) {
                        if (f0Var4.f447018k == a17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Target state is preparing state already.");
                        }
                    }
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                qo1.f0 f0Var5 = pVar.f447072a;
                ((ku5.t0) u0Var).h(new qo1.o(f0Var5, a17), f0Var5.n());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Pause(disconnect) for the first time and try to resume the task. pkgId=" + pVar.f447072a.f447016i);
                ku5.u0 u0Var2 = ku5.t0.f394148d;
                qo1.f0 f0Var6 = pVar.f447072a;
                ((ku5.t0) u0Var2).h(new qo1.n(f0Var6), f0Var6.n());
            }
        }
    }

    /* renamed from: ZIDL_LI */
    private void m110894x1964d2c5(long j17, int i17, int i18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297283c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onStateChangedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onStateChangedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_MI */
    private void m110895x1964d2e4(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onConversationCompletedEvent size: " + this.f297284d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297284d.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onConversationCompletedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.r1 r1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.r1) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            qo1.t tVar = (qo1.t) r1Var;
            tVar.f447081a.f447010c++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "ConversationCompleted convId=" + str + ", convCount=" + tVar.f447081a.f447010c);
        }
    }

    /* renamed from: ZIDL_NI */
    private void m110896x1964d303(long j17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297285e;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onConversationCompletedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onConversationCompletedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    /* renamed from: ZIDL_OI */
    private void m110897x1964d322(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onTaskCompletedEvent size: " + this.f297286f.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297286f.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onTaskCompletedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z1 z1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z1) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z.a(i17);
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            qo1.s sVar = (qo1.s) z1Var;
            sVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] Received a task completed event. error=" + a17 + ", msg=" + str + ", pkgId=" + sVar.f447080a.f447016i);
            if (sVar.f447080a.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_RESTORE) {
                ((ku5.t0) ku5.t0.f394148d).h(qo1.q.f447074d, "endRecover");
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            qo1.f0 f0Var = sVar.f447080a;
            ((ku5.t0) u0Var).h(new qo1.r(f0Var, a17, str), f0Var.n());
        }
    }

    /* renamed from: ZIDL_PI */
    private void m110898x1964d341(boolean z17, boolean z18) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onDowngradeScheduledEvent size: " + this.f297287g.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297287g.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onDowngradeScheduledEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            qo1.v vVar = (qo1.v) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t1) entry.getValue());
            vVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] on downgrade scheduled event: is downgrade? " + z17 + " is stop? " + z18 + " pkgId " + vVar.f447087a.f447016i);
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseRoamTask", "[-] downgrade: on scheduled to STOP");
                vVar.f447087a.mo160578x360802();
            }
            ((ku5.t0) ku5.t0.f394148d).g(new qo1.u(z18, z17));
        }
    }

    /* renamed from: ZIDL_QI */
    private void m110899x1964d360(long j17, boolean z17, boolean z18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297288h;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onDowngradeScheduledByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onDowngradeScheduledByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_SI */
    private void m110900x1964d39e(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297289i;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onTransferStatsChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onTransferStatsChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_TI */
    private void m110901x1964d3bd(long j17, float f17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297290j;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onProgressAndTransferStatsChangedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamTaskKE", "onProgressAndTransferStatsChangedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }
}
