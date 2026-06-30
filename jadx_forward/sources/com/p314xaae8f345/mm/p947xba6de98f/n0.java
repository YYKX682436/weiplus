package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f152631d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f152632e;

    /* renamed from: f, reason: collision with root package name */
    public int f152633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.m f152634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f152635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dn.m mVar, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152634g = mVar;
        this.f152635h = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.n0(this.f152634g, this.f152635h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p947xba6de98f.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f152633f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dn.m mVar = this.f152634g;
            this.f152631d = mVar;
            java.lang.ref.WeakReference weakReference = this.f152635h;
            this.f152632e = weakReference;
            this.f152633f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 e76 = aj6 != null ? aj6.e7(mVar) : null;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            rVar.m(new com.p314xaae8f345.mm.p947xba6de98f.k0(mVar, c20976x6ba6452a != null ? v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.m0(e76, weakReference, rVar, null), 1, null) : null));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
