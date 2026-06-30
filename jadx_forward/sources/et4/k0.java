package et4;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 f338173d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105) {
        this.f338173d = dialogC19130xf6f7b105;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        et4.r0 r0Var = this.f338173d.f261761m;
        if (r0Var != null) {
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "verify canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = uVar.f338195a;
            dialogC19129x966bbd2f.Q = true;
            dialogC19129x966bbd2f.f261733d.setVisibility(0);
            dialogC19129x966bbd2f.E = null;
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 != null ? c19760x34448d56.f273642e : 0, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 24, "");
        }
    }
}
