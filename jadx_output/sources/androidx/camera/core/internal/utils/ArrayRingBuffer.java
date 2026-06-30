package androidx.camera.core.internal.utils;

/* loaded from: classes14.dex */
public class ArrayRingBuffer<T> implements androidx.camera.core.internal.utils.RingBuffer<T> {
    private static final java.lang.String TAG = "ZslRingBuffer";
    private final java.util.ArrayDeque<T> mBuffer;
    private final java.lang.Object mLock;
    final androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> mOnRemoveCallback;
    private final int mRingBufferCapacity;

    public ArrayRingBuffer(int i17) {
        this(i17, null);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public T dequeue() {
        T removeLast;
        synchronized (this.mLock) {
            removeLast = this.mBuffer.removeLast();
        }
        return removeLast;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(T t17) {
        T dequeue;
        synchronized (this.mLock) {
            dequeue = this.mBuffer.size() >= this.mRingBufferCapacity ? dequeue() : null;
            this.mBuffer.addFirst(t17);
        }
        androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> onRemoveCallback = this.mOnRemoveCallback;
        if (onRemoveCallback == null || dequeue == null) {
            return;
        }
        onRemoveCallback.onRemove(dequeue);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
        return this.mRingBufferCapacity;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.mLock) {
            isEmpty = this.mBuffer.isEmpty();
        }
        return isEmpty;
    }

    public ArrayRingBuffer(int i17, androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> onRemoveCallback) {
        this.mLock = new java.lang.Object();
        this.mRingBufferCapacity = i17;
        this.mBuffer = new java.util.ArrayDeque<>(i17);
        this.mOnRemoveCallback = onRemoveCallback;
    }
}
