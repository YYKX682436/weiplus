package ic2;

/* loaded from: classes2.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f371888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic2.p0 f371889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.hx0 hx0Var, ic2.p0 p0Var) {
        super(0);
        this.f371888d = hx0Var;
        this.f371889e = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        r45.qw2 qw2Var = new r45.qw2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f371888d.m75934xbce7f2f(1);
        if (m75934xbce7f2f != null) {
            qw2Var.mo11468x92b714fd(m75934xbce7f2f.g());
            java.util.LinkedList m75941xfb8219142 = qw2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
            if (true ^ m75941xfb8219142.isEmpty()) {
                this.f371889e.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncHandler", "sync spam obj %s", java.lang.Integer.valueOf(qw2Var.m75941xfb821914(0).size()));
                cu2.t tVar = cu2.u.f303974a;
                java.util.LinkedList m75941xfb8219143 = qw2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getObject(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
                java.util.Iterator it = m75941xfb8219143.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((r45.pc6) it.next()).m75942xfb822ef2(0)));
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
                Pj.getClass();
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                bu2.d0 d0Var = bu2.e0.f106031a;
                kz5.n0.Q0(arrayList);
                for (java.lang.Integer num : bu2.e0.f106033c) {
                    int intValue = num.intValue();
                    bu2.d0 d0Var2 = bu2.e0.f106031a;
                    d0Var2.l(intValue);
                    java.util.LinkedList m75941xfb8219144 = bu2.e0.f106035e.a(intValue).f106026c.m75941xfb821914(0);
                    if (m75941xfb8219144 != null && (y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219144, 0)) != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                        pm0.v.d0(m75941xfb821914, new bu2.u(arrayList, c0Var));
                        if (c0Var.f391645d) {
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            d0Var2.b(bu2.e0.f106035e.a(intValue));
                        }
                    }
                }
                android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
                l75.k0 k0Var = Pj.f208293f;
                android.database.Cursor f17 = k0Var.f("SELECT id, createTime from FinderFeedItem ORDER BY createTime DESC LIMIT 100", null, 2);
                try {
                    if (f17.moveToFirst()) {
                        while (!f17.isAfterLast()) {
                            long j17 = f17.getLong(0);
                            if (j17 != 0) {
                                longSparseArray.put(j17, java.lang.Long.valueOf(j17));
                            }
                            f17.moveToNext();
                        }
                    }
                    vz5.b.a(f17, null);
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        long longValue = ((java.lang.Number) it6.next()).longValue();
                        bu2.j.f106067a.l(longValue);
                        if (longSparseArray.indexOfKey(longValue) >= 0) {
                            k0Var.mo70514xb06685ab(dm.i4.f66894xc4fe047c, "id=?", new java.lang.String[]{"" + longValue});
                        }
                    }
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedStorage", "[deleteByGroupId] size=" + arrayList.size() + " COST=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                    cu2.t tVar2 = cu2.u.f303974a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedLogic", "delete feed size=$" + arrayList.size() + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                } finally {
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
