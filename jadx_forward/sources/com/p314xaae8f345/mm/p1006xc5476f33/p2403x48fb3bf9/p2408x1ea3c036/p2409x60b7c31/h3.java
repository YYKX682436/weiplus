package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class h3 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f263862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f263863d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i3 i3Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.app.ProgressDialog progressDialog, android.content.Intent intent) {
        this.f263860a = context;
        this.f263861b = q5Var;
        this.f263862c = progressDialog;
        this.f263863d = intent;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263861b;
        android.content.Context context = this.f263860a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiProfile", "getNow callback, msghandler has already been detached!");
            q5Var.a("fail", null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f263862c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            z17 = false;
        } else {
            str = n17.d1();
        }
        if (!z17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g3(this));
            q5Var.a("fail", null);
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str);
        android.content.Intent intent = this.f263863d;
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        if (n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",42");
            intent.putExtra("Contact_Scene", 42);
        }
        ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).l(intent, context);
        q5Var.a(null, null);
    }
}
