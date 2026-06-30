package o45;

/* loaded from: classes12.dex */
public class oh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f424523a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.eo0 f424524b = new r45.eo0();

    public oh(boolean z17) {
        this.f424523a = true;
        this.f424523a = z17;
    }

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 0;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return this.f424523a ? 3944 : 836;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        r45.he a17 = o45.bh.a(this);
        r45.eo0 eo0Var = this.f424524b;
        eo0Var.mo11509x3ab820bc(a17);
        if (this.f424523a) {
            byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            m150628x97bfc4c(o45.pi.d());
            eo0Var.f455149d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(s07);
            if (!o45.ag.f424425a) {
                m150625x820885cc(s07);
            }
        }
        return eo0Var.mo14344x5f01b1f6();
    }
}
