package c34;

/* loaded from: classes11.dex */
public class u extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f119774e = {"CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f119775f = {l75.n0.m145250x3fdc6f77(c34.t.L, "shakemessage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f119776d;

    public u(l75.k0 k0Var) {
        super(k0Var, c34.t.L, "shakemessage", f119774e);
        this.f119776d = k0Var;
    }

    public int f() {
        android.database.Cursor f17 = this.f119776d.f("select count(*) from " + mo145255x88e404c3() + " where status != 1", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(c34.t tVar) {
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
            return false;
        }
        if (!super.mo880xb970c2b9(tVar)) {
            return false;
        }
        mo145247xf35bbb4(tVar.f72763xa3c65b86 + "");
        return true;
    }
}
