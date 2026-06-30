package cl;

/* loaded from: classes7.dex */
public class x2 implements cl.u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f42822a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f42823b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f42824c = new android.util.SparseArray();

    @Override // cl.u
    public void bufferStoreBindTo(long j17, long j18) {
        com.tencent.mars.xlog.Log.e("V8EngineBufferStore", "no bind to here");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // cl.u
    public int generateId() {
        int addAndGet;
        synchronized (this) {
            addAndGet = this.f42822a.addAndGet(1);
            this.f42824c.put(addAndGet, null);
        }
        com.tencent.mars.xlog.Log.i("V8EngineBufferStore", "generateId:%d", java.lang.Integer.valueOf(addAndGet));
        return addAndGet;
    }

    @Override // cl.u
    public java.nio.ByteBuffer getBuffer(int i17, boolean z17) {
        java.nio.ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = (java.nio.ByteBuffer) this.f42824c.get(i17);
            this.f42824c.remove(i17);
        }
        if (byteBuffer == null) {
            com.tencent.mars.xlog.Log.e("V8EngineBufferStore", "getBuffer:%d not contains", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.tencent.mars.xlog.Log.i("V8EngineBufferStore", "getBuffer:%d remains[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f42823b.addAndGet(-byteBuffer.capacity())));
        return byteBuffer;
    }

    @Override // cl.u
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // cl.u
    public void setBuffer(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        java.nio.ByteBuffer a17 = com.tencent.mm.plugin.appbrand.utils.v3.a(byteBuffer);
        if (!a17.isDirect()) {
            com.tencent.mars.xlog.Log.i("V8EngineBufferStore", "setBuffer:%d cannot convert to direct buffer", java.lang.Integer.valueOf(i17));
            return;
        }
        synchronized (this) {
            if (this.f42824c.indexOfKey(i17) < 0) {
                com.tencent.mars.xlog.Log.i("V8EngineBufferStore", "setBuffer:%d not contains", java.lang.Integer.valueOf(i17));
            } else {
                this.f42824c.put(i17, a17);
                com.tencent.mars.xlog.Log.i("V8EngineBufferStore", "setBuffer %d isDirect:%b remains[%d]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(byteBuffer.isDirect()), java.lang.Integer.valueOf(this.f42823b.addAndGet(byteBuffer.capacity())));
            }
        }
    }

    @Override // cl.u
    public boolean supportBufferStoreBindTo() {
        return false;
    }
}
