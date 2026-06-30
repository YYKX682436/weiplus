package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class x2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public s71.b f74643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74645f;

    public x2(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI, int i17) {
        this.f74645f = walletSelectAddrUI;
        this.f74644e = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        synchronized (this.f74645f.f74497p) {
            if (this.f74644e < ((java.util.LinkedList) this.f74645f.f74488d).size()) {
                this.f74643d = (s71.b) ((java.util.LinkedList) this.f74645f.f74488d).get(this.f74644e);
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    this.f74645f.U6(this.f74643d.f403970d, 2);
                } else if (itemId == 2) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f74645f.f74503v));
                    hashMap.put("page_state", java.lang.Integer.valueOf(this.f74645f.f74505x ? 2 : 1));
                    hashMap.put("oper_enter_type", 2);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "copy_address", hashMap, 33328);
                    com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.T6(this.f74645f, this.f74643d);
                } else if (itemId == 3) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f74645f.getContext(), 1, true);
                    k0Var.f211872n = new com.tencent.mm.plugin.address.ui.v2(this);
                    k0Var.f211881s = new com.tencent.mm.plugin.address.ui.w2(this);
                    k0Var.q(this.f74645f.getString(com.tencent.mm.R.string.htf), 17);
                    k0Var.v();
                }
            }
        }
    }
}
