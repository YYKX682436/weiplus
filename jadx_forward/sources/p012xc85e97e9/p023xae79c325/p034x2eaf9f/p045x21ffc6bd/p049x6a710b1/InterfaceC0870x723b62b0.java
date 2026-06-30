package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.RingBuffer */
/* loaded from: classes14.dex */
public interface InterfaceC0870x723b62b0<T> {

    /* renamed from: androidx.camera.core.internal.utils.RingBuffer$OnRemoveCallback */
    /* loaded from: classes14.dex */
    public interface OnRemoveCallback<T> {
        /* renamed from: onRemove */
        void mo3687x573fcf43(T t17);
    }

    /* renamed from: dequeue */
    T mo6205x5cb7b530();

    /* renamed from: enqueue */
    void mo6206xa0f98e08(T t17);

    /* renamed from: getMaxCapacity */
    int mo6207x4eedc108();

    /* renamed from: isEmpty */
    boolean mo6208x7aab3243();
}
