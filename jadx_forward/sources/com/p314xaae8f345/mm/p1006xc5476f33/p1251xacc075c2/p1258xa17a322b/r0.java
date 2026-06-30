package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 f174217a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12845xfdf2913a f174218b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f174219c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f174220d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f174221e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f174222f;

    /* renamed from: g, reason: collision with root package name */
    public static yz5.q f174223g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f174224h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f174225i;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.backup.roambackup.NewRoamBackupManager$exptListener$1] */
    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f174218b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.backup.roambackup.NewRoamBackupManager$exptListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ((ku5.t0) ku5.t0.f394148d).r(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.c0.f174110d, "createFullDiffFile");
                return false;
            }
        };
        f174219c = java.util.Collections.synchronizedSet(new java.util.HashSet(6));
        f174220d = java.util.Collections.synchronizedSet(new java.util.HashSet(2));
        f174221e = java.util.Collections.synchronizedSet(new java.util.HashSet(4));
        f174222f = new java.util.concurrent.ConcurrentHashMap();
        f174224h = new java.lang.Object();
        f174225i = true;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var, long j17, java.lang.String str, io1.b bVar, int i17) {
        if (!r0Var.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "skip force notify deletion for pkgId=" + j17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.f174397q.a();
        boolean z17 = (a17 == null || a17.isFinishing() || a17.isDestroyed()) ? false : true;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[For delete] Skip force notify, because RoamUI on foreground. pkgId=" + j17);
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[For delete] do force notify, packageId=" + j17);
        java.lang.String string = bVar == io1.b.f374991d ? i17 == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574382mw4) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574381mw3) : i17 == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mw6) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574383mw5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        i13.q qVar = new i13.q(uuid, str, string, java.lang.System.currentTimeMillis(), new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p0(j17));
        k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
        l1Var.f(qVar);
        l1Var.c();
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o0(l1Var, qVar), 5000L);
    }

    public final void b(io1.c refreshListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshListener, "refreshListener");
        f174219c.add(refreshListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:17:0x0027->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            qo1.j1 r0 = qo1.j1.f447056a
            com.tencent.mm.plugin.backup.roambackup.v r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v.f174443d
            int r0 = r0.b(r1)
            com.tencent.mm.plugin.backup.roambackup.b r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a
            monitor-enter(r1)
            java.util.HashMap r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174102b     // Catch: java.lang.Throwable -> L73
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L73
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L73
            r4 = 0
            if (r3 == 0) goto L23
            goto L4d
        L23:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L73
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L73
            jz5.l r3 = (jz5.l) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r3.f384366d     // Catch: java.lang.Throwable -> L73
            com.tencent.mm.plugin.backup.roambackup.a r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a.f174094e     // Catch: java.lang.Throwable -> L73
            r7 = 1
            if (r5 != r6) goto L49
            java.lang.Object r3 = r3.f384367e     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r3, r5)     // Catch: java.lang.Throwable -> L73
            io1.a r3 = (io1.a) r3     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.f374989e     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L49
            r3 = r7
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r3 == 0) goto L27
            r4 = r7
        L4d:
            monitor-exit(r1)
            java.lang.String r1 = "MicroMsg.NewRoamBackupManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[checkForegroundService] RunningTaskCount="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = ", hasDeletingTask="
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            if (r0 != 0) goto L72
            if (r4 != 0) goto L72
            no1.c r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174257f
            r0.b()
        L72:
            return
        L73:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.c():void");
    }

    public final void d(long j17, java.util.ArrayList convList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convList, "convList");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(j17);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRoamBackupManager", "Fail to get backupper by pkgId=" + j17);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = k(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        java.lang.String a17 = go1.d.f355477a.a(k17);
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = k17.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a18 = cVar.a(uVar);
        io1.b bVar = z17 ? io1.b.f374992e : io1.b.f374993f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.c(j17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a.f174094e, new io1.a(j17, bVar, a18, 0.0f, false, 0));
        q(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174257f.a();
        b17.a(convList, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y(java.lang.System.currentTimeMillis(), j17, z17, convList, k17, a17, bVar));
    }

    public final void e(boolean z17) {
        synchronized (f174224h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "Change allowAutoStartTask from " + f174225i + " to " + z17);
            f174225i = z17;
        }
    }

    public final java.lang.Object f(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[getAllBackupPackage] fromServer=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().c(z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.e0(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final void g(boolean z17, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "GetAllBackupPackage with async callback. fromServer=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().c(z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.d0(block));
    }

    public final java.util.ArrayList h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getAllBackupPackageSync with async callback. fromServer=" + z17);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().c(z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.f0(h0Var, countDownLatch));
        countDownLatch.await();
        return (java.util.ArrayList) h0Var.f391656d;
    }

    public final java.util.List i(boolean z17) {
        java.util.List j17 = j(z17);
        java.util.List a17 = ro1.v.f479547a.a();
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            po1.d dVar = (po1.d) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "usbDevice FromMMKV path = " + dVar.f438832e + ", uri = " + dVar.f438834g + " name = " + new jz5.l(dVar.f438830c, dVar.f438831d));
        }
        kz5.h0.u(j17, a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "Device count = " + ((java.util.ArrayList) j17).size());
        return j17;
    }

    public final java.util.List j(boolean z17) {
        po1.d dVar;
        java.util.List<v32.f> y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.aj().y0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (v32.f fVar : y07) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getIotBoundDevices deviceId=" + fVar.f67434x5fdff3b6 + ", field_nickName=" + fVar.f67437x21eb2633 + ", type=" + fVar.f67438x12d71904);
            }
            int i17 = fVar.f67438x12d71904;
            if (i17 == 4011 || i17 == 13000 || i17 == 13001) {
                java.lang.String field_deviceId = fVar.f67434x5fdff3b6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_deviceId, "field_deviceId");
                po1.g a17 = po1.g.f438839d.a(fVar.f67438x12d71904);
                java.lang.String field_nickName = fVar.f67437x21eb2633;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickName, "field_nickName");
                java.lang.String field_nickName2 = fVar.f67437x21eb2633;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickName2, "field_nickName");
                dVar = new po1.d(field_deviceId, a17, field_nickName, field_nickName2, "", "", "");
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k(long j17) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().d(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getPackageById, pkgId=" + j17 + ", retPkgId=" + d17.f297362d + ", size = " + d17.f297370o.f297371d);
        if (j17 == d17.f297362d) {
            return d17;
        }
        return null;
    }

    public final void l(long j17, yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getRestoreConversationList");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(j17);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getBackedUpConversationListAsync start");
            b17.b(0L, java.lang.System.currentTimeMillis(), new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.g0(block));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRoamBackupManager", "Fail to get roam backupper by package id = " + j17);
        }
    }

    public final boolean m(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.c(deviceId);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRoamBackupManager", "Fail to get device manager by deviceId=".concat(deviceId));
            return false;
        }
        c17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.h0(c0Var, countDownLatch));
        countDownLatch.await();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "deviceId=" + deviceId + " isConnected=" + c0Var.f391645d);
        return c0Var.f391645d;
    }

    public final boolean n() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(qo1.j0 r24, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 r25, qo1.i0 r26) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.o(qo1.j0, com.tencent.wechat.aff.affroam.n0, qo1.i0):void");
    }

    public final void p(io1.c refreshListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshListener, "refreshListener");
        f174219c.remove(refreshListener);
    }

    public final void q(long j17) {
        qo1.j0 d17 = qo1.j1.f447056a.d(j17);
        jz5.l d18 = d17.d();
        r(d17, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) d18.f384366d, (qo1.i0) d18.f384367e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x01e8. Please report as an issue. */
    public final void r(qo1.j0 j0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, qo1.i0 i0Var) {
        jz5.l lVar;
        java.lang.String string;
        jz5.l lVar2;
        java.lang.String h17;
        mv.h0 h0Var;
        jz5.l lVar3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[requestUiRefresh] pkgId=" + j0Var.a() + ", state=" + n0Var + ", error=" + i0Var);
        java.util.Set refreshTaskUiListeners = f174219c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(refreshTaskUiListeners, "refreshTaskUiListeners");
        synchronized (refreshTaskUiListeners) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(refreshTaskUiListeners, "refreshTaskUiListeners");
            java.util.Iterator it = refreshTaskUiListeners.iterator();
            while (it.hasNext()) {
                ((io1.c) it.next()).V1(j0Var, n0Var, i0Var);
            }
        }
        jz5.l a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.a(j0Var.a());
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a) a17.f384366d;
            java.lang.Object obj = a17.f384367e;
            if (!n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "skip extension state passthrough for pkgId=" + j0Var.a());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[updateStatePassthrough] extState=" + aVar + ", params=" + obj);
            if (j0Var instanceof qo1.c1) {
                h0Var = mv.h0.f413045h;
            } else {
                qo1.v0 v0Var = j0Var instanceof qo1.v0 ? (qo1.v0) j0Var : null;
                h0Var = v0Var != null && v0Var.o() ? mv.h0.f413043f : mv.h0.f413044g;
            }
            mv.h0 h0Var2 = h0Var;
            java.lang.String str = h0Var2 == mv.h0.f413044g ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                lVar3 = new jz5.l(mv.f0.f413035e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.n08, str));
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams");
                if (((io1.a) obj).f374989e) {
                    return;
                } else {
                    lVar3 = new jz5.l(mv.f0.f413039i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mya));
                }
            }
            mv.f0 f0Var = (mv.f0) lVar3.f384366d;
            java.lang.String str2 = (java.lang.String) lVar3.f384367e;
            nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
            long a18 = j0Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            v1Var.Di(a18, h0Var2, f0Var, str2);
            return;
        }
        if (!(j0Var instanceof qo1.f0)) {
            ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j0Var.a());
            return;
        }
        qo1.f0 f0Var2 = (qo1.f0) j0Var;
        if (!n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "skip task state passthrough for pkgId=" + f0Var2.f447016i);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[updateStatePassthrough] pkgId=" + f0Var2.f447016i + ", state=" + n0Var + ", error=" + i0Var);
        boolean z17 = f0Var2 instanceof qo1.c1;
        mv.h0 h0Var3 = z17 ? mv.h0.f413045h : ((qo1.v0) f0Var2).o() ? mv.h0.f413043f : mv.h0.f413044g;
        java.lang.String str3 = h0Var3 == mv.h0.f413044g ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
        boolean o17 = f0Var2.o();
        long j17 = f0Var2.f447016i;
        if (o17 && n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR) {
            if (!f0Var2.p()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "Not show error for auto backup task, pkgId=" + j17);
                ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "Show consecutive fail, pkgId=" + j17);
            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.my_);
            nv.v1 v1Var2 = (nv.v1) i95.n0.c(nv.v1.class);
            long j18 = f0Var2.f447016i;
            mv.f0 f0Var3 = mv.f0.f413035e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            v1Var2.Di(j18, h0Var3, f0Var3, g17);
            return;
        }
        switch (n0Var.ordinal()) {
            case 0:
            case 4:
            case 5:
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "Remove passthrough state of completed task, pkgId=" + j17);
                ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
                return;
            case 1:
            case 9:
            case 10:
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.myb, z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                lVar = new jz5.l(mv.f0.f413036f, string2);
                lVar2 = lVar;
                mv.f0 f0Var4 = (mv.f0) lVar2.f384366d;
                java.lang.String str4 = (java.lang.String) lVar2.f384367e;
                nv.v1 v1Var3 = (nv.v1) i95.n0.c(nv.v1.class);
                long j19 = f0Var2.f447016i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                v1Var3.Di(j19, h0Var3, f0Var4, str4);
                return;
            case 2:
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (z17) {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.myc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else if (f0Var2.o()) {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.my8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.my9);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                }
                lVar = new jz5.l(mv.f0.f413037g, string);
                lVar2 = lVar;
                mv.f0 f0Var42 = (mv.f0) lVar2.f384366d;
                java.lang.String str42 = (java.lang.String) lVar2.f384367e;
                nv.v1 v1Var32 = (nv.v1) i95.n0.c(nv.v1.class);
                long j192 = f0Var2.f447016i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str42);
                v1Var32.Di(j192, h0Var3, f0Var42, str42);
                return;
            case 3:
                lVar2 = new jz5.l(mv.f0.f413035e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574409n03));
                mv.f0 f0Var422 = (mv.f0) lVar2.f384366d;
                java.lang.String str422 = (java.lang.String) lVar2.f384367e;
                nv.v1 v1Var322 = (nv.v1) i95.n0.c(nv.v1.class);
                long j1922 = f0Var2.f447016i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str422);
                v1Var322.Di(j1922, h0Var3, f0Var422, str422);
                return;
            case 7:
                switch (i0Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.n08, str3);
                        break;
                    case 4:
                        h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a8c);
                        break;
                    case 5:
                    case 7:
                        h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574409n03);
                        break;
                    case 8:
                        h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mzl);
                        break;
                    case 9:
                        return;
                    default:
                        throw new jz5.j();
                }
                lVar = new jz5.l(mv.f0.f413035e, h17);
                lVar2 = lVar;
                mv.f0 f0Var4222 = (mv.f0) lVar2.f384366d;
                java.lang.String str4222 = (java.lang.String) lVar2.f384367e;
                nv.v1 v1Var3222 = (nv.v1) i95.n0.c(nv.v1.class);
                long j19222 = f0Var2.f447016i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4222);
                v1Var3222.Di(j19222, h0Var3, f0Var4222, str4222);
                return;
            case 8:
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                java.lang.String string3 = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                lVar = new jz5.l(mv.f0.f413038h, string3);
                lVar2 = lVar;
                mv.f0 f0Var42222 = (mv.f0) lVar2.f384366d;
                java.lang.String str42222 = (java.lang.String) lVar2.f384367e;
                nv.v1 v1Var32222 = (nv.v1) i95.n0.c(nv.v1.class);
                long j192222 = f0Var2.f447016i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str42222);
                v1Var32222.Di(j192222, h0Var3, f0Var42222, str42222);
                return;
            default:
                throw new jz5.j();
        }
    }

    public final void s(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().e(kz5.c0.d(pkgInfo), new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.q0(pkgInfo.f297362d, block));
    }

    public final long t() {
        java.lang.String a17 = j62.e.g().a("clicfg_roam_backup_full_diff_trigger", "-1", false, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        java.lang.Long j17 = r26.h0.j(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "writeFullDiffFileVersionExpt, fullDiffString = " + a17 + ", fullDiffLong = " + j17);
        if (j17 != null) {
            return j17.longValue();
        }
        return 0L;
    }
}
