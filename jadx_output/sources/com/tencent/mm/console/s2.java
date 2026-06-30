package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class s2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(final android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
            ph.a.b(com.tencent.matrix.batterycanary.monitor.feature.c.class, new wh.t0() { // from class: com.tencent.mm.feature.performance.w1$$g
                /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
                @Override // wh.t0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r8) {
                    /*
                        r7 = this;
                        com.tencent.matrix.batterycanary.monitor.feature.c r8 = (com.tencent.matrix.batterycanary.monitor.feature.c) r8
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
                        com.tencent.mars.xlog.Log.i(r3, r4)
                        wh.t1 r4 = wh.u1.e(r1, r2)
                        if (r4 == 0) goto L3f
                        java.lang.String r4 = r4.f445873a
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
                        com.tencent.mars.xlog.Log.i(r3, r4)
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r8 = r8.k(r5)
                        rh.y2 r8 = r8.f52562h
                        java.util.List r8 = r8.f395560a
                        java.util.Iterator r8 = r8.iterator()
                    L71:
                        boolean r3 = r8.hasNext()
                        if (r3 == 0) goto L8f
                        java.lang.Object r3 = r8.next()
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) r3
                        java.lang.String r4 = r3.f52566c
                        boolean r4 = r4.equalsIgnoreCase(r0)
                        if (r4 != 0) goto L8d
                        java.lang.String r4 = r3.f52566c
                        boolean r4 = r4.startsWith(r0)
                        if (r4 == 0) goto L71
                    L8d:
                        int r2 = r3.f52565b
                    L8f:
                        if (r2 >= 0) goto L9d
                        android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
                        java.lang.String r0 = "Can NOT get thread tid, abort"
                        android.widget.Toast r8 = dp.a.makeText(r8, r0, r5)
                        r8.show()
                        goto La8
                    L9d:
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
                        java.util.List r8 = java.util.Collections.singletonList(r8)
                        ph5.b.a(r1, r8)
                    La8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.w1$$g.accept(java.lang.Object):void");
                }
            });
        }
    }
}
