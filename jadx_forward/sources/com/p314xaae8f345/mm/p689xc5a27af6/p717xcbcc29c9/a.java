package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class a extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f f146867a;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar) {
        this.f146867a = fVar;
    }

    @Override // gp1.a0, gp1.z
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar;
        if (c12886x91aa2b6d == null || (iVar = this.f146867a.f146938b) == null) {
            return;
        }
        ((cy1.a) iVar.a()).Hj("chat_hear_msg_float_fold", "view_clk", iVar.f146989a.f146963a, 33488);
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f146867a;
            java.lang.String str = fVar.f146943g;
            long j17 = fVar.f146942f;
            if ((str == null || str.length() == 0) || j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatRecordsTtsFloatBallHelper", "onFloatBallClick ignored, invalid state talker=" + str + " msgId=" + j17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallHelper", "onFloatBallClick publishing event talker=" + str + " msgId=" + j17);
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.c(false, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.d(str, j17));
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = fVar.f146938b;
            if (iVar != null) {
                ((cy1.a) iVar.a()).Hj("chat_hear_msg_float_unfold_content", "view_clk", iVar.f146989a.f146963a, 33488);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void w(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2;
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f146867a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) fVar.f146945i).mo141623x754a37bb();
            int i17 = o4Var != null ? o4Var.getInt("chat_records_tts_float_ball_exposure_count", 0) : 0;
            if (i17 < 3) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) fVar.f146945i).mo141623x754a37bb();
                if (o4Var2 != null) {
                    o4Var2.putInt("chat_records_tts_float_ball_exposure_count", i17 + 1);
                }
                if (i17 + 1 >= 3 && (c12886x91aa2b6d2 = fVar.f146941e) != null) {
                    c12886x91aa2b6d2.f174596x = fVar.f146944h;
                    fVar.c().V(c12886x91aa2b6d2);
                }
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = fVar.f146938b;
            if (iVar != null) {
                ((cy1.a) iVar.a()).Ej("chat_hear_msg_float_fold_end", iVar.f146989a.f146963a, 33488);
            }
        }
    }
}
