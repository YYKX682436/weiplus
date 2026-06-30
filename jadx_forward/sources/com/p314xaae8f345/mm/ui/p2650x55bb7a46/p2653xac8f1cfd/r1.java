package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class r1 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f281342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281347f;

    public r1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, boolean z17, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f281347f = q2Var;
        this.f281342a = z17;
        this.f281343b = i17;
        this.f281344c = f9Var;
        this.f281345d = linkedList;
        this.f281346e = linkedList2;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f281347f;
        android.app.ProgressDialog progressDialog = q2Var.f281272h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        db5.e1.T(q2Var.f280113d.g(), this.f281342a ? q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igm) : q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4o));
        if (this.f281343b == 1) {
            q2Var.w0(this.f281344c, q2Var.f281277p.intValue(), this.f281345d, this.f281346e.size(), 1, 2, (java.lang.String) this.f281345d.get(0));
        }
    }
}
