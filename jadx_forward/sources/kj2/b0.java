package kj2;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f389919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kj2.c0 f389920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z17, kj2.c0 c0Var) {
        super(0);
        this.f389919d = z17;
        this.f389920e = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f389919d;
        kj2.c0 c0Var = this.f389920e;
        if (z17) {
            ((kj2.a0) c0Var.L).a();
        } else {
            ((kj2.a0) c0Var.L).b();
        }
        return jz5.f0.f384359a;
    }
}
