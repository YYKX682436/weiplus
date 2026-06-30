package aq5;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f94828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(aq5.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94828d = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq5.t(this.f94828d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        byte[] bArr;
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        jz5.f0 f0Var = jz5.f0.f384359a;
        aq5.y yVar = this.f94828d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            aq5.f fVar = (aq5.f) yVar.f94871b.mo152xb9724478();
            bArr = (fVar == null || (zd0Var = fVar.f94765b) == null || (b17 = zd0Var.b()) == null) ? null : b17.f273689a;
        } catch (java.lang.Exception e17) {
            yVar.f94874e.mo147xb9724478("listenReadyToReceive: error in main loop", new java.lang.Integer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6), e17);
        }
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                r45.d87 d87Var = (r45.d87) ((aq5.d0) yVar.f94873d).a(5, bArr, new r45.d87(), true, "listenReadyToReceive: connection closed", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, true);
                if (d87Var == null) {
                    return f0Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "listenReadyToReceive: received ReadyToReceive response, ok=" + d87Var.f453774d);
                r45.e87 e87Var = new r45.e87();
                e87Var.f454679d = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "listenReadyToReceive: sending ReadyToReceive response");
                dq5.a aVar2 = dq5.a.f323904a;
                byte[] mo14344x5f01b1f6 = e87Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                if (!aVar2.a(5, mo14344x5f01b1f6, bArr)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.f94870a, "listenReadyToReceive: failed to send ReadyToReceive response");
                    yVar.f94874e.mo147xb9724478("listenReadyToReceive: failed to send ReadyToReceive response", new java.lang.Integer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6), null);
                    return f0Var;
                }
                aq5.f fVar2 = (aq5.f) yVar.f94871b.mo152xb9724478();
                if (fVar2 != null && (q0Var = fVar2.f94767d) != null) {
                    q0Var.d();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "listenReadyToReceive: callback onPrepareSendFileOk invoked");
                return f0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.f94870a, "listenReadyToReceive: encrypt key is empty");
        return f0Var;
    }
}
