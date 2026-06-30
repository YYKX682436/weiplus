package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static volatile android.content.Context f68468a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.lang.String f68469b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.ipcinvoker.h f68470c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile kk0.c f68471d;

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
    
        if (r5 == null) goto L52;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:68:0x00b7 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = com.tencent.mm.ipcinvoker.y.f68469b
            if (r0 == 0) goto Lc
            java.lang.String r0 = com.tencent.mm.ipcinvoker.y.f68469b
            int r0 = r0.length()
            if (r0 != 0) goto Lb3
        Lc:
            android.content.Context r0 = com.tencent.mm.ipcinvoker.y.f68468a
            int r1 = android.os.Process.myPid()
            r2 = 0
            if (r0 != 0) goto L17
            goto Lb1
        L17:
            int r3 = android.os.Process.myPid()
            if (r3 != r1) goto L29
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L29
            java.lang.String r2 = android.app.Application.getProcessName()
            goto Lb1
        L29:
            java.lang.String r3 = "activity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L58
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L58
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L58
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            if (r3 == 0) goto L43
            int r4 = r3.pid
            if (r4 != r1) goto L43
            java.lang.String r2 = r3.processName
            goto Lb1
        L58:
            r0 = 128(0x80, float:1.8E-43)
            byte[] r3 = new byte[r0]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r6.<init>()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r7 = "/proc/"
            r6.append(r7)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r6.append(r1)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r1 = "/cmdline"
            r6.append(r1)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r1 = r5.read(r3)     // Catch: java.lang.Exception -> L96 java.lang.Throwable -> Lb6
            if (r1 <= 0) goto Lae
            r6 = r4
        L7f:
            if (r6 >= r1) goto L8c
            r7 = r3[r6]     // Catch: java.lang.Exception -> L96 java.lang.Throwable -> Lb6
            if (r7 > r0) goto L8b
            if (r7 > 0) goto L88
            goto L8b
        L88:
            int r6 = r6 + 1
            goto L7f
        L8b:
            r1 = r6
        L8c:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L96 java.lang.Throwable -> Lb6
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Exception -> L96 java.lang.Throwable -> Lb6
            r5.close()     // Catch: java.lang.Exception -> L94
        L94:
            r2 = r0
            goto Lb1
        L96:
            r0 = move-exception
            goto L9c
        L98:
            r0 = move-exception
            goto Lb8
        L9a:
            r0 = move-exception
            r5 = r2
        L9c:
            java.lang.String r1 = "IPC.IPCInvokeLogic"
            java.lang.String r3 = "get running process error : %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Throwable -> Lb6
            r6[r4] = r0     // Catch: java.lang.Throwable -> Lb6
            rk0.c.b(r1, r3, r6)     // Catch: java.lang.Throwable -> Lb6
            if (r5 == 0) goto Lb1
        Lae:
            r5.close()     // Catch: java.lang.Exception -> Lb1
        Lb1:
            com.tencent.mm.ipcinvoker.y.f68469b = r2
        Lb3:
            java.lang.String r0 = com.tencent.mm.ipcinvoker.y.f68469b
            return r0
        Lb6:
            r0 = move-exception
            r2 = r5
        Lb8:
            if (r2 == 0) goto Lbd
            r2.close()     // Catch: java.lang.Exception -> Lbd
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ipcinvoker.y.a():java.lang.String");
    }

    public static boolean b(java.lang.String str) {
        return str != null && str.equals(a());
    }
}
