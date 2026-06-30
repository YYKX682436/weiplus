package o45;

/* loaded from: classes12.dex */
public class lh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gk0 f424508a;

    public lh() {
        r45.gk0 gk0Var = new r45.gk0();
        this.f424508a = gk0Var;
        mo150593xca029c98(0);
        r45.fk0 fk0Var = new r45.fk0();
        gk0Var.f456843e = fk0Var;
        fk0Var.f455938d = new r45.c20();
        gk0Var.f456842d = new r45.hk0();
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return o45.ag.f424425a ? 784 : 722;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        m150628x97bfc4c(o45.pi.d());
        r45.gk0 gk0Var = this.f424508a;
        gk0Var.f456843e.mo11509x3ab820bc(o45.bh.a(this));
        r45.hk0 hk0Var = gk0Var.f456842d;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
        hk0Var.f457773d = cu5Var;
        m150625x820885cc(gk0Var.f456842d.f457773d.f453374f.g());
        m150626x3f3df288(new o45.kh(this, this));
        return gk0Var.mo14344x5f01b1f6();
    }
}
