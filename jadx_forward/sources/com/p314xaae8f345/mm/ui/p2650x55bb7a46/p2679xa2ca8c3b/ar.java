package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar f284938a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:6:0x0013, B:8:0x002a, B:9:0x0031, B:11:0x0056, B:13:0x005e, B:14:0x0064, B:16:0x006c, B:19:0x008b), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ab, blocks: (B:6:0x0013, B:8:0x002a, B:9:0x0031, B:11:0x0056, B:13:0x005e, B:14:0x0064, B:16:0x006c, B:19:0x008b), top: B:5:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r10, java.lang.Integer r11) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.DyeingTemplateUtil"
            java.lang.String r1 = "[stateBitsetFormPayReceiptMsgRecord] mark redDot state: "
            java.lang.String r2 = "[stateBitsetFormMsgInfo] mark redDot state: "
            if (r10 == 0) goto Lc1
            if (r11 != 0) goto Lc
            goto Lc1
        Lc:
            int r3 = r11.intValue()
            r4 = 1
            int r3 = r4 << r3
            int r5 = r10.f317709p0     // Catch: java.lang.Exception -> Lab
            r5 = r5 | r3
            r10.f317709p0 = r5     // Catch: java.lang.Exception -> Lab
            r10.f317711r = r4     // Catch: java.lang.Exception -> Lab
            java.lang.Class<vg3.x3> r6 = vg3.x3.class
            lm0.a r6 = gm0.j1.s(r6)     // Catch: java.lang.Exception -> Lab
            vg3.x3 r6 = (vg3.x3) r6     // Catch: java.lang.Exception -> Lab
            com.tencent.mm.plugin.messenger.foundation.h2 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r6     // Catch: java.lang.Exception -> Lab
            com.tencent.mm.storage.g9 r6 = r6.cj()     // Catch: java.lang.Exception -> Lab
            if (r6 == 0) goto L31
            long r7 = r10.m124847x74d37ac6()     // Catch: java.lang.Exception -> Lab
            r6.lb(r7, r10, r4)     // Catch: java.lang.Exception -> Lab
        L31:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r4.<init>(r2)     // Catch: java.lang.Exception -> Lab
            r4.append(r11)     // Catch: java.lang.Exception -> Lab
            r2 = 44
            r4.append(r2)     // Catch: java.lang.Exception -> Lab
            r4.append(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lab
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lab
            com.tencent.wcdb.core.Table r2 = rb3.b.f475387a     // Catch: java.lang.Exception -> Lab
            long r6 = r10.m124847x74d37ac6()     // Catch: java.lang.Exception -> Lab
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> Lab
            com.tencent.wcdb.core.Table r4 = rb3.b.f475387a     // Catch: java.lang.Exception -> Lab
            if (r2 == 0) goto L63
            long r6 = r2.longValue()     // Catch: java.lang.Exception -> Lab
            com.tencent.wcdb.orm.Field r2 = up5.l.f511543c     // Catch: java.lang.Exception -> Lab
            if (r2 == 0) goto L63
            com.tencent.wcdb.winq.Expression r2 = r2.eq(r6)     // Catch: java.lang.Exception -> Lab
            goto L64
        L63:
            r2 = 0
        L64:
            java.lang.Object r2 = r4.m107127x946de4d9(r2)     // Catch: java.lang.Exception -> Lab
            up5.z r2 = (up5.z) r2     // Catch: java.lang.Exception -> Lab
            if (r2 != 0) goto L8b
            up5.z r11 = new up5.z     // Catch: java.lang.Exception -> Lab
            r11.<init>()     // Catch: java.lang.Exception -> Lab
            long r1 = r10.m124847x74d37ac6()     // Catch: java.lang.Exception -> Lab
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lab
            r11.f511657a = r1     // Catch: java.lang.Exception -> Lab
            long r1 = r10.I0()     // Catch: java.lang.Exception -> Lab
            java.lang.Long r10 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lab
            r11.f511658b = r10     // Catch: java.lang.Exception -> Lab
            r11.f511659c = r5     // Catch: java.lang.Exception -> Lab
            r4.m107158x7beb81f7(r11)     // Catch: java.lang.Exception -> Lab
            goto Lc1
        L8b:
            int r10 = r2.f511659c     // Catch: java.lang.Exception -> Lab
            r10 = r10 | r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r3.<init>(r1)     // Catch: java.lang.Exception -> Lab
            r3.append(r11)     // Catch: java.lang.Exception -> Lab
            java.lang.String r11 = ", "
            r3.append(r11)     // Catch: java.lang.Exception -> Lab
            r3.append(r10)     // Catch: java.lang.Exception -> Lab
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Exception -> Lab
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)     // Catch: java.lang.Exception -> Lab
            r2.f511659c = r10     // Catch: java.lang.Exception -> Lab
            r4.m107158x7beb81f7(r2)     // Catch: java.lang.Exception -> Lab
            goto Lc1
        Lab:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "[markRedDotState] db action failed: "
            r11.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r10)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar.a(com.tencent.mm.storage.f9, java.lang.Integer):void");
    }
}
