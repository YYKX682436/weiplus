package am2;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f90278a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f90279b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f90280c;

    public s1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f90278a = activity;
        this.f90279b = liveData;
        this.f90280c = new java.util.LinkedList();
    }

    public static /* synthetic */ am2.b1 b(am2.s1 s1Var, am2.h3 h3Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        return s1Var.a(h3Var, i17);
    }

    public final am2.b1 a(am2.h3 h3Var, int i17) {
        am2.e1 e1Var = am2.e1.f90190a;
        am2.a1 a1Var = (am2.a1) am2.e1.f90193d.get(h3Var);
        if (a1Var == null) {
            return null;
        }
        am2.b1 b17 = ((am2.y0) a1Var).b(i17);
        b17.c(((mm2.c1) this.f90279b.a(mm2.c1.class)).f410385o);
        return b17;
    }
}
