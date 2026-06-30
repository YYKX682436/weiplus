package gi;

/* loaded from: classes12.dex */
public class w0 extends rh.c1 {

    /* renamed from: z, reason: collision with root package name */
    public static gi.c1 f353736z;

    /* renamed from: u, reason: collision with root package name */
    public gi.b1 f353737u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f353738v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g f353739w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f353740x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f353741y;

    public w0(qh.f0 f0Var, java.lang.String str) {
        super(f0Var, str);
        this.f353740x = new java.lang.Runnable() { // from class: gi.w0$$i
            @Override // java.lang.Runnable
            public final void run() {
                gi.w0 w0Var = gi.w0.this;
                w0Var.getClass();
                w0Var.f476860i.putBoolean("extra_running_app_task", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.d());
            }
        };
        this.f353741y = new gi.x0(this);
        this.f353737u = new gi.b1(this);
    }

    public static rh.d3 L(java.lang.Class cls, rh.d3 d3Var) {
        if (cls.isAssignableFrom(d3Var.getClass())) {
            return d3Var;
        }
        throw new java.lang.IllegalStateException("expected " + cls + ", but actual " + d3Var.getClass());
    }

    @Override // rh.c1
    public rh.c1 G() {
        super.G();
        F(gi.j.class);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0030, B:7:0x005d, B:9:0x0068, B:10:0x0070, B:17:0x00a5, B:19:0x00c4, B:61:0x00ae, B:62:0x00b7, B:63:0x0074, B:66:0x007f, B:69:0x0089, B:72:0x0093, B:76:0x004b), top: B:3:0x0030 }] */
    @Override // rh.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.w0.I():void");
    }

    @Override // rh.c1
    public rh.d3 J(java.lang.Class snapshotClass) {
        rh.d3 d3Var;
        kh.t1 s3Var;
        kh.k1 k1Var;
        kh.t1 w0Var;
        gi.y1 y1Var;
        qh.f0 f0Var;
        float f17;
        android.content.Intent registerReceiver;
        if (snapshotClass == gi.j.class) {
            gi.j jVar = new gi.j();
            jVar.f353593d = rh.x2.b(java.lang.Long.valueOf(gi.d.f353547v));
            jVar.f353594e = rh.x2.b(java.lang.Integer.valueOf(jk.b.f381579b));
            try {
                registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (java.lang.Exception unused) {
            }
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 > 0) {
                    f17 = (intExtra * 100.0f) / intExtra2;
                    jVar.f353595f = rh.x2.b(java.lang.Float.valueOf(f17));
                    L(snapshotClass, jVar);
                    return jVar;
                }
            }
            f17 = -1.0f;
            jVar.f353595f = rh.x2.b(java.lang.Float.valueOf(f17));
            L(snapshotClass, jVar);
            return jVar;
        }
        if (snapshotClass == mm.a0.class) {
            mm.a0 b17 = mm.a0.b();
            L(snapshotClass, b17);
            return b17;
        }
        if (snapshotClass == oh.b.class) {
            oh.b bVar = new oh.b();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            bVar.f426708d = rh.x2.b(java.lang.Integer.valueOf(wh.m.i(context)));
            L(snapshotClass, bVar);
            return bVar;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.t2) i95.n0.c(ob0.t2.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotClass, "snapshotClass");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, cr0.k0.class)) {
            cr0.k0 k0Var = new cr0.k0();
            cr0.u0 g17 = cr0.u1.f303293a.g();
            d3Var = k0Var;
            if (g17.f303290a) {
                g17.c().m40834x32c52b(new cr0.i0(k0Var, g17));
                d3Var = k0Var;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, cr0.j.class)) {
            dr0.m mVar = (dr0.m) ((lh.k) i95.n0.c(lh.k.class));
            mVar.getClass();
            mVar.Ni(new dr0.g(mVar));
            d3Var = cr0.j.f303187j.a();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, cr0.n3.class)) {
            cr0.n3 n3Var = new cr0.n3();
            cr0.w3 w3Var = cr0.w3.f303333a;
            d3Var = n3Var;
            if (w3Var.b()) {
                w3Var.a().m40834x32c52b(new cr0.l3(n3Var));
                d3Var = n3Var;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, cr0.p.class)) {
            dr0.m mVar2 = (dr0.m) ((lh.k) i95.n0.c(lh.k.class));
            mVar2.getClass();
            mVar2.Ni(new dr0.g(mVar2));
            d3Var = cr0.p.f303238m.a();
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, gi.x1.class) && (y1Var = (gi.y1) ph.a.a(gi.y1.class)) != null) {
                w0Var = new gi.x1(10);
                kh.d2 d2Var = (kh.d2) y1Var.f389307k.mo141623x754a37bb();
                d2Var.getClass();
                if (kh.d2.f389311c.a()) {
                    d2Var.b().m40834x32c52b(new kh.a2(d2Var, w0Var));
                }
            } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, kh.w0.class) || (k1Var = (kh.k1) ph.a.a(kh.k1.class)) == null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, kh.a0.class)) {
                    kh.b0 b0Var = kh.b0.f389289f;
                    b0Var.getClass();
                    s3Var = new kh.a0();
                    kh.d2 d2Var2 = (kh.d2) b0Var.f389400e.mo141623x754a37bb();
                    d2Var2.getClass();
                    if (kh.d2.f389311c.a()) {
                        d2Var2.b().m40834x32c52b(new kh.a2(d2Var2, s3Var));
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, kh.f.class)) {
                    kh.g gVar = kh.g.f389335f;
                    gVar.getClass();
                    s3Var = new kh.f();
                    kh.d2 d2Var3 = (kh.d2) gVar.f389400e.mo141623x754a37bb();
                    d2Var3.getClass();
                    if (kh.d2.f389311c.a()) {
                        d2Var3.b().m40834x32c52b(new kh.a2(d2Var3, s3Var));
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, kh.s3.class)) {
                    kh.t3 t3Var = kh.t3.f389455f;
                    t3Var.getClass();
                    s3Var = new kh.s3();
                    kh.d2 d2Var4 = (kh.d2) t3Var.f389400e.mo141623x754a37bb();
                    d2Var4.getClass();
                    if (kh.d2.f389311c.a()) {
                        d2Var4.b().m40834x32c52b(new kh.a2(d2Var4, s3Var));
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, cr0.d3.class)) {
                    cr0.d3 d3Var2 = new cr0.d3();
                    d3Var = d3Var2;
                    if (cr0.k3.f303199a.a()) {
                        cr0.k3.f303201c.m40834x32c52b(new cr0.b3(d3Var2));
                        d3Var = d3Var2;
                    }
                } else {
                    d3Var = null;
                }
                d3Var = s3Var;
            } else {
                w0Var = new kh.w0(10);
                kh.d2 d2Var5 = (kh.d2) k1Var.f389307k.mo141623x754a37bb();
                d2Var5.getClass();
                if (kh.d2.f389311c.a()) {
                    d2Var5.b().m40834x32c52b(new kh.a2(d2Var5, w0Var));
                }
            }
            d3Var = w0Var;
        }
        if (d3Var != null) {
            L(snapshotClass, d3Var);
            return d3Var;
        }
        rh.d3 J2 = super.J(snapshotClass);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.MMCompositeMonitors", "undefined snapshot type: " + snapshotClass);
            return null;
        }
        L(snapshotClass, J2);
        if ((J2 instanceof uh.g) && (f0Var = this.f476862k) != null) {
            gi.u0.d(f0Var.d());
        }
        L(snapshotClass, J2);
        return J2;
    }

    @Override // rh.c1
    public rh.c3 K(java.lang.Class snapshotClass) {
        ph.u uVar;
        java.util.Map map = this.f476856e;
        qh.f0 f0Var = this.f476862k;
        rh.c3 c3Var = null;
        if (snapshotClass == gi.k.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var2 = new rh.c3("dev-light", f0Var.f444870f, new wh.u0() { // from class: gi.w0$$a
                @Override // wh.u0
                /* renamed from: apply */
                public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
                    rh.c3 c3Var3 = (rh.c3) obj;
                    qh.f0 f0Var2 = gi.w0.this.f476862k;
                    if (f0Var2 == null) {
                        return Integer.MIN_VALUE;
                    }
                    int i17 = android.provider.Settings.System.getInt(f0Var2.d().getContentResolver(), "screen_brightness", Integer.MIN_VALUE);
                    android.os.SystemClock.uptimeMillis();
                    int intValue = ((java.lang.Integer) rh.x2.b(java.lang.Integer.valueOf(i17)).f477085a).intValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var3.f476879g + " " + c3Var3.f476873a + ", val = " + intValue);
                    return java.lang.Integer.valueOf(intValue);
                }
            });
            ((java.util.HashMap) map).put(snapshotClass, c3Var2);
            return c3Var2;
        }
        if (snapshotClass == gi.n.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var3 = new rh.c3("net-radio-sig", f0Var.f444870f, new wh.u0() { // from class: gi.w0$$c
                @Override // wh.u0
                /* renamed from: apply */
                public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
                    rh.c3 c3Var4 = (rh.c3) obj;
                    if (gi.w0.this.f476862k == null) {
                        return Integer.MIN_VALUE;
                    }
                    long m40100x9d8d85b4 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40100x9d8d85b4();
                    android.os.SystemClock.uptimeMillis();
                    long longValue = ((java.lang.Long) rh.x2.b(java.lang.Long.valueOf(m40100x9d8d85b4)).f477085a).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var4.f476879g + " " + c3Var4.f476873a + ", val = " + longValue);
                    return java.lang.Long.valueOf(longValue);
                }
            });
            ((java.util.HashMap) map).put(snapshotClass, c3Var3);
            return c3Var3;
        }
        if (snapshotClass == gi.o.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var4 = new rh.c3("net-wifi-sig", f0Var.f444870f, new wh.u0() { // from class: gi.w0$$d
                @Override // wh.u0
                /* renamed from: apply */
                public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
                    rh.c3 c3Var5 = (rh.c3) obj;
                    if (gi.w0.this.f476862k == null) {
                        return Integer.MIN_VALUE;
                    }
                    long m40101xf0ac4f74 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40101xf0ac4f74();
                    android.os.SystemClock.uptimeMillis();
                    long longValue = ((java.lang.Long) rh.x2.b(java.lang.Long.valueOf(m40101xf0ac4f74)).f477085a).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var5.f476879g + " " + c3Var5.f476873a + ", val = " + longValue);
                    return java.lang.Long.valueOf(longValue);
                }
            });
            ((java.util.HashMap) map).put(snapshotClass, c3Var4);
            return c3Var4;
        }
        if (snapshotClass == gi.m.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var5 = new rh.c3("oppo-thermal", f0Var.f444870f, new gi.C28413x6a34aac());
            ((java.util.HashMap) map).put(snapshotClass, c3Var5);
            return c3Var5;
        }
        if (snapshotClass == gi.l.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var6 = new rh.c3("oppo-temp", f0Var.f444870f, new gi.C28414x6a34aad());
            ((java.util.HashMap) map).put(snapshotClass, c3Var6);
            return c3Var6;
        }
        if (snapshotClass == gi.h.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var7 = new rh.c3("batt-currAvg", f0Var.f444870f, new wh.u0() { // from class: gi.w0$$g
                @Override // wh.u0
                /* renamed from: apply */
                public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
                    long j17;
                    rh.c3 c3Var8 = (rh.c3) obj;
                    try {
                        j17 = ((android.os.BatteryManager) gi.w0.this.f476862k.d().getSystemService("batterymanager")).getLongProperty(3);
                    } catch (java.lang.Exception unused) {
                        j17 = -1;
                    }
                    android.os.SystemClock.uptimeMillis();
                    long longValue = ((java.lang.Long) rh.x2.b(java.lang.Long.valueOf(j17)).f477085a).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.MMCompositeMonitors", "onSampling " + c3Var8.f476879g + " " + c3Var8.f476873a + ", val = " + longValue);
                    return java.lang.Long.valueOf(longValue);
                }
            });
            ((java.util.HashMap) map).put(snapshotClass, c3Var7);
            return c3Var7;
        }
        if (snapshotClass == oh.c.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var8 = new rh.c3("batt-voltage", f0Var.f444870f, new gi.C28416x6a34aaf());
            ((java.util.HashMap) map).put(snapshotClass, c3Var8);
            return c3Var8;
        }
        java.lang.String str = this.f476870s;
        if (("module".equals(str) || "alertThermal".equals(str) || "alertBatt".equals(str) || "dataSampling".equals(str) || "finderFeed".equals(str)) && snapshotClass == rh.r1.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var9 = new rh.c3("batt-curr", f0Var.f444870f, new gi.z0(this));
            ((java.util.HashMap) map).put(snapshotClass, c3Var9);
            this.f476860i.putBoolean("extra_batt_curr_rectify", true);
            return c3Var9;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.t2) i95.n0.c(ob0.t2.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotClass, "snapshotClass");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(snapshotClass, oh.f.class) && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null) {
            c3Var = new rh.c3("gpu-busy", uVar.f435829h.f444870f, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p.f149157a);
        }
        if (c3Var == null) {
            return super.K(snapshotClass);
        }
        ((java.util.HashMap) map).put(snapshotClass, c3Var);
        return c3Var;
    }

    @Override // rh.c1
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public gi.w0 m() {
        gi.w0 w0Var;
        synchronized (this.f353740x) {
            w0Var = new gi.w0(this.f476862k, this.f476870s);
            n(w0Var);
            gi.b1 b1Var = this.f353737u;
            gi.b1 b1Var2 = new gi.b1(b1Var.f353522a);
            ((java.util.ArrayList) b1Var2.f353523b).addAll(b1Var.f353523b);
            w0Var.f353737u = b1Var2;
        }
        return w0Var;
    }

    public long N(java.lang.String str, boolean z17, boolean z18) {
        rh.o2 t17 = t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
        if (t17 == null) {
            oj.j.f("MicroMsg.battery.MMCompositeMonitors", com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class + " should be metrics to get CpuLoad", new java.lang.Object[0]);
            return -1L;
        }
        long j17 = 0;
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) t17.f477019c).f134095h.f477093a) {
            if (threadJiffiesEntry.f134099c.startsWith(str) && (!z18 || !threadJiffiesEntry.f134100d)) {
                j17 += ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                if (!z17) {
                    break;
                }
            }
        }
        return j17;
    }

    public boolean O() {
        rh.o2 t17;
        if (this.f476863l == null || (t17 = t(uh.g.class)) == null) {
            return false;
        }
        rh.d3 d3Var = t17.f477017a;
        return ((uh.g) d3Var).f509210d != null ? uh.i.p((double) ((((float) ((uh.g) d3Var).f509210d.f509203a) * 1.0f) / ((float) this.f476863l.f444854n)), 2) >= 0.800000011920929d : uh.f.b((uh.g) d3Var, (uh.g) t17.f477018b);
    }

    public boolean P() {
        qh.b bVar = this.f476863l;
        if (bVar != null) {
            long j17 = this.f476860i.getLong("extra_report_during", java.lang.Math.max(gi.d.f353538m, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d));
            if (j17 > 0 && bVar.f444854n > j17) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0030, B:7:0x005c, B:9:0x0065, B:10:0x006f, B:17:0x00a4, B:19:0x00c3, B:34:0x00ae, B:35:0x00b7, B:36:0x0073, B:39:0x007e, B:42:0x0088, B:45:0x0092, B:49:0x004a), top: B:3:0x0030 }] */
    @Override // rh.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.w0.a():void");
    }

    @Override // rh.c1
    public void b() {
        synchronized (this.f353740x) {
            this.f353737u.b();
            super.b();
            this.f353739w = null;
            if (this.f353738v != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " clear DeepBg stat");
                ((java.util.ArrayList) this.f353738v).clear();
            }
        }
    }

    @Override // rh.c1
    public void c() {
        if (this.f476862k != null && "canary".equals(this.f476870s)) {
            q(new wh.t0() { // from class: gi.w0$$j
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    final qh.b bVar = (qh.b) obj;
                    final gi.w0 w0Var = gi.w0.this;
                    w0Var.getClass();
                    w0Var.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new wh.t0() { // from class: gi.w0$$k
                        @Override // wh.t0
                        /* renamed from: accept */
                        public final void mo40853xab27b508(java.lang.Object obj2) {
                            rh.o2 o2Var = (rh.o2) obj2;
                            gi.w0 w0Var2 = gi.w0.this;
                            w0Var2.getClass();
                            if (bVar.c() == 2) {
                                for (int i17 = 0; i17 < ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a.size(); i17++) {
                                    if (i17 >= 1 && !z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                                        return;
                                    }
                                    com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a.get(i17);
                                    java.util.HashMap hashMap = (java.util.HashMap) w0Var2.f476861j;
                                    if (!hashMap.containsKey(java.lang.String.valueOf(threadJiffiesEntry.f134098b))) {
                                        long max = java.lang.Math.max(1L, o2Var.f477020d / 60000);
                                        if (max < 5 || ((java.lang.Long) threadJiffiesEntry.f477085a).longValue() / max < 3000) {
                                            return;
                                        }
                                        java.lang.String a17 = w0Var2.f476862k.f444868d.A.a(threadJiffiesEntry.f134098b);
                                        if (!android.text.TextUtils.isEmpty(a17)) {
                                            hashMap.put(java.lang.String.valueOf(threadJiffiesEntry.f134098b), a17);
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0030, B:7:0x005c, B:9:0x0065, B:10:0x006f, B:17:0x00a4, B:19:0x00c3, B:63:0x00ae, B:64:0x00b7, B:65:0x0073, B:68:0x007e, B:71:0x0088, B:74:0x0092, B:78:0x004a), top: B:3:0x0030 }] */
    @Override // rh.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.w0.l():void");
    }

    @Override // rh.c1
    public java.lang.String y() {
        return ri.i.c(this);
    }
}
