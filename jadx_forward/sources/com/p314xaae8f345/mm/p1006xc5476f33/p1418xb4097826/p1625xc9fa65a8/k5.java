package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 f207280a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.ju2 f207281b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f207282c;

    static {
        r45.ju2 ju2Var = new r45.ju2();
        f207281b = ju2Var;
        f207282c = new java.util.HashMap();
        try {
            ju2Var.mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n + "ringtone-search-history.info", 0, -1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderSearchHistoryLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public final void a() {
        java.util.Iterator it = f207282c.values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d5) it.next()).mo58947xce0038c9();
        }
    }

    public final void b(java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        r45.ku2 ku2Var = new r45.ku2();
        int i17 = 0;
        ku2Var.set(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ku2Var.set(1, query);
        synchronized (this) {
            java.util.LinkedList m75941xfb821914 = f207281b.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                int size = m75941xfb821914.size();
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.ku2) m75941xfb821914.get(i17)).m75945x2fec8307(1), query)) {
                        m75941xfb821914.remove(i17);
                        break;
                    }
                    i17++;
                }
                m75941xfb821914.addFirst(ku2Var);
                if (m75941xfb821914.size() > 20) {
                    m75941xfb821914.removeLast();
                }
            }
        }
        a();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j5(this));
    }
}
