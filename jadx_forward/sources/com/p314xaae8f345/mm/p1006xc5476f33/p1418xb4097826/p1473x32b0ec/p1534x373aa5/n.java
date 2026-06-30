package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f198026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(0);
        this.f198025d = i17;
        this.f198026e = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.f35851x233c02ec.getClass();
        str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRecvLuckyMoneyErr errCode:");
        int i17 = this.f198025d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f198026e;
        if (i17 == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            k0Var.mo46557x60d69242(qo0.b.f446865b4, bundle);
        } else if (i17 == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            k0Var.mo46557x60d69242(qo0.b.f446865b4, bundle2);
        }
        return jz5.f0.f384359a;
    }
}
