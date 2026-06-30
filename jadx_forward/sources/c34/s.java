package c34;

/* loaded from: classes11.dex */
public class s extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f119772e = {l75.n0.m145250x3fdc6f77(c34.r.f119769y0, "shakeitem1")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f119773d;

    public s(l75.k0 k0Var) {
        super(k0Var, c34.r.f119769y0, "shakeitem1", null);
        this.f119773d = k0Var;
        k0Var.A("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
        k0Var.A("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
    }

    public int D0(java.lang.String str) {
        int mo70514xb06685ab = this.f119773d.mo70514xb06685ab("shakeitem1", "(username=?)", new java.lang.String[]{"" + str});
        if (mo70514xb06685ab > 0) {
            m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewShakeItemStorage", "delByusername:" + str + " result:" + mo70514xb06685ab);
        return mo70514xb06685ab;
    }

    public boolean J0(c34.r rVar, boolean z17) {
        if (rVar == null) {
            return false;
        }
        if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f66444xdec927b)) {
            D0(rVar.f66444xdec927b);
        }
        rVar.f119770p0 = -1;
        return super.mo880xb970c2b9(rVar);
    }

    public void L0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewShakeItemStorage", "setAllOld");
        c34.r rVar = new c34.r();
        rVar.f66429x63f8483c = 0;
        rVar.f119770p0 = 1024;
        if (-1 != this.f119773d.p("shakeitem1", rVar.mo9763xeb27878e(), "insertBatch!=?", new java.lang.String[]{"0"})) {
            m145262xf35bbb4();
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        return J0((c34.r) f0Var, false);
    }

    public boolean y0(int i17) {
        boolean A;
        l75.k0 k0Var = this.f119773d;
        if (i17 == 0) {
            A = k0Var.A("shakeitem1", "delete from shakeitem1 where type = " + i17 + " or type is null");
        } else {
            A = k0Var.A("shakeitem1", "delete from shakeitem1 where type = " + i17);
        }
        m145262xf35bbb4();
        return A;
    }

    public int z0(int i17) {
        int mo70514xb06685ab = this.f119773d.mo70514xb06685ab("shakeitem1", "shakeItemID=?", new java.lang.String[]{"" + i17});
        m145262xf35bbb4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewShakeItemStorage", "delById id:" + i17 + " result:" + mo70514xb06685ab);
        return mo70514xb06685ab;
    }
}
