package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class u1 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f281574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281579f;

    public u1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, boolean z17, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f281579f = q2Var;
        this.f281574a = z17;
        this.f281575b = i17;
        this.f281576c = f9Var;
        this.f281577d = linkedList;
        this.f281578e = linkedList2;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f281579f;
        android.app.ProgressDialog progressDialog = q2Var.f281272h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        if (i18 == -2024) {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(q2Var.f280113d.f542250l.mo7438x76847179(), null, null);
                return;
            }
            db5.e1.E(q2Var.f280113d.f542250l.mo7438x76847179(), q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4k), null, q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s1(this));
        } else {
            db5.e1.E(q2Var.f280113d.f542250l.mo7438x76847179(), this.f281574a ? q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igo) : q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4u), null, q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t1(this));
        }
        if (this.f281575b == 1) {
            q2Var.w0(this.f281576c, q2Var.f281277p.intValue(), this.f281577d, this.f281578e.size(), 1, 3, (java.lang.String) this.f281577d.get(0));
        }
    }
}
