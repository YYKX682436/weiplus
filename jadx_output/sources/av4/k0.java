package av4;

/* loaded from: classes7.dex */
public final class k0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f14295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f14298d;

    public k0(android.app.Activity activity, java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f14295a = activity;
        this.f14296b = str;
        this.f14297c = kVar;
        this.f14298d = y2Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : av4.j0.f14293a[h0Var.ordinal()];
        int i18 = 2;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 3;
            } else {
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "requestPermission error: " + h0Var.f227201d);
                    return;
                }
                i18 = 1;
            }
        } else if (!z2.h.b(this.f14295a, this.f14296b)) {
            i18 = 6;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED)));
        nw4.g gVar = this.f14297c.f340863d;
        nw4.y2 y2Var = this.f14298d;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", k17);
    }
}
