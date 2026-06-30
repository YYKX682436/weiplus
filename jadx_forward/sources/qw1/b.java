package qw1;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f448607d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f448608e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int f448609f;

    public final void a(byte[] buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f448607d;
        if (sparseArray.indexOfKey(buffer.length) < 0) {
            sparseArray.put(buffer.length, new java.util.concurrent.ConcurrentLinkedDeque());
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.length);
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
        }
    }

    public final void b(java.nio.ByteBuffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f448608e;
        if (sparseArray.indexOfKey(buffer.capacity()) < 0) {
            sparseArray.put(buffer.capacity(), new java.util.concurrent.ConcurrentLinkedDeque());
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.capacity());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "close");
        this.f448607d.clear();
    }
}
