package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f152603d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f152604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f152605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f152606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f152607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, java.lang.ref.WeakReference weakReference, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152605f = n2Var;
        this.f152606g = weakReference;
        this.f152607h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p947xba6de98f.m0 m0Var = new com.p314xaae8f345.mm.p947xba6de98f.m0(this.f152605f, this.f152606g, this.f152607h, interfaceC29045xdcb5ca57);
        m0Var.f152604e = obj;
        return m0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p947xba6de98f.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f152603d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f152604e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f152605f;
            if (n2Var == null) {
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p947xba6de98f.l0 l0Var = new com.p314xaae8f345.mm.p947xba6de98f.l0(this.f152606g, y0Var, this.f152607h);
            this.f152603d = 1;
            if (n2Var.a(l0Var, this) == aVar) {
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
