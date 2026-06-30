package v0;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f513720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f513721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f513722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.y yVar, n0.v2 v2Var) {
        super(1);
        this.f513720d = g0Var;
        this.f513721e = yVar;
        this.f513722f = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        final n0.v2 v2Var = this.f513722f;
        p012xc85e97e9.p093xedfae76a.k0 k0Var = new p012xc85e97e9.p093xedfae76a.k0() { // from class: v0.a$$a
            @Override // p012xc85e97e9.p093xedfae76a.k0
            /* renamed from: onChanged */
            public final void mo525x7bb163d5(java.lang.Object obj2) {
                n0.v2 state = n0.v2.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "$state");
                state.mo148714x53d8522f(obj2);
            }
        };
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f513720d;
        g0Var.mo7806x9d92d11c(this.f513721e, k0Var);
        return new v0.b(g0Var, k0Var);
    }
}
