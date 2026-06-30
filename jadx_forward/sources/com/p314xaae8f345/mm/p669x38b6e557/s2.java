package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class s2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(final android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
            ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class, new wh.t0() { // from class: com.tencent.mm.feature.performance.w1$$g
                /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
                @Override // wh.t0
                /* renamed from: accept */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void mo40853xab27b508(java.lang.Object r8) {
                    /*
                        r7 = this;
                        com.tencent.matrix.batterycanary.monitor.feature.c r8 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) r8
                        android.content.Intent r0 = r1
                        java.lang.String r1 = "pid"
                        r2 = -1
                        int r1 = r0.getIntExtra(r1, r2)
                        if (r1 != r2) goto L12
                        int r1 = android.os.Process.myPid()
                    L12:
                        java.lang.String r3 = "tid"
                        int r2 = r0.getIntExtra(r3, r2)
                        java.lang.String r3 = "MicroMsg.MatrixShellService"
                        if (r2 <= 0) goto L3f
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        java.lang.String r5 = "#MATRIX_BATTERY_DUMP_THREAD, pid = "
                        r4.<init>(r5)
                        r4.append(r1)
                        java.lang.String r5 = ", tid = "
                        r4.append(r5)
                        r4.append(r2)
                        java.lang.String r4 = r4.toString()
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
                        wh.t1 r4 = wh.u1.e(r1, r2)
                        if (r4 == 0) goto L3f
                        java.lang.String r4 = r4.f527406a
                        goto L40
                    L3f:
                        r4 = 0
                    L40:
                        boolean r4 = android.text.TextUtils.isEmpty(r4)
                        r5 = 1
                        if (r4 == 0) goto L8f
                        java.lang.String r4 = "name"
                        java.lang.String r0 = r0.getStringExtra(r4)
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L8f
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        java.lang.String r6 = "#MATRIX_BATTERY_DUMP_THREAD, name = "
                        r4.<init>(r6)
                        r4.append(r0)
                        java.lang.String r4 = r4.toString()
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r8 = r8.k(r5)
                        rh.y2 r8 = r8.f134095h
                        java.util.List r8 = r8.f477093a
                        java.util.Iterator r8 = r8.iterator()
                    L71:
                        boolean r3 = r8.hasNext()
                        if (r3 == 0) goto L8f
                        java.lang.Object r3 = r8.next()
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r3 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) r3
                        java.lang.String r4 = r3.f134099c
                        boolean r4 = r4.equalsIgnoreCase(r0)
                        if (r4 != 0) goto L8d
                        java.lang.String r4 = r3.f134099c
                        boolean r4 = r4.startsWith(r0)
                        if (r4 == 0) goto L71
                    L8d:
                        int r2 = r3.f134098b
                    L8f:
                        if (r2 >= 0) goto L9d
                        android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
                        java.lang.String r0 = "Can NOT get thread tid, abort"
                        android.widget.Toast r8 = dp.a.m125854x26a183b(r8, r0, r5)
                        r8.show()
                        goto La8
                    L9d:
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
                        java.util.List r8 = java.util.Collections.singletonList(r8)
                        ph5.b.a(r1, r8)
                    La8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.C10673x6a3bf0d.mo40853xab27b508(java.lang.Object):void");
                }
            });
        }
    }
}
