package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.RequiredCallback */
/* loaded from: classes16.dex */
public class C29363x2411e524<T> implements org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73419x7118e671 = false;

    /* renamed from: mCallback */
    private org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> f73420x1ab9c7d2;

    /* renamed from: mLifetimeAssert */
    private final org.p3343x72743996.p3344x2e06d1.C29317xc11b948f f73421x387d23c = org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.m152468xaf65a0fc(this);

    public C29363x2411e524(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        this.f73420x1ab9c7d2 = interfaceC29287xf9968465;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
    /* renamed from: onResult */
    public void m152269xd7b79106(T t17) {
        this.f73420x1ab9c7d2.m152269xd7b79106(t17);
        org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.m152471xdfbba866(this.f73421x387d23c, true);
        this.f73420x1ab9c7d2 = null;
    }
}
