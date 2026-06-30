package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class uj extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186242e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f186243f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186244g;

    /* renamed from: h, reason: collision with root package name */
    public long f186245h;

    /* renamed from: i, reason: collision with root package name */
    public td2.c f186246i;

    public uj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract, int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179;
        fc2.c Y6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d = contract.getF204176d();
        if (f204176d != null && (mo55332x76847179 = f204176d.mo55332x76847179()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
                Y6.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pj(this, g0Var));
            }
        }
        this.f186242e = "Finder.FinderFeedProductConvert";
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dv8;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186242e, "yjh onAttachedToRecyclerView");
        super.g(recyclerView, adapter);
        this.f186244g = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r10 == null) goto L10;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r7, in5.c r8, int r9, int r10, boolean r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qj(holder, this));
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186242e, "yjh onDetachedFromRecyclerView");
        super.j(recyclerView);
        this.f186244g = null;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) holder.p(com.p314xaae8f345.mm.R.id.agy);
        if (c14493xfdc11530 != null) {
            c14493xfdc11530.g();
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.f565888ta0);
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
        if (hVar != null) {
            hVar.b();
        }
    }

    public final java.util.Map n(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.a(context, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("product_info", str), new jz5.l("session_buffer", abstractC14490x69736cb5.g0())));
    }

    public final void o(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        td2.c cVar = this.f186246i;
        if (cVar != null) {
            java.lang.String str = this.f186242e;
            try {
                if (activityC21401x6ce6f73f != null) {
                    try {
                        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = activityC21401x6ce6f73f.mo273xed6858b4();
                        if (mo273xed6858b4 != null) {
                            mo273xed6858b4.c(cVar);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Error removing lifecycle observer", e17);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeLifecycleObserverSafely " + activityC21401x6ce6f73f);
                this.f186246i = null;
            } catch (java.lang.Throwable th6) {
                this.f186246i = null;
                throw th6;
            }
        }
    }
}
