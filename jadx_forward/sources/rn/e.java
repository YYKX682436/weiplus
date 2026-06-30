package rn;

/* loaded from: classes13.dex */
public class e extends l75.n0 implements l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Long f479132e = 604800000L;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f479133f = {l75.n0.m145250x3fdc6f77(rn.c.T, "GroupTodo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f479134g = {"DROP INDEX IF EXISTS todoIdIndex", "DROP INDEX IF EXISTS roomNameIndex", "CREATE INDEX IF NOT EXISTS todoIdRoomNameIndex ON GroupTodo ( todoid,roomname )", "CREATE INDEX IF NOT EXISTS roomNameCreateTimeIndex ON GroupTodo ( roomname,createtime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f479135d;

    public e(l75.k0 k0Var) {
        super(k0Var, rn.c.T, "GroupTodo", f479134g);
        this.f479135d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(rn.c cVar) {
        if (cVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(cVar);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (i17 == 5 && (a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoStorage", "delete, username %s", java.lang.Integer.valueOf(i17), str);
            ((ku5.t0) ku5.t0.f394148d).g(new rn.d(this, str));
        }
    }

    public boolean y0(rn.c cVar) {
        if (cVar == null) {
            return true;
        }
        if (cVar.f72763xa3c65b86 == -1) {
            rn.c z07 = z0(cVar.f66259x137a1f8b, cVar.f66264x1210aac6);
            if (z07 == null) {
                return true;
            }
            cVar.f72763xa3c65b86 = z07.f72763xa3c65b86;
        }
        return mo70496xb06685ab(cVar.f72763xa3c65b86);
    }

    public rn.c z0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor E;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (E = this.f479135d.E("GroupTodo", rn.c.T.f398487c, "roomname=? and todoid=?", new java.lang.String[]{str, str2}, null, null, null)) == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (E.moveToNext()) {
                rn.c cVar = new rn.c();
                cVar.mo9015xbf5d97fd(E);
                arrayList.add(cVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (rn.c) arrayList.get(0);
        } finally {
            E.close();
        }
    }
}
