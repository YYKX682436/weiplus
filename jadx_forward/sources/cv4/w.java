package cv4;

/* loaded from: classes7.dex */
public final class w implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f304129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cv4.x f304131c;

    public w(android.app.Activity activity, java.lang.String str, cv4.x xVar) {
        this.f304129a = activity;
        this.f304130b = str;
        this.f304131c = xVar;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : cv4.v.f304128a[h0Var.ordinal()];
        cv4.x xVar = this.f304131c;
        int i18 = 2;
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "requestPermission error: " + h0Var.f308734d);
                xVar.f224975e.b("requestPermission error");
                return;
            }
            i18 = 1;
        } else if (!z2.h.b(this.f304129a, this.f304130b)) {
            i18 = 6;
        }
        xVar.f224975e.e(kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED))));
    }
}
