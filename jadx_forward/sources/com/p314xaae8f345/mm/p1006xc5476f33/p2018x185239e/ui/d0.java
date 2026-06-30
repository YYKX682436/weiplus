package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f239201a;

    public d0(android.content.Context context) {
        this.f239201a = context;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 c19564xaf6ceaf4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var) {
        if (c19564xaf6ceaf4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemindCollectionDialog", "init() resendMsgInfo == null");
            return;
        }
        android.content.Context context = this.f239201a;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cdv, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lu6);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        n11.a b17 = n11.a.b();
        java.lang.String str = c19564xaf6ceaf4.f270124e;
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f563602ce0;
        b17.h(str, imageView, fVar.a());
        c22624x85d69039.b(c19564xaf6ceaf4.f270125f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(c19564xaf6ceaf4.f270123d);
        u1Var.d(inflate);
        u1Var.j(c19564xaf6ceaf4.f270126g);
        u1Var.n(c19564xaf6ceaf4.f270127h);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.c0(this, w1Var));
        u1Var.q(false);
    }
}
