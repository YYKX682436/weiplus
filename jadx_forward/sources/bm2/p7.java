package bm2;

/* loaded from: classes11.dex */
public final class p7 extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 selectContactUI, java.util.List list, boolean z17) {
        super(selectContactUI, list, z17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectContactUI, "selectContactUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d a(int i17, int i18) {
        bm2.e4 e4Var = new bm2.e4(i18);
        e4Var.C = this.f288609d.mo8774x19263085().getResources().getString(i17);
        return e4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d d(int i17) {
        rd0.a1 a1Var = this.f288237m;
        int i18 = (i17 - ((qd0.n0) a1Var).f443088f) - 1;
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f288381q = ((qd0.n0) a1Var).f443096n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.feature.selectcontact.api.IMMSearchContactDelegateExt");
        r5Var.E = (p13.y) ((qd0.n0) ((rd0.c1) a1Var)).f443093k.get(i18);
        r5Var.f288369e = this.f288611f;
        return r5Var;
    }
}
