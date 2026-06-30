package jb1;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jb1.d0 f380238a = new jb1.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f380239b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f380240c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o f380241d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f380242e;

    public final void a() {
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f380239b;
            java.util.ArrayList<jb1.a0> arrayList = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((jb1.a0) ((java.util.Map.Entry) it.next()).getValue());
            }
            for (jb1.a0 a0Var : arrayList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServerManager", "destroy server #" + a0Var.f380224d);
                a0Var.c();
            }
            ((java.util.concurrent.ConcurrentHashMap) f380239b).clear();
        }
    }

    public final jb1.a0 b(int i17) {
        if (f380242e) {
            return null;
        }
        return (jb1.a0) ((java.util.concurrent.ConcurrentHashMap) f380239b).get(java.lang.Integer.valueOf(i17));
    }
}
