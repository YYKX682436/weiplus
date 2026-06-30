package et4;

/* loaded from: classes9.dex */
public class l0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 f338175d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105) {
        this.f338175d = dialogC19130xf6f7b105;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "dialog dismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105 = this.f338175d;
        et4.q0 q0Var = dialogC19130xf6f7b105.f261760i;
        if (q0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
            q0Var.f338188c.mo150320xae7a2e7a();
            ju5.n.c().b();
            q0Var.f338188c = null;
            dialogC19130xf6f7b105.f261760i = null;
        }
        dialogC19130xf6f7b105.f261761m = null;
    }
}
