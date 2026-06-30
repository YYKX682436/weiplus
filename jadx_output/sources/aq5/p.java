package aq5;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(aq5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13272d = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq5.p(this.f13272d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.a aVar;
        byte[] bArr;
        byte[] bArr2;
        yz5.l lVar;
        java.lang.String str;
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        bw5.zd0 zd0Var2;
        com.tencent.mm.protobuf.g b17;
        jz5.f0 f0Var = jz5.f0.f302826a;
        aq5.y yVar = this.f13272d;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            yz5.a aVar3 = yVar.f13338b;
            aVar = yVar.f13338b;
            aq5.f fVar = (aq5.f) aVar3.invoke();
            bArr = null;
            bArr2 = (fVar == null || (zd0Var2 = fVar.f13232b) == null || (b17 = zd0Var2.b()) == null) ? null : b17.f192156a;
            aq5.f fVar2 = (aq5.f) aVar.invoke();
            if (fVar2 != null && (zd0Var = fVar2.f13232b) != null) {
                com.tencent.mm.protobuf.g gVar = zd0Var.f35949h[3] ? zd0Var.f35947f : com.tencent.mm.protobuf.g.f192155b;
                if (gVar != null) {
                    bArr = gVar.f192156a;
                }
            }
            lVar = yVar.f13342f;
            str = yVar.f13337a;
        } catch (java.lang.Exception e17) {
            yVar.f13341e.invoke("doSenderNegotiation: error during negotiation", new java.lang.Integer(10002), e17);
        }
        if (bArr2 != null) {
            if (!(bArr2.length == 0) && bArr != null) {
                if (!(bArr.length == 0)) {
                    dq5.a aVar4 = dq5.a.f242371a;
                    byte[] b18 = kk.a.f308464a.b(bArr, bArr2);
                    if (b18 == null) {
                        b18 = new byte[0];
                    }
                    r45.u77 u77Var = new r45.u77();
                    u77Var.f387131d = new com.tencent.mm.protobuf.g(b18, 0, b18.length);
                    com.tencent.mars.xlog.Log.i(str, "doSenderNegotiation: sending Auth request");
                    byte[] byteArray = u77Var.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    if (!aVar4.b(1, byteArray)) {
                        com.tencent.mars.xlog.Log.e(str, "doSenderNegotiation: failed to send Auth request");
                        lVar.invoke(new java.lang.Integer(10002));
                        return f0Var;
                    }
                    if (!aq5.y.a(yVar)) {
                        return f0Var;
                    }
                    r45.w77 w77Var = new r45.w77();
                    w77Var.f388955d = yVar.f13344h;
                    com.tencent.mars.xlog.Log.i(str, "doSenderNegotiation: sending CheckCapability request, version: " + w77Var.f388955d);
                    byte[] byteArray2 = w77Var.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                    if (!aVar4.a(2, byteArray2, bArr2)) {
                        com.tencent.mars.xlog.Log.e(str, "doSenderNegotiation: failed to send CheckCapability request");
                        lVar.invoke(new java.lang.Integer(10002));
                        return f0Var;
                    }
                    boolean b19 = aq5.y.b(yVar, bArr2, w77Var.f388955d);
                    if (b19 && b19) {
                        com.tencent.mars.xlog.Log.i(str, "doSenderNegotiation: negotiation completed successfully");
                        aq5.f fVar3 = (aq5.f) aVar.invoke();
                        if (fVar3 != null) {
                            fVar3.f13233c = aq5.a.f13215d;
                        }
                        cq5.i.f221543a.e(cq5.b.f221502e, 0);
                        aq5.f fVar4 = (aq5.f) aVar.invoke();
                        if (fVar4 != null && (q0Var = fVar4.f13234d) != null) {
                            q0Var.a();
                        }
                        com.tencent.mars.xlog.Log.i(str, "doSenderNegotiation: ready to prepare and send files");
                    }
                    return f0Var;
                }
            }
        }
        com.tencent.mars.xlog.Log.e(str, "doSenderNegotiation: encrypt key or hello is empty");
        lVar.invoke(new java.lang.Integer(10002));
        return f0Var;
    }
}
