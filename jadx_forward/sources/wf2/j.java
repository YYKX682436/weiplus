package wf2;

/* loaded from: classes10.dex */
public final class j extends if2.b implements if2.e {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String f527116v;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f527117m;

    /* renamed from: n, reason: collision with root package name */
    public wf2.a f527118n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f527119o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f527120p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f527121q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f527122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f527123s;

    /* renamed from: t, reason: collision with root package name */
    public long f527124t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f527125u;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.getClass();
        f527116v = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f527118n = wf2.a.f527086d;
        this.f527125u = jz5.h.b(new wf2.i(this));
    }

    public static final android.graphics.Bitmap Z6(wf2.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = jVar.f372632e;
        android.graphics.Bitmap bitmap = null;
        if (ubVar != null && (naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8 r8Var = naVar.f195137q;
            r8Var.a().f().setDrawingCacheEnabled(true);
            r8Var.a().f().buildDrawingCache();
            android.graphics.Bitmap drawingCache = r8Var.a().f().getDrawingCache();
            if (drawingCache != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(drawingCache);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBattleInfoPlugin", "getFrameShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0));
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBattleInfoPlugin", "getFrameShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            }
            r8Var.a().f().setDrawingCacheEnabled(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#getPkFrame b=" + bitmap);
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(wf2.j r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof wf2.f
            if (r0 == 0) goto L16
            r0 = r6
            wf2.f r0 = (wf2.f) r0
            int r1 = r0.f527110f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f527110f = r1
            goto L1b
        L16:
            wf2.f r0 = new wf2.f
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f527108d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f527110f
            java.lang.String r3 = "FinderLiveScreenShotEventSubscribeController"
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r5.f7()
            r2 = 0
            if (r6 != 0) goto L45
            java.lang.String r5 = "#getStreamFrame has no enough memory heap"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r5)
            r1 = r2
            goto L79
        L45:
            com.tencent.mm.plugin.finder.live.view.ub r5 = r5.f372632e
            if (r5 == 0) goto L67
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ob0> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r5.mo57682x2a5e9229(r6)
            com.tencent.mm.plugin.finder.live.plugin.ob0 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) r5
            if (r5 == 0) goto L67
            r0.f527110f = r4
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.plugin.finder.live.plugin.fb0 r4 = new com.tencent.mm.plugin.finder.live.plugin.fb0
            r4.<init>(r5, r2)
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.l.g(r6, r4, r0)
            if (r6 != r1) goto L63
            goto L79
        L63:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r1 = r6
            goto L68
        L67:
            r1 = r2
        L68:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "#getStreamFrame b="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.j.a7(wf2.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#clearCachedFrames");
        g7(this.f527119o);
        g7(this.f527120p);
        g7(this.f527121q);
        this.f527119o = null;
        this.f527120p = null;
        this.f527121q = null;
    }

    public final void c7() {
        this.f527123s = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f527122r;
        if (!(r2Var != null)) {
            r2Var = null;
        }
        if (r2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#disableScreenShotListenerAndCleanResource cancel fetch frame job");
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            this.f527122r = null;
        }
        b7();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: all -> 0x00a2, Exception -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x00a6, all -> 0x00a2, blocks: (B:15:0x0059, B:19:0x0062, B:21:0x008e, B:24:0x0099), top: B:13:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[Catch: all -> 0x00a2, Exception -> 0x00a6, TRY_ENTER, TryCatch #6 {Exception -> 0x00a6, all -> 0x00a2, blocks: (B:15:0x0059, B:19:0x0062, B:21:0x008e, B:24:0x0099), top: B:13:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "#generateAndSavePosterSilently success, path="
            java.lang.String r1 = "#generateAndSavePosterSilently path="
            boolean r2 = r11 instanceof wf2.d
            if (r2 == 0) goto L17
            r2 = r11
            wf2.d r2 = (wf2.d) r2
            int r3 = r2.f527103g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f527103g = r3
            goto L1c
        L17:
            wf2.d r2 = new wf2.d
            r2.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r2.f527101e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f527103g
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.String r8 = "FinderLiveScreenShotEventSubscribeController"
            if (r4 == 0) goto L41
            if (r4 != r6) goto L39
            java.lang.Object r2 = r2.f527100d
            wf2.j r2 = (wf2.j) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            goto L55
        L33:
            r11 = move-exception
            goto Lbe
        L36:
            r11 = move-exception
            goto Lb0
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.String r11 = "#generateAndSavePosterSilently start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r11)
            r2.f527100d = r10     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r2.f527103g = r6     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.Object r11 = r10.e7(r2)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            if (r11 != r3) goto L54
            return r3
        L54:
            r2 = r10
        L55:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            if (r11 != 0) goto L62
            java.lang.String r0 = "#generateAndSavePosterSilently posterBitmap is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r2.g7(r11)
            return r7
        L62:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r3.<init>()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            java.lang.String r4 = wf2.j.f527116v     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r3.append(r4)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            java.lang.String r4 = "live_screenshot_poster.jpg"
            r3.append(r4)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r4.append(r3)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r1)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r4 = 100
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r11, r4, r1, r3, r5)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            if (r1 == 0) goto L99
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r2.g7(r11)
            return r3
        L99:
            java.lang.String r0 = "#generateAndSavePosterSilently save failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La6
            r2.g7(r11)
            return r7
        La2:
            r0 = move-exception
            r7 = r11
            r11 = r0
            goto Lbe
        La6:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto Lb1
        Lab:
            r11 = move-exception
            r2 = r10
            goto Lbe
        Lae:
            r11 = move-exception
            r2 = r10
        Lb0:
            r0 = r7
        Lb1:
            java.lang.String r1 = "#generateAndSavePosterSilently failed"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lbc
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r8, r11, r1, r3)     // Catch: java.lang.Throwable -> Lbc
            r2.g7(r0)
            return r7
        Lbc:
            r11 = move-exception
            r7 = r0
        Lbe:
            r2.g7(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.j.d7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8 A[Catch: Exception -> 0x0033, TryCatch #2 {Exception -> 0x0033, blocks: (B:11:0x002e, B:12:0x00c2, B:14:0x00c8, B:17:0x00ce, B:28:0x008f, B:31:0x009a, B:33:0x00ae), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #2 {Exception -> 0x0033, blocks: (B:11:0x002e, B:12:0x00c2, B:14:0x00c8, B:17:0x00ce, B:28:0x008f, B:31:0x009a, B:33:0x00ae), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #2 {Exception -> 0x0033, blocks: (B:11:0x002e, B:12:0x00c2, B:14:0x00c8, B:17:0x00ce, B:28:0x008f, B:31:0x009a, B:33:0x00ae), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.j.e7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f7() {
        /*
            r13 = this;
            java.lang.String r0 = "FinderLiveScreenShotEventSubscribeController"
            java.lang.String r1 = "#estimateScreenshotMemorySize size="
            java.lang.String r2 = "#estimateScreenshotMemorySize invalid size: "
            r3 = 0
            r4 = 0
            com.tencent.mm.plugin.finder.live.view.ub r6 = r13.f372632e     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L1c
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ob0> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r6.mo57682x2a5e9229(r7)     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.finder.live.plugin.ob0 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) r6     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L1c
            jz5.l r6 = r6.x1()     // Catch: java.lang.Exception -> L7b
            goto L1d
        L1c:
            r6 = 0
        L1d:
            if (r6 != 0) goto L25
            java.lang.String r1 = "#estimateScreenshotMemorySize frameSize is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Exception -> L7b
            goto L83
        L25:
            java.lang.Object r7 = r6.f384366d     // Catch: java.lang.Exception -> L7b
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Exception -> L7b
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L7b
            java.lang.Object r6 = r6.f384367e     // Catch: java.lang.Exception -> L7b
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Exception -> L7b
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L7b
            r8 = 120(0x78, float:1.68E-43)
            if (r7 <= 0) goto L65
            if (r6 > 0) goto L3c
            goto L65
        L3c:
            int r2 = r7 * r6
            long r9 = (long) r2     // Catch: java.lang.Exception -> L7b
            r11 = 4
            long r9 = r9 * r11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7b
            r2.<init>(r1)     // Catch: java.lang.Exception -> L7b
            r2.append(r7)     // Catch: java.lang.Exception -> L7b
            r2.append(r8)     // Catch: java.lang.Exception -> L7b
            r2.append(r6)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = ", streamFrame="
            r2.append(r1)     // Catch: java.lang.Exception -> L7b
            r2.append(r9)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = " bytes"
            r2.append(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L7b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L7b
            goto L84
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L7b
            r1.append(r7)     // Catch: java.lang.Exception -> L7b
            r1.append(r8)     // Catch: java.lang.Exception -> L7b
            r1.append(r6)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Exception -> L7b
            goto L83
        L7b:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r6 = "#estimateScreenshotMemorySize failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r6, r2)
        L83:
            r9 = r4
        L84:
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r2 = 1
            if (r1 > 0) goto L8f
            java.lang.String r1 = "#hasEnoughMemoryForScreenshot cannot estimate memory, assuming sufficient"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
            return r2
        L8f:
            ko0.o r1 = ko0.p.f391427a
            long r4 = r1.b()
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 < 0) goto L9a
            r3 = r2
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "#hasEnoughMemoryForScreenshot required="
            r1.<init>(r2)
            r2 = 1024(0x400, float:1.435E-42)
            long r6 = (long) r2
            long r9 = r9 / r6
            r1.append(r9)
            java.lang.String r2 = "KB, available="
            r1.append(r2)
            long r4 = r4 / r6
            r1.append(r4)
            java.lang.String r2 = "KB, hasEnough="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.j.f7():boolean");
    }

    public final void g7(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#recycleBitmapSafely recycled bitmap");
    }

    public final void h7() {
        ((m40.i0) i95.n0.c(m40.i0.class)).getClass();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni((qj5.q) ((jz5.n) this.f527125u).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "registerGlobalScreenShotContentProvider success");
        this.f527118n = wf2.a.f527087e;
    }

    public final boolean i7() {
        boolean z17;
        if (this.f372633f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "post generation not support, state is " + this.f372633f);
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && w0Var.X()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "post generation not support, is linking mic");
            return false;
        }
        if (!((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).d7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "post generation not support, not normal video room live");
            return false;
        }
        if2.z zVar = if2.z.f372686a;
        java.lang.Object obj = this.f372632e;
        switch (zVar.c(obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null).ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                z17 = false;
                break;
            case 3:
                z17 = true;
                break;
            default:
                throw new jz5.j();
        }
        if (z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "post generation not support, not visitor live mode");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#onViewMount");
        this.f527123s = false;
        h7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#registerLiveScreenShotEventListener Called");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f527117m;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        final android.content.Context context = pluginLayout.getContext();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a>(context) { // from class: com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController$registerLiveScreenShotEventListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                this.f39173x3fe91575 = 1609849418;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a c5694x221c525a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a event = c5694x221c525a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                long j17 = event.f136018g.f88488a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#MMFinderUIScreenShotEvent, timestamp=" + j17);
                wf2.j jVar = wf2.j.this;
                if (j17 == jVar.f527124t) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#MMFinderUIScreenShotEvent skip, duplicate screenshot timestamp=" + j17);
                } else {
                    jVar.f527124t = j17;
                    if (jVar.f527123s) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#MMFinderUIScreenShotEvent skip, shouldIgnoreScreenShot = true");
                    } else {
                        zl2.r4 r4Var = zl2.r4.f555483a;
                        gk2.e buContext = jVar.getStore().getLiveRoomData();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
                        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 134217728);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "[isDisableScreenShotSwitch] isDisable = " + z17 + ", flag = " + ((mm2.c1) buContext.a(mm2.c1.class)).Q1);
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#MMFinderUIScreenShotEvent isDisableScreenShotSwitch");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames start");
                            p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.f527122r;
                            if (r2Var != null) {
                                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                            }
                            jVar.b7();
                            jVar.f527122r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(jVar, null, null, new wf2.c(jVar, null), 3, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork");
                            if (jVar.i7()) {
                                int ordinal = jVar.f527118n.ordinal();
                                if (ordinal == 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork intent process by live, call entrance show");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(jVar, null, null, new wf2.b(jVar, null), 3, null);
                                } else if (ordinal == 1) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork intent process by global component, frames cached for later use");
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork not support post generation");
                            }
                        }
                    }
                }
                return true;
            }
        };
        this.f527117m = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d2.mo48813x58998cd();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#onViewUnmount");
        c7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "destroyGlobalScreenShotContentProvider success");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        this.f527118n = wf2.a.f527086d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f527117m;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f527117m = null;
    }

    @Override // if2.e
    /* renamed from: pause */
    public void mo124180x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#pause");
        c7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "destroyGlobalScreenShotContentProvider success");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        this.f527118n = wf2.a.f527086d;
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#resume");
        this.f527123s = false;
        h7();
    }
}
