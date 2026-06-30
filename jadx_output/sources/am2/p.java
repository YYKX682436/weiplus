package am2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final am2.i f8725c = new am2.i(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f8726a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f8727b;

    public p(com.tencent.mm.ui.MMActivity activity, gk2.e liveData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f8726a = activity;
        this.f8727b = liveData;
    }

    public static final r45.ch1 a(am2.p pVar, com.tencent.mm.protobuf.g gVar, int i17) {
        pVar.getClass();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, java.lang.Integer.valueOf(i17));
        r45.xn1 xn1Var = new r45.xn1();
        xn1Var.set(11, ((mm2.c1) pVar.f8727b.a(mm2.c1.class)).f328812h);
        ch1Var.set(13, xn1Var);
        ch1Var.set(4, gVar);
        return ch1Var;
    }
}
