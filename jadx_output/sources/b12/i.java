package b12;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f17053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b12.j f17054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b12.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f17054e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b12.i(this.f17054e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b12.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        yz5.p pVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f17053d;
        b12.j jVar = this.f17054e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                b12.h hVar = new b12.h(null);
                this.f17053d = 1;
                obj = kotlinx.coroutines.a4.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, hVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            uq.j jVar2 = (uq.j) obj;
            jVar.f17058d = jVar2.f430150f * 1000;
            com.tencent.mars.xlog.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + jVar2.f430148d + ", " + jVar2.f430149e + ", " + jVar2.f430150f);
            if (jVar2.f430148d && (str = jVar2.f430149e) != null && (pVar = jVar.f17059e) != null) {
                pVar.invoke(java.lang.Boolean.TRUE, str);
            }
        } catch (b12.a e17) {
            jVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.EggRedEnvelopeHelper", "Cgi error: " + e17.getMessage());
        } catch (kotlinx.coroutines.x3 unused) {
            jVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.EggRedEnvelopeHelper", "Cgi Timeout: ");
        }
        return jz5.f0.f302826a;
    }
}
