package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class m20 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 f200559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f200560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var, boolean z17) {
        super(0);
        this.f200559d = e30Var;
        this.f200560e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.f200559d;
        boolean z17 = this.f200560e;
        e30Var.E = z17;
        android.widget.ImageView imageView = e30Var.f199750v;
        if ((imageView.getAlpha() == 1.0f) && (c22789xd23e9a9b = e30Var.f199751w) != null) {
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544849o));
            if (z17) {
                imageView.setVisibility(8);
                c22789xd23e9a9b.setVisibility(0);
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(e30Var.f446856d.getContext(), com.p314xaae8f345.mm.R.raw.f79633x19892189, e30Var.G));
                if (!c22789xd23e9a9b.f()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(e30Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k20(c22789xd23e9a9b, null), 3, null);
                }
                pm0.v.V(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l20(e30Var));
            } else {
                imageView.setVisibility(0);
                c22789xd23e9a9b.setVisibility(8);
                c22789xd23e9a9b.n();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = e30Var.f199745q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) lVar : null;
                if (ag0Var != null) {
                    ag0Var.C1(true);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
