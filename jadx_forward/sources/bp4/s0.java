package bp4;

/* loaded from: classes10.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f104904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(bp4.b1 b1Var) {
        super(1);
        this.f104904d = b1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bp4.b1 b1Var = this.f104904d;
            bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) b1Var.f104641q);
            b1Var.f104632e.w(ju3.c0.H, bundle);
        }
        return jz5.f0.f384359a;
    }
}
