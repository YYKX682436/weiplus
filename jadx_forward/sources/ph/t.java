package ph;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: k, reason: collision with root package name */
    public static volatile ph.t f435816k;

    /* renamed from: l, reason: collision with root package name */
    public static long f435817l;

    /* renamed from: m, reason: collision with root package name */
    public static final ph.e f435818m = new ph.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f435819a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f435820b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f435821c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f435822d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435823e;

    /* renamed from: f, reason: collision with root package name */
    public long f435824f;

    /* renamed from: g, reason: collision with root package name */
    public long f435825g;

    /* renamed from: h, reason: collision with root package name */
    public ph.d f435826h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicBoolean f435827i;

    /* renamed from: j, reason: collision with root package name */
    public qh.f0 f435828j;

    public t(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f435819a = context;
        this.f435820b = jz5.h.b(ph.j.f435798d);
        this.f435821c = jz5.h.b(ph.k.f435799d);
        this.f435822d = jz5.h.b(new ph.i(this));
        this.f435823e = true;
        this.f435824f = wh.m.j(context);
        this.f435825g = wh.m.l(context);
    }

    public static final void a(ph.t tVar, boolean z17) {
        tVar.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            tVar.e(z17);
        } else {
            tVar.m().post(new ph.n(tVar, z17));
        }
    }

    public static final ph.t k() {
        return f435818m.a();
    }

    public static final boolean o() {
        return f435818m.b();
    }

    public final void b(ph.h listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (l()) {
            if (!l().contains(listener)) {
                l().add(listener);
            }
        }
    }

    public final ph.c c() {
        ph.c cVar = new ph.c(this.f435819a);
        qh.f0 f0Var = this.f435828j;
        if (f0Var != null) {
            cVar.f435788a = f0Var;
        }
        return cVar;
    }

    public final void d(long j17) {
        oj.j.c("Matrix.battery.LifeCycle", "onAppLowEnergy >> " + (j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) + "min", new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                if (((ph.h) it.next()).d(c17, j17)) {
                    it.remove();
                }
            }
        }
    }

    public final void e(boolean z17) {
        oj.j.c("Matrix.battery.LifeCycle", "dispatchBatteryChargingChanged", new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if ((hVar instanceof ph.g) && ((ph.g) hVar).g(c17, z17)) {
                    it.remove();
                }
            }
        }
    }

    public final void f() {
        oj.j.c("Matrix.battery.LifeCycle", "dispatchBatteryFullCharged", new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if ((hVar instanceof ph.g) && ((ph.g) hVar).e(c17)) {
                    it.remove();
                }
            }
        }
    }

    public final void g(int i17) {
        oj.j.c("Matrix.battery.LifeCycle", "onBatteryPowerChanged >> " + i17 + '%', new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if ((hVar instanceof ph.g) && ((ph.g) hVar).a(c17, i17)) {
                    it.remove();
                }
            }
        }
    }

    public final void h(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.BATTERY_OKAY", action) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.BATTERY_LOW", action)) {
            throw new java.lang.IllegalStateException("Illegal battery state: " + action);
        }
        oj.j.c("Matrix.battery.LifeCycle", "onBatteryStateChanged >> " + action, new java.lang.Object[0]);
        synchronized (l()) {
            c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if (hVar instanceof ph.g) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.BATTERY_LOW", action);
                    ((ph.f) ((ph.g) hVar)).getClass();
                    if (!r2.f435796a) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void i(int i17) {
        oj.j.c("Matrix.battery.LifeCycle", "onBatteryTemperatureChanged >> " + (i17 / 10.0f) + "°C", new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if ((hVar instanceof ph.g) && ((ph.g) hVar).c(c17, i17)) {
                    it.remove();
                }
            }
        }
    }

    public final void j(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        oj.j.c("Matrix.battery.LifeCycle", "onSateChanged >> " + intent.getAction(), new java.lang.Object[0]);
        synchronized (l()) {
            ph.c c17 = c();
            java.util.Iterator it = l().iterator();
            while (it.hasNext()) {
                ph.h hVar = (ph.h) it.next();
                if (hVar instanceof ph.g) {
                    if (((ph.g) hVar).f(c17, java.lang.String.valueOf(intent.getAction()))) {
                        it.remove();
                    }
                } else if (hVar.b(java.lang.String.valueOf(intent.getAction()))) {
                    it.remove();
                }
            }
        }
    }

    public final java.util.List l() {
        return (java.util.List) ((jz5.n) this.f435820b).mo141623x754a37bb();
    }

    public final android.os.Handler m() {
        return (android.os.Handler) ((jz5.n) this.f435821c).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x006a, code lost:
    
        if (r9.equals("android.os.action.CHARGING") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007e, code lost:
    
        if (r9.equals("android.intent.action.ACTION_POWER_DISCONNECTED") != false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0057. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "}, charging="
            java.lang.String r1 = "#handleChargingEvents: in-consistent, action="
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f435827i
            r3 = 1
            if (r2 != 0) goto L23
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f435827i     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L1e
            android.content.Context r9 = r8.f435819a     // Catch: java.lang.Throwable -> L20
            boolean r9 = wh.m.w(r9)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L20
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L20
            r8.f435827i = r10     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)
            return r3
        L1e:
            monitor-exit(r8)
            goto L23
        L20:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L23:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f435827i
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            monitor-enter(r2)
            android.content.Context r4 = r8.f435819a     // Catch: java.lang.Throwable -> Lcf
            boolean r4 = wh.m.w(r4)     // Catch: java.lang.Throwable -> Lcf
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.f435827i     // Catch: java.lang.Throwable -> Lcf
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> Lcf
            r6 = 0
            if (r5 == r4) goto L3d
            r5 = r3
            goto L3e
        L3d:
            r5 = r6
        L3e:
            if (r5 == 0) goto L51
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f435827i     // Catch: java.lang.Throwable -> Lcf
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)     // Catch: java.lang.Throwable -> Lcf
            r9.set(r4)     // Catch: java.lang.Throwable -> Lcf
            ph.d r9 = r8.f435826h     // Catch: java.lang.Throwable -> Lcf
            if (r9 == 0) goto L4f
            r9.a()     // Catch: java.lang.Throwable -> Lcf
        L4f:
            monitor-exit(r2)
            return r3
        L51:
            if (r10 == 0) goto Lcd
            int r10 = r9.hashCode()     // Catch: java.lang.Throwable -> Lcf
            switch(r10) {
                case -1886648615: goto L78;
                case -54942926: goto L6f;
                case 948344062: goto L64;
                case 1019184907: goto L5b;
                default: goto L5a;
            }     // Catch: java.lang.Throwable -> Lcf
        L5a:
            goto L83
        L5b:
            java.lang.String r10 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r10 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lcf
            if (r10 == 0) goto L83
            goto L6c
        L64:
            java.lang.String r10 = "android.os.action.CHARGING"
            boolean r10 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lcf
            if (r10 == 0) goto L83
        L6c:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcf
            goto L84
        L6f:
            java.lang.String r10 = "android.os.action.DISCHARGING"
            boolean r10 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lcf
            if (r10 == 0) goto L83
            goto L80
        L78:
            java.lang.String r10 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r10 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lcf
            if (r10 == 0) goto L83
        L80:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lcf
            goto L84
        L83:
            r10 = 0
        L84:
            if (r10 == 0) goto L8f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> Lcf
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r7)     // Catch: java.lang.Throwable -> Lcf
            goto L90
        L8f:
            r10 = r3
        L90:
            if (r10 != 0) goto Lcd
            java.lang.String r10 = "Matrix.battery.LifeCycle"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Lcf
            r7.append(r9)     // Catch: java.lang.Throwable -> Lcf
            r7.append(r0)     // Catch: java.lang.Throwable -> Lcf
            r7.append(r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r0 = ", hasChanged="
            r7.append(r0)     // Catch: java.lang.Throwable -> Lcf
            r7.append(r5)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lcf
            oj.j.f(r10, r0, r1)     // Catch: java.lang.Throwable -> Lcf
            android.content.Context r10 = r8.f435819a     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r0 = "onEvent"
            wh.m.b(r10, r0)     // Catch: java.lang.Throwable -> Lcf
            ph.d r10 = r8.f435826h     // Catch: java.lang.Throwable -> Lcf
            if (r10 != 0) goto Lcd
            ph.d r10 = new ph.d     // Catch: java.lang.Throwable -> Lcf
            if (r4 != 0) goto Lc4
            goto Lc5
        Lc4:
            r3 = r6
        Lc5:
            r10.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> Lcf
            r8.f435826h = r10     // Catch: java.lang.Throwable -> Lcf
            r10.c()     // Catch: java.lang.Throwable -> Lcf
        Lcd:
            monitor-exit(r2)
            return r6
        Lcf:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.t.n(java.lang.String, boolean):boolean");
    }

    public final void p(ph.h listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (l()) {
            java.util.ListIterator listIterator = l().listIterator();
            while (listIterator.hasNext()) {
                if (((ph.h) listIterator.next()) == listener) {
                    listIterator.remove();
                }
            }
        }
    }

    public final void q() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        int i17 = android.os.Build.VERSION.SDK_INT;
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        qh.f0 f0Var = this.f435828j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
        android.content.Context d17 = f0Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "mCore!!.context");
        intentFilter.addAction(wh.e1.a(d17));
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.C4631x434b2cf5 c4631x434b2cf5 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.C4631x434b2cf5(this);
        android.content.Context context = this.f435819a;
        if (i17 < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(c4631x434b2cf5, intentFilter);
        } else {
            context.registerReceiver(c4631x434b2cf5, intentFilter, 4);
        }
    }
}
