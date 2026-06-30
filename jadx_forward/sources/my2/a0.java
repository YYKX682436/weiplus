package my2;

/* loaded from: classes.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f414251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(my2.k0 k0Var, android.view.ViewGroup viewGroup) {
        super(2);
        this.f414250d = k0Var;
        this.f414251e = viewGroup;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.util.List choiceList = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choiceList, "choiceList");
        my2.k0 k0Var = this.f414250d;
        if (((mm2.c1) k0Var.P0(mm2.c1.class)).f410322c6) {
            k0Var.A.a();
            mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            long j17 = e1Var.f410516m;
            java.lang.String str2 = e1Var.f410525v;
            r45.me2 me2Var = ((mm2.c1) k0Var.P0(mm2.c1.class)).f410317b6;
            if (me2Var == null || (str = me2Var.m75945x2fec8307(5)) == null) {
                str = "";
            }
            pq5.g l17 = new ly2.a(m75942xfb822ef2, j17, str2, choiceList, str, e1Var.f410518o).l();
            android.view.ViewGroup viewGroup = this.f414251e;
            l17.K(new my2.z(k0Var, intValue, viewGroup));
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        }
        return jz5.f0.f384359a;
    }
}
