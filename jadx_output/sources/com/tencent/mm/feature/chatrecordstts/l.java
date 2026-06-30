package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.feature.chatrecordstts.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f65497d = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.l(this.f65497d, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.chatrecordstts.l lVar = (com.tencent.mm.feature.chatrecordstts.l) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pn4.z zVar = (pn4.z) this.f65497d.mj();
        zVar.getClass();
        try {
            y21.h hVar = zVar.aj().f357165d;
            hVar.getClass();
            com.tencent.mars.xlog.Log.i(hVar.f459056b, "pausePlay: true");
            hVar.f459060f.a(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextToSpeechService", e17, "pauseText", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
