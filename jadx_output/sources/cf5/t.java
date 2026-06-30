package cf5;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final cf5.t f41027a = new cf5.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f41028b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f41029c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f41030d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f41031e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f41032f;

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        kotlin.jvm.internal.o.f(synchronizedSet, "synchronizedSet(...)");
        f41028b = synchronizedSet;
        f41029c = new java.util.concurrent.ConcurrentHashMap();
        f41030d = new java.util.concurrent.ConcurrentHashMap();
        f41031e = new java.util.concurrent.ConcurrentHashMap();
        f41032f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(java.util.List list, cf5.m mVar) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            v11.r rVar = (v11.r) it.next();
            boolean z18 = rVar instanceof v11.l;
            cf5.t tVar = f41027a;
            if (z18) {
                mVar.f40994f++;
                tVar.c(((v11.l) rVar).f432435b, mVar);
            } else if (rVar instanceof v11.p) {
                tVar.c(((v11.p) rVar).f432453a, mVar);
            } else if (rVar instanceof v11.n) {
                v11.n nVar = (v11.n) rVar;
                java.util.List list2 = nVar.f432444a;
                boolean z19 = false;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        if (((v11.i) it6.next()).f432400b) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                java.util.List list3 = nVar.f432444a;
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    java.util.Iterator it7 = list3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        } else if (!((v11.i) it7.next()).f432400b) {
                            z19 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    mVar.f40995g++;
                }
                if (z19) {
                    mVar.f40996h++;
                }
                mVar.f40997i += nVar.f432444a.size();
                java.util.Iterator it8 = nVar.f432444a.iterator();
                while (it8.hasNext()) {
                    tVar.c(((v11.i) it8.next()).f432402d, mVar);
                }
            } else if (rVar instanceof v11.q) {
                mVar.f40992d++;
                v11.q qVar = (v11.q) rVar;
                java.util.Iterator it9 = qVar.f432454a.iterator();
                while (it9.hasNext()) {
                    tVar.b((v11.k0) it9.next(), mVar);
                }
                java.util.Iterator it10 = qVar.f432455b.iterator();
                while (it10.hasNext()) {
                    java.util.Iterator it11 = ((java.util.List) it10.next()).iterator();
                    while (it11.hasNext()) {
                        tVar.b((v11.k0) it11.next(), mVar);
                    }
                }
            } else if (rVar instanceof v11.k) {
                mVar.f40990b++;
                mVar.f41005q += ((v11.k) rVar).f432426b.length();
            } else if (rVar instanceof v11.j) {
                mVar.f40998j++;
                tVar.a(((v11.j) rVar).f432414a, mVar);
            } else if (rVar instanceof v11.m) {
                mVar.f41000l++;
            } else if (rVar instanceof v11.o) {
                mVar.f40999k++;
            }
        }
    }

    public final void b(v11.k0 k0Var, cf5.m mVar) {
        mVar.f40993e++;
        int i17 = mVar.f41006r;
        java.util.Iterator it = k0Var.f432432e.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += ((v11.a) it.next()).f432318a.length();
        }
        mVar.f41006r = i17 + i18;
        c(k0Var.f432432e, mVar);
    }

    public final void c(java.util.List list, cf5.m mVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            v11.a aVar = (v11.a) it.next();
            if (aVar.f432319b) {
                mVar.f40989a++;
            }
            if (aVar.f432320c) {
                mVar.f41002n++;
            }
            if (aVar.f432321d) {
                mVar.f41003o++;
            }
            if (aVar.f432323f) {
                mVar.f40991c++;
            }
            if (aVar.f432324g) {
                mVar.f41004p++;
            }
            if (aVar.f432322e != null) {
                mVar.f41001m++;
            }
        }
    }

    public final void d(long j17, int i17, long j18, int i18, boolean z17, java.util.List blocks) {
        kotlin.jvm.internal.o.g(blocks, "blocks");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new cf5.s(blocks, j17, i17, j18, i18, z17, null), 1, null);
        }
    }
}
