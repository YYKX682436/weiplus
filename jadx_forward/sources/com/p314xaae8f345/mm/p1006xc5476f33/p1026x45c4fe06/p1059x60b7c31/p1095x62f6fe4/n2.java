package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class n2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p2 f163482d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p2 p2Var) {
        this.f163482d = p2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p2 p2Var = this.f163482d;
        if (itemId == 1) {
            p2Var.f163522h.f163315h.f163161g = false;
        } else if (itemId == 2) {
            p2Var.f163522h.f163315h.f163160f = false;
        }
        if (menuItem.getItemId() == 1 && !p2Var.f163522h.D(p2Var.f163518d, p2Var.f163519e, p2Var.f163520f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseImage", "check camera permission fail");
            return;
        }
        if (menuItem.getItemId() == 2 && !p2Var.f163522h.E(p2Var.f163518d, p2Var.f163519e, p2Var.f163520f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseImage", "check external storage permission fail");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "start select after source choose");
        android.content.Context context = p2Var.f163521g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var = p2Var.f163522h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(context, e3Var.f163315h, e3Var.f163316i);
    }
}
