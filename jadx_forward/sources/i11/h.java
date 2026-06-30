package i11;

/* loaded from: classes13.dex */
public class h implements i11.e {
    public static i11.h H = null;
    public static final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public static int f368624J = 0;
    public static long K = -1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 E;
    public final i11.s F;
    public final i11.t G;

    /* renamed from: b, reason: collision with root package name */
    public i11.u f368626b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f368627c;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f368641q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f368642r;

    /* renamed from: s, reason: collision with root package name */
    public int f368643s;

    /* renamed from: a, reason: collision with root package name */
    public boolean f368625a = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f368628d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f368629e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f368630f = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: g, reason: collision with root package name */
    public long f368631g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f368632h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f368633i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f368634j = false;

    /* renamed from: k, reason: collision with root package name */
    public double f368635k = 23.0d;

    /* renamed from: l, reason: collision with root package name */
    public double f368636l = 100.0d;

    /* renamed from: m, reason: collision with root package name */
    public int f368637m = 0;

    /* renamed from: n, reason: collision with root package name */
    public double f368638n = 0.0d;

    /* renamed from: o, reason: collision with root package name */
    public double f368639o = 0.0d;

    /* renamed from: p, reason: collision with root package name */
    public double f368640p = 0.0d;

    /* renamed from: t, reason: collision with root package name */
    public boolean f368644t = false;

    /* renamed from: u, reason: collision with root package name */
    public long f368645u = 0;

    /* renamed from: v, reason: collision with root package name */
    public double f368646v = 23.0d;

    /* renamed from: w, reason: collision with root package name */
    public double f368647w = 100.0d;

    /* renamed from: x, reason: collision with root package name */
    public int f368648x = 0;

    /* renamed from: y, reason: collision with root package name */
    public double f368649y = 0.0d;

    /* renamed from: z, reason: collision with root package name */
    public double f368650z = 0.0d;
    public double A = 0.0d;
    public long B = 0;
    public boolean C = false;
    public boolean D = false;

    static {
        boolean equals = j62.e.g().a("clicfg_battery_location_tms_enable", "1", false, true).equals("1");
        I = equals;
        if (equals) {
            com.p314xaae8f345.mm.app.q5.b().a(new i11.i());
        }
    }

