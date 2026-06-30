package bg2;

/* loaded from: classes2.dex */
public final class q4 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f20409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f20410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f20411f;

    public q4(com.tencent.mm.view.MMPAGView mMPAGView, v65.n nVar, kotlinx.coroutines.q qVar) {
        this.f20409d = mMPAGView;
        this.f20410e = nVar;
        this.f20411f = qVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f20409d.i(this);
        this.f20410e.a(this.f20411f);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f20409d.i(this);
        this.f20410e.a(jz5.f0.f302826a);
    }
}
