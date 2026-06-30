package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class w extends p13.c {

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashSet f219245o;

    /* renamed from: t, reason: collision with root package name */
    public int f219250t;

    /* renamed from: u, reason: collision with root package name */
    public int f219251u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219252v;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f219244n = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f219246p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f219247q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f219248r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f219249s = 0;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m mVar) {
        this.f219252v = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildLabelIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        java.util.HashSet hashSet = this.f219245o;
        java.util.HashMap hashMap = this.f219244n;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219252v;
        if (hashSet == null) {
            this.f219245o = new java.util.HashSet();
            android.database.Cursor I = lVar.f219121g.I(o13.d.f423759l, true, false, true, false, true);
            while (I.moveToNext()) {
                long j17 = I.getLong(0);
                java.lang.String string = I.getString(1);
                int i17 = I.getInt(2);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(string, 0L);
                if (i17 == 1) {
                    java.util.List list = (java.util.List) hashMap.get(java.lang.Long.valueOf(V));
                    if (list == null) {
                        list = new java.util.ArrayList(2);
                        hashMap.put(java.lang.Long.valueOf(V), list);
                    }
                    list.add(java.lang.Long.valueOf(j17));
                } else {
                    this.f219245o.add(java.lang.Long.valueOf(V));
                }
            }
            I.close();
            this.f219250t = hashMap.size();
            this.f219251u = this.f219245o.size();
        }
        o("getBuildLabel");
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
        o("deleteDirtyLabel");
        java.util.Map a17 = w13.d.f523743a.a(lVar.f219126o);
        android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).e("SELECT rowid, labelID, labelName, lastUseTime FROM ContactLabel WHERE ROWID > ? ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f219246p)}, 2);
        int i18 = 50;
        while (e17.moveToNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                e17.close();
                lVar.f219121g.j();
                throw new java.lang.InterruptedException();
            }
            this.f219246p = e17.getLong(0);
            long j18 = e17.getLong(1);
            if (!this.f219245o.remove(java.lang.Long.valueOf(j18))) {
                java.lang.String string2 = e17.getString(2);
                long j19 = e17.getLong(3);
                try {
                    java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) a17).get(java.lang.Long.valueOf(j18));
                    if (list2 == null) {
                        list2 = new java.util.ArrayList();
                    }
                    i18 += this.f219252v.l(j18, string2, list2, j19);
                    this.f219247q++;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e18, "Build label index failed with exception.\n", new java.lang.Object[0]);
                    this.f219249s++;
                }
                if (i18 >= 50) {
                    lVar.f219121g.j();
                    lVar.f219121g.h();
                    i18 = 0;
                }
            }
        }
        e17.close();
        lVar.f219121g.j();
        o("buildLabel");
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        this.f219248r = this.f219245o.size();
        java.util.Iterator it6 = this.f219245o.iterator();
        while (it6.hasNext()) {
            lVar.f219121g.m0(o13.d.f423759l, java.lang.String.valueOf(((java.lang.Long) it6.next()).longValue()));
        }
        this.f219245o.clear();
        o("deleteUnusedLabel");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{build: %d newLabel: %d, remove: %d, dirty: %d, failContact: %d}", java.lang.Integer.valueOf(this.f219251u), java.lang.Integer.valueOf(this.f219247q), java.lang.Integer.valueOf(this.f219248r), java.lang.Integer.valueOf(this.f219250t), java.lang.Integer.valueOf(this.f219249s));
    }

    @Override // p13.c
    public int k() {
        return 2;
    }
}
