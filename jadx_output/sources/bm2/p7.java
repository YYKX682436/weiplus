package bm2;

/* loaded from: classes11.dex */
public final class p7 extends com.tencent.mm.ui.contact.f5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(com.tencent.mm.ui.contact.MMBaseSelectContactUI selectContactUI, java.util.List list, boolean z17) {
        super(selectContactUI, list, z17, 0);
        kotlin.jvm.internal.o.g(selectContactUI, "selectContactUI");
    }

    @Override // com.tencent.mm.ui.contact.f5, rd0.z0
    public com.tencent.mm.ui.contact.item.d a(int i17, int i18) {
        bm2.e4 e4Var = new bm2.e4(i18);
        e4Var.C = this.f207076d.getActivity().getResources().getString(i17);
        return e4Var;
    }

    @Override // com.tencent.mm.ui.contact.f5, rd0.z0
    public com.tencent.mm.ui.contact.item.d d(int i17) {
        rd0.a1 a1Var = this.f206704m;
        int i18 = (i17 - ((qd0.n0) a1Var).f361555f) - 1;
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f206848q = ((qd0.n0) a1Var).f361563n;
        kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.feature.selectcontact.api.IMMSearchContactDelegateExt");
        r5Var.E = (p13.y) ((qd0.n0) ((rd0.c1) a1Var)).f361560k.get(i18);
        r5Var.f206836e = this.f207078f;
        return r5Var;
    }
}
