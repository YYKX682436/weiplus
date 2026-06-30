package et4;

/* loaded from: classes9.dex */
public class d0 extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338141e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f) {
        this.f338141e = dialogC19129x966bbd2f;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338141e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "click pay btn: %s", java.lang.Integer.valueOf(dialogC19129x966bbd2f.f261732J));
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 20, "");
        dialogC19129x966bbd2f.G();
        int i17 = dialogC19129x966bbd2f.f261732J;
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "wrong mode, switch pwd");
                dialogC19129x966bbd2f.F(true);
                return;
            }
            dialogC19129x966bbd2f.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "go to verify faceid");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15817, 3);
            dialogC19129x966bbd2f.Q = false;
            re4.n.b();
            mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("face_auth_scene", 1);
            ((mz2.j2) e1Var).wi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) dialogC19129x966bbd2f.H, new et4.v(dialogC19129x966bbd2f), bundle);
            dialogC19129x966bbd2f.f261733d.setVisibility(8);
            return;
        }
        dialogC19129x966bbd2f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "go to verify fingerprint");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105 = dialogC19129x966bbd2f.E;
        if (dialogC19130xf6f7b105 != null) {
            dialogC19130xf6f7b105.dismiss();
        }
        re4.n.b();
        dialogC19129x966bbd2f.Q = false;
        dialogC19129x966bbd2f.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105(dialogC19129x966bbd2f.getContext());
        java.lang.String str = dialogC19129x966bbd2f.L.f273659y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = dialogC19129x966bbd2f.M.f261206J;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b1052 = dialogC19129x966bbd2f.E;
        java.lang.String str2 = dialogC19129x966bbd2f.L.f273647m;
        dialogC19130xf6f7b1052.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "set view data: %s", str2);
        et4.q0 q0Var = dialogC19130xf6f7b1052.f261760i;
        q0Var.f338186a = str2;
        q0Var.f338187b = str;
        dialogC19129x966bbd2f.E.f261761m = new et4.u(dialogC19129x966bbd2f);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) dialogC19129x966bbd2f.H).mo273xed6858b4().a(dialogC19129x966bbd2f.E);
        dialogC19129x966bbd2f.E.show();
        dialogC19129x966bbd2f.f261733d.setVisibility(8);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(9, 1);
    }
}
