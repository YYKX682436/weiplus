package bp4;

/* loaded from: classes5.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.z2 f23431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(bp4.z2 z2Var, ju3.d0 d0Var) {
        super(1);
        this.f23431d = z2Var;
        this.f23432e = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        bp4.z2 z2Var = this.f23431d;
        z2Var.f23436f.setShow(false);
        ju3.d0 d0Var = this.f23432e;
        if (booleanValue) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("EDIT_PAG_CHANGE_TEXT", z2Var.f23436f.getResult());
            d0Var.w(ju3.c0.f301921z2, bundle);
        }
        ju3.d0.k(d0Var, ju3.c0.W, null, 2, null);
        return jz5.f0.f302826a;
    }
}
