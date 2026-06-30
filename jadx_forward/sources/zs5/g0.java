package zs5;

/* loaded from: classes15.dex */
public class g0 {
    public static final zs5.g0 F = new zs5.g0();
    public static final zs5.g0 G = new zs5.g0();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f556907g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f556908h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f556909i;

    /* renamed from: j, reason: collision with root package name */
    public int f556910j;

    /* renamed from: k, reason: collision with root package name */
    public int f556911k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f556912l;

    /* renamed from: n, reason: collision with root package name */
    public int f556914n;

    /* renamed from: o, reason: collision with root package name */
    public int f556915o;

    /* renamed from: u, reason: collision with root package name */
    public boolean f556921u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f556922v;

    /* renamed from: w, reason: collision with root package name */
    public float f556923w;

    /* renamed from: x, reason: collision with root package name */
    public int f556924x;

    /* renamed from: y, reason: collision with root package name */
    public int f556925y;

    /* renamed from: a, reason: collision with root package name */
    public long f556901a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f556902b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f556903c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f556904d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f556905e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f556906f = null;

    /* renamed from: m, reason: collision with root package name */
    public int f556913m = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f556916p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f556917q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f556918r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public long f556919s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f556920t = false;

    /* renamed from: z, reason: collision with root package name */
    public int f556926z = 0;
    public int A = 0;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";
    public final java.lang.Object E = new java.lang.Object();

