package hw;

/* loaded from: classes7.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(hw.o0 o0Var) {
        super(0);
        this.f366922d = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String ij6;
        java.lang.String ij7;
        boolean z17;
        java.lang.String ij8;
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        hw.o0 o0Var = this.f366922d;
        ij6 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij6, "is appbrand so open true");
        boolean Zi = o0Var.Zi();
        ij7 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij7, "is biz open " + Zi);
        if (Zi) {
            boolean wi6 = hw.o0.wi(o0Var);
            ij8 = o0Var.ij();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij8, "is stability open " + wi6);
            if (wi6) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
