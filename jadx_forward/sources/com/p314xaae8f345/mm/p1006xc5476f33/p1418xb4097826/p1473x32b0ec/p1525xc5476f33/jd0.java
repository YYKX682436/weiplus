package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jd0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f194618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        super(2);
        this.f194618d = nd0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xu2.u uVar;
        xu2.v vVar;
        android.view.View it = (android.view.View) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "fansClubTag click " + booleanValue);
            android.os.Bundle bundle = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f194618d;
            if (booleanValue) {
                qo0.c.a(nd0Var.f195148p, qo0.b.O4, null, 2, null);
            } else {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409146f, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193952i, 2, null);
                qo0.c cVar = nd0Var.f195148p;
                qo0.b bVar = qo0.b.O4;
                if (zl2.r4.f555483a.w1()) {
                    bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
                }
                cVar.mo46557x60d69242(bVar, bundle);
            }
            if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.a();
                vVar.c(2022);
            }
        }
        return jz5.f0.f384359a;
    }
}
