package zs5;

/* loaded from: classes10.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f556987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556988e;

    public o0(com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab, java.lang.String str) {
        this.f556987d = c25309x51dbc9ab;
        this.f556988e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if ((r1.length() > 0) == true) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            com.tencent.qbar.ScanIdentifyReportInfo r0 = r12.f556987d
            java.lang.String r1 = r0.f296779h
            r2 = 0
            if (r1 == 0) goto L14
            int r3 = r1.length()
            r4 = 1
            if (r3 <= 0) goto L10
            r3 = r4
            goto L11
        L10:
            r3 = r2
        L11:
            if (r3 != r4) goto L14
            goto L15
        L14:
            r4 = r2
        L15:
            java.lang.String r3 = "MicroMsg.ScanIdentifyReportInfo"
            r5 = 0
            if (r4 == 0) goto L20
            r0 = -1
            byte[] r0 = f04.l.b(r1, r2, r0, r5)
            goto L61
        L20:
            android.graphics.Point r1 = r0.f296776e     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L25
            goto L60
        L25:
            byte[] r7 = r0.f296775d     // Catch: java.lang.Exception -> L53
            if (r7 != 0) goto L2a
            goto L60
        L2a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L53
            r0.<init>()     // Catch: java.lang.Exception -> L53
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch: java.lang.Exception -> L53
            int r6 = r1.x     // Catch: java.lang.Exception -> L53
            int r1 = r1.y     // Catch: java.lang.Exception -> L53
            r4.<init>(r2, r2, r6, r1)     // Catch: java.lang.Exception -> L53
            android.graphics.YuvImage r1 = new android.graphics.YuvImage     // Catch: java.lang.Exception -> L53
            r8 = 17
            int r9 = r4.width()     // Catch: java.lang.Exception -> L53
            int r10 = r4.height()     // Catch: java.lang.Exception -> L53
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L53
            r6 = 30
            r1.compressToJpeg(r4, r6, r0)     // Catch: java.lang.Exception -> L53
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> L53
            goto L61
        L53:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r1)
            java.lang.String r0 = "failed create preview jpeg data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
        L60:
            r0 = r5
        L61:
            java.lang.String r1 = r12.f556988e
            if (r1 == 0) goto L7b
            if (r0 != 0) goto L68
            goto L7b
        L68:
            com.tencent.mm.plugin.scanner.model.b0 r3 = new com.tencent.mm.plugin.scanner.model.b0
            com.tencent.mm.protobuf.g r4 = new com.tencent.mm.protobuf.g
            int r5 = r0.length
            r4.<init>(r0, r2, r5)
            r3.<init>(r1, r4)
            com.tencent.mm.modelbase.r1 r0 = gm0.j1.d()
            r0.g(r3)
            return
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "result: "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = ", img: "
            r2.append(r1)
            if (r0 == 0) goto L91
            int r0 = r0.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L91:
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.o0.run():void");
    }
}
