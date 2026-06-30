package c01;

/* loaded from: classes12.dex */
public class j9 extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.er3 f37269a = new r45.er3();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 616;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.er3 er3Var = this.f37269a;
        er3Var.f373693f = cu5Var;
        er3Var.setBaseRequest(o45.bh.a(this));
        return er3Var.toByteArray();
    }
}
