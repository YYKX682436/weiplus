package sc2;

/* loaded from: classes2.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(in5.s0 s0Var, sc2.h1 h1Var, r45.t01 t01Var) {
        super(0);
        this.f487510d = s0Var;
        this.f487511e = h1Var;
        this.f487512f = t01Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = this.f487510d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
        if (p17 != null) {
            p17.post(new sc2.i0(this.f487511e, s0Var, this.f487512f));
        }
        return jz5.f0.f384359a;
    }
}
