package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.ArrayRingBuffer */
/* loaded from: classes14.dex */
public class C0868x587631a9<T> implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0<T> {
    private static final java.lang.String TAG = "ZslRingBuffer";

    /* renamed from: mBuffer */
    private final java.util.ArrayDeque<T> f2113xfd47bb0d;

    /* renamed from: mLock */
    private final java.lang.Object f2114x6243b38;

    /* renamed from: mOnRemoveCallback */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0.OnRemoveCallback<T> f2115xeb982b35;

    /* renamed from: mRingBufferCapacity */
    private final int f2116xba20cab7;

    public C0868x587631a9(int i17) {
        this(i17, null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0
    /* renamed from: dequeue */
    public T mo6205x5cb7b530() {
        T removeLast;
        synchronized (this.f2114x6243b38) {
            removeLast = this.f2113xfd47bb0d.removeLast();
        }
        return removeLast;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0
    /* renamed from: enqueue */
    public void mo6206xa0f98e08(T t17) {
        T mo6205x5cb7b530;
        synchronized (this.f2114x6243b38) {
            mo6205x5cb7b530 = this.f2113xfd47bb0d.size() >= this.f2116xba20cab7 ? mo6205x5cb7b530() : null;
            this.f2113xfd47bb0d.addFirst(t17);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0.OnRemoveCallback<T> onRemoveCallback = this.f2115xeb982b35;
        if (onRemoveCallback == null || mo6205x5cb7b530 == null) {
            return;
        }
        onRemoveCallback.mo3687x573fcf43(mo6205x5cb7b530);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0
    /* renamed from: getMaxCapacity */
    public int mo6207x4eedc108() {
        return this.f2116xba20cab7;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0
    /* renamed from: isEmpty */
    public boolean mo6208x7aab3243() {
        boolean isEmpty;
        synchronized (this.f2114x6243b38) {
            isEmpty = this.f2113xfd47bb0d.isEmpty();
        }
        return isEmpty;
    }

    public C0868x587631a9(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0.OnRemoveCallback<T> onRemoveCallback) {
        this.f2114x6243b38 = new java.lang.Object();
        this.f2116xba20cab7 = i17;
        this.f2113xfd47bb0d = new java.util.ArrayDeque<>(i17);
        this.f2115xeb982b35 = onRemoveCallback;
    }
}
