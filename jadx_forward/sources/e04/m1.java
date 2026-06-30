package e04;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.m1 f327557d = new e04.m1();

    @Override // java.lang.Runnable
    public final void run() {
        e04.r1 r1Var = e04.t1.f327628c;
        java.util.HashMap hashMap = e04.t1.f327636k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner taskSize: %s", java.lang.Integer.valueOf(hashMap.size()));
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            e04.s1 s1Var = (e04.s1) entry.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner key: " + ((java.lang.String) entry.getKey()));
            ku5.q mo144429x75286adb = s1Var.f327618a.mo144429x75286adb();
            ku5.q qVar = ku5.q.WAITING;
            wu5.c cVar = s1Var.f327618a;
            if (mo144429x75286adb != qVar) {
                e04.r1 r1Var2 = e04.t1.f327628c;
                ku5.q mo144429x75286adb2 = cVar.mo144429x75286adb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144429x75286adb2, "getState(...)");
                if (!(mo144429x75286adb2 == ku5.q.COMPLETE || mo144429x75286adb2 == ku5.q.THROW || mo144429x75286adb2 == ku5.q.ERROR)) {
                }
            }
            java.lang.Runnable runnable = s1Var.f327619b;
            if ((runnable instanceof st5.c) || (runnable instanceof st5.a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner cancelTask: " + ((java.lang.String) entry.getKey()) + ", state: " + cVar.mo144429x75286adb() + ", ret: " + cVar.cancel(true));
            }
        }
        e04.t1.f327636k.clear();
    }
}
