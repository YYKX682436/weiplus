package androidx.camera.core.internal.utils;

/* loaded from: classes14.dex */
public interface RingBuffer<T> {

    /* loaded from: classes14.dex */
    public interface OnRemoveCallback<T> {
        void onRemove(T t17);
    }

    T dequeue();

    void enqueue(T t17);

    int getMaxCapacity();

    boolean isEmpty();
}
