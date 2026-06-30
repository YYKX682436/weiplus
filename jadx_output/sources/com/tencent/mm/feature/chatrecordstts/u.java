package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.feature.chatrecordstts.b1 b1Var) {
        super(0);
        this.f65537d = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pn4.z zVar = (pn4.z) this.f65537d.mj();
        zVar.getClass();
        try {
            tl.h hVar = zVar.f357262n;
            if (hVar != null) {
                hVar.pause();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextToSpeechService", e17, "pauseVoiceMessage", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
