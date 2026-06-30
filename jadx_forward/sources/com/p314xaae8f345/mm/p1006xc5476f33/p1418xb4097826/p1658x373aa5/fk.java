package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class fk implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk f213643d;

    public fk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk hkVar) {
        this.f213643d = hkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.Object obj;
        ?? linkedList;
        java.util.LinkedList m75941xfb821914;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj2 = holder.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "getAssociatedObject(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk hkVar = this.f213643d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.so soVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.so) hkVar;
        soVar.getClass();
        java.lang.Object obj3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) obj2).f213433d;
        r45.u24 u24Var = (r45.u24) obj3;
        if (u24Var.m75939xb282bd08(1) == 7) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 b17 = soVar.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kp kpVar = soVar.f214604e;
            b17.h(kpVar);
            java.util.Iterator it = soVar.f213783c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.u24) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) obj).f213433d).m75939xb282bd08(1) == 7) {
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk dkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) obj;
            if (dkVar != null) {
                r45.u24 u24Var2 = (r45.u24) dkVar.f213433d;
                r45.j73 j73Var = (r45.j73) u24Var2.m75936x14adae67(2);
                if (j73Var == null || (m75941xfb821914 = j73Var.m75941xfb821914(2)) == null) {
                    linkedList = new java.util.LinkedList();
                } else {
                    linkedList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (it6.hasNext()) {
                        linkedList.add(java.lang.Integer.valueOf(((r45.ob0) it6.next()).m75939xb282bd08(1)));
                    }
                }
                kpVar.getClass();
                java.util.ArrayList arrayList = kpVar.f214058g;
                arrayList.clear();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ep(((java.lang.Number) it7.next()).intValue()));
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ep(0));
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = kpVar.f214059h;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                r45.j73 j73Var2 = (r45.j73) u24Var2.m75936x14adae67(2);
                soVar.f214605f.f213329h = j73Var2 != null ? j73Var2.m75939xb282bd08(0) : 0;
            }
        } else {
            soVar.f214603d.mo149xb9724478(obj3, 0);
        }
        if (u24Var.m75939xb282bd08(1) != 7) {
            hkVar.b().q();
        }
    }
}
