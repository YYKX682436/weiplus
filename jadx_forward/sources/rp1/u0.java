package rp1;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f480063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f480064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rp1.v0 v0Var, boolean z17) {
        super(0);
        this.f480063d = v0Var;
        this.f480064e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rp1.v0 v0Var = this.f480063d;
        boolean z17 = this.f480064e;
        v0Var.f480072c = z17;
        rp1.p0 p0Var = v0Var.f480073d;
        if (p0Var != null) {
            p0Var.a(z17);
        }
        return jz5.f0.f384359a;
    }
}
