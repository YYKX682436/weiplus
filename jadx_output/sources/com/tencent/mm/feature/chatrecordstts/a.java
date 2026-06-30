package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class a extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.f f65334a;

    public a(com.tencent.mm.feature.chatrecordstts.f fVar) {
        this.f65334a = fVar;
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.feature.chatrecordstts.i iVar;
        if (ballInfo == null || (iVar = this.f65334a.f65405b) == null) {
            return;
        }
        ((cy1.a) iVar.a()).Hj("chat_hear_msg_float_fold", "view_clk", iVar.f65456a.f65430a, 33488);
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            com.tencent.mm.feature.chatrecordstts.f fVar = this.f65334a;
            java.lang.String str = fVar.f65410g;
            long j17 = fVar.f65409f;
            if ((str == null || str.length() == 0) || j17 == 0) {
                com.tencent.mars.xlog.Log.w("ChatRecordsTtsFloatBallHelper", "onFloatBallClick ignored, invalid state talker=" + str + " msgId=" + j17);
                return;
            }
            com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallHelper", "onFloatBallClick publishing event talker=" + str + " msgId=" + j17);
            com.tencent.mm.feature.chatrecordstts.r1.c(false, new com.tencent.mm.feature.chatrecordstts.d(str, j17));
            com.tencent.mm.feature.chatrecordstts.i iVar = fVar.f65405b;
            if (iVar != null) {
                ((cy1.a) iVar.a()).Hj("chat_hear_msg_float_unfold_content", "view_clk", iVar.f65456a.f65430a, 33488);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void w(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2;
        if (ballInfo != null) {
            com.tencent.mm.feature.chatrecordstts.f fVar = this.f65334a;
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) fVar.f65412i).getValue();
            int i17 = o4Var != null ? o4Var.getInt("chat_records_tts_float_ball_exposure_count", 0) : 0;
            if (i17 < 3) {
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) fVar.f65412i).getValue();
                if (o4Var2 != null) {
                    o4Var2.putInt("chat_records_tts_float_ball_exposure_count", i17 + 1);
                }
                if (i17 + 1 >= 3 && (ballInfo2 = fVar.f65408e) != null) {
                    ballInfo2.f93063x = fVar.f65411h;
                    fVar.c().V(ballInfo2);
                }
            }
            com.tencent.mm.feature.chatrecordstts.i iVar = fVar.f65405b;
            if (iVar != null) {
                ((cy1.a) iVar.a()).Ej("chat_hear_msg_float_fold_end", iVar.f65456a.f65430a, 33488);
            }
        }
    }
}
