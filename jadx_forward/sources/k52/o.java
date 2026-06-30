package k52;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public k52.f f385850a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f385852c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.Pair f385853d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f385855f;

    /* renamed from: h, reason: collision with root package name */
    public int f385857h;

    /* renamed from: i, reason: collision with root package name */
    public long f385858i;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f385851b = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final k52.n f385854e = new k52.n(this);

    /* renamed from: g, reason: collision with root package name */
    public final k52.m f385856g = new k52.m(this);

    public static final void a(k52.o oVar, android.view.View view, java.lang.String str, java.lang.Object obj, k52.g gVar) {
        k52.f fVar;
        oVar.getClass();
        int id6 = view.getId();
        k52.p pVar = k52.q.f385859a;
        java.lang.String c17 = id6 == -1 ? pVar.c(view) : pVar.b(view);
        java.lang.String r17 = view.getId() == -1 ? c17 : b52.b.r(view.getId());
        r45.a07 a07Var = new r45.a07();
        a07Var.f451135e = c17;
        a07Var.f451134d = r17;
        a07Var.f451142o = java.lang.System.currentTimeMillis();
        a07Var.f451140m = view.hashCode();
        a07Var.f451136f = b52.b.g(view.getClass().getName());
        if (obj != null) {
            str = obj.getClass().getName();
        }
        a07Var.f451138h = b52.b.g(str);
        a07Var.f451139i = gVar.f385839d;
        a07Var.f451148u = view instanceof android.view.ViewGroup ? 1 : 0;
        if (gVar != k52.g.f385827e && (fVar = oVar.f385850a) != null) {
            ((k52.j) fVar).a(view, a07Var);
        }
        int hashCode = view.hashCode();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (hashCode != oVar.f385857h || currentTimeMillis - oVar.f385858i >= 500) {
            oVar.f385857h = hashCode;
            oVar.f385858i = currentTimeMillis;
            java.util.Iterator it = ((java.util.ArrayList) oVar.f385851b).iterator();
            while (it.hasNext()) {
                e42.j0 j0Var = (e42.j0) it.next();
                if (gVar == k52.g.f385828f) {
                    j0Var.x(view);
                } else if (gVar == k52.g.f385827e) {
                    j0Var.C(view);
                } else if (gVar == k52.g.f385829g) {
                    j0Var.k(view);
                } else if (gVar == k52.g.f385830h) {
                    j0Var.K(view);
                } else if (gVar == k52.g.f385831i) {
                    j0Var.h(view);
                } else if (gVar == k52.g.f385832m) {
                    j0Var.b(view);
                } else if (gVar == k52.g.f385833n) {
                    j0Var.e(view);
                } else if (gVar == k52.g.f385835p) {
                    j0Var.l(view);
                } else {
                    j0Var.D(view);
                }
            }
        }
    }
}
