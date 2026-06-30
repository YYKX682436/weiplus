package zw1;

/* loaded from: classes2.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 f558251d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85) {
        this.f558251d = activityC13141xbbc9be85;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ww1.p1) {
            ww1.p1 p1Var = (ww1.p1) m1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85 = this.f558251d;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CollectBillUI", "net error: %s", p1Var);
                activityC13141xbbc9be85.f177899p.setVisibility(8);
                return;
            }
            java.util.LinkedList<r45.d8> linkedList = p1Var.f531801f.f468353d;
            if (linkedList == null || linkedList.isEmpty()) {
                activityC13141xbbc9be85.f177899p.setVisibility(8);
                return;
            }
            for (r45.d8 d8Var : linkedList) {
                if (d8Var.f453746d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d8Var.f453747e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "show notice");
                    activityC13141xbbc9be85.f177899p.setText(d8Var.f453747e);
                    activityC13141xbbc9be85.f177899p.setOnClickListener(new zw1.l(this, d8Var));
                    activityC13141xbbc9be85.f177899p.setVisibility(0);
                    return;
                }
            }
            activityC13141xbbc9be85.f177899p.setVisibility(8);
        }
    }
}
