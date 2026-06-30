package d55;

/* loaded from: classes12.dex */
public class c0 extends d55.f0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d55.d0 f308109u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d55.d0 d0Var, d55.b0 b0Var) {
        super(b0Var);
        this.f308109u = d0Var;
    }

    @Override // d55.g0
    public void k() {
        d55.o0.a(4, "MicroMsg.recovery.combination", "safePoint finish, switch to signal handler");
        d55.d0 d0Var = this.f308109u;
        if (d0Var.f308113t == null) {
            d0Var.f308113t = d0Var.k();
        }
        d55.o0.a(4, "MicroMsg.recovery.safePoint", "#finish");
        if (this.f308116r.get()) {
            d55.o0.a(4, "MicroMsg.recovery.safePoint", "clear crash point");
            c();
            b();
            i(true);
        }
    }
}
