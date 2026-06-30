package et4;

/* loaded from: classes9.dex */
public class r extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338191e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f) {
        this.f338191e = dialogC19129x966bbd2f;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338191e;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 12, "");
        dialogC19129x966bbd2f.hide();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 m4Var = dialogC19129x966bbd2f.G;
        if (m4Var == null) {
            dialogC19129x966bbd2f.G = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4.c(dialogC19129x966bbd2f.getContext(), dialogC19129x966bbd2f.M, dialogC19129x966bbd2f.N.f261200d, new et4.p(this), new et4.q(this));
        } else {
            m4Var.dismiss();
            dialogC19129x966bbd2f.G = null;
        }
    }
}
