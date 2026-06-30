package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.f f65485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f65486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.feature.chatrecordstts.f fVar, com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f65485d = fVar;
        this.f65486e = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.chatrecordstts.f fVar = this.f65485d;
        fVar.getClass();
        com.tencent.mm.storage.f9 message = this.f65486e;
        kotlin.jvm.internal.o.g(message, "message");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("ChatRecordsTtsFloatBallHelper", "init failed, context is null");
        } else {
            com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallHelper", "init msgId=" + message.getMsgId() + " talker=" + message.Q0());
            fVar.f65409f = message.getMsgId();
            fVar.f65410g = message.Q0();
            fVar.f65411h = fVar.a(context, message);
            java.lang.String b17 = fVar.b(context);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(70, "chat_records_tts#" + message.getMsgId(), null);
            ballInfo.f93061v = context.getDrawable(com.tencent.mm.R.drawable.cza);
            ballInfo.f93062w = context.getDrawable(com.tencent.mm.R.drawable.cza);
            ballInfo.f93063x = b17;
            ballInfo.f93048f = 3;
            ballInfo.H = 2048;
            ballInfo.I = true;
            ballInfo.f93045J = false;
            ballInfo.F = true;
            ballInfo.N = false;
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
            ballButtonInfo.f93070e = false;
            ballButtonInfo.f93071f = false;
            ballButtonInfo.f93073h = true;
            ballButtonInfo.f93074i = true;
            fVar.f65408e = ballInfo;
            fVar.c().f(fVar.f65408e, fVar.f65413j);
            fVar.c().a0(70, fVar.f65414k);
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = fVar.f65408e;
        if (ballInfo2 == null) {
            com.tencent.mars.xlog.Log.e("ChatRecordsTtsFloatBallHelper", "show failed, ballInfo is null");
        } else {
            fVar.c().u(ballInfo2);
        }
        return jz5.f0.f302826a;
    }
}
