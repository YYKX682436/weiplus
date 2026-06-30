package ym5;

/* loaded from: classes10.dex */
public final class o5 implements ym5.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f544989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec f544990b;

    public o5(ym5.y5 y5Var, com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec) {
        this.f544989a = y5Var;
        this.f544990b = c22825xd78e1eec;
    }

    @Override // ym5.g6
    public void a(int i17) {
        ym5.y5 y5Var = this.f544989a;
        java.lang.String str = y5Var.f545114x;
        y5Var.f544891u.getCurMode();
        java.util.Objects.toString(y5Var.f544891u.getTag());
        com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = this.f544990b;
        if (i17 == 3) {
            java.lang.Object tag = y5Var.f544891u.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag).intValue();
            c22825xd78e1eec.m82874x7b868205(intValue);
            y5Var.f544890t.mo82626x630fd73d(intValue);
        } else {
            y5Var.f544891u.setTag(java.lang.Integer.valueOf(c22825xd78e1eec.m82870x9b946279()));
            y5Var.f544890t.mo82626x630fd73d(0);
        }
        y5Var.f544890t.m82625x1a689683(i17 == 2);
    }
}
