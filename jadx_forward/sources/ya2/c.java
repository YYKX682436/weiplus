package ya2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f541992a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public c() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final ya2.b2 a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ya2.b2 b2Var = (ya2.b2) this.f541992a.get(key);
        if (b2Var != null) {
            return b2Var.t0();
        }
        return null;
    }
}
