package rk4;

/* loaded from: classes.dex */
public final class n0 implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p0 f478387d;

    public n0(rk4.p0 p0Var) {
        this.f478387d = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25029xa5f884d8 c25029xa5f884d8 = this.f478387d.f478423e;
        if (c25029xa5f884d8 != null) {
            c25029xa5f884d8.m92807x70a77297(1 - f17, rk4.m0.f478369d);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25029xa5f884d8 c25029xa5f884d8 = this.f478387d.f478423e;
        if (c25029xa5f884d8 != null) {
            c25029xa5f884d8.m92807x70a77297(0.0d, rk4.l0.f478344d);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
    }
}
