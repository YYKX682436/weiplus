package wo;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static wo.p f529304d;

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f529305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f529306b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f529307c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public p(java.lang.String e17) {
        java.io.ObjectInputStream objectInputStream;
        java.lang.Exception e18;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.File file;
        this.f529306b = "";
        ?? r17 = 0;
        r17 = 0;
        r1 = 0;
        r17 = 0;
        r17 = 0;
        int i17 = 0;
        this.f529307c = false;
        this.f529306b = e17;
        java.io.InputStream inputStream = null;
        try {
            try {
                file = new java.io.File((java.lang.String) e17);
                if (!file.exists()) {
                    this.f529307c = true;
                    file.createNewFile();
                }
            } catch (java.lang.Throwable th6) {
                inputStream = e17;
                th = th6;
                i17 = r17;
            }
        } catch (java.lang.Exception e19) {
            objectInputStream = null;
            e18 = e19;
            bufferedInputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            objectInputStream = null;
        }
        if (file.length() == 0) {
            this.f529307c = true;
            this.f529305a = new java.util.HashMap();
            return;
        }
        bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        try {
            objectInputStream = new java.io.ObjectInputStream(bufferedInputStream);
            try {
                this.f529305a = (java.util.Map) objectInputStream.readObject();
                objectInputStream.close();
                bufferedInputStream.close();
                try {
                    bufferedInputStream.close();
                    e17 = bufferedInputStream;
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e27, "", new java.lang.Object[0]);
                    e17 = e27;
                }
                try {
                    objectInputStream.close();
                } catch (java.io.IOException e28) {
                    e17 = e28;
                    r17 = new java.lang.Object[0];
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e17, "", r17);
                }
            } catch (java.lang.Exception e29) {
                e18 = e29;
                this.f529305a = new java.util.HashMap();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e18, "", new java.lang.Object[0]);
                e17 = bufferedInputStream;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                        e17 = bufferedInputStream;
                    } catch (java.io.IOException e37) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e37, "", new java.lang.Object[0]);
                        e17 = e37;
                    }
                }
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (java.io.IOException e38) {
                        e17 = e38;
                        r17 = new java.lang.Object[0];
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e17, "", r17);
                    }
                }
            }
        } catch (java.lang.Exception e39) {
            objectInputStream = null;
            e18 = e39;
        } catch (java.lang.Throwable th8) {
            inputStream = bufferedInputStream;
            th = th8;
            objectInputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e47) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e47, "", new java.lang.Object[i17]);
                }
            }
            if (objectInputStream == null) {
                throw th;
            }
            try {
                objectInputStream.close();
                throw th;
            } catch (java.io.IOException e48) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatibleFileStorage", e48, "", new java.lang.Object[i17]);
                throw th;
            }
        }
    }

    public static synchronized wo.p a() {
        wo.p pVar;
        synchronized (wo.p.class) {
            if (f529304d == null) {
                f529304d = new wo.p(lp0.b.e() + "CompatibleInfo.cfg");
            }
            pVar = f529304d;
        }
        return pVar;
    }

    public synchronized void b(int i17, java.lang.Object obj) {
        this.f529305a.put(java.lang.Integer.valueOf(i17), obj);
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[Catch: all -> 0x0086, SYNTHETIC, TRY_LEAVE, TryCatch #3 {, blocks: (B:10:0x0022, B:12:0x0030, B:18:0x0035, B:21:0x0027, B:33:0x005f, B:28:0x006f, B:31:0x0074, B:36:0x0064, B:50:0x0082, B:42:0x0094, B:47:0x00a2, B:46:0x0099, B:53:0x0089), top: B:3:0x0003, inners: #1, #2, #4, #7, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            java.lang.String r4 = r8.f529306b     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            java.util.Map r1 = r8.f529305a     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L7f
            r3.writeObject(r1)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L7f
            r3.close()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L7f
            r2.flush()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L7f
            r2.close()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L7f
            r2.close()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L86
            goto L30
        L26:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r4, r5)     // Catch: java.lang.Throwable -> L86
        L30:
            r3.close()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L86
            goto L7d
        L34:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L86
            goto L7d
        L3f:
            r1 = move-exception
            goto L54
        L41:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L80
        L46:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L54
        L4b:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
            goto L80
        L50:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L54:
            java.lang.String r4 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r5, r6)     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L6d
            r2.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L86
            goto L6d
        L63:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r4, r5)     // Catch: java.lang.Throwable -> L86
        L6d:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L86
            goto L7d
        L73:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L86
        L7d:
            monitor-exit(r8)
            return
        L7f:
            r1 = move-exception
        L80:
            if (r2 == 0) goto L92
            r2.close()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            goto L92
        L86:
            r0 = move-exception
            goto La3
        L88:
            r2 = move-exception
            java.lang.String r4 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r5, r6)     // Catch: java.lang.Throwable -> L86
        L92:
            if (r3 == 0) goto La2
            r3.close()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L98
            goto La2
        L98:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r2, r4, r0)     // Catch: java.lang.Throwable -> L86
        La2:
            throw r1     // Catch: java.lang.Throwable -> L86
        La3:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.p.c():void");
    }
}
