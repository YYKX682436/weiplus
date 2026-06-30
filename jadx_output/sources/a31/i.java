package a31;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a31.m f959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a31.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f959e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a31.i(this.f959e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a31.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f958d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            a31.m mVar = this.f959e;
            z21.w wVar = mVar.f985s;
            int maxAmplitudeRate = wVar != null ? wVar.getMaxAmplitudeRate() : 0;
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
            if (speechInputLayout != null) {
                speechInputLayout.b(maxAmplitudeRate);
            }
            this.f958d = 1;
        } while (kotlinx.coroutines.k1.b(50L, this) != aVar);
        return aVar;
    }
}
