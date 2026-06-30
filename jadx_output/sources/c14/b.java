package c14;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f37937e = {l75.n0.getCreateSQLs(c14.a.f37936t, "SelectRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f37938f = {"CREATE INDEX IF NOT EXISTS SelectRecord_historyIdIndex ON SelectRecord ( historyId )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f37939d;

    public b(l75.k0 k0Var) {
        super(k0Var, c14.a.f37936t, "SelectRecord", f37938f);
        this.f37939d = k0Var;
    }

    public c14.a D0(java.lang.String str) {
        android.database.Cursor D = this.f37939d.D("SelectRecord", c14.a.f37936t.f316954c, "historyId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (D.moveToNext()) {
                c14.a aVar = new c14.a();
                aVar.convertFrom(D);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (c14.a) arrayList.get(0);
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.selectRecord.SelectRecordStorage", th6, "getSelectRecordItem err", new java.lang.Object[0]);
                return null;
            } finally {
                D.close();
            }
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insert(c14.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }

    public boolean L0(java.lang.String str, r45.ty tyVar) {
        c14.a D0 = D0(str);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + tyVar + "] selectRecordItem == null");
            return false;
        }
        D0.field_chatHistoryItem = tyVar;
        boolean update = super.update(D0.systemRowid, D0);
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + tyVar + "] updateRes:%s itemsize:%s", java.lang.Boolean.valueOf(update), java.lang.Integer.valueOf(tyVar == null ? -1 : tyVar.f386859d.size()));
        return update;
    }

    public boolean y0(java.lang.String str) {
        r45.ty tyVar;
        java.util.LinkedList linkedList;
        c14.a D0 = D0(str);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SelectRecordStorage", "deleteRelatedMsgs() called with: historyId = [" + str + "] selectRecordItem == null");
            return false;
        }
        if (android.text.TextUtils.isEmpty(D0.field_talker) || (tyVar = D0.field_chatHistoryItem) == null || (linkedList = tyVar.f386859d) == null || linkedList.size() <= 0) {
            return true;
        }
        try {
            java.util.Iterator it = D0.field_chatHistoryItem.f386859d.iterator();
            while (it.hasNext()) {
                c01.w9.g(D0.field_talker, ((java.lang.Long) it.next()).longValue());
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.selectRecord.SelectRecordStorage", th6, "deleteRelatedMsgs err", new java.lang.Object[0]);
            return true;
        }
    }

    public com.tencent.mm.storage.f9 z0(java.lang.String str) {
        android.database.Cursor D;
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (D = this.f37939d.D("SelectRecord", c14.a.f37936t.f316954c, "historyId=?", new java.lang.String[]{str}, null, null, null, 2)) == null) {
            return f9Var;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (D.moveToNext()) {
                c14.a aVar = new c14.a();
                aVar.convertFrom(D);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return f9Var;
            }
            c14.a aVar2 = (c14.a) arrayList.get(0);
            return pt0.f0.Li(aVar2.field_talker, aVar2.field_msgId);
        } finally {
            D.close();
        }
    }
}
