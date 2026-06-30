package db5;

/* loaded from: classes10.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f310040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f310041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f310042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f310043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f310044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f310045i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f310046m;

    public s8(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, float f17, long j17, float f18, float f19, float f27, float f28) {
        this.f310046m = c21524xecd57b9a;
        this.f310040d = f17;
        this.f310041e = j17;
        this.f310042f = f18;
        this.f310043g = f19;
        this.f310044h = f27;
        this.f310045i = f28;
    }

    @Override // java.lang.Runnable
    public void run() {
        float currentTimeMillis = (float) (java.lang.System.currentTimeMillis() - this.f310041e);
        float f17 = this.f310040d;
        float min = java.lang.Math.min(f17, currentTimeMillis);
        float f18 = this.f310042f + (this.f310043g * min);
        float f19 = this.f310044h;
        float f27 = this.f310045i;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f310046m;
        c21524xecd57b9a.a(f18, f19, f27);
        c21524xecd57b9a.h();
        if (min < f17) {
            c21524xecd57b9a.V.mo50293x3498a0(this);
        }
    }
}
