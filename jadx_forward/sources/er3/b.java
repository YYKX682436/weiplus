package er3;

/* loaded from: classes9.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.zl3 a() {
        /*
            r6 = this;
            gm0.m r0 = gm0.j1.b()
            int r0 = r0.h()
            r1 = 2
            java.lang.String r2 = "com.tencent.mm.qqassistant"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J(r2, r0, r1)
            boolean r1 = r6.b(r0)
            java.lang.String r2 = "NetSceneGetQQAssistantInfo"
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.String r0 = "expired, request again"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r6.c()
            return r3
        L21:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            java.lang.String r1 = "info"
            boolean r4 = r0.f(r1)
            if (r4 == 0) goto L56
            byte[] r0 = r0.j(r1)
            if (r0 == 0) goto L56
            int r1 = r0.length
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L39
            r1 = r4
            goto L3a
        L39:
            r1 = r5
        L3a:
            r1 = r1 ^ r4
            if (r1 == 0) goto L56
            java.lang.Class<r45.zl3> r1 = r45.zl3.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L4c
            r4 = r1
            com.tencent.mm.protobuf.f r4 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r4     // Catch: java.lang.Exception -> L4c
            r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L4c
            com.tencent.mm.protobuf.f r1 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r1     // Catch: java.lang.Exception -> L4c
            goto L57
        L4c:
            r0 = move-exception
            java.lang.String r1 = "decode ProtoBuffer"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = "MultiProcessMMKV.decodeProtoBuffer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r0, r1, r4)
        L56:
            r1 = r3
        L57:
            r45.zl3 r1 = (r45.zl3) r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "getPathInfoFromMMKV "
            r0.<init>(r4)
            if (r1 == 0) goto L6e
            byte[] r4 = r1.m75962x8b6d8abc()
            if (r4 == 0) goto L6e
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L6f
        L6e:
            r4 = r3
        L6f:
            r0.append(r4)
            java.lang.String r4 = " appID: "
            r0.append(r4)
            if (r1 == 0) goto L7c
            java.lang.String r4 = r1.f473726d
            goto L7d
        L7c:
            r4 = r3
        L7d:
            r0.append(r4)
            java.lang.String r4 = " weapp_param: "
            r0.append(r4)
            if (r1 == 0) goto L8a
            java.lang.String r4 = r1.f473727e
            goto L8b
        L8a:
            r4 = r3
        L8b:
            r0.append(r4)
            java.lang.String r4 = " menu_weapp_path: "
            r0.append(r4)
            if (r1 == 0) goto L98
            java.lang.String r4 = r1.f473728f
            goto L99
        L98:
            r4 = r3
        L99:
            r0.append(r4)
            java.lang.String r4 = " bind_qq_weapp_path: "
            r0.append(r4)
            if (r1 == 0) goto La6
            java.lang.String r4 = r1.f473729g
            goto La7
        La6:
            r4 = r3
        La7:
            r0.append(r4)
            java.lang.String r4 = " menu_setting_weapp_path: "
            r0.append(r4)
            if (r1 == 0) goto Lb3
            java.lang.String r3 = r1.f473730h
        Lb3:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er3.b.a():r45.zl3");
    }

    public final boolean b(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        java.lang.Long valueOf = o4Var != null ? java.lang.Long.valueOf(o4Var.p("time")) : null;
        if (valueOf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", "never req info.");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", "last get Time " + new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(valueOf));
        return c01.id.c() - valueOf.longValue() > ((long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("QQAssistantInfoExpireTime", 86400)) * 1000;
    }

    public final void c() {
        if (b(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("com.tencent.mm.qqassistant", gm0.j1.b().h(), 2))) {
            gm0.j1.d().g(new er3.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", "requesting GetQQAssistantInfo");
        }
    }
}
