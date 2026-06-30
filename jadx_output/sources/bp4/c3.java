package bp4;

/* loaded from: classes3.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(ju3.d0 d0Var) {
        super(1);
        this.f23135d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", intValue);
        this.f23135d.w(ju3.c0.J2, bundle);
        return jz5.f0.f302826a;
    }
}
