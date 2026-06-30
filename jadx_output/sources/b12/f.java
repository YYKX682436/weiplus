package b12;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f17043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b12.g f17044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f17045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b12.g gVar, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f17044e = gVar;
        this.f17045f = l17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b12.f(this.f17044e, this.f17045f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b12.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String emoticon_prize;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f17043d;
        b12.g gVar = this.f17044e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                b12.e eVar = new b12.e(this.f17045f, null);
                this.f17043d = 1;
                obj = kotlinx.coroutines.a4.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            uq.j jVar = (uq.j) obj;
            gVar.f17049d = jVar.f430150f * 1000;
            com.tencent.mars.xlog.Log.i("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + jVar.f430148d + ", " + jVar.f430151g + ", " + jVar.f430150f);
            if (jVar.f430148d && (emoticon_prize = jVar.f430151g) != null) {
                gVar.f17051f = emoticon_prize;
                yz5.p pVar = gVar.f17050e;
                if (pVar != null) {
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    kotlin.jvm.internal.o.f(emoticon_prize, "emoticon_prize");
                    pVar.invoke(bool, emoticon_prize);
                }
            }
        } catch (b12.a e17) {
            gVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.EggMiniAppHelper", "Cgi error: " + e17.getMessage());
        } catch (kotlinx.coroutines.x3 unused) {
            gVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.EggMiniAppHelper", "Cgi Timeout: ");
        }
        return jz5.f0.f302826a;
    }
}
