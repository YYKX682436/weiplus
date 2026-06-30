package ey2;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f338921a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.LongSparseArray f338922b = new android.util.LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.LongSparseArray f338923c = new android.util.LongSparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f338924d = new java.lang.Object();

    public h2(int i17) {
        this.f338921a = i17;
    }

    public final void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(this.f338921a)));
        synchronized (this.f338924d) {
            android.util.LongSparseArray p17 = pm0.v.p(this.f338923c, new ey2.g2(this));
            int size = p17.size();
            for (int i17 = 0; i17 < size; i17++) {
                long keyAt = p17.keyAt(i17);
                java.lang.String str = (java.lang.String) p17.valueAt(i17);
                r45.e13 e13Var = new r45.e13();
                e13Var.set(0, java.lang.Long.valueOf(keyAt));
                e13Var.set(1, str);
                e13Var.set(2, java.lang.Integer.valueOf(this.f338921a));
                e13Var.set(3, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(e13Var.m75942xfb822ef2(0), e13Var.m75945x2fec8307(4), qt2Var.m75939xb282bd08(5)));
                linkedList.add(e13Var);
            }
            if (this.f338923c.size() > 0) {
                this.f338923c.clear();
            }
        }
        if (!linkedList.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkReport] tabType=");
            sb6.append(this.f338921a);
            sb6.append(", begin to report unread... ");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((r45.e13) it.next()).m75942xfb822ef2(0)));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TabStreamUnreadVM", sb6.toString());
            new db2.f(linkedList, qt2Var).l();
        }
    }

    public final ey2.h2 b(java.util.List readList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(readList, "readList");
        synchronized (this.f338924d) {
            java.util.Iterator it = readList.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (this.f338922b.indexOfKey(j5Var.mo2128x1ed62e84()) < 0) {
                    this.f338922b.append(j5Var.mo2128x1ed62e84(), j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59276x6c285d75() : "");
                }
            }
        }
        return this;
    }

    public final boolean c(long j17) {
        return this.f338922b.indexOfKey(j17) >= 0;
    }

    /* renamed from: equals */
    public boolean m128337xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.h2) && this.f338921a == ((ey2.h2) obj).f338921a;
    }

    /* renamed from: hashCode */
    public int m128338x8cdac1b() {
        return java.lang.Integer.hashCode(this.f338921a);
    }

    /* renamed from: toString */
    public java.lang.String m128339x9616526c() {
        return "TabStreamCollector(tabType=" + this.f338921a + ')';
    }
}
