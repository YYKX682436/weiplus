package b80;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f18252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b80.u f18253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o70.h f18254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b80.u uVar, o70.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18253e = uVar;
        this.f18254f = hVar;
        this.f18255g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b80.m(this.f18253e, this.f18254f, this.f18255g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b80.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f18252d;
        java.lang.String str = this.f18255g;
        b80.u uVar = this.f18253e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            o70.h hVar = this.f18254f;
            uVar.pj(hVar);
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) uVar.f18283m).getValue()).booleanValue();
            this.f18252d = 1;
            if (uVar.qj(hVar, booleanValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "outFlow " + str);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        v65.h hVar2 = (v65.h) ((jz5.n) uVar.f18279f).getValue();
        this.f18252d = 2;
        if (hVar2.d(str, this) == aVar) {
            return aVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "outFlow " + str);
        return jz5.f0.f302826a;
    }
}
