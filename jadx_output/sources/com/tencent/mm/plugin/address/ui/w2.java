package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class w2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.x2 f74639d;

    public w2(com.tencent.mm.plugin.address.ui.x2 x2Var) {
        this.f74639d = x2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.address.ui.x2 x2Var = this.f74639d;
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(x2Var.f74645f.f74503v));
        hashMap.put("page_state", java.lang.Integer.valueOf(x2Var.f74645f.f74505x ? 2 : 1));
        hashMap.put("oper_enter_type", 2);
        if (menuItem.getItemId() == 3) {
            x2Var.f74645f.f74494m.b(new q71.p(x2Var.f74643d.f403970d), true);
            x2Var.f74643d = null;
            hashMap.put("is_final_ack", 0);
        } else {
            hashMap.put("is_final_ack", 1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "delete_address", hashMap, 33328);
    }
}
