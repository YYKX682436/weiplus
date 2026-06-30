package aq5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f13242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.o f13243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13243e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq5.j(this.f13243e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        com.tencent.mm.protobuf.g b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13242d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        aq5.o oVar = this.f13243e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                aq5.f fVar = (aq5.f) oVar.f13263b.invoke();
                byte[] bArr = (fVar == null || (zd0Var = fVar.f13232b) == null || (b17 = zd0Var.b()) == null) ? null : b17.f192156a;
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        if (!aq5.o.a(oVar, bArr)) {
                            oVar.f13266e.invoke("doReceiverNegotiation auth failed", new java.lang.Integer(10002), null);
                            return f0Var;
                        }
                        if (aq5.o.b(oVar, bArr)) {
                            com.tencent.mars.xlog.Log.i(oVar.f13262a, "doReceiverNegotiation negotiation success, notify callback");
                            aq5.f fVar2 = (aq5.f) oVar.f13263b.invoke();
                            if (fVar2 != null) {
                                fVar2.f13233c = aq5.a.f13215d;
                            }
                            cq5.i.f221543a.e(cq5.b.f221502e, 0);
                            aq5.f fVar3 = (aq5.f) oVar.f13263b.invoke();
                            if (fVar3 != null && (q0Var = fVar3.f13234d) != null) {
                                q0Var.a();
                            }
                            this.f13242d = 1;
                            if (aq5.o.c(oVar, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            oVar.f13266e.invoke("doReceiverNegotiation negotiation failed or timeout", new java.lang.Integer(10002), null);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.e(oVar.f13262a, "onConnected receive auth request, key is empty");
                return f0Var;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (java.lang.Exception e17) {
            oVar.f13266e.invoke("doReceiverNegotiation negotiation error", new java.lang.Integer(10002), e17);
        }
        return f0Var;
    }
}
