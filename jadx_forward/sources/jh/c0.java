package jh;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f381206a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f381207b;

    /* renamed from: c, reason: collision with root package name */
    public jh.d0 f381208c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f381209d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f381210e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f381211f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f381212g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f381213h;

    /* renamed from: i, reason: collision with root package name */
    public final jh.f0 f381214i;

    /* renamed from: j, reason: collision with root package name */
    public final long f381215j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f381216k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f381217l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381218m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f381219n;

    /* renamed from: o, reason: collision with root package name */
    public final jh.g0 f381220o;

    public c0(android.content.Context context, jh.g0 g0Var) {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f381207b = hashSet;
        this.f381208c = jh.d0.Quicken;
        this.f381209d = false;
        this.f381210e = false;
        this.f381211f = true;
        this.f381212g = false;
        this.f381213h = true;
        this.f381214i = jh.f0.WhileScreenOff;
        this.f381215j = 3000L;
        this.f381216k = false;
        this.f381217l = false;
        this.f381218m = null;
        this.f381219n = false;
        this.f381206a = context;
        this.f381220o = g0Var;
        hashSet.add(context.getApplicationInfo().nativeLibraryDir);
        hashSet.add(jh.g0.b());
        hashSet.add(jh.g0.a(context));
        synchronized (jh.a.class) {
            if (jh.a.f381200a == null) {
                jh.a.f381200a = jh.a.a(context, android.os.Process.myPid());
            }
            str = jh.a.f381200a;
        }
        this.f381212g = context.getPackageName().equalsIgnoreCase(str);
    }

    public void a() {
        java.lang.String str;
        if (this.f381219n) {
            return;
        }
        this.f381219n = true;
        jh.g0 g0Var = this.f381220o;
        g0Var.getClass();
        android.content.Context context = this.f381206a;
        synchronized (jh.a.class) {
            if (jh.a.f381200a == null) {
                jh.a.f381200a = jh.a.a(context, android.os.Process.myPid());
            }
            str = jh.a.f381200a;
        }
        if (str != null && str.endsWith(":backtrace__")) {
            oj.j.c("Matrix.Backtrace", "Isolate process does not need any configuration.", new java.lang.Object[0]);
            return;
        }
        if (!jh.g0.f381237g) {
            jh.g0.d();
            jh.g0.f381237g = true;
        }
        com.p314xaae8f345.p552xbf8d97c1.p591x382fcc.C4726xdb7b5f03.a(this.f381218m);
        com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40740x8f3298f3(this.f381216k);
        oj.j.c("Matrix.Backtrace", m140895x9616526c(), new java.lang.Object[0]);
        jh.d0 d0Var = this.f381208c;
        jh.d0 d0Var2 = jh.d0.Fp;
        if (d0Var == d0Var2 || d0Var == jh.d0.Dwarf) {
            com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40744x62fa263f(d0Var.f381228d);
        }
        jh.d0 d0Var3 = this.f381208c;
        jh.d0 d0Var4 = jh.d0.Quicken;
        if (d0Var3 == d0Var4 || d0Var3 == jh.d0.FpUntilQuickenWarmedUp || d0Var3 == jh.d0.DwarfUntilQuickenWarmedUp || this.f381210e) {
            java.lang.String b17 = jh.a0.b(this);
            oj.j.c("Matrix.Backtrace", "Set saving path: %s", b17);
            new java.io.File(b17).mkdirs();
            java.lang.String str2 = java.io.File.separator;
            if (!b17.endsWith(str2)) {
                b17 = b17 + str2;
            }
            g0Var.f381241d.f381259b = b17;
            com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40747x5d104441(b17);
            if (this.f381212g) {
                android.content.Context context2 = this.f381206a;
                java.io.File l17 = jh.a0.l(context2);
                if (this.f381211f && l17.exists()) {
                    java.lang.String h17 = jh.a0.h(l17, 4096);
                    if (h17 == null) {
                        this.f381209d = true;
                    } else if (!h17.split("\n")[0].equalsIgnoreCase(context2.getApplicationInfo().nativeLibraryDir)) {
                        oj.j.c("Matrix.Backtrace", "Apk updated, remove warmed-up file.", new java.lang.Object[0]);
                        this.f381209d = true;
                    }
                }
                if (this.f381209d) {
                    l17.delete();
                    jh.a0.j(context2).delete();
                }
            }
            jh.m mVar = g0Var.f381241d;
            synchronized (mVar.f381264g) {
                boolean[] zArr = mVar.f381264g;
                if (!zArr[0]) {
                    zArr[0] = true;
                    mVar.f381263f = this;
                    mVar.f381258a = this.f381213h;
                    mVar.f381261d = new jh.k("WeChatBacktraceTask");
                    mVar.f381262e = new jh.t(mVar, this.f381206a, this.f381214i, this.f381215j);
                    if (this.f381212g) {
                        android.content.Context context3 = this.f381206a;
                        if (!jh.a0.l(context3).exists()) {
                            oj.j.c("Matrix.WarmUpDelegate", "Has not been warmed up", new java.lang.Object[0]);
                            jh.t tVar = mVar.f381262e;
                            tVar.f381288f.post(new jh.q(tVar, jh.s.WarmUp));
                        }
                        if (jh.a0.g(context3)) {
                            oj.j.c("Matrix.WarmUpDelegate", "Need clean up", new java.lang.Object[0]);
                            jh.t tVar2 = mVar.f381262e;
                            tVar2.f381288f.post(new jh.q(tVar2, jh.s.CleanUp));
                        }
                        if (jh.a0.i(context3)) {
                            oj.j.c("Matrix.WarmUpDelegate", "Should schedule disk usage task.", new java.lang.Object[0]);
                            jh.t tVar3 = mVar.f381262e;
                            tVar3.f381288f.post(new jh.q(tVar3, jh.s.DiskUsage));
                        }
                    }
                }
            }
            boolean exists = jh.a0.l(this.f381206a).exists();
            jh.d0 d0Var5 = this.f381208c;
            if (d0Var5 == d0Var4 || !this.f381210e) {
                if (!exists) {
                    if (d0Var5 != jh.d0.FpUntilQuickenWarmedUp) {
                        if (d0Var5 == jh.d0.DwarfUntilQuickenWarmedUp) {
                            d0Var2 = jh.d0.Dwarf;
                        }
                    }
                    com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40744x62fa263f(d0Var2.f381228d);
                }
                d0Var2 = d0Var4;
                com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40744x62fa263f(d0Var2.f381228d);
            }
            oj.j.c("Matrix.Backtrace", "Has warmed up: %s", java.lang.Boolean.valueOf(exists));
            com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40748x9432d221(exists);
            if (!g0Var.f381243f) {
                g0Var.f381243f = false;
                g0Var.f381242e.postDelayed(new jh.b0(g0Var), 21600000L);
            }
            if (!this.f381212g) {
                jh.m mVar2 = g0Var.f381241d;
                jh.d0 d0Var6 = this.f381208c;
                synchronized (mVar2) {
                    if (!jh.a0.l(this.f381206a).exists()) {
                        if (mVar2.f381260c == null) {
                            mVar2.f381260c = new jh.l(d0Var6);
                            oj.j.c("Matrix.WarmUpDelegate", "Register warm-up receiver.", new java.lang.Object[0]);
                            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                            intentFilter.addAction("action.backtrace.warmed-up");
                            if (android.os.Build.VERSION.SDK_INT < 33 || this.f381206a.getApplicationInfo().targetSdkVersion < 34) {
                                this.f381206a.registerReceiver(mVar2.f381260c, intentFilter, this.f381206a.getPackageName() + ".backtrace.warmed_up", null);
                            } else {
                                this.f381206a.registerReceiver(mVar2.f381260c, intentFilter, this.f381206a.getPackageName() + ".backtrace.warmed_up", null, 4);
                            }
                        }
                    }
                }
            }
        }
        g0Var.f381239b = true;
    }

    /* renamed from: toString */
    public java.lang.String m140895x9616526c() {
        return "\nWeChat backtrace configurations: \n>>> Backtrace Mode: " + this.f381208c + "\n>>> Quicken always on: " + this.f381210e + "\n>>> Saving Path: " + jh.a0.b(this) + "\n>>> Custom Library Loader: false\n>>> Directories to Warm-up: " + this.f381207b.toString() + "\n>>> Is Warm-up Process: " + this.f381212g + "\n>>> Warm-up Timing: " + this.f381214i + "\n>>> Warm-up Delay: " + this.f381215j + "ms\n>>> Warm-up in isolate process: " + this.f381213h + "\n>>> Enable logger: " + this.f381216k + "\n>>> Enable Isolate Process logger: " + this.f381217l + "\n>>> Path of XLog: " + this.f381218m + "\n>>> Cool-down: " + this.f381209d + "\n>>> Cool-down if Apk Updated: " + this.f381211f + "\n";
    }
}
