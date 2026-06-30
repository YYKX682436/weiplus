package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f65337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, java.lang.String str, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65335d = b1Var;
        this.f65336e = str;
        this.f65337f = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.a0(this.f65335d, this.f65336e, this.f65337f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65335d;
        java.lang.String str = this.f65336e;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = false;
        try {
            java.util.List oj6 = b1Var.oj(str, this.f65337f.getCreateTime());
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch loaded " + oj6.size() + " messages talker=" + str);
            if (oj6.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch no more messages");
            } else {
                b1Var.f65355r.addAll(oj6);
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsTtsService", "fetchNextBatch error talker=" + str, e17);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
