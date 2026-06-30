package et4;

/* loaded from: classes9.dex */
public class v implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338196a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f) {
        this.f338196a = dialogC19129x966bbd2f;
    }

    @Override // lz2.a
    /* renamed from: onAuthCancel */
    public void mo11325x21a77981() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338196a;
        dialogC19129x966bbd2f.Q = true;
        dialogC19129x966bbd2f.f261733d.setVisibility(0);
    }

    @Override // lz2.a
    /* renamed from: onAuthFail */
    public void mo11326xfa7237e5(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338196a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "face id auth fail: %s, %s", valueOf, java.lang.Integer.valueOf(dialogC19129x966bbd2f.L.D));
        dialogC19129x966bbd2f.Q = true;
        dialogC19129x966bbd2f.f261733d.setVisibility(0);
        dialogC19129x966bbd2f.F(true);
        dialogC19129x966bbd2f.f261745r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klu);
        dialogC19129x966bbd2f.f261745r.setVisibility(0);
        dialogC19129x966bbd2f.L.D++;
    }

    @Override // lz2.a
    /* renamed from: onAuthSuccess */
    public void mo11327x833155dc(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "face id auth success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338196a;
        if (dialogC19129x966bbd2f.Q) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
        c19760x34448d56.f273658x = 1;
        c19760x34448d56.A = "";
        c19760x34448d56.B = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            dialogC19129x966bbd2f.L.G = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcPayCashierDialog", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = dialogC19129x966bbd2f.L;
        c19760x34448d562.C = i17;
        c19760x34448d562.D = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.e(dialogC19129x966bbd2f, "", c19760x34448d562, dialogC19129x966bbd2f.N);
    }
}
