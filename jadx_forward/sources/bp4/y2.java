package bp4;

/* loaded from: classes5.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.z2 f104964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(bp4.z2 z2Var, ju3.d0 d0Var) {
        super(1);
        this.f104964d = z2Var;
        this.f104965e = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        bp4.z2 z2Var = this.f104964d;
        z2Var.f104969f.m72702x76500a7f(false);
        ju3.d0 d0Var = this.f104965e;
        if (booleanValue) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("EDIT_PAG_CHANGE_TEXT", z2Var.f104969f.m72700x2d64eb13());
            d0Var.w(ju3.c0.f383454z2, bundle);
        }
        ju3.d0.k(d0Var, ju3.c0.W, null, 2, null);
        return jz5.f0.f384359a;
    }
}
