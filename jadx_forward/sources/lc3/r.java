package lc3;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f399450a = new java.util.concurrent.ConcurrentHashMap();

    public final void a(int i17, java.lang.Object view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addView viewId:");
        sb6.append(i17);
        sb6.append(", view:");
        sb6.append(view);
        sb6.append(", size:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f399450a;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBDynamicBizContext", sb6.toString());
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), view);
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBDynamicBizContext", "removeView," + i17);
        this.f399450a.remove(java.lang.Integer.valueOf(i17));
    }
}
