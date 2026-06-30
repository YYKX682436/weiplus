package vl5;

/* loaded from: classes15.dex */
public abstract class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f519491d;

    /* renamed from: e, reason: collision with root package name */
    public final float f519492e;

    /* renamed from: f, reason: collision with root package name */
    public final float f519493f;

    /* renamed from: g, reason: collision with root package name */
    public final float f519494g;

    /* renamed from: h, reason: collision with root package name */
    public final float f519495h;

    /* renamed from: i, reason: collision with root package name */
    public final float f519496i;

    /* renamed from: m, reason: collision with root package name */
    public final float f519497m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f519498n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519499o;

    public t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395, float f17, int i17, vl5.e eVar) {
        this.f519499o = c22722xd3be5395;
        this.f519493f = f17;
        this.f519492e = i17;
        float f18 = 1.0f - f17;
        float f19 = 1.0f / ((f17 * 2.0f) * f18);
        this.f519497m = f19;
        this.f519494g = f19;
        this.f519495h = f17 / ((f17 - 1.0f) * 2.0f);
        this.f519496i = 1.0f / f18;
    }

    public abstract void a();

    public abstract void b(float f17, float f18);

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        if (this.f519498n) {
            return;
        }
        float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f519491d)) / this.f519492e;
        if (uptimeMillis >= 1.0f) {
            b(1.0f, 1.0f);
            a();
            return;
        }
        float f18 = this.f519493f;
        if (uptimeMillis < f18) {
            f17 = this.f519494g * uptimeMillis * uptimeMillis;
        } else if (uptimeMillis < 1.0f - f18) {
            f17 = (this.f519496i * uptimeMillis) + this.f519495h;
        } else {
            float f19 = uptimeMillis - 1.0f;
            f17 = 1.0f - ((this.f519497m * f19) * f19);
        }
        b(uptimeMillis, f17);
        this.f519499o.post(this);
    }
}
