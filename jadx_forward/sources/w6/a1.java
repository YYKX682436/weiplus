package w6;

/* loaded from: classes13.dex */
public class a1 implements w6.k, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final w6.j f524585d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.l f524586e;

    /* renamed from: f, reason: collision with root package name */
    public int f524587f;

    /* renamed from: g, reason: collision with root package name */
    public int f524588g = -1;

    /* renamed from: h, reason: collision with root package name */
    public t6.h f524589h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f524590i;

    /* renamed from: m, reason: collision with root package name */
    public int f524591m;

    /* renamed from: n, reason: collision with root package name */
    public volatile a7.o0 f524592n;

    /* renamed from: o, reason: collision with root package name */
    public java.io.File f524593o;

    /* renamed from: p, reason: collision with root package name */
    public w6.b1 f524594p;

    public a1(w6.l lVar, w6.j jVar) {
        this.f524586e = lVar;
        this.f524585d = jVar;
    }

    @Override // w6.k
    public boolean a() {
        java.util.List list;
        java.util.List d17;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f524586e.a();
        if (arrayList.isEmpty()) {
            return false;
        }
        w6.l lVar = this.f524586e;
        com.p147xb1cd08cc.p148x5de23a5.m mVar = lVar.f524668c.f125479b;
        java.lang.Class<?> cls = lVar.f524669d.getClass();
        java.lang.Class cls2 = lVar.f524672g;
        java.lang.Class cls3 = lVar.f524676k;
        l7.e eVar = mVar.f125499h;
        q7.m mVar2 = (q7.m) eVar.f398317a.getAndSet(null);
        if (mVar2 == null) {
            mVar2 = new q7.m(cls, cls2, cls3);
        } else {
            mVar2.f441839a = cls;
            mVar2.f441840b = cls2;
            mVar2.f441841c = cls3;
        }
        synchronized (eVar.f398318b) {
            list = (java.util.List) eVar.f398318b.m174751x4aabfc28(mVar2, null);
        }
        eVar.f398317a.set(mVar2);
        java.util.List list2 = list;
        if (list == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            a7.t0 t0Var = mVar.f125492a;
            synchronized (t0Var) {
                d17 = t0Var.f83393a.d(cls);
            }
            java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((java.util.ArrayList) mVar.f125494c.b((java.lang.Class) it.next(), cls2)).iterator();
                while (it6.hasNext()) {
                    java.lang.Class cls4 = (java.lang.Class) it6.next();
                    if (!((java.util.ArrayList) mVar.f125497f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            l7.e eVar2 = mVar.f125499h;
            java.util.List unmodifiableList = java.util.Collections.unmodifiableList(arrayList2);
            synchronized (eVar2.f398318b) {
                eVar2.f398318b.put(new q7.m(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList2;
        }
        if (list2.isEmpty()) {
            if (java.io.File.class.equals(this.f524586e.f524676k)) {
                return false;
            }
            throw new java.lang.IllegalStateException("Failed to find any load path from " + this.f524586e.f524669d.getClass() + " to " + this.f524586e.f524676k);
        }
        while (true) {
            java.util.List list3 = this.f524590i;
            if (list3 != null) {
                if (this.f524591m < list3.size()) {
                    this.f524592n = null;
                    boolean z17 = false;
                    while (!z17) {
                        if (!(this.f524591m < this.f524590i.size())) {
                            break;
                        }
                        java.util.List list4 = this.f524590i;
                        int i17 = this.f524591m;
                        this.f524591m = i17 + 1;
                        a7.p0 p0Var = (a7.p0) list4.get(i17);
                        java.io.File file = this.f524593o;
                        w6.l lVar2 = this.f524586e;
                        this.f524592n = p0Var.b(file, lVar2.f524670e, lVar2.f524671f, lVar2.f524674i);
                        if (this.f524592n != null) {
                            if (this.f524586e.c(this.f524592n.f83381c.a()) != null) {
                                this.f524592n.f83381c.e(this.f524586e.f524680o, this);
                                z17 = true;
                            }
                        }
                    }
                    return z17;
                }
            }
            int i18 = this.f524588g + 1;
            this.f524588g = i18;
            if (i18 >= list2.size()) {
                int i19 = this.f524587f + 1;
                this.f524587f = i19;
                if (i19 >= arrayList.size()) {
                    return false;
                }
                this.f524588g = 0;
            }
            t6.h hVar = (t6.h) arrayList.get(this.f524587f);
            java.lang.Class cls5 = (java.lang.Class) list2.get(this.f524588g);
            t6.p e17 = this.f524586e.e(cls5);
            w6.l lVar3 = this.f524586e;
            this.f524594p = new w6.b1(lVar3.f524668c.f125478a, hVar, lVar3.f524679n, lVar3.f524670e, lVar3.f524671f, e17, cls5, lVar3.f524674i);
            java.io.File a17 = ((w6.e0) lVar3.f524673h).a().a(this.f524594p);
            this.f524593o = a17;
            if (a17 != null) {
                this.f524589h = hVar;
                this.f524590i = this.f524586e.f524668c.f125479b.e(a17);
                this.f524591m = 0;
            }
        }
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        this.f524585d.b(this.f524589h, obj, this.f524592n.f83381c, t6.a.RESOURCE_DISK_CACHE, this.f524594p);
    }

    @Override // w6.k
    /* renamed from: cancel */
    public void mo173234xae7a2e7a() {
        a7.o0 o0Var = this.f524592n;
        if (o0Var != null) {
            o0Var.f83381c.mo751xae7a2e7a();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f524585d.j(this.f524594p, exc, this.f524592n.f83381c, t6.a.RESOURCE_DISK_CACHE);
    }
}
