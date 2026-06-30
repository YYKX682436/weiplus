package bt3;

/* loaded from: classes9.dex */
public class c2 extends l75.n0 implements zs3.w {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f24217d;

    public c2(l75.k0 k0Var) {
        super(k0Var, zs3.b0.f475262J, "RecordMessageInfo", null);
        this.f24217d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        zs3.b0 b0Var = (zs3.b0) f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgStorage", "insert recordMsgInfo localId:%s msgId:%s", java.lang.Integer.valueOf(b0Var.field_localId), java.lang.Long.valueOf(b0Var.field_msgId));
        return super.insert(b0Var);
    }

    public void y0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f24217d.delete("RecordMessageInfo", "localId=?", new java.lang.String[]{"" + i17})));
    }

    public java.util.List z0() {
        p75.i0 i17 = dm.t9.f240158r.i();
        i17.f352657d = dm.t9.f240160t.i(1);
        i17.e(dm.t9.f240159s.v());
        return i17.a().k(this.f24217d, zs3.b0.class);
    }
}
