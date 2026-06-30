package ei3;

/* loaded from: classes10.dex */
public class y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f334727d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334728e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f334729f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f334730g;

    /* renamed from: h, reason: collision with root package name */
    public final int f334731h;

    /* renamed from: a, reason: collision with root package name */
    public int f334724a = -1;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f334725b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f334726c = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f334732i = -1;

    public y0(boolean z17, int i17, int i18, int i19, boolean z18) {
        this.f334731h = -1;
        this.f334729f = z17;
        this.f334731h = i17;
        this.f334727d = i18;
        this.f334728e = i19;
        this.f334730g = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public long a() {
        if (0 != this.f334726c) {
            return java.lang.System.currentTimeMillis() - this.f334726c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
        return 0L;
    }

    public void b() {
        synchronized (ei3.y0.class) {
            this.f334725b = 0;
        }
        this.f334726c = 0L;
    }

    public void c(byte[] bArr, int i17, int i18, int i19) {
        boolean z17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f334724a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightX264YUVRecorder", "write data error, yuv buffer id error");
            return;
        }
        synchronized (ei3.y0.class) {
            this.f334725b++;
        }
        int i27 = this.f334731h;
        boolean z19 = this.f334729f;
        if (z19) {
            int i28 = this.f334732i;
            if (i28 != -1) {
                i27 = i28;
            }
            z17 = z19;
        } else {
            int i29 = this.f334732i;
            if (i29 == -1 || i29 == i27) {
                z17 = false;
            } else {
                i27 = java.lang.Math.max(0, i27 <= 180 ? i29 - i27 : i29 + (360 - i27));
                z17 = true;
                if (i27 >= 360) {
                    i27 = 0;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69241xeb56bb22(this.f334724a, i27);
        int i37 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? this.f334728e : this.f334727d;
        int i38 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? this.f334727d : this.f334728e;
        int i39 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? i19 : i18;
        int i47 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? i18 : i19;
        boolean z27 = (i39 == i37 && i47 == i38) ? false : true;
        if (this.f334730g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69208x53f0f18e(bArr, i39, i47, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69264x816aaf99(this.f334724a, bArr, i17, i37, i38, z17, z27, i39, i47);
        android.os.SystemClock.elapsedRealtime();
    }
}
