package wj1;

/* loaded from: classes14.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.q0 f528162d;

    public p0(wj1.q0 q0Var) {
        this.f528162d = q0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        wj1.q0 q0Var = this.f528162d;
        r45.jc jcVar = (r45.jc) q0Var.f528163d.f171085e.f460115f.get(menuItem.getItemId());
        if (jcVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "not find phone_id, menuItem id :%d", java.lang.Integer.valueOf(menuItem.getItemId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "select menuItem id:%d, phone_id:%s, show_phone:%s, bank_type:%s", java.lang.Integer.valueOf(menuItem.getItemId()), jcVar.f459225d, jcVar.f459226e, jcVar.f459227f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45 = q0Var.f528163d;
        c12703xefb74f45.f171086f = jcVar;
        c12703xefb74f45.f171091n.setText(jcVar.f459226e);
    }
}
