package vd1;

/* loaded from: classes7.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vd1.f0 f517106a = new vd1.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f517107b = jz5.h.b(vd1.z.f517162d);

    /* renamed from: c, reason: collision with root package name */
    public static final long f517108c = java.util.concurrent.TimeUnit.MINUTES.toMillis(5);

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f517109d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) vd1.e0.f517103d, true);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f517110e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.w f517111f = new vd1.w();

    /* renamed from: g, reason: collision with root package name */
    public static long f517112g;

    public final synchronized void a(java.util.List list, vd1.x xVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f517109d;
        long j17 = f517108c;
        b4Var.c(j17, j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f517112g = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "doCgi queue.size=" + list.size() + ", reason=" + xVar.name());
        if (list.isEmpty()) {
            return;
        }
        ((ch1.c) c()).b(1074L, 1L, list.size());
        c().a(1074L, 4L);
        vd1.f fVar = new vd1.f();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            vd1.y yVar = (vd1.y) it.next();
            java.util.LinkedList linkedList = fVar.f517105b.f473900d;
            r45.re7 re7Var = new r45.re7();
            re7Var.f466314d = yVar.f517156b;
            re7Var.f466315e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(yVar.f517157c);
            re7Var.f466316f = yVar.f517160f;
            linkedList.add(re7Var);
        }
        fVar.a(null, new vd1.b0(list));
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, int i17, int i18, java.lang.String content, vd1.l priority) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priority, "priority");
        java.util.HashSet hashSet = f517110e;
        synchronized (hashSet) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(t37, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
            boolean add = hashSet.add((ze.n) t37);
            if (add && hashSet.size() == 1) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f517109d;
                long j18 = f517108c;
                b4Var.c(j18, j18);
            }
            if (add) {
                component.t3().N.a(new vd1.d0(component));
            }
        }
        c().a(1074L, 0L);
        synchronized (this) {
            vd1.w wVar = f517111f;
            wVar.b(new vd1.y(i17, i18, content, priority, component));
            vd1.n nVar = new vd1.n();
            nVar.b(component);
            nVar.f517138f = i17;
            nVar.f517139g = i18;
            nVar.f517140h = priority;
            nVar.f517141i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(f517108c);
            nVar.f517142j = 0;
            nVar.f517143k = vd1.m.f517128e;
            nVar.a();
            if (vd1.a0.f517094a[priority.ordinal()] == 1) {
                f517106a.a(wVar.a(65536L), vd1.x.f517153g);
            } else {
                vd1.v[] vVarArr = wVar.f517149a;
                java.util.ArrayList arrayList = new java.util.ArrayList(vVarArr.length);
                for (vd1.v vVar : vVarArr) {
                    synchronized (vVar.f517147c) {
                        j17 = vVar.f517148d;
                    }
                    arrayList.add(java.lang.Long.valueOf(j17));
                }
                if (kz5.n0.J0(arrayList) >= 65536) {
                    f517106a.a(f517111f.a(65536L), vd1.x.f517151e);
                } else {
                    long j19 = f517112g;
                    if (j19 > 0) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (android.os.SystemClock.elapsedRealtime() - j19 >= f517108c) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "enqueue, Util.ticksToNow(lastDoCgiTick) >= REPORT_PERIOD_INTERVAL");
                            f517106a.d(vd1.x.f517150d);
                        }
                    }
                }
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) ((jz5.n) f517107b).mo141623x754a37bb();
    }

    public final void d(vd1.x xVar) {
        a(f517111f.a(65536L), xVar);
    }
}
