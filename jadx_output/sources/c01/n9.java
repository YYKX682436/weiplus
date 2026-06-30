package c01;

/* loaded from: classes12.dex */
public class n9 extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ry6 f37349a = new r45.ry6();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 617;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.ry6 ry6Var = this.f37349a;
        ry6Var.f385309h = cu5Var;
        ry6Var.setBaseRequest(o45.bh.a(this));
        return ry6Var.toByteArray();
    }
}
