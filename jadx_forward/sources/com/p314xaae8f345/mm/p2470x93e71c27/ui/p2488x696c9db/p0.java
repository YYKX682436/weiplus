package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f273354a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f273355b;

    static {
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f273354a == null) {
                f273354a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "mmkv_biz_half_chatting_util");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "checkInitMMKV accReady:" + a17 + ", mmkv: " + f273354a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizHalfScreenChattingUtil", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:3:0x0009, B:5:0x000e, B:12:0x001b, B:14:0x003f, B:18:0x0049, B:20:0x004d, B:21:0x0050, B:23:0x0054, B:24:0x0057), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a() {
        /*
            java.lang.String r0 = "MicroMsg.BizHalfScreenChattingUtil"
            java.lang.String r1 = "markSendMsgFromBizArticle  articleIdentity:"
            java.lang.String r2 = "late"
            java.lang.String r3 = "early"
            r4 = 0
            java.lang.String r5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b     // Catch: java.lang.Exception -> L69
            r6 = 1
            if (r5 == 0) goto L17
            boolean r5 = r26.n0.N(r5)     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L15
            goto L17
        L15:
            r5 = r4
            goto L18
        L17:
            r5 = r6
        L18:
            if (r5 == 0) goto L1b
            return
        L1b:
            long r7 = c01.id.a()     // Catch: java.lang.Exception -> L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r5.<init>(r3)     // Catch: java.lang.Exception -> L69
            java.lang.String r3 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b     // Catch: java.lang.Exception -> L69
            r5.append(r3)     // Catch: java.lang.Exception -> L69
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r5.<init>(r2)     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b     // Catch: java.lang.Exception -> L69
            r5.append(r2)     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> L69
            com.tencent.mm.sdk.platformtools.o4 r5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L46
            boolean r5 = r5.f(r3)     // Catch: java.lang.Exception -> L69
            if (r5 != 0) goto L46
            goto L47
        L46:
            r6 = r4
        L47:
            if (r6 == 0) goto L50
            com.tencent.mm.sdk.platformtools.o4 r5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L50
            r5.putLong(r3, r7)     // Catch: java.lang.Exception -> L69
        L50:
            com.tencent.mm.sdk.platformtools.o4 r3 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a     // Catch: java.lang.Exception -> L69
            if (r3 == 0) goto L57
            r3.putLong(r2, r7)     // Catch: java.lang.Exception -> L69
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r2.<init>(r1)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b     // Catch: java.lang.Exception -> L69
            r2.append(r1)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L69
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L69
            goto L71
        L69:
            r1 = move-exception
            java.lang.String r2 = "markSendMsgFromBizArticle"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r2, r3)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a():void");
    }

    public static final void b(java.lang.String str, java.lang.String str2) {
        f273355b = str;
        c01.ia.f118792f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "setMPPageIdentityData  articleIdentity:" + str + "  identity:" + str2);
    }
}
