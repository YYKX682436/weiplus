package com.bumptech.glide;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final a7.t0 f43959a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.b f43960b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.g f43961c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.i f43962d;

    /* renamed from: e, reason: collision with root package name */
    public final u6.j f43963e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.g f43964f;

    /* renamed from: g, reason: collision with root package name */
    public final l7.c f43965g;

    /* renamed from: h, reason: collision with root package name */
    public final l7.e f43966h = new l7.e();

    /* renamed from: i, reason: collision with root package name */
    public final l7.d f43967i = new l7.d();

    /* renamed from: j, reason: collision with root package name */
    public final m3.e f43968j;

    public m() {
        r7.e eVar = new r7.e(new m3.g(20), new r7.b(), new r7.c());
        this.f43968j = eVar;
        this.f43959a = new a7.t0(eVar);
        this.f43960b = new l7.b();
        l7.g gVar = new l7.g();
        this.f43961c = gVar;
        this.f43962d = new l7.i();
        this.f43963e = new u6.j();
        this.f43964f = new i7.g();
        this.f43965g = new l7.c();
        java.util.List asList = java.util.Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        java.util.ArrayList arrayList = new java.util.ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (gVar) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(gVar.f316789a);
            ((java.util.ArrayList) gVar.f316789a).clear();
            ((java.util.ArrayList) gVar.f316789a).addAll(arrayList);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!arrayList.contains(str)) {
                    ((java.util.ArrayList) gVar.f316789a).add(str);
                }
            }
        }
    }

    public com.bumptech.glide.m a(java.lang.Class cls, java.lang.Class cls2, a7.q0 q0Var) {
        a7.t0 t0Var = this.f43959a;
        synchronized (t0Var) {
            a7.z0 z0Var = t0Var.f1860a;
            synchronized (z0Var) {
                a7.x0 x0Var = new a7.x0(cls, cls2, q0Var);
                java.util.List list = z0Var.f1882a;
                ((java.util.ArrayList) list).add(((java.util.ArrayList) list).size(), x0Var);
            }
            ((java.util.HashMap) t0Var.f1861b.f1858a).clear();
        }
        return this;
    }

    public com.bumptech.glide.m b(java.lang.Class cls, t6.o oVar) {
        l7.i iVar = this.f43962d;
        synchronized (iVar) {
            ((java.util.ArrayList) iVar.f316793a).add(new l7.h(cls, oVar));
        }
        return this;
    }

    public com.bumptech.glide.m c(java.lang.String str, java.lang.Class cls, java.lang.Class cls2, t6.n nVar) {
        l7.g gVar = this.f43961c;
        synchronized (gVar) {
            gVar.a(str).add(new l7.f(cls, cls2, nVar));
        }
        return this;
    }

    public java.util.List d() {
        java.util.List list;
        l7.c cVar = this.f43965g;
        synchronized (cVar) {
            list = cVar.f316780a;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.isEmpty()) {
            throw new com.bumptech.glide.i();
        }
        return arrayList;
    }

    public java.util.List e(java.lang.Object obj) {
        java.util.List list;
        a7.t0 t0Var = this.f43959a;
        t0Var.getClass();
        java.lang.Class<?> cls = obj.getClass();
        synchronized (t0Var) {
            a7.r0 r0Var = (a7.r0) ((java.util.HashMap) t0Var.f1861b.f1858a).get(cls);
            list = r0Var == null ? null : r0Var.f1854a;
            if (list == null) {
                list = java.util.Collections.unmodifiableList(t0Var.f1860a.c(cls));
                if (((a7.r0) ((java.util.HashMap) t0Var.f1861b.f1858a).put(cls, new a7.r0(list))) != null) {
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
            throw new com.bumptech.glide.j(obj);
        }
        return emptyList;
    }

    public com.bumptech.glide.m f(java.lang.Class cls, java.lang.Class cls2, i7.e eVar) {
        i7.g gVar = this.f43964f;
        synchronized (gVar) {
            ((java.util.ArrayList) gVar.f289397a).add(new i7.f(cls, cls2, eVar));
        }
        return this;
    }
}
