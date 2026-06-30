package sz3;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sz3.d0 f495524a = new sz3.d0();

    /* renamed from: b, reason: collision with root package name */
    public static int f495525b = e04.j2.a();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f495526c = bz3.h.a();

    /* renamed from: d, reason: collision with root package name */
    public static int f495527d;

    /* renamed from: e, reason: collision with root package name */
    public static int f495528e;

    /* renamed from: f, reason: collision with root package name */
    public static int f495529f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f495530g;

    /* renamed from: h, reason: collision with root package name */
    public static long f495531h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f495532i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f495533j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f495534k;

    /* renamed from: l, reason: collision with root package name */
    public static int f495535l;

    /* renamed from: m, reason: collision with root package name */
    public static tz3.c f495536m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile dz3.f f495537n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile dz3.f f495538o;

    public final void a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar, tz3.d dVar, boolean z17) {
        if (f495534k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage image is decoding");
            return;
        }
        dz3.f fVar = f495537n;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage sPendingImage is null");
            return;
        }
        dz3.f fVar2 = f495538o;
        boolean z18 = false;
        if (fVar2 != null && fVar.f326643a == fVar2.f326643a) {
            z18 = true;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage image id is same, do not decode");
            return;
        }
        f495534k = true;
        if (z17) {
            c(new sz3.z(yVar, dVar));
        } else {
            b(yVar, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y r10, tz3.d r11) {
        /*
            r9 = this;
            int r0 = r11.f504867e
            int r4 = et5.h.g(r0)
            dz3.f r0 = sz3.d0.f495537n
            r7 = 0
            java.lang.String r1 = "MicroMsg.ScanGoodsNoModelDetectManager"
            if (r0 != 0) goto L15
            java.lang.String r0 = "runDecodeTaskImpl sPendingImage is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
        L12:
            r8 = r7
            goto La6
        L15:
            boolean r0 = sz3.d0.f495530g
            if (r0 != 0) goto L1f
            java.lang.String r0 = "runDecodeTaskImpl ffe init fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            goto L12
        L1f:
            dz3.f r0 = sz3.d0.f495537n
            sz3.d0.f495538o = r0
            dz3.f r0 = sz3.d0.f495538o
            if (r0 != 0) goto L2d
            java.lang.String r0 = "runDecodeTaskImpl sDecodingImage is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
            goto L12
        L2d:
            int r0 = sz3.d0.f495528e
            r8 = 1
            int r0 = r0 + r8
            sz3.d0.f495528e = r0
            boolean r0 = sz3.d0.f495526c
            if (r0 == 0) goto L48
            if (r10 == 0) goto L48
            int r0 = r10.f298715f
            if (r0 <= 0) goto L48
            int r0 = sz3.d0.f495529f
            int r0 = r0 + r8
            sz3.d0.f495529f = r0
            java.lang.String r0 = "runDecodeTaskImpl filter code frame"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
            goto L12
        L48:
            int r0 = r11.f504864b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r11.f504865c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            dz3.f r3 = sz3.d0.f495538o
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            byte[] r3 = r3.f326644b
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r11.f504866d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r11.f504867e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3, r5, r6}
            java.lang.String r2 = "runDecodeTaskImpl resolution: (%s, %s), previewData length: %d, cameraRotation: %d, previewFormat: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            dz3.f r0 = sz3.d0.f495538o
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            byte[] r1 = r0.f326644b
            java.lang.String r0 = "imageData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            int r2 = r11.f504865c
            int r3 = r11.f504864b
            int r5 = r11.f504866d
            r6 = 0
            sz3.c1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.h(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L9f
            boolean r1 = r0.f495516j
            if (r1 == 0) goto L96
            r0.f495520n = r8
            r0.f495518l = r8
        L96:
            r1 = 3
            r0.f495507a = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f495508b = r1
        L9f:
            tz3.c r1 = sz3.d0.f495536m
            if (r1 == 0) goto La6
            r1.b(r0)
        La6:
            sz3.d0.f495534k = r7
            if (r8 == 0) goto Lad
            r9.a(r10, r11, r7)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.d0.b(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 e1Var) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e1Var);
        ((ku5.t0) u0Var).h(e1Var, "MicroMsg.ScanGoodsNoModelDetectManager");
    }
}
