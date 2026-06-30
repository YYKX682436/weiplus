package tr5;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f503034a = new android.util.ArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f503035b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final tr5.t f503036c = new es5.b();

    /* renamed from: d, reason: collision with root package name */
    public static final tr5.s f503037d = new ds5.a();

    /* renamed from: e, reason: collision with root package name */
    public static final tr5.x f503038e = new fs5.d();

    static {
        i(new wr5.b());
        i(new zr5.b(1));
        i(new zr5.b(2));
        i(new zr5.b(3));
        i(new yr5.b(1));
        i(new yr5.b(2));
        i(new yr5.b(3));
        i(new as5.a(1));
        i(new as5.a(2));
        i(new as5.a(3));
    }

    public static void a(tr5.a0 a0Var) {
        java.util.Iterator it = a0Var.e().iterator();
        while (it.hasNext()) {
            if (4 == ((bs5.f) ((tr5.p) it.next())).f105552a) {
                it.remove();
            }
        }
    }

    public static void b(tr5.a0 a0Var) {
        java.util.Iterator it = a0Var.e().iterator();
        while (it.hasNext()) {
            bs5.f fVar = (bs5.f) ((tr5.p) it.next());
            fVar.b();
            a0Var.h().c(fVar.f105554c, fVar.f105556e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e2, code lost:
    
        if (1 == r9.f105552a) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fc, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fa, code lost:
    
        if (r9.f105555d.isConnectable() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b7, code lost:
    
        if (r9.f105552a == 0) goto L141;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tr5.g0 c(java.util.concurrent.CountDownLatch r17, tr5.a0 r18, tr5.f0 r19, tr5.k r20, java.util.List r21, long r22) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr5.l.c(java.util.concurrent.CountDownLatch, tr5.a0, tr5.f0, tr5.k, java.util.List, long):tr5.g0");
    }

    public static tr5.g0 d(tr5.f0 f0Var) {
        int i17;
        tr5.i iVar = (tr5.i) ((android.util.ArrayMap) f503034a).get(f0Var.f503013f);
        android.content.Context context = f0Var.f503008a;
        if (iVar == null) {
            return new tr5.g0(tr5.z.f503041g, new fs5.c(context));
        }
        tr5.a0 a0Var = new tr5.a0(f0Var);
        int i18 = f0Var.f503018k;
        if (sr5.f.a(i18) || i18 <= 0) {
            int i19 = mr5.a.f412442a;
            try {
                i17 = com.p314xaae8f345.p2834x3348ad.dns.p2835x2e06d1.jni.Jni.m84121x5f203770();
            } catch (java.lang.Throwable unused) {
                or5.b.e("Get cur network stack failed", new java.lang.Object[0]);
                i17 = 0;
            }
            a0Var.b(i17);
        } else {
            a0Var.b(i18);
        }
        int a17 = a0Var.a();
        ((es5.b) f503036c).getClass();
        es5.c cVar = new es5.c(a17, null);
        a0Var.g(cVar);
        tr5.y a18 = ((fs5.d) f503038e).a(f0Var.f503012e.getClass(), context);
        a0Var.i(a18);
        tr5.r rVar = a17 != 1 ? a17 != 2 ? iVar.f503028a : iVar.f503030c : iVar.f503029b;
        tr5.g0 b17 = rVar.b(f0Var);
        a18.f(a0Var);
        boolean d17 = b17.f503026e.d();
        tr5.q qVar = b17.f503026e;
        if (!d17 && !qVar.g()) {
            return new tr5.g0(tr5.z.f503041g, a18);
        }
        ((es5.c) a0Var.f()).c(rVar, b17.f503025d.f503044f);
        a0Var.h().c(rVar, qVar);
        tr5.z d18 = cVar.d();
        a18.a(d18);
        tr5.g0 g0Var = new tr5.g0(d18, a18);
        or5.b.a("getResultFromCache by httpdns cache:" + d18 + "; " + a18, new java.lang.Object[0]);
        return g0Var;
    }

    public static tr5.g0 e(tr5.f0 f0Var) {
        tr5.i iVar;
        int i17;
        long j17;
        int i18;
        tr5.g0 g0Var;
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        or5.b.d("DnsManager.lookup(%s) called", f0Var);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f503035b;
        tr5.j jVar = (tr5.j) concurrentHashMap.get(f0Var);
        if (jVar != null) {
            or5.b.a("The same lookup task(for %s) is running, just wait for it", f0Var);
            try {
                if (jVar.f503031a.await(f0Var.f503010c * 1.2f, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    g0Var = jVar.f503032b.f503033a;
                } else {
                    or5.b.a("Await for running lookup for %s timeout", f0Var);
                    g0Var = new tr5.g0(tr5.z.f503041g, new fs5.c(f0Var.f503008a));
                }
                return g0Var;
            } catch (java.lang.Exception e17) {
                or5.b.c(5, e17, "Await for running lookup for %s failed", f0Var);
                int elapsedRealtime2 = (int) (f0Var.f503010c - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (elapsedRealtime2 <= 0) {
                    return new tr5.g0(tr5.z.f503041g, new fs5.c(f0Var.f503008a));
                }
                tr5.e0 e0Var = new tr5.e0(f0Var);
                e0Var.g(elapsedRealtime2);
                return e(e0Var.a());
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        tr5.k kVar = new tr5.k(null);
        concurrentHashMap.put(f0Var, new tr5.j(countDownLatch, kVar));
        tr5.n nVar = f0Var.f503012e;
        java.lang.String str = f0Var.f503013f;
        boolean z17 = f0Var.f503014g;
        tr5.a0 a0Var = new tr5.a0(f0Var);
        tr5.i iVar2 = z17 ? (tr5.i) ((android.util.ArrayMap) f503034a).get("Local") : null;
        if ("Local".equals(str)) {
            iVar2 = (tr5.i) ((android.util.ArrayMap) f503034a).get("Local");
            iVar = null;
        } else {
            iVar = (tr5.i) ((android.util.ArrayMap) f503034a).get(str);
        }
        if (sr5.f.a(f0Var.f503018k) || (i18 = f0Var.f503018k) <= 0) {
            int i19 = mr5.a.f412442a;
            try {
                i17 = com.p314xaae8f345.p2834x3348ad.dns.p2835x2e06d1.jni.Jni.m84121x5f203770();
            } catch (java.lang.Throwable unused) {
                or5.b.e("Get cur network stack failed", new java.lang.Object[0]);
                i17 = 0;
            }
            a0Var.b(i17);
        } else {
            a0Var.b(i18);
        }
        tr5.t tVar = f503036c;
        int a17 = a0Var.a();
        ((es5.b) tVar).getClass();
        a0Var.g(new es5.c(a17, null));
        tr5.y a18 = ((fs5.d) f503038e).a(nVar.getClass(), f0Var.f503008a);
        a0Var.i(a18);
        tr5.f fVar = new tr5.f();
        a0Var.f502977e = fVar;
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new android.util.ArraySet());
        if (synchronizedSet == null) {
            throw new java.lang.IllegalArgumentException("dnses".concat(" can not be null"));
        }
        a0Var.f502980h = synchronizedSet;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a0Var.f502981i = arrayList;
        try {
            if (iVar != null) {
                tr5.g0 d17 = d(f0Var);
                j17 = elapsedRealtime;
                or5.b.a("getResultFromCache: " + d17, new java.lang.Object[0]);
                if (((tr5.y) d17.f503026e).d()) {
                    if (!((tr5.y) d17.f503026e).g()) {
                        kVar.f503033a = d17;
                        or5.b.a("DnsManager lookup getResultFromCache success", new java.lang.Object[0]);
                        b(a0Var);
                        countDownLatch.countDown();
                        concurrentHashMap.remove(f0Var);
                        or5.b.a("FINALLY statMerge: %s", a18.e());
                        a(a0Var);
                        synchronizedSet.clear();
                        java.nio.channels.Selector selector = a0Var.f502979g;
                        if (selector != null) {
                            try {
                                selector.close();
                                or5.b.a("%s closed", selector);
                            } catch (java.io.IOException e18) {
                                or5.b.b("exception: %s", e18);
                            }
                        }
                        return d17;
                    }
                    tr5.u f17 = a0Var.f();
                    tr5.z zVar = d17.f503025d;
                    es5.c cVar = (es5.c) f17;
                    synchronized (cVar) {
                        java.lang.String[] strArr = zVar.f503042d;
                        java.lang.String[] strArr2 = zVar.f503043e;
                        if (strArr != null && strArr.length > 0) {
                            cVar.f337965f = java.util.Arrays.asList(strArr);
                        }
                        if (strArr2 != null && strArr2.length > 0) {
                            cVar.f337966g = java.util.Arrays.asList(strArr2);
                        }
                    }
                    ((lr5.d) lr5.e.f402303c).execute(new tr5.h(d17));
                }
                a18.f(a0Var);
                h(iVar, a0Var);
                java.util.Set set = a0Var.f502980h;
                if (set == null) {
                    throw new java.lang.IllegalStateException("mDnses".concat(" is not initialized yet"));
                }
                if (!set.isEmpty() && iVar2 != null) {
                    h(iVar2, a0Var);
                }
            } else {
                j17 = elapsedRealtime;
                if (iVar2 != null) {
                    h(iVar2, a0Var);
                }
            }
            java.util.concurrent.CountDownLatch b17 = fVar.b();
            a0Var.f502978f = b17;
            tr5.g0 c17 = c(b17, a0Var, f0Var, kVar, arrayList, j17);
            b(a0Var);
            countDownLatch.countDown();
            concurrentHashMap.remove(f0Var);
            or5.b.a("FINALLY statMerge: %s", a18.e());
            a(a0Var);
            synchronizedSet.clear();
            java.nio.channels.Selector selector2 = a0Var.f502979g;
            if (selector2 != null) {
                try {
                    selector2.close();
                    or5.b.a("%s closed", selector2);
                } catch (java.io.IOException e19) {
                    or5.b.b("exception: %s", e19);
                }
            }
            return c17;
        } finally {
        }
    }

    public static tr5.g0 f(tr5.f0 f0Var) {
        tr5.g0 e17 = e(f0Var);
        or5.b.a("LookupResult %s", e17.f503025d);
        return e17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(tr5.r r5, tr5.a0 r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepareTask:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            or5.b.a(r0, r2)
            java.util.Set r0 = r6.c()
            r0.add(r5)
            tr5.f0 r0 = r6.f502973a
            boolean r2 = r0.f503015h
            if (r2 != 0) goto L6a
            tr5.g r2 = r5.mo11135x730bcac6()
            java.lang.String r2 = r2.f503023a
            java.lang.String r3 = "Local"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L31
            goto L6a
        L31:
            java.lang.String r0 = r0.f503013f
            java.lang.String r2 = "Https"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L66
            java.nio.channels.Selector r0 = r6.f502979g
            if (r0 != 0) goto L5c
            java.nio.channels.Selector r0 = java.nio.channels.Selector.open()     // Catch: java.lang.Exception -> L50
            r6.f502979g = r0     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "%s opened"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L50
            or5.b.a(r2, r0)     // Catch: java.lang.Exception -> L50
            r0 = 1
            goto L5a
        L50:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 3
            java.lang.String r4 = "Open selector failed"
            or5.b.c(r3, r0, r4, r2)
            r0 = r1
        L5a:
            if (r0 == 0) goto L66
        L5c:
            tr5.p r0 = r5.a(r6)
            if (r0 == 0) goto L66
            tr5.c0.c(r0, r6, r1)
            goto L69
        L66:
            tr5.c0.b(r5, r6)
        L69:
            return
        L6a:
            tr5.c0.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tr5.l.g(tr5.r, tr5.a0):void");
    }

    public static void h(tr5.i iVar, tr5.a0 a0Var) {
        int a17 = a0Var.a();
        boolean z17 = a0Var.f502973a.f503017j;
        tr5.r rVar = iVar.f503028a;
        if (rVar != null && (z17 || a17 == 3 || (rVar instanceof wr5.b))) {
            g(rVar, a0Var);
            return;
        }
        tr5.r rVar2 = iVar.f503029b;
        if (rVar2 != null && (z17 || a17 == 1)) {
            g(rVar2, a0Var);
            return;
        }
        tr5.r rVar3 = iVar.f503030c;
        if (rVar3 != null) {
            if (z17 || a17 == 2) {
                g(rVar3, a0Var);
            }
        }
    }

    public static synchronized void i(tr5.r rVar) {
        tr5.i iVar;
        synchronized (tr5.l.class) {
            if (rVar == null) {
                throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
            }
            java.lang.String str = rVar.mo11135x730bcac6().f503023a;
            java.util.Map map = f503034a;
            if (map.containsKey(str)) {
                iVar = (tr5.i) map.get(str);
            } else {
                tr5.i iVar2 = new tr5.i(null);
                map.put(str, iVar2);
                iVar = iVar2;
            }
            int i17 = rVar.mo11135x730bcac6().f503024b;
            if (i17 == 1) {
                iVar.f503029b = rVar;
            } else if (i17 == 2) {
                iVar.f503030c = rVar;
            } else if (i17 == 3) {
                iVar.f503028a = rVar;
            }
        }
    }
}
