package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class y2 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 f255977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f255978b;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f255977a = c18619x86b32cd1;
        this.f255978b = c22848x6ddd90cf;
    }

    @Override // ym5.q3
    public void b(int i17) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w2(this.f255977a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "onLoadMoreEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1 = this.f255977a;
        bk4.d dVar = c18619x86b32cd1.f254999g;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
            throw null;
        }
        if (!dVar.f102980g) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = c18619x86b32cd1.f254996d;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
            if (this.f255978b.Z() == 0) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c18619x86b32cd1.f254997e;
                if (c22849x81a93d25 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(c22849x81a93d25.getContext());
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = c18619x86b32cd1.f254997e;
                if (c22849x81a93d252 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0d, (android.view.ViewGroup) c22849x81a93d252, false);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f255978b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                in5.n0.P(c22848x6ddd90cf, inflate, Integer.MAX_VALUE, false, 4, null);
                inflate.findViewById(com.p314xaae8f345.mm.R.id.hy8).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.x2(c18619x86b32cd1));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "hasMoreData true");
        }
        c18619x86b32cd1.l0();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = c18619x86b32cd1.f254997e;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d253.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }
}
