package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable, f75.a {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f274382f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f274383d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 f274384e;

    public m3(java.lang.Runnable runnable, com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var) {
        this.f274383d = runnable;
        this.f274384e = l3Var;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.m3 a(java.lang.Runnable runnable, com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m3 m3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.m3(runnable, l3Var);
        ((java.util.concurrent.ConcurrentHashMap) f274382f).put(runnable, m3Var);
        return m3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.f m17;
        gi.e1 e1Var = (gi.e1) this.f274384e;
        e1Var.getClass();
        java.lang.Runnable runnable = this.f274383d;
        java.lang.String name = runnable.getClass().getName();
        int hashCode = runnable.hashCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.MMHandlerJiffies", "#onTaskStart: " + name + ", hashcode=" + hashCode);
        gi.g1 g1Var = e1Var.f353557b;
        g1Var.getClass();
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper() && (m17 = g1Var.m(name, android.os.Process.myTid())) != null) {
            ((java.util.concurrent.ConcurrentHashMap) g1Var.f476924c).put(java.lang.Integer.valueOf(hashCode), m17);
            g1Var.r(android.os.Process.myTid(), name, ((java.lang.Long) m17.f476910g.f477085a).longValue());
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) e1Var.f353556a;
        gi.f1 f1Var = (gi.f1) concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        if (f1Var != null) {
            g1Var.f476827a.f444870f.removeCallbacks(f1Var);
            f1Var.f353561d = name;
            f1Var.f353562e = currentThread;
            f1Var.f353563f = java.lang.System.currentTimeMillis();
        } else {
            f1Var = new gi.f1(g1Var);
            f1Var.f353561d = name;
            f1Var.f353562e = currentThread;
            f1Var.f353563f = java.lang.System.currentTimeMillis();
        }
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), f1Var);
        g1Var.f476827a.f444870f.postDelayed(f1Var, gi.g1.f353566l);
        runnable.run();
        e1Var.getClass();
        java.lang.String name2 = runnable.getClass().getName();
        int hashCode2 = runnable.hashCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.MMHandlerJiffies", "#onTaskFinish: " + name2 + ", hashcode=" + hashCode2);
        gi.g1 g1Var2 = e1Var.f353557b;
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) g1Var2.f476924c).remove(java.lang.Integer.valueOf(hashCode2));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper() && fVar != null) {
            rh.f m18 = g1Var2.m(name2, android.os.Process.myTid());
            if (m18 != null) {
                m18.f476914k = true;
                g1Var2.u(fVar, m18);
            }
            g1Var2.r(android.os.Process.myTid(), "thread_pool@idle", ((java.lang.Long) (m18 == null ? fVar.f476910g : m18.f476910g).f477085a).longValue());
        }
        gi.f1 f1Var2 = (gi.f1) ((java.util.concurrent.ConcurrentHashMap) e1Var.f353556a).remove(java.lang.Integer.valueOf(hashCode2));
        if (f1Var2 != null) {
            g1Var2.f476827a.f444870f.removeCallbacks(f1Var2);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f1Var2.f353563f;
            if (currentTimeMillis > gi.g1.f353567m) {
                f1Var2.a(false, currentTimeMillis);
            }
        }
    }
}
