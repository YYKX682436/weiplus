package cl;

/* loaded from: classes7.dex */
public final class j0 implements cl.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f124199a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f124200b = new java.util.concurrent.atomic.AtomicInteger(0);

    public cl.k0 a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareBufferTracerManager", "getBuffer[" + i17 + ']');
        return (cl.k0) ((java.util.HashMap) this.f124199a).get(java.lang.Integer.valueOf(i17));
    }

    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareBufferTracerManager", "untrace[" + i17 + ']');
        ((java.util.HashMap) this.f124199a).remove(java.lang.Integer.valueOf(i17));
    }
}
