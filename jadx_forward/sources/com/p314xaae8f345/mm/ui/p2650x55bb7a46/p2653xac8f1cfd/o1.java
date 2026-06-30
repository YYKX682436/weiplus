package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f281142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f281144i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281145m;

    public o1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, int i17, java.util.LinkedList linkedList2, int i18) {
        this.f281145m = q2Var;
        this.f281139d = z17;
        this.f281140e = f9Var;
        this.f281141f = linkedList;
        this.f281142g = i17;
        this.f281143h = linkedList2;
        this.f281144i = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (!this.f281139d) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2.m0(this.f281145m, this.f281140e, this.f281141f, this.f281143h, this.f281144i, this.f281142g, false);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f281145m;
        q2Var.f281278q = null;
        gd0.f V6 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.V6(q2Var.f280113d.x(), this.f281140e, 2, (java.lang.String) this.f281141f.get(0), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n1(this));
        android.app.ProgressDialog progressDialog = q2Var.f281272h;
        if (progressDialog == null) {
            q2Var.f281272h = db5.e1.Q(q2Var.f280113d.g(), q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q1(q2Var, V6));
        } else {
            progressDialog.show();
        }
    }
}
