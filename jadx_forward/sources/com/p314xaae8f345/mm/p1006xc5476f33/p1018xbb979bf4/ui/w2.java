package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class w2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x2 f156172d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x2 x2Var) {
        this.f156172d = x2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x2 x2Var = this.f156172d;
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(x2Var.f156178f.f156036v));
        hashMap.put("page_state", java.lang.Integer.valueOf(x2Var.f156178f.f156038x ? 2 : 1));
        hashMap.put("oper_enter_type", 2);
        if (menuItem.getItemId() == 3) {
            x2Var.f156178f.f156027m.b(new q71.p(x2Var.f156176d.f485503d), true);
            x2Var.f156176d = null;
            hashMap.put("is_final_ack", 0);
        } else {
            hashMap.put("is_final_ack", 1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "delete_address", hashMap, 33328);
    }
}
