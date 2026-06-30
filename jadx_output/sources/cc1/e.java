package cc1;

/* loaded from: classes7.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f40424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc1.f f40425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(org.json.JSONObject jSONObject, cc1.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40424d = jSONObject;
        this.f40425e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cc1.e(this.f40424d, this.f40425e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object opt = this.f40424d.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        boolean z17 = opt instanceof java.nio.ByteBuffer;
        cc1.f fVar = this.f40425e;
        if (z17) {
            fVar.f40426d.update((java.nio.ByteBuffer) opt);
        } else {
            if (!(opt instanceof java.lang.String)) {
                throw new cc1.n(jc1.f.f298919h, "fail:signature not string or arraybuffer");
            }
            java.security.Signature signature = fVar.f40426d;
            kotlin.jvm.internal.o.d(opt);
            byte[] bytes = ((java.lang.String) opt).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            signature.update(bytes);
        }
        return new java.util.HashMap();
    }
}
