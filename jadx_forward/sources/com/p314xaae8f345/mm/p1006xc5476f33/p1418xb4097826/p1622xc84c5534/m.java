package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f206650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6470x6ad7892f f206651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n f206652g;

    public m(java.lang.String str, long j17, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6470x6ad7892f c6470x6ad7892f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n nVar) {
        this.f206649d = str;
        this.f206650e = j17;
        this.f206651f = c6470x6ad7892f;
        this.f206652g = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list;
        long j17;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = this.f206649d;
        final long j18 = this.f206650e;
        final java.lang.String X8 = cj6.X8(str);
        if (cj6.Da(X8)) {
            final int i17 = Integer.MAX_VALUE;
            final int i18 = Integer.MAX_VALUE;
            list = ot0.c3.l().e("getAllMessageAfterCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.m(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j18, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f275522r.f("Select * From " + X8 + " Where " + g9Var.Z8(str) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit " + i18 + ";", new java.lang.String[]{"" + j18}, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        arrayList.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        } else if (cj6.Pb(X8)) {
            list = ot0.z2.f430355a.m(cj6.f275522r, X8, str, j18, Integer.MAX_VALUE);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor f17 = cj6.f275522r.f("Select * From " + X8 + " Where " + cj6.Z8(str) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 2147483647;", new java.lang.String[]{"" + j18}, 2);
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(f17);
                arrayList.add(f9Var);
            }
            f17.close();
            list = arrayList;
        }
        long j19 = 0;
        if (list != null) {
            j17 = 0;
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : list) {
                if (f9Var2.mo78013xfb85f7b0() != 570425393 && f9Var2.mo78013xfb85f7b0() != 10000 && f9Var2.mo78013xfb85f7b0() != 10001 && f9Var2.mo78013xfb85f7b0() != 10002) {
                    int A0 = f9Var2.A0();
                    if (A0 == 0) {
                        j19++;
                    } else if (A0 == 1) {
                        j17++;
                    }
                }
            }
        } else {
            j17 = 0;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6470x6ad7892f c6470x6ad7892f = this.f206651f;
        c6470x6ad7892f.f138134n = j19;
        c6470x6ad7892f.f138135o = j17;
        c6470x6ad7892f.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        this.f206652g.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.a(pVar, "RecordFinderChatEnter", c6470x6ad7892f);
    }
}
