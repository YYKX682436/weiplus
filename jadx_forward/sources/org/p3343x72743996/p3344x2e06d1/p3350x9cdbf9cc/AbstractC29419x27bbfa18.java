package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.LazyOneshotSupplier */
/* loaded from: classes16.dex */
public abstract class AbstractC29419x27bbfa18<T> implements org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29425x8efa9c2c<T> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73556x7118e671 = false;

    /* renamed from: mPromise */
    private final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> f73557x8baa6bee = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();

    /* renamed from: mThreadChecker */
    private final org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker f73558x8ec462de = new org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker();

    /* renamed from: doSet */
    public abstract void m152959x5b4e7d7();

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec
    public T get() {
        this.f73558x8ec462de.m152672xb702e421();
        if (!mo152960x7dd9ef7()) {
            m152959x5b4e7d7();
        }
        if (mo152960x7dd9ef7()) {
            return this.f73557x8baa6bee.m152619x2d64eb13();
        }
        return null;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec
    /* renamed from: hasValue */
    public boolean mo152960x7dd9ef7() {
        return this.f73557x8baa6bee.m152620xd894ab15();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29425x8efa9c2c
    /* renamed from: onAvailable */
    public T mo152961xd26bc7aa(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        this.f73558x8ec462de.m152672xb702e421();
        this.f73557x8baa6bee.m152626x364e1d(interfaceC29287xf9968465);
        if (mo152960x7dd9ef7()) {
            return get();
        }
        return null;
    }

    public void set(T t17) {
        this.f73558x8ec462de.m152672xb702e421();
        this.f73557x8baa6bee.m152618xe1847c80(t17);
    }
}
