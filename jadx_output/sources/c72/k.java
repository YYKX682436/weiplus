package c72;

/* loaded from: classes12.dex */
public class k extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.wh4 f39556a = new r45.wh4();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 12106;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.he a17 = o45.bh.a(this);
        r45.wh4 wh4Var = this.f39556a;
        wh4Var.setBaseRequest(a17);
        setPassKey(cu5Var.f371841f.g());
        return wh4Var.toByteArray();
    }
}
