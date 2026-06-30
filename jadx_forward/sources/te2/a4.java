package te2;

/* loaded from: classes3.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.c4 f499408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(te2.c4 c4Var) {
        super(1);
        this.f499408d = c4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        te2.c4 c4Var = this.f499408d;
        c4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f499456g, "handleRecvLuckyMoneyErr errCode:" + intValue);
        qo0.c cVar = c4Var.f499454e;
        if (intValue == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            cVar.mo46557x60d69242(qo0.b.f446865b4, bundle);
        } else if (intValue == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            cVar.mo46557x60d69242(qo0.b.f446865b4, bundle2);
        }
        return jz5.f0.f384359a;
    }
}
