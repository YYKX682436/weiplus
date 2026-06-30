package vp;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f520254a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.TreeSet f520255b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f520256c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final yp.b f520257d;

    /* renamed from: e, reason: collision with root package name */
    public xp.d f520258e;

    /* renamed from: f, reason: collision with root package name */
    public final vp.b f520259f;

    /* renamed from: g, reason: collision with root package name */
    public final zp.i f520260g;

    /* renamed from: h, reason: collision with root package name */
    public final zp.e f520261h;

    public a(xp.d dVar, vp.b bVar, java.util.Comparator comparator, zp.i iVar, zp.e eVar) {
        this.f520258e = dVar;
        this.f520259f = bVar;
        this.f520260g = iVar;
        this.f520261h = eVar;
        this.f520257d = new yp.b(bVar);
        this.f520255b = new java.util.TreeSet(comparator);
        d();
    }

    public abstract void a();

    public final void b(android.graphics.Canvas canvas, long j17, android.view.View view) {
        zp.e eVar;
        vp.z0 z0Var = (vp.z0) this;
        java.util.List list = z0Var.f520413o;
        if (list != null) {
            ((java.util.LinkedList) list).clear();
        }
        int size = ((java.util.ArrayList) z0Var.f520412n).size();
        for (int i17 = 0; i17 < size; i17++) {
            ((java.util.List) ((java.util.ArrayList) z0Var.f520412n).get(i17)).size();
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) z0Var.f520412n).get(i17)).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                eVar = z0Var.f520261h;
                if (!hasNext) {
                    break;
                }
                wp.a aVar = (wp.a) it.next();
                if (aVar.f529880r) {
                    if (z0Var.f520413o == null) {
                        z0Var.f520413o = new java.util.LinkedList();
                    }
                    ((java.util.LinkedList) z0Var.f520413o).add(aVar);
                } else {
                    aVar.t(eVar.f556442b, eVar.f556441a);
                    if (!aVar.l(eVar.f556441a)) {
                        z0Var.f520257d.a(canvas, aVar, z0Var.f520258e, z0Var.f520258e.c(aVar), view);
                        aVar.b();
                    }
                }
            }
            java.util.List list2 = z0Var.f520413o;
            if (list2 != null && !list2.isEmpty()) {
                for (wp.a aVar2 : z0Var.f520413o) {
                    aVar2.t(eVar.f556442b, eVar.f556441a);
                    if (!aVar2.l(eVar.f556441a)) {
                        z0Var.f520257d.a(canvas, aVar2, z0Var.f520258e, z0Var.f520258e.c(aVar2), view);
                        aVar2.b();
                    }
                }
                ((java.util.LinkedList) z0Var.f520413o).clear();
            }
        }
    }

    public abstract wp.a c(zp.m mVar);

    public abstract void d();
}
