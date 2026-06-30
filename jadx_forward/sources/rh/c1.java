package rh;

/* loaded from: classes12.dex */
public class c1 {

    /* renamed from: k, reason: collision with root package name */
    public final qh.f0 f476862k;

    /* renamed from: l, reason: collision with root package name */
    public qh.b f476863l;

    /* renamed from: n, reason: collision with root package name */
    public qh.g0 f476865n;

    /* renamed from: o, reason: collision with root package name */
    public rh.x0 f476866o;

    /* renamed from: p, reason: collision with root package name */
    public rh.w0 f476867p;

    /* renamed from: q, reason: collision with root package name */
    public wh.s0 f476868q;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f476870s;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f476852a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f476853b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f476854c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f476855d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f476856e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f476857f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f476858g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f476859h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Bundle f476860i = new android.os.Bundle();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f476861j = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f476864m = true;

    /* renamed from: r, reason: collision with root package name */
    public long f476869r = android.os.SystemClock.uptimeMillis();

    /* renamed from: t, reason: collision with root package name */
    public boolean f476871t = false;

    public c1(qh.f0 f0Var, java.lang.String str) {
        this.f476862k = f0Var;
        this.f476870s = str;
    }

    public static long f(long j17, long j18) {
        if (j18 > 0) {
            return ((float) j17) / (((float) j18) / 60000.0f);
        }
        throw new java.lang.IllegalArgumentException("Illegal millis: " + j18);
    }

