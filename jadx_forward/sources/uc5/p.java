package uc5;

/* loaded from: classes10.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final ad5.l0[] f508072a = {ad5.f.f84782a, ad5.q.f84827a, ad5.e.f84777a, ad5.d.f84775a};

    public final uc5.d a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        uc5.d dVar = (uc5.d) c().getConstructor(com.p314xaae8f345.mm.p2621x8fb0427b.f9.class).newInstance(msgInfo);
        if (z17) {
            uc5.b bVar = new uc5.b(false);
            dVar.getClass();
            dVar.f508009d = bVar;
        }
        uc5.r0 r0Var = null;
        try {
            r0Var = (uc5.r0) p3325xe03a0797.p3326xc267989b.l.f(null, new uc5.o(this, context, msgInfo, null), 1, null);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
        dVar.f508010e = r0Var;
        return dVar;
    }

    public abstract java.util.Set b();

    public abstract java.lang.Class c();

    public abstract uc5.n d();

    public abstract boolean e(oi3.g gVar);

    public abstract java.lang.Boolean f(int i17, int i18);
}
