package vn3;

/* loaded from: classes13.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Long f519960e = 1209600L;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f519961f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.f233911y0, "NewTipsInfo2")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f519962g = {"CREATE INDEX IF NOT EXISTS uniqueIdIndex ON NewTipsInfo2 ( uniqueId )", "CREATE INDEX IF NOT EXISTS pathQueryIndex ON NewTipsInfo2 ( path,state,beginShowTime,disappearTime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f519963d;

    public b(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.f233911y0, "NewTipsInfo2", f519962g);
        this.f519963d = k0Var;
    }

    public java.util.List D0(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        android.database.Cursor E = this.f519963d.E("NewTipsInfo2", com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.f233911y0.f398487c, "uniqueId=?", new java.lang.String[]{str + ""}, null, null, null);
        if (E == null) {
            return arrayList;
        }
        while (E.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k();
            kVar.mo9015xbf5d97fd(E);
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public java.util.List J0(vn3.c cVar) {
        if (cVar == null) {
            return new java.util.ArrayList();
        }
        if (cVar.f519966c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = cVar.f519964a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                long a17 = c01.id.a() / 1000;
                android.database.Cursor E = this.f519963d.E("NewTipsInfo2", com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.f233911y0.f398487c, "dynamicPath=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new java.lang.String[]{str, "0", a17 + "", o45.wf.f424562g + "", o45.wf.f424562g + ""}, null, null, null);
                if (E != null) {
                    while (E.moveToNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k();
                        kVar.mo9015xbf5d97fd(E);
                        if (y0(a17, kVar)) {
                            arrayList.add(kVar);
                        }
                    }
                }
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = cVar.f519965b;
        if (i17 != 0) {
            long a18 = c01.id.a() / 1000;
            android.database.Cursor E2 = this.f519963d.E("NewTipsInfo2", com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.f233911y0.f398487c, "path=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new java.lang.String[]{i17 + "", "0", a18 + "", o45.wf.f424562g + "", o45.wf.f424562g + ""}, null, null, null);
            if (E2 != null) {
                while (E2.moveToNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k();
                    kVar2.mo9015xbf5d97fd(E2);
                    if (y0(a18, kVar2)) {
                        arrayList2.add(kVar2);
                    }
                }
                E2.close();
            }
        }
        return arrayList2;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        if (kVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(kVar);
    }

    public int P0(java.util.List list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        l75.k0 k0Var = this.f519963d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        try {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it.next();
                if (kVar == null ? false : mo11261xce0038c9(kVar.f72763xa3c65b86, kVar)) {
                    i17++;
                }
            }
            return i17;
        } finally {
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
        }
    }

    public final boolean y0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        long j18 = kVar.f67135xa9e31799;
        if (j18 != 0 && j17 - j18 > f519960e.longValue()) {
            return false;
        }
        long j19 = kVar.f67141xcd55f7c8;
        if (j19 == 0) {
            return j17 < kVar.f67132x1a23a28b;
        }
        long j27 = kVar.f67135xa9e31799 == 0 ? j19 + j17 : kVar.f67134xfdcf4dc4;
        long j28 = kVar.f67132x1a23a28b;
        if (j28 != 0) {
            j27 = java.lang.Math.min(j27, j28);
        }
        return j17 < j27;
    }

    public boolean z0() {
        int i17;
        try {
            i17 = this.f519963d.mo70514xb06685ab("NewTipsInfo2", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteAllData exception:%s", e17.toString());
            i17 = 0;
        }
        return i17 > 0;
    }
}
