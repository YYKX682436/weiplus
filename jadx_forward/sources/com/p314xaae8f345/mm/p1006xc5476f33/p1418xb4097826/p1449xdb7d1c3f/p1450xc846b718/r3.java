package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f187331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 f187332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f187333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f187334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(java.util.HashSet hashSet, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var, java.util.HashSet hashSet2, java.util.ArrayList arrayList) {
        super(1);
        this.f187331d = hashSet;
        this.f187332e = w3Var;
        this.f187333f = hashSet2;
        this.f187334g = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean contains = this.f187331d.contains(it);
        if (contains) {
            boolean y07 = it.y0("FinderEntrance");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var = this.f187332e;
            if (y07) {
                r45.f03 I0 = it.I0("FinderEntrance");
                if (I0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, it, I0, 7, 0, null, null, 56, null);
                }
                w3Var.f187491d.o0("Finder.RedDotExpiredHandler", it);
            }
            w3Var.f187491d.F(it.f65874xb5f7102a, "Expired");
            java.util.HashSet hashSet = this.f187333f;
            if (hashSet.contains(it)) {
                return java.lang.Boolean.valueOf(contains);
            }
            hashSet.add(it);
            this.f187334g.add(it.u1());
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