    public int A() {
        int s17 = s();
        if (s17 == -1) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpu is invalid", new java.lang.Object[0]);
            return -1;
        }
        rh.b3 B = B(rh.w1.class);
        if (B == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpufreq is null", new java.lang.Object[0]);
            return -1;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) wh.m.q();
        if (arrayList.size() != wh.m.o()) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpuCore is invalid: " + arrayList.size() + " vs " + wh.m.o(), new java.lang.Object[0]);
        }
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int i17 = 0;
            for (int i18 : (int[]) it.next()) {
                if (i18 > i17) {
                    i17 = i18;
                }
            }
            j17 += i17;
        }
        if (j17 <= 0) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpufreq sum is invalid: " + j17, new java.lang.Object[0]);
            return -1;
        }
        double d17 = j17;
        if (B.f476849h >= d17) {
            oj.j.f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: sampling = " + B, new java.lang.Object[0]);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                oj.j.f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: freqs = " + java.util.Arrays.toString((int[]) it6.next()), new java.lang.Object[0]);
            }
        }
        return (int) ((s17 * B.f476849h) / d17);
    }

    public rh.b3 B(java.lang.Class cls) {
        return (rh.b3) ((java.util.HashMap) this.f476857f).get(cls);
    }

    public void C(java.lang.Class cls, wh.t0 t0Var) {
        rh.b3 B = B(cls);
        if (B != null) {
            t0Var.mo40853xab27b508(B);
        }
    }

    public java.util.List D(java.lang.Class cls) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f476858g).get(cls);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public boolean E() {
        boolean z17;
        synchronized (this) {
            z17 = this.f476871t;
        }
        return z17;
    }

    public rh.c1 F(java.lang.Class cls) {
        java.util.List list = this.f476852a;
        if (!((java.util.ArrayList) list).contains(cls)) {
            ((java.util.ArrayList) list).add(cls);
        }
        return this;
    }

    public rh.c1 G() {
        F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
        F(rh.k.class);
        F(rh.t3.class);
        F(rh.f1.class);
        F(rh.v.class);
        F(rh.w1.class);
        F(rh.t1.class);
        F(rh.n3.class);
        F(rh.z.class);
        F(rh.c4.class);
        F(rh.k2.class);
        return this;
    }

    public rh.c1 H(java.lang.Class cls, long j17) {
        ((java.util.HashMap) this.f476855d).put(cls, java.lang.Long.valueOf(j17));
        return this;
    }

    public void I() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #start: " + this.f476870s, new java.lang.Object[0]);
            this.f476871t = true;
            this.f476863l = null;
            if (this.f476864m && ph.t.o()) {
                qh.g0 g0Var = new qh.g0();
                this.f476865n = g0Var;
                g0Var.i();
            }
            this.f476869r = android.os.SystemClock.uptimeMillis();
            g();
            j();
            wh.s0 s0Var = this.f476868q;
            if (s0Var != null && s0Var.k()) {
                throw new java.lang.IllegalStateException("Leaked CallStackSampler?");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public rh.d3 J(java.lang.Class cls) {
        uh.h hVar;
        java.lang.String str;
        java.lang.String obj;
        rh.f1 a17;
        wh.u0 u0Var;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4632xe8a3494d c4632xe8a3494d;
        qh.f0 f0Var;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar;
        qh.f0 f0Var2;
        rh.w1 l17;
        boolean z17 = false;
        rh.k kVar = null;
        if (cls == rh.k.class) {
            rh.m mVar = (rh.m) w(rh.m.class);
            if (mVar != null) {
                rh.l lVar = mVar.f476984c;
                lVar.getClass();
                kVar = new rh.k();
                synchronized (lVar.f476971a) {
                    kVar.f476962d = rh.x2.b(java.lang.Integer.valueOf(lVar.f476972b));
                    kVar.f476963e = rh.x2.b(java.lang.Integer.valueOf(lVar.f476973c));
                    kVar.f476964f = rh.x2.b(0);
                    kVar.f476965g = rh.x2.b(0);
                    kVar.f476966h = rh.y2.b();
                }
            }
            return kVar;
        }
        if (cls == rh.z.class) {
            rh.b0 b0Var = (rh.b0) w(rh.b0.class);
            if (b0Var == null) {
                return null;
            }
            rh.a0 a0Var = b0Var.f476840b;
            a0Var.getClass();
            rh.z zVar = new rh.z();
            zVar.f477099d = rh.x2.b(java.lang.Integer.valueOf(a0Var.f476828a));
            zVar.f477100e = rh.x2.b(java.lang.Integer.valueOf(a0Var.f476829b));
            zVar.f477101f = rh.x2.b(java.lang.Integer.valueOf(a0Var.f476830c));
            zVar.f477102g = a0Var.f476831d;
            return zVar;
        }
        if (cls == rh.w1.class) {
            rh.d2 d2Var = (rh.d2) w(rh.d2.class);
            if (d2Var == null) {
                return null;
            }
            try {
                l17 = d2Var.l(wh.m.p());
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.battery.DeviceStatusMonitorFeature", th6, "#currentCpuFreq error", new java.lang.Object[0]);
                l17 = d2Var.l(new int[0]);
            }
            return l17;
        }
        if (cls == rh.t1.class) {
            rh.d2 d2Var2 = (rh.d2) w(rh.d2.class);
            if (d2Var2 == null || (f0Var2 = this.f476862k) == null) {
                return null;
            }
            return d2Var2.k(f0Var2.d());
        }
        if (cls == com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) w(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class);
            if (cVar2 != null) {
                return cVar2.k(true);
            }
            return null;
        }
        if (cls == com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class && (cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) w(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class)) != null) {
            return cVar.l();
        }
        if (cls == rh.k2.class) {
            rh.m2 m2Var = (rh.m2) w(rh.m2.class);
            if (m2Var == null) {
                return null;
            }
            rh.l2 l2Var = m2Var.f476993b;
            l2Var.getClass();
            rh.k2 k2Var = new rh.k2();
            k2Var.f476969d = rh.x2.b(java.lang.Integer.valueOf(l2Var.f476977a));
            k2Var.f476970e = l2Var.f476978b;
            return k2Var;
        }
        if (cls == rh.n3.class) {
            rh.o3 o3Var = (rh.o3) w(rh.o3.class);
            if (o3Var == null || (f0Var = this.f476862k) == null) {
                return null;
            }
            return o3Var.k(f0Var.d());
        }
        if (cls == rh.t3.class) {
            rh.z3 z3Var = (rh.z3) w(rh.z3.class);
            if (z3Var == null) {
                return null;
            }
            rh.y3 y3Var = z3Var.f477109d;
            y3Var.getClass();
            rh.t3 t3Var = new rh.t3();
            t3Var.f477042d = rh.x2.b(java.lang.Long.valueOf(y3Var.f477096c));
            t3Var.f477043e = rh.x2.b(java.lang.Integer.valueOf(y3Var.f477095b));
            t3Var.f477044f = rh.y2.b();
            t3Var.f477045g = rh.x2.b(java.lang.Integer.valueOf(y3Var.f477097d));
            t3Var.f477046h = rh.x2.b(java.lang.Integer.valueOf(y3Var.f477098e));
            return t3Var;
        }
        if (cls == rh.c4.class) {
            rh.e4 e4Var = (rh.e4) w(rh.e4.class);
            if (e4Var == null) {
                return null;
            }
            rh.d4 d4Var = e4Var.f476905b;
            d4Var.getClass();
            rh.c4 c4Var = new rh.c4();
            c4Var.f476887d = rh.x2.b(java.lang.Integer.valueOf(d4Var.f476899a));
            c4Var.f476888e = rh.x2.b(java.lang.Integer.valueOf(d4Var.f476900b));
            c4Var.f476889f = d4Var.f476901c;
            return c4Var;
        }
        if (cls == rh.f1.class) {
            rh.k1 k1Var = (rh.k1) w(rh.k1.class);
            if (k1Var == null || !k1Var.y()) {
                return null;
            }
            return k1Var.w();
        }
        if (cls == rh.j1.class) {
            rh.k1 k1Var2 = (rh.k1) w(rh.k1.class);
            if (k1Var2 == null || !k1Var2.y()) {
                return null;
            }
            rh.j1 j1Var = new rh.j1();
            try {
                java.util.ArrayList arrayList = (java.util.ArrayList) sh.c.n(k1Var2.f476827a.d());
                j1Var.f476957d = new java.util.ArrayList(arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m3.d dVar = (m3.d) it.next();
                    int intValue = ((java.lang.Integer) dVar.f404625a).intValue();
                    java.lang.String valueOf = java.lang.String.valueOf(dVar.f404626b);
                    if (intValue == android.os.Process.myPid()) {
                        a17 = k1Var2.w();
                    } else {
                        rh.f1 x17 = wh.u1.a(intValue) ? k1Var2.x(intValue) : null;
                        a17 = (x17 == null || x17.f476898c || (u0Var = k1Var2.f476827a.f444868d.C) == null || (c4632xe8a3494d = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4632xe8a3494d) ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.C10657x58a5d55) u0Var).mo40854x58b836e(dVar)) == null) ? x17 : rh.i1.a(c4632xe8a3494d);
                    }
                    if (a17 != null) {
                        a17.f476920f = intValue;
                        a17.f476921g = th.o.c(valueOf);
                        j1Var.f476957d.add(a17);
                    }
                }
            } catch (java.lang.Exception e17) {
                oj.j.f("Matrix.battery.CpuStatFeature", "get curr UidCpuStatSnapshot failed: " + e17.getMessage(), new java.lang.Object[0]);
                j1Var.f476898c = false;
            }
            return j1Var;
        }
        if (cls != rh.n1.class) {
            if (cls == rh.v.class) {
                rh.w wVar = (rh.w) w(rh.w.class);
                if (wVar != null) {
                    return wVar.k(0L);
                }
                return null;
            }
            if (cls != uh.g.class || (hVar = (uh.h) w(uh.h.class)) == null) {
                return null;
            }
            return hVar.k();
        }
        rh.n1 n1Var = new rh.n1(null);
        int o17 = wh.m.o();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (i17 < o17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/cpu" + i17 + "/cpuidle").listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                for (?? r122 = z17; r122 < length; r122++) {
                    java.io.File it6 = listFiles[r122];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "it");
                    java.lang.String name = it6.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "it.name");
                    if (r26.i0.y(name, "state", z17)) {
                        java.lang.String a18 = wh.m.a(new java.io.File(it6, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d).getAbsolutePath());
                        if (a18 == null || (str = r26.n0.u0(a18).toString()) == null) {
                            str = "";
                        }
                        if (str.length() > 0 ? true : z17) {
                            java.lang.String a19 = wh.m.a(new java.io.File(it6, "time").getAbsolutePath());
                            hashMap.put(str, java.lang.Long.valueOf(((a19 == null || (obj = r26.n0.u0(a19).toString()) == null) ? 0L : java.lang.Long.parseLong(obj)) / 1000));
                        }
                    }
                    z17 = false;
                }
            }
            arrayList2.add(hashMap);
            i17++;
            z17 = false;
        }
        n1Var.b().addAll(arrayList2);
        return n1Var;
    }

    public rh.c3 K(java.lang.Class cls) {
        uh.h hVar;
        java.lang.Long l17;
        java.util.Map map = this.f476856e;
        qh.f0 f0Var = this.f476862k;
        if (cls == rh.w1.class) {
            rh.d2 d2Var = (rh.d2) w(rh.d2.class);
            if (d2Var == null || f0Var == null) {
                return null;
            }
            rh.k1 k1Var = (rh.k1) w(rh.k1.class);
            if (k1Var != null && k1Var.y()) {
                this.f476866o = new rh.x0(wh.m.q());
            }
            rh.c3 c3Var = new rh.c3("cpufreq", f0Var.f444870f, new rh.p0(this, k1Var, d2Var));
            ((java.util.HashMap) map).put(cls, c3Var);
            return c3Var;
        }
        if (cls == rh.t1.class) {
            rh.d2 d2Var2 = (rh.d2) w(rh.d2.class);
            if (d2Var2 == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var2 = new rh.c3("batt-temp", f0Var.f444870f, new rh.q0(this, d2Var2));
            ((java.util.HashMap) map).put(cls, c3Var2);
            return c3Var2;
        }
        if (cls == rh.c2.class) {
            rh.d2 d2Var3 = (rh.d2) w(rh.d2.class);
            if (android.os.Build.VERSION.SDK_INT < 29 || d2Var3 == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var3 = new rh.c3("thermal-stat", f0Var.f444870f, new rh.r0(this));
            ((java.util.HashMap) map).put(cls, c3Var3);
            return c3Var3;
        }
        if (cls == rh.b2.class) {
            rh.d2 d2Var4 = (rh.d2) w(rh.d2.class);
            if (android.os.Build.VERSION.SDK_INT < 30 || d2Var4 == null || f0Var == null || (l17 = (java.lang.Long) ((java.util.HashMap) this.f476855d).get(cls)) == null || l17.longValue() < 1000) {
                return null;
            }
            rh.c3 c3Var4 = new rh.c3("thermal-headroom", f0Var.f444870f, new rh.s0(this, l17));
            ((java.util.HashMap) map).put(cls, c3Var4);
            return c3Var4;
        }
        if (cls == rh.u1.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var5 = new rh.c3("batt-watt", f0Var.f444870f, new rh.t0(this));
            ((java.util.HashMap) map).put(cls, c3Var5);
            return c3Var5;
        }
        if (cls == rh.f1.class) {
            rh.k1 k1Var2 = (rh.k1) w(rh.k1.class);
            if (k1Var2 == null || !k1Var2.y() || f0Var == null) {
                return null;
            }
            rh.c3 c3Var6 = new rh.c3("cpu-stat", f0Var.f444870f, new rh.u0(this, k1Var2));
            ((java.util.HashMap) map).put(cls, c3Var6);
            return c3Var6;
        }
        if (cls == com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) w(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class);
            if (cVar == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var7 = new rh.c3("uid-jiffies", f0Var.f444870f, new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.b(this, cVar));
            ((java.util.HashMap) map).put(cls, c3Var7);
            return c3Var7;
        }
        if (cls == rh.n3.class) {
            rh.o3 o3Var = (rh.o3) w(rh.o3.class);
            if (o3Var == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var8 = new rh.c3("traffic", f0Var.f444870f, new rh.v0(this, o3Var));
            ((java.util.HashMap) map).put(cls, c3Var8);
            return c3Var8;
        }
        if (cls == rh.l3.class) {
            rh.o3 o3Var2 = (rh.o3) w(rh.o3.class);
            if (o3Var2 == null || f0Var == null) {
                return null;
            }
            this.f476867p = new rh.w0();
            rh.c3 c3Var9 = new rh.c3("trafficBps", f0Var.f444870f, new rh.c0(this, o3Var2));
            ((java.util.HashMap) map).put(cls, c3Var9);
            return c3Var9;
        }
        if (cls == rh.r1.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var10 = new rh.c3("batt-curr", f0Var.f444870f, new rh.d0(this));
            ((java.util.HashMap) map).put(cls, c3Var10);
            return c3Var10;
        }
        if (cls != uh.g.class || (hVar = (uh.h) w(uh.h.class)) == null || f0Var == null) {
            return null;
        }
        rh.c3 c3Var11 = new rh.c3("health-stats", f0Var.f444870f, new rh.e0(this, hVar));
        ((java.util.HashMap) map).put(cls, c3Var11);
        return c3Var11;
    }

    public void a() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #cancel: " + this.f476870s, new java.lang.Object[0]);
            this.f476871t = false;
            i();
        }
    }

    public void b() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #clear: " + this.f476870s, new java.lang.Object[0]);
            ((java.util.HashMap) this.f476853b).clear();
            ((java.util.HashMap) this.f476854c).clear();
            ((java.util.HashMap) this.f476856e).clear();
            ((java.util.HashMap) this.f476857f).clear();
            ((java.util.HashMap) this.f476858g).clear();
            ((java.util.HashMap) this.f476859h).clear();
            this.f476860i.clear();
            ((java.util.HashMap) this.f476861j).clear();
            this.f476866o = null;
            this.f476867p = null;
            wh.s0 s0Var = this.f476868q;
            if (s0Var != null) {
                if (s0Var.k()) {
                    this.f476868q.m();
                }
                this.f476868q.a();
            }
            this.f476868q = null;
        }
    }

    public void c() {
        qh.b bVar;
        wh.s0 s0Var = this.f476868q;
        if (s0Var != null) {
            synchronized (((jz5.n) s0Var.f527401f).mo141623x754a37bb()) {
                if (this.f476868q.k()) {
                    this.f476868q.m();
                }
            }
            java.util.Map g17 = this.f476868q.g();
            oj.j.c("Matrix.battery.CompositeMonitors", "callstacks sampling size: " + g17.size(), new java.lang.Object[0]);
            if (!g17.isEmpty()) {
                wh.s0 s0Var2 = this.f476868q;
                s0Var2.getClass();
                wh.f.a("Matrix.battery.CompositeMonitors", "CallStack", "Thread WatchDog dump callstacks sampling:\n".concat(wh.s0.e(s0Var2, null, 0.0f, false, 7, null)), 0, 8, null);
                for (java.util.Map.Entry entry : g17.entrySet()) {
                    java.lang.Integer num = (java.lang.Integer) entry.getKey();
                    java.lang.String j17 = this.f476868q.j(num.intValue(), true);
                    if (j17 == null) {
                        java.util.List list = (java.util.List) entry.getValue();
                        if (!list.isEmpty()) {
                            j17 = (java.lang.String) ((jz5.o) list.get(list.size() - 1)).f384376f;
                        }
                    }
                    if (j17 != null) {
                        ((java.util.HashMap) this.f476861j).put(java.lang.String.valueOf(num), j17);
                    }
                }
                return;
            }
        }
        if (this.f476862k == null || !"canary".equals(this.f476870s) || (bVar = this.f476863l) == null || bVar.h()) {
            return;
        }
        u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.a(this));
    }

    public void d() {
        java.util.Map map = this.f476858g;
        if (((java.util.HashMap) map).isEmpty()) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            for (rh.o2 o2Var : (java.util.List) entry.getValue()) {
                if (((rh.f) o2Var.f477017a).f476896a >= this.f476869r) {
                    java.util.Map map2 = this.f476859h;
                    rh.d3 d3Var = o2Var.f477019c;
                    java.util.List list = (java.util.List) ((java.util.HashMap) map2).get(((rh.f) d3Var).f476908e);
                    if (list == null) {
                        list = new java.util.ArrayList();
                        ((java.util.HashMap) map2).put(((rh.f) d3Var).f476908e, list);
                    }
                    list.add(new m3.d(cls, o2Var));
                }
            }
        }
    }

    public long e(long j17) {
        qh.b bVar = this.f476863l;
        if (bVar != null) {
            return f(j17, bVar.f444854n);
        }
        oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to computeAvgJiffies", new java.lang.Object[0]);
        return -1L;
    }

    public void g() {
        java.util.Iterator it = ((java.util.ArrayList) this.f476852a).iterator();
        while (it.hasNext()) {
            java.lang.Class cls = (java.lang.Class) it.next();
            rh.d3 J2 = J(cls);
            if (J2 != null) {
                ((java.util.HashMap) this.f476853b).put(cls, J2);
                if ((J2 instanceof uh.g) && ((java.util.HashMap) this.f476855d).containsKey(uh.g.class)) {
                    uh.g gVar = (uh.g) J2;
                    gVar.f509210d = new uh.f(gVar);
                }
            }
        }
    }

    public void h() {
        java.lang.Class cls;
        rh.d3 J2;
        rh.o2 a17;
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f476853b).entrySet()) {
            rh.d3 d3Var = (rh.d3) entry.getValue();
            if (d3Var != null && (J2 = J((cls = (java.lang.Class) entry.getKey()))) != null && J2.getClass() == d3Var.getClass()) {
                if (d3Var instanceof uh.g) {
                    uh.g gVar = (uh.g) d3Var;
                    if (gVar.f509210d != null) {
                        uh.g gVar2 = (uh.g) J2;
                        gVar.b(gVar2);
                        a17 = new rh.n2(gVar, gVar2, gVar.f509210d.f509205c);
                        ((java.util.HashMap) this.f476854c).put(cls, a17);
                    }
                }
                a17 = J2.a(d3Var);
                ((java.util.HashMap) this.f476854c).put(cls, a17);
            }
        }
    }

    public void i() {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f476856e).entrySet()) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " " + ((rh.c3) entry.getValue()).f476873a + " #pause: " + this.f476870s, new java.lang.Object[0]);
            rh.c3 c3Var = (rh.c3) entry.getValue();
            c3Var.f476877e = true;
            c3Var.f476881i = android.os.SystemClock.uptimeMillis();
            c3Var.f476874b.removeCallbacks(c3Var.f476876d);
            rh.c3 c3Var2 = (rh.c3) entry.getValue();
            int i17 = c3Var2.f476879g;
            rh.b3 b3Var = null;
            if (i17 <= 0) {
                oj.j.f("Matrix.battery.Sampler", "Sampling count is invalid: " + c3Var2.f476879g, new java.lang.Object[0]);
            } else {
                long j17 = c3Var2.f476880h;
                if (j17 > 0) {
                    long j18 = c3Var2.f476881i;
                    if (j18 > 0 && j17 <= j18) {
                        b3Var = new rh.b3();
                        b3Var.f476842a = c3Var2.f476878f;
                        b3Var.f476843b = i17;
                        b3Var.f476844c = j18 - j17;
                        b3Var.f476845d = c3Var2.f476882j;
                        b3Var.f476846e = c3Var2.f476883k;
                        b3Var.f476847f = c3Var2.f476884l;
                        b3Var.f476848g = c3Var2.f476885m;
                        b3Var.f476849h = c3Var2.f476886n;
                    }
                }
                oj.j.f("Matrix.battery.Sampler", "Sampling bgn/end millis is invalid: " + c3Var2.f476880h + " - " + c3Var2.f476881i, new java.lang.Object[0]);
            }
            if (b3Var != null) {
                ((java.util.HashMap) this.f476857f).put((java.lang.Class) entry.getKey(), b3Var);
            }
        }
    }

    public void j() {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f476855d).entrySet()) {
            rh.c3 K = K((java.lang.Class) entry.getKey());
            if (K != null) {
                long longValue = ((java.lang.Long) entry.getValue()).longValue();
                if (longValue > 0) {
                    K.f476878f = longValue;
                }
                K.f476877e = false;
                K.f476880h = android.os.SystemClock.uptimeMillis();
                K.f476874b.postDelayed(K.f476876d, K.f476878f);
            }
        }
    }

    public void k(java.lang.Class cls) {
        rh.g gVar;
        if (this.f476863l == null || (gVar = (rh.g) w(cls)) == null) {
            return;
        }
        ((java.util.HashMap) this.f476858g).put(cls, gVar.n(this.f476863l.f444854n));
    }

    public void l() {
        int j17;
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #finish: " + this.f476870s, new java.lang.Object[0]);
            this.f476871t = false;
            h();
            c();
            i();
            this.f476863l = qh.b.b(android.os.SystemClock.uptimeMillis() - this.f476869r);
            qh.g0 g0Var = this.f476865n;
            if (g0Var != null) {
                g0Var.h();
                qh.b bVar = this.f476863l;
                long j18 = bVar.f444854n;
                if (j18 > 0 && (j17 = this.f476865n.j(j18, bVar.f444845e)) != this.f476863l.f444845e) {
                    oj.j.c("Matrix.battery.CompositeMonitors", "correctify charging ratio: " + this.f476863l.f444845e + ">>" + j17, new java.lang.Object[0]);
                    this.f476863l.f444845e = j17;
                }
            }
            u(uh.g.class, new rh.g0(this));
        }
    }

    public rh.c1 m() {
        rh.c1 c1Var = new rh.c1(this.f476862k, this.f476870s);
        n(c1Var);
        return c1Var;
    }

    public rh.c1 n(rh.c1 c1Var) {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #fork: " + this.f476870s, new java.lang.Object[0]);
            c1Var.b();
            c1Var.f476869r = this.f476869r;
            c1Var.f476863l = this.f476863l;
            c1Var.f476864m = this.f476864m;
            c1Var.f476871t = this.f476871t;
            ((java.util.ArrayList) c1Var.f476852a).addAll(this.f476852a);
            ((java.util.HashMap) c1Var.f476853b).putAll(this.f476853b);
            ((java.util.HashMap) c1Var.f476854c).putAll(this.f476854c);
            c1Var.f476866o = this.f476866o;
            c1Var.f476867p = this.f476867p;
            ((java.util.HashMap) c1Var.f476858g).putAll(this.f476858g);
            ((java.util.HashMap) c1Var.f476859h).putAll(this.f476859h);
            c1Var.f476860i.putAll(this.f476860i);
            ((java.util.HashMap) c1Var.f476861j).putAll(this.f476861j);
        }
        return c1Var;
    }

    public java.util.List o() {
        rh.o2 t17 = t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
        if (t17 != null) {
            return ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) t17.f477019c).f134117f;
        }
        rh.o2 t18 = t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
        return t18 != null ? java.util.Collections.singletonList(t18) : java.util.Collections.emptyList();
    }

    public void p(wh.t0 t0Var) {
        java.util.List o17 = o();
        if (o17 != null) {
            t0Var.mo40853xab27b508(o17);
        }
    }

    public void q(wh.t0 t0Var) {
        qh.b bVar = this.f476863l;
        if (bVar != null) {
            t0Var.mo40853xab27b508(bVar);
        }
    }

    public void r(wh.t0 t0Var) {
        java.util.Map map = this.f476859h;
        if (((java.util.HashMap) map).size() > 1) {
            map = wh.m.B(map, new rh.f0(this));
        }
        t0Var.mo40853xab27b508(map);
    }

    public int s() {
        long longValue;
        if (this.f476863l == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get CpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.o2 t17 = t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
        if (t17 != null) {
            longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) t17.f477019c).f134115d.f477085a).longValue();
        } else {
            rh.o2 t18 = t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
            if (t18 == null) {
                oj.j.f("Matrix.battery.CompositeMonitors", com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class + " should be metrics to get CpuLoad", new java.lang.Object[0]);
                return -1;
            }
            longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) t18.f477019c).f134094g.f477085a).longValue();
        }
        long j17 = this.f476863l.f444854n;
        return (int) ((j17 > 0 ? ((float) (longValue * 10)) / ((float) j17) : 0.0f) * 100.0f);
    }

    public rh.o2 t(java.lang.Class cls) {
        return (rh.o2) ((java.util.HashMap) this.f476854c).get(cls);
    }

    /* renamed from: toString */
    public java.lang.String m162366x9616526c() {
        return "CompositeMonitors{\nRunning=" + this.f476871t + "\n, Metrics=" + this.f476852a + "\n, BgnSnapshots=" + this.f476853b + "\n, Deltas=" + this.f476854c + "\n, SampleRegs=" + this.f476855d + "\n, Samplers=" + this.f476856e + "\n, SampleResults=" + this.f476857f + "\n, TaskDeltas=" + this.f476858g + "\n, AppStats=" + this.f476863l + "\n, Stacks=" + this.f476861j + "\n, Extras =" + this.f476860i + "\n}";
    }

    public void u(java.lang.Class cls, wh.t0 t0Var) {
        rh.o2 t17 = t(cls);
        if (t17 != null) {
            t0Var.mo40853xab27b508(t17);
        }
    }

    public int v() {
        if (this.f476863l == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get DevCpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.o2 t17 = t(rh.n1.class);
        if (t17 == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", rh.n1.class + " should be metrics to get DevCpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.n1 n1Var = (rh.n1) t17.f477019c;
        long j17 = this.f476863l.f444854n;
        n1Var.getClass();
        int o17 = wh.m.o();
        float f17 = 1;
        java.util.Iterator it = n1Var.b().iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += kz5.n0.J0(((java.util.Map) it.next()).values());
        }
        return (int) new java.math.BigDecimal(java.lang.String.valueOf((f17 - (((float) j18) / ((float) (j17 * o17)))) * 100 * o17)).setScale(2, java.math.RoundingMode.HALF_EVEN).floatValue();
    }

    public rh.e3 w(java.lang.Class cls) {
        qh.f0 f0Var = this.f476862k;
        if (f0Var == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) f0Var.f444868d.f444839y).iterator();
        while (it.hasNext()) {
            rh.e3 e3Var = (rh.e3) it.next();
            if (cls.isAssignableFrom(e3Var.getClass())) {
                return e3Var;
            }
        }
        return null;
    }

    public void x(java.lang.Class cls, wh.t0 t0Var) {
        rh.e3 w17 = w(cls);
        if (w17 != null) {
            t0Var.mo40853xab27b508(w17);
        }
    }

    public java.lang.String y() {
        return this.f476870s;
    }

    public java.lang.String z() {
        return this.f476860i.getString("extra_module_name", "");
    }
}
