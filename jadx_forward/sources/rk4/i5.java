package rk4;

/* loaded from: classes3.dex */
public final class i5 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.i1 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f478254e;

    /* renamed from: d, reason: collision with root package name */
    public static final rk4.i5 f478253d = new rk4.i5();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f478255f = true;

    @Override // jm4.i1
    public void Dd(long j17, yz5.a aVar) {
        rk4.k5.c("waitForPluginAttached: " + j17, "TingFlutterPluginHelperImpl");
        if (f478255f) {
            rk4.k5.c("waitForPluginAttached: attached", "TingFlutterPluginHelperImpl");
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        try {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new rk4.h5(j17, aVar, null), 3, null);
        } catch (p3325xe03a0797.p3326xc267989b.x3 unused) {
            rk4.k5.c("waitForPluginAttached: timeout", "TingFlutterPluginHelperImpl");
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    @Override // jm4.i1
    public void o2(boolean z17) {
        rk4.k5.c("setPluginAttached: " + z17, "TingFlutterPluginHelperImpl");
        f478255f = z17;
    }

    @Override // jm4.i1
    public boolean yd() {
        rk4.k5.c("getPluginAttached: " + f478255f, "TingFlutterPluginHelperImpl");
        return f478255f;
    }
}
