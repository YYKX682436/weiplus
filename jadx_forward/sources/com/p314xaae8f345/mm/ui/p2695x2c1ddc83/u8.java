package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class u8 {
    public u8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting username: " + str + ", needAnim: " + z17 + ", post: " + z18);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting talker is empty");
            return;
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(27, str);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t8 t8Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t8(lVar, activityC22359x66709fa8, z17, z18);
        ((l41.b2) yVar).getClass();
        j41.h0 h0Var = new j41.h0(0, str, null);
        h0Var.f379167d = true;
        k41.h1.a(h0Var, t8Var);
    }
}
