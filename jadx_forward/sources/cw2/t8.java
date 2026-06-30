package cw2;

/* loaded from: classes2.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz2.a f305561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f305562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, kz2.a aVar, cw2.h8 h8Var) {
        super(1);
        this.f305560d = c15196x85976f5f;
        this.f305561e = aVar;
        this.f305562f = h8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da daVar = (cw2.da) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305560d;
        c15196x85976f5f.m61515xab353f7e(daVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) c15196x85976f5f.m61487x4ed8f404().F()).X6(daVar);
        if (daVar != null) {
            daVar.mo56703x2f6c317e(this.f305561e);
            cw2.h8 h8Var = this.f305562f;
            h8Var.f305284g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = h8Var.f305278a;
            c15196x85976f5f.m61487x4ed8f404().D(c14989xf862ae88.m59124x87980ca());
            boolean isNeverStart = daVar.getIsNeverStart();
            mn2.g4 g4Var = h8Var.f305280c;
            if (isNeverStart || daVar.getIsPreloadedView() || (daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de)) {
                cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
                if (seekBarLayout != null) {
                    seekBarLayout.m122862x901b6914(0);
                }
                if (daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) {
                    daVar.m122872x52b5721c(1.0f);
                } else {
                    daVar.m122872x52b5721c(0.0f);
                }
                c15196x85976f5f.Q(daVar, g4Var, h8Var.f305283f, c14989xf862ae88);
            } else if ((daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar).getCurrentPlayState() == 6) {
                c15196x85976f5f.y(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
            }
            c15196x85976f5f.u(daVar, g4Var, h8Var.f305282e);
        } else {
            c15196x85976f5f.V(new cw2.y8(c15196x85976f5f));
        }
        return jz5.f0.f384359a;
    }
}
