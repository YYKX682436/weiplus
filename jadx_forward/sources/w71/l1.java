package w71;

/* loaded from: classes8.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f524951a = new java.util.concurrent.CopyOnWriteArraySet();

    public static final byte[] a(int i17) {
        for (f70.f fVar : f524951a) {
            if (fVar.e(i17)) {
                byte[] b17 = fVar.b(i17);
                return b17 == null ? new byte[0] : b17;
            }
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] b(int r4) {
        /*
            r0 = 4
            r1 = 10
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            if (r4 != r0) goto L95
            r45.ky2 r0 = new r45.ky2
            r0.<init>()
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            zy2.fa r2 = r2.nk()
            r45.bt2 r4 = r2.t0(r4)
            r0.set(r1, r4)
            java.lang.Class<pm4.u> r4 = pm4.u.class
            i95.m r4 = i95.n0.c(r4)
            pm4.u r4 = (pm4.u) r4
            lf0.f0 r4 = (lf0.f0) r4
            r4.getClass()
            boolean r1 = wm4.u.q()
            if (r1 == 0) goto L82
            r4 = 0
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L75
            boolean r2 = r1 instanceof android.app.ActivityManager     // Catch: java.lang.Throwable -> L75
            r3 = 0
            if (r2 == 0) goto L43
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L75
            goto L44
        L43:
            r1 = r3
        L44:
            r2 = 1
            if (r1 == 0) goto L4b
            java.util.List r3 = r1.getRunningTasks(r2)     // Catch: java.lang.Throwable -> L75
        L4b:
            if (r3 == 0) goto L56
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L54
            goto L56
        L54:
            r1 = r4
            goto L57
        L56:
            r1 = r2
        L57:
            if (r1 != 0) goto L84
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.Throwable -> L75
            android.app.ActivityManager$RunningTaskInfo r1 = (android.app.ActivityManager.RunningTaskInfo) r1     // Catch: java.lang.Throwable -> L75
            android.content.ComponentName r1 = r1.baseActivity     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L84
            java.lang.Class<com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18739x7e7cc4db.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r1.getClassName()     // Catch: java.lang.Throwable -> L75
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r1)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L84
            r4 = r2
            goto L84
        L75:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.TopStoryMultiTaskService"
            java.lang.String r3 = "isTopStoryForeground: ams is dead"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r1)
            goto L84
        L82:
            boolean r4 = r4.f399742e
        L84:
            r1 = 11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.set(r1, r4)
            byte[] r4 = r0.mo14344x5f01b1f6()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
            goto Lb4
        L95:
            r45.ky2 r0 = new r45.ky2
            r0.<init>()
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            zy2.fa r2 = r2.nk()
            r45.bt2 r4 = r2.t0(r4)
            r0.set(r1, r4)
            byte[] r4 = r0.mo14344x5f01b1f6()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
        Lb4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w71.l1.b(int):byte[]");
    }

    public static final byte[] c(int i17) {
        for (f70.f fVar : f524951a) {
            if (fVar.e(i17)) {
                byte[] d17 = fVar.d(i17);
                return d17 == null ? new byte[0] : d17;
            }
        }
        return new byte[0];
    }

    public static final byte[] d(int i17) {
        for (f70.f fVar : f524951a) {
            if (fVar.e(i17)) {
                byte[] h17 = fVar.h(i17);
                return h17 == null ? new byte[0] : h17;
            }
        }
        return new byte[0];
    }
}
