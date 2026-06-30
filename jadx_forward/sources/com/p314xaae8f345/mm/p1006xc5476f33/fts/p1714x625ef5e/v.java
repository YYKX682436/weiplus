package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class v extends p13.c {
    public int A;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l B;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashSet f219231p;

    /* renamed from: y, reason: collision with root package name */
    public int f219240y;

    /* renamed from: z, reason: collision with root package name */
    public int f219241z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f219229n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f219230o = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f219232q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public long f219233r = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f219234s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f219235t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f219236u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f219237v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f219238w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f219239x = 0;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m mVar) {
        this.B = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildContactIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building contact index.");
        o("start");
        java.util.HashSet hashSet = this.f219231p;
        java.util.HashSet hashSet2 = this.f219230o;
        java.util.HashMap hashMap = this.f219229n;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.B;
        if (hashSet == null) {
            this.f219231p = new java.util.HashSet();
            android.database.Cursor I = lVar.f219121g.I(o13.d.f423757j, true, false, true, false, true);
            while (I.moveToNext()) {
                java.lang.String string = I.getString(1);
                int i18 = I.getInt(2);
                long j17 = I.getLong(0);
                if (i18 == 1) {
                    java.util.List list = (java.util.List) hashMap.get(string);
                    if (list == null) {
                        list = new java.util.ArrayList(16);
                        hashMap.put(string, list);
                    }
                    list.add(java.lang.Long.valueOf(j17));
                } else {
                    this.f219231p.add(string);
                    if (i18 == 2) {
                        hashSet2.add(string);
                    }
                }
            }
            I.close();
            this.f219240y = hashMap.size();
            this.f219241z = hashSet2.size();
            int size = this.f219231p.size();
            this.A = size;
            if (size < 5) {
                this.f432601h |= 1;
            }
        }
        o("getBuildContact");
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        if (!hashMap.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((java.util.List) it.next());
            }
            hashMap.clear();
            lVar.f219121g.m(arrayList);
        }
        o("deleteDirtyContact");
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        if (!hashSet2.isEmpty()) {
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                lVar.f219121g.M(str, ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).b(str));
            }
            hashSet2.clear();
        }
        o("updateTimestampContact");
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).e("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE ROWID > ? AND deleteFlag=0 ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f219233r)}, 2);
        int i19 = 50;
        while (true) {
            boolean moveToNext = e17.moveToNext();
            java.util.HashMap hashMap2 = this.f219232q;
            if (!moveToNext) {
                e17.close();
                lVar.f219121g.j();
                o("buildWXContact");
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    throw new java.lang.InterruptedException();
                }
                android.database.Cursor e18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).e("SELECT rowid, chatroomname, memberlist, roomdata FROM chatroom WHERE ROWID > ? ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f219234s)}, 2);
                int i27 = 50;
                while (e18.moveToNext()) {
                    if (java.lang.Thread.interrupted() || this.f432599f) {
                        e18.close();
                        lVar.f219121g.j();
                        throw new java.lang.InterruptedException();
                    }
                    this.f219234s = e18.getLong(0);
                    java.lang.String string2 = e18.getString(1);
                    if (!this.f219231p.remove(string2)) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap2.get(string2);
                        if (z3Var == null) {
                            this.f219239x++;
                        } else {
                            java.lang.String string3 = e18.getString(2);
                            byte[] blob = e18.getBlob(3);
                            try {
                                java.lang.String[] split = o13.c.f423741a.split(string3);
                                java.util.Arrays.sort(split, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u(this));
                                i27 = i27 + lVar.t(string2, split) + this.B.j(string2, z3Var, string3, split, blob);
                                this.f219235t++;
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e19, "Build contact index failed with exception.\n", new java.lang.Object[0]);
                                this.f219239x++;
                            }
                            if (i27 >= 50) {
                                lVar.f219121g.j();
                                lVar.f219121g.h();
                                i27 = 0;
                            }
                        }
                    }
                }
                e18.close();
                lVar.f219121g.j();
                o("buildChatroomContact");
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    throw new java.lang.InterruptedException();
                }
                this.f219237v = this.f219231p.size();
                java.util.Iterator it7 = this.f219231p.iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it7.next();
                    w13.b bVar = lVar.f219121g;
                    int[] iArr = o13.d.f423757j;
                    bVar.m0(iArr, str2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij().f219167g.m0(iArr, str2);
                }
                this.f219231p.clear();
                hashMap2.clear();
                o("deleteUnusedContact");
                return true;
            }
            if (java.lang.Thread.interrupted() || this.f432599f) {
                break;
            }
            long j18 = e17.getLong(0);
            this.f219233r = j18;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var2.E2 = j18;
            z3Var2.X1(e17.getString(1));
            z3Var2.k1(e17.getString(2));
            z3Var2.n1(e17.getString(3));
            z3Var2.M1(e17.getString(4));
            z3Var2.Z1(e17.getInt(5));
            z3Var2.l3(e17.getInt(6));
            z3Var2.L1(e17.getBlob(7));
            z3Var2.r1(e17.getString(8));
            z3Var2.z1(0);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var2.d1())) {
                hashMap2.put(z3Var2.d1(), z3Var2);
            } else if (lVar.p(z3Var2) && !this.f219231p.remove(z3Var2.d1())) {
                if (i19 >= 50) {
                    lVar.f219121g.j();
                    lVar.f219121g.h();
                    i17 = 0;
                } else {
                    i17 = i19;
                }
                try {
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var2.d1())) {
                        lVar.s(z3Var2);
                        z3Var2.Z4();
                    }
                    i17 += lVar.m(z3Var2);
                    this.f219236u++;
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e27, "Build contact index failed with exception.\n", new java.lang.Object[0]);
                    this.f219238w++;
                }
                i19 = i17;
            }
        }
        e17.close();
        lVar.f219121g.j();
        throw new java.lang.InterruptedException();
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{build: %d newContact: %d, newChatroom: %d, remove: %d, dirty: %d, timestamp: %d, failContact: %d, failChatroom}", java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(this.f219236u), java.lang.Integer.valueOf(this.f219235t), java.lang.Integer.valueOf(this.f219237v), java.lang.Integer.valueOf(this.f219240y), java.lang.Integer.valueOf(this.f219241z), java.lang.Integer.valueOf(this.f219238w), java.lang.Integer.valueOf(this.f219239x));
    }

    @Override // p13.c
    public int k() {
        return 1;
    }
}
