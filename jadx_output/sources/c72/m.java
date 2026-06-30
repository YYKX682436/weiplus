package c72;

/* loaded from: classes8.dex */
public class m extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.hx6 f39558a = new r45.hx6();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 930;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.hx6 hx6Var = this.f39558a;
        hx6Var.f376545f = cu5Var;
        hx6Var.setBaseRequest(o45.bh.a(this));
        setPassKey(hx6Var.f376545f.f371841f.g());
        return hx6Var.toByteArray();
    }
}
