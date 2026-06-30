package aq5;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f94805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(aq5.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94805d = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq5.p(this.f94805d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.a aVar;
        byte[] bArr;
        byte[] bArr2;
        yz5.l lVar;
        java.lang.String str;
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        bw5.zd0 zd0Var2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        jz5.f0 f0Var = jz5.f0.f384359a;
        aq5.y yVar = this.f94805d;
        pz5.a aVar2 = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            yz5.a aVar3 = yVar.f94871b;
            aVar = yVar.f94871b;
            aq5.f fVar = (aq5.f) aVar3.mo152xb9724478();
            bArr = null;
            bArr2 = (fVar == null || (zd0Var2 = fVar.f94765b) == null || (b17 = zd0Var2.b()) == null) ? null : b17.f273689a;
            aq5.f fVar2 = (aq5.f) aVar.mo152xb9724478();
            if (fVar2 != null && (zd0Var = fVar2.f94765b) != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = zd0Var.f117482h[3] ? zd0Var.f117480f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                if (gVar != null) {
                    bArr = gVar.f273689a;
                }
            }
            lVar = yVar.f94875f;
            str = yVar.f94870a;
        } catch (java.lang.Exception e17) {
            yVar.f94874e.mo147xb9724478("doSenderNegotiation: error during negotiation", new java.lang.Integer(10002), e17);
        }
        if (bArr2 != null) {
            if (!(bArr2.length == 0) && bArr != null) {
                if (!(bArr.length == 0)) {
                    dq5.a aVar4 = dq5.a.f323904a;
                    byte[] b18 = kk.a.f389997a.b(bArr, bArr2);
                    if (b18 == null) {
                        b18 = new byte[0];
                    }
                    r45.u77 u77Var = new r45.u77();
                    u77Var.f468664d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(b18, 0, b18.length);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doSenderNegotiation: sending Auth request");
                    byte[] mo14344x5f01b1f6 = u77Var.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                    if (!aVar4.b(1, mo14344x5f01b1f6)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSenderNegotiation: failed to send Auth request");
                        lVar.mo146xb9724478(new java.lang.Integer(10002));
                        return f0Var;
                    }
                    if (!aq5.y.a(yVar)) {
                        return f0Var;
                    }
                    r45.w77 w77Var = new r45.w77();
                    w77Var.f470488d = yVar.f94877h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doSenderNegotiation: sending CheckCapability request, version: " + w77Var.f470488d);
                    byte[] mo14344x5f01b1f62 = w77Var.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                    if (!aVar4.a(2, mo14344x5f01b1f62, bArr2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSenderNegotiation: failed to send CheckCapability request");
                        lVar.mo146xb9724478(new java.lang.Integer(10002));
                        return f0Var;
                    }
                    boolean b19 = aq5.y.b(yVar, bArr2, w77Var.f470488d);
                    if (b19 && b19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doSenderNegotiation: negotiation completed successfully");
                        aq5.f fVar3 = (aq5.f) aVar.mo152xb9724478();
                        if (fVar3 != null) {
                            fVar3.f94766c = aq5.a.f94748d;
                        }
                        cq5.i.f303076a.e(cq5.b.f303035e, 0);
                        aq5.f fVar4 = (aq5.f) aVar.mo152xb9724478();
                        if (fVar4 != null && (q0Var = fVar4.f94767d) != null) {
                            q0Var.a();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doSenderNegotiation: ready to prepare and send files");
                    }
                    return f0Var;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSenderNegotiation: encrypt key or hello is empty");
        lVar.mo146xb9724478(new java.lang.Integer(10002));
        return f0Var;
    }
}
