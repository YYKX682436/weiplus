package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class o extends p012xc85e97e9.p087x9da2e250.app.n {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f92958c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92959d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f92960e;

    public o(p012xc85e97e9.p087x9da2e250.app.m3 m3Var, j3.h hVar, boolean z17, boolean z18) {
        super(m3Var, hVar);
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var = m3Var.f92933a;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var2 = p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m3Var.f92935c;
        if (l3Var == l3Var2) {
            this.f92958c = z17 ? componentCallbacksC1101xa17d4670.m7459x389d8f04() : componentCallbacksC1101xa17d4670.m7440xdf997417();
            this.f92959d = z17 ? componentCallbacksC1101xa17d4670.m7433x754b36cf() : componentCallbacksC1101xa17d4670.m7432xe393aead();
        } else {
            this.f92958c = z17 ? componentCallbacksC1101xa17d4670.m7462x602d321b() : componentCallbacksC1101xa17d4670.m7443x880e8209();
            this.f92959d = true;
        }
        if (!z18) {
            this.f92960e = null;
        } else if (z17) {
            this.f92960e = componentCallbacksC1101xa17d4670.m7464xbb7ca7e6();
        } else {
            this.f92960e = componentCallbacksC1101xa17d4670.m7463x6eee98ec();
        }
    }

    public final p012xc85e97e9.p087x9da2e250.app.b3 c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var = p012xc85e97e9.p087x9da2e250.app.r2.f93001b;
        if (obj instanceof android.transition.Transition) {
            return b3Var;
        }
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var2 = p012xc85e97e9.p087x9da2e250.app.r2.f93002c;
        if (b3Var2 != null && b3Var2.e(obj)) {
            return b3Var2;
        }
        throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + this.f92940a.f92935c + " is not a valid framework Transition or AndroidX Transition");
    }
}
