package ym5;

/* loaded from: classes10.dex */
public final class h6 implements ym5.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec f544911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f544912b;

    public h6(com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec, ym5.n6 n6Var) {
        this.f544911a = c22825xd78e1eec;
        this.f544912b = n6Var;
    }

    @Override // ym5.g6
    public void a(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = this.f544911a;
        ym5.n6 n6Var = this.f544912b;
        if (i17 == 3) {
            java.lang.Object tag = n6Var.f544891u.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            c22825xd78e1eec.m82874x7b868205(((java.lang.Integer) tag).intValue());
            com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = n6Var.f544890t;
            java.lang.Object tag2 = n6Var.f544891u.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
            c22795x96919289.mo82626x630fd73d(((java.lang.Integer) tag2).intValue());
        } else {
            n6Var.f544891u.setTag(java.lang.Integer.valueOf(c22825xd78e1eec.m82870x9b946279()));
            n6Var.f544890t.mo82626x630fd73d(0);
        }
        n6Var.f544890t.m82625x1a689683(i17 == 2);
    }
}
