package tm2;

/* loaded from: classes3.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(tm2.s2 s2Var) {
        super(1);
        this.f502096d = s2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        st2.h1 h1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        tm2.s2 s2Var = this.f502096d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s2Var.f502120g, "prepare shopping:" + booleanValue + ",list empty:" + ((mm2.f6) s2Var.c(mm2.f6.class)).f410572o.f446213a.isEmpty());
        if (booleanValue) {
            if (((mm2.f6) s2Var.c(mm2.f6.class)).P6() && (ga0Var = s2Var.f502145w) != null && (h1Var = ga0Var.f194201r) != null) {
                h1Var.A();
            }
            st2.f2.d(st2.f2.f493820a, s2Var.f101142a, zl2.r4.f555483a.W(((mm2.f6) s2Var.c(mm2.f6.class)).f410571n), false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
