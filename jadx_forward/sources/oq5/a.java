package oq5;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oq5.b f428932d;

    public a(oq5.b bVar) {
        this.f428932d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[Catch: Exception -> 0x00a2, TryCatch #9 {Exception -> 0x00a2, blocks: (B:51:0x0095, B:44:0x009a, B:46:0x009f), top: B:50:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a2, blocks: (B:51:0x0095, B:44:0x009a, B:46:0x009f), top: B:50:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            oq5.b r0 = r8.f428932d
            java.lang.String r1 = "MicroMsg.CrashLogcatCatcher"
            java.lang.String r2 = "logcat -b all -t 100 --pid="
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            r5.append(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            java.lang.Process r2 = r4.exec(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L79
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
        L2d:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r3 == 0) goto L52
            java.lang.Boolean r6 = com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r6 != 0) goto L3e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
        L3e:
            java.util.List r6 = r0.f428934a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r7 = 100
            if (r6 >= r7) goto L2d
            java.util.List r6 = r0.f428934a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r6.add(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            goto L2d
        L52:
            java.lang.String r0 = "finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r2.destroy()     // Catch: java.lang.Exception -> L91
            r4.close()     // Catch: java.lang.Exception -> L91
        L5d:
            r5.close()     // Catch: java.lang.Exception -> L91
            goto L91
        L61:
            r0 = move-exception
            goto L6e
        L63:
            r0 = move-exception
            goto L73
        L65:
            r0 = move-exception
            r5 = r3
            goto L6e
        L68:
            r0 = move-exception
            r5 = r3
            goto L73
        L6b:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L6e:
            r3 = r2
            goto L93
        L70:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L73:
            r3 = r2
            goto L7c
        L75:
            r0 = move-exception
            r4 = r3
            r5 = r4
            goto L93
        L79:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L7c:
            java.lang.String r2 = ""
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L92
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r2, r6)     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L89
            r3.destroy()     // Catch: java.lang.Exception -> L91
        L89:
            if (r4 == 0) goto L8e
            r4.close()     // Catch: java.lang.Exception -> L91
        L8e:
            if (r5 == 0) goto L91
            goto L5d
        L91:
            return
        L92:
            r0 = move-exception
        L93:
            if (r3 == 0) goto L98
            r3.destroy()     // Catch: java.lang.Exception -> La2
        L98:
            if (r4 == 0) goto L9d
            r4.close()     // Catch: java.lang.Exception -> La2
        L9d:
            if (r5 == 0) goto La2
            r5.close()     // Catch: java.lang.Exception -> La2
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oq5.a.run():void");
    }
}
