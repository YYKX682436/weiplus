package zh4;

@j95.b(m140513x1e06fd29 = {e70.q.class})
/* loaded from: classes11.dex */
public final class k extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f554509d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f554510e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public li4.c f554511f;

    public final void Ai(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTextStatusModelDataByCgiData >> ");
        sb6.append(str == null || str.length() == 0);
        sb6.append(' ');
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", sb6.toString());
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                bw5.ml0 m117507x980134e8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27551xb1577cbf.m117505x9cf0d20b().m117507x980134e8(str, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", "updateTextStatusModelDataByCgiData >> " + str2 + ' ' + m117507x980134e8.f111814d + ' ' + m117507x980134e8.f111815e);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", "updateTextStatusModelDataByCgiData >> data invalid");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", "onAccountInitialized: ready");
        ai4.b0 b0Var = ai4.b0.f86656a;
        if (ai4.b0.f86658c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: ready");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean g17 = b0Var.g();
            boolean f17 = b0Var.f();
            if (g17 && f17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: skip");
                b0Var.i();
            } else {
                int n17 = ai4.b0.f86657b.n(b0Var.d());
                ai4.b0.f86661f = n17;
                if (n17 >= b0Var.e()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: reach maxTryCount:" + b0Var.e());
                    qj4.s.s(qj4.s.f445491a, 3L, null, java.lang.Integer.valueOf(ai4.b0.f86661f), null, null, null, null, 122, null);
                    b0Var.i();
                } else {
                    ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) ai4.b0.f86662g).mo141623x754a37bb(), null, null, new ai4.a0(g17, f17, null), 3, null)).p(new ai4.s(currentTimeMillis));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: unable");
            b0Var.i();
        }
        this.f554509d = true;
        pm0.v.X(new zh4.i(this));
        oj4.j jVar = oj4.j.f427348a;
        ((ku5.t0) ku5.t0.f394148d).g(oj4.e.f427344d);
        pm0.v.O("TextStatusThread", zh4.j.f554508d);
        ai4.m.f86700a.e();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", "onAccountRelease");
        synchronized (ai4.m.f86700a) {
            if (ai4.m.f86705f) {
                try {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117496xf5297ab9("plugin_textstatus_bridge_aff_sub_id");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "stop: unsubscribe AFF StatusInfoChange ok, subId=plugin_textstatus_bridge_aff_sub_id");
                    ai4.m.f86705f = false;
                    ai4.m.f86701b.clear();
                    obj = ai4.m.f86702c;
                } catch (java.lang.Throwable th6) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StatusStorageEventBridge", th6, "stop: unsubscribe AFF StatusInfoChange failed", new java.lang.Object[0]);
                        ai4.m.f86705f = false;
                        ai4.m.f86701b.clear();
                        obj = ai4.m.f86702c;
                        synchronized (obj) {
                            ai4.m.f86703d.clear();
                            ai4.m.f86704e.clear();
                        }
                    } catch (java.lang.Throwable th7) {
                        ai4.m.f86705f = false;
                        ai4.m.f86701b.clear();
                        synchronized (ai4.m.f86702c) {
                            ai4.m.f86703d.clear();
                            ai4.m.f86704e.clear();
                            throw th7;
                        }
                    }
                }
                synchronized (obj) {
                    ai4.m.f86703d.clear();
                    ai4.m.f86704e.clear();
                }
            }
        }
        bk4.i.a().N();
        this.f554509d = false;
        this.f554510e.clear();
        ai4.m0.f86706a.a().mo70513x5a5ddf8();
        ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).wi(9);
        java.util.Set set = si4.c.f489849c;
        java.util.concurrent.ConcurrentHashMap.KeySetView keySetView = (java.util.concurrent.ConcurrentHashMap.KeySetView) si4.c.f489849c;
        int size = keySetView.size();
        keySetView.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "onAccountReleased: reportedReadSet cleared, size=" + size);
    }

    public final void wi(yz5.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f554509d) {
            task.mo152xb9724478();
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        this.f554510e.add(task);
    }
}
