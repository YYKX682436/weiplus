package et4;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 f338179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105) {
        super(false);
        this.f338179d = dialogC19130xf6f7b105;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "click switch payway");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105 = this.f338179d;
        dialogC19130xf6f7b105.dismiss();
        et4.r0 r0Var = dialogC19130xf6f7b105.f261761m;
        if (r0Var != null) {
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "switch pay way");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = uVar.f338195a;
            dialogC19129x966bbd2f.Q = true;
            dialogC19129x966bbd2f.f261733d.setVisibility(0);
            dialogC19129x966bbd2f.E = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.c(dialogC19129x966bbd2f);
        }
    }
}
