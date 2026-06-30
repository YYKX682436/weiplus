package aq5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.o f94776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aq5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94776e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq5.j(this.f94776e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94775d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        aq5.o oVar = this.f94776e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                aq5.f fVar = (aq5.f) oVar.f94796b.mo152xb9724478();
                byte[] bArr = (fVar == null || (zd0Var = fVar.f94765b) == null || (b17 = zd0Var.b()) == null) ? null : b17.f273689a;
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        if (!aq5.o.a(oVar, bArr)) {
                            oVar.f94799e.mo147xb9724478("doReceiverNegotiation auth failed", new java.lang.Integer(10002), null);
                            return f0Var;
                        }
                        if (aq5.o.b(oVar, bArr)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f94795a, "doReceiverNegotiation negotiation success, notify callback");
                            aq5.f fVar2 = (aq5.f) oVar.f94796b.mo152xb9724478();
                            if (fVar2 != null) {
                                fVar2.f94766c = aq5.a.f94748d;
                            }
                            cq5.i.f303076a.e(cq5.b.f303035e, 0);
                            aq5.f fVar3 = (aq5.f) oVar.f94796b.mo152xb9724478();
                            if (fVar3 != null && (q0Var = fVar3.f94767d) != null) {
                                q0Var.a();
                            }
                            this.f94775d = 1;
                            if (aq5.o.c(oVar, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            oVar.f94799e.mo147xb9724478("doReceiverNegotiation negotiation failed or timeout", new java.lang.Integer(10002), null);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f94795a, "onConnected receive auth request, key is empty");
                return f0Var;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        } catch (java.lang.Exception e17) {
            oVar.f94799e.mo147xb9724478("doReceiverNegotiation negotiation error", new java.lang.Integer(10002), e17);
        }
        return f0Var;
    }
}
