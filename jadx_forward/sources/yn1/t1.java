package yn1;

/* loaded from: classes9.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f545374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i17, yn1.r2 r2Var, long j17) {
        super(1);
        this.f545374d = i17;
        this.f545375e = r2Var;
        this.f545376f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (this.f545374d == 7817) {
            yn1.z0.f545477l = "";
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545375e.f545343a;
        if (gVar != null) {
            gVar.K0(this.f545376f, 3, -1, "Coroutine Scope cancelled", new byte[0], 2);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }
}
