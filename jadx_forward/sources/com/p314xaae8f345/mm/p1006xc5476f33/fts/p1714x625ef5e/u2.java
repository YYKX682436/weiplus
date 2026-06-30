package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class u2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashSet f219220n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f219221o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f219222p = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    /* renamed from: q, reason: collision with root package name */
    public long f219223q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f219224r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f219225s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f219226t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f219227u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219228v;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15582xc030cda5 c15582xc030cda5) {
        this.f219228v = e3Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildServiceNotifyIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        java.lang.String[] strArr;
        int i18;
        int i19 = 0;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_close_wxpay_search_recreate, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "BuildServiceNotifyIndexTask is disable by abtest");
            return false;
        }
        this.f219222p = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f219228v.f219050h.f423731f).k(-201L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        this.f219223q = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Start building service notify index, last createTime: %s last from createTime: %s", java.lang.Long.valueOf(this.f219222p), java.lang.Long.valueOf(this.f219223q));
        int i27 = 2;
        if (this.f219220n == null) {
            this.f219220n = new java.util.HashSet();
            this.f219221o = new java.util.ArrayList();
            android.database.Cursor I = this.f219228v.f219050h.I(o13.d.f423752e, true, true, false, true, true);
            while (I.moveToNext()) {
                long j17 = I.getLong(0);
                long j18 = I.getLong(1);
                long j19 = I.getLong(2);
                if (I.getInt(3) == -1) {
                    this.f219221o.add(java.lang.Long.valueOf(j17));
                } else if (j19 <= this.f219222p) {
                    this.f219220n.add(new android.util.Pair(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
                }
            }
            I.close();
        }
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        java.lang.String[] strArr2 = new java.lang.String[3];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i28 = Integer.MAX_VALUE;
        while (i28 >= 50) {
            strArr2[i19] = java.lang.Long.toString(this.f219222p);
            strArr2[1] = java.lang.Long.toString(this.f219223q);
            strArr2[i27] = java.lang.Integer.toString(this.f219224r);
            android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219228v.f219049g).e("SELECT msgId, createTime, content, type, isSend, talker FROM message WHERE (talker = 'notifymessage' OR talker = 'gh_3dfda90e39d6') AND createTime<=? AND createTime>? ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", strArr2);
            long j27 = 0;
            int i29 = i19;
            while (e17.moveToNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2(this.f219228v, null);
                y2Var.f219277a = e17.getLong(i19);
                y2Var.f219279c = e17.getLong(1);
                y2Var.f219280d = e17.getString(i27);
                e17.getInt(3);
                e17.getInt(4);
                java.lang.String string = e17.getString(5);
                y2Var.f219278b = string;
                if ("gh_3dfda90e39d6".equals(string)) {
                    y2Var.f219281e = 57;
                } else if ("notifymessage".equals(y2Var.f219278b)) {
                    y2Var.f219281e = 56;
                }
                y2Var.a();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y2Var.f219282f)) {
                    arrayList.add(y2Var);
                }
                j27 = y2Var.f219279c;
                i29++;
            }
            e17.close();
            if (java.lang.Thread.interrupted() || this.f432599f) {
                throw new java.lang.InterruptedException();
            }
            int size = arrayList.size();
            if (size == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d offset %s", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(this.f219224r));
            } else {
                int i37 = size - 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d Id FROM %d to %d Time FROM %s to %s offset %s", java.lang.Integer.valueOf(size), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) arrayList.get(i19)).f219277a), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) arrayList.get(i37)).f219277a), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) arrayList.get(i19)).f219279c / 1000), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) arrayList.get(i37)).f219279c / 1000), java.lang.Integer.valueOf(this.f219224r));
            }
            if (size > 0) {
                this.f219228v.f219050h.h();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2 y2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) it.next();
                    long j28 = y2Var2.f219277a;
                    java.lang.String[] strArr3 = strArr2;
                    long j29 = y2Var2.f219279c;
                    int i38 = i29;
                    if (j29 == this.f219222p) {
                        this.f219224r++;
                    } else {
                        this.f219222p = j29;
                        this.f219224r = 0;
                    }
                    if (!this.f219220n.remove(new android.util.Pair(java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29)))) {
                        try {
                            w13.j jVar = this.f219228v.f219050h;
                            int i39 = y2Var2.f219281e;
                            java.lang.String str = y2Var2.f219278b;
                            java.lang.String str2 = str == null ? "" : str;
                            java.lang.String str3 = y2Var2.f219282f;
                            java.lang.String str4 = str3 == null ? "" : str3;
                            java.lang.String str5 = y2Var2.f219283g;
                            jVar.N(524288, i39, j28, str2, j29, str4, str5 == null ? "" : str5);
                            this.f219225s++;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e18, "Build message index failed with exception. \n%s", y2Var2.f219282f);
                            this.f219227u++;
                        }
                    }
                    strArr2 = strArr3;
                    i29 = i38;
                }
                strArr = strArr2;
                i18 = i29;
                this.f219228v.f219050h.j();
                this.f219228v.f219050h.L(-201L, this.f219222p);
            } else {
                strArr = strArr2;
                i18 = i29;
                this.f219222p = j27;
                this.f219224r = 0;
            }
            arrayList.clear();
            if (java.lang.Thread.interrupted() || this.f432599f) {
                throw new java.lang.InterruptedException();
            }
            strArr2 = strArr;
            i28 = i18;
            i19 = 0;
            i27 = 2;
        }
        java.util.Iterator it6 = this.f219220n.iterator();
        int i47 = 50;
        while (it6.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                this.f219228v.f219050h.j();
                throw new java.lang.InterruptedException();
            }
            if (i47 >= 50) {
                this.f219228v.f219050h.j();
                this.f219228v.f219050h.h();
                i47 = 0;
            }
            android.util.Pair pair = (android.util.Pair) it6.next();
            w13.j jVar2 = this.f219228v.f219050h;
            int[] iArr = o13.d.f423752e;
            long longValue = ((java.lang.Long) pair.first).longValue();
            long longValue2 = ((java.lang.Long) pair.second).longValue();
            jVar2.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) jVar2.f423731f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND entity_id=? AND timestamp=?;", jVar2.r()), new java.lang.String[]{java.lang.Long.toString(longValue), java.lang.Long.toString(longValue2)});
            while (true) {
                android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
                if (cursorWrapper.moveToNext()) {
                    arrayList2.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
            jVar2.m(arrayList2);
            i47++;
            this.f219226t++;
            it6.remove();
        }
        this.f219228v.f219050h.j();
        java.util.ArrayList arrayList3 = this.f219221o;
        java.util.ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        int i48 = 50;
        while (listIterator.hasPrevious()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                this.f219228v.f219050h.j();
                throw new java.lang.InterruptedException();
            }
            if (i48 >= 50) {
                this.f219228v.f219050h.j();
                this.f219228v.f219050h.h();
                i17 = 0;
            } else {
                i17 = i48;
            }
            this.f219228v.f219050h.l(((java.lang.Long) listIterator.previous()).longValue());
            i48 = i17 + 1;
            this.f219226t++;
            listIterator.remove();
        }
        this.f219228v.f219050h.L(-201L, this.f219222p - 1);
        this.f219228v.f219050h.j();
        this.f219228v.f219051i = false;
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{new: %d removed: %d failed: %d}", java.lang.Integer.valueOf(this.f219225s), java.lang.Integer.valueOf(this.f219226t), java.lang.Integer.valueOf(this.f219227u));
    }

    @Override // p13.c
    public int k() {
        return 31;
    }
}
