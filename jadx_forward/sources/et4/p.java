package et4;

/* loaded from: classes9.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et4.r f338183a;

    public p(et4.r rVar) {
        this.f338183a = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "on select favor: %s", c19098xdf4bc178.f261200d);
        et4.r rVar = this.f338183a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = rVar.f338191e;
        dialogC19129x966bbd2f.G = null;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 15, c19098xdf4bc178.f261200d);
        java.util.List h17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0.h(c19098xdf4bc178.f261201e, c19098xdf4bc178.f261202f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f2 = rVar.f338191e;
        dialogC19129x966bbd2f2.N.f261204h = "";
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0.j(c19098xdf4bc178, dialogC19129x966bbd2f2.P)) {
            if (((java.util.ArrayList) h17).size() == 0) {
                c19098xdf4bc178.f261204h = rVar.f338191e.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.klp);
            } else {
                c19098xdf4bc178.f261204h = rVar.f338191e.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.klq);
            }
            rVar.f338191e.i(true, -100, false, c19098xdf4bc178);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f3 = rVar.f338191e;
            dialogC19129x966bbd2f3.N = c19098xdf4bc178;
            dialogC19129x966bbd2f3.show();
        }
        rVar.f338191e.t();
        rVar.f338191e.z();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f4 = rVar.f338191e;
        dialogC19129x966bbd2f4.h(dialogC19129x966bbd2f4.C.f261726f);
    }
}
