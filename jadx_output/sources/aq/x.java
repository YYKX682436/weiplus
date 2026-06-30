package aq;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f12993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.nio.Buffer buffer, int i17, int i18, com.tencent.mm.api.QueryImageData queryImageData, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12993e = buffer;
        this.f12994f = i17;
        this.f12995g = i18;
        this.f12996h = queryImageData;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.x(this.f12993e, this.f12994f, this.f12995g, this.f12996h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12992d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", ocr start");
            ny4.e eVar = aq.r0.f12942c;
            if (eVar != null) {
                str = eVar.a(this.f12993e, this.f12994f, this.f12995g);
            } else {
                str = null;
            }
            java.lang.Thread.currentThread().getName();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", "ocr result is return");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            aq.w wVar = new aq.w(this.f12996h, str, null);
            this.f12992d = 1;
            if (kotlinx.coroutines.l.g(g3Var, wVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
