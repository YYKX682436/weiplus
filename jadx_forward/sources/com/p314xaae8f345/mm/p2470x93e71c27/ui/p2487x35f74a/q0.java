package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class q0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f272809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f272811g;

    public q0(android.content.Context context, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f272808d = context;
        this.f272809e = z17;
        this.f272810f = str;
        this.f272811g = z3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.content.Context context = this.f272808d;
        g4Var.f(1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572414b56));
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.b() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) {
            if (this.f272809e) {
                g4Var.f(2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b57));
            }
            java.lang.String str = this.f272810f;
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || c01.z1.J(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) ? false : true) {
                java.lang.String g27 = this.f272811g.g2();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) && !str.equals("filehelper")) {
                    g4Var.f(3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572410b51, g27));
                }
            }
            g4Var.f(4, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572411b52));
            g4Var.f(5, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572409b50));
        }
    }
}
