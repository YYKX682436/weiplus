package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes4.dex */
public final class w0 extends i95.w implements k01.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f162008d = new java.util.HashMap();

    public boolean Ai(java.lang.String str, java.util.List list) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WechatChatToolRoomsService", "saveChatToolRooms ignore: not main process");
            return false;
        }
        if (!(str != null && str.length() == 0)) {
            if (!(list != null ? list.isEmpty() : false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.a.class);
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WechatChatToolRoomsService", "saveChatToolRooms ignore: storage is null");
                    return false;
                }
                java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) list).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
                dm.y1 y1Var = new dm.y1();
                y1Var.f69182x33752ff6 = str;
                boolean z17 = aVar.get(y1Var, new java.lang.String[0]);
                y1Var.f69181xfa75997b = jSONArray;
                boolean mo9952xce0038c9 = z17 ? aVar.mo9952xce0038c9(y1Var, new java.lang.String[0]) : aVar.mo880xb970c2b9(y1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WechatChatToolRoomsService", "saveChatToolRooms roomId:" + str + " isOk:" + mo9952xce0038c9);
                java.util.Objects.toString(list);
                if (mo9952xce0038c9) {
                    java.util.HashMap hashMap = this.f162008d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    hashMap.put(str, jSONArray);
                }
                return mo9952xce0038c9;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WechatChatToolRoomsService", "saveChatToolRooms ignore: roomId:" + str + " or chatToolRooms is empty");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String wi(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.WechatChatToolRoomsService"
            if (r0 != 0) goto L10
            java.lang.String r9 = "getChatToolRooms ignore: not main process"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r9)
            return r1
        L10:
            r0 = 1
            r3 = 0
            if (r9 == 0) goto L1c
            int r4 = r9.length()
            if (r4 != 0) goto L1c
            r4 = r0
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r4 == 0) goto L25
            java.lang.String r9 = "getChatToolRooms ignore: roomId is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r9)
            return r1
        L25:
            java.util.HashMap r4 = r8.f162008d
            boolean r5 = r4.containsKey(r9)
            if (r5 == 0) goto L34
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L34:
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.chattool.a> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.a.class
            java.lang.Object r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r5)
            com.tencent.mm.plugin.appbrand.jsapi.chattool.a r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.a) r5
            if (r5 != 0) goto L44
            java.lang.String r9 = "getChatToolRooms ignore: storage is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r9)
            return r1
        L44:
            java.lang.String r1 = "MicroMsg.BaseChatRoomsInfoStorage"
            r2 = 0
            dm.y1 r6 = new dm.y1     // Catch: java.lang.Exception -> L62
            r6.<init>()     // Catch: java.lang.Exception -> L62
            r6.f69182x33752ff6 = r9     // Catch: java.lang.Exception -> L62
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Exception -> L62
            boolean r5 = r5.get(r6, r7)     // Catch: java.lang.Exception -> L62
            if (r5 == 0) goto L6c
            java.lang.String r5 = "found info with chatRoomsId(%s)"
            java.lang.Object[] r7 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L62
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5, r7)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = r6.f69181xfa75997b     // Catch: java.lang.Exception -> L62
            goto L6d
        L62:
            r5 = move-exception
            java.lang.String r6 = "get with chatRoomsId(%s)"
            java.lang.Object[] r7 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r5, r6, r7)
        L6c:
            r1 = r2
        L6d:
            if (r1 == 0) goto L80
            int r2 = r1.length()
            if (r2 <= 0) goto L76
            goto L77
        L76:
            r0 = r3
        L77:
            if (r0 == 0) goto L7f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            r4.put(r9, r1)
        L7f:
            r2 = r1
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.w0.wi(java.lang.String):java.lang.String");
    }
}
