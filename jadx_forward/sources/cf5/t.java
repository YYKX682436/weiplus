package cf5;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final cf5.t f122560a = new cf5.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f122561b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f122562c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f122563d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f122564e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f122565f;

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedSet, "synchronizedSet(...)");
        f122561b = synchronizedSet;
        f122562c = new java.util.concurrent.ConcurrentHashMap();
        f122563d = new java.util.concurrent.ConcurrentHashMap();
        f122564e = new java.util.concurrent.ConcurrentHashMap();
        f122565f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(java.util.List list, cf5.m mVar) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            v11.r rVar = (v11.r) it.next();
            boolean z18 = rVar instanceof v11.l;
            cf5.t tVar = f122560a;
            if (z18) {
                mVar.f122527f++;
                tVar.c(((v11.l) rVar).f513968b, mVar);
            } else if (rVar instanceof v11.p) {
                tVar.c(((v11.p) rVar).f513986a, mVar);
            } else if (rVar instanceof v11.n) {
                v11.n nVar = (v11.n) rVar;
                java.util.List list2 = nVar.f513977a;
                boolean z19 = false;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        if (((v11.i) it6.next()).f513933b) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                java.util.List list3 = nVar.f513977a;
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    java.util.Iterator it7 = list3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        } else if (!((v11.i) it7.next()).f513933b) {
                            z19 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    mVar.f122528g++;
                }
                if (z19) {
                    mVar.f122529h++;
                }
                mVar.f122530i += nVar.f513977a.size();
                java.util.Iterator it8 = nVar.f513977a.iterator();
                while (it8.hasNext()) {
                    tVar.c(((v11.i) it8.next()).f513935d, mVar);
                }
            } else if (rVar instanceof v11.q) {
                mVar.f122525d++;
                v11.q qVar = (v11.q) rVar;
                java.util.Iterator it9 = qVar.f513987a.iterator();
                while (it9.hasNext()) {
                    tVar.b((v11.k0) it9.next(), mVar);
                }
                java.util.Iterator it10 = qVar.f513988b.iterator();
                while (it10.hasNext()) {
                    java.util.Iterator it11 = ((java.util.List) it10.next()).iterator();
                    while (it11.hasNext()) {
                        tVar.b((v11.k0) it11.next(), mVar);
                    }
                }
            } else if (rVar instanceof v11.k) {
                mVar.f122523b++;
                mVar.f122538q += ((v11.k) rVar).f513959b.length();
            } else if (rVar instanceof v11.j) {
                mVar.f122531j++;
                tVar.a(((v11.j) rVar).f513947a, mVar);
            } else if (rVar instanceof v11.m) {
                mVar.f122533l++;
            } else if (rVar instanceof v11.o) {
                mVar.f122532k++;
            }
        }
    }

    public final void b(v11.k0 k0Var, cf5.m mVar) {
        mVar.f122526e++;
        int i17 = mVar.f122539r;
        java.util.Iterator it = k0Var.f513965e.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += ((v11.a) it.next()).f513851a.length();
        }
        mVar.f122539r = i17 + i18;
        c(k0Var.f513965e, mVar);
    }

    public final void c(java.util.List list, cf5.m mVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            v11.a aVar = (v11.a) it.next();
            if (aVar.f513852b) {
                mVar.f122522a++;
            }
            if (aVar.f513853c) {
                mVar.f122535n++;
            }
            if (aVar.f513854d) {
                mVar.f122536o++;
            }
            if (aVar.f513856f) {
                mVar.f122524c++;
            }
            if (aVar.f513857g) {
                mVar.f122537p++;
            }
            if (aVar.f513855e != null) {
                mVar.f122534m++;
            }
        }
    }

    public final void d(long j17, int i17, long j18, int i18, boolean z17, java.util.List blocks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blocks, "blocks");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new cf5.s(blocks, j17, i17, j18, i18, z17, null), 1, null);
        }
    }
}
