package t00;

/* loaded from: classes.dex */
public final class z0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.a1 f495913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f495914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495915f;

    public z0(t00.a1 a1Var, org.json.JSONObject jSONObject, c00.n3 n3Var) {
        this.f495913d = a1Var;
        this.f495914e = jSONObject;
        this.f495915f = n3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "requestCode: %d, resultCode: %d, intent data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        if (i17 != this.f495913d.f495796a) {
            return;
        }
        java.lang.String optString = this.f495914e.optString("from", "select");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "select");
        c00.n3 n3Var = this.f495915f;
        if (!b17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "manage")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "manage address result");
                n3Var.b(null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("OpenMyAddressEcsActionHandler", "unknown from: " + optString);
                n3Var.a();
                return;
            }
        }
        if (i18 != -1) {
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "select address result fail");
                n3Var.a();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "select address result canceled");
                n3Var.mo13720x3d6f0539();
                return;
            }
        }
        if (intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "select address result ok");
            n3Var.b(((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).wi(intent));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "select address result ok but data is null");
            n3Var.a();
        }
    }
}
