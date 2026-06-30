package qe2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f443586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f443588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f443589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, android.content.Context context, com.p314xaae8f345.mm.p944x882e457a.f fVar, java.util.List list) {
        super(0);
        this.f443586d = f4Var;
        this.f443587e = context;
        this.f443588f = fVar;
        this.f443589g = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.dm2 m76806xdef68064;
        r45.d50 d50Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f443586d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Context context = this.f443587e;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showFromShare: activity destroyed, skip show sheet");
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f443588f;
        int i17 = fVar.f152148a;
        java.util.List<qe2.c> list = this.f443589g;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null && (m76760x76845fea = c19792x256d2725.m76760x76845fea()) != null) {
                java.lang.String m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c();
                if (!(m76197x6c03c64c == null || m76197x6c03c64c.length() == 0)) {
                    java.lang.String m76197x6c03c64c2 = m76760x76845fea.m76197x6c03c64c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76197x6c03c64c2);
                    hashMap.put(m76197x6c03c64c2, m76760x76845fea);
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 != null && (m76806xdef68064 = c19792x256d27252.m76806xdef68064()) != null && (d50Var = (r45.d50) m76806xdef68064.m75936x14adae67(63)) != null && (m75941xfb821914 = d50Var.m75941xfb821914(1)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next();
                    if (c19782x23db1cfa2 != null) {
                        java.lang.String m76197x6c03c64c3 = c19782x23db1cfa2.m76197x6c03c64c();
                        if (!(m76197x6c03c64c3 == null || m76197x6c03c64c3.length() == 0)) {
                            java.lang.String m76197x6c03c64c4 = c19782x23db1cfa2.m76197x6c03c64c();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76197x6c03c64c4);
                            hashMap.put(m76197x6c03c64c4, c19782x23db1cfa2);
                        }
                    }
                }
            }
            for (qe2.c cVar : list) {
                if (!(cVar.f443568a.length() == 0) && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) hashMap.get(cVar.f443568a)) != null) {
                    if (cVar.f443570c.length() == 0) {
                        java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
                        if (!(m76175x6d346f39 == null || m76175x6d346f39.length() == 0)) {
                            java.lang.String m76175x6d346f392 = c19782x23db1cfa.m76175x6d346f39();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76175x6d346f392);
                            cVar.f443570c = m76175x6d346f392;
                        }
                    }
                    if (cVar.f443569b.length() == 0) {
                        java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
                        if (!(m76184x8010e5e4 == null || m76184x8010e5e4.length() == 0)) {
                            java.lang.String m76184x8010e5e42 = c19782x23db1cfa.m76184x8010e5e4();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76184x8010e5e42);
                            cVar.f443569b = m76184x8010e5e42;
                        }
                    }
                    cVar.f443571d = c19782x23db1cfa.m76170x756826b3() == ya2.b2.Q2;
                    if (c19782x23db1cfa.m76160xd133dfec() != null) {
                        cVar.f443572e = c19782x23db1cfa.m76160xd133dfec();
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showFromShare: CGI finished, show sheet");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showFromShare: CGI failed errType=" + fVar.f152148a + ", show sheet with fallback data");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(new w.h(context, list), null, false, 0, 7, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showSheet: count=" + list.size());
        return jz5.f0.f384359a;
    }
}
