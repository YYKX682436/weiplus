package b20;

/* loaded from: classes9.dex */
public final class h extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (context.d() == null) {
            callback.c("handle nativeExtraData is nil");
            return;
        }
        if (((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni()) {
            callback.c("current device has issue on transparent mode.");
            return;
        }
        org.json.JSONObject d17 = context.d();
        kotlin.jvm.internal.o.d(d17);
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        android.content.Context c17 = context.c();
        jz5.l lVar = new jz5.l("ticket", d17.optString("ticket"));
        jz5.l lVar2 = new jz5.l("displayName", d17.optString("displayName"));
        jz5.l lVar3 = new jz5.l("headImgUrl", d17.optString("headImgUrl"));
        jz5.l lVar4 = new jz5.l("recipientType", java.lang.Integer.valueOf(d17.optInt("recipientType")));
        jz5.l lVar5 = new jz5.l("chatRoomMemberNum", java.lang.Integer.valueOf(d17.optInt("chatRoomMemberNum")));
        jz5.l lVar6 = new jz5.l("if_chat", java.lang.Integer.valueOf(d17.optInt("if_chat")));
        jz5.l lVar7 = new jz5.l("chat_session_id", d17.optString("chat_session_id"));
        jz5.l lVar8 = new jz5.l("recipientNickName", d17.optString("displayName"));
        jz5.l lVar9 = new jz5.l("isFromChat", 1);
        jz5.l lVar10 = new jz5.l("chatRoomHash", d17.optString("chatRoomHash"));
        org.json.JSONObject d18 = context.d();
        kotlin.jvm.internal.o.d(d18);
        java.util.Map l17 = kz5.c1.l(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, new jz5.l("userName", d18.getString("talkerUsername")));
        ((j00.d2) m3Var).getClass();
        kotlinx.coroutines.l.d(j00.y.f296947b, null, null, new j00.v(l17, c17, null), 3, null);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.B);
        callback.d(null);
    }
}
