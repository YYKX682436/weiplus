package gh;

/* loaded from: classes7.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f353351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.Object obj) {
        super(1);
        this.f353351d = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze.n S;
        gh.t it = (gh.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if ((it instanceof gh.v) && (S = ((ae.d) ((gh.v) it)).f84883a.S()) != null && S.N != null) {
            S.N.f506965a.E.set(true);
            u81.f0 f0Var = S.N.f506965a;
            f0Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList(f0Var.D);
            ((java.util.concurrent.LinkedBlockingQueue) f0Var.D).clear();
            while (!linkedList.isEmpty()) {
                u81.n0 n0Var = (u81.n0) linkedList.poll();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n0Var.f506986g;
                if (n3Var != null) {
                    n0Var.f506986g.mo50300x3fa464aa(n0Var.f506985f);
                    if (android.os.Looper.myLooper() == n3Var.mo50280x23b2dd47()) {
                        ((u81.m0) n0Var.f506985f).run();
                    } else {
                        n0Var.c(n0Var.f506980a);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
