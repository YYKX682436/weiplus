package em2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f336710a;

    /* renamed from: b, reason: collision with root package name */
    public int f336711b;

    /* renamed from: c, reason: collision with root package name */
    public int f336712c = 1;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f336713d;

    /* renamed from: e, reason: collision with root package name */
    public long f336714e;

    /* renamed from: f, reason: collision with root package name */
    public long f336715f;

    /* renamed from: g, reason: collision with root package name */
    public long f336716g;

    public final void a(boolean z17) {
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        c(z17);
        this.f336710a = 0L;
        this.f336714e = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "exit clickCloseBtn:" + z17);
    }

    public final void b() {
        int i17;
        int i18 = 1;
        boolean z17 = this.f336711b == 0;
        android.graphics.Point point = this.f336713d;
        if (point != null) {
            int i19 = point.x;
            int i27 = point.y;
            if (i19 != i27) {
                i17 = i19 > i27 ? 2 : 3;
            }
            i18 = i17;
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z17, 1, 0L, i18, this.f336712c, 0L);
    }

    public final void c(boolean z17) {
        if (this.f336710a <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "reportExit but lastEnterTime <= 0, lastEnterTime:" + this.f336710a);
            return;
        }
        int i17 = 1;
        boolean z18 = this.f336711b == 0;
        long c17 = c01.id.c() - this.f336710a;
        android.graphics.Point point = this.f336713d;
        if (point != null) {
            int i18 = point.x;
            int i19 = point.y;
            if (i18 == i19) {
                i17 = 3;
            } else if (i18 > i19) {
                i17 = 2;
            }
        }
        if (this.f336716g > 0) {
            this.f336715f += c01.id.c() - this.f336716g;
            this.f336716g = c01.id.c();
        }
        long j17 = c17 - this.f336715f;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z18, 2, c17, i17, this.f336712c, j17);
        if (z17) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z18, 3, c17, i17, this.f336712c, j17);
        }
    }
}
