package et4;

/* loaded from: classes9.dex */
public class o extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xj6 f338180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f, r45.xj6 xj6Var) {
        super(false);
        this.f338181e = dialogC19129x966bbd2f;
        this.f338180d = xj6Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        r45.xj6 xj6Var = this.f338180d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "click item: %s", xj6Var.f471706n.f472888e);
        r45.yt5 yt5Var = xj6Var.f471706n;
        if (yt5Var.f472887d == 13 && yt5Var.f472894n != null && "fetchfavordialog".equals(yt5Var.f472888e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338181e;
            et4.j0 j0Var = new et4.j0(dialogC19129x966bbd2f.H);
            if (xj6Var.f471706n.f472894n.f466221f.size() > 0 && ((r45.yz6) xj6Var.f471706n.f472894n.f466221f.get(0)).f473089x != null) {
                java.util.LinkedList<r45.xj6> linkedList = ((r45.yz6) xj6Var.f471706n.f472894n.f466221f.get(0)).f473089x.f454437e;
                r45.rl6 rl6Var = xj6Var.f471706n.f472894n.f466219d.f463193d;
                if (rl6Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.k(j0Var.f338169e, rl6Var, null, java.lang.Boolean.FALSE);
                }
                if (linkedList != null && !linkedList.isEmpty()) {
                    for (r45.xj6 xj6Var2 : linkedList) {
                        android.view.View inflate = android.view.View.inflate(j0Var.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571172d92, null);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ppm);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ppk);
                        java.util.LinkedList linkedList2 = xj6Var2.f471700e;
                        if (linkedList2 != null && linkedList2.size() >= 1) {
                            java.util.LinkedList linkedList3 = xj6Var2.f471700e;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(textView, (r45.rl6) linkedList3.get(0));
                            if (linkedList3.size() >= 2) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(textView2, (r45.rl6) linkedList3.get(1));
                            }
                        }
                        j0Var.f338171g.addView(inflate);
                    }
                }
            }
            j0Var.setOnDismissListener(new et4.n(this));
            j0Var.show();
            dialogC19129x966bbd2f.hide();
        }
    }
}
