package am2;

/* loaded from: classes3.dex */
public final class y0 implements am2.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f90308a;

    public y0(java.util.Map.Entry entry) {
        this.f90308a = entry;
    }

    public am2.b1 b(int i17) {
        am2.b1 b1Var = new am2.b1(i17);
        java.util.Map.Entry entry = this.f90308a;
        java.lang.String _nickName = ((am2.z0) entry.getValue()).f90313b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_nickName, "_nickName");
        b1Var.f90169e = _nickName;
        am2.h3 h3Var = (am2.h3) entry.getKey();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h3Var, "<set-?>");
        b1Var.f90166b = h3Var;
        return b1Var;
    }
}
