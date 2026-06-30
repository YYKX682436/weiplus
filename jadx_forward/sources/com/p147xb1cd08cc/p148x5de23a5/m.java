package com.p147xb1cd08cc.p148x5de23a5;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final a7.t0 f125492a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.b f125493b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.g f125494c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.i f125495d;

    /* renamed from: e, reason: collision with root package name */
    public final u6.j f125496e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.g f125497f;

    /* renamed from: g, reason: collision with root package name */
    public final l7.c f125498g;

    /* renamed from: h, reason: collision with root package name */
    public final l7.e f125499h = new l7.e();

    /* renamed from: i, reason: collision with root package name */
    public final l7.d f125500i = new l7.d();

    /* renamed from: j, reason: collision with root package name */
    public final m3.e f125501j;

    public m() {
        r7.e eVar = new r7.e(new m3.g(20), new r7.b(), new r7.c());
        this.f125501j = eVar;
        this.f125492a = new a7.t0(eVar);
        this.f125493b = new l7.b();
        l7.g gVar = new l7.g();
        this.f125494c = gVar;
        this.f125495d = new l7.i();
        this.f125496e = new u6.j();
        this.f125497f = new i7.g();
        this.f125498g = new l7.c();
        java.util.List asList = java.util.Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        java.util.ArrayList arrayList = new java.util.ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (gVar) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(gVar.f398322a);
            ((java.util.ArrayList) gVar.f398322a).clear();
            ((java.util.ArrayList) gVar.f398322a).addAll(arrayList);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!arrayList.contains(str)) {
                    ((java.util.ArrayList) gVar.f398322a).add(str);
                }
            }
        }
    }

    public com.p147xb1cd08cc.p148x5de23a5.m a(java.lang.Class cls, java.lang.Class cls2, a7.q0 q0Var) {
        a7.t0 t0Var = this.f125492a;
        synchronized (t0Var) {
            a7.z0 z0Var = t0Var.f83393a;
            synchronized (z0Var) {
                a7.x0 x0Var = new a7.x0(cls, cls2, q0Var);
                java.util.List list = z0Var.f83415a;
                ((java.util.ArrayList) list).add(((java.util.ArrayList) list).size(), x0Var);
            }
            ((java.util.HashMap) t0Var.f83394b.f83391a).clear();
        }
        return this;
    }

    public com.p147xb1cd08cc.p148x5de23a5.m b(java.lang.Class cls, t6.o oVar) {
        l7.i iVar = this.f125495d;
        synchronized (iVar) {
            ((java.util.ArrayList) iVar.f398326a).add(new l7.h(cls, oVar));
        }
        return this;
    }

    public com.p147xb1cd08cc.p148x5de23a5.m c(java.lang.String str, java.lang.Class cls, java.lang.Class cls2, t6.n nVar) {
        l7.g gVar = this.f125494c;
        synchronized (gVar) {
            gVar.a(str).add(new l7.f(cls, cls2, nVar));
        }
        return this;
    }

    public java.util.List d() {
        java.util.List list;
        l7.c cVar = this.f125498g;
        synchronized (cVar) {
            list = cVar.f398313a;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.isEmpty()) {
            throw new com.p147xb1cd08cc.p148x5de23a5.i();
        }
        return arrayList;
    }

    public java.util.List e(java.lang.Object obj) {
        java.util.List list;
        a7.t0 t0Var = this.f125492a;
        t0Var.getClass();
        java.lang.Class<?> cls = obj.getClass();
        synchronized (t0Var) {
            a7.r0 r0Var = (a7.r0) ((java.util.HashMap) t0Var.f83394b.f83391a).get(cls);
            list = r0Var == null ? null : r0Var.f83387a;
            if (list == null) {
                list = java.util.Collections.unmodifiableList(t0Var.f83393a.c(cls));
                if (((a7.r0) ((java.util.HashMap) t0Var.f83394b.f83391a).put(cls, new a7.r0(list))) != null) {
                    throw new java.lang.IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        int size = list.size();
        java.util.List emptyList = java.util.Collections.emptyList();
        boolean z17 = true;
        for (int i17 = 0; i17 < size; i17++) {
            a7.p0 p0Var = (a7.p0) list.get(i17);
            if (p0Var.a(obj)) {
                if (z17) {
                    emptyList = new java.util.ArrayList(size - i17);
                    z17 = false;
                }
                emptyList.add(p0Var);
            }
        }
        if (emptyList.isEmpty()) {
            throw new com.p147xb1cd08cc.p148x5de23a5.j(obj);
        }
        return emptyList;
    }

    public com.p147xb1cd08cc.p148x5de23a5.m f(java.lang.Class cls, java.lang.Class cls2, i7.e eVar) {
        i7.g gVar = this.f125497f;
        synchronized (gVar) {
            ((java.util.ArrayList) gVar.f370930a).add(new i7.f(cls, cls2, eVar));
        }
        return this;
    }
}
