package dt4;

/* loaded from: classes9.dex */
public class z extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f324840f = {l75.n0.m145250x3fdc6f77(at4.v1.S1, "WalletUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f324842e;

    public z(l75.k0 k0Var) {
        super(k0Var, at4.v1.S1, "WalletUserInfo", null);
        this.f324842e = new java.util.LinkedList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoStorage", "already call constructor.");
        this.f324841d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9951xb06685ab((at4.v1) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324842e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9952xce0038c9((at4.v1) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324842e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    public at4.v1 y0() {
        at4.v1 v1Var = new at4.v1();
        android.database.Cursor f17 = this.f324841d.f("select * from WalletUserInfo", null, 2);
        v1Var.f67049xff817ee4 = -1;
        if (f17 == null) {
            return v1Var;
        }
        if (f17.moveToNext()) {
            v1Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return v1Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(at4.v1 v1Var) {
        if (!super.mo880xb970c2b9(v1Var)) {
            return false;
        }
        java.util.Iterator it = this.f324842e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }
}
