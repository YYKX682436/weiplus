package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72889d;

    public x5(java.lang.String str) {
        this.f72889d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[Catch: Exception -> 0x006a, TRY_LEAVE, TryCatch #0 {Exception -> 0x006a, blocks: (B:3:0x0036, B:5:0x003c, B:8:0x0043, B:12:0x004a), top: B:2:0x0036 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/aa/ui/PayListAAUIAmountInfoUIC$renderPayerAmountInfoView$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "handle routeInfoString, : "
            r7.<init>(r0)
            java.lang.String r0 = r6.f72889d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "MicroMsg.PayListAAUIAmountInfoUIC"
            com.tencent.mars.xlog.Log.i(r1, r7)
            r45.yt5 r7 = new r45.yt5
            r7.<init>()
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L47
            int r3 = r0.length     // Catch: java.lang.Exception -> L6a
            r4 = 1
            if (r3 != 0) goto L42
            r3 = r4
            goto L43
        L42:
            r3 = r2
        L43:
            r3 = r3 ^ r4
            if (r3 != r4) goto L47
            goto L48
        L47:
            r4 = r2
        L48:
            if (r4 == 0) goto L72
            r7.parseFrom(r0)     // Catch: java.lang.Exception -> L6a
            com.tencent.kinda.gen.ITransmitKvData r0 = com.tencent.kinda.gen.ITransmitKvData.create()     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = "route_info"
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Exception -> L6a
            r0.putBinary(r3, r7)     // Catch: java.lang.Exception -> L6a
            java.lang.Class<h45.q> r7 = h45.q.class
            i95.m r7 = i95.n0.c(r7)     // Catch: java.lang.Exception -> L6a
            h45.q r7 = (h45.q) r7     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = "commonRoute"
            com.tencent.mm.plugin.aa.ui.w5 r4 = com.tencent.mm.plugin.aa.ui.w5.f72875a     // Catch: java.lang.Exception -> L6a
            r7.startUseCase(r3, r0, r4)     // Catch: java.lang.Exception -> L6a
            goto L72
        L6a:
            r7 = move-exception
            java.lang.String r0 = "parse routeInfo error"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r0, r2)
        L72:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/aa/ui/PayListAAUIAmountInfoUIC$renderPayerAmountInfoView$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.x5.onClick(android.view.View):void");
    }
}
