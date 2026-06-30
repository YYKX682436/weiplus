package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class r1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AASelectContactUI f72783d;

    public r1(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI) {
        this.f72783d = aASelectContactUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r3 == r12.I.size()) goto L27;
     */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.aa.ui.AASelectContactUI r12 = r11.f72783d
            java.util.HashSet r0 = r12.I
            r1 = 1
            if (r0 == 0) goto L98
            int r0 = r0.size()
            if (r0 <= 0) goto L98
            java.util.HashSet r0 = r12.I
            int r0 = r0.size()
            long r2 = (long) r0
            long r4 = r12.f72471J
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L98
            java.util.HashSet r0 = r12.I
            int r0 = r0.size()
            if (r0 != r1) goto L32
            java.util.HashSet r0 = r12.I
            java.lang.String r2 = c01.z1.r()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L32
            r12.finish()
            goto L9b
        L32:
            java.util.ArrayList r0 = r12.F
            if (r0 == 0) goto L6a
            int r0 = r0.size()
            java.util.HashSet r2 = r12.I
            int r2 = r2.size()
            if (r0 != r2) goto L6a
            java.util.HashSet r0 = r12.I
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L4a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.ArrayList r5 = r12.F
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L61
            int r3 = r3 + 1
            goto L4a
        L61:
            java.util.HashSet r0 = r12.I
            int r0 = r0.size()
            if (r3 != r0) goto L6a
            goto L6b
        L6a:
            r2 = r1
        L6b:
            if (r2 == 0) goto L94
            com.tencent.mm.plugin.aa.ui.AASelectContactUI r3 = r11.f72783d
            r0 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r4 = r3.getString(r0)
            r5 = 0
            r0 = 2131755094(0x7f100056, float:1.9141058E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131755093(0x7f100055, float:1.9141056E38)
            java.lang.String r7 = r12.getString(r0)
            r8 = 0
            com.tencent.mm.plugin.aa.ui.p1 r9 = new com.tencent.mm.plugin.aa.ui.p1
            r9.<init>(r11)
            com.tencent.mm.plugin.aa.ui.q1 r10 = new com.tencent.mm.plugin.aa.ui.q1
            r10.<init>(r11)
            db5.e1.C(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L9b
        L94:
            r12.finish()
            goto L9b
        L98:
            r12.finish()
        L9b:
            com.tencent.mm.plugin.report.service.g0 r12 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            r2 = 13721(0x3599, float:1.9227E-41)
            r12.d(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.r1.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
