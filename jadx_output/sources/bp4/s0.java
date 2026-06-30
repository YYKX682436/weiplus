package bp4;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f23371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(bp4.b1 b1Var) {
        super(1);
        this.f23371d = b1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bp4.b1 b1Var = this.f23371d;
            bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) b1Var.f23108q);
            b1Var.f23099e.w(ju3.c0.H, bundle);
        }
        return jz5.f0.f302826a;
    }
}
