package b92;

/* loaded from: classes15.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f100099a;

    /* renamed from: b, reason: collision with root package name */
    public long f100100b;

    /* renamed from: c, reason: collision with root package name */
    public long f100101c;

    /* renamed from: d, reason: collision with root package name */
    public long f100102d;

    /* renamed from: e, reason: collision with root package name */
    public long f100103e;

    /* renamed from: f, reason: collision with root package name */
    public int f100104f;

    /* renamed from: g, reason: collision with root package name */
    public int f100105g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f100106h = new int[5];

    /* renamed from: i, reason: collision with root package name */
    public final int[] f100107i = new int[5];

    /* renamed from: j, reason: collision with root package name */
    public final long f100108j;

    public y1(int i17) {
        this.f100099a = i17;
        int i18 = 1000 / i17;
        this.f100108j = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / i17;
    }

    public final void a(int i17) {
        int[] iArr = this.f100107i;
        int[] iArr2 = this.f100106h;
        if (i17 >= 42) {
            iArr2[4] = iArr2[4] + 1;
            iArr[4] = iArr[4] + i17;
            return;
        }
        if (i17 >= 24) {
            iArr2[3] = iArr2[3] + 1;
            iArr[3] = iArr[3] + i17;
            return;
        }
        if (i17 >= 9) {
            iArr2[2] = iArr2[2] + 1;
            iArr[2] = iArr[2] + i17;
        } else {
            if (i17 >= 2) {
                iArr2[1] = iArr2[1] + 1;
                iArr[1] = iArr[1] + i17;
                return;
            }
            iArr2[0] = iArr2[0] + 1;
            int i18 = iArr[0];
            if (i17 < 0) {
                i17 = 0;
            }
            iArr[0] = i18 + i17;
        }
    }

    public final int b() {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f100102d - this.f100103e);
        int b17 = a06.d.b(millis > 0 ? (this.f100104f * 1000.0f) / ((float) millis) : 0.0f);
        int i17 = this.f100099a;
        return i17 > b17 ? b17 : i17;
    }
}
