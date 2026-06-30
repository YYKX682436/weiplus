package qv3;

/* loaded from: classes5.dex */
public final class d extends wt3.c0 implements wt3.j0 {

    /* renamed from: o, reason: collision with root package name */
    public nv3.f f448486o;

    /* renamed from: p, reason: collision with root package name */
    public wt3.i0 f448487p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f448488q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(im5.b lifeCycleKeeper, yu3.a createInfo, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lifeCycleKeeper, createInfo.f547384a);
        int i19 = (i18 & 4) != 0 ? 1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createInfo, "createInfo");
        this.f448486o = new nv3.f(lifeCycleKeeper, this.f530932h, this.f530928d, i19, createInfo.f547391h, 0, null, null, new qv3.c(this), 224, null);
    }

    @Override // wt3.j0
    public void a(wt3.i0 i0Var) {
        this.f448487p = i0Var;
    }

    @Override // wt3.j0
    /* renamed from: getHelper */
    public nv3.f mo160996x1c5132a4() {
        return this.f448486o;
    }

    @Override // wt3.e
    public void h(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        java.util.List list = null;
        if (!d()) {
            gVar = null;
        }
        java.util.List list2 = this.f448488q;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) it.next()).C);
            }
            list = kz5.n0.S0(arrayList);
        }
        this.f448486o.a(z17, gVar, list);
    }
}
