package ot0;

/* loaded from: classes12.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.z2 f430355a = new ot0.z2();

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 A(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107139x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker).and(up5.i.f511522u.eq(j17)));
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 A0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String filterSql) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterSql, "filterSql");
        try {
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511511j;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 s17 = s1(filterSql, c26981x40bb0da != null ? c26981x40bb0da.eq(talker) : null);
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = up5.i.f511510i;
            up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, s17, c26981x40bb0da2 != null ? c26981x40bb0da2.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc) : null, 0L);
            if (wVar == null) {
                return new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
            return f9Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getLastMsgWithFilterSql failed: " + th6.getMessage());
            return new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 B(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511505d.eq(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.m107127x946de4d9(ot0.d3.b(eq6, str != null, new ot0.r1(str)));
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final java.util.List B0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.Collection<up5.w> m107112xde3eb429 = r1(db6, TableNameByTalker).m107112xde3eb429(up5.i.a(), up5.i.f511511j.eq(talker).and(up5.i.f511507f.eq(4)).and(up5.i.f511506e.m108325x6424adf(10000)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor C(l75.k0 db6, java.lang.String TableNameByTalker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106435xc9ff34fc, "select(...)");
        return tp5.a.f(ot0.d3.a(db6), m106435xc9ff34fc.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 C0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107141x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker).and(up5.i.f511508g.eq(0)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor D(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = c27047xc5bef32b.m108807xc9ff34fc(c26981x40bb0da, up5.i.f511504c).m108792x3017aa(TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108806xb80cf445 = m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.s1(j17))).m108793x117d5b36(c26981x40bb0da).m108806xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m108806xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m108806xb80cf445, null, null);
    }

    public final java.util.List D0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        java.util.Collection<up5.w> m107111xde3eb429 = r1(db6, tableName).m107111xde3eb429(up5.i.a(), up5.i.f511507f.eq(1).and(up5.i.f511508g.eq(1)).and(up5.i.f511506e.in(types)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
        for (up5.w wVar : m107111xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final long E(l75.k0 db6, java.lang.String tableName, java.lang.String str, java.util.List systemTypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(systemTypes, "systemTypes");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511511j.eq(str).and(up5.i.f511506e.m108333x6424b58(systemTypes))));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106361xfb822ef2();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 E0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107141x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker), up5.i.f511505d.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final int F(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 b17 = ot0.d3.b(eq6, z17, new ot0.t1(j17));
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(b17.and(c26981x40bb0da.ge(j18)).and(c26981x40bb0da.le(j19))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getCount failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor F0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(types))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final int G(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(eq6.and(c26981x40bb0da.gt(j17)).and(c26981x40bb0da.le(j18))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getCountAfterCreateTimeBeforeEndTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor G0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, long j17, long j18, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511508g.eq(0);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.le(j17)).and(c26981x40bb0da.ge(j18)).and(up5.i.f511506e.m108333x6424b58(types)).and(up5.i.f511511j.eq(talker))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final int H(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 b17 = ot0.d3.b(eq6, j17 > 0, new ot0.u1(j17));
            if (j18 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(b17, z17, new ot0.v1(j18))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getCountAfterStratTimeBeforeEndTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor H0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, long j17, long j18, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da.le(j17).and(c26981x40bb0da.gt(j18)).and(up5.i.f511506e.in(types)).and(up5.i.f511511j.eq(talker))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final int I(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq7 = up5.i.f511506e.eq(i17);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(eq6.and(eq7.and(c26981x40bb0da.ge(j17).and(c26981x40bb0da.le(j18))))).m108798x6234bbb(j19));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    public final android.database.Cursor I0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511508g.eq(0).and(up5.i.f511506e.in(types)).and(up5.i.f511511j.eq(talker))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long J(l75.k0 db6, java.lang.String TableNameByTalker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        try {
            up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107139x946de4d9(up5.i.a(), up5.i.f511504c.eq(j17));
            if (wVar != null) {
                return wVar.f511630g;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getCreateTimeByLocalId failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final long J0(l75.k0 db6, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(up5.i.f511504c.max()).m108792x3017aa(tableName));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106361xfb822ef2();
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMaxMsgId failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final android.database.Cursor K(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(str)).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final long K0(l75.k0 db6, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(up5.i.f511504c.max()).m108792x3017aa(tableName));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106361xfb822ef2();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMaxMsgIdFromTable failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor L(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.gt(j17))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 L0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.gt(j17)).and(up5.i.f511506e.m108325x6424adf(10000).or(up5.i.f511508g.eq(2))), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor M(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106431xc3376493 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.w1(j17, j18)), j18 == 0, new ot0.x1(j17))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17).m106431xc3376493(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106431xc3376493, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), m106431xc3376493.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 M0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.lt(j17)).and(up5.i.f511506e.m108325x6424adf(10000).or(up5.i.f511508g.eq(2))), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor N(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106431xc3376493 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.y1(j17, j18)), j18 == 0, new ot0.z1(j17))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17).m106431xc3376493(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106431xc3376493, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), m106431xc3376493.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor N0(l75.k0 db6, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 m108137x5a0eb2f = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8.m108137x5a0eb2f("contentSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m108137x5a0eb2f, "case_(...)");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880(m108137x5a0eb2f);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511506e;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108806xb80cf445 = c27047xc5bef32b.m108807xc9ff34fc(c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f(), up5.i.f511512k.m108287xbe0e3ae6().sum().as("contentSize"), up5.i.f511515n.hex().m108287xbe0e3ae6().m108262xb0a37c79(2).sum(), up5.i.f511514m.hex().m108287xbe0e3ae6().m108262xb0a37c79(2).sum()).m108792x3017aa(tableName).m108793x117d5b36(c26981x40bb0da).m108806xb80cf445(c27017x4f962880.m108501x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m108806xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m108806xb80cf445, null, null);
    }

    public final android.database.Cursor O(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.gt(j17))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor O0(l75.k0 db6, java.lang.String tableName, java.lang.String pattern) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        try {
            com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511512k;
            com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da != null ? c26981x40bb0da.m108288x32af97(pattern) : null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
            return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMessagesByContentPattern failed: " + th6.getMessage());
            throw th6;
        }
    }

    public final android.database.Cursor P(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(ot0.d3.b(eq6, j17 > 0, new ot0.a2(j17)), j18 > 0, new ot0.b2(j18)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor P0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.q2(j18)), j19 > 0, new ot0.r2(j19)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e = com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(enumC27016x48e972e)).m106429x6234bbb(j17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(enumC27016x48e972e));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor Q(l75.k0 db6, java.lang.String tableName, java.lang.String str, java.lang.String str2, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str).and(up5.i.f511506e).eq(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        boolean z17 = false;
        if (str2 != null) {
            if (!(str2.length() == 0)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, z17, new ot0.c2(str2))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor Q0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.s2(j18)), j19 > 0, new ot0.t2(j19)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(j17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor R(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511504c;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.le(j17))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(j18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 R0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, ot0.d3.b(eq6, j17 > 0, new ot0.u2(j17)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor S(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.ge(j17)).and(c26981x40bb0da.le(j18)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor S0(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int i17, java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cols, "cols");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, table).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(c17, c17.length)).m106436x6bdbce7(up5.i.f511506e.eq(i17).or(up5.i.f511513l.m108288x32af97(prefix.concat("%"))));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor T(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.le(j18))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor T0(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cols, "cols");
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, table).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(c17, c17.length)).m106436x6bdbce7(up5.i.f511506e.eq(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor U(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(str).and(up5.i.f511508g.eq(0)).and(up5.i.f511507f.m108325x6424adf(4)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final int U0(l75.k0 db6, java.lang.String tableName, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511511j.eq(str).and(up5.i.f511506e.eq(i17))));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    public final int V(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = up5.i.f511511j.eq(str).and(up5.i.f511508g.eq(0)).and(up5.i.f511507f.m108325x6424adf(4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(and, j17 > 0, new ot0.d2(j17))));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    public final int V0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, z17, new ot0.v2(j17))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgCountByMember failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor W(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(str).and(up5.i.f511508g.eq(0)).and(up5.i.f511507f.m108325x6424adf(4))).m106433xb80cf445(up5.i.f511504c.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final int W0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.w2(j17)).and(up5.i.f511508g.eq(1))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgCountBySelf failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor X(l75.k0 db6, java.lang.String tableName, java.lang.String unReadColumn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unReadColumn, "unReadColumn");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511511j;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108793x117d5b36 = c27047xc5bef32b.m108807xc9ff34fc(c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f().as(unReadColumn)).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511508g.eq(0).and(up5.i.f511507f.m108325x6424adf(4))).m108793x117d5b36(c26981x40bb0da);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m108793x117d5b36, "groupBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m108793x117d5b36, null, null);
    }

    public final long X0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, mmsgTable).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(mmsgTable).m108812x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511506e.eq(i17))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106361xfb822ef2();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgCountByTalkerAndType failed: " + th6.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long Y(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, c26981x40bb0da.gt(j17).and(up5.i.f511511j.eq(talker)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), i17 - 1);
            return wVar != null ? wVar.f511630g : j17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getDownIncMsgCreateTime failed: " + th6.getMessage());
            return j17;
        }
    }

    public final int Y0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName);
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.x2(j17))));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long Z(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            up5.w wVar = (up5.w) r1(db6, mmsgTable).m107141x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), 0L);
            if (wVar != null) {
                return wVar.f511630g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getFirstMessageCreateTime failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final int Z0(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511511j.eq(str)));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    public final com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 a(java.lang.String str, java.lang.String str2, int i17, java.lang.Integer num) {
        switch (str.hashCode()) {
            case -1180128302:
                if (str.equals("isSend")) {
                    int hashCode = str2.hashCode();
                    if (hashCode == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511508g.m108325x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511508g.le(i17);
                        }
                        return null;
                    }
                    if (hashCode == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511508g.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511508g.lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511508g.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511508g.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case -1065033442:
                if (str.equals("msgSeq")) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511522u.m108326x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode2 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511522u.le(i17);
                        }
                        return null;
                    }
                    if (hashCode2 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511522u.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode2) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511522u.lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511522u.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511522u.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case -892481550:
                if (str.equals("status")) {
                    int hashCode3 = str2.hashCode();
                    if (hashCode3 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511507f.m108325x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode3 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511507f.le(i17);
                        }
                        return null;
                    }
                    if (hashCode3 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511507f.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode3) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511507f.lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511507f.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511507f.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 3145580:
                if (str.equals("flag")) {
                    int intValue = num != null ? num.intValue() : 2;
                    int hashCode4 = str2.hashCode();
                    if (hashCode4 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511523v.m108239xad384d8a(intValue).m108326x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode4 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511523v.m108239xad384d8a(intValue).le(i17);
                        }
                        return null;
                    }
                    if (hashCode4 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511523v.m108239xad384d8a(intValue).ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode4) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511523v.m108239xad384d8a(intValue).lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511523v.m108239xad384d8a(intValue).eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511523v.m108239xad384d8a(intValue).gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 3575610:
                if (str.equals("type")) {
                    int hashCode5 = str2.hashCode();
                    if (hashCode5 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511506e.m108325x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode5 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511506e.le(i17);
                        }
                        return null;
                    }
                    if (hashCode5 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511506e.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode5) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511506e.lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511506e.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511506e.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 104191100:
                if (str.equals("msgId")) {
                    int hashCode6 = str2.hashCode();
                    if (hashCode6 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f511504c.m108326x6424adf(i17);
                        }
                        return null;
                    }
                    if (hashCode6 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f511504c.le(i17);
                        }
                        return null;
                    }
                    if (hashCode6 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f511504c.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode6) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f511504c.lt(i17);
                            }
                            return null;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f511504c.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f511504c.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 a0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, ot0.d3.b(eq6, j17 > 0, new ot0.e2(j17)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final int[] a1(l75.k0 db6, java.lang.String mmsgTable, int[] types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        try {
            int[] iArr = new int[types.length + 1];
            int length = types.length;
            for (int i17 = 0; i17 < length; i17++) {
                com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, mmsgTable).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(mmsgTable).m108812x6bdbce7(up5.i.f511506e.eq(types[i17])));
                iArr[i17] = m107282xc8d0d0ea != null ? m107282xc8d0d0ea.m106360xb58848b9() : 0;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea2 = r1(db6, mmsgTable).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(mmsgTable));
            iArr[types.length] = m107282xc8d0d0ea2 != null ? m107282xc8d0d0ea2.m106360xb58848b9() : 0;
            return iArr;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgCountWithTypes failed: " + th6.getMessage());
            return new int[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            return ((up5.w) r1(db6, tableName).m107146x946de4d9(up5.i.a(), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), (long) i17)) != null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "checkMessageCountAtLeast failed: " + th6.getMessage());
            return false;
        }
    }

    public final android.database.Cursor b0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da.gt(j17).and(up5.i.f511511j.eq(talker)).and(up5.i.f511506e.in(types))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor b1(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List msgIdList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdList, "msgIdList");
        if (msgIdList.isEmpty()) {
            com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511504c.eq(-1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
            return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511504c.in(msgIdList))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c(java.lang.String[] strArr) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.lang.String lowerCase = str.toLowerCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            java.lang.String lowerCase2 = "msgId".toLowerCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase2)) {
                c26981x40bb0da = up5.i.f511504c;
            } else {
                java.lang.String lowerCase3 = "msgSvrId".toLowerCase();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase3, "toLowerCase(...)");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase3)) {
                    c26981x40bb0da = up5.i.f511505d;
                } else {
                    java.lang.String lowerCase4 = "type".toLowerCase();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase4, "toLowerCase(...)");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase4)) {
                        c26981x40bb0da = up5.i.f511506e;
                    } else {
                        java.lang.String lowerCase5 = "status".toLowerCase();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase5, "toLowerCase(...)");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase5)) {
                            c26981x40bb0da = up5.i.f511507f;
                        } else {
                            java.lang.String lowerCase6 = "isSend".toLowerCase();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase6, "toLowerCase(...)");
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase6)) {
                                c26981x40bb0da = up5.i.f511508g;
                            } else {
                                java.lang.String lowerCase7 = "isShowTimer".toLowerCase();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase7, "toLowerCase(...)");
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase7)) {
                                    c26981x40bb0da = up5.i.f511509h;
                                } else {
                                    java.lang.String lowerCase8 = "createTime".toLowerCase();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase8, "toLowerCase(...)");
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase8)) {
                                        c26981x40bb0da = up5.i.f511510i;
                                    } else {
                                        java.lang.String lowerCase9 = "talker".toLowerCase();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase9, "toLowerCase(...)");
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase9)) {
                                            c26981x40bb0da = up5.i.f511511j;
                                        } else {
                                            java.lang.String lowerCase10 = "content".toLowerCase();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase10, "toLowerCase(...)");
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase10)) {
                                                c26981x40bb0da = up5.i.f511512k;
                                            } else {
                                                java.lang.String lowerCase11 = "imgPath".toLowerCase();
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase11, "toLowerCase(...)");
                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase11)) {
                                                    c26981x40bb0da = up5.i.f511513l;
                                                } else {
                                                    java.lang.String lowerCase12 = "reserved".toLowerCase();
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase12, "toLowerCase(...)");
                                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase12)) {
                                                        c26981x40bb0da = up5.i.f511514m;
                                                    } else {
                                                        java.lang.String lowerCase13 = "lvbuffer".toLowerCase();
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase13, "toLowerCase(...)");
                                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase13)) {
                                                            c26981x40bb0da = up5.i.f511515n;
                                                        } else {
                                                            java.lang.String lowerCase14 = "talkerId".toLowerCase();
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase14, "toLowerCase(...)");
                                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase14)) {
                                                                c26981x40bb0da = up5.i.f511518q;
                                                            } else {
                                                                java.lang.String lowerCase15 = "transContent".toLowerCase();
                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase15, "toLowerCase(...)");
                                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase15)) {
                                                                    c26981x40bb0da = up5.i.f511516o;
                                                                } else {
                                                                    java.lang.String lowerCase16 = "transBrandWording".toLowerCase();
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase16, "toLowerCase(...)");
                                                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase16)) {
                                                                        c26981x40bb0da = up5.i.f511517p;
                                                                    } else {
                                                                        java.lang.String lowerCase17 = "bizClientMsgId".toLowerCase();
                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase17, "toLowerCase(...)");
                                                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase17)) {
                                                                            c26981x40bb0da = up5.i.f511519r;
                                                                        } else {
                                                                            java.lang.String lowerCase18 = "bizChatId".toLowerCase();
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase18, "toLowerCase(...)");
                                                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase18)) {
                                                                                c26981x40bb0da = up5.i.f511520s;
                                                                            } else {
                                                                                java.lang.String lowerCase19 = "bizChatUserId".toLowerCase();
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase19, "toLowerCase(...)");
                                                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase19)) {
                                                                                    c26981x40bb0da = up5.i.f511521t;
                                                                                } else {
                                                                                    java.lang.String lowerCase20 = "msgSeq".toLowerCase();
                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase20, "toLowerCase(...)");
                                                                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase20)) {
                                                                                        c26981x40bb0da = up5.i.f511522u;
                                                                                    } else {
                                                                                        java.lang.String lowerCase21 = "flag".toLowerCase();
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase21, "toLowerCase(...)");
                                                                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase21)) {
                                                                                            c26981x40bb0da = up5.i.f511523v;
                                                                                        } else {
                                                                                            java.lang.String lowerCase22 = "solitaireFoldInfo".toLowerCase();
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase22, "toLowerCase(...)");
                                                                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase22)) {
                                                                                                c26981x40bb0da = up5.i.f511524w;
                                                                                            } else {
                                                                                                java.lang.String lowerCase23 = "fromUsername".toLowerCase();
                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase23, "toLowerCase(...)");
                                                                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase23)) {
                                                                                                    c26981x40bb0da = up5.i.f511526y;
                                                                                                } else {
                                                                                                    java.lang.String lowerCase24 = "toUsername".toLowerCase();
                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase24, "toLowerCase(...)");
                                                                                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase24)) {
                                                                                                        c26981x40bb0da = up5.i.f511527z;
                                                                                                    } else {
                                                                                                        java.lang.String lowerCase25 = "historyId".toLowerCase();
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase25, "toLowerCase(...)");
                                                                                                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase25)) {
                                                                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageDBProvider", "Unknown column name: " + str + ", using all fields instead");
                                                                                                            return null;
                                                                                                        }
                                                                                                        c26981x40bb0da = up5.i.f511525x;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c26981x40bb0da);
            arrayList.add(c26981x40bb0da);
        }
        return (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) arrayList.toArray(new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[0]);
    }

    public final android.database.Cursor c0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da.lt(j17).and(up5.i.f511511j.eq(talker)).and(up5.i.f511506e.in(types))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor c1(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511508g.eq(0).and(up5.i.f511511j.eq(talker)).and(up5.i.f511507f.m108325x6424adf(6)).and(up5.i.f511506e.eq(i17))).m106433xb80cf445(up5.i.f511504c.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:61:0x003c, B:7:0x004b, B:16:0x0059, B:17:0x0070, B:19:0x0076, B:22:0x00a5, B:26:0x00c1, B:28:0x00db, B:29:0x00f9, B:31:0x0113, B:32:0x0141, B:36:0x015e, B:38:0x0161, B:40:0x0178, B:42:0x0192, B:44:0x01b0, B:47:0x01cc, B:50:0x01d4, B:52:0x01e2), top: B:60:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor d(l75.k0 r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.z2.d(l75.k0, java.lang.String, java.lang.String, java.lang.String[]):android.database.Cursor");
    }

    public final int d0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String imgTypeStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgTypeStr, "imgTypeStr");
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(r26.n0.f0(imgTypeStr, new java.lang.String[]{","}, false, 0, 6, null)))));
        if (m107282xc8d0d0ea != null) {
            return m107282xc8d0d0ea.m106360xb58848b9();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d1(l75.k0 db6, java.lang.String table, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        try {
            up5.w wVar = (up5.w) r1(db6, table).m107139x946de4d9(up5.i.a(), up5.i.f511505d.eq(j17));
            if (wVar != null) {
                return wVar.f511624a;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgLocalIdByMsgSvrId failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor e(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106431xc3376493 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.o1(j17)).and(up5.i.f511506e.m108239xad384d8a(65535).in(types))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i18).m106431xc3376493(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106431xc3376493, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), m106431xc3376493.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor e0(l75.k0 db6, java.lang.String tableName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc(up5.i.f511513l).m106436x6bdbce7(up5.i.f511506e.eq(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String e1(l75.k0 db6, java.lang.String tableName, long j17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            up5.w wVar = (up5.w) r1(db6, tableName).m107139x946de4d9(up5.i.a(), up5.i.f511504c.eq(j17));
            if (wVar != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                g95.e0.k(f9Var, wVar);
                str = f9Var.G;
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getMsgSourceById failed: " + th6.getMessage());
            return "";
        }
    }

    public final android.database.Cursor f(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, int i18, long j17, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = up5.i.f511511j.eq(talker).and(up5.i.f511506e.eq(i19));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106431xc3376493 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(and, j17 > 0, new ot0.p1(j17))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i18).m106431xc3376493(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106431xc3376493, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), m106431xc3376493.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor f0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc(up5.i.f511513l).m106436x6bdbce7(up5.i.f511506e.in(types));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final int f1(l75.k0 db6, java.lang.String tableName, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        if (f9Var == null) {
            return 0;
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511511j.eq(f9Var.Q0()).and(up5.i.f511508g.eq(0)).and(up5.i.f511504c.ge(f9Var.m124847x74d37ac6()))).m108806xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteByMsgId failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor g(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, int i18, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511506e.in(types).and(up5.i.f511511j.eq(talker)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i18).m106431xc3376493(i17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final int g0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b();
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492[] interfaceC27022x3ee6b492Arr = new com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492[1];
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511504c;
            interfaceC27022x3ee6b492Arr[0] = c26981x40bb0da != null ? c26981x40bb0da.m108258x5a7510f() : null;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = c27047xc5bef32b.m108807xc9ff34fc(interfaceC27022x3ee6b492Arr).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, z17, new ot0.f2(j17)).and(up5.i.f511506e.in(types))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getImgVideoAlbumMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 g1(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, mmsgTable);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511522u;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.lt(j17)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor h(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(types))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final int h0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, z17, new ot0.g2(j17)).and(up5.i.f511506e.in(types)).and(up5.i.f511510i.lt(j18))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getImgVideoCountEarlyThan failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor h1(l75.k0 db6, java.lang.String talker, java.lang.String tableName, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc(up5.i.f511512k).m106436x6bdbce7(up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(types)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor i(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.q1(j17)).and(up5.i.f511506e.in(types)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i18).m106431xc3376493(i17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final java.util.List i0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, boolean z17, long j17, long j18, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        if (j18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getImgVideoMessage: message not found");
            return new java.util.ArrayList();
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e = z17 ? com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc : com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc;
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 gt6 = z17 ? c26981x40bb0da.gt(j18) : c26981x40bb0da.lt(j18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gt6);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(types)).and(gt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        java.util.Collection<up5.w> m107112xde3eb429 = r17.m107112xde3eb429(a17, ot0.d3.b(and, j17 > 0, new ot0.h2(j17)), up5.i.f511510i.m108070x651874e(enumC27016x48e972e), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        return !z17 ? kz5.n0.V0(kz5.n0.x0(V0)) : V0;
    }

    public final int i1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(eq6.and(c26981x40bb0da.lt(j17))).m108806xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc)).m108804xc3376493(i17));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getPositionByCreateTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor j(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = up5.i.f511511j.eq(talker).and(up5.i.f511506e.in(types));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(and.and(c26981x40bb0da.ge(j17)).and(c26981x40bb0da.lt(j18))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final int j0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r17.m107282xc8d0d0ea(m108792x3017aa.m108812x6bdbce7(ot0.d3.b(eq6, z17, new ot0.i2(j17)).and(up5.i.f511506e.in(types))));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getImgVideoMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    public final long j1(l75.k0 db6, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106361xfb822ef2();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getTotalMsgCount failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor k(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17, long j18, java.util.List mediaTypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaTypes, "mediaTypes");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.ge(j17)).and(c26981x40bb0da.le(j18)).and(up5.i.f511506e.m108239xad384d8a(65535).in(mediaTypes)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final android.database.Cursor k0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, j18 > 0, new ot0.j2(j18)));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m106402x83249ab9 = m106436x6bdbce7.m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(j17).m106402x83249ab9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106402x83249ab9, "getStatement(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = ot0.d3.a(db6).m106833x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106428x3017aa(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8(m106402x83249ab9).m108435x730bcac6()).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 b17 = ot0.d3.b(eq6, j17 > 0, new ot0.y2(j17));
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, b17.and(c26981x40bb0da.lt(j18)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17 - 1);
            return wVar != null ? wVar.f511630g : j18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getUpIncMsgCreateTime failed: " + th6.getMessage());
            return j18;
        }
    }

    public final java.util.List l(l75.k0 db6, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        java.util.List<up5.w> m106424xeffdfc33 = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106424xeffdfc33();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106424xeffdfc33, "allObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m106424xeffdfc33, 10));
        for (up5.w wVar : m106424xeffdfc33) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return arrayList;
    }

    public final android.database.Cursor l0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, java.lang.String member, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.k2(j17)).and(up5.i.f511512k.m108288x32af97(member.concat("%")))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 l1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, c26981x40bb0da.lt(j17).and(up5.i.f511508g.eq(0)).and(up5.i.f511511j.eq(talker)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17 - 1);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final java.util.List m(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107112xde3eb429 = r17.m107112xde3eb429(a17, eq6.and(c26981x40bb0da.gt(j17)).and(up5.i.f511506e.m108325x6424adf(10000).or(up5.i.f511508g.eq(2))), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor m0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(ot0.d3.b(eq6, j17 > 0, new ot0.l2(j17)).and(up5.i.f511508g.eq(1))).m106433xb80cf445(up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc)).m106429x6234bbb(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
    }

    public final boolean m1(l75.k0 db6, java.lang.String tableName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511505d.eq(j17)));
            return (m107282xc8d0d0ea != null ? m107282xc8d0d0ea.m106360xb58848b9() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "hasSvrId failed: " + th6.getMessage());
            return false;
        }
    }

    public final java.util.List n(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107112xde3eb429 = r17.m107112xde3eb429(a17, eq6.and(c26981x40bb0da.gt(j17)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List n0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107111xde3eb429 = r17.m107111xde3eb429(a17, eq6.and(c26981x40bb0da.gt(j17).and(up5.i.f511506e.in(types))), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
        for (up5.w wVar : m107111xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n1(l75.k0 db6, java.lang.String tableName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            return ((up5.w) r1(db6, tableName).m107127x946de4d9(up5.i.f511505d.eq(j17))) != null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "hasSvrIdFast failed: " + th6.getMessage());
            return false;
        }
    }

    public final java.util.List o(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107112xde3eb429 = r17.m107112xde3eb429(a17, eq6.and(c26981x40bb0da.lt(j17)).and(up5.i.f511506e.m108325x6424adf(10000).or(up5.i.f511508g.eq(2))), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor o0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, tableName).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.ge(currentTimeMillis).and(up5.i.f511506e.in(types)))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public final long o1(l75.k0 db6, java.lang.String tableName, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        up5.w wVar = new up5.w();
        try {
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] l17 = g95.e0.l(wVar, msg.mo9763xeb27878e());
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
            if (l17 == null) {
                l17 = up5.i.a();
            }
            r17.m107159x7beb81f7(wVar, l17);
            return wVar.f511624a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "insert failed: " + th6.getMessage());
            return -2L;
        }
    }

    public final android.database.Cursor p(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int[] types, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cols, "cols");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, table).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(c17, c17.length));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 in6 = up5.i.f511506e.in(kz5.z.x0(types));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = m106435xc9ff34fc.m106436x6bdbce7(in6.and(c26981x40bb0da.gt(j17)).and(c26981x40bb0da.lt(j18)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    public final java.util.List p0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107111xde3eb429 = r17.m107111xde3eb429(a17, c26981x40bb0da.gt(currentTimeMillis).and(up5.i.f511506e.in(types)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
        for (up5.w wVar : m107111xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final boolean p1(l75.k0 db6, java.lang.String tableName, java.lang.String msgId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, tableName).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(tableName).m108812x6bdbce7(up5.i.f511506e.eq(i17).and(up5.i.f511504c.eq(msgId))));
            return (m107282xc8d0d0ea != null ? m107282xc8d0d0ea.m106360xb58848b9() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "isMsgExistByIdAndType failed: " + th6.getMessage());
            return false;
        }
    }

    public final android.database.Cursor q(l75.k0 db6, java.lang.String table, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106436x6bdbce7 = r1(db6, table).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24)).m106436x6bdbce7(up5.i.f511510i.lt(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106436x6bdbce7, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), m106436x6bdbce7.m106402x83249ab9(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 q0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107141x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker).and(up5.i.f511523v.m108239xad384d8a(2).eq(1)), up5.i.f511522u.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final boolean q1(l75.k0 db6, java.lang.String table, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, table).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(table).m108812x6bdbce7(up5.i.f511504c.eq(j17)));
            return (m107282xc8d0d0ea != null ? m107282xc8d0d0ea.m106360xb58848b9() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "isMsgLocalIdExist failed: " + th6.getMessage());
            return false;
        }
    }

    public final int r(l75.k0 db6, java.lang.String mmsgTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107282xc8d0d0ea = r1(db6, mmsgTable).m107282xc8d0d0ea(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b().m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f()).m108792x3017aa(mmsgTable));
            if (m107282xc8d0d0ea != null) {
                return m107282xc8d0d0ea.m106360xb58848b9();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getAllMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, mmsgTable);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, ot0.d3.b(eq6, j17 > 0, new ot0.m2(j17)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
            if (wVar != null) {
                return wVar.f511630g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getLastMessageCreateTime failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r1(l75.k0 k0Var, java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(k0Var).m106824x752de218(str, up5.i.f511503b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
        return m106824x752de218;
    }

    public final java.util.ArrayList s(l75.k0 db6, java.lang.String mmsgTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 172800000;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, mmsgTable);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107111xde3eb429 = r17.m107111xde3eb429(a17, c26981x40bb0da.ge(currentTimeMillis).and(up5.i.f511507f.eq(5)).and(up5.i.f511508g.eq(1)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
        for (up5.w wVar : m107111xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return new java.util.ArrayList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
            up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, ot0.d3.b(eq6, j17 > 0, new ot0.n2(j17)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
            if (wVar != null) {
                return wVar.f511630g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getLastMessageCreateTimeFixTableName failed: " + th6.getMessage());
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:6:0x000b, B:8:0x003d, B:9:0x0041, B:11:0x005f, B:13:0x0091, B:14:0x0098, B:16:0x009e, B:22:0x00c2, B:24:0x00fb, B:28:0x0109, B:37:0x00c6, B:41:0x00cf, B:45:0x00d8, B:49:0x00e1, B:53:0x00ea, B:57:0x00f3, B:64:0x0115, B:68:0x011f, B:70:0x0126, B:74:0x012b, B:75:0x0136, B:77:0x013c, B:81:0x0152), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 s1(java.lang.String r17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.z2.s1(java.lang.String, com.tencent.wcdb.winq.Expression):com.tencent.wcdb.winq.Expression");
    }

    public final java.util.List t(l75.k0 db6, java.lang.String TableNameByTalker, java.util.List msgIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdList, "msgIdList");
        if (msgIdList.isEmpty()) {
            return new java.util.ArrayList();
        }
        try {
            java.util.Collection<up5.w> m107111xde3eb429 = r1(db6, TableNameByTalker).m107111xde3eb429(up5.i.a(), up5.i.f511504c.in(msgIdList), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
            for (up5.w wVar : m107111xde3eb429) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
                g95.e0.k(f9Var, wVar);
                arrayList.add(f9Var);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).k2()) {
                    arrayList2.add(obj);
                }
            }
            return kz5.n0.V0(arrayList2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getAppMsgFileList failed: " + th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    public final java.util.List t0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.Collection<up5.w> m107112xde3eb429 = r1(db6, TableNameByTalker).m107112xde3eb429(up5.i.a(), up5.i.f511511j.eq(talker), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List t1(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : new r26.t("\\s+and\\s+|\\s+AND\\s+").g(str, 0)) {
            if (!r26.n0.N(str2)) {
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*&\\s*(\\d+)\\s*(!=|>=|<=|=|<|>)\\s*(-?\\d+)\\s*$");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                java.lang.String input = r26.n0.u0(str2).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
                java.util.regex.Matcher matcher = compile.matcher(input);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
                r26.m a17 = r26.u.a(matcher, 0, input);
                if (a17 != null) {
                    r26.q qVar = (r26.q) a17;
                    java.lang.String str3 = (java.lang.String) qVar.a().get(1);
                    java.lang.Integer h17 = r26.h0.h((java.lang.String) qVar.a().get(2));
                    java.lang.String str4 = (java.lang.String) qVar.a().get(3);
                    java.lang.Integer h18 = r26.h0.h((java.lang.String) qVar.a().get(4));
                    if (h17 != null && h18 != null) {
                        arrayList.add(new ot0.n1(str3, str4, h18.intValue(), false, h17, 8, null));
                    }
                }
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*(!=|>=|<=|=|<|>)\\s*(-?\\d+)\\s*$");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
                java.lang.String input2 = r26.n0.u0(str2).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input2, "input");
                java.util.regex.Matcher matcher2 = compile2.matcher(input2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher2, "matcher(...)");
                r26.m a18 = r26.u.a(matcher2, 0, input2);
                if (a18 != null) {
                    r26.q qVar2 = (r26.q) a18;
                    java.lang.String str5 = (java.lang.String) qVar2.a().get(1);
                    java.lang.String str6 = (java.lang.String) qVar2.a().get(2);
                    java.lang.Integer h19 = r26.h0.h((java.lang.String) qVar2.a().get(3));
                    if (h19 != null) {
                        arrayList.add(new ot0.n1(str5, str6, h19.intValue(), false, null, 24, null));
                    }
                }
            }
        }
        return arrayList;
    }

    public final java.util.List u(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        java.util.Collection<up5.w> m107111xde3eb429 = r17.m107111xde3eb429(a17, eq6.and(c26981x40bb0da.gt(j17)).and(c26981x40bb0da.le(j18)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107111xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107111xde3eb429, 10));
        for (up5.w wVar : m107111xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List u0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.Collection<up5.w> m107112xde3eb429 = r1(db6, TableNameByTalker).m107112xde3eb429(up5.i.a(), up5.i.f511508g.eq(i17).and(up5.i.f511511j.eq(talker)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final boolean u1(l75.k0 db6, java.lang.String tableName, up5.w wVar, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
            if (c26981x40bb0daArr == null) {
                c26981x40bb0daArr = up5.i.a();
            }
            r17.m107179xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) wVar, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>[]) c26981x40bb0daArr, up5.i.f511504c.eq(j17));
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "updateWithMsgId failed: " + th6.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 v(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, tableName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.lt(j17)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 v0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107140x946de4d9(up5.i.a(), ot0.d3.b(ot0.d3.b(eq6, j17 > 0, new ot0.o2(j17)), j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, new ot0.p2(j18)), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 w(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511522u;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.lt(j17)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 w0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae r17 = r1(db6, TableNameByTalker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] a17 = up5.i.a();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        up5.w wVar = (up5.w) r17.m107141x946de4d9(a17, eq6.and(c26981x40bb0da.gt(j17)), c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    public final java.util.List x(l75.k0 db6, java.lang.String tableName, long j17, long j18, int i17, boolean z17, java.util.List bizAppMsgTypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizAppMsgTypes, "bizAppMsgTypes");
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = up5.i.f511506e.in(bizAppMsgTypes).and(up5.i.f511508g.eq(z17 ? 1 : 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        if (j18 > 0) {
            and = and.and(up5.i.f511510i.lt(j18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        }
        if (j17 > 0) {
            and = and.and(up5.i.f511510i.gt(j17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        }
        java.util.List<T> m107112xde3eb429 = r1(db6, tableName).m107112xde3eb429(up5.i.a(), and, up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (T t17 : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
            g95.e0.k(f9Var, t17);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9[] x0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.Collection<up5.w> m107112xde3eb429 = r1(db6, tableName).m107112xde3eb429(up5.i.a(), up5.i.f511511j.eq(talker), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107112xde3eb429, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107112xde3eb429, 10));
        for (up5.w wVar : m107112xde3eb429) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.f9[]) kz5.n0.x0(arrayList).toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.f9[0]);
    }

    public final java.util.LinkedList y(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String bizClientMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizClientMsgId, "bizClientMsgId");
        try {
            java.util.Collection<up5.w> m107094xde3eb429 = r1(db6, tableName).m107094xde3eb429(up5.i.f511511j.eq(talker).and(up5.i.f511519r.eq(bizClientMsgId)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107094xde3eb429, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107094xde3eb429, 10));
            for (up5.w wVar : m107094xde3eb429) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
                g95.e0.k(f9Var, wVar);
                arrayList.add(f9Var);
            }
            return new java.util.LinkedList(arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MessageDBProvider", e17, "getByBizClientMsgId error: %s", e17.getMessage());
            return new java.util.LinkedList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long y0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmsgTable, "mmsgTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            up5.w wVar = (up5.w) r1(db6, mmsgTable).m107141x946de4d9(up5.i.a(), up5.i.f511511j.eq(talker), up5.i.f511522u.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
            if (wVar != null) {
                return wVar.f511642s;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getLastMsgSeq failed: " + th6.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 z(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).m107139x946de4d9(up5.i.a(), up5.i.f511510i.eq(j17).and(up5.i.f511511j.eq(talker)));
        if (wVar != null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 z0(l75.k0 db6, java.lang.String tableName, java.lang.String filterSql) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterSql, "filterSql");
        try {
            up5.w wVar = (up5.w) r1(db6, tableName).m107141x946de4d9(up5.i.a(), s1(filterSql, null), up5.i.f511510i.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), 0L);
            if (wVar == null) {
                return new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            g95.e0.k(f9Var, wVar);
            return f9Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "getLastMsgWithFilterSql failed: " + th6.getMessage());
            return new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
    }

    public final android.database.Cursor g(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = r1(db6, TableNameByTalker).m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da.ge(j17).and(c26981x40bb0da.lt(j18)).and(up5.i.f511506e.in(types)).and(up5.i.f511511j.eq(talker))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }
}
