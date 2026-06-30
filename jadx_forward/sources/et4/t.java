package et4;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr4.b f338193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f, vr4.b bVar) {
        super(false);
        this.f338194e = dialogC19129x966bbd2f;
        this.f338193d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "click bank favor btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338194e;
        dialogC19129x966bbd2f.S = false;
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        vr4.b bVar = this.f338193d;
        dialogC19129x966bbd2f.P = fj6.e(bVar.f521213d.f521338f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h0.INSTANCE.a(dialogC19129x966bbd2f.M).g(bVar.f521215f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "set favor info: %s", g17.f261200d);
        if (g17.f261200d.equals("0")) {
            dialogC19129x966bbd2f.r();
        } else {
            dialogC19129x966bbd2f.N = g17;
        }
        dialogC19129x966bbd2f.t();
        dialogC19129x966bbd2f.z();
        dialogC19129x966bbd2f.x();
        dialogC19129x966bbd2f.A();
        dialogC19129x966bbd2f.B(8);
    }
}
