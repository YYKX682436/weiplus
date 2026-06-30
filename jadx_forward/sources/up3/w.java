package up3;

/* loaded from: classes12.dex */
public class w extends up3.f0 {
    @Override // up3.f0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x001e, B:12:0x003e, B:15:0x0079, B:18:0x0083, B:20:0x008b, B:22:0x0095, B:24:0x009d, B:25:0x00a9, B:26:0x0028, B:29:0x0031, B:32:0x00aa, B:33:0x00b1), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x001e, B:12:0x003e, B:15:0x0079, B:18:0x0083, B:20:0x008b, B:22:0x0095, B:24:0x009d, B:25:0x00a9, B:26:0x0028, B:29:0x0031, B:32:0x00aa, B:33:0x00b1), top: B:2:0x0007 }] */
    @Override // up3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r10) {
        /*
            r9 = this;
            up3.c0 r10 = (up3.c0) r10
            java.lang.String r0 = "\n"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = r10.f511355b     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = up3.d0.g(r3)     // Catch: java.lang.Throwable -> Lb2
            com.tencent.mm.vfs.r6 r5 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> Lb2
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r5.m()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Laa
            boolean r6 = r5.h()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Laa
            java.lang.String r6 = "/EnMicroMsg.db"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> Lb2
            r7 = 1
            if (r6 == 0) goto L28
            goto L39
        L28:
            java.lang.String r6 = "/EnMicroMsg2.db"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L31
            goto L39
        L31:
            java.lang.String r6 = "/EnMicroMsg_temp.db"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L3b
        L39:
            r6 = r2
            goto L3c
        L3b:
            r6 = r7
        L3c:
            if (r6 == 0) goto L9d
            com.tencent.mm.vfs.r6 r6 = up3.d0.e()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "ìè¦¸¢£è¶¦´©øã"
            java.lang.String r1 = tp3.b.a(r1)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r1)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "ìè»¯ª¨è¶¦´©øã"
            java.lang.String r1 = tp3.b.a(r1)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r1)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r4)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> Lb2
            r1 = 0
            up3.b.b(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "${flutter_profiler}"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = r10.f511354a
            if (r0 == 0) goto L83
            java.lang.String r0 = r6.o()     // Catch: java.lang.Throwable -> Lb2
            r1 = 20200(0x4ee8, float:2.8306E-41)
            up3.d0.i(r10, r0, r2, r1)     // Catch: java.lang.Throwable -> Lb2
            goto Lbc
        L83:
            java.lang.String r0 = "${flutter_snapshot}"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L95
            java.lang.String r0 = r6.o()     // Catch: java.lang.Throwable -> Lb2
            r1 = 20210(0x4ef2, float:2.832E-41)
            up3.d0.i(r10, r0, r7, r1)     // Catch: java.lang.Throwable -> Lb2
            goto Lbc
        L95:
            java.lang.String r0 = r6.o()     // Catch: java.lang.Throwable -> Lb2
            up3.d0.a(r10, r0, r7)     // Catch: java.lang.Throwable -> Lb2
            goto Lbc
        L9d:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "\u0086¦¾ë¥©ª¨·¤¦í"
            java.lang.String r0 = tp3.b.a(r0)     // Catch: java.lang.Throwable -> Lb2
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r10     // Catch: java.lang.Throwable -> Lb2
        Laa:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "Target is not exist or cannot be read."
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r10     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            java.lang.String r0 = up3.d0.f511356d
            java.lang.String r1 = "Failure."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r10, r1, r2)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: up3.w.b(java.lang.Object):void");
    }
}
