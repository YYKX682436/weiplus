package dw2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dw2.o f325653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f325654e;

    public g(dw2.o oVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f325653d = oVar;
        this.f325654e = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        lw2.m videoScaleCleanHelper;
        dw2.o.f(this.f325653d, null, false, "onChildViewAttachedToWindow", 3, null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325654e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(c15415x74224fd8.w(), false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) == null || (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) == null) {
                return;
            }
            videoScaleCleanHelper.g();
        }
    }
}
