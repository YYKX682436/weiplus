package q7;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f441835a = new java.util.LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f441836b;

    /* renamed from: c, reason: collision with root package name */
    public long f441837c;

    public k(long j17) {
        this.f441836b = j17;
    }

    public int a(java.lang.Object obj) {
        return 1;
    }

    public void b(java.lang.Object obj, java.lang.Object obj2) {
    }

    public synchronized java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        long a17 = a(obj2);
        if (a17 >= this.f441836b) {
            b(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f441837c += a17;
        }
        java.lang.Object put = this.f441835a.put(obj, obj2);
        if (put != null) {
            this.f441837c -= a(put);
            if (!put.equals(obj2)) {
                b(obj, put);
            }
        }
        d(this.f441836b);
        return put;
    }

    public synchronized void d(long j17) {
        while (this.f441837c > j17) {
            java.util.Iterator it = ((java.util.LinkedHashMap) this.f441835a).entrySet().iterator();
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object value = entry.getValue();
            this.f441837c -= a(value);
            java.lang.Object key = entry.getKey();
            it.remove();
            b(key, value);
        }
    }
}
