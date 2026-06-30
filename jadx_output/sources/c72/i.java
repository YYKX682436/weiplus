package c72;

/* loaded from: classes8.dex */
public class i extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ln5 f39554a = new r45.ln5();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 931;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.ln5 ln5Var = this.f39554a;
        ln5Var.f379665h = cu5Var;
        ln5Var.setBaseRequest(o45.bh.a(this));
        setPassKey(ln5Var.f379665h.f371841f.g());
        return ln5Var.toByteArray();
    }
}
