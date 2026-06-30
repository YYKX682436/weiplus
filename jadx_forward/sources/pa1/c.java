package pa1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f434486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pa1.e f434488f;

    public c(pa1.e eVar, int i17, java.lang.String str) {
        this.f434488f = eVar;
        this.f434486d = i17;
        this.f434487e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4 != 3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0014, B:10:0x0018, B:13:0x001e, B:15:0x0026, B:17:0x002a, B:19:0x002e, B:29:0x0054, B:31:0x005a, B:33:0x005e, B:35:0x006a, B:37:0x00ab, B:39:0x00b1, B:41:0x0075, B:42:0x0088, B:44:0x0092, B:45:0x00a3, B:49:0x00b7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0014, B:10:0x0018, B:13:0x001e, B:15:0x0026, B:17:0x002a, B:19:0x002e, B:29:0x0054, B:31:0x005a, B:33:0x005e, B:35:0x006a, B:37:0x00ab, B:39:0x00b1, B:41:0x0075, B:42:0x0088, B:44:0x0092, B:45:0x00a3, B:49:0x00b7), top: B:2:0x0005 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.WAGameCanvasSecurityGuard"
            pa1.e r1 = r8.f434488f
            r2 = 0
            boolean r3 = r1.d()     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L14
            java.lang.String r1 = "hy: game extension is null. stop"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            goto Lbd
        L14:
            r45.vd7 r3 = r1.f434489a     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto Lb7
            boolean r3 = r3.f469671d     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L1e
            goto Lb7
        L1e:
            java.lang.ref.WeakReference r3 = r1.f434490b     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L51
            r45.vd7 r4 = r1.f434489a     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L51
            int r5 = r4.f469674g     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L51
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L11
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) r3     // Catch: java.lang.Throwable -> L11
            android.app.Activity r3 = r3.r0()     // Catch: java.lang.Throwable -> L11
            int r3 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(r3)     // Catch: java.lang.Throwable -> L11
            int r4 = r4.f469674g     // Catch: java.lang.Throwable -> L11
            r5 = 3
            r6 = 1
            if (r4 == r6) goto L44
            if (r4 != r5) goto L47
        L44:
            if (r3 != 0) goto L47
            goto L52
        L47:
            r7 = 2
            if (r4 == r7) goto L4c
            if (r4 != r5) goto L51
        L4c:
            r4 = 10
            if (r3 != r4) goto L51
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 != 0) goto L5a
            java.lang.String r1 = "hy: network not match!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L11
            return
        L5a:
            int r3 = r8.f434486d     // Catch: java.lang.Throwable -> L11
            if (r3 > 0) goto L88
            ce.g r3 = r1.c()     // Catch: java.lang.Throwable -> L11
            ce.o r3 = (ce.o) r3     // Catch: java.lang.Throwable -> L11
            android.graphics.Bitmap r3 = r3.R()     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L75
            ce.g r3 = r1.c()     // Catch: java.lang.Throwable -> L11
            ce.o r3 = (ce.o) r3     // Catch: java.lang.Throwable -> L11
            android.graphics.Bitmap r3 = r3.R()     // Catch: java.lang.Throwable -> L11
            goto La9
        L75:
            ce.g r3 = r1.c()     // Catch: java.lang.Throwable -> L11
            ce.o r3 = (ce.o) r3     // Catch: java.lang.Throwable -> L11
            com.tencent.magicbrush.ui.MagicBrushView r3 = r3.f122219g     // Catch: java.lang.Throwable -> L11
            com.tencent.magicbrush.MagicBrush r3 = r3.m34856x4a42b983()     // Catch: java.lang.Throwable -> L11
            yg.b r3 = r3.f130124o     // Catch: java.lang.Throwable -> L11
            android.graphics.Bitmap r3 = r3.d()     // Catch: java.lang.Throwable -> L11
            goto La9
        L88:
            com.tencent.mm.plugin.appbrand.page.n7 r3 = r1.b()     // Catch: java.lang.Throwable -> L11
            of1.w1 r3 = r3.s3()     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto La3
            com.tencent.mm.plugin.appbrand.page.n7 r3 = r1.b()     // Catch: java.lang.Throwable -> L11
            of1.w1 r3 = r3.s3()     // Catch: java.lang.Throwable -> L11
            com.tencent.mm.ui.widget.MMWebView r3 = r3.mo51534x86b9ebe3()     // Catch: java.lang.Throwable -> L11
            android.graphics.Bitmap r3 = r3.m120139x12501425()     // Catch: java.lang.Throwable -> L11
            goto La9
        La3:
            java.lang.String r3 = "hy: current html webview is null!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L11
            r3 = 0
        La9:
            if (r3 == 0) goto Lb1
            java.lang.String r4 = r8.f434487e     // Catch: java.lang.Throwable -> L11
            pa1.e.a(r1, r4, r3)     // Catch: java.lang.Throwable -> L11
            goto Lc4
        Lb1:
            java.lang.String r1 = "hy: current screen capture is null!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L11
            goto Lc4
        Lb7:
            java.lang.String r1 = "hy: no server config or should not do sample!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L11
            return
        Lbd:
            java.lang.String r3 = "hy: exception when trigger event"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r3, r2)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa1.c.run():void");
    }
}
