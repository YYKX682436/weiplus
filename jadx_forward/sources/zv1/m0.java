package zv1;

/* loaded from: classes10.dex */
public final class m0 extends zv1.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 f557850b;

    /* renamed from: c, reason: collision with root package name */
    public final zv1.j0 f557851c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f557852d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f557853e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.j0 policy, java.util.List subCleaners) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subCleaners, "subCleaners");
        this.f557850b = cacheType;
        this.f557851c = policy;
        this.f557852d = subCleaners;
        this.f557853e = jz5.h.b(new zv1.l0(this));
    }

    @Override // zv1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a() {
        return this.f557850b;
    }

    @Override // zv1.d
    public java.util.Map b() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = this.f557852d.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((zv1.d) it.next()).b().entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                java.lang.Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new java.util.ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((java.util.List) obj).addAll(list);
            }
        }
        for (java.util.Map.Entry entry2 : super.b().entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            java.util.List list2 = (java.util.List) entry2.getValue();
            java.lang.Object obj2 = linkedHashMap.get(str2);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(str2, obj2);
            }
            ((java.util.List) obj2).addAll(list2);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), kz5.n0.Q((java.util.List) entry3.getValue()));
        }
        return linkedHashMap2;
    }

    @Override // zv1.c, zv1.d
    public long c(long j17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        java.lang.Iterable iterable;
        zv1.r rVar;
        if (z17) {
            return j17;
        }
        this.f557811a = null;
        java.util.List<zv1.d> list = this.f557852d;
        long j18 = 0;
        for (zv1.d dVar : list) {
            try {
                j18 += dVar.c(j17 - j18, c26987xeef691ab, z17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanCache.CacheCleanerFactory", th6, "sub-cleaner failed, continue next: cacheType=%s, subCleanerCacheType=%s", this.f557850b, dVar.a());
            }
            if (j18 >= j17) {
                break;
            }
        }
        long j19 = j18;
        int i17 = zv1.f1.f557832w1;
        ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).getClass();
        boolean z18 = zv1.s.f557900f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_auto_clean_cache_with_dirs", zv1.s.f557902h ? "1" : "0"), "1");
        java.util.Iterator it = list.iterator();
        long j27 = 0;
        while (it.hasNext()) {
            j27 += zv1.m.c((zv1.d) it.next());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (zv1.d dVar2 : list) {
            zv1.q qVar = dVar2 instanceof zv1.q ? (zv1.q) dVar2 : null;
            if (qVar == null || (rVar = ((zv1.c) qVar).f557811a) == null || (iterable = rVar.f557896e) == null) {
                iterable = kz5.p0.f395529d;
            }
            kz5.h0.u(arrayList, iterable);
        }
        int i18 = zv1.f1.f557832w1;
        ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).getClass();
        boolean z19 = zv1.s.f557900f;
        this.f557811a = new zv1.r(this, j17, b17, j27, arrayList, c26987xeef691ab, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_auto_clean_cache_debug_mode", zv1.s.f557901g ? "1" : "0"), "1"), z17);
        return j19;
    }

    @Override // zv1.d
    public zv1.w0 d() {
        return (zv1.k0) ((jz5.n) this.f557853e).mo141623x754a37bb();
    }

    @Override // zv1.d
    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f557852d.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((zv1.d) it.next()).e());
        }
        return kz5.n0.Q(kz5.n0.t0(arrayList, super.e()));
    }

    @Override // zv1.c
    public zv1.j0 f() {
        return this.f557851c;
    }
}
