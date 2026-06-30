package tn0;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f502270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tn0.w0 w0Var, int i17) {
        super(1);
        this.f502269d = w0Var;
        this.f502270e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        tn0.w0 w0Var = this.f502269d;
        w0Var.f502292f.mo50293x3498a0(new tn0.p(w0Var, (android.graphics.SurfaceTexture) obj, this.f502270e));
        return jz5.f0.f384359a;
    }
}
