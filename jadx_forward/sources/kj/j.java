package kj;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public float f389757d;

    /* renamed from: e, reason: collision with root package name */
    public float f389758e;

    /* renamed from: f, reason: collision with root package name */
    public float f389759f;

    /* renamed from: g, reason: collision with root package name */
    public long f389760g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389761h;

    /* renamed from: j, reason: collision with root package name */
    public final jj.e f389763j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kj.m f389764k;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f389754a = new long[kj.i.m143533xcee59d22().length];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f389755b = new int[kj.h.m143530xcee59d22().length];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f389756c = new int[kj.h.m143530xcee59d22().length];

    /* renamed from: i, reason: collision with root package name */
    public int f389762i = 0;

    public j(kj.m mVar, jj.e eVar) {
        this.f389764k = mVar;
        this.f389763j = eVar;
    }

    public void a(java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        long[] jArr;
        java.lang.String str2 = this.f389761h;
        if (str2 != null && !str2.equals(str)) {
            b();
        }
        if (!(this.f389763j.b() && frameMetrics.getMetric(9) == 1) && f17 >= (f18 / 60.0f) * r3.d()) {
            if (this.f389762i == 0) {
                this.f389760g = android.os.SystemClock.uptimeMillis();
            }
            int i17 = 0;
            while (true) {
                jArr = this.f389754a;
                if (i17 > 8) {
                    break;
                }
                jArr[i17] = jArr[i17] + frameMetrics.getMetric(kj.i.f389752e[i17]);
                i17++;
            }
            if (kj.m.f389774w >= 31) {
                jArr[9] = jArr[9] + frameMetrics.getMetric(12);
            }
            this.f389757d += f17;
            int round = java.lang.Math.round(f17);
            long j17 = round;
            kj.m mVar = this.f389764k;
            long j18 = mVar.f389782n;
            int[] iArr = this.f389756c;
            int[] iArr2 = this.f389755b;
            if (j17 >= j18) {
                iArr2[4] = iArr2[4] + 1;
                iArr[4] = iArr[4] + round;
            } else if (j17 >= mVar.f389783o) {
                iArr2[3] = iArr2[3] + 1;
                iArr[3] = iArr[3] + round;
            } else if (j17 >= mVar.f389784p) {
                iArr2[2] = iArr2[2] + 1;
                iArr[2] = iArr[2] + round;
            } else if (j17 >= mVar.f389785q) {
                iArr2[1] = iArr2[1] + 1;
                iArr[1] = iArr[1] + round;
            } else {
                iArr2[0] = iArr2[0] + 1;
                iArr[0] = iArr[0] + java.lang.Math.max(round, 0);
            }
            this.f389758e += f18;
            this.f389759f += java.lang.Math.max((float) frameMetrics.getMetric(8), 1.0E9f / f18);
            this.f389762i++;
            this.f389761h = str;
            if (android.os.SystemClock.uptimeMillis() - this.f389760g >= r3.c()) {
                b();
            }
        }
    }

    public void b() {
        long[] jArr;
        int i17 = this.f389762i;
        if (i17 > 0) {
            this.f389757d /= i17;
            this.f389758e /= i17;
            this.f389759f /= i17;
            int i18 = 0;
            while (true) {
                jArr = this.f389754a;
                if (i18 >= jArr.length) {
                    break;
                }
                jArr[i18] = jArr[i18] / this.f389762i;
                i18++;
            }
            this.f389763j.a(this.f389761h, jArr, this.f389755b, this.f389756c, this.f389757d, this.f389758e, 1.0E9f / this.f389759f);
        }
        this.f389757d = 0.0f;
        this.f389758e = 0.0f;
        this.f389759f = 0.0f;
        this.f389762i = 0;
        java.util.Arrays.fill(this.f389754a, 0L);
        java.util.Arrays.fill(this.f389755b, 0);
        java.util.Arrays.fill(this.f389756c, 0);
    }
}
