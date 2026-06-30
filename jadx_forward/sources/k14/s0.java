package k14;

/* loaded from: classes11.dex */
public class s0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f384906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f384907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f384908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f384909g;

    public s0(k14.x0 x0Var, java.util.HashSet hashSet, long j17, long j18) {
        this.f384909g = x0Var;
        this.f384906d = hashSet;
        this.f384907e = j17;
        this.f384908f = j18;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17;
        java.util.List<p13.y> list = vVar.f432693e;
        java.util.HashSet hashSet = this.f384906d;
        k14.x0 x0Var = this.f384909g;
        if (list != null) {
            for (p13.y yVar : list) {
                hashSet.remove(yVar.f432720e);
                x0Var.f384942h.add(yVar.f432720e);
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            final java.lang.String str = (java.lang.String) it.next();
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            final long j17 = this.f384907e;
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                ot0.c3 l17 = ot0.c3.l();
                final int i18 = 50;
                final int i19 = 1;
                yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$e
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Integer.valueOf(ot0.z2.f430355a.I(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i18, j17, currentTimeMillis, i19));
                    }
                };
                final int i27 = 50;
                final int i28 = 1;
                i17 = l17.b("getCountByTimeWithType", aVar, new yz5.a() { // from class: com.tencent.mm.storage.g9$$f
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND type = " + i27 + " AND createTime >= " + j17 + " AND createTime <= " + currentTimeMillis + " LIMIT " + i28, null, 2);
                        int i29 = f17.moveToFirst() ? f17.getInt(0) : 0;
                        f17.close();
                        return java.lang.Integer.valueOf(i29);
                    }
                });
            } else if (cj6.Pb(X8)) {
                i17 = ot0.z2.f430355a.I(cj6.f275522r, X8, str, 50, j17, currentTimeMillis, 1);
            } else {
                android.database.Cursor f17 = cj6.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND type = 50 AND createTime >= " + j17 + " AND createTime <= " + currentTimeMillis + " LIMIT 1", null, 2);
                int i29 = f17.moveToFirst() ? f17.getInt(0) : 0;
                f17.close();
                i17 = i29;
            }
            if (i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] talker:%s voipCount:%s", str, java.lang.Integer.valueOf(i17));
            } else {
                android.database.Cursor C8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().C8(str, this.f384907e, java.lang.System.currentTimeMillis(), true, 1);
                if (C8.getCount() > 0) {
                    android.database.Cursor C82 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().C8(str, this.f384907e, java.lang.System.currentTimeMillis(), false, 1);
                    if (C82.getCount() <= 0) {
                        x0Var.f384942h.add(str);
                    }
                    C82.close();
                } else {
                    x0Var.f384942h.add(str);
                }
                C8.close();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] query:%s cost:%sms", java.lang.Long.valueOf(this.f384907e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f384908f));
        x0Var.f384938d.countDown();
    }
}
