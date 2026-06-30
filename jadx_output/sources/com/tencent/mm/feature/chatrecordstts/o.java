package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.feature.chatrecordstts.b1 b1Var) {
        super(0);
        this.f65510d = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pn4.z zVar = (pn4.z) this.f65510d.mj();
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
