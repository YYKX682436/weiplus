package cf1;

/* loaded from: classes15.dex */
public final class a implements r9.e, r9.k0 {

    /* renamed from: b, reason: collision with root package name */
    public int f40871b;

    /* renamed from: c, reason: collision with root package name */
    public long f40872c;

    /* renamed from: d, reason: collision with root package name */
    public long f40873d;

    /* renamed from: e, reason: collision with root package name */
    public long f40874e;

    /* renamed from: f, reason: collision with root package name */
    public long f40875f;

    /* renamed from: a, reason: collision with root package name */
    public final cf1.d f40870a = new cf1.d(2000);

    /* renamed from: g, reason: collision with root package name */
    public long f40876g = -1;

    @Override // r9.k0
    public synchronized void a(java.lang.Object source, int i17) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f40873d += i17;
    }

    @Override // r9.k0
    public synchronized void b(java.lang.Object source) {
        long j17;
        kotlin.jvm.internal.o.g(source, "source");
        t9.a.d(this.f40871b > 0);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f40872c);
        long j18 = i17;
        this.f40874e += j18;
        long j19 = this.f40875f;
        long j27 = this.f40873d;
        this.f40875f = j19 + j27;
        if (i17 > 0) {
            this.f40870a.a((int) java.lang.Math.sqrt(j27), (float) ((8000 * j27) / j18));
            if (this.f40874e >= 2000 || this.f40875f >= 524288) {
                java.util.ArrayList arrayList = this.f40870a.f40882b;
                int size = arrayList.size();
                float f17 = 0.0f;
                for (int i18 = 0; i18 < size; i18++) {
                    f17 += (((cf1.c) arrayList.get(i18)).f40879b / r12.f40886f) * ((cf1.c) arrayList.get(i18)).f40880c;
                }
                if (f17 == 0.0f) {
                    f17 = arrayList.isEmpty() ? -1.0f : ((cf1.c) arrayList.get(arrayList.size() - 1)).f40880c;
                }
                if (!java.lang.Float.isNaN(f17) && f17 >= 0.0f) {
                    j17 = f17;
                    this.f40876g = j17;
                }
                j17 = -1;
                this.f40876g = j17;
            }
        }
        int i19 = this.f40871b - 1;
        this.f40871b = i19;
        if (i19 > 0) {
            this.f40872c = elapsedRealtime;
        }
        this.f40873d = 0L;
    }

    @Override // r9.e
    public synchronized long c() {
        return this.f40876g;
    }

    @Override // r9.k0
    public synchronized void d(java.lang.Object source, r9.n dataSpec) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dataSpec, "dataSpec");
        if (this.f40871b == 0) {
            this.f40872c = android.os.SystemClock.elapsedRealtime();
        }
        this.f40871b++;
    }
}
