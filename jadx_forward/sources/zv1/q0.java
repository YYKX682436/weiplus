package zv1;

/* loaded from: classes10.dex */
public final class q0 extends zv1.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 f557886b;

    /* renamed from: c, reason: collision with root package name */
    public final zv1.j0 f557887c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f557888d;

    /* renamed from: e, reason: collision with root package name */
    public final zv1.w0 f557889e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f557890f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f557891g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.j0 policy, java.util.List additionalPaths, zv1.w0 w0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(additionalPaths, "additionalPaths");
        this.f557886b = cacheType;
        this.f557887c = policy;
        this.f557888d = additionalPaths;
        this.f557889e = w0Var;
        this.f557890f = jz5.h.b(new zv1.p0(this));
        this.f557891g = jz5.h.b(new zv1.o0(this));
    }

    @Override // zv1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a() {
        return this.f557886b;
    }

    @Override // zv1.d
    public zv1.w0 d() {
        return (zv1.n0) ((jz5.n) this.f557891g).mo141623x754a37bb();
    }

    @Override // zv1.d
    public java.util.List e() {
        java.util.List list = (java.util.List) ((jz5.n) this.f557890f).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((jz5.l) it.next()).f384366d);
        }
        return kz5.n0.Q(kz5.n0.t0(arrayList, this.f557888d));
    }

    @Override // zv1.c
    public zv1.j0 f() {
        return this.f557887c;
    }
}
