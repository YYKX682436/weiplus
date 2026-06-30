package bt3;

/* loaded from: classes9.dex */
public class c2 extends l75.n0 implements zs3.w {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f105750d;

    public c2(l75.k0 k0Var) {
        super(k0Var, zs3.b0.f556795J, "RecordMessageInfo", null);
        this.f105750d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        zs3.b0 b0Var = (zs3.b0) f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgStorage", "insert recordMsgInfo localId:%s msgId:%s", java.lang.Integer.valueOf(b0Var.f68497x88be67a1), java.lang.Long.valueOf(b0Var.f68498x297eb4f7));
        return super.mo880xb970c2b9(b0Var);
    }

    public void y0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f105750d.mo70514xb06685ab("RecordMessageInfo", "localId=?", new java.lang.String[]{"" + i17})));
    }

    public java.util.List z0() {
        p75.i0 i17 = dm.t9.f321691r.i();
        i17.f434190d = dm.t9.f321693t.i(1);
        i17.e(dm.t9.f321692s.v());
        return i17.a().k(this.f105750d, zs3.b0.class);
    }
}
