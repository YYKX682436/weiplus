package pk2;

/* loaded from: classes3.dex */
public final class y9 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437936i = "audience.more.morefunction.rewardlimitamount";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437936i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        r45.f82 f82Var = ((mm2.v5) this.f445960a.c(mm2.v5.class)).f411019i;
        return f82Var != null && f82Var.m75939xb282bd08(0) == 1;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        ((android.view.ViewGroup) bottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.oax)).setVisibility(0);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.oay);
    }
}
