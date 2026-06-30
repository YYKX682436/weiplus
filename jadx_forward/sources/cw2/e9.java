package cw2;

/* loaded from: classes2.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f305212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.ca f305214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f305215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f305216h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f305217i;

    public e9(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, cw2.ca caVar, long j18, int i17, int i18) {
        this.f305212d = j17;
        this.f305213e = c15196x85976f5f;
        this.f305214f = caVar;
        this.f305215g = j18;
        this.f305216h = i17;
        this.f305217i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f305212d > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305213e;
            if (c15196x85976f5f.U == -1.0f) {
                cw2.ca caVar = this.f305214f;
                if (caVar.getIsSeekBarTrackingTouch()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 newSeekBarLayout = c15196x85976f5f.getNewSeekBarLayout();
                    if (newSeekBarLayout != null && newSeekBarLayout.m61212xfef7dfbb()) {
                        cw2.ca caVar2 = this.f305214f;
                        long j17 = this.f305215g;
                        long j18 = this.f305212d;
                        caVar2.h((((float) j17) * 1.0f) / ((float) j18), j17, j18);
                        return;
                    }
                    return;
                }
                cw2.ca caVar3 = this.f305214f;
                long j19 = this.f305215g;
                long j27 = this.f305212d;
                caVar3.h((((float) j19) * 1.0f) / ((float) j27), j19, j27);
                int i17 = c15196x85976f5f.V;
                int i18 = this.f305216h;
                if (i17 != i18) {
                    int i19 = this.f305217i;
                    caVar.o((i18 * 1.0f) / i19, i18, i19);
                    c15196x85976f5f.V = i18;
                }
            }
        }
    }
}
