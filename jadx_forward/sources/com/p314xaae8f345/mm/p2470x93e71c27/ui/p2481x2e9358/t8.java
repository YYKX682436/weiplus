package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class t8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f272201e = h9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t8(this.f272201e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f272200d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f272200d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean z17 = this.f272201e.L;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272201e;
        boolean z18 = h9Var.E;
        if (!h9Var.L) {
            if (this.f272201e.f271887J.length() == 0) {
                this.f272201e.L = true;
                if (this.f272201e.f271887J.length() == 0) {
                    this.f272201e.E = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QuickVoice2TxtHelper", "hidePopWindow fallback trigger onSendMsg, textLen=" + this.f272201e.f271887J.length());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var2 = this.f272201e;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k8 k8Var = h9Var2.M;
                if (k8Var != null) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u8) k8Var).a(h9Var2.f271887J);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
