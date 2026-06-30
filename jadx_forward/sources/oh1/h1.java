package oh1;

/* loaded from: classes7.dex */
public enum h1 implements vg3.q4 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f426758d = new java.util.HashMap();

    h1() {
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (str == null || !str.equals("wxaapp_msgchannel")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppMsgChannelHandler", "subType is err, return");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "consumeNewXml subType:%s", str);
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAppMsgChannelHandler", "msg content is null");
            return null;
        }
        if (map.get(".sysmsg.wxaapp_msgchannel") == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_id");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.sender_openid");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.receiver_openid");
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.appid");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_type"), 0);
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_content");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.send_time"), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "handle addMsg.MsgId:%s", "" + p0Var.f152259a.f459101r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "handle wxaapp_msgchannel xml:%s", g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "msgId:%s, senderOpenId:%s, receiverOpenId:%s, appId:%s, msgType:%d, msgContent:%s, sendTime:%d", str2, str3, str4, str5, java.lang.Integer.valueOf(P), str6, java.lang.Long.valueOf(V));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3 c12429xdd32d5a3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3();
        c12429xdd32d5a3.f167541d = str2;
        c12429xdd32d5a3.f167542e = str3;
        c12429xdd32d5a3.f167543f = str4;
        c12429xdd32d5a3.f167544g = str5;
        c12429xdd32d5a3.f167545h = P;
        c12429xdd32d5a3.f167546i = str6;
        c12429xdd32d5a3.f167547m = V;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().z(str5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "send msg to runtime client");
            synchronized (this) {
                if (this.f426758d.containsKey(str5)) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f426758d.remove(str5);
                    if (arrayList == null || arrayList.size() <= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str5, c12429xdd32d5a3);
                    } else {
                        arrayList.add(c12429xdd32d5a3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "send list size:%d", java.lang.Integer.valueOf(arrayList.size()));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.a(str5, arrayList));
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str5, c12429xdd32d5a3);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "add to cache");
            synchronized (this) {
                if (this.f426758d.containsKey(str5)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f426758d.get(str5);
                    arrayList2.add(c12429xdd32d5a3);
                    if (arrayList2.size() > 500) {
                        arrayList2.remove(0);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppMsgChannelHandler", "cache size :%d", java.lang.Integer.valueOf(arrayList2.size()));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(c12429xdd32d5a3);
                    this.f426758d.put(str5, arrayList3);
                }
            }
        }
        return null;
    }
}