    public h(android.content.Context context) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("LocationGeoCacheMMKV");
        this.F = new i11.m(this);
        this.G = new i11.o(this);
        this.f368627c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(i11.h r18, boolean r19, double r20, double r22, double r24, double r26, boolean r28) {
        /*
            r0 = r18
            r1 = r26
            if (r19 == 0) goto Lc
            boolean r3 = r0.C
            if (r3 == 0) goto Lc
            goto Lbc
        Lc:
            if (r19 != 0) goto L14
            boolean r3 = r0.D
            if (r3 == 0) goto L17
            goto Lbc
        L14:
            r18.getClass()
        L17:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.f368631g
            long r5 = r3 - r5
            r7 = 500(0x1f4, double:2.47E-321)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L26
            goto L4a
        L26:
            r7 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L2f
            r5 = 12
            goto L4c
        L2f:
            r7 = 2000(0x7d0, double:9.88E-321)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L38
            r5 = 14
            goto L4c
        L38:
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L41
            r5 = 16
            goto L4c
        L41:
            r7 = 8000(0x1f40, double:3.9525E-320)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L4a
            r5 = 18
            goto L4c
        L4a:
            r5 = 10
        L4c:
            if (r19 != 0) goto L50
            int r5 = r5 + 1
        L50:
            com.tencent.mm.plugin.report.service.g0 r14 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r7 = 584(0x248, double:2.885E-321)
            long r9 = (long) r5
            r11 = 1
            r13 = 1
            r6 = r14
            r6.mo68477x336bdfd8(r7, r9, r11, r13)
            r5 = 1
            if (r19 == 0) goto Lba
            r15 = 584(0x248, double:2.885E-321)
            r9 = 30
            r11 = 1
            r17 = 1
            r7 = 584(0x248, double:2.885E-321)
            r13 = 1
            r6 = r14
            r6.mo68477x336bdfd8(r7, r9, r11, r13)
            r9 = 31
            long r6 = r0.f368631g
            long r11 = r3 - r6
            r6 = r14
            r7 = r15
            r13 = r17
            r6.mo68477x336bdfd8(r7, r9, r11, r13)
            r0.C = r5
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r20 * r3
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            double r6 = r22 * r3
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r5] = r6
            double r3 = r3 * r1
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r0[r4] = r3
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            if (r28 == 0) goto Lac
            goto Lad
        Lac:
            r5 = r4
        Lad:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 4
            r0[r2] = r1
            r1 = 15391(0x3c1f, float:2.1567E-41)
            r14.d(r1, r0)
            goto Lbc
        Lba:
            r0.D = r5
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i11.h.a(i11.h, boolean, double, double, double, double, boolean):void");
    }

    public static void b(i11.h hVar, int i17) {
        hVar.getClass();
        if (gm0.j1.b().m()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append((int) hVar.f368639o);
            stringBuffer.append(",");
            stringBuffer.append(hVar.f368637m);
            stringBuffer.append(",");
            stringBuffer.append((int) (hVar.f368635k * 1000000.0d));
            stringBuffer.append(",");
            stringBuffer.append((int) (hVar.f368636l * 1000000.0d));
            gm0.j1.u().c().w(i17, stringBuffer.toString());
        }
    }

    public static void c(i11.h hVar, boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, android.os.Bundle bundle) {
        hVar.getClass();
        java.util.LinkedList<i11.c> linkedList = new java.util.LinkedList();
        java.util.LinkedList<i11.c> linkedList2 = new java.util.LinkedList();
        java.util.concurrent.locks.ReentrantLock reentrantLock = hVar.f368630f;
        reentrantLock.lock();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) hVar.f368628d;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null) {
                linkedList.add((i11.c) weakReference.get());
            }
        }
        copyOnWriteArrayList.size();
        linkedList.size();
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationGeo", "no location listener weakrefers, may have leak, stop location");
            copyOnWriteArrayList.clear();
            i11.u uVar = hVar.f368626b;
            if (uVar != null) {
                uVar.f368685a.mo50293x3498a0(new i11.w(uVar));
            }
        }
        boolean isEmpty = linkedList.isEmpty();
        java.util.List list = hVar.f368629e;
        if (isEmpty) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) list;
            if (!copyOnWriteArrayList2.isEmpty()) {
                java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
                while (it6.hasNext()) {
                    i11.c cVar = (i11.c) it6.next();
                    if (cVar != null) {
                        linkedList2.add(cVar);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "onCallbackLocation persistListeners:%d, persistlists:%d", java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list).size()), java.lang.Integer.valueOf(linkedList2.size()));
        reentrantLock.unlock();
        for (i11.c cVar2 : linkedList) {
            if (x51.o1.f533577b && z65.c.a()) {
                cVar2.mo630x9b865cc(z17, (float) x51.o1.f533606z, (float) x51.o1.f533605y, i17, (float) d19, d27, d28);
            } else {
                cVar2.mo630x9b865cc(z17, (float) d18, (float) d17, i17, (float) d19, d27, d28);
            }
            if (cVar2 instanceof i11.d) {
                ((i11.d) cVar2).w6(z17, (float) d18, (float) d17, i17, (float) d19, d27, d28, bundle);
            }
        }
        for (i11.c cVar3 : linkedList2) {
            if (x51.o1.f533577b && z65.c.a()) {
                cVar3.mo630x9b865cc(z17, (float) x51.o1.f533606z, (float) x51.o1.f533605y, i17, (float) d19, d27, d28);
            } else {
                cVar3.mo630x9b865cc(z17, (float) d18, (float) d17, i17, (float) d19, d27, d28);
            }
            if (cVar3 instanceof i11.d) {
                ((i11.d) cVar3).w6(z17, (float) d18, (float) d17, i17, (float) d19, d27, d28, bundle);
            }
        }
    }

    public static i11.h e() {
        if (H == null) {
            H = new i11.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (H.f368626b == null && fp.q.b("xmap")) {
            H.f368626b = i11.u.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        return H;
    }

    public static void i() {
        if (I && !com.p314xaae8f345.mm.app.q5.b().f135271a) {
            f368624J++;
            ((ob0.n2) i95.n0.c(ob0.n2.class)).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationGeo", "onBgLocateRequest, count = " + f368624J + ", stack = \nnull");
        }
    }

    public long d() {
        if (this.f368644t) {
            return this.f368645u;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.E;
        return o4Var.contains("wgs84_cache_time") ? o4Var.q("wgs84_cache_time", 0L) : this.f368645u;
    }

    public void f(i11.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "getWgs84FromCache wgs84Cache: %s, cacheTime: %s", java.lang.Boolean.valueOf(this.f368634j), java.lang.Long.valueOf(this.f368632h));
        if (!this.f368634j || java.lang.System.currentTimeMillis() - this.f368632h >= 600000) {
            cVar.mo630x9b865cc(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
        } else {
            cVar.mo630x9b865cc(true, (float) this.f368636l, (float) this.f368635k, this.f368637m, (float) this.f368638n, this.f368639o, this.f368640p);
        }
    }

    public void g(i11.c cVar) {
        if (this.f368644t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "getWgs84FromCacheWithoutTimelinessLimit bizCacheTime: %s", java.lang.Long.valueOf(this.f368645u));
            cVar.mo630x9b865cc(true, (float) this.f368647w, (float) this.f368646v, this.f368648x, (float) this.f368649y, this.f368650z, this.A);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.E;
        if (!o4Var.contains("wgs84_longitude") || !o4Var.contains("wgs84_latitude")) {
            cVar.mo630x9b865cc(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "getWgs84FromCacheWithoutTimelinessLimit from mmkv fail");
        } else {
            double k17 = o4Var.k("wgs84_longitude");
            double k18 = o4Var.k("wgs84_latitude");
            cVar.mo630x9b865cc(true, (float) k17, (float) k18, 0, 0.0d, 0.0d, 0.0d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "getWgs84FromCacheWithoutTimelinessLimit from mmkv: %f, %f", java.lang.Double.valueOf(k17), java.lang.Double.valueOf(k18));
        }
    }

    public boolean h() {
        return this.f368632h > 0 && this.f368634j && java.lang.System.currentTimeMillis() - this.f368632h < 600000;
    }

    public void j(i11.c cVar, boolean z17) {
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "startGcj02 %s useCache %s ", cVar, java.lang.Boolean.valueOf(z17));
        if (this.f368626b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationGeo", "fail, location service not yet ready");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new i11.k(this, cVar));
            return;
        }
        i();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f368630f;
        reentrantLock.lock();
        boolean z19 = this.f368625a;
        i11.s sVar = this.F;
        java.util.List list = this.f368628d;
        android.content.Context context = this.f368627c;
        if (!z19 && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            this.f368631g = java.lang.System.currentTimeMillis();
            this.C = false;
            this.D = false;
            i11.u uVar = this.f368626b;
            uVar.f368685a.mo50293x3498a0(new i11.w(uVar));
            this.f368626b.e(sVar, context, 1, android.os.Looper.getMainLooper());
        }
        this.f368625a = true;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = true;
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((i11.c) weakReference.get()).equals(cVar)) {
                z18 = false;
                break;
            }
        }
        if (z18) {
            copyOnWriteArrayList.add(new java.lang.ref.WeakReference(cVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "add listeners size %d, persistListeners size:%d", java.lang.Integer.valueOf(copyOnWriteArrayList.size()), java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) this.f368629e).size()));
        if (copyOnWriteArrayList.size() == 1 && z18) {
            this.f368631g = java.lang.System.currentTimeMillis();
            this.C = false;
            this.D = false;
            this.f368626b.e(sVar, context, 1, android.os.Looper.getMainLooper());
        }
        if (z17 && this.f368633i && java.lang.System.currentTimeMillis() - this.f368632h < 600000) {
            sVar.a(true, this.f368635k, this.f368636l, this.f368637m, this.f368638n, this.f368639o, this.f368640p, this.f368641q, this.f368642r, this.f368643s);
        }
        reentrantLock.unlock();
    }

    public void k(i11.c cVar, boolean z17) {
        l(cVar, z17, true, false);
    }

    public void l(i11.c cVar, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        android.content.Context context;
        i11.t tVar;
        boolean z28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "startWgs84 %s userCache %s continuous %b", cVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (this.f368626b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationGeo", "fail, location service not yet ready");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new i11.j(this, cVar));
            return;
        }
        i();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f368630f;
        reentrantLock.lock();
        boolean z29 = this.f368625a;
        i11.t tVar2 = this.G;
        java.util.List list = this.f368628d;
        android.content.Context context2 = this.f368627c;
        if (z29 && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            this.f368631g = java.lang.System.currentTimeMillis();
            this.C = false;
            this.D = false;
            i11.u uVar = this.f368626b;
            uVar.f368685a.mo50293x3498a0(new i11.w(uVar));
            this.f368626b.e(tVar2, context2, 0, android.os.Looper.getMainLooper());
        }
        this.f368625a = false;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z27 = true;
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((i11.c) weakReference.get()).equals(cVar)) {
                z27 = false;
                break;
            }
        }
        if (z27) {
            copyOnWriteArrayList.add(new java.lang.ref.WeakReference(cVar));
        }
        java.util.List list2 = this.f368629e;
        if (z19) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) list2;
            java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z28 = true;
                    break;
                }
                i11.c cVar2 = (i11.c) it6.next();
                if (cVar2 != null && cVar2.equals(cVar)) {
                    z28 = false;
                    break;
                }
            }
            if (z28) {
                copyOnWriteArrayList2.add(cVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "add listeners size %d, persistListeners size:%d", java.lang.Integer.valueOf(copyOnWriteArrayList.size()), java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list2).size()));
        if (z17 && this.f368634j && java.lang.System.currentTimeMillis() - this.f368632h < 600000) {
            context = context2;
            tVar = tVar2;
            tVar2.a(true, this.f368635k, this.f368636l, this.f368637m, this.f368638n, this.f368639o, this.f368640p, this.f368641q, this.f368642r, this.f368643s);
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "once location, and can use cache");
                reentrantLock.unlock();
                return;
            }
        } else {
            context = context2;
            tVar = tVar2;
        }
        if (copyOnWriteArrayList.size() == 1 && z27) {
            this.f368631g = java.lang.System.currentTimeMillis();
            this.C = false;
            this.D = false;
            this.f368626b.e(tVar, context, 0, android.os.Looper.getMainLooper());
        }
        reentrantLock.unlock();
    }

    public void m(i11.c cVar) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new i11.p(this, cVar));
    }
}
