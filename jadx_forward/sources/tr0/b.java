package tr0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public wo.h f502813a;

    /* renamed from: b, reason: collision with root package name */
    public android.hardware.Camera.Parameters f502814b;

    /* renamed from: c, reason: collision with root package name */
    public int f502815c;

    /* renamed from: d, reason: collision with root package name */
    public int f502816d;

    /* renamed from: e, reason: collision with root package name */
    public int f502817e;

    /* renamed from: f, reason: collision with root package name */
    public int f502818f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.Range f502819g;

    /* renamed from: h, reason: collision with root package name */
    public int f502820h;

    public final void a(int i17) {
        android.hardware.Camera.Parameters parameters = this.f502814b;
        if (parameters != null) {
            parameters.setExposureCompensation(i17);
        }
        try {
            wo.h hVar = this.f502813a;
            wo.d1 d1Var = hVar != null ? hVar.f529246a : null;
            if (d1Var != null) {
                d1Var.f(this.f502814b);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(this.f502820h);
            if (a17 != null) {
                a17.Z = 1;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera1ExpoHelper", "enLargeExpo is error " + i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = as0.a.f94958a.a(this.f502820h);
            if (a18 != null) {
                a18.Z = 2;
            }
        }
    }
}
