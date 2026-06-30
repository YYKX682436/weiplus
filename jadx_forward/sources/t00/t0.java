package t00;

/* loaded from: classes9.dex */
public final class t0 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495860h;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "handleJsApiNotifyPaySuc data:" + data);
        java.lang.String optString = data.optString("ticket");
        long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(data.optString("orderId"), 0L);
        int optInt = data.optInt("recipientType", -1);
        int i18 = h20.e.f359798a;
        if (optInt >= 3) {
            callback.b(new org.json.JSONObject());
            return;
        }
        c00.f3 f3Var = (c00.f3) i95.n0.c(c00.f3.class);
        int i19 = h20.f.f359799a;
        ((j00.o1) f3Var).wi(5, "");
        j00.u1 u1Var = (j00.u1) ((c00.i3) i95.n0.c(c00.i3.class));
        u1Var.wi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSendSessionMgr", "getSendGiftSessionInfoByTicket ticket:" + optString);
        c00.h3 h3Var = null;
        if (u1Var.Ai(optString)) {
            c00.h3 h3Var2 = (c00.h3) u1Var.Ni().get(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSendSessionMgr", "getSendGiftSessionInfoByTicket ticket:" + optString + ", orderId: " + F1 + ", currentOrderId:" + (h3Var2 != null ? java.lang.Long.valueOf(h3Var2.f118518d) : null));
            h3Var = (c00.h3) u1Var.Ni().get(optString);
        }
        if (h3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsGiftService", "handleJsApiNotifyPaySuc sendSessionInfo null ticket:" + optString + ", orderId:" + F1);
            callback.a();
            return;
        }
        boolean z17 = data.optInt("isJumpChatting", 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "handleJsApiNotifyPaySuc endSendGiftSession needJump:" + z17);
        j00.u1 u1Var2 = (j00.u1) ((c00.i3) i95.n0.c(c00.i3.class));
        u1Var2.wi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSendSessionMgr", "endSendGiftSession ticket:" + optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(u1Var2.Ni()).remove(optString);
        c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
        java.lang.String str = h3Var.f118517c;
        java.lang.String str2 = h3Var.f118516b;
        j00.k1 k1Var = (j00.k1) e3Var;
        k1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new j00.d1(k1Var, str, str2, z17), "MicroMsg.EcsGiftMsgService");
        callback.b(new org.json.JSONObject());
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
