package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f152535d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f152536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f152537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f152538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f152539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, java.lang.ref.WeakReference weakReference, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152537f = n2Var;
        this.f152538g = weakReference;
        this.f152539h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p947xba6de98f.i0 i0Var = new com.p314xaae8f345.mm.p947xba6de98f.i0(this.f152537f, this.f152538g, this.f152539h, interfaceC29045xdcb5ca57);
        i0Var.f152536e = obj;
        return i0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p947xba6de98f.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f152535d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f152536e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f152537f;
            if (n2Var == null) {
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p947xba6de98f.h0 h0Var = new com.p314xaae8f345.mm.p947xba6de98f.h0(this.f152538g, y0Var, this.f152539h);
            this.f152535d = 1;
            if (n2Var.a(h0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
