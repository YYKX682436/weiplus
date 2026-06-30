package qw3;

/* loaded from: classes3.dex */
public class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.i f448674d;

    public b(qw3.i iVar) {
        this.f448674d = iVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        qw3.i iVar = this.f448674d;
        if (itemId == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f448699d.C)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitBankcardInputUI", "paylist url is null");
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(iVar.f448699d.mo55332x76847179(), iVar.f448699d.C, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14673, 6);
            return;
        }
        if (itemId != 1) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(iVar.f448699d.mo55332x76847179(), "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2) + "/touch/scene_product.html?scene_id=kf4568", true);
    }
}
