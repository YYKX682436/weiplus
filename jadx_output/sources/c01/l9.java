package c01;

/* loaded from: classes12.dex */
public class l9 extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ir3 f37309a = new r45.ir3();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.ir3 ir3Var = this.f37309a;
        ir3Var.f377282f = cu5Var;
        ir3Var.setBaseRequest(o45.bh.a(this));
        return ir3Var.toByteArray();
    }
}
