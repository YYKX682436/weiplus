package et4;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f338145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et4.i f338146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(et4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        super(false);
        this.f338146e = iVar;
        this.f338145d = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f338145d;
        java.lang.String str = c19091x9511676c.f69225xed6d60f6;
        et4.i iVar = this.f338146e;
        java.util.Iterator it = ((java.util.ArrayList) iVar.f338153h).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19127x29ebd5f0 c19127x29ebd5f0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19127x29ebd5f0) it.next();
            if (c19127x29ebd5f0 == view) {
                c19127x29ebd5f0.f261719g.setChecked(true);
            } else {
                c19127x29ebd5f0.f261719g.setChecked(false);
            }
        }
        iVar.dismiss();
        et4.h hVar = iVar.f338164v;
        if (hVar != null) {
            et4.w wVar = (et4.w) hVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "on select bankcard: %s, %s", c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69225xed6d60f6);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = wVar.f338199c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = dialogC19129x966bbd2f.P;
            if (c19091x9511676c2 == null || !c19091x9511676c.f69225xed6d60f6.equals(c19091x9511676c2.f69225xed6d60f6)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 13, c19091x9511676c.f69225xed6d60f6);
                dialogC19129x966bbd2f.P = c19091x9511676c;
                dialogC19129x966bbd2f.N = wVar.f338197a;
                dialogC19129x966bbd2f.r();
                dialogC19129x966bbd2f.t();
                dialogC19129x966bbd2f.z();
                dialogC19129x966bbd2f.x();
                dialogC19129x966bbd2f.A();
                if (dialogC19129x966bbd2f.S) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = dialogC19129x966bbd2f.M;
                    vr4.b bVar = c19099x8d444f05.N.f521302w;
                    if (bVar != null && bVar.f521214e == 1 && bVar.f521213d != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h0.INSTANCE.a(c19099x8d444f05).g(dialogC19129x966bbd2f.M.N.f521302w.f521215f);
                        if (dialogC19129x966bbd2f.P == null || g17.f261200d.equals("0") || !g17.f261205i.contains(dialogC19129x966bbd2f.P.f69225xed6d60f6)) {
                            dialogC19129x966bbd2f.B(0);
                        } else {
                            dialogC19129x966bbd2f.B(8);
                        }
                    }
                }
                dialogC19129x966bbd2f.B(8);
            }
            ((java.util.ArrayList) dialogC19129x966bbd2f.f261752x0).remove(dialogC19129x966bbd2f.F.f338165w);
            dialogC19129x966bbd2f.F = null;
            dialogC19129x966bbd2f.show();
        }
    }
}
