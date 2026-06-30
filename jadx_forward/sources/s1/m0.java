package s1;

/* loaded from: classes14.dex */
public final class m0 implements s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f483568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f483569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f483570c;

    public m0(s1.u0 u0Var, s1.q0 q0Var, int i17) {
        this.f483568a = u0Var;
        this.f483569b = q0Var;
        this.f483570c = i17;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f483568a.c();
    }

    @Override // s1.u0
    public void e() {
        s1.q0 q0Var = this.f483569b;
        q0Var.f483597d = this.f483570c;
        this.f483568a.e();
        q0Var.a(q0Var.f483597d);
    }

    @Override // s1.u0
    /* renamed from: getHeight */
    public int mo126531x1c4fb41d() {
        return this.f483568a.mo126531x1c4fb41d();
    }

    @Override // s1.u0
    /* renamed from: getWidth */
    public int mo126532x755bd410() {
        return this.f483568a.mo126532x755bd410();
    }
}
