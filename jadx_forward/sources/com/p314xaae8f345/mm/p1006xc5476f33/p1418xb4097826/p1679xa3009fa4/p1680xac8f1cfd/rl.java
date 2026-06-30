package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class rl implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl f217340d;

    public rl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar) {
        this.f217340d = zlVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        fc2.q f76;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) holder.f374658i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick: position:");
        sb6.append(i17);
        sb6.append(", item:");
        sb6.append(z1Var.mo2128x1ed62e84());
        sb6.append(", scene:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar = this.f217340d;
        sb6.append(zlVar.f218230o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(z1Var.getFeedObject());
        jz5.f0 f0Var = null;
        so2.u1 u1Var = p17 instanceof so2.u1 ? (so2.u1) p17 : null;
        if (u1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "focusFeed " + hc2.b0.d(u1Var, i17));
            if (!zlVar.S6(zlVar.R6()) || zlVar.f218232q == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var2 = zlVar.f218231p;
            if (z1Var2 != null) {
                z1Var2.f204041d = false;
            }
            z1Var.f204041d = true;
            zlVar.f218231p = z1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = zlVar.f218223e;
            if (tlVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("longVideoShareContract");
                throw null;
            }
            tlVar.f190614s.f189369a = null;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn) ((jz5.n) tlVar.f190609n).mo141623x754a37bb()).h(tlVar.f(), u1Var, 0, 0, false, null);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = tlVar.f190602d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null && (f76 = nyVar.f7()) != null) {
                fc2.s sVar = new fc2.s(2);
                sVar.f342514e = u1Var;
                f76.f342509d = u1Var;
                sVar.f342517h = f76.f342507b;
                sVar.f342515f = u1Var.mo2128x1ed62e84();
                sVar.f342516g = u1Var.w();
                f76.f342507b = u1Var.mo2128x1ed62e84();
                f76.a(sVar);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0) ((jz5.n) tlVar.f190608m).mo141623x754a37bb()).O0(u1Var.getFeedObject().m59251x5db1b11(), u1Var.w(), u1Var.getFeedObject().m59276x6c285d75(), tlVar.f190605g, u1Var.getFeedObject().getFeedObject().m76827xf21c30e7() != 1, u1Var.getFeedObject().m59299x6bf53a6c(), (i19 & 64) != 0 ? -1 : 0, (i19 & 128) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190029d : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190030e);
            zlVar.T6(i17);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = zlVar.f218233r;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "focusFeed invalid type " + hc2.b0.d(z1Var, i17));
        }
    }
}
