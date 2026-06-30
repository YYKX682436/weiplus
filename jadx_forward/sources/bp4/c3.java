package bp4;

/* loaded from: classes3.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(ju3.d0 d0Var) {
        super(1);
        this.f104668d = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", intValue);
        this.f104668d.w(ju3.c0.J2, bundle);
        return jz5.f0.f384359a;
    }
}
