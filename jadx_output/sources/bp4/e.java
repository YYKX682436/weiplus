package bp4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.n f23148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bp4.n nVar) {
        super(1);
        this.f23148d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            bp4.n nVar = this.f23148d;
            ju3.d0 d0Var = nVar.f465332d;
            ju3.c0 c0Var = ju3.c0.f301878g2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", nVar.f23285u);
            d0Var.w(c0Var, bundle);
        }
        return jz5.f0.f302826a;
    }
}
