package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class o2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f281149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f281150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281151i;

    public o2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18) {
        this.f281151i = q2Var;
        this.f281146d = f9Var;
        this.f281147e = linkedList;
        this.f281148f = linkedList2;
        this.f281149g = i17;
        this.f281150h = i18;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f281151i;
        if (itemId == 0) {
            q2Var.f281277p = 3;
            this.f281151i.o0(this.f281146d, this.f281147e, this.f281148f, this.f281149g, this.f281150h, true);
        } else {
            if (itemId != 1) {
                return;
            }
            gd0.f V6 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.V6(q2Var.f280113d.x(), this.f281146d, 1, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n2(this));
            android.app.ProgressDialog progressDialog = q2Var.f281271g;
            if (progressDialog == null) {
                q2Var.f281271g = db5.e1.Q(q2Var.f280113d.g(), q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igr), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l1(q2Var, V6));
            } else {
                progressDialog.show();
            }
        }
    }
}
