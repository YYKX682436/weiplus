package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class o90 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gk2 f208831a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f208832b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f208833c;

    public o90(r45.gk2 section) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(section, "section");
        this.f208831a = section;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f208832b = linkedList;
        java.util.LinkedList m75941xfb821914 = section.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            java.util.ArrayList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                if ((c19792x256d2725 != null ? c19792x256d2725.m76802x2dd01666() : null) != null) {
                    arrayList.add(obj);
                }
            }
            list = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 : arrayList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
                list.add(cu2.u.f303974a.p(h90Var.a(c19792x256d27252, 1)));
            }
        } else {
            list = kz5.p0.f395529d;
        }
        linkedList.addAll(list);
        this.f208833c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.n90(this));
    }

    public final int a() {
        return c().m75939xb282bd08(4);
    }

    public final java.lang.String b() {
        java.lang.String m75945x2fec8307 = c().m75945x2fec8307(1);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public final r45.xu2 c() {
        r45.xu2 xu2Var = (r45.xu2) this.f208831a.m75936x14adae67(0);
        if (xu2Var != null) {
            return xu2Var;
        }
        r45.xu2 xu2Var2 = new r45.xu2();
        xu2Var2.set(0, "");
        xu2Var2.set(1, "");
        xu2Var2.set(2, "");
        xu2Var2.set(3, 0);
        xu2Var2.set(4, 0);
        xu2Var2.set(5, "");
        xu2Var2.set(6, "");
        xu2Var2.set(7, "");
        xu2Var2.set(8, 0);
        return xu2Var2;
    }

    public final java.lang.String d() {
        java.lang.String m75945x2fec8307 = c().m75945x2fec8307(0);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }
}
