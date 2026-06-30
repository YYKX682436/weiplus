package lp4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.p f401873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lp4.p pVar) {
        super(1);
        this.f401873d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            lp4.p pVar = this.f401873d;
            ju3.d0 d0Var = pVar.f546865d;
            ju3.c0 c0Var = ju3.c0.f383411g2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", pVar.f401935w);
            d0Var.w(c0Var, bundle);
        }
        return jz5.f0.f384359a;
    }
}
