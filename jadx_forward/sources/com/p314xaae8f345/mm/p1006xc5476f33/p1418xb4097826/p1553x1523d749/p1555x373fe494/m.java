package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes3.dex */
public final class m extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f202379a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n f202380b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n nVar) {
        this.f202380b = nVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            if (k3Var instanceof in5.s0) {
                java.lang.Object obj = ((in5.s0) k3Var).f374658i;
                if (obj instanceof so2.b3) {
                    java.util.HashSet hashSet = this.f202379a;
                    so2.b3 b3Var = (so2.b3) obj;
                    if (!hashSet.contains(java.lang.Long.valueOf(b3Var.hashCode()))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g;
                        android.content.Context context = parent.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        java.lang.String e17 = xy2.c.e(context);
                        java.lang.String m75945x2fec8307 = b3Var.f491801d.m75945x2fec8307(0);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        kVar.c(e17, m75945x2fec8307, "");
                        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = this.f202380b.f204086f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewCallback);
                        zy2.ra Sj = ((c61.p2) ybVar).Sj(viewCallback.f204089d);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.b(kVar, Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null, 4L, null, 4, null);
                        hashSet.add(java.lang.Long.valueOf(b3Var.hashCode()));
                    }
                }
            }
        }
    }
}
