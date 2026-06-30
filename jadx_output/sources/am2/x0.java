package am2;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f8768a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f8769b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f8770c;

    public x0(com.tencent.mm.ui.MMActivity activity, gk2.e liveData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f8768a = activity;
        this.f8769b = liveData;
        this.f8770c = new java.util.LinkedList();
    }

    public final am2.b1 a(am2.h3 h3Var, int i17) {
        am2.e1 e1Var = am2.e1.f8657a;
        am2.a1 a1Var = (am2.a1) am2.e1.f8660d.get(h3Var);
        if (a1Var == null) {
            return null;
        }
        am2.b1 b17 = ((am2.y0) a1Var).b(i17);
        b17.c(((mm2.c1) this.f8769b.a(mm2.c1.class)).f328852o);
        return b17;
    }
}
