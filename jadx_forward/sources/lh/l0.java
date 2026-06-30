package lh;

/* loaded from: classes12.dex */
public final class l0 extends lh.i {

    /* renamed from: f, reason: collision with root package name */
    public static final lh.h0 f400142f = new lh.h0(null);

    /* renamed from: g, reason: collision with root package name */
    public static final lh.l0 f400143g = new lh.l0();

    /* renamed from: h, reason: collision with root package name */
    public static final long f400144h = 300000;

    /* renamed from: i, reason: collision with root package name */
    public static final long f400145i = 600000;

    /* renamed from: j, reason: collision with root package name */
    public static final long f400146j = 60000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f400148b;

    /* renamed from: c, reason: collision with root package name */
    public long f400149c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f400147a = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f400150d = new lh.j0(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f400151e = new lh.i0(this);

    @Override // lh.i, lh.j
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#onClear");
        ((java.util.HashMap) this.f400147a).clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("acc-power-stats.bin").d();
        boolean z17 = mm.w.f410075a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "#clear");
        mm.y yVar = mm.w.f410078d;
        yVar.f410103c = 0L;
        yVar.f410106f = 0L;
        mm.y yVar2 = mm.w.f410080f;
        yVar2.f410103c = 0L;
        yVar2.f410106f = 0L;
        mm.y yVar3 = mm.w.f410084j;
        yVar3.f410103c = 0L;
        yVar3.f410106f = 0L;
        mm.w.f410077c = 0L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("notify-inspect.bin").d();
    }

    @Override // lh.i, lh.j
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#onFlushing");
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "schedule SaveStats, delay=600000");
            qh.f0 f0Var = e17.f435829h;
            android.os.Handler handler = f0Var.f444870f;
            java.lang.Runnable runnable = this.f400150d;
            handler.removeCallbacks(runnable);
            f0Var.f444870f.postDelayed(runnable, 600000L);
            this.f400149c = java.lang.System.currentTimeMillis();
        }
    }

    @Override // lh.i, lh.j
    public void c(long j17) {
        if (f400142f.a()) {
            synchronized (this.f400147a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#report, periodMs=" + j17 + ", size=" + ((java.util.HashMap) this.f400147a).size());
                java.util.Iterator it = ((java.util.HashMap) this.f400147a).entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb) entry.getValue();
                    lh.k0 k0Var = new lh.k0(c4627xadd9bddb, j17, str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4627xadd9bddb, "<this>");
                    c4627xadd9bddb.m40834x32c52b(new mh.a(k0Var, c4627xadd9bddb));
                    it.remove();
                }
            }
        }
    }

    @Override // lh.i, lh.j
    public void f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f400142f.a()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("acc-power-stats.bin");
            java.lang.String[] b17 = M.b();
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    mh.k kVar = mh.k.f407804a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb) kVar.a(str, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb.class, "acc-power-stats.bin");
                    if (c4627xadd9bddb != null) {
                        hashMap.put(c4627xadd9bddb.getAccName(), c4627xadd9bddb);
                    } else {
                        M.remove(str);
                    }
                }
            }
            synchronized (this.f400147a) {
                ((java.util.HashMap) this.f400147a).clear();
                ((java.util.HashMap) this.f400147a).putAll(hashMap);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#init, size=" + ((java.util.HashMap) this.f400147a).size());
            this.f400148b = true;
            mm.w.c();
        }
    }

    public final void g(java.lang.String accName, gi.w0 monitors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accName, "accName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(monitors, "monitors");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#collect: ".concat(accName));
        java.util.Map map = this.f400147a;
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb) ((java.util.HashMap) map).get(accName);
        if (c4627xadd9bddb == null) {
            c4627xadd9bddb = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb(accName);
            ((java.util.HashMap) map).put(accName, c4627xadd9bddb);
        }
        c4627xadd9bddb.acc(monitors);
    }

    public final void h() {
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            qh.f0 f0Var = e17.f435829h;
            android.os.Handler handler = f0Var.f444870f;
            java.lang.Runnable runnable = this.f400151e;
            handler.removeCallbacks(runnable);
            f0Var.f444870f.postDelayed(runnable, f400146j);
        }
    }

    public final java.lang.String i() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().a("clicfg_battery_acc_power_bg_poll", "0", false, true), "1") ? "ExplicitBgPoll" : "ExplicitBg";
    }

    public final java.lang.String j() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().a("clicfg_battery_acc_power_fg_poll", "0", false, true), "1") ? "ExplicitFgPoll" : "ExplicitFg";
    }
}
