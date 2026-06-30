package e04;

/* loaded from: classes.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.v1 f327670d = new e04.v1();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.ScanDebugUtil"
            r1 = 0
            java.util.ArrayList r2 = e04.f2.f327465h     // Catch: java.lang.Exception -> Le8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Le8
        L9:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Le8
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Le8
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Le8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le8
            r4.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r5 = "checkRemoveUnusedQBarModelFile current: "
            r4.append(r5)     // Catch: java.lang.Exception -> Le8
            r4.append(r3)     // Catch: java.lang.Exception -> Le8
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> Le8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)     // Catch: java.lang.Exception -> Le8
            goto L9
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le8
            r2.<init>()     // Catch: java.lang.Exception -> Le8
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> Le8
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Exception -> Le8
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> Le8
            r2.append(r3)     // Catch: java.lang.Exception -> Le8
            java.lang.String r3 = "/qbar/"
            r2.append(r3)     // Catch: java.lang.Exception -> Le8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Le8
            r3 = 1
            java.lang.Iterable r4 = com.p314xaae8f345.mm.vfs.w6.s(r2, r3)     // Catch: java.lang.Exception -> Le8
            if (r4 == 0) goto L9a
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Exception -> Le8
        L50:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> Le8
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> Le8
            com.tencent.mm.vfs.x1 r6 = (com.p314xaae8f345.mm.vfs.x1) r6     // Catch: java.lang.Exception -> Le8
            boolean r7 = r6.f294769f     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = r6.f294764a
            if (r7 == 0) goto L63
            goto L50
        L63:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le8
            r7.<init>()     // Catch: java.lang.Exception -> Le8
            r7.append(r2)     // Catch: java.lang.Exception -> Le8
            r7.append(r6)     // Catch: java.lang.Exception -> Le8
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Le8
            java.util.ArrayList r8 = e04.f2.f327465h     // Catch: java.lang.Exception -> Le8
            boolean r8 = r8.contains(r7)     // Catch: java.lang.Exception -> Le8
            if (r8 != 0) goto L50
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le8
            r8.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r9 = "checkRemoveUnusedQBarModelFile deleteFile: "
            r8.append(r9)     // Catch: java.lang.Exception -> Le8
            r8.append(r6)     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = ", fullPath: "
            r8.append(r6)     // Catch: java.lang.Exception -> Le8
            r8.append(r7)     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> Le8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)     // Catch: java.lang.Exception -> Le8
            com.p314xaae8f345.mm.vfs.w6.h(r7)     // Catch: java.lang.Exception -> Le8
            goto L50
        L9a:
            if (r4 == 0) goto Lf0
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Le8
        La0:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Le8
            if (r5 == 0) goto Lf0
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Le8
            com.tencent.mm.vfs.x1 r5 = (com.p314xaae8f345.mm.vfs.x1) r5     // Catch: java.lang.Exception -> Le8
            boolean r6 = r5.f294769f     // Catch: java.lang.Exception -> Le8
            if (r6 == 0) goto La0
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Le8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le8
            r7.<init>()     // Catch: java.lang.Exception -> Le8
            r7.append(r2)     // Catch: java.lang.Exception -> Le8
            java.lang.String r5 = r5.f294764a     // Catch: java.lang.Exception -> Le8
            r7.append(r5)     // Catch: java.lang.Exception -> Le8
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> Le8
            r6.<init>(r5)     // Catch: java.lang.Exception -> Le8
            boolean r5 = r6.y()     // Catch: java.lang.Exception -> Le8
            if (r5 == 0) goto La0
            com.tencent.mm.vfs.r6[] r5 = r6.G()     // Catch: java.lang.Exception -> Le8
            if (r5 == 0) goto Ldd
            int r5 = r5.length     // Catch: java.lang.Exception -> Le8
            if (r5 != 0) goto Ld7
            r5 = r3
            goto Ld8
        Ld7:
            r5 = r1
        Ld8:
            if (r5 == 0) goto Ldb
            goto Ldd
        Ldb:
            r5 = r1
            goto Lde
        Ldd:
            r5 = r3
        Lde:
            if (r5 == 0) goto La0
            java.lang.String r5 = r6.o()     // Catch: java.lang.Exception -> Le8
            com.p314xaae8f345.mm.vfs.w6.f(r5)     // Catch: java.lang.Exception -> Le8
            goto La0
        Le8:
            r2 = move-exception
            java.lang.String r3 = "checkRemoveUnusedQBarModelFile exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r3, r1)
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.v1.run():void");
    }
}
