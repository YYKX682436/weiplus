package c34;

/* loaded from: classes11.dex */
public class s extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f38239e = {l75.n0.getCreateSQLs(c34.r.f38236y0, "shakeitem1")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f38240d;

    public s(l75.k0 k0Var) {
        super(k0Var, c34.r.f38236y0, "shakeitem1", null);
        this.f38240d = k0Var;
        k0Var.A("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
        k0Var.A("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
    }

    public int D0(java.lang.String str) {
        int delete = this.f38240d.delete("shakeitem1", "(username=?)", new java.lang.String[]{"" + str});
        if (delete > 0) {
            doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewShakeItemStorage", "delByusername:" + str + " result:" + delete);
        return delete;
    }

    public boolean J0(c34.r rVar, boolean z17) {
        if (rVar == null) {
            return false;
        }
        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_username)) {
            D0(rVar.field_username);
        }
        rVar.f38237p0 = -1;
        return super.insert(rVar);
    }

    public void L0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewShakeItemStorage", "setAllOld");
        c34.r rVar = new c34.r();
        rVar.field_insertBatch = 0;
        rVar.f38237p0 = 1024;
        if (-1 != this.f38240d.p("shakeitem1", rVar.convertTo(), "insertBatch!=?", new java.lang.String[]{"0"})) {
            doNotify();
        }
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        return J0((c34.r) f0Var, false);
    }

    public boolean y0(int i17) {
        boolean A;
        l75.k0 k0Var = this.f38240d;
        if (i17 == 0) {
            A = k0Var.A("shakeitem1", "delete from shakeitem1 where type = " + i17 + " or type is null");
        } else {
            A = k0Var.A("shakeitem1", "delete from shakeitem1 where type = " + i17);
        }
        doNotify();
        return A;
    }

    public int z0(int i17) {
        int delete = this.f38240d.delete("shakeitem1", "shakeItemID=?", new java.lang.String[]{"" + i17});
        doNotify();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewShakeItemStorage", "delById id:" + i17 + " result:" + delete);
        return delete;
    }
}
