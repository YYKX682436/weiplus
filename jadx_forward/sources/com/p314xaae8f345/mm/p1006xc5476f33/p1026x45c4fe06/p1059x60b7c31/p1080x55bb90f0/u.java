package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes7.dex */
public final class u {
    public u(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.EventOnChatToolStatusChange", "onChatToolStatusChange dispatch chatToolMode:" + str + " chatType:" + num + " chatToolUser:" + str2);
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("chatToolMode", str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "allPage")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v();
            vVar.t(hashMap);
            vVar.u(env);
            vVar.m();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("chatToolRoom", "");
        } else {
            hashMap.put("chatType", num);
            hashMap.put("chatToolRoom", str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v vVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v();
        vVar2.t(hashMap);
        vVar2.u(env);
        vVar2.m();
    }
}
