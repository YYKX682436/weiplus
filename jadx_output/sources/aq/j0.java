package aq;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f12888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f12889g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.api.QueryImageData queryImageData, java.nio.Buffer buffer, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12887e = queryImageData;
        this.f12888f = buffer;
        this.f12889g = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.j0(this.f12887e, this.f12888f, this.f12889g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12886d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", per Image to applyOcrReq");
            aq.r0 r0Var = aq.r0.f12940a;
            com.tencent.mm.api.QueryImageData queryImageData = this.f12887e;
            java.nio.Buffer buffer = this.f12888f;
            android.graphics.Bitmap bitmap = this.f12889g;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f12886d = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(lu5.a.f321457f, new aq.x(buffer, width, height, queryImageData, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
