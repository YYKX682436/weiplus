package sd;

/* loaded from: classes8.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f488178a = new java.util.concurrent.ConcurrentHashMap();

    public static sd.o0 a(android.content.Context context, java.lang.Integer num) {
        if (num == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f488178a;
        if (!concurrentHashMap.containsKey(num)) {
            return null;
        }
        sd.o0 o0Var = (sd.o0) concurrentHashMap.remove(num);
        o0Var.l(context);
        o0Var.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sd.q0.class.getSimpleName(), "retrieve, holding size: %d", java.lang.Integer.valueOf(concurrentHashMap.size()));
        return o0Var;
    }
}
