package r61;

/* loaded from: classes11.dex */
public class x1 extends l75.a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f474530e = {"CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f474531d;

    public x1(l75.k0 k0Var) {
        this.f474531d = k0Var;
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f474531d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QQListStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public r61.w1 g(long j17) {
        r61.w1 w1Var = null;
        android.database.Cursor f17 = this.f474531d.f("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + j17 + "\"", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            w1Var = new r61.w1();
            w1Var.a(f17);
        }
        f17.close();
        return w1Var;
    }

    public r61.w1 h(java.lang.String str) {
        r61.w1 w1Var = null;
        android.database.Cursor f17 = this.f474531d.f("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + str + "\"", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            w1Var = new r61.w1();
            w1Var.a(f17);
        }
        f17.close();
        return w1Var;
    }

    public int i(long j17, r61.w1 w1Var) {
        int i17;
        android.content.ContentValues b17 = w1Var.b();
        if (b17.size() > 0) {
            i17 = this.f474531d.p("qqlist", b17, "qq=?", new java.lang.String[]{"" + j17});
        } else {
            i17 = 0;
        }
        if (i17 > 0) {
            b(3, this, "" + j17);
        }
        return i17;
    }
}
