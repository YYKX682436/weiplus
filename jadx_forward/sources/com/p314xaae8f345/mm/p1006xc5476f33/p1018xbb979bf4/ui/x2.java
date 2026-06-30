package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class x2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public s71.b f156176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156178f;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a, int i17) {
        this.f156178f = activityC11497x3bc191a;
        this.f156177e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        synchronized (this.f156178f.f156030p) {
            if (this.f156177e < ((java.util.LinkedList) this.f156178f.f156021d).size()) {
                this.f156176d = (s71.b) ((java.util.LinkedList) this.f156178f.f156021d).get(this.f156177e);
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    this.f156178f.U6(this.f156176d.f485503d, 2);
                } else if (itemId == 2) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f156178f.f156036v));
                    hashMap.put("page_state", java.lang.Integer.valueOf(this.f156178f.f156038x ? 2 : 1));
                    hashMap.put("oper_enter_type", 2);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "copy_address", hashMap, 33328);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a.T6(this.f156178f, this.f156176d);
                } else if (itemId == 3) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f156178f.mo55332x76847179(), 1, true);
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.v2(this);
                    k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.w2(this);
                    k0Var.q(this.f156178f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.htf), 17);
                    k0Var.v();
                }
            }
        }
    }
}
