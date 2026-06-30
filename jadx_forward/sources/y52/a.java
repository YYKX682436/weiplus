package y52;

/* loaded from: classes15.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x0010, B:11:0x0015, B:13:0x002c, B:15:0x0031, B:18:0x003f, B:25:0x001a), top: B:3:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized r45.iw3 a() {
        /*
            java.lang.Class<y52.a> r0 = y52.a.class
            monitor-enter(r0)
            java.lang.String r1 = "mmkv_key_hell_PFLOW"
            byte[] r1 = c52.c.a(r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3c
            if (r2 > 0) goto L10
            goto L29
        L10:
            r45.iw3 r2 = new r45.iw3     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            r2.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L19 java.lang.Throwable -> L3c
            goto L2a
        L19:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "HABBYGE-MALI.HellPageFlowDao"
            java.lang.String r4 = "HellPageFlowDao.read crash: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r2)     // Catch: java.lang.Throwable -> L3c
        L29:
            r2 = 0
        L2a:
            if (r2 != 0) goto L4e
            r45.iw3 r2 = new r45.iw3     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            byte[] r1 = r2.mo14344x5f01b1f6()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.lang.String r3 = "mmkv_key_hell_PFLOW"
            c52.c.d(r3, r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            goto L4e
        L3c:
            r1 = move-exception
            goto L50
        L3e:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "HABBYGE-MALI.HellPageFlowDao"
            java.lang.String r5 = "HellPageFlowDao.writeBack crash: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r5, r3)     // Catch: java.lang.Throwable -> L3c
        L4e:
            monitor-exit(r0)
            return r2
        L50:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y52.a.a():r45.iw3");
    }

    public static synchronized void b(r45.iw3 iw3Var) {
        synchronized (y52.a.class) {
            if (iw3Var == null) {
                return;
            }
            try {
                c52.c.d("mmkv_key_hell_PFLOW", iw3Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellPageFlowDao", e17, "HellPageFlowDao.writeBack crash: %s", e17.getMessage());
            }
        }
    }
}
