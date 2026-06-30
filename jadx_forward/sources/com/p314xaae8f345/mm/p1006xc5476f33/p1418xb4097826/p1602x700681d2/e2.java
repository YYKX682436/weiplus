package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f203829a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9 f203830b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9();

    /* renamed from: c, reason: collision with root package name */
    public r45.vx0 f203831c;

    public final jz5.l a(long j17, r45.vx0 vx0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b bVar;
        java.util.List list;
        java.lang.Object obj;
        java.lang.Object obj2;
        this.f203831c = vx0Var;
        if (!this.f203829a.isEmpty()) {
            this.f203829a.clear();
        }
        boolean z18 = false;
        long m75942xfb822ef2 = vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L;
        int m75939xb282bd08 = vx0Var != null ? vx0Var.m75939xb282bd08(10) : 0;
        if (z17) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203798a) {
                list = (java.util.List) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203799b).get(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a(m75942xfb822ef2, m75939xb282bd08));
            }
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) obj).f204041d) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) obj;
                if (z1Var != null && z1Var.mo2128x1ed62e84() != j17) {
                    z1Var.f204041d = false;
                }
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (j17 == ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) obj2).mo2128x1ed62e84()) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) obj2;
                if (z1Var2 != null) {
                    z1Var2.f204041d = true;
                }
                this.f203829a.addAll(list);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListLoader", "onAttach hit data cache, size: " + list.size());
                z18 = true;
            }
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203798a) {
                bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203800c).get(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a(m75942xfb822ef2, m75939xb282bd08));
            }
        } else {
            bVar = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListLoader", "onAttach id: " + m75942xfb822ef2 + ", extra:" + bVar + ", hitCache:" + z18);
        if (!z18) {
            return new jz5.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b(null, true, true), java.lang.Boolean.valueOf(z18));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        return new jz5.l(bVar, java.lang.Boolean.valueOf(z18));
    }
}
