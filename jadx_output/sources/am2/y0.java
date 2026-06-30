package am2;

/* loaded from: classes3.dex */
public final class y0 implements am2.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f8775a;

    public y0(java.util.Map.Entry entry) {
        this.f8775a = entry;
    }

    public am2.b1 b(int i17) {
        am2.b1 b1Var = new am2.b1(i17);
        java.util.Map.Entry entry = this.f8775a;
        java.lang.String _nickName = ((am2.z0) entry.getValue()).f8780b;
        kotlin.jvm.internal.o.g(_nickName, "_nickName");
        b1Var.f8636e = _nickName;
        am2.h3 h3Var = (am2.h3) entry.getKey();
        kotlin.jvm.internal.o.g(h3Var, "<set-?>");
        b1Var.f8633b = h3Var;
        return b1Var;
    }
}
