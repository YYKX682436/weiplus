package bf3;

/* loaded from: classes7.dex */
public interface m extends bl.a {
    @Override // bl.a
    default void d(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        byte[] bytes = msg.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        z65.c.b(android.util.Base64.encodeToString(bytes, 2), "appbrand_commonbinding");
    }

    @Override // bl.a
    default void g(int i17, int i18, int i19) {
        try {
            jx3.f.INSTANCE.w(i17, i18, i19);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // bl.a
    default void reportKV(int i17, java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        try {
            jx3.f.INSTANCE.kvStat(i17, value);
        } catch (java.lang.Exception unused) {
        }
    }
}
