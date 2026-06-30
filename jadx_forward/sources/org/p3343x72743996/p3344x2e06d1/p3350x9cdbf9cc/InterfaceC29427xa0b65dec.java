package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.Supplier */
/* loaded from: classes13.dex */
public interface InterfaceC29427xa0b65dec<T> {

    /* renamed from: org.chromium.base.supplier.Supplier$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73573x7118e671 = false;
    }

    static {
        boolean z17 = org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec.AnonymousClass1.f73573x7118e671;
    }

    T get();

    /* renamed from: hasValue */
    default boolean mo152960x7dd9ef7() {
        T t17 = get();
        if (org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec.AnonymousClass1.f73573x7118e671 || t17 == get()) {
            return t17 != null;
        }
        throw new java.lang.AssertionError("Value provided by #get() must not change.");
    }
}
