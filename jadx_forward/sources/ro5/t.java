package ro5;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f479829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ro5.b0 b0Var) {
        super(0);
        this.f479829d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ro5.b0 b0Var = this.f479829d;
        boolean z17 = false;
        if (!b0Var.H0() && b0Var.f479683g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "onCameraFailedListener cameraHelper?.startCamera()");
            so5.k0 k0Var = b0Var.f479682f;
            if (k0Var != null) {
                z17 = so5.k0.c(k0Var, false, false, 3, null);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
