package et4;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.i f338148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(et4.i iVar) {
        super(false);
        this.f338148d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        et4.i iVar = this.f338148d;
        iVar.dismiss();
        et4.h hVar = iVar.f338164v;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "on click add new bankcard");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = ((et4.w) hVar).f338199c;
            ((java.util.ArrayList) dialogC19129x966bbd2f.f261752x0).remove(dialogC19129x966bbd2f.F.f338165w);
            dialogC19129x966bbd2f.F = null;
            et4.g0 g0Var = dialogC19129x966bbd2f.f261743p0;
            if (g0Var != null) {
                g0Var.a();
            }
            dialogC19129x966bbd2f.dismiss();
        }
    }
}
