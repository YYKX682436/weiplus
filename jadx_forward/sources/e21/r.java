package e21;

/* loaded from: classes11.dex */
public class r extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f328104e = {"CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f328105d;

    public r(l75.k0 k0Var) {
        this.f328105d = k0Var;
    }

    /* renamed from: getCount */
    public int m126807x7444f759() {
        android.database.Cursor B = this.f328105d.B("SELECT COUNT(*) FROM oplog2", null);
        if (B == null || !B.moveToFirst()) {
            if (B != null) {
                B.close();
            }
            return 0;
        }
        int i17 = B.getInt(0);
        B.close();
        return i17;
    }

    public int m0(xg3.q0 q0Var) {
        if (q0Var == null) {
            return -1;
        }
        return this.f328105d.mo70514xb06685ab("oplog2", "id= ? AND inserTime= ?", new java.lang.String[]{"" + q0Var.f535956b, "" + q0Var.f535957c});
    }

    public java.util.List n0(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = this.f328105d.B("select oplog2.id,oplog2.inserTime,oplog2.cmdId,oplog2.buffer,oplog2.reserved1,oplog2.reserved2,oplog2.reserved3,oplog2.reserved4 from oplog2  order by inserTime asc limit ?", new java.lang.String[]{java.lang.String.valueOf(i17)});
        if (B == null) {
            return arrayList;
        }
        int count = B.getCount();
        if (count <= 0) {
            B.close();
            return arrayList;
        }
        for (int i18 = 0; i18 < count; i18++) {
            B.moveToPosition(i18);
            xg3.q0 q0Var = new xg3.q0(0);
            q0Var.f535956b = B.getInt(0);
            q0Var.f535957c = B.getLong(1);
            q0Var.f535958d = B.getInt(2);
            q0Var.f535959e = B.getBlob(3);
            q0Var.f535960f = B.getInt(4);
            q0Var.f535961g = B.getLong(5);
            q0Var.f535962h = B.getString(6);
            q0Var.f535963i = B.getString(7);
            arrayList.add(q0Var);
        }
        B.close();
        return arrayList;
    }

    public boolean s0(xg3.q0 q0Var) {
        if (q0Var == null) {
            return false;
        }
        q0Var.f535955a = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((q0Var.f535955a & 2) != 0) {
            contentValues.put("inserTime", java.lang.Long.valueOf(q0Var.f535957c));
        }
        if ((q0Var.f535955a & 4) != 0) {
            contentValues.put("cmdId", java.lang.Integer.valueOf(q0Var.b()));
        }
        if ((q0Var.f535955a & 8) != 0) {
            contentValues.put("buffer", q0Var.a());
        }
        if ((q0Var.f535955a & 16) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(q0Var.f535960f));
        }
        if ((q0Var.f535955a & 32) != 0) {
            contentValues.put("reserved2", java.lang.Long.valueOf(q0Var.f535961g));
        }
        if ((q0Var.f535955a & 64) != 0) {
            contentValues.put("reserved3", q0Var.f535962h);
        }
        if ((q0Var.f535955a & 128) != 0) {
            contentValues.put("reserved4", q0Var.f535963i);
        }
        int l17 = (int) this.f328105d.l("oplog2", dm.i4.f66865x76d1ec5a, contentValues);
        if (l17 > 0) {
            q0Var.f535956b = l17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpLogStorage", "insert result:%d", java.lang.Integer.valueOf(l17));
        return l17 >= 0;
    }
}
