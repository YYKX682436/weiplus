package qi2;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.c0 f445031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qi2.c0 c0Var) {
        super(0);
        this.f445031d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fj2.s.c(fj2.s.f344716a, ml2.q2.E, null, null, 0, 0, 30, null);
        qi2.c0 c0Var = this.f445031d;
        qo0.c cVar = c0Var.f445035h.f194858g;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SELF_EXIT_PK", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.mo46557x60d69242(bVar, bundle);
        c0Var.a();
        return jz5.f0.f384359a;
    }
}
