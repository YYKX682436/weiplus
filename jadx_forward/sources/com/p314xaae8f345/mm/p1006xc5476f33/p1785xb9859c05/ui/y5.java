package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class y5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 f224620a;

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var) {
        this.f224620a = l6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.ipcall.ui.l6 r0 = r8.f224620a
            android.widget.EditText r1 = r0.f224435a
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r2 == 0) goto L18
            long r2 = java.lang.System.currentTimeMillis()
            r0.B = r2
        L18:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.B
            long r4 = r2 - r4
            r6 = 3000(0xbb8, double:1.482E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " "
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = r4.toString()
            r0.B = r2
            java.lang.String r2 = ""
            r0.i(r1, r2)
            com.tencent.mm.plugin.ipcall.j r0 = r0.f224459y
            r0.getClass()
            com.tencent.mm.plugin.ipcall.model.m r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj()
            boolean r0 = r0.c()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L67
            java.lang.String r9 = "MicroMsg.IPCallManager"
            java.lang.String r0 = "ipcall not connect, cannot call dialWhenTalking now"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r0)
            goto Le1
        L67:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r0 != 0) goto Le1
            int r0 = r9.length()
            if (r0 != r1) goto Le1
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            r3 = -1
            if (r0 != 0) goto La8
            int r0 = r9.length()
            if (r0 != r1) goto La8
            char r9 = r9.charAt(r2)
            r0 = 48
            if (r9 < r0) goto L8e
            r4 = 57
            if (r9 > r4) goto L8e
            int r9 = r9 - r0
            goto La9
        L8e:
            r0 = 42
            if (r9 != r0) goto L95
            r9 = 10
            goto La9
        L95:
            r0 = 35
            if (r9 != r0) goto L9c
            r9 = 11
            goto La9
        L9c:
            r0 = 65
            if (r9 < r0) goto La8
            r4 = 68
            if (r9 > r4) goto La8
            int r9 = r9 - r0
            int r9 = r9 + 12
            goto La9
        La8:
            r9 = r3
        La9:
            if (r9 == r3) goto Le1
            m83.c r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni()
            r0.getClass()
            m83.d r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi()
            int r4 = r3.G
            int r4 = r4 + r1
            r3.G = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "MicroMsg.IPCallReportHelper"
            java.lang.String r5 = "now addCallClickCnt %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f406250a
            int r9 = r0.m72791x4e2d5dd1(r9)
            if (r9 >= 0) goto Le1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "MicroMsg.IPCallEngineManager"
            java.lang.String r3 = "sendDTMF failed, ret: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r9)
        Le1:
            com.tencent.mm.plugin.report.service.g0 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r2, r1}
            r1 = 12057(0x2f19, float:1.6895E-41)
            r9.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y5.a(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b
    public void b(java.lang.String str) {
    }
}
