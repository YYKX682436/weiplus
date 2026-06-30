package l4;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f397246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f397247b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f397248c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f397249d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f397250e;

    public g(int i17) {
        long[] jArr = new long[i17];
        this.f397246a = jArr;
        boolean[] zArr = new boolean[i17];
        this.f397247b = zArr;
        this.f397248c = new int[i17];
        java.util.Arrays.fill(jArr, 0L);
        java.util.Arrays.fill(zArr, false);
    }

    public int[] a() {
        synchronized (this) {
            if (this.f397249d && !this.f397250e) {
                int length = this.f397246a.length;
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    if (i17 >= length) {
                        this.f397250e = true;
                        this.f397249d = false;
                        return this.f397248c;
                    }
                    boolean z17 = this.f397246a[i17] > 0;
                    boolean[] zArr = this.f397247b;
                    if (z17 != zArr[i17]) {
                        int[] iArr = this.f397248c;
                        if (!z17) {
                            i18 = 2;
                        }
                        iArr[i17] = i18;
                    } else {
                        this.f397248c[i17] = 0;
                    }
                    zArr[i17] = z17;
                    i17++;
                }
            }
            return null;
        }
    }
}
