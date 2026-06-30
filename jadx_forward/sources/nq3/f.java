package nq3;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f420527a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420528b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420529c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420530d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420531e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420532f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420533g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f420534h;

    public f(kq3.h hVar) {
        this.f420527a = hVar;
        if (hVar.e(2L, 0L) != 4) {
            if (hVar.g("C2CMsgAutoDownloadFile")) {
                hVar.b("C2CMsgAutoDownloadFile");
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (id TEXT, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, filesize INTEGER, fileext TEXT, opentime INTEGER, priority FLOAT, prioritytype INTEGER, fileid TEXT, PRIMARY KEY(id, msgsvrid));", "C2CMsgAutoDownloadFile"));
            hVar.c(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", "C2CMsgAutoDownloadFile_Priority_CreateTime", "C2CMsgAutoDownloadFile"));
            hVar.i(2L, 4L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "Exist Table %s Count %s", "C2CMsgAutoDownloadFile", java.lang.Integer.valueOf(hVar.f("C2CMsgAutoDownloadFile")));
        }
        this.f420528b = hVar.a(java.lang.String.format("INSERT OR IGNORE INTO %s (id, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, filesize, fileext, opentime, priority, prioritytype, fileid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);", "C2CMsgAutoDownloadFile"));
        this.f420529c = hVar.a(java.lang.String.format("DELETE FROM %s WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f420530d = hVar.a(java.lang.String.format("DELETE FROM %s WHERE fromuser = ?;", "C2CMsgAutoDownloadFile"));
        this.f420531e = hVar.a(java.lang.String.format("UPDATE %s SET status = ? WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f420532f = hVar.a(java.lang.String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f420533g = hVar.a(java.lang.String.format("UPDATE %s SET downloadtime = ?, status = ? WHERE id = ? AND msgsvrid = ? AND downloadtime = 0", "C2CMsgAutoDownloadFile"));
        this.f420534h = hVar.a(java.lang.String.format("UPDATE %s SET opentime = ? WHERE id = ? AND msgsvrid = ? AND opentime = 0", "C2CMsgAutoDownloadFile"));
    }

    public final r45.qc a(android.database.Cursor cursor) {
        r45.qc qcVar = new r45.qc();
        qcVar.f465351d = cursor.getString(0);
        qcVar.f465352e = cursor.getString(1);
        qcVar.f465353f = cursor.getString(2);
        qcVar.f465354g = cursor.getInt(3);
        qcVar.f465355h = cursor.getLong(4);
        qcVar.f465356i = cursor.getInt(5);
        qcVar.f465357m = cursor.getInt(6);
        qcVar.f465358n = cursor.getLong(7);
        qcVar.f465359o = cursor.getLong(8);
        qcVar.f465360p = cursor.getInt(9);
        qcVar.f465361q = cursor.getString(10);
        qcVar.f465362r = cursor.getLong(11);
        qcVar.f465363s = cursor.getFloat(12);
        qcVar.f465364t = cursor.getInt(13);
        qcVar.f465365u = cursor.getString(14);
        return qcVar;
    }

    public void b(java.lang.String str, long j17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f420529c;
        c26970x63d6eaa3.m107801x35198eae(1, str);
        c26970x63d6eaa3.m107799x37fbf859(2, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %s img %s %s", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), str, java.lang.Long.valueOf(j17));
    }

    public r45.qc c(java.lang.String str, long j17) {
        android.database.Cursor h17 = this.f420527a.h(java.lang.String.format("SELECT * FROM %s WHERE id = ? AND msgsvrid = ?;", "C2CMsgAutoDownloadFile"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
        try {
            if (h17.moveToNext()) {
                return a(h17);
            }
            h17.close();
            return null;
        } finally {
            h17.close();
        }
    }

    public void d(r45.qc qcVar) {
        java.lang.String str = qcVar.f465351d;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f420528b;
        c26970x63d6eaa3.m107801x35198eae(1, str);
        c26970x63d6eaa3.m107801x35198eae(2, qcVar.f465352e);
        c26970x63d6eaa3.m107801x35198eae(3, qcVar.f465353f);
        c26970x63d6eaa3.m107799x37fbf859(4, qcVar.f465354g);
        c26970x63d6eaa3.m107799x37fbf859(5, qcVar.f465355h);
        c26970x63d6eaa3.m107799x37fbf859(6, qcVar.f465356i);
        c26970x63d6eaa3.m107799x37fbf859(7, qcVar.f465357m);
        c26970x63d6eaa3.m107799x37fbf859(8, qcVar.f465358n);
        c26970x63d6eaa3.m107799x37fbf859(9, qcVar.f465359o);
        c26970x63d6eaa3.m107799x37fbf859(10, qcVar.f465360p);
        c26970x63d6eaa3.m107801x35198eae(11, qcVar.f465361q);
        c26970x63d6eaa3.m107799x37fbf859(12, qcVar.f465362r);
        c26970x63d6eaa3.m107798x1b3baa6e(13, qcVar.f465363s);
        c26970x63d6eaa3.m107799x37fbf859(14, qcVar.f465364t);
        c26970x63d6eaa3.m107801x35198eae(15, qcVar.f465365u);
        c26970x63d6eaa3.m107867xb158f775();
    }

    public boolean e(java.lang.String str, long j17) {
        android.database.Cursor h17 = this.f420527a.h(java.lang.String.format("SELECT 1 FROM %s WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
        try {
            return h17.moveToNext();
        } finally {
            h17.close();
        }
    }

    public void f(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f420531e;
        c26970x63d6eaa3.m107799x37fbf859(1, i17);
        c26970x63d6eaa3.m107801x35198eae(2, str);
        c26970x63d6eaa3.m107799x37fbf859(3, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatus %s res %s %s %s", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
