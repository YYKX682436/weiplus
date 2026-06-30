package qh;

/* loaded from: classes12.dex */
public class v implements qh.w {

    /* renamed from: d, reason: collision with root package name */
    public qh.f0 f444921d;

    /* renamed from: e, reason: collision with root package name */
    public rh.c1 f444922e;

    /* renamed from: f, reason: collision with root package name */
    public long f444923f;

    @Override // rh.i3
    public void a(rh.h3 h3Var) {
    }

    @Override // rh.r3
    public void b(rh.w3 w3Var, long j17) {
    }

    @Override // qh.e0
    public void c(boolean z17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f444923f;
        long j18 = uptimeMillis - j17;
        if (j17 <= 0 || j18 <= 0) {
            oj.j.f("Matrix.battery.BatteryPrinter", "skip invalid battery tracing, bgn = " + this.f444923f + ", during = " + j18, new java.lang.Object[0]);
            return;
        }
        this.f444922e.l();
        qh.b bVar = this.f444922e.f476863l;
        if (bVar != null) {
            bVar.f444855o = new java.util.concurrent.atomic.AtomicBoolean(z17);
        }
        l(this.f444922e);
    }

    @Override // qh.e0
    public void d() {
        this.f444923f = android.os.SystemClock.uptimeMillis();
        this.f444922e.b();
        this.f444922e.I();
    }

    @Override // rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
    }

    @Override // rh.f2
    public void f(rh.o2 o2Var) {
        rh.c1 c1Var = new rh.c1(this.f444921d, "internal");
        c1Var.f476863l = qh.b.b(o2Var.f477020d);
        ((java.util.HashMap) c1Var.f476854c).put(rh.g2.class, o2Var);
        m(c1Var);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.InterfaceC4634x2b4532bc
    public void g(rh.y2 y2Var) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it;
        int i17;
        qh.v vVar = this;
        rh.y2 y2Var2 = y2Var;
        qh.u uVar = new qh.u();
        uVar.i();
        java.lang.StringBuilder sb6 = uVar.f444920a;
        sb6.append("| Thread WatchDog");
        uVar.a("\n");
        uVar.b("jiffies(" + y2Var2.f477093a.size() + ")");
        uVar.h("desc", "(status)name(tid)\ttotal");
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : y2Var2.f477093a) {
            long longValue = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
            sb6.append("|   -> (");
            sb6.append(threadJiffiesEntry.f134100d ? "+" : "~");
            sb6.append("/");
            sb6.append(threadJiffiesEntry.f134101e);
            sb6.append(")");
            sb6.append(threadJiffiesEntry.f134099c);
            sb6.append("(");
            sb6.append(java.lang.Integer.valueOf(threadJiffiesEntry.f134098b));
            sb6.append(")\t");
            sb6.append(java.lang.Long.valueOf(longValue));
            sb6.append("\tjiffies");
            uVar.a("\n");
        }
        uVar.b("stacks");
        qh.a0 a0Var = vVar.f444921d.f444868d;
        boolean z17 = a0Var.f444833s;
        if (!z17 || !a0Var.f444838x.isEmpty()) {
            for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry2 : y2Var2.f477093a) {
                for (java.lang.String str : vVar.f444921d.f444868d.f444838x) {
                    if (str.equalsIgnoreCase(threadJiffiesEntry2.f134099c) || threadJiffiesEntry2.f134099c.contains(str)) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        if (z17) {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            int i18 = 0;
            oj.j.c("Matrix.battery.BatteryPrinter", "onWatchingThreads dump stacks, get all threads size = " + allStackTraces, new java.lang.Object[0]);
            java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it6 = allStackTraces.entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> next = it6.next();
                java.lang.Thread key = next.getKey();
                java.lang.StackTraceElement[] value = next.getValue();
                java.lang.String name = key.getName();
                java.util.Iterator it7 = y2Var2.f477093a.iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) it7.next()).f134099c;
                    if (str2.equalsIgnoreCase(name) || name.contains(str2)) {
                        sb6.append("|   -> ");
                        sb6.append("(");
                        sb6.append(key.getState());
                        sb6.append(")");
                        sb6.append((java.lang.Object) name);
                        sb6.append("(");
                        sb6.append(java.lang.Long.valueOf(key.getId()));
                        sb6.append(")");
                        uVar.a("\n");
                        vVar.f444921d.f444868d.A.getClass();
                        if (value == null) {
                            it = it6;
                            i17 = i18;
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList(value.length);
                            int length = value.length;
                            int i19 = i18;
                            while (i19 < length) {
                                java.lang.StackTraceElement stackTraceElement = value[i19];
                                java.lang.String className = stackTraceElement.getClassName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "className");
                                java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it8 = it6;
                                if (!r26.n0.B(className, "com.tencent.matrix", false) && !r26.n0.B(className, "java.lang.reflect", false) && !r26.n0.B(className, "$Proxy2", false) && !r26.n0.B(className, "android.os", false)) {
                                    arrayList.add(stackTraceElement);
                                }
                                i19++;
                                i18 = 0;
                                it6 = it8;
                            }
                            it = it6;
                            i17 = i18;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            java.util.Iterator it9 = arrayList.iterator();
                            while (it9.hasNext()) {
                                java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) it9.next();
                                sb7.append((sb7.length() == 0 ? 1 : i17) != 0 ? "" : "\n");
                                sb7.append("at ");
                                sb7.append(stackTraceElement2);
                            }
                            if (sb7.length() == 0) {
                            }
                        }
                        int length2 = value.length;
                        for (int i27 = i17; i27 < length2; i27++) {
                            java.lang.StackTraceElement stackTraceElement3 = value[i27];
                            sb6.append("|      ");
                            sb6.append(stackTraceElement3);
                            uVar.a("\n");
                        }
                    } else {
                        it = it6;
                        i17 = i18;
                    }
                    vVar = this;
                    i18 = i17;
                    it6 = it;
                }
                vVar = this;
                y2Var2 = y2Var;
            }
        } else {
            sb6.append("|   disabled");
            uVar.a("\n");
        }
        uVar.f();
        uVar.d();
    }

    @Override // rh.r3
    public void h(int i17, rh.w3 w3Var) {
    }

    public qh.v i(qh.f0 f0Var) {
        this.f444921d = f0Var;
        rh.c1 c1Var = new rh.c1(f0Var, "canary");
        this.f444922e = c1Var;
        c1Var.G();
        return this;
    }

    public void j(rh.c1 c1Var) {
        c1Var.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new qh.e(this, c1Var));
    }

    public qh.t k() {
        return new qh.t();
    }

    public void l(rh.c1 c1Var) {
        qh.t k17 = k();
        qh.u uVar = new qh.u();
        uVar.i();
        k17.a(c1Var, uVar);
        uVar.f();
        uVar.d();
        j(c1Var);
        m(c1Var);
    }

    public void m(rh.c1 c1Var) {
        c1Var.x(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new qh.f(this, c1Var));
    }
}
