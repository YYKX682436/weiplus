package tb1;

/* loaded from: classes13.dex */
public class u implements tb1.m, ub1.f {

    /* renamed from: a, reason: collision with root package name */
    public ub1.g f498469a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f498470b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public int f498471c = 200;

    /* renamed from: d, reason: collision with root package name */
    public final float f498472d;

    /* renamed from: e, reason: collision with root package name */
    public int f498473e;

    /* renamed from: f, reason: collision with root package name */
    public int f498474f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f498475g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f498476h;

    /* renamed from: i, reason: collision with root package name */
    public int f498477i;

    /* renamed from: j, reason: collision with root package name */
    public int f498478j;

    /* renamed from: k, reason: collision with root package name */
    public int f498479k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498480l;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        this.f498480l = c12042x78b65610;
        this.f498472d = (c12042x78b65610.f161716u * 1.0f) / c12042x78b65610.f161717v;
        this.f498478j = c12042x78b65610.f161712q ? 1 : 0;
    }

    @Override // tb1.m
    public void a(byte[] bArr, int i17, int i18) {
        android.graphics.Point point;
        ub1.g gVar;
        int i19 = this.f498473e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498480l;
        if (i19 != c12042x78b65610.f161716u || this.f498474f != c12042x78b65610.f161717v) {
            int rotation = c12042x78b65610.N.getDefaultDisplay().getRotation();
            int i27 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
            int m66777xa3f60eb9 = c12042x78b65610.F.m66777xa3f60eb9();
            if ("front".equals(c12042x78b65610.f161707m)) {
                int i28 = m66777xa3f60eb9 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                this.f498477i = i28;
                this.f498477i = (360 - i28) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            } else {
                this.f498477i = ((m66777xa3f60eb9 - i27) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            }
            if (c12042x78b65610.F != null) {
                this.f498473e = c12042x78b65610.f161716u;
                this.f498474f = c12042x78b65610.f161717v;
            }
            int i29 = this.f498477i;
            android.graphics.Rect rect = null;
            if (i17 <= 0 || i18 <= 0) {
                point = null;
            } else {
                float f17 = this.f498472d;
                if (i29 == 90 || i29 == 270) {
                    f17 = 1.0f / f17;
                }
                boolean z17 = ((float) i18) * f17 < ((float) i17);
                float f18 = 1.0f / f17;
                if (z17) {
                    int min = java.lang.Math.min(i18, i17);
                    int i37 = (int) (min / f18);
                    point = (i29 == 90 || i29 == 270) ? new android.graphics.Point(min, i37) : new android.graphics.Point(i37, min);
                } else {
                    this.f498478j = 1;
                    int max = java.lang.Math.max(i18, i17);
                    int i38 = (int) (max * f18);
                    point = (i29 == 90 || i29 == 270) ? new android.graphics.Point(i38, max) : new android.graphics.Point(max, i38);
                }
            }
            this.f498475g = point;
            if (point != null) {
                android.graphics.Rect rect2 = c12042x78b65610.f161720y;
                int i39 = c12042x78b65610.f161716u;
                int i47 = point.x;
                if (rect2 != null) {
                    float f19 = (i39 * 1.0f) / i47;
                    rect = new android.graphics.Rect(java.lang.Math.round(rect2.left / f19), java.lang.Math.round(rect2.top / f19), java.lang.Math.round(rect2.right / f19), java.lang.Math.round(rect2.bottom / f19));
                }
                this.f498476h = rect;
            }
        }
        if (this.f498470b.get() || (gVar = this.f498469a) == null || c12042x78b65610.F == null) {
            return;
        }
        int i48 = c12042x78b65610.f161716u;
        int i49 = c12042x78b65610.f161717v;
        android.graphics.Point point2 = this.f498475g;
        android.graphics.Rect rect3 = this.f498476h;
        int i57 = this.f498477i;
        int i58 = this.f498478j;
        gVar.getClass();
        ub1.a aVar = ((ub1.h) gVar).f507570b;
        if (bArr == null) {
            aVar.getClass();
        } else {
            aVar.f507550c.m77784x795fa299(new ub1.c(aVar, bArr, i57, i17, i18, i48, i49, point2, rect3, i58));
        }
    }

    @Override // tb1.m
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, safeStopRecord err");
    }

    @Override // tb1.m
    public void c(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, startRecord err");
    }

    @Override // tb1.m
    public void d(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, takePicture err");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: all -> 0x0103, TryCatch #1 {, blocks: (B:7:0x002c, B:9:0x0030, B:10:0x0038, B:18:0x003b, B:20:0x0047, B:22:0x0069, B:24:0x0070, B:26:0x0096, B:29:0x00b0, B:30:0x00cb, B:33:0x00cd, B:34:0x00d6, B:43:0x00ea, B:47:0x0102, B:36:0x00d7, B:38:0x00db, B:40:0x00df, B:41:0x00e4, B:42:0x00e9), top: B:6:0x002c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd A[Catch: all -> 0x0103, TryCatch #1 {, blocks: (B:7:0x002c, B:9:0x0030, B:10:0x0038, B:18:0x003b, B:20:0x0047, B:22:0x0069, B:24:0x0070, B:26:0x0096, B:29:0x00b0, B:30:0x00cb, B:33:0x00cd, B:34:0x00d6, B:43:0x00ea, B:47:0x0102, B:36:0x00d7, B:38:0x00db, B:40:0x00df, B:41:0x00e4, B:42:0x00e9), top: B:6:0x002c, inners: #0 }] */
    @Override // tb1.m
    /* renamed from: init */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo166109x316510() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb1.u.mo166109x316510():void");
    }

    @Override // tb1.m
    /* renamed from: release */
    public void mo166110x41012807() {
        ub1.g gVar = this.f498469a;
        if (gVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            ub1.a aVar = ((ub1.h) gVar).f507570b;
            kd0.d3 d3Var = aVar.f507543e;
            objArr[0] = d3Var != null ? java.lang.Integer.valueOf(d3Var.hashCode()) : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "release %s", objArr);
            synchronized (aVar.f507544f) {
                if (aVar.f507545g) {
                    kd0.d3 d3Var2 = aVar.f507543e;
                    if (d3Var2 != null) {
                        ((zs5.z) d3Var2).mo142436x41012807();
                    }
                    aVar.f507543e = null;
                    aVar.f507545g = false;
                }
            }
        }
        this.f498475g = null;
        this.f498479k = 0;
    }
}
