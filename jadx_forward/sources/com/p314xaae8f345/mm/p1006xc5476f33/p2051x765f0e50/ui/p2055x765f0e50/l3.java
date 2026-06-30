package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 f242799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac f242800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f242801f;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac, boolean z17) {
        this.f242799d = activityC17393x8aef9d67;
        this.f242800e = c10685x7a6659ac;
        this.f242801f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67 = this.f242799d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = activityC17393x8aef9d67.f241746m;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac = this.f242800e;
        if (c10685x7a6659ac.f149347e == 0) {
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            ((vd0.v1) j1Var).aj(false, "", r17);
            activityC17393x8aef9d67.W6();
            return;
        }
        if ((c10685x7a6659ac.f149348f.length() > 0) && activityC17393x8aef9d67.f241745i) {
            ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(activityC17393x8aef9d67.mo55332x76847179(), c10685x7a6659ac.f149346d, c10685x7a6659ac.f149347e, c10685x7a6659ac.f149348f);
            return;
        }
        activityC17393x8aef9d67.f241745i = false;
        if (!this.f242801f) {
            java.lang.String string = activityC17393x8aef9d67.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575365p94);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            activityC17393x8aef9d67.U6(string);
        } else if (activityC17393x8aef9d67.f241747n) {
            java.lang.String string2 = activityC17393x8aef9d67.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            activityC17393x8aef9d67.U6(string2);
        } else {
            java.lang.String string3 = activityC17393x8aef9d67.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            activityC17393x8aef9d67.U6(string3);
        }
    }
}
