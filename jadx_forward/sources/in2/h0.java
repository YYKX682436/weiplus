package in2;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f374376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f374377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, in2.n0 n0Var) {
        super(3);
        this.f374376d = c22849x81a93d25;
        this.f374377e = n0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374376d;
        int i17 = c22849x81a93d25.getContext().getResources().getDisplayMetrics().heightPixels;
        int translationY = (int) ((i17 - intValue) + c22849x81a93d25.getTranslationY());
        in2.n0 n0Var = this.f374377e;
        n0Var.Q = translationY;
        if (booleanValue) {
            n0Var.e0(n0Var.R);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n0Var.f374397J, "moveRv empty: " + i17 + " - " + intValue + " = " + n0Var.Q);
        return jz5.f0.f384359a;
    }
}
