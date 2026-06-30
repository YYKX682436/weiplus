package et4;

/* loaded from: classes9.dex */
public class y implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338201d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f) {
        this.f338201d = dialogC19129x966bbd2f;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "on dismissed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338201d;
        dialogC19129x966bbd2f.Z = true;
        java.util.Iterator it = ((java.util.ArrayList) dialogC19129x966bbd2f.f261752x0).iterator();
        while (it.hasNext()) {
            et4.a aVar = (et4.a) ((et4.h0) it.next());
            aVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierBankcardDialog", "cashier dialog has dismissed");
            aVar.f338134a.dismiss();
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(dialogC19129x966bbd2f.f261741o, dialogC19129x966bbd2f.f261751x);
    }
}
