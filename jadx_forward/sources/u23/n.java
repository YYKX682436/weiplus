package u23;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f505630a;

    /* renamed from: b, reason: collision with root package name */
    public volatile u23.o f505631b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u23.q f505632c;

    /* renamed from: d, reason: collision with root package name */
    public volatile u23.p f505633d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f505634e;

    /* renamed from: f, reason: collision with root package name */
    public u23.e f505635f;

    public n(u23.o oVar, u23.q qVar, u23.p pVar) {
        java.lang.String str = "MicroMsg.MediaLoaderQueryController[" + hashCode() + ']';
        this.f505630a = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init: ");
        this.f505631b = oVar;
        this.f505632c = qVar;
        this.f505633d = pVar;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505630a, "clear: ");
        this.f505634e = true;
        this.f505631b = null;
        this.f505632c = null;
        this.f505633d = null;
        u23.e eVar = this.f505635f;
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f505577a, "clearCache: ");
            eVar.f505578b = false;
            ((java.util.LinkedHashMap) eVar.f505580d).clear();
            ((java.util.HashMap) eVar.f505581e).clear();
        }
    }

    public final void b(java.util.List result, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (this.f505631b != null) {
            if (!z17) {
                t23.p0.n().c(new u23.m(this, result));
                return;
            }
            t23.y0 n17 = t23.p0.n();
            n17.a().mo50294x9395cba4(new u23.l(this, result));
        }
    }
}
