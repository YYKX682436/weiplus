package nf4;

/* loaded from: classes4.dex */
public final class l extends l75.n0 {

    /* renamed from: m, reason: collision with root package name */
    public static final nf4.k f418391m = new nf4.k(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f418392n = " order by MMStoryInfo.createTime desc";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f418393o = " (storyID != 0  ) ";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f418394p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f418395q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f418396r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f418397s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f418398t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f418399u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f418400v;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f418401d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f418402e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f418403f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f418404g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.k0 f418405h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f418406i;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE INDEX IF NOT EXISTS ");
        l75.e0 e0Var = nf4.j.M;
        sb6.append(nf4.j.P);
        sb6.append(" ON ");
        sb6.append("MMStoryInfo");
        sb6.append(" ( storyID )");
        f418399u = new java.lang.String[]{sb6.toString(), "CREATE INDEX IF NOT EXISTS " + nf4.j.Q + " ON MMStoryInfo (userName,storyID, createTime)", "CREATE INDEX IF NOT EXISTS " + nf4.j.R + " ON MMStoryInfo (userName, createTime)"};
        f418400v = new java.lang.String[]{l75.n0.m145250x3fdc6f77(nf4.j.M, "MMStoryInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 vdb) {
        super(vdb, nf4.j.M, "MMStoryInfo", f418399u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vdb, "vdb");
        this.f418401d = vdb;
        nf4.k kVar = f418391m;
        java.util.List asList = java.util.Arrays.asList(2, 4, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asList, "asList(...)");
        java.util.ArrayList c17 = kVar.c(asList);
        this.f418402e = c17;
        java.util.List asList2 = java.util.Arrays.asList(4, 8, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asList2, "asList(...)");
        this.f418403f = kVar.c(asList2);
        java.util.List asList3 = java.util.Arrays.asList(4, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asList3, "asList(...)");
        this.f418404g = kVar.c(asList3);
        this.f418405h = vdb;
        this.f418406i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if ((num.intValue() & 2) != 0 && (num.intValue() & 4) == 0) {
                arrayList.add(num);
            }
        }
        kVar.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it6 = this.f418403f.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) it6.next();
            if ((num2.intValue() & 4) != 0) {
                arrayList.add(num2);
            }
        }
        f418395q = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it7 = this.f418403f.iterator();
        while (it7.hasNext()) {
            java.lang.Integer num3 = (java.lang.Integer) it7.next();
            if ((num3.intValue() & 8) != 0) {
                arrayList.add(num3);
            }
        }
        f418396r = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it8 = this.f418402e.iterator();
        while (it8.hasNext()) {
            java.lang.Integer num4 = (java.lang.Integer) it8.next();
            if ((num4.intValue() & 4) != 0) {
                arrayList.add(num4);
            }
        }
        kVar.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it9 = this.f418403f.iterator();
        while (it9.hasNext()) {
            java.lang.Integer num5 = (java.lang.Integer) it9.next();
            if ((num5.intValue() & 16) != 0) {
                arrayList.add(num5);
            }
        }
        f418397s = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it10 = this.f418404g.iterator();
        while (it10.hasNext()) {
            java.lang.Integer num6 = (java.lang.Integer) it10.next();
            if ((num6.intValue() & 4) != 0) {
                arrayList.add(num6);
            }
        }
        f418394p = kVar.b(arrayList, "itemStoryFlag", true);
        arrayList.clear();
        java.util.Iterator it11 = this.f418404g.iterator();
        while (it11.hasNext()) {
            java.lang.Integer num7 = (java.lang.Integer) it11.next();
            if ((num7.intValue() & 8) != 0) {
                arrayList.add(num7);
            }
        }
        f418398t = kVar.a(arrayList, "itemStoryFlag");
    }

    public final nf4.j D0(long j17) {
        nf4.j jVar = new nf4.j();
        android.database.Cursor f17 = this.f418405h.f("select *,rowid from MMStoryInfo  where MMStoryInfo.storyID=" + j17 + " limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.mo9015xbf5d97fd(f17);
        f17.close();
        return jVar;
    }

    public final nf4.j J0(int i17) {
        nf4.j jVar = new nf4.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from MMStoryInfo  where MMStoryInfo.");
        l75.e0 e0Var = nf4.j.M;
        sb6.append(nf4.j.N);
        sb6.append('=');
        sb6.append(i17);
        android.database.Cursor f17 = this.f418405h.f(sb6.toString(), null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.mo9015xbf5d97fd(f17);
        f17.close();
        return jVar;
    }

    public final nf4.j L0(long j17) {
        nf4.j jVar = new nf4.j();
        android.database.Cursor f17 = this.f418405h.f("select *,rowid from MMStoryInfo  WHERE MMStoryInfo.storyID=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.mo9015xbf5d97fd(f17);
        f17.close();
        return jVar;
    }

    public final java.util.List P0(java.lang.String userName, boolean z17, int i17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = "select *,rowid from MMStoryInfo " + y0(userName, z17) + ' ';
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" AND ");
        sb6.append("MMStoryInfo.createTime>" + i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        java.lang.String str2 = f418392n;
        if (!z17) {
            str2 = " AND " + f418393o + " AND " + f418394p + ' ' + str2;
        }
        sb8.append(str2);
        android.database.Cursor f17 = this.f418405h.f(sb8.toString(), null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                nf4.j jVar = new nf4.j();
                jVar.mo9015xbf5d97fd(f17);
                arrayList.add(jVar);
            }
            f17.close();
        }
        if (z17) {
            int i18 = ef4.k.f333991a;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC, java.lang.Integer.valueOf(java.lang.Math.min(arrayList.size(), ((java.lang.Number) bf4.g.f101249b.a()).intValue())));
        }
        if (!z18) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!pm0.v.z(((nf4.j) next).f69405x686589a9, 4)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final java.util.List W0(java.lang.String userName, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.List P0 = P0(userName, z17, i17, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : P0) {
            if (((nf4.j) obj).y0().f460968n == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final long b1(long j17, int i17) {
        java.lang.String baseSql = "select *,rowid from MMStoryInfo  WHERE " + f418397s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseSql, "baseSql");
        if (j17 != 0) {
            baseSql = baseSql + " AND MMStoryInfo.storyID < '" + j17 + '\'';
        }
        android.database.Cursor B = this.f418405h.B(baseSql + f418392n + " limit " + i17, null);
        if (!B.moveToLast()) {
            B.close();
            return 0L;
        }
        nf4.j jVar = new nf4.j();
        jVar.mo9015xbf5d97fd(B);
        B.close();
        return jVar.f69410x443468b;
    }

    public final java.util.List d1(java.lang.String userName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f418405h.f((("select *,rowid from MMStoryInfo " + y0(userName, true)) + " AND createTime BETWEEN " + i17 + " AND " + ((i17 + 86400) - 1)) + f418392n, null, 2);
        while (f17.moveToNext()) {
            nf4.j jVar = new nf4.j();
            jVar.mo9015xbf5d97fd(f17);
            arrayList.add(jVar);
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.n0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public boolean mo11261xce0038c9(long j17, nf4.j storyInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyInfo, "storyInfo");
        return mo11260x413cb2b4(storyInfo);
    }

    public final int i1(int i17, nf4.j storyinfo) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyinfo, "storyinfo");
        nf4.l i18 = ef4.w.f334001t.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(storyinfo.f69403xac3be4e);
        java.lang.String localId = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        java.util.List delList = i18.f418406i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(delList, "delList");
        synchronized (delList) {
            java.util.Iterator it = delList.iterator();
            z17 = false;
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) it.next(), localId)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorage", "wo wo wo " + localId);
                    z17 = true;
                }
            }
        }
        if (z17) {
            return -1;
        }
        android.content.ContentValues mo9763xeb27878e = storyinfo.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        l75.k0 k0Var = this.f418405h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        l75.e0 e0Var = nf4.j.M;
        sb7.append(nf4.j.N);
        sb7.append("=?");
        return k0Var.p("MMStoryInfo", mo9763xeb27878e, sb7.toString(), new java.lang.String[]{"" + i17});
    }

    public final java.lang.String y0(java.lang.String str, boolean z17) {
        if (z17) {
            return " WHERE " + f418395q;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" WHERE MMStoryInfo.userName='");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' AND ");
        sb6.append(f418396r);
        return sb6.toString();
    }

    public void z0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorage", "dropTable " + this.f418405h.mo70514xb06685ab("MMStoryInfo", null, null));
    }
}
