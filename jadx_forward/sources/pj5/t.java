package pj5;

/* loaded from: classes9.dex */
public final class t extends in5.r {
    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 c22089x7f01e429 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429(context, null, 0, 6, null);
        c22089x7f01e429.setId(com.p314xaae8f345.mm.R.id.srl);
        c22089x7f01e429.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return c22089x7f01e429;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        pj5.l item = (pj5.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 c22089x7f01e429 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.srl);
        z01.d0 d0Var = new z01.d0();
        r45.wq4 wq4Var = new r45.wq4();
        r45.lo5 lo5Var = item.f436920d;
        wq4Var.mo11468x92b714fd(lo5Var.f461212h.f273689a);
        try {
            f9Var = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(wq4Var.f470923f, wq4Var.f470924g);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScheduleMsgDetailUI", "onBindViewHolder get msg failed, username: " + wq4Var.f470923f + ", svrId: " + wq4Var.f470924g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScheduleMsgDetailUI", th6, "onBindViewHolder failed", new java.lang.Object[0]);
            f9Var = null;
        }
        d0Var.f550519d = wq4Var.f470921d;
        d0Var.f550520e = pj5.k.f436919a.b(f9Var);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = wq4Var.f470923f;
        ((sg3.a) v0Var).getClass();
        d0Var.f550521f = c01.a2.e(str);
        d0Var.f550522g = java.lang.Long.valueOf(lo5Var.f461210f * 1000);
        d0Var.f550523h = java.lang.Long.valueOf(wq4Var.f470924g);
        d0Var.f550526n = new pj5.n(f9Var, lo5Var, item, holder, d0Var, c22089x7f01e429);
        d0Var.f550524i = new pj5.o(holder, f9Var);
        d0Var.f550527o = new pj5.s(holder, item);
        c22089x7f01e429.m48330xfcfee142(d0Var);
    }
}
