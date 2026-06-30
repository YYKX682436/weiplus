package te2;

/* loaded from: classes3.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(te2.p1 p1Var) {
        super(3);
        this.f499954d = p1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int[] iArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        te2.p1 p1Var = this.f499954d;
        te2.k0 k0Var = p1Var.f499823h;
        if (k0Var == null || (d7Var = ((te2.q1) k0Var).f499883i) == null || (iArr = d7Var.f199615p1) == null) {
            iArr = new int[2];
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        te2.k0 k0Var2 = p1Var.f499823h;
        if (k0Var2 != null) {
            int i17 = iArr[0];
            int i18 = iArr[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var2 = ((te2.q1) k0Var2).f499883i;
            if (d7Var2 != null) {
                rl5.r rVar = d7Var2.f199613l1;
                rVar.a();
                rVar.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b7(d7Var2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c7(d7Var2, musicItem, intValue), i17, i18);
                rVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.c5k);
                rVar.U = true;
                rVar.T = com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
            }
        }
        return jz5.f0.f384359a;
    }
}
