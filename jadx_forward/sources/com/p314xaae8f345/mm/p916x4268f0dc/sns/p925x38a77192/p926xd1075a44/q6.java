package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f151734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f151735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var, e0.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151734e = m7Var;
        this.f151735f = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q6(this.f151734e, this.f151735f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f151733d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f151734e;
            if (m7Var.f151636u) {
                m7Var.f151636u = false;
                e0.f1 f1Var = this.f151735f;
                int size = m7Var.b().size() - 1;
                this.f151733d = 1;
                if (e0.f1.g(f1Var, size, 0, this, 2, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
