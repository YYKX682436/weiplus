package on3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final on3.a f428635a = new on3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f428636b = new java.util.HashMap();

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        java.util.HashMap hashMap = f428636b;
        synchronized (hashMap) {
            java.lang.Object obj = hashMap.get(str);
            if (obj == null) {
                obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("NewLifeConfig." + str, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getMMKV(...)");
                hashMap.put(str, obj);
            }
            o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) obj;
        }
        return o4Var;
    }
}
