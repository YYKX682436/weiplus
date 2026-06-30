package c14;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f119470e = {l75.n0.m145250x3fdc6f77(c14.a.f119469t, "SelectRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f119471f = {"CREATE INDEX IF NOT EXISTS SelectRecord_historyIdIndex ON SelectRecord ( historyId )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f119472d;

    public b(l75.k0 k0Var) {
        super(k0Var, c14.a.f119469t, "SelectRecord", f119471f);
        this.f119472d = k0Var;
    }

    public c14.a D0(java.lang.String str) {
        android.database.Cursor D = this.f119472d.D("SelectRecord", c14.a.f119469t.f398487c, "historyId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (D.moveToNext()) {
                c14.a aVar = new c14.a();
                aVar.mo9015xbf5d97fd(D);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (c14.a) arrayList.get(0);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.selectRecord.SelectRecordStorage", th6, "getSelectRecordItem err", new java.lang.Object[0]);
                return null;
            } finally {
                D.close();
            }
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(c14.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(aVar);
    }

    public boolean L0(java.lang.String str, r45.ty tyVar) {
        c14.a D0 = D0(str);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + tyVar + "] selectRecordItem == null");
            return false;
        }
        D0.f66169x260b3a0a = tyVar;
        boolean mo11261xce0038c9 = super.mo11261xce0038c9(D0.f72763xa3c65b86, D0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + tyVar + "] updateRes:%s itemsize:%s", java.lang.Boolean.valueOf(mo11261xce0038c9), java.lang.Integer.valueOf(tyVar == null ? -1 : tyVar.f468392d.size()));
        return mo11261xce0038c9;
    }

    public boolean y0(java.lang.String str) {
        r45.ty tyVar;
        java.util.LinkedList linkedList;
        c14.a D0 = D0(str);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.selectRecord.SelectRecordStorage", "deleteRelatedMsgs() called with: historyId = [" + str + "] selectRecordItem == null");
            return false;
        }
        if (android.text.TextUtils.isEmpty(D0.f66172x114ef53e) || (tyVar = D0.f66169x260b3a0a) == null || (linkedList = tyVar.f468392d) == null || linkedList.size() <= 0) {
            return true;
        }
        try {
            java.util.Iterator it = D0.f66169x260b3a0a.f468392d.iterator();
            while (it.hasNext()) {
                c01.w9.g(D0.f66172x114ef53e, ((java.lang.Long) it.next()).longValue());
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.selectRecord.SelectRecordStorage", th6, "deleteRelatedMsgs err", new java.lang.Object[0]);
            return true;
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 z0(java.lang.String str) {
        android.database.Cursor D;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D = this.f119472d.D("SelectRecord", c14.a.f119469t.f398487c, "historyId=?", new java.lang.String[]{str}, null, null, null, 2)) == null) {
            return f9Var;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (D.moveToNext()) {
                c14.a aVar = new c14.a();
                aVar.mo9015xbf5d97fd(D);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return f9Var;
            }
            c14.a aVar2 = (c14.a) arrayList.get(0);
            return pt0.f0.Li(aVar2.f66172x114ef53e, aVar2.f66171x297eb4f7);
        } finally {
            D.close();
        }
    }
}
