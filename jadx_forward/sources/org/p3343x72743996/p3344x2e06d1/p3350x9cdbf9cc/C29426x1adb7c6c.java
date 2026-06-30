package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.OneshotSupplierImpl */
/* loaded from: classes16.dex */
public class C29426x1adb7c6c<T> implements org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29425x8efa9c2c<T> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73570x7118e671 = false;

    /* renamed from: mPromise */
    private final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> f73571x8baa6bee = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();

    /* renamed from: mThreadChecker */
    private final org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker f73572x8ec462de = new org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker();

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec
    public T get() {
        this.f73572x8ec462de.m152672xb702e421();
        if (this.f73571x8baa6bee.m152620xd894ab15()) {
            return this.f73571x8baa6bee.m152619x2d64eb13();
        }
        return null;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29425x8efa9c2c
    /* renamed from: onAvailable */
    public T mo152961xd26bc7aa(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        this.f73572x8ec462de.m152672xb702e421();
        this.f73571x8baa6bee.m152626x364e1d(interfaceC29287xf9968465);
        return get();
    }

    public void set(T t17) {
        this.f73572x8ec462de.m152672xb702e421();
        this.f73571x8baa6bee.m152618xe1847c80(t17);
    }
}
