package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.j f65499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, com.tencent.mm.feature.chatrecordstts.j jVar) {
        super(0);
        this.f65498d = b1Var;
        this.f65499e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.chatrecordstts.f fVar = this.f65498d.f65356s;
        com.tencent.mm.feature.chatrecordstts.j jVar = this.f65499e;
        if (fVar != null) {
            com.tencent.mm.storage.f9 message = jVar.f65467a;
            kotlin.jvm.internal.o.g(message, "message");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("ChatRecordsTtsFloatBallHelper", "updateMessageInfo failed, context is null msgId=" + message.getMsgId());
            } else {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = fVar.f65408e;
                if (ballInfo == null) {
                    com.tencent.mars.xlog.Log.e("ChatRecordsTtsFloatBallHelper", "updateMessageInfo failed, ballInfo is null msgId=" + message.getMsgId());
                } else {
                    fVar.f65409f = message.getMsgId();
                    fVar.f65410g = message.Q0();
                    fVar.f65411h = fVar.a(context, message);
                    ballInfo.f93063x = fVar.b(context);
                    fVar.c().V(ballInfo);
                }
            }
        }
        java.lang.String Q0 = jVar.f65467a.Q0();
        if (Q0 != null) {
            com.tencent.mm.feature.chatrecordstts.r1.c(false, new com.tencent.mm.feature.chatrecordstts.n0(Q0, jVar.f65467a.getMsgId()));
        }
        return jz5.f0.f302826a;
    }
}
