package l26;

/* loaded from: classes14.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f396802a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f396803b = new java.util.concurrent.atomic.AtomicInteger(0);

    public final int a(java.lang.String keyQualifiedName) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyQualifiedName, "keyQualifiedName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f396802a;
        l26.p0 p0Var = new l26.p0(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(concurrentHashMap, "<this>");
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(keyQualifiedName);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            java.lang.Integer num2 = (java.lang.Integer) concurrentHashMap.get(keyQualifiedName);
            if (num2 == null) {
                java.lang.Object mo146xb9724478 = p0Var.mo146xb9724478(keyQualifiedName);
                concurrentHashMap.putIfAbsent(keyQualifiedName, java.lang.Integer.valueOf(((java.lang.Number) mo146xb9724478).intValue()));
                num2 = (java.lang.Integer) mo146xb9724478;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            intValue = num2.intValue();
        }
        return intValue;
    }
}
