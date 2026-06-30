package l93;

/* loaded from: classes8.dex */
public final class p0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p0() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r8) {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.FinderTeenModeChangeEvent r8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5540xc4fec7) r8
            java.lang.String r0 = "MicroMsg.FinderTeenModeEventListener"
            java.lang.String r1 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch: java.lang.Throwable -> L45
            boolean r5 = r4 instanceof android.app.ActivityManager     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L1b
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Throwable -> L45
            goto L1c
        L1b:
            r4 = r2
        L1c:
            if (r4 == 0) goto L4f
            java.util.List r4 = r4.getRunningTasks(r1)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L4f
            java.lang.Object r4 = kz5.n0.Z(r4)     // Catch: java.lang.Throwable -> L45
            android.app.ActivityManager$RunningTaskInfo r4 = (android.app.ActivityManager.RunningTaskInfo) r4     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L4f
            android.content.ComponentName r4 = r4.baseActivity     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L4f
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L4f
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class
            f06.d r5 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r5.d()     // Catch: java.lang.Throwable -> L45
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L45
            goto L50
        L45:
            r4 = move-exception
            java.lang.String r5 = "FinderTeenModeEventListener callback: ams is dead"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r5, r4)
        L4f:
            r4 = r3
        L50:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "finderTeenModeEvent: teen mode change， isFinderTaskForeground = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
            if (r4 != 0) goto L73
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r4 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r4)
            zy2.c9 r0 = (zy2.c9) r0
            zy2.c9.ad(r0, r3, r1, r2)
        L73:
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            c61.l7 r0 = (c61.l7) r0
            am.kd r8 = r8.f135864g
            int r8 = r8.f88672a
            if (r8 != r1) goto L82
            r3 = r1
        L82:
            r0.getClass()
            java.lang.Class<uh4.c0> r8 = uh4.c0.class
            i95.m r8 = i95.n0.c(r8)
            uh4.c0 r8 = (uh4.c0) r8
            boolean r8 = r8.mo168058x74219ae7()
            if (r8 == 0) goto L9f
            r0.fj()
            if (r3 == 0) goto L9f
            zy2.fa r8 = r0.nk()
            r8.H()
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l93.p0.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
