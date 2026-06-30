package bt3;

/* loaded from: classes9.dex */
public class t1 extends l75.n0 implements zs3.u {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f105943d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Vector f105944e;

    public t1(l75.k0 k0Var) {
        super(k0Var, zs3.y.W, "RecordCDNInfo", null);
        this.f105944e = new java.util.Vector();
        this.f105943d = k0Var;
    }

    public zs3.y D0(java.lang.String str) {
        zs3.y yVar = null;
        android.database.Cursor f17 = this.f105943d.f("SELECT * FROM RecordCDNInfo WHERE mediaId='" + str + "'", null, 2);
        if (f17 != null && f17.moveToFirst()) {
            yVar = new zs3.y();
            yVar.mo9015xbf5d97fd(f17);
        }
        if (f17 != null) {
            f17.close();
        }
        return yVar;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(zs3.y yVar) {
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgCDNStorage", "insert null record cdn info");
            return false;
        }
        if (!super.mo880xb970c2b9(yVar)) {
            return false;
        }
        L0(2, yVar);
        return true;
    }

    public final void L0(int i17, zs3.y yVar) {
        gm0.j1.e().j(new bt3.s1(this, i17, yVar));
    }

    public void P0(zs3.t tVar) {
        gm0.j1.e().j(new bt3.r1(this, tVar));
    }

    @Override // l75.n0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(zs3.y yVar) {
        if (!super.mo11260x413cb2b4(yVar)) {
            return false;
        }
        L0(1, yVar);
        return true;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(zs3.y yVar, java.lang.String... strArr) {
        if (!super.mo9952xce0038c9(yVar, strArr)) {
            return false;
        }
        L0(1, yVar);
        return true;
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        zs3.y yVar = (zs3.y) f0Var;
        if (!super.mo11261xce0038c9(j17, yVar)) {
            return false;
        }
        L0(1, yVar);
        return true;
    }

    public void y0(zs3.t tVar) {
        gm0.j1.e().j(new bt3.q1(this, tVar));
    }

    @Override // l75.n0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(zs3.y yVar, java.lang.String... strArr) {
        if (!super.mo9951xb06685ab(yVar, strArr)) {
            return false;
        }
        L0(0, yVar);
        return true;
    }
}
