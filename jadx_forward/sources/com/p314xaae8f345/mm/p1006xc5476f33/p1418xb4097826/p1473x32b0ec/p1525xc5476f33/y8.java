package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 f196696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 b9Var) {
        super(0);
        this.f196696d = b9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 b9Var = this.f196696d;
        int i17 = b9Var.f193522s - 1;
        b9Var.f193522s = i17;
        b9Var.f193521r.setText(java.lang.String.valueOf(i17));
        if (b9Var.f193522s <= 0) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) b9Var.f193525v).mo141623x754a37bb()).d();
            b9Var.f193524u = false;
            b9Var.K0(8);
            if (b9Var.f193523t) {
                b9Var.f193523t = false;
            } else {
                dk2.xf W0 = b9Var.W0();
                if (W0 != null) {
                    ((dk2.r4) W0).d0(2, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x8(b9Var));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
