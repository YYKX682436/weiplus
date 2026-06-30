package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes15.dex */
public final class u2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186197e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186198f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f186199g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f186200h;

    public u2(java.lang.String finderUserName, int i17, java.lang.String sdkRequestID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        this.f186197e = finderUserName;
        this.f186198f = i17;
        this.f186199g = sdkRequestID;
        this.f186200h = z17;
    }

    @Override // in5.r
    public int e() {
        return this.f186200h ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570330dc2 : com.p314xaae8f345.mm.R.C30864xbddafb2a.ces;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.n0 item = (so2.n0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.d_l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p17;
        boolean z18 = this.f186200h;
        r45.ri0 ri0Var = item.f492022d;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.saj);
            java.lang.Object[] objArr = new java.lang.Object[1];
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            r45.yi0 yi0Var = ri0Var.f466438z;
            long j17 = yi0Var != null ? yi0Var.f472650d : 0L;
            ((b92.d1) zbVar).getClass();
            objArr[0] = zl2.r4.S(zl2.r4.f555483a, j17, 0, 2, null);
            textView.setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dee, objArr));
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5.class))).getClass();
        zq.h.f556505a.d(n22.m.i(ri0Var), imageView, null);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t2(holder, item, this));
    }
}
