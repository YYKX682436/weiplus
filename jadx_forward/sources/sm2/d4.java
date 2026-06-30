package sm2;

/* loaded from: classes3.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(sm2.o4 o4Var) {
        super(1);
        this.f490959d = o4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        st2.h1 h1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sm2.o4 o4Var = this.f490959d;
        java.lang.String str = o4Var.f491143f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare shopping:");
        sb6.append(booleanValue);
        sb6.append(",list empty:");
        qm0.a aVar = ((mm2.f6) o4Var.c(mm2.f6.class)).f410572o;
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f446213a.isEmpty()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (booleanValue) {
            if (((mm2.f6) o4Var.c(mm2.f6.class)).P6() && (ga0Var = o4Var.f491170w) != null && (h1Var = ga0Var.f194201r) != null) {
                h1Var.A();
            }
            st2.f2.d(st2.f2.f493820a, o4Var.f101142a, zl2.r4.f555483a.W(((mm2.f6) o4Var.c(mm2.f6.class)).f410571n), false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
