package z72;

/* loaded from: classes12.dex */
public class f extends l75.s0 implements o72.k4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f552088d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f552089e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f552090f;

    public f(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f552088d = c26918x6e83759b;
        d95.v vVar = d95.q.f309234a;
        this.f552089e = new d95.z(c26918x6e83759b, true);
        this.f552090f = c26918x6e83759b.m106824x752de218("FavItemInfo", up5.f.f511465b);
    }

    public static java.util.List m0(java.lang.Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        java.util.ArrayList arrayList = iterable instanceof java.util.Collection ? new java.util.ArrayList(((java.util.Collection) iterable).size()) : new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(n0((up5.t) it.next()));
        }
        return arrayList;
    }

    public static o72.r2 n0(up5.t tVar) {
        if (tVar == null) {
            return null;
        }
        o72.r2 r2Var = new o72.r2();
        r2Var.f67645x88be67a1 = tVar.f511592a;
        r2Var.f67643xc8a07680 = tVar.f511593b;
        r2Var.f67657x2262335f = tVar.f511594c;
        r2Var.f67646x8f0eb299 = tVar.f511595d;
        r2Var.f67658x266f95d1 = tVar.f511596e;
        r2Var.f67641x225ba391 = tVar.f511597f;
        r2Var.f67650x85d9e03b = tVar.f511598g;
        r2Var.f67644x3059914a = tVar.f511599h;
        r2Var.f67651x76e81a5a = tVar.f511600i;
        r2Var.f67649xde813d09 = tVar.f511601j;
        r2Var.f67659xa783a79b = tVar.f511602k;
        r2Var.f67642xd3939c3a = tVar.f511603l;
        r2Var.f67655x1209e7cb = tVar.f511604m;
        r2Var.f67647xadb904e6 = tVar.f511605n;
        r2Var.f67640x5ab01132 = (r45.bq0) tp5.a.e(tVar.f511606o, r45.bq0.class);
        r2Var.f67660x4b6e9352 = tVar.f511607p;
        r2Var.f67639x4b6e4d5c = tVar.f511608q;
        r2Var.f67638x7d4eb57c = tVar.f511609r;
        r2Var.f67653xef67d413 = (r45.rq0) tp5.a.e(tVar.f511610s, r45.rq0.class);
        r2Var.f67648xbed8694c = tVar.f511611t;
        r2Var.f67637x73e2be56 = tVar.f511612u;
        r2Var.f67656xf4031e77 = tVar.f511613v;
        r2Var.f67654x36b6411 = tVar.f511614w;
        r2Var.f67652x5334f55 = tVar.f511615x;
        byte[] bArr = tVar.f511606o;
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, favProto size:%s", java.lang.Integer.valueOf(bArr.length));
        }
        byte[] bArr2 = tVar.f511610s;
        if (bArr2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, tagProto size:%s", java.lang.Integer.valueOf(bArr2.length));
        }
        java.lang.String str = tVar.f511607p;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, xml size:%s", java.lang.Integer.valueOf(str.length()));
        }
        return r2Var;
    }

    public static up5.t s0(o72.r2 r2Var) {
        if (r2Var == null) {
            return null;
        }
        up5.t tVar = new up5.t();
        tVar.f511592a = r2Var.f67645x88be67a1;
        tVar.f511593b = r2Var.f67643xc8a07680;
        tVar.f511594c = r2Var.f67657x2262335f;
        tVar.f511595d = r2Var.f67646x8f0eb299;
        tVar.f511596e = r2Var.f67658x266f95d1;
        tVar.f511597f = r2Var.f67641x225ba391;
        tVar.f511598g = r2Var.f67650x85d9e03b;
        tVar.f511599h = r2Var.f67644x3059914a;
        tVar.f511600i = r2Var.f67651x76e81a5a;
        tVar.f511601j = r2Var.f67649xde813d09;
        tVar.f511602k = r2Var.f67659xa783a79b;
        tVar.f511603l = r2Var.f67642xd3939c3a;
        tVar.f511604m = r2Var.f67655x1209e7cb;
        tVar.f511605n = r2Var.f67647xadb904e6;
        tVar.f511606o = tp5.a.h(r2Var.f67640x5ab01132);
        tVar.f511607p = r2Var.f67660x4b6e9352;
        tVar.f511608q = r2Var.f67639x4b6e4d5c;
        tVar.f511609r = r2Var.f67638x7d4eb57c;
        tVar.f511610s = tp5.a.h(r2Var.f67653xef67d413);
        tVar.f511611t = r2Var.f67648xbed8694c;
        tVar.f511612u = r2Var.f67637x73e2be56;
        tVar.f511613v = r2Var.f67656xf4031e77;
        tVar.f511614w = r2Var.f67654x36b6411;
        tVar.f511615x = r2Var.f67652x5334f55;
        byte[] bArr = tVar.f511606o;
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, favProto size:%s", java.lang.Integer.valueOf(bArr.length));
        }
        byte[] bArr2 = tVar.f511610s;
        if (bArr2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, tagProto size:%s", java.lang.Integer.valueOf(bArr2.length));
        }
        java.lang.String str = tVar.f511607p;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, xml size:%s", java.lang.Integer.valueOf(str.length()));
        }
        return tVar;
    }

    @Override // o72.k4
    public java.util.List A0() {
        try {
            return m0(this.f552090f.m107094xde3eb429(up5.f.f511471h.eq(-1).and(up5.f.f511473j.eq(0))));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public int Ah(int i17) {
        try {
            return this.f552090f.m107277x754a37bb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f(), up5.f.f511467d.gt(i17)).m106360xb58848b9();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getFavHomePosition failed with exception: " + th6.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 F(long j17) {
        try {
            return n0((up5.t) this.f552090f.m107127x946de4d9(up5.f.f511466c.eq(j17)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.List I0(int i17) {
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = this.f552090f.m107164x47380ce3().m106435xc9ff34fc(up5.f.a()).m106436x6bdbce7(up5.f.f511473j.eq(1));
        if (i17 > 0) {
            m106436x6bdbce7.m106429x6234bbb(i17);
        }
        try {
            return m0(m106436x6bdbce7.m106424xeffdfc33());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.List Oc(int i17, int i18) {
        try {
            return m0(this.f552090f.m107097xde3eb429(up5.f.f511473j.gt(0).and(up5.f.f511468e.in(8, 14, 18)), up5.f.f511476m.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i18, i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public void Re(dm.n3 n3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "deleteItem itemLocalId:%s itemFavId:%s", java.lang.Long.valueOf(n3Var.f67645x88be67a1), java.lang.Integer.valueOf(n3Var.f67643xc8a07680));
        try {
            this.f552090f.m107088x90df30e9(up5.f.f511466c.eq(n3Var.f67645x88be67a1));
            mo142179xf35bbb4(n3Var.f67645x88be67a1 + "", 5, java.lang.Long.valueOf(n3Var.f67645x88be67a1));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
    }

    @Override // o72.k4
    public java.util.List V1(int i17, int i18, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (i18 == 0) {
            return null;
        }
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getFirstPageList::block set contains target type, error, do return null");
            return null;
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 gt6 = up5.f.f511473j.gt(0);
        if (i17 != -1) {
            gt6 = gt6.and(up5.f.f511468e.eq(i17));
        } else if (set != null) {
            gt6 = gt6.and(up5.f.f511468e.m108334x6424b58(set));
        }
        try {
            java.util.List<T> m107096xde3eb429 = this.f552090f.m107096xde3eb429(gt6, up5.f.f511476m.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m107096xde3eb429.iterator();
            while (it.hasNext()) {
                o72.r2 n07 = n0((up5.t) it.next());
                if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "[getFirstPageList] id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.f67643xc8a07680), java.lang.Integer.valueOf(n07.f67657x2262335f));
                    arrayList.add(n07);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.f67643xc8a07680), java.lang.Integer.valueOf(n07.f67657x2262335f));
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.List Wh(o72.j2 j2Var, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 in6 = up5.f.f511473j.in(o72.a.f424836b);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511486w;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = in6.and(c26981x40bb0da.gt(0));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = up5.f.f511468e;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and2 = and.and(c26981x40bb0da2.in(o72.a.f424835a));
        if (j2Var != null) {
            java.util.List list = j2Var.f424903a;
            if (!list.isEmpty()) {
                and2 = and2.and(c26981x40bb0da2.in(list));
            }
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108070x651874e = c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc);
            if (i17 == 1) {
                m108070x651874e = up5.f.f511476m.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc);
            }
            java.util.List<java.lang.Long> m107252x2e0e7242 = this.f552090f.m107252x2e0e7242(up5.f.f511466c, and2, m108070x651874e);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = j2Var != null ? j2Var.f424903a.toString() : "null";
            objArr[1] = java.lang.Integer.valueOf(m107252x2e0e7242.size());
            objArr[2] = java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "getCleanListByCondition types = %s, cu.getCount() = %d,used %dms", objArr);
            return m107252x2e0e7242;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public long X(long j17, int i17, int i18) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = this.f552088d;
        if (c26918x6e83759b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "getNextUpdateTime, but db is null, return");
            return 0L;
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 gt6 = up5.f.f511473j.gt(0);
        if (j17 > 0) {
            gt6 = gt6.and(up5.f.f511476m.lt(j17));
        }
        if (i18 != -1) {
            gt6 = gt6.and(up5.f.f511468e.eq(i18));
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m107164x47380ce3 = this.f552090f.m107164x47380ce3();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        try {
            tp5.c c17 = tp5.a.c(c26918x6e83759b, m107164x47380ce3.m106435xc9ff34fc(c26981x40bb0da).m106436x6bdbce7(gt6).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17).m106402x83249ab9(), null, null, new z72.C30830x2ee9be());
            try {
                java.util.Iterator it = c17.iterator();
                long j18 = j17;
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        c17.close();
                        return j18;
                    }
                    j18 = ((java.lang.Long) eVar.next()).longValue();
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return j17;
        }
    }

    @Override // o72.k4
    public boolean Xc() {
        return (re(0L) == null && re(-1L) == null) ? false : true;
    }

    @Override // o72.k4
    public java.lang.Long Y6() {
        try {
            return java.lang.Long.valueOf(this.f552090f.m107276x754a37bb(up5.f.f511466c.max()).m106361xfb822ef2());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getMaxLocalId failed with exception: " + th6.getMessage());
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }

    @Override // o72.k4
    public long Z0(long j17, int i17, int i18) {
        if (this.f552088d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "getMinBatchGetUpdateTime, but db is null, return");
            return 0L;
        }
        if (j17 <= 0) {
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = c26981x40bb0da.lt(j17).and(up5.f.f511470g.gt(up5.f.f511469f));
        if (i18 != -1) {
            and = and.and(up5.f.f511468e.eq(i18));
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107278x754a37bb = this.f552090f.m107278x754a37bb(c26981x40bb0da, and, c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
            if (m107278x754a37bb == null) {
                return 0L;
            }
            return m107278x754a37bb.m106361xfb822ef2();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return 0L;
        }
    }

    @Override // o72.k4
    public boolean a3(long j17, int i17) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 lt6 = c26981x40bb0da.lt(j17);
        if (i17 != -1) {
            lt6 = lt6.and(up5.f.f511468e.eq(i17));
        }
        try {
            return this.f552090f.m107277x754a37bb(c26981x40bb0da.m108258x5a7510f(), lt6).m106360xb58848b9() == 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return true;
        }
    }

    @Override // o72.k4
    public boolean b6(o72.j4 j4Var) {
        boolean[] zArr = {false};
        try {
            this.f552088d.m106962xc8054b53(new z72.g(this, zArr, j4Var));
            return zArr[0];
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "runTransaction failed with exception: " + th6.getMessage() + "thread id:" + java.lang.Thread.currentThread().getId());
            return false;
        }
    }

    @Override // o72.k4
    /* renamed from: c4 */
    public boolean mo880xb970c2b9(o72.r2 r2Var) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            long j17 = r2Var.f67645x88be67a1;
        }
        iz5.a.g(null, r2Var.f67645x88be67a1 > 0);
        r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
        if (jq0Var != null) {
            int i17 = jq0Var.f459567d;
            if (i17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(jq0Var.f459567d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        o72.x1.b(r2Var);
        try {
            this.f552090f.m107150x251da358(s0(r2Var));
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Long.valueOf(r2Var.f67645x88be67a1);
            objArr[1] = java.lang.Integer.valueOf(r2Var.f67643xc8a07680);
            objArr[2] = java.lang.Long.valueOf(r2Var.f67659xa783a79b);
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            objArr[3] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.f452497f.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "insert favItem localId:%s, favId:%s, update time:%s, favDataCount:%d", objArr);
            mo142179xf35bbb4(java.lang.Long.toString(r2Var.f67645x88be67a1), 2, java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public void d5(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "setStatus status:%d localId:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        try {
            this.f552090f.m107308xdd4a7e28(i17, (com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76) up5.f.f511473j, up5.f.f511466c.eq(j17));
            mo145247xf35bbb4(j17 + "");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
    }

    @Override // o72.k4
    public void di() {
        final java.util.List<T> m107110xde3eb429;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength");
        try {
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511473j;
            m107110xde3eb429 = this.f552090f.m107110xde3eb429(new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{up5.f.f511466c, c26981x40bb0da, up5.f.f511480q, up5.f.f511486w}, c26981x40bb0da.in(o72.a.f424836b).and(up5.f.f511468e.in(o72.a.f424835a)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength cu.getCount() = " + m107110xde3eb429.size());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
        if (m107110xde3eb429.isEmpty()) {
            return;
        }
        this.f552088d.m106962xc8054b53(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe() { // from class: z72.f$$c
            @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe
            /* renamed from: insideTransaction */
            public final boolean mo14059x1b311542(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = c26919x80675a48.m106824x752de218("FavItemInfo", up5.f.f511465b);
                java.util.Iterator it = m107110xde3eb429.iterator();
                while (true) {
                    boolean z17 = true;
                    if (!it.hasNext()) {
                        return true;
                    }
                    up5.t tVar = (up5.t) it.next();
                    int i17 = tVar.f511599h;
                    int[] iArr = o72.a.f424836b;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= 3) {
                            z17 = false;
                            break;
                        }
                        if (iArr[i18] == i17) {
                            break;
                        }
                        i18++;
                    }
                    if (z17) {
                        r45.bq0 bq0Var = (r45.bq0) tp5.a.e(tVar.f511606o, r45.bq0.class);
                        long j17 = 0;
                        if (bq0Var != null) {
                            java.util.Iterator it6 = bq0Var.f452497f.iterator();
                            while (it6.hasNext()) {
                                j17 += ((r45.gp0) it6.next()).R;
                            }
                        }
                        m106824x752de218.m107314xdd4a7e28(j17, (com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76) up5.f.f511486w, up5.f.f511466c.eq(tVar.f511592a));
                    }
                }
            }
        });
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength end");
    }

    @Override // o72.k4
    /* renamed from: getCount */
    public int mo150754x7444f759() {
        try {
            return this.f552090f.m107276x754a37bb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m106360xb58848b9();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavItemInfoNewStorage", th6, "Cannot get count", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // o72.k4
    public java.util.List j6() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 in6 = up5.f.f511473j.in(o72.a.f424836b);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511486w;
        try {
            java.util.List<java.lang.Long> m107252x2e0e7242 = this.f552090f.m107252x2e0e7242(up5.f.f511466c, in6.and(c26981x40bb0da.gt(0)).and(up5.f.f511468e.in(o72.a.f424835a)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "getCleanList cu.getCount() = %d,used %dms", java.lang.Integer.valueOf(m107252x2e0e7242.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return m107252x2e0e7242;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.List ke() {
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = this.f552090f;
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511473j;
            return m0(c26924x4cd4bae.m107094xde3eb429(c26981x40bb0da.eq(9).or(c26981x40bb0da.eq(12))));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    /* renamed from: lf */
    public boolean mo9952xce0038c9(final o72.r2 r2Var, java.lang.String... strArr) {
        r45.jq0 jq0Var;
        int i17;
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424858e) {
            final o72.r2 F = F(r2Var.f67645x88be67a1);
            if (F != null && F.f67658x266f95d1 > r2Var.f67658x266f95d1) {
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = java.lang.Integer.valueOf(r2Var.f67643xc8a07680);
                objArr[1] = java.lang.Long.valueOf(r2Var.f67645x88be67a1);
                objArr[2] = java.lang.Integer.valueOf(r2Var.f67657x2262335f);
                objArr[3] = java.lang.Integer.valueOf(r2Var.f67658x266f95d1);
                objArr[4] = java.lang.Integer.valueOf(F.f67658x266f95d1);
                r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                objArr[5] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.E : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update: favId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("update_fav_item_db_seq_error", true, pm0.w.f438337e, null, true, false, new yz5.a() { // from class: z72.f$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.Object[] objArr2 = new java.lang.Object[7];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr2[0] = java.lang.Integer.valueOf(r2Var2.f67643xc8a07680);
                        objArr2[1] = java.lang.Long.valueOf(r2Var2.f67645x88be67a1);
                        objArr2[2] = java.lang.Integer.valueOf(r2Var2.f67657x2262335f);
                        objArr2[3] = java.lang.Integer.valueOf(r2Var2.f67658x266f95d1);
                        objArr2[4] = java.lang.Integer.valueOf(F.f67658x266f95d1);
                        r45.bq0 bq0Var2 = r2Var2.f67640x5ab01132;
                        objArr2[5] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                        objArr2[6] = java.lang.Boolean.TRUE;
                        return java.lang.String.format("favId=%d;favLocalId=%d;type=%d;updateSeq=%d;oldUpdateSeq=%d;version=%d;isNewDb=%b", objArr2);
                    }
                });
                return false;
            }
            if (F != null && (i17 = F.f67643xc8a07680) > 0 && i17 != r2Var.f67643xc8a07680) {
                java.lang.Object[] objArr2 = new java.lang.Object[7];
                objArr2[0] = java.lang.Integer.valueOf(i17);
                objArr2[1] = java.lang.Integer.valueOf(r2Var.f67643xc8a07680);
                objArr2[2] = java.lang.Long.valueOf(r2Var.f67645x88be67a1);
                objArr2[3] = java.lang.Integer.valueOf(r2Var.f67657x2262335f);
                objArr2[4] = java.lang.Integer.valueOf(r2Var.f67658x266f95d1);
                objArr2[5] = java.lang.Integer.valueOf(F.f67658x266f95d1);
                r45.bq0 bq0Var2 = r2Var.f67640x5ab01132;
                objArr2[6] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update: error fav id, oldFavId=%d, newFavId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr2);
                r2Var.f67643xc8a07680 = F.f67643xc8a07680;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("update_fav_item_db_error_fav_id", true, pm0.w.f438337e, null, true, false, new yz5.a() { // from class: z72.f$$b
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.Object[] objArr3 = new java.lang.Object[6];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr3[0] = java.lang.Integer.valueOf(r2Var2.f67643xc8a07680);
                        objArr3[1] = java.lang.Integer.valueOf(F.f67643xc8a07680);
                        objArr3[2] = java.lang.Long.valueOf(r2Var2.f67645x88be67a1);
                        objArr3[3] = java.lang.Integer.valueOf(r2Var2.f67657x2262335f);
                        r45.bq0 bq0Var3 = r2Var2.f67640x5ab01132;
                        objArr3[4] = java.lang.Integer.valueOf(bq0Var3 != null ? bq0Var3.E : -1);
                        objArr3[5] = java.lang.Boolean.TRUE;
                        return java.lang.String.format("newFavId=%d;oldFavId=%d;favLocalId=%d;type=%d;version=%d;isNewDb=%b", objArr3);
                    }
                });
            }
        }
        r45.bq0 bq0Var3 = r2Var.f67640x5ab01132;
        if (bq0Var3 != null && (jq0Var = bq0Var3.f452495d) != null) {
            int i18 = jq0Var.f459567d;
            if (i18 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(jq0Var.f459567d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i18);
            }
        }
        if (r2Var.f67640x5ab01132 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "FavProtoItem null, info localid:" + r2Var.f67645x88be67a1 + ", type:" + r2Var.f67657x2262335f);
            jx3.f.INSTANCE.d(22021, 20251031, java.lang.Integer.valueOf(r2Var.f67657x2262335f), "FavProtoItem null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Fav.FavItemInfoNewStorage", "FavProtoItem null", new java.lang.Object[0]);
        }
        try {
            o72.x1.b(r2Var);
            tp5.a.i(s0(r2Var), this.f552090f, strArr);
            mo142179xf35bbb4(java.lang.Long.toString(r2Var.f67645x88be67a1), 3, java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "update favItem localId:%s favId:%s update time:%s xml:%s ret:%s", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67659xa783a79b), r2Var.f67660x4b6e9352, java.lang.Boolean.TRUE);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update favItem failed: " + th6.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public boolean ma(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "hasShowAllValidItem::block set contains target type, error, do return true");
            return true;
        }
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 lt6 = c26981x40bb0da.lt(j17);
        if (i17 != -1) {
            lt6 = lt6.and(up5.f.f511468e.eq(i17));
        } else if (set != null) {
            lt6 = lt6.and(up5.f.f511468e.m108334x6424b58(set));
        }
        try {
            return this.f552090f.m107277x754a37bb(c26981x40bb0da.m108258x5a7510f(), lt6.and(up5.f.f511473j.gt(0))).m106360xb58848b9() == 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return true;
        }
    }

    @Override // o72.k4
    public java.util.List o4() {
        try {
            return m0(this.f552090f.m107094xde3eb429(up5.f.f511473j.in(3, 6, 11, 14, 16, 18)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    @Override // o72.k4
    public java.util.List qh() {
        try {
            return m0(this.f552090f.m107094xde3eb429(up5.f.f511473j.eq(17)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 rc(java.lang.String str) {
        try {
            return n0((up5.t) this.f552090f.m107127x946de4d9(up5.f.f511472i.eq(str)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 re(long j17) {
        try {
            return n0((up5.t) this.f552090f.m107127x946de4d9(up5.f.f511467d.eq(j17)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public l75.k0 u2() {
        return this.f552089e;
    }

    @Override // o72.k4
    public java.util.List v0() {
        try {
            return this.f552090f.m107255x2e0e7242(up5.f.f511466c, up5.f.f511476m.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.LinkedList vh(long j17, int i17) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 gt6 = c26981x40bb0da.gt(j17);
        if (i17 != -1) {
            gt6 = gt6.and(up5.f.f511468e.eq(i17));
        }
        try {
            return new java.util.LinkedList(this.f552090f.m107243x9be5b69(up5.f.f511467d, gt6.and(up5.f.f511470g.gt(up5.f.f511469f)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.ArrayList wa(java.util.List list, java.util.List list2, java.util.Set set, o72.i4 i4Var, boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108070x651874e;
        if (list == null || list.size() == 0 || list.size() > 20) {
            return null;
        }
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511466c;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 in6 = c26981x40bb0da.in(list);
        if (set != null && set.size() > 0) {
            in6 = in6.and(up5.f.f511468e.m108334x6424b58(set));
        }
        if (z17) {
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 m108136x5a0eb2f = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8.m108136x5a0eb2f(c26981x40bb0da);
            for (int i17 = 0; i17 < list.size(); i17++) {
                m108136x5a0eb2f.m108201x37ab3a(((java.lang.Long) list.get(i17)).longValue()).m108191x364e1d(i17);
            }
            m108070x651874e = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880(m108136x5a0eb2f);
        } else {
            m108070x651874e = up5.f.f511476m.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc);
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = this.f552090f.m107164x47380ce3().m106435xc9ff34fc(up5.f.a()).m106436x6bdbce7(in6).m106433xb80cf445(m108070x651874e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "[getListByIdList] id cnt: " + list.size() + "stmt = " + m106433xb80cf445.m106402x83249ab9().m108435x730bcac6());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            tp5.c c17 = tp5.a.c(this.f552088d, m106433xb80cf445.m106402x83249ab9(), null, null, tp5.a.f502688a);
            try {
                java.util.Iterator it = c17.iterator();
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        c17.close();
                        return arrayList;
                    }
                    try {
                        o72.r2 n07 = n0(up5.f.f511465b.mo107916xd4074720(up5.f.a(), (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992) eVar.next(), up5.t.class));
                        if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                            arrayList.add(n07);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.f67643xc8a07680), java.lang.Integer.valueOf(n07.f67657x2262335f));
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Cannot get FavItemInfo: " + th6.getMessage());
                        c17.close();
                        return arrayList;
                    }
                }
            } finally {
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th7.getMessage());
            return arrayList;
        }
    }

    @Override // o72.k4
    public boolean xb(o72.r2 r2Var, java.lang.String... strArr) {
        r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
        if (jq0Var != null) {
            int i17 = jq0Var.f459567d;
            if (i17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(jq0Var.f459567d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        try {
            tp5.a.i(s0(r2Var), this.f552090f, strArr);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCDBHelper", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public java.util.List z4(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getList::block set contains target type, error, do return null");
            return null;
        }
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.f.f511476m;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 ge6 = c26981x40bb0da.ge(j17);
        if (i17 != -1) {
            ge6 = ge6.and(up5.f.f511468e.eq(i17));
        } else if (set != null && !set.isEmpty()) {
            ge6 = ge6.and(up5.f.f511468e.m108334x6424b58(set));
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = this.f552090f.m107164x47380ce3().m106435xc9ff34fc(up5.f.a()).m106436x6bdbce7(ge6.and(up5.f.f511473j.gt(0))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "[getList] updateTime = " + j17 + ", stmt = " + m106433xb80cf445.m106402x83249ab9().m108435x730bcac6());
        try {
            tp5.c c17 = tp5.a.c(this.f552088d, m106433xb80cf445.m106402x83249ab9(), null, null, tp5.a.f502688a);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = c17.iterator();
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        break;
                    }
                    try {
                        o72.r2 n07 = n0(up5.f.f511465b.mo107916xd4074720(up5.f.a(), (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992) eVar.next(), up5.t.class));
                        if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                            arrayList.add(n07);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Cannot get FavItemInfo: " + th6.getMessage());
                    }
                }
                c17.close();
                return arrayList;
            } finally {
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th7.getMessage());
            return java.util.Collections.emptyList();
        }
    }
}
