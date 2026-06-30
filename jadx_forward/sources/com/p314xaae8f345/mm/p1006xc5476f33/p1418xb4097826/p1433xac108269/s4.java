package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class s4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f184058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xa5 f184060g;

    public s4(boolean z17, android.app.Activity activity, java.lang.String str, r45.xa5 xa5Var) {
        this.f184057d = z17;
        this.f184058e = activity;
        this.f184059f = str;
        this.f184060g = xa5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstall:");
        boolean z17 = this.f184057d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMenuUtil", sb6.toString());
        r45.xa5 xa5Var = this.f184060g;
        android.app.Activity context = this.f184058e;
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1 i1Var = ya2.i1.f542028a;
            java.lang.String m75945x2fec8307 = xa5Var.m75945x2fec8307(9);
            i1Var.c(context, this.f184059f, m75945x2fec8307 != null ? m75945x2fec8307 : "", 3);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "miaojian_createsame_tips", "{\"if_has_set\": 1}", nyVar != null ? nyVar.V6() : null, null, 16, null);
            return;
        }
        ci0.s sVar = (ci0.s) i95.n0.c(ci0.s.class);
        java.lang.String m75945x2fec83072 = xa5Var.m75945x2fec8307(8);
        java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        java.lang.String m75945x2fec83073 = xa5Var.m75945x2fec8307(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83073);
        ((pc0.k) sVar).Ai(context, str, m75945x2fec83073);
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 1, "miaojian_createsame_tips", "{\"if_has_set\": 0}", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
