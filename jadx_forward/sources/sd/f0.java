package sd;

/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f488133a = new java.util.concurrent.ConcurrentHashMap();

    public f0() {
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final boolean a(java.lang.Class cls) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f488133a;
            for (sd.e0 e0Var : concurrentHashMap.keySet()) {
                if (cls.isInstance(e0Var)) {
                    boolean a17 = e0Var.a();
                    if (((java.lang.Boolean) concurrentHashMap.get(e0Var)).booleanValue()) {
                        concurrentHashMap.remove(e0Var);
                    }
                    if (a17) {
                        return true;
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggagePageEventBus", "notifyListener on non-UI thread");
        }
        return false;
    }
}
