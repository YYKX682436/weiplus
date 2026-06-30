package s01;

/* loaded from: classes11.dex */
public class v extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f483462f = {l75.n0.m145250x3fdc6f77(s01.s.f483461p, "BizChatMyUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f483463d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f483464e;

    public v(l75.k0 k0Var) {
        super(k0Var, s01.s.f483461p, "BizChatMyUserInfo", null);
        this.f483464e = new s01.t(this);
        this.f483463d = k0Var;
        k0Var.A("BizChatMyUserInfo", "CREATE INDEX IF NOT EXISTS bizChatbrandUserNameIndex ON BizChatMyUserInfo ( brandUserName )");
    }

    public boolean D0(s01.s sVar) {
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(sVar);
        if (mo880xb970c2b9) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f483464e;
            v0Var.d(uVar);
            v0Var.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert fail");
        }
        return mo880xb970c2b9;
    }

    public boolean J0(s01.s sVar) {
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "update wrong argument");
            return false;
        }
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(sVar);
        if (mo11260x413cb2b4) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f483464e;
            v0Var.d(uVar);
            v0Var.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update fail");
        }
        return mo11260x413cb2b4;
    }

    @Override // l75.n0
    /* renamed from: getCount */
    public int mo78086x7444f759() {
        android.database.Cursor f17 = this.f483463d.f("SELECT COUNT(*) FROM BizChatMyUserInfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public boolean y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "delete wrong argument");
            return false;
        }
        s01.s sVar = new s01.s();
        sVar.f69288x75756b18 = str;
        boolean mo9951xb06685ab = super.mo9951xb06685ab(sVar, "brandUserName");
        if (mo9951xb06685ab) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f483464e;
            v0Var.d(uVar);
            v0Var.c();
        }
        return mo9951xb06685ab;
    }

    public s01.s z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMyUserInfoStorage", "get： wrong argument");
            return null;
        }
        s01.s sVar = new s01.s();
        sVar.f69288x75756b18 = str;
        super.get(sVar, new java.lang.String[0]);
        return sVar;
    }
}
