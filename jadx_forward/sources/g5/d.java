package g5;

/* loaded from: classes13.dex */
public abstract class d implements f5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f350410a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f350411b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.f f350412c;

    /* renamed from: d, reason: collision with root package name */
    public g5.c f350413d;

    public d(h5.f fVar) {
        this.f350412c = fVar;
    }

    public abstract boolean a(j5.w wVar);

    public abstract boolean b(java.lang.Object obj);

    public void c(java.lang.Iterable iterable) {
        ((java.util.ArrayList) this.f350410a).clear();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j5.w wVar = (j5.w) it.next();
            if (a(wVar)) {
                ((java.util.ArrayList) this.f350410a).add(wVar.f379297a);
            }
        }
        if (((java.util.ArrayList) this.f350410a).isEmpty()) {
            h5.f fVar = this.f350412c;
            synchronized (fVar.f360522c) {
                if (fVar.f360523d.remove(this) && fVar.f360523d.isEmpty()) {
                    fVar.d();
                }
            }
        } else {
            h5.f fVar2 = this.f350412c;
            synchronized (fVar2.f360522c) {
                try {
                    if (fVar2.f360523d.add(this)) {
                        if (fVar2.f360523d.size() == 1) {
                            fVar2.f360524e = fVar2.a();
                            a5.a0.c().a(h5.f.f360519f, java.lang.String.format("%s: initial state = %s", fVar2.getClass().getSimpleName(), fVar2.f360524e), new java.lang.Throwable[0]);
                            fVar2.c();
                        }
                        java.lang.Object obj = fVar2.f360524e;
                        this.f350411b = obj;
                        d(this.f350413d, obj);
                    }
                } finally {
                }
            }
        }
        d(this.f350413d, this.f350411b);
    }

    public final void d(g5.c cVar, java.lang.Object obj) {
        if (((java.util.ArrayList) this.f350410a).isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            java.util.List list = this.f350410a;
            f5.d dVar = (f5.d) cVar;
            synchronized (dVar.f341108c) {
                f5.c cVar2 = dVar.f341106a;
                if (cVar2 != null) {
                    cVar2.a(list);
                }
            }
            return;
        }
        java.util.List list2 = this.f350410a;
        f5.d dVar2 = (f5.d) cVar;
        synchronized (dVar2.f341108c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (dVar2.a(str)) {
                    a5.a0.c().a(f5.d.f341105d, java.lang.String.format("Constraints met for %s", str), new java.lang.Throwable[0]);
                    arrayList.add(str);
                }
            }
            f5.c cVar3 = dVar2.f341106a;
            if (cVar3 != null) {
                cVar3.f(arrayList);
            }
        }
    }
}
