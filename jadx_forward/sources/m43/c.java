package m43;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static m43.c f404988b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f404989a = new java.util.concurrent.ConcurrentHashMap();

    public static m43.c b() {
        if (f404988b == null) {
            f404988b = new m43.c();
        }
        return f404988b;
    }

    public void a(java.lang.String str, m43.b bVar) {
        synchronized (this) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            if (((java.util.concurrent.ConcurrentHashMap) this.f404989a).containsKey(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAutoRunController", "taskId:%s exists in the queue", str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAutoRunController", "add taskId:%s to the queue", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(str, (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new m43.a(this, str, bVar), false);
            b4Var.c(60000L, 60000L);
            ((java.util.concurrent.ConcurrentHashMap) this.f404989a).put(str, b4Var);
        }
    }
}
