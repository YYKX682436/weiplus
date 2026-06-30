package j01;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f378506b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f378507a = new java.util.concurrent.ConcurrentHashMap(64);

    public void a(j01.b bVar) {
        for (java.util.Map.Entry entry : this.f378507a.entrySet()) {
            java.lang.Object key = entry.getKey();
            android.os.Looper looper = entry.getValue() instanceof android.os.Looper ? (android.os.Looper) entry.getValue() : null;
            j01.a aVar = new j01.a(this, bVar, key);
            if (looper != null) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(looper).mo50293x3498a0(aVar);
            } else {
                f378506b.mo50293x3498a0(aVar);
            }
        }
    }
}
