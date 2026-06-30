package db5;

/* loaded from: classes15.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f309841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f309842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f309843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f309844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f309845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f309846i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f309847m;

    public ca(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f, float f17, long j17, float f18, float f19, float f27, float f28) {
        this.f309847m = c21537x5f41189f;
        this.f309841d = f17;
        this.f309842e = j17;
        this.f309843f = f18;
        this.f309844g = f19;
        this.f309845h = f27;
        this.f309846i = f28;
    }

    @Override // java.lang.Runnable
    public void run() {
        float currentTimeMillis = (float) (java.lang.System.currentTimeMillis() - this.f309842e);
        float f17 = this.f309841d;
        float min = java.lang.Math.min(f17, currentTimeMillis);
        float f18 = this.f309843f + (this.f309844g * min);
        float f19 = this.f309845h;
        float f27 = this.f309846i;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.f309847m;
        c21537x5f41189f.a(f18, f19, f27);
        if (min < f17) {
            c21537x5f41189f.f279275p0.mo50293x3498a0(this);
        }
    }
}
