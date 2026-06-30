package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.appbrand.y env, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        kotlin.jvm.internal.o.g(env, "env");
        com.tencent.mars.xlog.Log.i("Luggage.EventOnChatToolStatusChange", "onChatToolStatusChange dispatch chatToolMode:" + str + " chatType:" + num + " chatToolUser:" + str2);
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("chatToolMode", str);
        if (kotlin.jvm.internal.o.b(str, "allPage")) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.v vVar = new com.tencent.mm.plugin.appbrand.jsapi.chattool.v();
            vVar.t(hashMap);
            vVar.u(env);
            vVar.m();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("chatToolRoom", "");
        } else {
            hashMap.put("chatType", num);
            hashMap.put("chatToolRoom", str2);
        }
        com.tencent.mm.plugin.appbrand.jsapi.chattool.v vVar2 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.v();
        vVar2.t(hashMap);
        vVar2.u(env);
        vVar2.m();
    }
}
