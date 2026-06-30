package io2;

/* loaded from: classes2.dex */
public final class m extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f375021a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        so2.j3 j3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null && (j3Var = (so2.j3) s0Var.f374658i) != null) {
                r45.yf2 yf2Var = j3Var.f491974d;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = yf2Var.f472567d;
                java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
                if (!(m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) && !hashSet.contains(m76197x6c03c64c)) {
                    hashSet.add(m76197x6c03c64c);
                    cl0.g gVar = new cl0.g();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = yf2Var.f472567d;
                    gVar.h("finderusername", c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null);
                    gVar.h("tabtype", "会员专区");
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    android.content.Context context = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context, 16L, 2L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                }
            }
        }
        java.util.HashSet hashSet2 = this.f375021a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }
}
