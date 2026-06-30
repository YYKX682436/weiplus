package y63;

/* loaded from: classes5.dex */
public class c extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Long f541191e = 86400L;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Long f541192f = 3600L;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f541193g = {l75.n0.m145250x3fdc6f77(y63.a.R, "GroupSolitatire")};

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f541194h = {"DROP INDEX IF EXISTS usernameIndex", "CREATE INDEX IF NOT EXISTS GroupSolitatire_usernameIndex ON GroupSolitatire ( username )", "CREATE INDEX IF NOT EXISTS usernameKeyIndex ON GroupSolitatire ( username,key )", "CREATE INDEX IF NOT EXISTS usernameKeyActiveIndex ON GroupSolitatire ( username,key,active )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f541195d;

    public c(l75.k0 k0Var) {
        super(k0Var, y63.a.R, "GroupSolitatire", f541194h);
        this.f541195d = k0Var;
    }

    public java.util.List D0(java.lang.String str, int i17) {
        android.database.Cursor cursor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        long e17 = c01.id.e();
        if (i17 == 1) {
            l75.k0 k0Var = this.f541195d;
            java.lang.String[] strArr = y63.a.R.f398487c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            kk.j jVar = x63.g.f533768a;
            sb6.append(e17 - (5 * f541191e.longValue()));
            sb6.append("");
            cursor = k0Var.E("GroupSolitatire", strArr, "username=? and active=? and lastActiveTime>=?", new java.lang.String[]{str, "1", sb6.toString()}, null, null, "lastActiveTime DESC ");
        } else if (i17 == 0) {
            cursor = this.f541195d.E("GroupSolitatire", y63.a.R.f398487c, "username=? and active=? and lastActiveTime>=?", new java.lang.String[]{str, "0", (e17 - (x63.g.p() * f541192f.longValue())) + ""}, null, null, "lastActiveTime DESC ");
        } else {
            cursor = null;
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            y63.a aVar = new y63.a();
            aVar.mo9015xbf5d97fd(cursor);
            x63.g.n(aVar);
            arrayList.add(aVar);
        }
        cursor.close();
        return arrayList;
    }

    public y63.a J0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor E;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (E = this.f541195d.E("GroupSolitatire", y63.a.R.f398487c, "username=? and key=?", new java.lang.String[]{str, str2}, null, null, "lastActiveTime DESC")) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (E.moveToNext()) {
            y63.a aVar = new y63.a();
            aVar.mo9015xbf5d97fd(E);
            x63.g.n(aVar);
            arrayList.add(aVar);
        }
        E.close();
        if (arrayList.size() == 0) {
            return null;
        }
        y63.a aVar2 = (y63.a) arrayList.get(0);
        x63.a c17 = ((t63.e) i95.n0.c(t63.e.class)).wi().c(str);
        if (c17 != null) {
            int i17 = aVar2.f66134xf102adeb;
            if (i17 == 0 && aVar2.f66139x3647780e >= c17.f533765d) {
                return aVar2;
            }
            if (i17 == 1 && aVar2.f66139x3647780e >= c17.f533763b) {
                return aVar2;
            }
        }
        return null;
    }

    public y63.a L0(java.lang.String str, java.lang.String str2, boolean z17) {
        y63.a J0 = J0(str, str2);
        if (!z17) {
            return J0;
        }
        x63.a c17 = ((t63.e) i95.n0.c(t63.e.class)).wi().c(str);
        if (J0 != null && c17 != null) {
            int i17 = J0.f66134xf102adeb;
            if (i17 == 1) {
                if (J0.f66139x3647780e < c17.f533763b) {
                    if (c17.f533762a) {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().f(J0, 2);
                    } else {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().f(J0, 1);
                    }
                    if (mo70496xb06685ab(J0.f72763xa3c65b86)) {
                        return null;
                    }
                }
            } else if (i17 == 0 && J0.f66139x3647780e < c17.f533765d) {
                if (c17.f533764c) {
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().f(J0, 2);
                } else {
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().f(J0, 1);
                }
                if (mo70496xb06685ab(J0.f72763xa3c65b86)) {
                    return null;
                }
            }
        }
        return J0;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(y63.a aVar) {
        if (aVar == null) {
            return false;
        }
        kk.j jVar = x63.g.f533768a;
        if (aVar.L == 1 && x63.g.F(aVar.H)) {
            return false;
        }
        aVar.f66135xad49e234 = x63.g.b(aVar);
        if (aVar.N.size() > 1) {
            aVar.f66134xf102adeb = 1;
        } else if (aVar.f66134xf102adeb == -1) {
            aVar.f66134xf102adeb = 0;
        }
        return super.mo880xb970c2b9(aVar);
    }

    public boolean W0(y63.a aVar, boolean z17) {
        if (aVar == null) {
            return false;
        }
        kk.j jVar = x63.g.f533768a;
        if (aVar.L == 1 && x63.g.F(aVar.H)) {
            return false;
        }
        if (!z17) {
            aVar.f66135xad49e234 = x63.g.b(aVar);
            if (aVar.N.size() > 1) {
                aVar.f66134xf102adeb = 1;
            } else if (aVar.f66134xf102adeb == -1) {
                aVar.f66134xf102adeb = 0;
            }
        }
        boolean mo11261xce0038c9 = mo11261xce0038c9(aVar.f72763xa3c65b86, aVar);
        if (mo11261xce0038c9) {
            ((t63.e) i95.n0.c(t63.e.class)).wi().b(aVar.f66142xdec927b, aVar.f66138x4b6e619a);
        }
        return mo11261xce0038c9;
    }

    public boolean y0(java.lang.String str, int i17, long j17) {
        int i18;
        try {
            i18 = this.f541195d.mo70514xb06685ab("GroupSolitatire", "username=? and lastActiveTime<? and active=?", new java.lang.String[]{str, j17 + "", i17 + ""});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireStorage", "deleteExpireData username:%s lastTime:%s Exception:%s", str, java.lang.Long.valueOf(j17), e17.getMessage());
            i18 = 0;
        }
        return i18 > 0;
    }

    public java.util.List z0(java.lang.String str, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        android.database.Cursor E = this.f541195d.E("GroupSolitatire", y63.a.R.f398487c, "username=? and active=? and lastActiveTime<?", new java.lang.String[]{str, i17 + "", j17 + ""}, null, null, null);
        if (E == null) {
            return arrayList;
        }
        while (E.moveToNext()) {
            y63.a aVar = new y63.a();
            aVar.mo9015xbf5d97fd(E);
            arrayList.add(aVar);
        }
        E.close();
        return arrayList;
    }
}
