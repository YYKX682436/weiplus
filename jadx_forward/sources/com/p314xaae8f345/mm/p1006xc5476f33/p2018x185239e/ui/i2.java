package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i2 f239293a = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i2();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r4 = new o11.f();
        r4.f423616g = g83.a.b();
        r4.f423611b = true;
        r4.f423628s = true;
        n11.a.b().h(r1, r5, r4.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r4 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 r4, android.widget.ImageView r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L4a
            if (r5 != 0) goto L5
            goto L4a
        L5:
            boolean r0 = com.p314xaae8f345.mm.ui.bk.C()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 == 0) goto L23
            java.lang.String r0 = r4.f238576b
            if (r0 == 0) goto L1b
            int r0 = r0.length()
            if (r0 != 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 != 0) goto L23
            java.lang.String r4 = r4.f238576b
            if (r4 != 0) goto L28
            goto L29
        L23:
            java.lang.String r4 = r4.f238575a
            if (r4 != 0) goto L28
            goto L29
        L28:
            r1 = r4
        L29:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r4 != 0) goto L49
            o11.f r4 = new o11.f
            r4.<init>()
            java.lang.String r0 = g83.a.b()
            r4.f423616g = r0
            r4.f423611b = r2
            r4.f423628s = r2
            o11.g r4 = r4.a()
            n11.a r0 = n11.a.b()
            r0.h(r1, r5, r4)
        L49:
            return
        L4a:
            java.lang.String r4 = "RemittanceDetailHelper"
            java.lang.String r5 = "data or imageview is null,ignore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i2.a(com.tencent.mm.plugin.remittance.model.v1, android.widget.ImageView):void");
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var, boolean z17) {
        java.lang.String str;
        if (g1Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceDetailHelper", "[isRemittanceShowExceedTips] isReceiver: " + z17 + ", Remittance Status: " + g1Var.f238364h + ", isQuotaExceed: " + g1Var.I);
        if (z17 && g1Var.f238364h == 2000 && g1Var.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 v1Var = g1Var.H;
            if (((v1Var == null || (str = v1Var.f238577c) == null) ? 0 : str.length()) > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isRemittanceShowExceedTips] need show exceed, wording: ");
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 v1Var2 = g1Var.H;
                sb6.append(v1Var2 != null ? v1Var2.f238577c : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceDetailHelper", sb6.toString());
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceDetailHelper", "[isRemittanceShowExceedTips] no need show Exceed tips");
        return false;
    }
}
