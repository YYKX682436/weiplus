package mz4;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile mz4.b0 f414760b;

    /* renamed from: a, reason: collision with root package name */
    public iz4.r f414761a = null;

    public static mz4.b0 c() {
        if (f414760b == null) {
            synchronized (mz4.b0.class) {
                if (f414760b == null) {
                    f414760b = new mz4.b0();
                }
            }
        }
        return f414760b;
    }

    public iz4.r a() {
        iz4.r rVar = this.f414761a;
        if (rVar != null) {
            return rVar;
        }
        iz4.r b17 = b();
        this.f414761a = b17;
        if (b17 != null) {
            b17.a();
        }
        return this.f414761a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #5 {Exception -> 0x0085, blocks: (B:50:0x0081, B:43:0x0089), top: B:49:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iz4.r b() {
        /*
            r8 = this;
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.n3 r0 = r0.p()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WENOTE_KEEP_TOP_DATA_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.m(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r2 = 0
            if (r1 == 0) goto L1a
            return r2
        L1a:
            byte[] r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(r0)
            int r1 = r0.length
            if (r1 > 0) goto L22
            return r2
        L22:
            java.lang.String r1 = "toObject close exception:%s"
            java.lang.String r3 = "WNNoteKeepTopManager"
            int r4 = r0.length
            if (r4 > 0) goto L2b
            goto L7a
        L2b:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.Object r5 = r0.readObject()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L7b
            iz4.r r5 = (iz4.r) r5     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L7b
            r0.close()     // Catch: java.lang.Exception -> L42
            r4.close()     // Catch: java.lang.Exception -> L42
            goto L4a
        L42:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1, r0)
        L4a:
            r2 = r5
            goto L7a
        L4c:
            r5 = move-exception
            goto L5b
        L4e:
            r0 = move-exception
            goto L7f
        L50:
            r0 = move-exception
            r5 = r0
            r0 = r2
            goto L5b
        L54:
            r0 = move-exception
            r4 = r2
            goto L7f
        L57:
            r0 = move-exception
            r5 = r0
            r0 = r2
            r4 = r0
        L5b:
            java.lang.String r6 = "toObject exception:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L7b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r6, r5)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.lang.Exception -> L6b
            goto L6d
        L6b:
            r0 = move-exception
            goto L73
        L6d:
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.lang.Exception -> L6b
            goto L7a
        L73:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1, r0)
        L7a:
            return r2
        L7b:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L7f:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.lang.Exception -> L85
            goto L87
        L85:
            r2 = move-exception
            goto L8d
        L87:
            if (r4 == 0) goto L94
            r4.close()     // Catch: java.lang.Exception -> L85
            goto L94
        L8d:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1, r2)
        L94:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.b0.b():iz4.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(iz4.r r7) {
        /*
            r6 = this;
            r6.f414761a = r7
            java.lang.String r0 = "toByteArray close exception:%s"
            java.lang.String r1 = "WNNoteKeepTopManager"
            r2 = 0
            if (r7 != 0) goto Lb
            goto L5d
        Lb:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r4.writeObject(r7)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> La0
            r4.flush()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> La0
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> La0
            r4.close()     // Catch: java.lang.Exception -> L26
            r3.close()     // Catch: java.lang.Exception -> L26
            goto L5d
        L26:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r7)
            goto L5d
        L2f:
            r7 = move-exception
            goto L3e
        L31:
            r7 = move-exception
            goto La2
        L34:
            r7 = move-exception
            r4 = r2
            goto L3e
        L37:
            r7 = move-exception
            r3 = r2
            goto La2
        L3b:
            r7 = move-exception
            r3 = r2
            r4 = r3
        L3e:
            java.lang.String r5 = "toByteArray exception:%s"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> La0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r5, r7)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L50
            r4.close()     // Catch: java.lang.Exception -> L4e
            goto L50
        L4e:
            r7 = move-exception
            goto L56
        L50:
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Exception -> L4e
            goto L5d
        L56:
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r7)
        L5d:
            java.lang.String r7 = ""
            if (r2 == 0) goto L69
            int r0 = r2.length
            if (r0 <= 0) goto L69
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(r2)
            goto L6a
        L69:
            r0 = r7
        L6a:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            iz4.r r3 = r6.f414761a
            if (r3 == 0) goto L76
            java.lang.String r3 = r3.a()
            goto L79
        L76:
            java.lang.String r3 = "null"
        L79:
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "setCurrentTopItem item: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r2)
            java.lang.String r2 = "setCurrentTopItem itemStr: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r3)
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.n3 r1 = r1.p()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WENOTE_KEEP_TOP_DATA_STRING_SYNC
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != 0) goto L9b
            goto L9c
        L9b:
            r7 = r0
        L9c:
            r1.x(r2, r7)
            return
        La0:
            r7 = move-exception
            r2 = r4
        La2:
            if (r2 == 0) goto Laa
            r2.close()     // Catch: java.lang.Exception -> La8
            goto Laa
        La8:
            r2 = move-exception
            goto Lb0
        Laa:
            if (r3 == 0) goto Lb7
            r3.close()     // Catch: java.lang.Exception -> La8
            goto Lb7
        Lb0:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r2)
        Lb7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.b0.d(iz4.r):void");
    }
}
