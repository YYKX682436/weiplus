package cf1;

/* loaded from: classes15.dex */
public final class a implements r9.e, r9.k0 {

    /* renamed from: b, reason: collision with root package name */
    public int f122404b;

    /* renamed from: c, reason: collision with root package name */
    public long f122405c;

    /* renamed from: d, reason: collision with root package name */
    public long f122406d;

    /* renamed from: e, reason: collision with root package name */
    public long f122407e;

    /* renamed from: f, reason: collision with root package name */
    public long f122408f;

    /* renamed from: a, reason: collision with root package name */
    public final cf1.d f122403a = new cf1.d(2000);

    /* renamed from: g, reason: collision with root package name */
    public long f122409g = -1;

    @Override // r9.k0
    public synchronized void a(java.lang.Object source, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f122406d += i17;
    }

    @Override // r9.k0
    public synchronized void b(java.lang.Object source) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        t9.a.d(this.f122404b > 0);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f122405c);
        long j18 = i17;
        this.f122407e += j18;
        long j19 = this.f122408f;
        long j27 = this.f122406d;
        this.f122408f = j19 + j27;
        if (i17 > 0) {
            this.f122403a.a((int) java.lang.Math.sqrt(j27), (float) ((8000 * j27) / j18));
            if (this.f122407e >= 2000 || this.f122408f >= 524288) {
                java.util.ArrayList arrayList = this.f122403a.f122415b;
                int size = arrayList.size();
                float f17 = 0.0f;
                for (int i18 = 0; i18 < size; i18++) {
                    f17 += (((cf1.c) arrayList.get(i18)).f122412b / r12.f122419f) * ((cf1.c) arrayList.get(i18)).f122413c;
                }
                if (f17 == 0.0f) {
                    f17 = arrayList.isEmpty() ? -1.0f : ((cf1.c) arrayList.get(arrayList.size() - 1)).f122413c;
                }
                if (!java.lang.Float.isNaN(f17) && f17 >= 0.0f) {
                    j17 = f17;
                    this.f122409g = j17;
                }
                j17 = -1;
                this.f122409g = j17;
            }
        }
        int i19 = this.f122404b - 1;
        this.f122404b = i19;
        if (i19 > 0) {
            this.f122405c = elapsedRealtime;
        }
        this.f122406d = 0L;
    }

    @Override // r9.e
    public synchronized long c() {
        return this.f122409g;
    }

    @Override // r9.k0
    public synchronized void d(java.lang.Object source, r9.n dataSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSpec, "dataSpec");
        if (this.f122404b == 0) {
            this.f122405c = android.os.SystemClock.elapsedRealtime();
        }
        this.f122404b++;
    }
}
