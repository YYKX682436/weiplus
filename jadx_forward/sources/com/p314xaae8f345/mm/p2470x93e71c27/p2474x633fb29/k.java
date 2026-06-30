package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270883d;

    /* renamed from: e, reason: collision with root package name */
    public int f270884e;

    public k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f270884e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.A) {
                return f0Var;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.A = true;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var.h().B("live_bar_list_last_refresh_time", java.lang.System.currentTimeMillis());
            this.f270883d = 10;
            this.f270884e = 1;
            obj = b0Var.d(10, null, null, this);
            if (obj == aVar) {
                return aVar;
            }
            i17 = 10;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f270883d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.qk qkVar = (r45.qk) obj;
        if (qkVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var2.A(i17, qkVar.f465599g);
            b0Var2.z(i17, qkVar.f465600h);
            b0Var2.B(qkVar);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.A = false;
        return f0Var;
    }
}
