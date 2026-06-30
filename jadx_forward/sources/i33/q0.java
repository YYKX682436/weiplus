package i33;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f369770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(i33.t0 t0Var) {
        super(0);
        this.f369770d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity context = this.f369770d.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return (i33.b1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(i33.b1.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
