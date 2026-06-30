package av4;

/* loaded from: classes7.dex */
public final class k0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f95828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f95831d;

    public k0(android.app.Activity activity, java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f95828a = activity;
        this.f95829b = str;
        this.f95830c = kVar;
        this.f95831d = y2Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : av4.j0.f95826a[h0Var.ordinal()];
        int i18 = 2;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 3;
            } else {
                if (i17 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "requestPermission error: " + h0Var.f308734d);
                    return;
                }
                i18 = 1;
            }
        } else if (!z2.h.b(this.f95828a, this.f95829b)) {
            i18 = 6;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED)));
        nw4.g gVar = this.f95830c.f422396d;
        nw4.y2 y2Var = this.f95831d;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", k17);
    }
}
