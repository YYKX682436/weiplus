package ig2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f372928c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f372930e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f372931f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f372932g;

    /* renamed from: a, reason: collision with root package name */
    public static final ig2.m f372926a = new ig2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f372927b = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f372929d = true;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f372933h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f372934i = new java.util.HashMap();

    public final ig2.h a(long j17) {
        java.util.HashMap hashMap = f372934i;
        ig2.j jVar = (ig2.j) hashMap.get(java.lang.Long.valueOf(j17));
        boolean z17 = false;
        if (ig2.e.f372905a.c()) {
            if ((jVar != null ? jVar.f372942h : null) != null) {
                mn0.b0 b0Var = jVar.f372942h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
                if (((mn0.y) b0Var).b(false) && !jVar.f372920l && f372928c) {
                    z17 = true;
                }
            }
        }
        ig2.h hVar = new ig2.h(j17, z17, jVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" checkAutoPlay feedId: ");
        sb6.append(j17);
        sb6.append("  canReusePlayer:");
        sb6.append(z17);
        sb6.append("  isFloatWindow: ");
        sb6.append(jVar != null ? java.lang.Boolean.valueOf(jVar.f372920l) : null);
        sb6.append("  feedId= ");
        sb6.append(j17);
        sb6.append(" map = ");
        sb6.append(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", sb6.toString());
        return hVar;
    }

    public final void b(ig2.r rVar) {
        mn0.b0 b0Var;
        boolean z17 = rVar instanceof ig2.i ? ((ig2.i) rVar).c().f372920l : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "checkDirectorPlayerStop releaseDirector: " + rVar + " isFloatWindow: " + z17 + " isLiveRoomOnDestroy: " + f372929d + " isDetach: " + rVar.i());
        if (z17) {
            return;
        }
        if (rVar instanceof ig2.f) {
            mn0.b0 b0Var2 = ((ig2.f) rVar).f372906d.f407760z;
            if (b0Var2 != null) {
                mn0.b0.C(b0Var2, true, false, false, 6, null);
            }
        } else {
            ig2.n c17 = rVar.c();
            if (c17 != null && (b0Var = c17.f372942h) != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        rVar.h();
    }

    public final void c() {
        java.util.HashMap hashMap = f372934i;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "clearFluentExitLiveRoomPlayerList feedId:" + ((ig2.j) entry.getValue()).f372936b + " player:" + ((ig2.j) entry.getValue()).f372942h);
            mn0.b0 b0Var = ((ig2.j) entry.getValue()).f372942h;
            if (b0Var != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        hashMap.clear();
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList exitParamsSize: ");
        sb6.append(f372934i.size());
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap = f372933h;
        sb6.append(hashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", sb6.toString());
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            f372926a.b((ig2.r) ((java.util.Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
        c();
    }

    public final void e(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList feedId: ");
        sb6.append(j17);
        sb6.append(" exitParamsSize: ");
        java.util.HashMap hashMap = f372934i;
        sb6.append(hashMap);
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap2 = f372933h;
        sb6.append(hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", sb6.toString());
        ig2.r rVar = (ig2.r) hashMap2.remove(java.lang.Long.valueOf(j17));
        if (rVar != null) {
            f372926a.b(rVar);
        }
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final ig2.r f(long j17) {
        return (ig2.r) f372933h.get(java.lang.Long.valueOf(j17));
    }

    public final void g() {
        ig2.e eVar;
        mn0.b0 b0Var;
        mn0.b0 b0Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release size:");
        java.util.HashMap hashMap = f372933h;
        sb6.append(hashMap.size());
        sb6.append(' ');
        sb6.append(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", sb6.toString());
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = ig2.e.f372905a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            ((java.lang.Number) entry.getKey()).longValue();
            ig2.r rVar = (ig2.r) entry.getValue();
            boolean z17 = rVar instanceof ig2.i ? ((ig2.i) rVar).c().f372920l : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "square exit start releaseDirector: " + rVar + " isFloatWindow: " + z17 + " isLiveRoomOnDestroy: " + f372929d + " isDetach: " + rVar.i());
            if (!z17 && eVar.c() && (f372929d || !rVar.i())) {
                if (rVar instanceof ig2.f) {
                    mn0.b0 b0Var3 = ((ig2.f) rVar).f372906d.f407760z;
                    if (b0Var3 != null) {
                        mn0.b0.C(b0Var3, true, false, false, 6, null);
                    }
                } else {
                    ig2.n c17 = rVar.c();
                    if (c17 != null && (b0Var2 = c17.f372942h) != null) {
                        mn0.b0.C(b0Var2, true, false, false, 6, null);
                    }
                }
                rVar.h();
            }
        }
        hashMap.clear();
        java.util.HashMap hashMap2 = f372934i;
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            ((java.lang.Number) entry2.getKey()).longValue();
            ig2.j jVar = (ig2.j) entry2.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "square exit start releaseParams: " + jVar + " isFloatWindow: " + jVar + ".isFloatWindow isLiveRoomOnDestory: " + f372929d);
            if (!jVar.f372920l && eVar.c() && f372929d && (b0Var = jVar.f372942h) != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        hashMap2.clear();
    }

    public final ig2.r h(long j17, boolean z17) {
        ig2.r rVar = (ig2.r) f372933h.get(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j17 + " director:" + rVar);
        if (rVar instanceof ig2.i) {
            ig2.i iVar = (ig2.i) rVar;
            iVar.c();
            f372934i.put(java.lang.Long.valueOf(j17), iVar.c());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "getSwitchInLiveRoomDirector feedId:" + j17 + " checkDetach:" + z17 + " director:" + rVar);
        boolean z18 = false;
        if (rVar != null && rVar.i()) {
            z18 = true;
        }
        if (z18 && z17) {
            return null;
        }
        return rVar;
    }

    public final ig2.r i(android.content.Context context, ig2.n params) {
        ig2.r iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        long j17 = params.f372936b;
        boolean z17 = params instanceof ig2.g;
        if (z17) {
            android.content.Context applicationContext = context.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
            iVar = new ig2.f(applicationContext);
        } else {
            android.content.Context applicationContext2 = context.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext2, "getApplicationContext(...)");
            iVar = new ig2.i(applicationContext2);
        }
        ig2.r rVar = iVar;
        rVar.e(params);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "startSwitchOutFromSquare feedId: " + j17 + " director: " + rVar + ' ');
        g();
        f372933h.put(java.lang.Long.valueOf(j17), rVar);
        ez2.f fVar = ez2.f.f339431e;
        ez2.a aVar = ez2.a.f339388d;
        ez2.a aVar2 = params.f372935a;
        ez2.g.f339435a = new ez2.e(j17, fVar, aVar2 == aVar ? ez2.d.f339404g : z17 ? ez2.d.f339406i : aVar2 == ez2.a.f339397p ? ez2.d.f339407m : ez2.d.f339408n, aVar2.ordinal(), (16 & 16) != 0 ? -1L : 0L);
        return rVar;
    }
}
