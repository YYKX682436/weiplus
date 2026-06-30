package et4;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.i f338136d;

    public b(et4.i iVar) {
        this.f338136d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        et4.h hVar = this.f338136d.f338164v;
        if (hVar != null) {
            et4.w wVar = (et4.w) hVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "on bankcard dialog cancel");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = wVar.f338199c;
            ((java.util.ArrayList) dialogC19129x966bbd2f.f261752x0).remove(dialogC19129x966bbd2f.F.f338165w);
            dialogC19129x966bbd2f.F = null;
            if (wVar.f338198b) {
                dialogC19129x966bbd2f.show();
            } else {
                dialogC19129x966bbd2f.show();
            }
        }
    }
}