    public void a() {
        synchronized (this.E) {
            if (this.f556920t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarEngineReporter", "doReport, already report");
                return;
            }
            int e17 = e04.f2.e();
            boolean z17 = pt5.a.f439812n;
            boolean z18 = pt5.a.f439811m;
            java.lang.Object[] objArr = new java.lang.Object[27];
            objArr[0] = java.lang.Integer.valueOf(this.f556903c);
            objArr[1] = java.lang.Long.valueOf(this.f556901a);
            objArr[2] = java.lang.Long.valueOf(this.f556904d);
            objArr[3] = java.lang.Integer.valueOf(this.f556905e);
            objArr[4] = this.f556906f;
            objArr[5] = 0;
            objArr[6] = java.lang.Boolean.valueOf(this.f556902b);
            objArr[7] = this.f556907g;
            objArr[8] = this.f556908h;
            objArr[9] = this.f556909i;
            objArr[10] = java.lang.Integer.valueOf(this.f556910j);
            objArr[11] = java.lang.Integer.valueOf(this.f556911k);
            objArr[12] = this.f556912l;
            objArr[13] = java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f556908h) ? this.f556908h.length() : 0);
            objArr[14] = "0";
            objArr[15] = java.lang.Integer.valueOf(this.f556915o);
            objArr[16] = java.lang.Integer.valueOf(this.f556916p);
            objArr[17] = java.lang.Integer.valueOf(this.f556917q);
            objArr[18] = java.lang.Long.valueOf(this.f556919s);
            objArr[19] = java.lang.Float.valueOf(this.f556918r);
            objArr[20] = 0;
            objArr[21] = java.lang.Integer.valueOf(e17);
            objArr[22] = this.B;
            objArr[23] = this.C;
            objArr[24] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr[25] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr[26] = this.D;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d, tabType: %d,zoomCount: %s, zoomLastCostTime: %s, totalZoomFactor: %s, waitingFrame: %s, qbarBackend:%d, tabSession:%s, scanSession:%s, qBarOptDet:%s, qBarOptSr:%s, callSnapShot:%s", objArr);
            java.lang.String str = "";
            if (this.f556906f != null) {
                str = this.f556906f.x + "x" + this.f556906f.y;
            }
            boolean z19 = this.f556902b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[42];
            objArr2[0] = java.lang.Integer.valueOf(this.f556903c);
            objArr2[1] = java.lang.Long.valueOf(this.f556901a);
            objArr2[2] = java.lang.Long.valueOf(this.f556904d);
            objArr2[3] = java.lang.Integer.valueOf(this.f556905e);
            objArr2[4] = str;
            objArr2[5] = 0;
            objArr2[6] = java.lang.Integer.valueOf(this.f556902b ? 0 : 1);
            objArr2[7] = this.f556907g;
            objArr2[8] = "";
            objArr2[9] = this.f556909i;
            objArr2[10] = java.lang.Integer.valueOf(this.f556910j);
            objArr2[11] = java.lang.Integer.valueOf(this.f556911k);
            objArr2[12] = this.f556912l;
            objArr2[13] = java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f556908h) ? this.f556908h.length() : 0);
            objArr2[14] = "0";
            objArr2[15] = java.lang.Integer.valueOf(this.f556915o);
            objArr2[16] = java.lang.Integer.valueOf(this.f556921u ? 1 : 0);
            objArr2[17] = 0;
            objArr2[18] = "";
            objArr2[19] = java.lang.Integer.valueOf(this.f556913m);
            objArr2[20] = java.lang.Integer.valueOf(this.f556914n);
            objArr2[21] = 0;
            objArr2[22] = "";
            objArr2[23] = this.f556922v;
            objArr2[24] = java.lang.Integer.valueOf((int) (this.f556923w * 10.0f));
            objArr2[25] = java.lang.Integer.valueOf(this.f556924x);
            objArr2[26] = java.lang.Integer.valueOf(this.f556925y);
            objArr2[27] = java.lang.Integer.valueOf(this.f556926z);
            objArr2[28] = java.lang.Integer.valueOf(this.A);
            objArr2[29] = java.lang.Integer.valueOf(this.f556916p);
            objArr2[30] = java.lang.Integer.valueOf(this.f556913m);
            objArr2[31] = java.lang.Integer.valueOf(this.f556917q);
            objArr2[32] = java.lang.Long.valueOf(this.f556919s);
            objArr2[33] = java.lang.Integer.valueOf((int) (this.f556918r * 100.0f));
            objArr2[34] = 0;
            objArr2[35] = java.lang.Integer.valueOf(e17);
            objArr2[36] = this.B;
            objArr2[37] = this.C;
            objArr2[38] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr2[39] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr2[40] = this.D;
            objArr2[41] = 0L;
            g0Var.d(13233, objArr2);
            this.f556920t = true;
        }
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p2891x34da02.C25312x3165f541 c25312x3165f541, int i17, int i18, java.util.List list) {
        this.f556907g = str;
        this.f556908h = str2;
        this.f556909i = str3;
        this.f556913m = i17;
        this.f556914n = i18;
        if (c25312x3165f541 != null) {
            this.f556910j = c25312x3165f541.f45430x93fa756a;
            this.f556911k = c25312x3165f541.f45429x319c7afa;
            this.f556912l = c25312x3165f541.f45410xf58e0442;
            this.f556922v = c25312x3165f541.f45433x900d7908;
            this.f556923w = c25312x3165f541.f45414x46718bfc;
            this.f556924x = c25312x3165f541.f45420x8c07e410;
            this.f556925y = c25312x3165f541.f45435xcaab8dcc;
        }
        this.f556926z = 0;
        this.A = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p2891x34da02.C25312x3165f541 c25312x3165f5412 = (com.p314xaae8f345.p2891x34da02.C25312x3165f541) it.next();
                if (c25312x3165f5412.f45426x1e2bc0c2) {
                    this.f556926z++;
                } else if (c25312x3165f5412.f45425xd033a998) {
                    this.A++;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s, resultSize %d, isFilterResult %d,scaleList %s,decodeScale %f,detectTime %d,srTime %d, whiteListHit %d, blackListHit %d", str, str2, str3, java.lang.Integer.valueOf(this.f556910j), java.lang.Integer.valueOf(this.f556911k), this.f556912l, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f556922v, java.lang.Float.valueOf(this.f556923w), java.lang.Integer.valueOf(this.f556924x), java.lang.Integer.valueOf(this.f556925y), java.lang.Integer.valueOf(this.f556926z), java.lang.Integer.valueOf(this.A));
    }
}
