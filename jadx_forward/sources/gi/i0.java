package gi;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gi.i0 f353587a = new gi.i0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f353588b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f353589c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f353590d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f353591e;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f353589c = jz5.h.a(iVar, gi.f0.f353560d);
        f353590d = jz5.h.a(iVar, gi.h0.f353570d);
        f353591e = jz5.h.a(iVar, gi.g0.f353565d);
    }

    public static final void b(boolean z17) {
        wh.s0 s0Var;
        boolean z18;
        int i17 = 0;
        if (!z17) {
            if (f353588b) {
                android.os.Handler a17 = gi.k0.a();
                if (a17 != null) {
                    a17.removeCallbacks((java.lang.Runnable) f353590d.mo141623x754a37bb());
                }
                android.os.Handler a18 = gi.k0.a();
                if (a18 != null) {
                    a18.postDelayed((java.lang.Runnable) f353591e.mo141623x754a37bb(), 5000L);
                }
            }
            gi.p0.a(false, 1, null);
            return;
        }
        if (!f353588b) {
            android.os.Handler a19 = gi.k0.a();
            if (a19 != null) {
                a19.removeCallbacks((java.lang.Runnable) f353591e.mo141623x754a37bb());
            }
            android.os.Handler a27 = gi.k0.a();
            if (a27 != null) {
                a27.postDelayed((java.lang.Runnable) f353590d.mo141623x754a37bb(), 5000L);
            }
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            gi.p0.a(false, 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ThreadWatch", "postCallStackSampling");
            if (!mm.k.j(mm.k.f410038p, null, 1, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ThreadWatch", "disable");
            }
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                qh.w wVar = e17.f435829h.f444868d.f444816b;
                if (wVar instanceof ri.k) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.matrix.report.BatteryReportListener");
                    rh.c1 c1Var = ((ri.k) wVar).f444922e;
                    if (c1Var.E()) {
                        rh.c1 m17 = c1Var.m();
                        m17.l();
                        rh.o2 t17 = m17.t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
                        if (t17 != null) {
                            long j17 = t17.f477020d;
                            if (j17 >= 60000) {
                                java.util.List list = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) t17.f477019c).f134095h.f477093a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getList(...)");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.Object obj : list) {
                                    if ((((float) (((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) obj).f477085a.longValue() * ((long) 10))) * 100.0f) / ((float) j17) >= 30.0f) {
                                        arrayList.add(obj);
                                    }
                                }
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) it.next();
                                    kh.q3 q3Var = kh.q3.f389430a;
                                    java.lang.String name = threadJiffiesSnapshot.f134099c;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                                    int i18 = threadJiffiesSnapshot.f134098b;
                                    java.lang.String b17 = q3Var.b(name, i18);
                                    arrayList2.add(b17 != null ? new kh.f3(b17, i18) : new kh.f3(name, i18));
                                }
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.util.Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    java.lang.Object next = it6.next();
                                    jz5.o a28 = kh.e3.f389320a.a((kh.f3) next);
                                    if ((a28 == null || kz5.c0.i("ART", "Manu").contains(a28.f384374d)) ? false : true) {
                                        arrayList3.add(next);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    int size = arrayList3.size();
                                    if (size > 3) {
                                        size = 3;
                                    }
                                    java.util.List<kh.f3> subList = arrayList3.subList(0, size);
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(subList, 10));
                                    for (kh.f3 f3Var : subList) {
                                        arrayList4.add(new jz5.l(f3Var.f389332a, java.lang.Integer.valueOf(f3Var.f389333b)));
                                    }
                                    qh.f0 f0Var = e17.f435829h;
                                    gi.n0 n0Var = new gi.n0(f0Var.f444868d.A, f0Var.f444870f);
                                    synchronized (c1Var) {
                                        oj.j.c("Matrix.battery.CompositeMonitors", "#samplingCallStacks: intervalMs=" + com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d + ", tidList=" + arrayList4, new java.lang.Object[0]);
                                        if (c1Var.f476862k != null && c1Var.E()) {
                                            java.util.Iterator it7 = arrayList4.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    if (wh.u1.b(android.os.Process.myPid(), ((java.lang.Integer) ((jz5.l) it7.next()).f384367e).intValue())) {
                                                        z18 = true;
                                                        break;
                                                    }
                                                } else {
                                                    z18 = false;
                                                    break;
                                                }
                                            }
                                            if (z18) {
                                                wh.s0 s0Var2 = c1Var.f476868q;
                                                if (s0Var2 != null) {
                                                    if (s0Var2.k()) {
                                                        c1Var.f476868q.m();
                                                    }
                                                    c1Var.f476868q.a();
                                                }
                                                c1Var.f476868q = n0Var;
                                                n0Var.l(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, arrayList4);
                                                s0Var = c1Var.f476868q;
                                            } else {
                                                oj.j.f("Matrix.battery.CompositeMonitors", "#samplingCallStacks skip: invalid tidList", new java.lang.Object[0]);
                                                s0Var = null;
                                            }
                                        }
                                        oj.j.f("Matrix.battery.CompositeMonitors", "#samplingCallStacks skip: ".concat(c1Var.f476862k == null ? "null monitor" : "not running"), new java.lang.Object[0]);
                                        s0Var = null;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("samplingCallStacks: ");
                                    sb6.append(s0Var != null);
                                    sb6.append(", tidList=");
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                                    java.util.Iterator it8 = arrayList3.iterator();
                                    while (it8.hasNext()) {
                                        kh.f3 f3Var2 = (kh.f3) it8.next();
                                        arrayList5.add(f3Var2.f389332a + '(' + f3Var2.f389333b + ')');
                                    }
                                    sb6.append(arrayList5);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ThreadWatch", sb6.toString());
                                    if (s0Var != null) {
                                        java.util.List list2 = gi.p0.f353613b;
                                        synchronized (list2) {
                                            ((java.util.ArrayList) list2).add(s0Var);
                                        }
                                        android.os.Handler a29 = gi.k0.a();
                                        if (a29 != null) {
                                            a29.postDelayed(gi.p0.f353614c, 600000L);
                                        }
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        java.util.Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            java.lang.Object next2 = it9.next();
                                            int i19 = i17 + 1;
                                            if (i17 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            kh.f3 f3Var3 = (kh.f3) next2;
                                            linkedHashMap.put("t-" + i17 + "-name", f3Var3.f389332a);
                                            linkedHashMap.put("t-" + i17 + "-tid", java.lang.Integer.valueOf(f3Var3.f389333b));
                                            i17 = i19;
                                        }
                                        ap.a.a(10002, "ThreadProfiler", null, linkedHashMap, "samplingCallStacks", java.lang.String.valueOf(arrayList3.size()), ((kh.f3) kz5.n0.X(arrayList3)).f389332a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final java.util.List a() {
        return (java.util.List) f353589c.mo141623x754a37bb();
    }
}
