package cc1;

/* loaded from: classes7.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc1.f f40423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cc1.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40423d = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cc1.d(this.f40423d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            cc1.f fVar = this.f40423d;
            return kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, fVar.b(fVar.f40426d.sign())));
        } catch (java.security.SignatureException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOperateCryptoSign", e17, "sign fail", new java.lang.Object[0]);
            throw new cc1.n(jc1.f.f298915d, "fail:sign");
        }
    }
}
