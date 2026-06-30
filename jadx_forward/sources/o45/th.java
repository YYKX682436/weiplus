package o45;

/* loaded from: classes8.dex */
public class th extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.pc3 f424542a = new r45.pc3();

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 179;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 381;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        m150628x97bfc4c(o45.pi.a());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
        r45.pc3 pc3Var = this.f424542a;
        pc3Var.f464470d = cu5Var;
        pc3Var.f464471e = o45.pi.d().f424532c;
        pc3Var.mo11509x3ab820bc(o45.bh.a(this));
        return pc3Var.mo14344x5f01b1f6();
    }
}
