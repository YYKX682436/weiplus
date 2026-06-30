package b12;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f17076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b12.o f17077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b12.o oVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f17077e = oVar;
        this.f17078f = str;
        this.f17079g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b12.n(this.f17077e, this.f17078f, this.f17079g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b12.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f17076d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        b12.o oVar = this.f17077e;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    b12.m mVar = new b12.m(this.f17078f, null);
                    this.f17076d = 1;
                    b17 = kotlinx.coroutines.a4.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, mVar, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    b17 = obj;
                }
                uq.f fVar = (uq.f) b17;
                oVar.f17083d = fVar.f430140f;
                com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggHelper", "should play lucky egg:" + fVar.f430139e + " interval=" + oVar.f17083d + ", traceId=" + fVar.f430138d);
                int i18 = fVar.f430139e;
                if (i18 == 1) {
                    yz5.l lVar = oVar.f17084e;
                    if (lVar != null) {
                        lVar.invoke(new d12.b(this.f17078f, fVar.f430138d, this.f17079g, true, fVar.f430140f, null, 32, null));
                    }
                } else if (i18 == 0) {
                    yz5.l lVar2 = oVar.f17085f;
                    if (lVar2 != null) {
                        lVar2.invoke(b12.l.f17070f);
                    }
                } else {
                    yz5.l lVar3 = oVar.f17085f;
                    if (lVar3 != null) {
                        lVar3.invoke(b12.l.f17071g);
                    }
                }
                oVar.f17084e = null;
                oVar.f17085f = null;
                return f0Var;
            } catch (b12.a e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggHelper", "Unable to check if we can show lucky egg: " + e17.getMessage());
                yz5.l lVar4 = oVar.f17085f;
                if (lVar4 != null) {
                    lVar4.invoke(b12.l.f17071g);
                }
                oVar.f17084e = null;
                oVar.f17085f = null;
                return f0Var;
            } catch (kotlinx.coroutines.x3 unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggHelper", "Timeout to check can show luck egg");
                yz5.l lVar5 = oVar.f17085f;
                if (lVar5 != null) {
                    lVar5.invoke(b12.l.f17071g);
                }
                oVar.f17084e = null;
                oVar.f17085f = null;
                return f0Var;
            }
        } catch (java.lang.Throwable th6) {
            oVar.f17084e = null;
            oVar.f17085f = null;
            throw th6;
        }
    }
}
