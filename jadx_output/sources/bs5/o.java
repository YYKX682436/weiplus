package bs5;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public final tr5.r f24052d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f24049a = new java.util.Vector();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f24050b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f24051c = java.util.Collections.synchronizedSet(new android.util.ArraySet());

    /* renamed from: e, reason: collision with root package name */
    public final ur5.c f24053e = ur5.b.f430435a;

    /* renamed from: f, reason: collision with root package name */
    public final xr5.a f24054f = new xr5.a();

    public o(tr5.r rVar) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        this.f24052d = rVar;
        bs5.m mVar = new bs5.m(this);
        synchronized (pr5.d.class) {
            if (pr5.d.f358047a != null) {
                pr5.a aVar = (pr5.a) pr5.d.f358047a;
                synchronized (aVar) {
                    aVar.f358046b.add(mVar);
                }
            }
        }
    }

    public void a(java.lang.String str) {
        if (kr5.p.f311571b.f311560o) {
            this.f24053e.getClass();
            if (android.text.TextUtils.isEmpty(str)) {
                ur5.b.f430435a.b();
                return;
            }
            java.lang.String[] split = str.split(",");
            if (split.length <= 1) {
                ur5.b.f430435a.c(str);
                return;
            }
            for (java.lang.String str2 : split) {
                ur5.b.f430435a.c(str2);
            }
        }
    }

    public tr5.g0 b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        ur5.c cVar = this.f24053e;
        cVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        tr5.g0 g0Var = (tr5.g0) ((java.util.concurrent.ConcurrentHashMap) cVar.f430436a).get(str);
        if (g0Var == null) {
            return null;
        }
        bs5.g gVar = (bs5.g) g0Var.f421493e;
        boolean z17 = kr5.p.f311571b.f311560o;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = gVar.f24033p > currentTimeMillis && currentTimeMillis > gVar.f24034q;
        if (z17 || z18) {
            return g0Var;
        }
        or5.b.a("Cache of %s(%d) expired", str, java.lang.Integer.valueOf(this.f24052d.getDescription().f421491b));
        cVar.c(str);
        return null;
    }

    public void c(tr5.f0 f0Var, cs5.a aVar) {
        tr5.f0 f0Var2 = f0Var;
        cs5.a aVar2 = aVar;
        if (f0Var2 == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        if (aVar2 == null) {
            throw new java.lang.IllegalArgumentException("rsp".concat(" can not be null"));
        }
        if (cs5.a.f222126d == aVar2) {
            a(f0Var2.f421489o);
            return;
        }
        java.lang.String[] split = f0Var2.f421489o.split(",");
        java.util.HashMap hashMap = new java.util.HashMap();
        int length = split.length;
        int i17 = 0;
        int i18 = 1;
        java.lang.String[] strArr = aVar2.f222129b;
        if (length > 1) {
            for (java.lang.String str : strArr) {
                java.lang.String[] split2 = str.split(":", 2);
                if (!hashMap.containsKey(split2[0])) {
                    hashMap.put(split2[0], new java.util.ArrayList());
                }
                ((java.util.List) hashMap.get(split2[0])).add(split2[1]);
            }
        } else {
            hashMap.put(split[0], java.util.Arrays.asList(strArr));
        }
        int length2 = split.length;
        int i19 = 0;
        while (i19 < length2) {
            java.lang.String str2 = split[i19];
            java.util.List list = (java.util.List) hashMap.get(str2);
            if (list != null) {
                java.lang.String[] strArr2 = (java.lang.String[]) list.toArray(new java.lang.String[i17]);
                int length3 = split.length;
                java.util.Map map = aVar2.f222130c;
                int intValue = ((java.lang.Integer) (length3 > i18 ? map.get(str2) : map.get("onehost"))).intValue();
                bs5.g gVar = new bs5.g(strArr2, aVar2.f222128a, new bs5.i(this, str2, intValue));
                gVar.f24029i = i17;
                this.f24053e.a(str2, new tr5.g0(strArr2, gVar));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f24050b;
                bs5.n nVar = (bs5.n) concurrentHashMap.get(str2);
                java.util.List list2 = this.f24049a;
                if (nVar != null) {
                    java.lang.Runnable runnable = nVar.f24048a;
                    if (runnable != null) {
                        ((java.util.Vector) list2).remove(runnable);
                        ((lr5.c) lr5.e.f320769b).a(nVar.f24048a);
                        nVar.f24048a = null;
                    }
                } else {
                    nVar = new bs5.n(null);
                }
                kr5.g gVar2 = kr5.p.f311571b;
                java.util.Set set = gVar2.f311552g;
                if (gVar2.f311553h && set != null && set.contains(str2)) {
                    int i27 = this.f24052d.getDescription().f421491b;
                    tr5.e0 e0Var = new tr5.e0(f0Var2);
                    e0Var.e(str2);
                    e0Var.f421470l = true;
                    e0Var.f421465g = false;
                    if ((1 == i27 || 2 == i27 || 3 == i27) ? false : true) {
                        throw new java.lang.IllegalArgumentException("family".concat(" is invalid"));
                    }
                    e0Var.f421467i = i27;
                    e0Var.f421472n = false;
                    tr5.f0 a17 = e0Var.a();
                    this.f24051c.add(a17);
                    bs5.k kVar = new bs5.k(this, str2, i27, a17);
                    nVar.f24048a = kVar;
                    ((java.util.Vector) list2).add(kVar);
                    lr5.f fVar = lr5.e.f320769b;
                    float f17 = intValue * 0.75f;
                    if (f17 <= 60.0f) {
                        f17 = 60.0f;
                    }
                    ((lr5.c) fVar).b(kVar, f17 * 1000.0f);
                }
                if (!concurrentHashMap.containsKey(str2)) {
                    concurrentHashMap.put(str2, nVar);
                }
                java.util.Set set2 = this.f24054f.f456239a;
                if (set2 != null && !set2.isEmpty()) {
                    if (strArr2.length < 2) {
                        continue;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.String str3 : strArr2) {
                            if (sr5.e.a(str3)) {
                                arrayList.add(str3);
                            }
                        }
                        if (arrayList.size() < 2) {
                            continue;
                        } else {
                            java.util.HashSet hashSet = (java.util.HashSet) xr5.a.f456238b;
                            if (hashSet.contains(str2)) {
                                continue;
                            } else {
                                hashSet.add(str2);
                                if (set2.size() > 0) {
                                    java.util.Iterator it = set2.iterator();
                                    if (it.hasNext()) {
                                        android.support.v4.media.f.a(it.next());
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            } else {
                a(str2);
            }
            i19++;
            f0Var2 = f0Var;
            aVar2 = aVar;
            i17 = 0;
            i18 = 1;
        }
    }
}
