package cl;

/* loaded from: classes7.dex */
public class x2 implements cl.u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f124355a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f124356b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f124357c = new android.util.SparseArray();

    @Override // cl.u
    /* renamed from: bufferStoreBindTo */
    public void mo15016x2418f779(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("V8EngineBufferStore", "no bind to here");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // cl.u
    /* renamed from: generateId */
    public int mo15017x12389570() {
        int addAndGet;
        synchronized (this) {
            addAndGet = this.f124355a.addAndGet(1);
            this.f124357c.put(addAndGet, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("V8EngineBufferStore", "generateId:%d", java.lang.Integer.valueOf(addAndGet));
        return addAndGet;
    }

    @Override // cl.u
    /* renamed from: getBuffer */
    public java.nio.ByteBuffer mo15018x12f2b736(int i17, boolean z17) {
        java.nio.ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = (java.nio.ByteBuffer) this.f124357c.get(i17);
            this.f124357c.remove(i17);
        }
        if (byteBuffer == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("V8EngineBufferStore", "getBuffer:%d not contains", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("V8EngineBufferStore", "getBuffer:%d remains[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f124356b.addAndGet(-byteBuffer.capacity())));
        return byteBuffer;
    }

    @Override // cl.u
    /* renamed from: releaseDirectByteBuffer */
    public void mo15019x3b42e258(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // cl.u
    /* renamed from: setBuffer */
    public void mo15020x627eb42(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        java.nio.ByteBuffer a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.a(byteBuffer);
        if (!a17.isDirect()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("V8EngineBufferStore", "setBuffer:%d cannot convert to direct buffer", java.lang.Integer.valueOf(i17));
            return;
        }
        synchronized (this) {
            if (this.f124357c.indexOfKey(i17) < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("V8EngineBufferStore", "setBuffer:%d not contains", java.lang.Integer.valueOf(i17));
            } else {
                this.f124357c.put(i17, a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("V8EngineBufferStore", "setBuffer %d isDirect:%b remains[%d]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(byteBuffer.isDirect()), java.lang.Integer.valueOf(this.f124356b.addAndGet(byteBuffer.capacity())));
            }
        }
    }

    @Override // cl.u
    /* renamed from: supportBufferStoreBindTo */
    public boolean mo15021xa0ce6f6a() {
        return false;
    }
}
