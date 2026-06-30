package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.OneShotCallback */
/* loaded from: classes13.dex */
public class C29424xf1a616c5<E> {

    /* renamed from: mCallback */
    private final org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> f73565x1ab9c7d2;

    /* renamed from: mCallbackWrapper */
    private final org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> f73566x16114461;

    /* renamed from: mWeakSupplier */
    private final java.lang.ref.WeakReference<org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f<E>> f73567x12881e71;

    /* renamed from: org.chromium.base.supplier.OneShotCallback$CallbackWrapper */
    /* loaded from: classes13.dex */
    public class CallbackWrapper implements org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73568x7118e671 = false;

        @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
        /* renamed from: onResult */
        public void m152269xd7b79106(E e17) {
            org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29424xf1a616c5.this.f73565x1ab9c7d2.m152269xd7b79106(e17);
            ((org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f) org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29424xf1a616c5.this.f73567x12881e71.get()).mo152963xb5bdeb7a(org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29424xf1a616c5.this.f73566x16114461);
        }

        private CallbackWrapper() {
        }
    }

    public C29424xf1a616c5(org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f<E> interfaceC29420xefda1c4f, org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> interfaceC29287xf9968465) {
        org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29424xf1a616c5.CallbackWrapper callbackWrapper = new org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29424xf1a616c5.CallbackWrapper();
        this.f73566x16114461 = callbackWrapper;
        this.f73567x12881e71 = new java.lang.ref.WeakReference<>(interfaceC29420xefda1c4f);
        this.f73565x1ab9c7d2 = interfaceC29287xf9968465;
        interfaceC29420xefda1c4f.mo152962xdab4fe97(callbackWrapper);
    }
}
