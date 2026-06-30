package op0;

/* loaded from: classes12.dex */
public final class j implements cl.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uq3.g f428763a;

    public j(uq3.g gVar) {
        this.f428763a = gVar;
    }

    @Override // cl.n
    public void a(cl.p runtime) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        uq3.e b17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) this.f428763a).b(runtime);
        try {
            gVar = (com.p314xaae8f345.mm.sdk.p2603x2137b148.g) com.p314xaae8f345.mm.sdk.p2603x2137b148.h.f274254a.call();
        } catch (java.lang.Exception unused) {
            gVar = null;
        }
        if (gVar == null || android.text.TextUtils.isEmpty(gVar.f274245b)) {
            return;
        }
        b17.f511759e = gVar.f274245b;
    }

    @Override // cl.n
    public void b(cl.p runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) this.f428763a).a(runtime);
    }

    @Override // cl.n
    public void c(cl.p runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) this.f428763a).a(runtime);
    }
}
