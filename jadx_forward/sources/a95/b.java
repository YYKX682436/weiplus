package a95;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f84005e = {l75.n0.m145250x3fdc6f77(a95.a.f84004v, "FileMsgInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f84006f = {"CREATE INDEX IF NOT EXISTS FileMsgInfo_overwriteNewMsgIdIndex ON FileMsgInfo ( overwriteNewMsgId )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f84007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, a95.a.f84004v, "FileMsgInfo", f84006f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = a95.a.f84004v;
        this.f84007d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(a95.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(aVar);
    }

    public final a95.a y0(long j17) {
        if (j17 == 0) {
            return null;
        }
        l75.k0 k0Var = this.f84007d;
        l75.e0 e0Var = a95.a.f84004v;
        android.database.Cursor E = k0Var.E("FileMsgInfo", a95.a.f84004v.f398487c, "msgSvrId=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null);
        try {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E != null && E.moveToNext()) {
                    a95.a aVar = new a95.a();
                    aVar.mo9015xbf5d97fd(E);
                    arrayList.add(aVar);
                }
                a95.a aVar2 = arrayList.size() > 0 ? (a95.a) arrayList.get(0) : null;
                if (E != null) {
                    E.close();
                }
                return aVar2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfo Exception:" + e17.getMessage());
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
        l75.k0 k0Var = this.f84007d;
        l75.e0 e0Var = a95.a.f84004v;
        android.database.Cursor E = k0Var.E("FileMsgInfo", a95.a.f84004v.f398487c, "overwriteNewMsgId=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null);
        try {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E != null && E.moveToNext()) {
                    a95.a aVar = new a95.a();
                    aVar.mo9015xbf5d97fd(E);
                    arrayList.add(aVar);
                }
                a95.a aVar2 = arrayList.size() > 0 ? (a95.a) arrayList.get(0) : null;
                if (E != null) {
                    E.close();
                }
                return aVar2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfoByOverwriteMsgId Exception:" + e17.getMessage());
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
