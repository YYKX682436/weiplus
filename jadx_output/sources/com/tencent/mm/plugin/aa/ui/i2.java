package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class i2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72681d;

    public i2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        this.f72681d = launchAAByPersonAmountSelectUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r3 == ((java.util.HashMap) r12.f72488q).size()) goto L23;
     */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r12 = r11.f72681d
            java.util.Map r0 = r12.f72488q
            r1 = 1
            if (r0 == 0) goto L9a
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L9a
            java.util.HashMap r0 = r12.f72489r
            if (r0 == 0) goto L6c
            int r0 = r0.size()
            java.util.Map r2 = r12.f72488q
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r2 = r2.size()
            if (r0 != r2) goto L6c
            java.util.Map r0 = r12.f72488q
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L2f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap r5 = r12.f72489r
            java.lang.Object r5 = r5.get(r4)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 != 0) goto L46
            goto L61
        L46:
            java.util.Map r6 = r12.f72488q
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 0
            double r6 = com.tencent.mm.sdk.platformtools.t8.F(r4, r6)
            double r4 = r5.doubleValue()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L61
            int r3 = r3 + 1
            goto L2f
        L61:
            java.util.Map r0 = r12.f72488q
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r3 != r0) goto L6c
            goto L6d
        L6c:
            r2 = r1
        L6d:
            if (r2 == 0) goto L96
            com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r3 = r11.f72681d
            r0 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r4 = r3.getString(r0)
            r5 = 0
            r0 = 2131755094(0x7f100056, float:1.9141058E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131755093(0x7f100055, float:1.9141056E38)
            java.lang.String r7 = r12.getString(r0)
            r8 = 0
            com.tencent.mm.plugin.aa.ui.g2 r9 = new com.tencent.mm.plugin.aa.ui.g2
            r9.<init>(r11)
            com.tencent.mm.plugin.aa.ui.h2 r10 = new com.tencent.mm.plugin.aa.ui.h2
            r10.<init>(r11)
            db5.e1.C(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L9d
        L96:
            r12.finish()
            goto L9d
        L9a:
            r12.finish()
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.i2.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
