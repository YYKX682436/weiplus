package c34;

/* loaded from: classes11.dex */
public class u extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f38241e = {"CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f38242f = {l75.n0.getCreateSQLs(c34.t.L, "shakemessage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f38243d;

    public u(l75.k0 k0Var) {
        super(k0Var, c34.t.L, "shakemessage", f38241e);
        this.f38243d = k0Var;
    }

    public int f() {
        android.database.Cursor f17 = this.f38243d.f("select count(*) from " + getTableName() + " where status != 1", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean insert(c34.t tVar) {
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
            return false;
        }
        if (!super.insert(tVar)) {
            return false;
        }
        doNotify(tVar.systemRowid + "");
        return true;
    }
}
