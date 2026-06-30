package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class l7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rl5.r f182778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f182780h;

    public l7(int i17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var, java.lang.String str, rl5.r rVar, int i18, int i19, int i27) {
        this.f182776d = z7Var;
        this.f182777e = str;
        this.f182778f = rVar;
        this.f182779g = i19;
        this.f182780h = i27;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182776d;
        if (itemId != 1) {
            if (itemId == 2) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z7Var.f183188a;
                java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = z7Var.f183188a;
                db5.e1.B(abstractActivityC21394xb3d2c0cf, string, "", abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k7(this.f182776d, this.f182777e, this.f182779g, this.f182780h, this.f182778f), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13561xae558fe3.f181830e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = z7Var.f183188a;
        java.lang.String tag = this.f182777e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "$tag");
        n0Var.a(abstractActivityC21394xb3d2c0cf3, tag, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j7(z7Var, tag, this.f182779g, this.f182780h));
        jx3.f.INSTANCE.d(29434, 3);
        this.f182778f.a();
    }
}
