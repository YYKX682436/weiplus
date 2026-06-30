package cf1;

/* loaded from: classes15.dex */
public final class f extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public final r9.e f40896g;

    /* renamed from: h, reason: collision with root package name */
    public final int f40897h;

    /* renamed from: i, reason: collision with root package name */
    public final float f40898i;

    /* renamed from: j, reason: collision with root package name */
    public final long f40899j;

    /* renamed from: k, reason: collision with root package name */
    public final long f40900k;

    /* renamed from: l, reason: collision with root package name */
    public int f40901l;

    /* renamed from: m, reason: collision with root package name */
    public int f40902m;

    /* renamed from: n, reason: collision with root package name */
    public volatile double f40903n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d9.k0 group, int[] tracks, r9.e bandwidthMeter, int i17, long j17, long j18, long j19, float f17) {
        super(group, java.util.Arrays.copyOf(tracks, tracks.length));
        kotlin.jvm.internal.o.g(group, "group");
        kotlin.jvm.internal.o.g(tracks, "tracks");
        kotlin.jvm.internal.o.g(bandwidthMeter, "bandwidthMeter");
        this.f40896g = bandwidthMeter;
        this.f40897h = i17;
        this.f40898i = f17;
        this.f40903n = -1.0d;
        this.f40899j = j17 * 1000;
        this.f40900k = j18 * 1000;
        cf1.a aVar = bandwidthMeter instanceof cf1.a ? (cf1.a) bandwidthMeter : null;
        if (aVar != null) {
            aVar.f40876g = -1L;
        }
        this.f40901l = g(-1L);
        this.f40902m = 1;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = this.f40901l;
        int g17 = g(elapsedRealtime);
        this.f40901l = g17;
        if (g17 != i17) {
            if (!f(i17, elapsedRealtime)) {
                com.google.android.exoplayer2.Format[] formatArr = this.f360850d;
                com.google.android.exoplayer2.Format format = formatArr[i17];
                int i18 = formatArr[this.f40901l].f44076e;
                int i19 = format.f44076e;
                if (i18 > i19) {
                    long j18 = this.f40899j;
                    if (j17 < j18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack < selectIndex = " + this.f40901l + ", bufferedDurationUs = " + j17 + ", min = " + j18);
                        this.f40901l = i17;
                    }
                }
                if (i18 < i19 && j17 >= this.f40900k) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack > selectIndex = " + this.f40901l + ", bufferedDurationUs = " + j17);
                    this.f40901l = i17;
                }
            }
            if (this.f40901l != i17) {
                this.f40902m = 3;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack selectIndex = " + this.f40901l);
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return this.f40902m;
    }

    public final int g(long j17) {
        long c17 = this.f40896g.c();
        double d17 = this.f40903n;
        long j18 = (java.lang.Double.isNaN(d17) || 0.0d >= d17) ? c17 == -1 ? this.f40897h : ((float) c17) * this.f40898i : (long) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] determineIdealSelectedIndex bitrateEstimate = " + c17 + ", effectiveBitrate = " + j18);
        int i17 = this.f360848b;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            if (j17 == -1 || !f(i19, j17)) {
                if (this.f360850d[i19].f44076e <= j18) {
                    return i19;
                }
                i18 = i19;
            }
        }
        return i18;
    }

    @Override // q9.m
    public int getSelectedIndex() {
        return this.f40901l;
    }
}
