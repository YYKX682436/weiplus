package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281158d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281159e;

    /* renamed from: f, reason: collision with root package name */
    public int f281160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f281161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f281161g = y8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o8(this.f281161g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var;
        fu.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f281160f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y8Var = this.f281161g;
            fu.d dVar2 = y8Var.M;
            if (dVar2 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n8 n8Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n8.f281099d;
                this.f281158d = y8Var;
                this.f281159e = dVar2;
                this.f281160f = 1;
                java.lang.Object D = dVar2.D(n8Var, this);
                if (D == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                obj = D;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (fu.d) this.f281159e;
        y8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) this.f281158d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((qi3.f0) obj).f445233a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingVoice2TxtComponent", "prepare failed");
            y8Var.M = null;
        } else {
            oi3.e eVar = dVar.f348287o.f493721j;
            long m75942xfb822ef2 = eVar != null ? eVar.m75942xfb822ef2(eVar.f427150d + 0) : 0L;
            y8Var.f281828p = m75942xfb822ef2;
            if (m75942xfb822ef2 > 0) {
                y8Var.s0(m75942xfb822ef2, false, true, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingVoice2TxtComponent", "prepare success but quickSendMsgId invalid");
                y8Var.M = null;
            }
        }
        return jz5.f0.f384359a;
    }
}
