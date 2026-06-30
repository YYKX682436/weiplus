package i33;

/* loaded from: classes10.dex */
public final class a1 implements f60.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.b1 f369691a;

    public a1(i33.b1 b1Var) {
        this.f369691a = b1Var;
    }

    @Override // f60.a
    public void a() {
        i33.b1 b1Var = this.f369691a;
        if (b1Var.f369695g.f139830h < 0 || ((java.util.ArrayList) b1Var.f369696h).size() < b1Var.f369695g.f139830h) {
            b1Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((java.util.ArrayList) b1Var.f369696h).add(java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
