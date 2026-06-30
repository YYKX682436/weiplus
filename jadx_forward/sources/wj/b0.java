package wj;

/* loaded from: classes12.dex */
public final class b0 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xj.l f527909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f527910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527913e;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, xj.l lVar, wj.j0 j0Var) {
        this.f527912d = str;
        this.f527913e = str2;
        this.f527911c = str3;
        this.f527909a = lVar;
        this.f527910b = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "handleAdOpen, launchAppByWeChat, launchSuccess: " + z17 + ", launchCancel: " + z18);
        java.lang.String str = this.f527912d;
        if (str.length() == 0) {
            str = "EMPTY";
        }
        java.lang.String concat = "scheme=".concat(str);
        java.lang.String str2 = this.f527911c;
        wj.j0 j0Var = this.f527910b;
        xj.l lVar = this.f527909a;
        if (z17) {
            fk.d.b(wj.q0.A, this.f527913e, this.f527911c, 0, concat, null, 32, null);
            if (lVar != null) {
                lVar.mo25338x6c3e7d2f();
            }
            j0Var.fj(str2, wj.p0.f528004o, null);
            return;
        }
        if (z18) {
            if (lVar != null) {
                lVar.mo25335x737e9bce();
            }
            j0Var.fj(str2, wj.p0.f528005p, null);
        } else {
            fk.d.b(wj.q0.A, this.f527913e, this.f527911c, 1, concat, null, 32, null);
            if (lVar != null) {
                lVar.mo25337x30578972();
            }
        }
    }
}
