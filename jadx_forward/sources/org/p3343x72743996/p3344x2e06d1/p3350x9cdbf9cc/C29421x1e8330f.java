package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.ObservableSupplierImpl */
/* loaded from: classes13.dex */
public class C29421x1e8330f<E> implements org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f<E> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73559x7118e671 = false;

    /* renamed from: sIgnoreThreadChecksForTesting */
    private static boolean f73560xd292a081;

    /* renamed from: mObject */
    private E f73562x126cca0c;

    /* renamed from: mThread */
    private final java.lang.Thread f73564x1b4d34d7 = java.lang.Thread.currentThread();

    /* renamed from: mHandler */
    private final android.os.Handler f73561xc7640a1d = new android.os.Handler();

    /* renamed from: mObservers */
    private final org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E>> f73563xfeda5270 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();

    public C29421x1e8330f() {
    }

    /* renamed from: checkThread */
    private void m152964x2edbf932() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addObserver$0 */
    public /* synthetic */ void m152965x26b7bf46(java.lang.Object obj, org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465) {
        if (this.f73562x126cca0c == obj && this.f73563xfeda5270.m152535xc01c0f90(interfaceC29287xf9968465)) {
            interfaceC29287xf9968465.m152269xd7b79106(this.f73562x126cca0c);
        }
    }

    /* renamed from: setIgnoreThreadChecksForTesting */
    public static void m152967xa4942ff0(boolean z17) {
        f73560xd292a081 = z17;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.RunnableC29423xec4e4a73());
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f
    /* renamed from: addObserver */
    public E mo152962xdab4fe97(final org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> interfaceC29287xf9968465) {
        m152964x2edbf932();
        this.f73563xfeda5270.m152532xdab4fe97(interfaceC29287xf9968465);
        final E e17 = this.f73562x126cca0c;
        if (e17 != null) {
            this.f73561xc7640a1d.post(new java.lang.Runnable() { // from class: org.chromium.base.supplier.ObservableSupplierImpl$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29421x1e8330f.this.m152965x26b7bf46(e17, interfaceC29287xf9968465);
                }
            });
        }
        return this.f73562x126cca0c;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec
    public E get() {
        m152964x2edbf932();
        return this.f73562x126cca0c;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29420xefda1c4f
    /* renamed from: removeObserver */
    public void mo152963xb5bdeb7a(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E> interfaceC29287xf9968465) {
        m152964x2edbf932();
        this.f73563xfeda5270.m152537xb5bdeb7a(interfaceC29287xf9968465);
    }

    public void set(E e17) {
        m152964x2edbf932();
        if (e17 == this.f73562x126cca0c) {
            return;
        }
        this.f73562x126cca0c = e17;
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<E>> it = this.f73563xfeda5270.iterator();
        while (it.hasNext()) {
            it.next().m152269xd7b79106(this.f73562x126cca0c);
        }
    }

    public C29421x1e8330f(E e17) {
        this.f73562x126cca0c = e17;
    }
}
