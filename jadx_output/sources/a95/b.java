package a95;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f2472e = {l75.n0.getCreateSQLs(a95.a.f2471v, "FileMsgInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f2473f = {"CREATE INDEX IF NOT EXISTS FileMsgInfo_overwriteNewMsgIdIndex ON FileMsgInfo ( overwriteNewMsgId )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f2474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, a95.a.f2471v, "FileMsgInfo", f2473f);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = a95.a.f2471v;
        this.f2474d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(a95.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }

    public final a95.a y0(long j17) {
        if (j17 == 0) {
            return null;
        }
        l75.k0 k0Var = this.f2474d;
        l75.e0 e0Var = a95.a.f2471v;
        android.database.Cursor E = k0Var.E("FileMsgInfo", a95.a.f2471v.f316954c, "msgSvrId=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null);
        try {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E != null && E.moveToNext()) {
                    a95.a aVar = new a95.a();
                    aVar.convertFrom(E);
                    arrayList.add(aVar);
                }
                a95.a aVar2 = arrayList.size() > 0 ? (a95.a) arrayList.get(0) : null;
                if (E != null) {
                    E.close();
                }
                return aVar2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfo Exception:" + e17.getMessage());
                if (E != null) {
                    E.close();
                }
                return null;
            }
        } catch (java.lang.Throwable th6) {
            if (E != null) {
                E.close();
            }
            throw th6;
        }
    }

    public final a95.a z0(long j17) {
        if (j17 == 0) {
            return null;
        }
        l75.k0 k0Var = this.f2474d;
        l75.e0 e0Var = a95.a.f2471v;
        android.database.Cursor E = k0Var.E("FileMsgInfo", a95.a.f2471v.f316954c, "overwriteNewMsgId=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null);
        try {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E != null && E.moveToNext()) {
                    a95.a aVar = new a95.a();
                    aVar.convertFrom(E);
                    arrayList.add(aVar);
                }
                a95.a aVar2 = arrayList.size() > 0 ? (a95.a) arrayList.get(0) : null;
                if (E != null) {
                    E.close();
                }
                return aVar2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfoByOverwriteMsgId Exception:" + e17.getMessage());
                if (E != null) {
                    E.close();
                }
                return null;
            }
        } catch (java.lang.Throwable th6) {
            if (E != null) {
                E.close();
            }
            throw th6;
        }
    }
}
