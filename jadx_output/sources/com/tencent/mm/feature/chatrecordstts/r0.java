package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RevokeMsgEvent f65529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65528e = b1Var;
        this.f65529f = revokeMsgEvent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.r0(this.f65528e, this.f65529f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65527d;
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65528e;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.storage.f9 f9Var = this.f65529f.f54713g.f6396c;
                    this.f65527d = 1;
                    if (com.tencent.mm.feature.chatrecordstts.b1.aj(b1Var, f9Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsTtsService", "revokeMsgListener handleCurrentMessageRevoked error", e17);
            }
            return jz5.f0.f302826a;
        } finally {
            kotlinx.coroutines.sync.c.c(b1Var.f65362y, null, 1, null);
        }
    }
}
