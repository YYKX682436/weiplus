package px5;

/* loaded from: classes11.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final long a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = px5.b.f440491b;
        if (!hashMap.containsKey(key)) {
            return 0L;
        }
        java.lang.Object obj = hashMap.get(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        long longValue = ((java.lang.Number) obj).longValue();
        hashMap.remove(key);
        return java.lang.System.currentTimeMillis() - longValue;
    }
}
