package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class u7 implements zh2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f196064a;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var) {
        this.f196064a = x7Var;
    }

    public void a(km2.q linkUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkUser, "linkUser");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f196064a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x7Var.f196570q, "onAcceptItemClick user: " + linkUser.f390703a);
        x7Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", linkUser.f390708f);
        x7Var.f196569p.mo46557x60d69242(qo0.b.L3, bundle);
    }

    public void b(km2.q linkUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkUser, "linkUser");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", linkUser.f390708f);
        this.f196064a.f196569p.mo46557x60d69242(qo0.b.M3, bundle);
    }
}
