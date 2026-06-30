package fk2;

/* loaded from: classes3.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.n2 f344968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(fk2.n2 n2Var) {
        super(1);
        this.f344968d = n2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        fk2.n2 n2Var = this.f344968d;
        n2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "handleRecvLuckyMoneyErr errCode:" + intValue);
        we2.a aVar = n2Var.f526773a;
        if (intValue == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = aVar.p();
            if (p17 != null) {
                p17.mo46557x60d69242(qo0.b.f446865b4, bundle);
            }
        } else if (intValue == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p18 = aVar.p();
            if (p18 != null) {
                p18.mo46557x60d69242(qo0.b.f446865b4, bundle2);
            }
        }
        return jz5.f0.f384359a;
    }
}
