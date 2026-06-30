package cc1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f40419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc1.c f40420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(org.json.JSONObject jSONObject, cc1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40419d = jSONObject;
        this.f40420e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cc1.b(this.f40419d, this.f40420e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object opt = this.f40419d.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        boolean z17 = opt instanceof java.nio.ByteBuffer;
        cc1.c cVar = this.f40420e;
        if (z17) {
            return kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, cVar.b(cVar.f40421d.update(ik1.f.a((java.nio.ByteBuffer) opt)))));
        }
        if (!(opt instanceof java.lang.String)) {
            throw new cc1.n(jc1.f.f298919h, "fail:signature not string or arraybuffer");
        }
        javax.crypto.Cipher cipher = cVar.f40421d;
        byte[] bytes = ((java.lang.String) opt).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, cVar.b(cipher.update(bytes))));
    }
}
