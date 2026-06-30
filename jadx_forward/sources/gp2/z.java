package gp2;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f355889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f355890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ws5.f f355892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gp2.l0 l0Var, so2.h1 h1Var, int i17, android.view.View view, ws5.f fVar) {
        super(0);
        this.f355888d = l0Var;
        this.f355889e = h1Var;
        this.f355890f = i17;
        this.f355891g = view;
        this.f355892h = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        so2.h1 h1Var = this.f355889e;
        int i17 = this.f355890f;
        gp2.l0 l0Var = this.f355888d;
        gp2.l0.d(l0Var, h1Var, i17, this.f355891g, this.f355892h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkCustomAutoPlay onFirstFrameRendStartCallback tabId:" + l0Var.f355779e);
        return jz5.f0.f384359a;
    }
}
