package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class we extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f196456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        super(0);
        this.f196455d = viewGroup;
        this.f196456e = mgVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f196455d.findViewById(com.p314xaae8f345.mm.R.id.ev9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 c14339x748bebd7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7) findViewById;
        if (((java.lang.Number) ae2.in.O.r()).intValue() == 0) {
            c14339x748bebd7.m82904x1b1523da(true);
            c14339x748bebd7.m7964x8d4ad49c(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f196456e;
        c14339x748bebd7.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.re(mgVar));
        c14339x748bebd7.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.se(mgVar));
        c14339x748bebd7.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.te(mgVar));
        c14339x748bebd7.m57424xd8d2e64f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ue.f196088d);
        c14339x748bebd7.m57425x3e8fda7b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ve(mgVar));
        return c14339x748bebd7;
    }
}
