package nw4;

/* loaded from: classes8.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422409e;

    public l2(nw4.n nVar, java.lang.String str) {
        this.f422409e = nVar;
        this.f422408d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = "html"
            nw4.n r1 = r9.f422409e
            java.lang.String r0 = nw4.n.i(r1, r0)
            r1.getClass()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r3 = 1
            java.lang.String r4 = "MicroMsg.JsApiHandler"
            r5 = 0
            if (r2 != 0) goto L91
            java.lang.String r2 = r9.f422408d
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r6 == 0) goto L1f
            goto L91
        L1f:
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.p314xaae8f345.mm.vfs.z7.a(r0)
            r6.<init>(r7)
            boolean r7 = r6.m()
            java.lang.String r8 = ""
            if (r7 != 0) goto L44
            r6.k()     // Catch: java.io.IOException -> L34
            goto L44
        L34:
            r2 = move-exception
            java.lang.String r6 = "creating file failed, filePath is "
            java.lang.String r6 = r6.concat(r0)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r8, r6)
            goto L97
        L44:
            r7 = 0
            java.io.OutputStream r7 = com.p314xaae8f345.mm.vfs.w6.H(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r7.write(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2 = 13
            r7.write(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2 = 10
            r7.write(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r7.flush()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r7.close()     // Catch: java.io.IOException -> L61
            goto L67
        L61:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r8, r5)
        L67:
            r5 = r3
            goto L97
        L69:
            r0 = move-exception
            goto L84
        L6b:
            r2 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L69
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r8, r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "write to file error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r2)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L97
            r7.close()     // Catch: java.io.IOException -> L7d
            goto L97
        L7d:
            r2 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r8, r6)
            goto L97
        L84:
            if (r7 == 0) goto L90
            r7.close()     // Catch: java.io.IOException -> L8a
            goto L90
        L8a:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r8, r2)
        L90:
            throw r0
        L91:
            java.lang.String r2 = "write to file error, path is null or empty, or data is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r2)
        L97:
            if (r5 == 0) goto Lb9
            com.tencent.mm.plugin.webview.stub.v0 r2 = r1.f422432m
            if (r2 == 0) goto Lbe
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f422420a
            if (r1 == 0) goto Lbe
            java.lang.String r1 = r1.mo120156xb5887639()     // Catch: android.os.RemoteException -> La9
            r2.x7(r3, r1, r0)     // Catch: android.os.RemoteException -> La9
            goto Lbe
        La9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "uploadFileToCDN error "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r1, r0)
            goto Lbe
        Lb9:
            java.lang.String r0 = "failed to write Html file"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.l2.run():void");
    }
}
