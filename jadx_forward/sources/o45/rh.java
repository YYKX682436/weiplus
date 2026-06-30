package o45;

/* loaded from: classes12.dex */
public class rh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f424537a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.go0 f424538b = new r45.go0();

    public rh(boolean z17) {
        this.f424537a = true;
        this.f424537a = z17;
    }

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 0;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return this.f424537a ? 3789 : 3644;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        r45.he a17 = o45.bh.a(this);
        r45.go0 go0Var = this.f424538b;
        go0Var.mo11509x3ab820bc(a17);
        if (this.f424537a) {
            byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            m150628x97bfc4c(o45.pi.d());
            go0Var.f456924d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(s07);
            if (!o45.ag.f424425a) {
                m150625x820885cc(s07);
            }
        }
        return go0Var.mo14344x5f01b1f6();
    }
}
