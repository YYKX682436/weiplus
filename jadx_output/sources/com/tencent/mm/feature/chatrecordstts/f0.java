package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65416e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.f0(this.f65416e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.feature.chatrecordstts.k2 k2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65415d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.feature.chatrecordstts.j jVar = this.f65416e.f65354q;
                if (jVar != null && (k2Var = jVar.f65470d) != null) {
                    this.f65415d = 1;
                    if (k2Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "pause cancellation");
        }
        return jz5.f0.f302826a;
    }
}
