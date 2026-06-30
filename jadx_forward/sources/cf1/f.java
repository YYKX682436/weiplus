package cf1;

/* loaded from: classes15.dex */
public final class f extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public final r9.e f122429g;

    /* renamed from: h, reason: collision with root package name */
    public final int f122430h;

    /* renamed from: i, reason: collision with root package name */
    public final float f122431i;

    /* renamed from: j, reason: collision with root package name */
    public final long f122432j;

    /* renamed from: k, reason: collision with root package name */
    public final long f122433k;

    /* renamed from: l, reason: collision with root package name */
    public int f122434l;

    /* renamed from: m, reason: collision with root package name */
    public int f122435m;

    /* renamed from: n, reason: collision with root package name */
    public volatile double f122436n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d9.k0 group, int[] tracks, r9.e bandwidthMeter, int i17, long j17, long j18, long j19, float f17) {
        super(group, java.util.Arrays.copyOf(tracks, tracks.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracks, "tracks");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bandwidthMeter, "bandwidthMeter");
        this.f122429g = bandwidthMeter;
        this.f122430h = i17;
        this.f122431i = f17;
        this.f122436n = -1.0d;
        this.f122432j = j17 * 1000;
        this.f122433k = j18 * 1000;
        cf1.a aVar = bandwidthMeter instanceof cf1.a ? (cf1.a) bandwidthMeter : null;
        if (aVar != null) {
            aVar.f122409g = -1L;
        }
        this.f122434l = g(-1L);
        this.f122435m = 1;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = this.f122434l;
        int g17 = g(elapsedRealtime);
        this.f122434l = g17;
        if (g17 != i17) {
            if (!f(i17, elapsedRealtime)) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = this.f442383d;
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = c1601x7dc4e417Arr[i17];
                int i18 = c1601x7dc4e417Arr[this.f122434l].f125609e;
                int i19 = c1601x7dc4e417.f125609e;
                if (i18 > i19) {
                    long j18 = this.f122432j;
                    if (j17 < j18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack < selectIndex = " + this.f122434l + ", bufferedDurationUs = " + j17 + ", min = " + j18);
                        this.f122434l = i17;
                    }
                }
                if (i18 < i19 && j17 >= this.f122433k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack > selectIndex = " + this.f122434l + ", bufferedDurationUs = " + j17);
                    this.f122434l = i17;
                }
            }
            if (this.f122434l != i17) {
                this.f122435m = 3;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack selectIndex = " + this.f122434l);
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return this.f122435m;
    }

    public final int g(long j17) {
        long c17 = this.f122429g.c();
        double d17 = this.f122436n;
        long j18 = (java.lang.Double.isNaN(d17) || 0.0d >= d17) ? c17 == -1 ? this.f122430h : ((float) c17) * this.f122431i : (long) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] determineIdealSelectedIndex bitrateEstimate = " + c17 + ", effectiveBitrate = " + j18);
        int i17 = this.f442381b;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            if (j17 == -1 || !f(i19, j17)) {
                if (this.f442383d[i19].f125609e <= j18) {
                    return i19;
                }
                i18 = i19;
            }
        }
        return i18;
    }

    @Override // q9.m
    /* renamed from: getSelectedIndex */
    public int mo14753x12f86b41() {
        return this.f122434l;
    }
}
