package c72;

/* loaded from: classes8.dex */
public class g extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.va3 f39552a = new r45.va3();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 733;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.va3 va3Var = this.f39552a;
        va3Var.f388028g = cu5Var;
        va3Var.setBaseRequest(o45.bh.a(this));
        setPassKey(va3Var.f388028g.f371841f.g());
        return va3Var.toByteArray();
    }
}
