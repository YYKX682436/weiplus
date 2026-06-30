package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 f231733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f231734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f231735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f231736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231737h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 a2Var, byte[] bArr, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f231733d = a2Var;
        this.f231734e = bArr;
        this.f231735f = i17;
        this.f231736g = i18;
        this.f231737h = i19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x1(this.f231733d, this.f231734e, this.f231735f, this.f231736g, this.f231737h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cj3.n nVar = this.f231733d.f231409b;
        if (nVar != null) {
            byte[] buffer = this.f231734e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
            ((cj3.a) ((jz5.n) nVar.f123434e).mo141623x754a37bb()).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.D(buffer, this.f231735f, this.f231736g, md1.s.f72860x366c91de);
        }
        return jz5.f0.f384359a;
    }
}
