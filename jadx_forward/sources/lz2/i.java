package lz2;

/* loaded from: classes9.dex */
public class i extends lz2.n {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f403871f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d, boolean z17) {
        super(activityC15521xdb435b6d);
        this.f403871f = false;
        this.f403871f = z17;
        re4.n.f476076a = 0;
    }

    @Override // lz2.n
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        activityC15521xdb435b6d.m83137x918cb44a();
        this.f403877b.a(activityC15521xdb435b6d, new lz2.g(this), this.f403880e);
    }

    @Override // lz2.n
    public int c() {
        return 1;
    }

    @Override // lz2.n
    public boolean d() {
        return true;
    }

    @Override // lz2.n
    public void e() {
    }

    @Override // lz2.n
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        activityC15521xdb435b6d.getWindow().setDimAmount(0.0f);
        super.f();
        activityC15521xdb435b6d.m78531x8f8cf1fb();
        activityC15521xdb435b6d.mo78530x8b45058f();
        activityC15521xdb435b6d.mo67598xf0aced2e(8);
    }

    @Override // lz2.n
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        this.f403879d.finish();
    }

    @Override // lz2.n
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        this.f403879d.finish();
    }

    @Override // lz2.n
    public boolean i(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f403877b.mo148635x76e0bfae(i17, i18, str, m1Var)) {
            return true;
        }
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        activityC15521xdb435b6d.m83114xe5d7a18f();
        if (!this.f403871f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "use old successpage");
            com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d2 = this.f403879d;
            db5.e1.E(activityC15521xdb435b6d2, activityC15521xdb435b6d2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8x), activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8w), activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kuq), false, new lz2.h(this));
        } else if (activityC15521xdb435b6d.f218517g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFaceIdPaySuccess");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
                activityC15521xdb435b6d.f218518h = "";
                activityC15521xdb435b6d.finish();
            } catch (org.json.JSONException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return true;
    }
}
