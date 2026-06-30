package e11;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f327890a;

    /* renamed from: b, reason: collision with root package name */
    public static final e11.g f327891b = new e11.g();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f327892c = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.Future f327893d;

    public static void a(int i17, long j17) {
        if (f327892c && !f327890a) {
            e11.e eVar = new e11.e(c01.id.a(), java.lang.System.currentTimeMillis(), i17, j17);
            java.util.List list = f327891b.f327928f.f327896f;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
            if (copyOnWriteArrayList.size() > 30000) {
                for (int i18 = 0; i18 < 100; i18++) {
                    try {
                        ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e17.getMessage());
                    }
                }
            }
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void b(int i17, long j17) {
        if (f327892c && !f327890a) {
            e11.e eVar = new e11.e(c01.id.a(), java.lang.System.currentTimeMillis(), i17, j17);
            java.util.List list = f327891b.f327928f.f327895e;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
            if (copyOnWriteArrayList.size() > 30000) {
                for (int i18 = 0; i18 < 100; i18++) {
                    try {
                        ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e17.getMessage());
                    }
                }
            }
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static java.lang.String c(long j17) {
        return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date(j17));
    }

    public static void d(java.util.List list, java.util.List list2, boolean z17) {
        if (list2 == null) {
            return;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        }
    }

    public static final void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveDetector", "onActive() active:%s", java.lang.Boolean.valueOf(z17));
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).getBoolean("msg_delay_close_detect", false);
        f327892c = z18;
        if (z18) {
            f327890a = z17;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveDetector", "[oneliang]unactive, time%s, pid:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(android.os.Process.myPid()));
                if (f327893d == null) {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    e11.g gVar = f327891b;
                    f327893d = ((ku5.t0) u0Var).q(gVar);
                    gVar.f327934o = true;
                }
                c01.id.a();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveDetector", "[oneliang]active, time%s, pid:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(android.os.Process.myPid()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveDetector", "active, interrupt end, time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.concurrent.Future future = f327893d;
            if (future != null) {
                future.cancel(true);
            }
            f327893d = null;
            e11.g gVar2 = f327891b;
            gVar2.f327934o = false;
            gVar2.f327930h = 0L;
            gVar2.f327931i = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveDetector", "active, processDetector.clear end, time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c01.id.a();
        }
    }

    public static e11.a f(e11.f fVar, int i17) {
        if (fVar == null) {
            return null;
        }
        e11.a aVar = new e11.a();
        aVar.f327882d = fVar.f327919e;
        aVar.f327883e = fVar.f327920f;
        aVar.f327884f = fVar.f327921g;
        aVar.f327885g = i17;
        aVar.f327886h = fVar.f327918d;
        aVar.f327888m = fVar.f327923i;
        if (i17 == 1) {
            aVar.f327887i = fVar.f327922h;
        }
        return aVar;
    }
}
