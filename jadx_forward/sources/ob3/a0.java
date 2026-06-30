package ob3;

/* loaded from: classes9.dex */
public class a0 implements ob3.a, com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public ob3.c f425576d;

    /* renamed from: f, reason: collision with root package name */
    public r45.qr5 f425578f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f425579g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f425577e = null;

    /* renamed from: h, reason: collision with root package name */
    public final int f425580h = hashCode() & 65535;

    public final void a(android.content.Intent intent) {
        this.f425579g = false;
        java.lang.Object obj = this.f425576d;
        if (obj == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d abstractActivityC16322x2b9a639d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) obj;
        abstractActivityC16322x2b9a639d.setResult(0, intent);
        abstractActivityC16322x2b9a639d.finish();
    }

    public final void b(r45.pr5 pr5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl ");
        if (this.f425579g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl isRequesting");
        } else {
            this.f425579g = true;
            new lb3.f(pr5Var).a(new ob3.y(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() called with: requestCode = [" + i17 + "], resultCode = [" + i18 + "], data = [" + intent + "]");
        if (i17 == this.f425580h) {
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() REQUEST_CODE_WALLET called cancel ");
                a(new android.content.Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:pay fail"));
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) this.f425576d).T6(ob3.b.class, new android.content.Intent(), new ob3.z(this));
            }
        }
    }
}
