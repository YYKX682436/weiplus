package lp4;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.a1 f401966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(lp4.a1 a1Var) {
        super(1);
        this.f401966d = a1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            lp4.a1 a1Var = this.f401966d;
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", a1Var.f401856s);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", a1Var.f401857t);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
            a1Var.f546865d.w(ju3.c0.f383409f2, bundle);
        }
        return jz5.f0.f384359a;
    }
}
