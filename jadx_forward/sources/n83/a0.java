package n83;

/* loaded from: classes4.dex */
public class a0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutMsgListener", "WeChatOutMsg onRecieveMsg");
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, msgContent is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, values is null");
            return;
        }
        s83.h Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri();
        long j17 = j4Var.f459090d;
        Ri.getClass();
        s83.g gVar = new s83.g();
        gVar.f67912x29d4c865 = j17;
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.Title");
        gVar.f67913x29dd02d3 = str;
        if (str == null) {
            gVar.f67913x29dd02d3 = "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.Content");
        gVar.f67907xad49e234 = str2;
        if (str2 == null) {
            gVar.f67907xad49e234 = "";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
        gVar.f67910xc4aab016 = P;
        gVar.f67911x879e62ac = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.DescUrl");
        gVar.f67908xd15e26d9 = str3;
        if (str3 == null) {
            gVar.f67908xd15e26d9 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", gVar.f67912x29d4c865 + "", gVar.f67913x29dd02d3, gVar.f67907xad49e234, gVar.f67910xc4aab016 + "", gVar.f67911x879e62ac + "", gVar.f67908xd15e26d9);
        Ri.mo880xb970c2b9(gVar);
        if (P != -1) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, java.lang.Integer.valueOf(P));
        }
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13254, 4, 0, 0, -1, java.lang.Integer.valueOf(P), -1);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
