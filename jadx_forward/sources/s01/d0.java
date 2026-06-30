package s01;

/* loaded from: classes11.dex */
public class d0 extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f483390g = {l75.n0.m145250x3fdc6f77(s01.a0.F, "BizChatUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f483391d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f483392e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.v0 f483393f;

    public d0(l75.k0 k0Var) {
        super(k0Var, s01.a0.F, "BizChatUserInfo", null);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f483391d = hashMap;
        this.f483393f = new s01.b0(this);
        this.f483392e = k0Var;
        k0Var.A("BizChatUserInfo", "CREATE INDEX IF NOT EXISTS bizUserIdIndex ON BizChatUserInfo ( userId )");
        hashMap.clear();
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(s01.a0 a0Var) {
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(a0Var);
        if (mo880xb970c2b9) {
            s01.c0 c0Var = new s01.c0();
            l75.v0 v0Var = this.f483393f;
            v0Var.d(c0Var);
            v0Var.c();
        }
        return mo880xb970c2b9;
    }

    public boolean J0(s01.a0 a0Var) {
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatUserInfoStorage", "update wrong argument");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f65841xdde069b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "dealWithChatNamePY null");
        } else {
            a0Var.f65842xe76d5e4 = x51.k.a(a0Var.f65841xdde069b);
        }
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(a0Var);
        if (mo11260x413cb2b4) {
            s01.c0 c0Var = new s01.c0();
            l75.v0 v0Var = this.f483393f;
            v0Var.d(c0Var);
            v0Var.c();
        }
        return mo11260x413cb2b4;
    }

    public s01.a0 y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatUserInfoStorage", "get  wrong argument");
            return null;
        }
        s01.a0 a0Var = new s01.a0();
        a0Var.f65840x13fe5d2b = str;
        super.get(a0Var, new java.lang.String[0]);
        return a0Var;
    }

    public java.lang.String z0(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId brandUserName is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId:%s", str);
        java.util.Map map = this.f483391d;
        if (((java.util.HashMap) map).containsKey(str) && ((java.util.HashMap) map).get(str) != null) {
            return (java.lang.String) ((java.util.HashMap) map).get(str);
        }
        s01.s z07 = r01.q3.Di().z0(str);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo == null brandUserName:%s", str);
            return null;
        }
        ((java.util.HashMap) map).put(str, z07.f69289x13fe5d2b);
        return z07.f69289x13fe5d2b;
    }
}
