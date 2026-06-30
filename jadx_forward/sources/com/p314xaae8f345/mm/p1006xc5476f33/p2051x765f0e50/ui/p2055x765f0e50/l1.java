package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 f242797d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 activityC17371x5d66fcc2) {
        this.f242797d = activityC17371x5d66fcc2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 activityC17371x5d66fcc2 = this.f242797d;
        java.lang.String sig = activityC17371x5d66fcc2.f241672d.getText().toString().trim();
        java.lang.String f17 = ip.c.f();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            if (sig.matches(".*[" + f17 + "].*")) {
                db5.e1.s(activityC17371x5d66fcc2.mo55332x76847179(), activityC17371x5d66fcc2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1m, f17), activityC17371x5d66fcc2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 6);
        activityC17371x5d66fcc2.mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC17371x5d66fcc2.mo55332x76847179(), activityC17371x5d66fcc2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
        v14.g gVar = (v14.g) pf5.z.f435481a.a(activityC17371x5d66fcc2).a(v14.g.class);
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sig, "sig");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = gVar.f514076d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gVar.f514076d = f18;
        gVar.f514077e = sig;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new e21.s(sig, 2));
        return true;
    }
}
